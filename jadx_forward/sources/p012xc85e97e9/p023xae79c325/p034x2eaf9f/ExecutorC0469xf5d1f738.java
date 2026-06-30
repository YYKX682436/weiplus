package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CameraExecutor */
/* loaded from: classes13.dex */
public class ExecutorC0469xf5d1f738 implements java.util.concurrent.Executor {

    /* renamed from: DEFAULT_CORE_THREADS */
    private static final int f843xf68bc447 = 1;

    /* renamed from: DEFAULT_MAX_THREADS */
    private static final int f844x213e2270 = 1;
    private static final java.lang.String TAG = "CameraExecutor";

    /* renamed from: THREAD_FACTORY */
    private static final java.util.concurrent.ThreadFactory f845xa944bbb5 = new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.CameraExecutor.1

        /* renamed from: THREAD_NAME_STEM */
        private static final java.lang.String f848x56f9c08 = "CameraX-core_camera_%d";

        /* renamed from: mThreadId */
        private final java.util.concurrent.atomic.AtomicInteger f849x7cd36452 = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(java.lang.String.format(java.util.Locale.US, f848x56f9c08, java.lang.Integer.valueOf(this.f849x7cd36452.getAndIncrement())));
            return thread;
        }
    };

    /* renamed from: mExecutorLock */
    private final java.lang.Object f846x5960a9ab = new java.lang.Object();

    /* renamed from: mThreadPoolExecutor */
    private java.util.concurrent.ThreadPoolExecutor f847x6a2e1786 = m4267xb0c341ef();

    /* renamed from: createExecutor */
    private static java.util.concurrent.ThreadPoolExecutor m4267xb0c341ef() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), f845xa944bbb5);
        threadPoolExecutor.setRejectedExecutionHandler(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.RejectedExecutionHandlerC0470x5cf0a9a9());
        return threadPoolExecutor;
    }

    /* renamed from: deinit */
    public void m4269xb0654911() {
        synchronized (this.f846x5960a9ab) {
            if (!this.f847x6a2e1786.isShutdown()) {
                this.f847x6a2e1786.shutdown();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        synchronized (this.f846x5960a9ab) {
            this.f847x6a2e1786.execute(runnable);
        }
    }

    /* renamed from: init */
    public void m4270x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0671xa1e35205 interfaceC0671xa1e35205) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        interfaceC0671xa1e35205.getClass();
        synchronized (this.f846x5960a9ab) {
            if (this.f847x6a2e1786.isShutdown()) {
                this.f847x6a2e1786 = m4267xb0c341ef();
            }
            threadPoolExecutor = this.f847x6a2e1786;
        }
        int max = java.lang.Math.max(1, interfaceC0671xa1e35205.mo3023x3fef5680().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }
}
