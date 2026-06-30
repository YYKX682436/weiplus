package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.ThreadUtils */
/* loaded from: classes13.dex */
public class C29367xd5f5f0a7 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73427x7118e671 = false;

    /* renamed from: sLock */
    private static final java.lang.Object f73428x678c83e = new java.lang.Object();

    /* renamed from: sThreadAssertsDisabledForTesting */
    private static boolean f73429xa6000f93;

    /* renamed from: sUiThreadHandler */
    private static volatile android.os.Handler f73430x2ebab6b9;

    /* renamed from: sWillOverride */
    private static volatile boolean f73431x93547dd1;

    /* renamed from: org.chromium.base.ThreadUtils$ThreadChecker */
    /* loaded from: classes13.dex */
    public static class ThreadChecker {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73432x7118e671 = false;

        /* renamed from: mThreadId */
        private final long f73433x7cd36452 = android.os.Process.myTid();

        /* renamed from: assertOnValidThread */
        public void m152672xb702e421() {
        }
    }

    /* renamed from: assertOnBackgroundThread */
    public static void m152650x154012bd() {
    }

    /* renamed from: assertOnUiThread */
    public static void m152651x286f5ca3() {
    }

    /* renamed from: checkUiThread */
    public static void m152652x518a8ae6() {
        if (!f73429xa6000f93 && !m152667x9483fbdc()) {
            throw new java.lang.IllegalStateException("Must be called on the UI thread.");
        }
    }

    /* renamed from: clearUiThreadForTesting */
    public static void m152653xcbd16292() {
        f73431x93547dd1 = false;
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153013x614acd14();
        f73430x2ebab6b9 = null;
    }

    /* renamed from: getUiThreadHandler */
    public static android.os.Handler m152654xfa032576() {
        if (f73430x2ebab6b9 != null) {
            return f73430x2ebab6b9;
        }
        if (f73431x93547dd1) {
            throw new java.lang.RuntimeException("Did not yet override the UI thread");
        }
        m152670x38306840(android.os.Looper.getMainLooper());
        return f73430x2ebab6b9;
    }

    /* renamed from: getUiThreadLooper */
    public static android.os.Looper m152655xd5db76a5() {
        return m152654xfa032576().getLooper();
    }

    /* renamed from: isThreadPriorityAudio */
    private static boolean m152656x20b3211e(int i17) {
        return android.os.Process.getThreadPriority(i17) == -16;
    }

    /* renamed from: postOnUiThread */
    public static <T> java.util.concurrent.FutureTask<T> m152658x5d0197d(java.util.concurrent.FutureTask<T> futureTask) {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153010x2d1ef245(7, futureTask);
        return futureTask;
    }

    /* renamed from: postOnUiThreadDelayed */
    public static void m152660x4625b925(java.lang.Runnable runnable, long j17) {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153009x6a420547(7, runnable, j17);
    }

    /* renamed from: runOnUiThread */
    public static <T> java.util.concurrent.FutureTask<T> m152662x925811a8(java.util.concurrent.FutureTask<T> futureTask) {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153014x4eeaf633(7, futureTask);
        return futureTask;
    }

    /* renamed from: runOnUiThreadBlocking */
    public static void m152665x6eddb9fd(java.lang.Runnable runnable) {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153016x2b95c9cb(7, runnable);
    }

    /* renamed from: runOnUiThreadBlockingNoException */
    public static <T> T m152666xa95d8951(java.util.concurrent.Callable<T> callable) {
        try {
            return (T) m152664x6eddb9fd(callable);
        } catch (java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Error occurred waiting for callable", e17);
        }
    }

    /* renamed from: runningOnUiThread */
    public static boolean m152667x9483fbdc() {
        return m152654xfa032576().getLooper() == android.os.Looper.myLooper();
    }

    /* renamed from: setThreadAssertsDisabledForTesting */
    public static void m152668x499295c4(boolean z17) {
        f73429xa6000f93 = z17;
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new org.p3343x72743996.p3344x2e06d1.RunnableC29368xd75085da());
    }

    /* renamed from: setThreadPriorityAudio */
    public static void m152669x4403f6e6(int i17) {
        android.os.Process.setThreadPriority(i17, -16);
    }

    /* renamed from: setUiThread */
    public static void m152670x38306840(android.os.Looper looper) {
        synchronized (f73428x678c83e) {
            if (f73430x2ebab6b9 == null) {
                android.os.Handler handler = new android.os.Handler(looper);
                org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153008x32926ae6(handler);
                f73430x2ebab6b9 = handler;
                org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152701x32926ae6();
            } else if (f73430x2ebab6b9.getLooper() != looper) {
                throw new java.lang.RuntimeException("UI thread looper is already set to " + f73430x2ebab6b9.getLooper() + " (Main thread looper is " + android.os.Looper.getMainLooper() + "), cannot set to new looper " + looper);
            }
        }
    }

    /* renamed from: setWillOverrideUiThread */
    public static void m152671xae81b91e() {
        f73431x93547dd1 = true;
    }

    /* renamed from: postOnUiThread */
    public static void m152659x5d0197d(java.lang.Runnable runnable) {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153010x2d1ef245(7, runnable);
    }

    /* renamed from: runOnUiThread */
    public static <T> java.util.concurrent.FutureTask<T> m152661x925811a8(java.util.concurrent.Callable<T> callable) {
        return m152662x925811a8(new java.util.concurrent.FutureTask(callable));
    }

    /* renamed from: runOnUiThreadBlocking */
    public static <T> T m152664x6eddb9fd(java.util.concurrent.Callable<T> callable) {
        return (T) org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153015x2b95c9cb(7, callable);
    }

    /* renamed from: runOnUiThread */
    public static void m152663x925811a8(java.lang.Runnable runnable) {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153014x4eeaf633(7, runnable);
    }
}
