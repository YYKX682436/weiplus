package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* renamed from: androidx.camera.core.impl.utils.executor.DirectExecutor */
/* loaded from: classes13.dex */
final class ExecutorC0805x2306cbfc implements java.util.concurrent.Executor {

    /* renamed from: sDirectExecutor */
    private static volatile p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0805x2306cbfc f1982x8097872f;

    /* renamed from: getInstance */
    public static java.util.concurrent.Executor m5986x9cf0d20b() {
        if (f1982x8097872f != null) {
            return f1982x8097872f;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0805x2306cbfc.class) {
            if (f1982x8097872f == null) {
                f1982x8097872f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0805x2306cbfc();
            }
        }
        return f1982x8097872f;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
