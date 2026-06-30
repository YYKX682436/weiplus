package ph1;

/* loaded from: classes.dex */
public class m implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(runnable);
        runnable.run();
    }

    /* renamed from: toString */
    public java.lang.String m158537x9616526c() {
        return "ImmediateExecutor@" + hashCode();
    }
}
