package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
final /* synthetic */ class n implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f46457a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f46458b;

    private n(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f46457a = runnable;
        this.f46458b = countDownLatch;
    }

    public static java.lang.Runnable a(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        return new com.tencent.liteav.base.util.n(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.f46457a;
        java.util.concurrent.CountDownLatch countDownLatch = this.f46458b;
        runnable.run();
        countDownLatch.countDown();
    }
}
