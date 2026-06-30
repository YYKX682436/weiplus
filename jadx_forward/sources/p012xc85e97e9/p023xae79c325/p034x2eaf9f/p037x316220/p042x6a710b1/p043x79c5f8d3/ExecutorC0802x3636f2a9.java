package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor */
/* loaded from: classes13.dex */
public class ExecutorC0802x3636f2a9 implements java.util.concurrent.Executor {

    /* renamed from: sExecutor */
    private static volatile java.util.concurrent.Executor f1977x185e3a66;

    /* renamed from: mAudioService */
    private final java.util.concurrent.ExecutorService f1978xaf4aff0c = java.util.concurrent.Executors.newFixedThreadPool(2, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0802x3636f2a9.AnonymousClass1());

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.util.concurrent.ThreadFactory {

        /* renamed from: THREAD_NAME_STEM */
        private static final java.lang.String f1979x56f9c08 = "CameraX-camerax_audio_%d";

        /* renamed from: mThreadId */
        private final java.util.concurrent.atomic.AtomicInteger f1980x7cd36452 = new java.util.concurrent.atomic.AtomicInteger(0);

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$newThread$0 */
        public static /* synthetic */ void m5976x41044879(java.lang.Runnable runnable) {
            android.os.Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(final java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.AudioExecutor$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0802x3636f2a9.AnonymousClass1.m5976x41044879(runnable);
                }
            });
            thread.setName(java.lang.String.format(java.util.Locale.US, f1979x56f9c08, java.lang.Integer.valueOf(this.f1980x7cd36452.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: getInstance */
    public static java.util.concurrent.Executor m5975x9cf0d20b() {
        if (f1977x185e3a66 != null) {
            return f1977x185e3a66;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0802x3636f2a9.class) {
            if (f1977x185e3a66 == null) {
                f1977x185e3a66 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0802x3636f2a9();
            }
        }
        return f1977x185e3a66;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f1978xaf4aff0c.execute(runnable);
    }
}
