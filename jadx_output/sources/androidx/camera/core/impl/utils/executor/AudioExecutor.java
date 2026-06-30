package androidx.camera.core.impl.utils.executor;

/* loaded from: classes13.dex */
public class AudioExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor sExecutor;
    private final java.util.concurrent.ExecutorService mAudioService = java.util.concurrent.Executors.newFixedThreadPool(2, new androidx.camera.core.impl.utils.executor.AudioExecutor.AnonymousClass1());

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.util.concurrent.ThreadFactory {
        private static final java.lang.String THREAD_NAME_STEM = "CameraX-camerax_audio_%d";
        private final java.util.concurrent.atomic.AtomicInteger mThreadId = new java.util.concurrent.atomic.AtomicInteger(0);

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$newThread$0(java.lang.Runnable runnable) {
            android.os.Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(final java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.AudioExecutor$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.utils.executor.AudioExecutor.AnonymousClass1.lambda$newThread$0(runnable);
                }
            });
            thread.setName(java.lang.String.format(java.util.Locale.US, THREAD_NAME_STEM, java.lang.Integer.valueOf(this.mThreadId.getAndIncrement())));
            return thread;
        }
    }

    public static java.util.concurrent.Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (androidx.camera.core.impl.utils.executor.AudioExecutor.class) {
            if (sExecutor == null) {
                sExecutor = new androidx.camera.core.impl.utils.executor.AudioExecutor();
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.mAudioService.execute(runnable);
    }
}
