package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f127962a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f127963b;

    private b(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f127962a = runnable;
        this.f127963b = countDownLatch;
    }

    public static java.lang.Runnable a(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        return new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.b(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279.m29519x51c8910d(this.f127962a, this.f127963b);
    }
}
