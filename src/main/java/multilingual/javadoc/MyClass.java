package multilingual.javadoc;

/**
 * <span class="en">A template project illustrates how JavaDoc can be localized</span>
 * <span class="ja">JavaDoc をローカライズする方法を示すひな形プロジェクトです</span>
 */
public class MyClass {
    private MyClass() {
    }

    /**
     * <span class="en">this method returns a MyClass</span><span class="ja">MyClassを返します</span>
     *
     * @return <span class="en">a MyClass instance</span><span class="ja">MyClassインスタンス</span>
     * @throws Exception <span class="en">when something went wrong</span><span class="ja">何か問題が発生した場合</span>
     */
    public static MyClass getInstance() throws Exception {
        return new MyClass();
    }
}
