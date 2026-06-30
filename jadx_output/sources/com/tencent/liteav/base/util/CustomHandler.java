package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes13.dex */
public class CustomHandler extends android.os.Handler {
    private static final long TIMEOUT_QUIT_LOOPER = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);
    private java.lang.Runnable mQuitLooperTimeoutRunnable;
    private final java.lang.String mTAG;
    private final android.os.Handler mUIHandler;

    public CustomHandler(android.os.Looper looper) {
        this(looper, null);
    }

    public static /* synthetic */ boolean lambda$quitLooper$2(com.tencent.liteav.base.util.CustomHandler customHandler) {
        com.tencent.liteav.base.util.LiteavLog.i(customHandler.mTAG, "queue idle handle.");
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            customHandler.getLooper().quitSafely();
        } else {
            customHandler.getLooper().quit();
        }
        customHandler.mUIHandler.removeCallbacks(customHandler.mQuitLooperTimeoutRunnable);
        return false;
    }

    public static /* synthetic */ void lambda$quitLooper$3(com.tencent.liteav.base.util.CustomHandler customHandler, android.os.MessageQueue.IdleHandler idleHandler) {
        if (customHandler.getLooper() == android.os.Looper.getMainLooper()) {
            com.tencent.liteav.base.util.LiteavLog.e(customHandler.mTAG, "try to quitLooper main looper!");
        } else {
            com.tencent.liteav.base.util.LiteavLog.i(customHandler.mTAG, "add idle handle.");
            android.os.Looper.myQueue().addIdleHandler(idleHandler);
        }
    }

    public static /* synthetic */ void lambda$runAndWaitDone$0(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public static /* synthetic */ void lambda$runAndWaitDone$1(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public boolean isCurrentThread() {
        return android.os.Looper.myLooper() != null && android.os.Looper.myLooper() == getLooper();
    }

    public boolean postDelayedTask(java.lang.Runnable runnable, long j17) {
        return postDelayed(runnable, j17);
    }

    public boolean postTask(java.lang.Runnable runnable) {
        return post(runnable);
    }

    public void quitLooper() {
        post(com.tencent.liteav.base.util.d.a(this, com.tencent.liteav.base.util.c.a(this)));
        this.mUIHandler.postDelayed(this.mQuitLooperTimeoutRunnable, TIMEOUT_QUIT_LOOPER);
    }

    public void quitLooperAndWaitDone() {
        quitLooper();
        try {
            getLooper().getThread().join();
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public boolean runAndWaitDone(java.lang.Runnable runnable) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        boolean post = post(com.tencent.liteav.base.util.a.a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        return post;
    }

    public boolean runOrPost(java.lang.Runnable runnable) {
        return runOrPost(runnable, 0);
    }

    public CustomHandler(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.mUIHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mQuitLooperTimeoutRunnable = new java.lang.Runnable() { // from class: com.tencent.liteav.base.util.CustomHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.liteav.base.util.LiteavLog.e(com.tencent.liteav.base.util.CustomHandler.this.mTAG, "quit looper failed.");
            }
        };
        java.lang.String str = "TXCHandler_" + hashCode();
        this.mTAG = str;
        com.tencent.liteav.base.util.LiteavLog.i(str, "[" + java.lang.Thread.currentThread().getName() + "]");
    }

    public boolean runOrPost(java.lang.Runnable runnable, int i17) {
        if (!getLooper().getThread().isAlive()) {
            return false;
        }
        if (android.os.Looper.myLooper() == getLooper() && i17 == 0) {
            runnable.run();
            return true;
        }
        if (i17 == 0) {
            return post(runnable);
        }
        return postDelayed(runnable, i17);
    }

    public boolean runAndWaitDone(java.lang.Runnable runnable, long j17) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        boolean post = post(com.tencent.liteav.base.util.b.a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        return post;
    }
}
