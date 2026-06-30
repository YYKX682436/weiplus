package com.tencent.liteav.base;

/* loaded from: classes13.dex */
public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object sLock = new java.lang.Object();
    private static boolean sThreadAssertsDisabled;
    private static android.os.Handler sUiThreadHandler;
    private static boolean sWillOverride;

    public static void assertOnBackgroundThread() {
    }

    public static void assertOnUiThread() {
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabled && !runningOnUiThread()) {
            throw new java.lang.IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static android.os.Handler getUiThreadHandler() {
        android.os.Handler handler;
        synchronized (sLock) {
            if (sUiThreadHandler == null) {
                if (sWillOverride) {
                    throw new java.lang.RuntimeException("Did not yet override the UI thread");
                }
                sUiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            handler = sUiThreadHandler;
        }
        return handler;
    }

    public static android.os.Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    private static boolean isThreadPriorityAudio(int i17) {
        return android.os.Process.getThreadPriority(i17) == -19;
    }

    @java.lang.Deprecated
    public static <T> java.util.concurrent.FutureTask<T> postOnUiThread(java.util.concurrent.FutureTask<T> futureTask) {
        getUiThreadHandler().post(futureTask);
        return futureTask;
    }

    @java.lang.Deprecated
    public static void postOnUiThreadDelayed(java.lang.Runnable runnable, long j17) {
        getUiThreadHandler().postDelayed(runnable, j17);
    }

    @java.lang.Deprecated
    public static <T> java.util.concurrent.FutureTask<T> runOnUiThread(java.util.concurrent.FutureTask<T> futureTask) {
        if (runningOnUiThread()) {
            futureTask.run();
        } else {
            postOnUiThread((java.util.concurrent.FutureTask) futureTask);
        }
        return futureTask;
    }

    @java.lang.Deprecated
    public static void runOnUiThreadBlocking(java.lang.Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
            return;
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
        postOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("Exception occurred while waiting for runnable", e17);
        }
    }

    @java.lang.Deprecated
    public static <T> T runOnUiThreadBlockingNoException(java.util.concurrent.Callable<T> callable) {
        try {
            return (T) runOnUiThreadBlocking(callable);
        } catch (java.util.concurrent.ExecutionException e17) {
            throw new java.lang.RuntimeException("Error occurred waiting for callable", e17);
        }
    }

    public static boolean runningOnUiThread() {
        return getUiThreadHandler().getLooper() == android.os.Looper.myLooper();
    }

    public static void setThreadAssertsDisabledForTesting(boolean z17) {
        sThreadAssertsDisabled = z17;
    }

    public static void setThreadPriorityAudio(int i17) {
        android.os.Process.setThreadPriority(i17, -19);
    }

    public static void setUiThread(android.os.Looper looper) {
        synchronized (sLock) {
            if (looper == null) {
                sUiThreadHandler = null;
                return;
            }
            android.os.Handler handler = sUiThreadHandler;
            if (handler != null && handler.getLooper() != looper) {
                throw new java.lang.RuntimeException("UI thread looper is already set to " + sUiThreadHandler.getLooper() + " (Main thread looper is " + android.os.Looper.getMainLooper() + "), cannot set to new looper " + looper);
            }
            sUiThreadHandler = new android.os.Handler(looper);
        }
    }

    public static void setWillOverrideUiThread(boolean z17) {
        synchronized (sLock) {
            sWillOverride = z17;
        }
    }

    @java.lang.Deprecated
    public static void postOnUiThread(java.lang.Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    @java.lang.Deprecated
    public static <T> java.util.concurrent.FutureTask<T> runOnUiThread(java.util.concurrent.Callable<T> callable) {
        return runOnUiThread(new java.util.concurrent.FutureTask(callable));
    }

    @java.lang.Deprecated
    public static void runOnUiThread(java.lang.Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
        } else {
            getUiThreadHandler().post(runnable);
        }
    }

    @java.lang.Deprecated
    public static <T> T runOnUiThreadBlocking(java.util.concurrent.Callable<T> callable) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        runOnUiThread(futureTask);
        try {
            return (T) futureTask.get();
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException("Interrupted waiting for callable", e17);
        }
    }
}
