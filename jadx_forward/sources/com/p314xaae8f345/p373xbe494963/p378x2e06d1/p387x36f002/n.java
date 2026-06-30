package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
final /* synthetic */ class n implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f127990a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f127991b;

    private n(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f127990a = runnable;
        this.f127991b = countDownLatch;
    }

    public static java.lang.Runnable a(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.n(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Runnable runnable = this.f127990a;
        java.util.concurrent.CountDownLatch countDownLatch = this.f127991b;
        runnable.run();
        countDownLatch.countDown();
    }
}
