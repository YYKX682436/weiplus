package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private Threads() {
    }

    public static void checkBackgroundThread() {
        m3.h.e(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        m3.h.e(isMainThread(), "Not in application's main thread");
    }

    private static android.os.Handler getMainHandler() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runOnMainSync$0(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void runOnMain(java.lang.Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            m3.h.e(getMainHandler().post(runnable), "Unable to post to main thread");
        }
    }

    public static void runOnMainSync(final java.lang.Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        m3.h.e(getMainHandler().post(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.Threads$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.utils.Threads.lambda$runOnMainSync$0(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(TIMEOUT_RUN_ON_MAIN_MS, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            } else {
                throw new java.lang.IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (java.lang.InterruptedException e17) {
            throw new androidx.camera.core.impl.utils.InterruptedRuntimeException(e17);
        }
    }
}
