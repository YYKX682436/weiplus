package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

/* renamed from: com.tencent.liteav.base.ThreadUtils */
/* loaded from: classes13.dex */
public class C3743xd5f5f0a7 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f14643x7118e671 = false;

    /* renamed from: sLock */
    private static final java.lang.Object f14644x678c83e = new java.lang.Object();

    /* renamed from: sThreadAssertsDisabled */
    private static boolean f14645x9def116c;

    /* renamed from: sUiThreadHandler */
    private static android.os.Handler f14646x2ebab6b9;

    /* renamed from: sWillOverride */
    private static boolean f14647x93547dd1;

    /* renamed from: assertOnBackgroundThread */
    public static void m29288x154012bd() {
    }

    /* renamed from: assertOnUiThread */
    public static void m29289x286f5ca3() {
    }

    /* renamed from: checkUiThread */
    public static void m29290x518a8ae6() {
        if (!f14645x9def116c && !m29303x9483fbdc()) {
            throw new java.lang.IllegalStateException("Must be called on the UI thread.");
        }
    }

    /* renamed from: getUiThreadHandler */
    public static android.os.Handler m29291xfa032576() {
        android.os.Handler handler;
        synchronized (f14644x678c83e) {
            if (f14646x2ebab6b9 == null) {
                if (f14647x93547dd1) {
                    throw new java.lang.RuntimeException("Did not yet override the UI thread");
                }
                f14646x2ebab6b9 = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler = f14646x2ebab6b9;
        }
        return handler;
    }

    /* renamed from: getUiThreadLooper */
    public static android.os.Looper m29292xd5db76a5() {
        return m29291xfa032576().getLooper();
    }

    /* renamed from: isThreadPriorityAudio */
    private static boolean m29293x20b3211e(int i17) {
        return android.os.Process.getThreadPriority(i17) == -19;
    }

    @java.lang.Deprecated
    /* renamed from: postOnUiThread */
    public static <T> java.util.concurrent.FutureTask<T> m29294x5d0197d(java.util.concurrent.FutureTask<T> futureTask) {
        m29291xfa032576().post(futureTask);
        return futureTask;
    }

    @java.lang.Deprecated
    /* renamed from: postOnUiThreadDelayed */
    public static void m29296x4625b925(java.lang.Runnable runnable, long j17) {
        m29291xfa032576().postDelayed(runnable, j17);
    }

    @java.lang.Deprecated
    /* renamed from: runOnUiThread */
    public static <T> java.util.concurrent.FutureTask<T> m29298x925811a8(java.util.concurrent.FutureTask<T> futureTask) {
        if (m29303x9483fbdc()) {
            futureTask.run();
        } else {
            m29294x5d0197d((java.util.concurrent.FutureTask) futureTask);
        }
        return futureTask;
    }

    @java.lang.Deprecated
    /* renamed from: runOnUiThreadBlocking */
    public static void m29301x6eddb9fd(java.lang.Runnable runnable) {
        if (m29303x9483fbdc()) {
            runnable.run();
            return;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        m29294x5d0197d(futureTask);
        try {
            futureTask.get();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("Exception occurred while waiting for runnable", e17);
        }
    }

    @java.lang.Deprecated
    /* renamed from: runOnUiThreadBlockingNoException */
    public static <T> T m29302xa95d8951(java.util.concurrent.Callable<T> callable) {
        try {
            return (T) m29300x6eddb9fd(callable);
        } catch (java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Error occurred waiting for callable", e17);
        }
    }

    /* renamed from: runningOnUiThread */
    public static boolean m29303x9483fbdc() {
        return m29291xfa032576().getLooper() == android.os.Looper.myLooper();
    }

    /* renamed from: setThreadAssertsDisabledForTesting */
    public static void m29304x499295c4(boolean z17) {
        f14645x9def116c = z17;
    }

    /* renamed from: setThreadPriorityAudio */
    public static void m29305x4403f6e6(int i17) {
        android.os.Process.setThreadPriority(i17, -19);
    }

    /* renamed from: setUiThread */
    public static void m29306x38306840(android.os.Looper looper) {
        synchronized (f14644x678c83e) {
            if (looper == null) {
                f14646x2ebab6b9 = null;
                return;
            }
            android.os.Handler handler = f14646x2ebab6b9;
            if (handler != null && handler.getLooper() != looper) {
                throw new java.lang.RuntimeException("UI thread looper is already set to " + f14646x2ebab6b9.getLooper() + " (Main thread looper is " + android.os.Looper.getMainLooper() + "), cannot set to new looper " + looper);
            }
            f14646x2ebab6b9 = new android.os.Handler(looper);
        }
    }

    /* renamed from: setWillOverrideUiThread */
    public static void m29307xae81b91e(boolean z17) {
        synchronized (f14644x678c83e) {
            f14647x93547dd1 = z17;
        }
    }

    @java.lang.Deprecated
    /* renamed from: postOnUiThread */
    public static void m29295x5d0197d(java.lang.Runnable runnable) {
        m29291xfa032576().post(runnable);
    }

    @java.lang.Deprecated
    /* renamed from: runOnUiThread */
    public static <T> java.util.concurrent.FutureTask<T> m29297x925811a8(java.util.concurrent.Callable<T> callable) {
        return m29298x925811a8(new java.util.concurrent.FutureTask(callable));
    }

    @java.lang.Deprecated
    /* renamed from: runOnUiThread */
    public static void m29299x925811a8(java.lang.Runnable runnable) {
        if (m29303x9483fbdc()) {
            runnable.run();
        } else {
            m29291xfa032576().post(runnable);
        }
    }

    @java.lang.Deprecated
    /* renamed from: runOnUiThreadBlocking */
    public static <T> T m29300x6eddb9fd(java.util.concurrent.Callable<T> callable) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        m29298x925811a8(futureTask);
        try {
            return (T) futureTask.get();
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException("Interrupted waiting for callable", e17);
        }
    }
}
