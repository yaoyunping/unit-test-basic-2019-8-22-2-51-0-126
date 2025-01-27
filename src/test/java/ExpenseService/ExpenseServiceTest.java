package ExpenseService;

import ExpenseService.Exception.UnexpectedProjectTypeException;
import ExpenseService.Expense.ExpenseType;
import ExpenseService.Project.Project;
import ExpenseService.Project.ProjectType;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class ExpenseServiceTest {


	@Test
    void should_return_internal_expense_type_if_project_is_internal() throws UnexpectedProjectTypeException {
		// given
		ProjectType projectType = ProjectType.INTERNAL;
		
    	Project project = new Project(projectType,"name");
        // when
    	ExpenseType expenseType = ExpenseService.getExpenseCodeByProjectTypeAndName(project);
    	// then
    	assertEquals(ExpenseType.INTERNAL_PROJECT_EXPENSE,expenseType);
    }

    @Test
    void should_return_expense_type_A_if_project_is_external_and_name_is_project_A() throws UnexpectedProjectTypeException {
		// given
    	ProjectType projectType = ProjectType.EXTERNAL;
    	Project project = new Project(projectType, "name");
        // when
    	
        // then
    }

    @Test
    void should_return_expense_type_B_if_project_is_external_and_name_is_project_B() throws UnexpectedProjectTypeException {
        // given
        // when
        // then
    }

    @Test
    void should_return_other_expense_type_if_project_is_external_and_has_other_name() throws UnexpectedProjectTypeException {
        // given
        // when
        // then
    }

    @Test
    void should_throw_unexpected_project_exception_if_project_is_invalid() {
        // given
        // when
        // then
    }
}