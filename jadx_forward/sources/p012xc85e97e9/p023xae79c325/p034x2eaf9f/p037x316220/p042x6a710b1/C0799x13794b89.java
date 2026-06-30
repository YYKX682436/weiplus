package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.Threads */
/* loaded from: classes14.dex */
public final class C0799x13794b89 {

    /* renamed from: TIMEOUT_RUN_ON_MAIN_MS */
    private static final long f1975x3fc00c9e = 30000;

    private C0799x13794b89() {
    }

    /* renamed from: checkBackgroundThread */
    public static void m5938xd364e00() {
        m3.h.e(m5941x10d1f222(), "In application's main thread");
    }

    /* renamed from: checkMainThread */
    public static void m5939x6483284b() {
        m3.h.e(m5942x9e2d0ded(), "Not in application's main thread");
    }

    /* renamed from: getMainHandler */
    private static android.os.Handler m5940xce60fe1b() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* renamed from: isBackgroundThread */
    public static boolean m5941x10d1f222() {
        return !m5942x9e2d0ded();
    }

    /* renamed from: isMainThread */
    public static boolean m5942x9e2d0ded() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$runOnMainSync$0 */
    public static /* synthetic */ void m5943x9aa0f60d(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    /* renamed from: runOnMain */
    public static void m5944xc851d2a3(java.lang.Runnable runnable) {
        if (m5942x9e2d0ded()) {
            runnable.run();
        } else {
            m3.h.e(m5940xce60fe1b().post(runnable), "Unable to post to main thread");
        }
    }

    /* renamed from: runOnMainSync */
    public static void m5945xd03957de(final java.lang.Runnable runnable) {
        if (m5942x9e2d0ded()) {
            runnable.run();
            return;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        m3.h.e(m5940xce60fe1b().post(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.Threads$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5943x9aa0f60d(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(f1975x3fc00c9e, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            } else {
                throw new java.lang.IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (java.lang.InterruptedException e17) {
            throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0790xf21b0999(e17);
        }
    }
}
