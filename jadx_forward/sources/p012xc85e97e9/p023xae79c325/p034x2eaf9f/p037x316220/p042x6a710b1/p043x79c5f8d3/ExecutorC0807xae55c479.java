package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* renamed from: androidx.camera.core.impl.utils.executor.HighPriorityExecutor */
/* loaded from: classes13.dex */
final class ExecutorC0807xae55c479 implements java.util.concurrent.Executor {

    /* renamed from: sExecutor */
    private static volatile java.util.concurrent.Executor f1995x185e3a66;

    /* renamed from: mHighPriorityService */
    private final java.util.concurrent.ExecutorService f1996xa44134c2 = java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.HighPriorityExecutor.1

        /* renamed from: THREAD_NAME */
        private static final java.lang.String f1997xf52cdfa0 = "CameraX-camerax_high_priority";

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setPriority(10);
            thread.setName(f1997xf52cdfa0);
            return thread;
        }
    });

    /* renamed from: getInstance */
    public static java.util.concurrent.Executor m5990x9cf0d20b() {
        if (f1995x185e3a66 != null) {
            return f1995x185e3a66;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0807xae55c479.class) {
            if (f1995x185e3a66 == null) {
                f1995x185e3a66 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0807xae55c479();
            }
        }
        return f1995x185e3a66;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f1996xa44134c2.execute(runnable);
    }
}
