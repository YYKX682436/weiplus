package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.util.CustomHandler */
/* loaded from: classes13.dex */
public class HandlerC3775x958f0279 extends android.os.Handler {

    /* renamed from: TIMEOUT_QUIT_LOOPER */
    private static final long f14742x2df28843 = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    /* renamed from: mQuitLooperTimeoutRunnable */
    private java.lang.Runnable f14743x1b964e11;

    /* renamed from: mTAG */
    private final java.lang.String f14744x32cfed;

    /* renamed from: mUIHandler */
    private final android.os.Handler f14745x69b7c049;

    public HandlerC3775x958f0279(android.os.Looper looper) {
        this(looper, null);
    }

    /* renamed from: lambda$quitLooper$2 */
    public static /* synthetic */ boolean m29516x880067cb(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(handlerC3775x958f0279.f14744x32cfed, "queue idle handle.");
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 18) {
            handlerC3775x958f0279.getLooper().quitSafely();
        } else {
            handlerC3775x958f0279.getLooper().quit();
        }
        handlerC3775x958f0279.f14745x69b7c049.removeCallbacks(handlerC3775x958f0279.f14743x1b964e11);
        return false;
    }

    /* renamed from: lambda$quitLooper$3 */
    public static /* synthetic */ void m29517x880067cc(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279, android.os.MessageQueue.IdleHandler idleHandler) {
        if (handlerC3775x958f0279.getLooper() == android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(handlerC3775x958f0279.f14744x32cfed, "try to quitLooper main looper!");
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(handlerC3775x958f0279.f14744x32cfed, "add idle handle.");
            android.os.Looper.myQueue().addIdleHandler(idleHandler);
        }
    }

    /* renamed from: lambda$runAndWaitDone$0 */
    public static /* synthetic */ void m29518x51c8910c(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    /* renamed from: lambda$runAndWaitDone$1 */
    public static /* synthetic */ void m29519x51c8910d(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    /* renamed from: isCurrentThread */
    public boolean m29520x8014fd9() {
        return android.os.Looper.myLooper() != null && android.os.Looper.myLooper() == getLooper();
    }

    /* renamed from: postDelayedTask */
    public boolean m29521x6a420547(java.lang.Runnable runnable, long j17) {
        return postDelayed(runnable, j17);
    }

    /* renamed from: postTask */
    public boolean m29522x2d1ef245(java.lang.Runnable runnable) {
        return post(runnable);
    }

    /* renamed from: quitLooper */
    public void m29523xb3609180() {
        post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.d.a(this, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.c.a(this)));
        this.f14745x69b7c049.postDelayed(this.f14743x1b964e11, f14742x2df28843);
    }

    /* renamed from: quitLooperAndWaitDone */
    public void m29524xaaeba3ee() {
        m29523xb3609180();
        try {
            getLooper().getThread().join();
        } catch (java.lang.InterruptedException unused) {
        }
    }

    /* renamed from: runAndWaitDone */
    public boolean m29525xa7c8f603(java.lang.Runnable runnable) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        boolean post = post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.a.a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        return post;
    }

    /* renamed from: runOrPost */
    public boolean m29527xc88bc38e(java.lang.Runnable runnable) {
        return m29528xc88bc38e(runnable, 0);
    }

    public HandlerC3775x958f0279(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.f14745x69b7c049 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f14743x1b964e11 = new java.lang.Runnable() { // from class: com.tencent.liteav.base.util.CustomHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279.this.f14744x32cfed, "quit looper failed.");
            }
        };
        java.lang.String str = "TXCHandler_" + hashCode();
        this.f14744x32cfed = str;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, "[" + java.lang.Thread.currentThread().getName() + "]");
    }

    /* renamed from: runOrPost */
    public boolean m29528xc88bc38e(java.lang.Runnable runnable, int i17) {
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

    /* renamed from: runAndWaitDone */
    public boolean m29526xa7c8f603(java.lang.Runnable runnable, long j17) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        boolean post = post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.b.a(runnable, countDownLatch));
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
