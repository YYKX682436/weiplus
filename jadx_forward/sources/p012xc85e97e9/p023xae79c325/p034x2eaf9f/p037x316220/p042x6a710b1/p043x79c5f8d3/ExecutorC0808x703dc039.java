package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* renamed from: androidx.camera.core.impl.utils.executor.IoExecutor */
/* loaded from: classes12.dex */
final class ExecutorC0808x703dc039 implements java.util.concurrent.Executor {

    /* renamed from: sExecutor */
    private static volatile java.util.concurrent.Executor f1999x185e3a66;

    /* renamed from: mIoService */
    private final java.util.concurrent.ExecutorService f2000x2ee7a4c2 = java.util.concurrent.Executors.newFixedThreadPool(2, new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.IoExecutor.1

        /* renamed from: THREAD_NAME_STEM */
        private static final java.lang.String f2001x56f9c08 = "CameraX-camerax_io_%d";

        /* renamed from: mThreadId */
        private final java.util.concurrent.atomic.AtomicInteger f2002x7cd36452 = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(java.lang.String.format(java.util.Locale.US, f2001x56f9c08, java.lang.Integer.valueOf(this.f2002x7cd36452.getAndIncrement())));
            return thread;
        }
    });

    /* renamed from: getInstance */
    public static java.util.concurrent.Executor m5991x9cf0d20b() {
        if (f1999x185e3a66 != null) {
            return f1999x185e3a66;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0808x703dc039.class) {
            if (f1999x185e3a66 == null) {
                f1999x185e3a66 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0808x703dc039();
            }
        }
        return f1999x185e3a66;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f2000x2ee7a4c2.execute(runnable);
    }
}
