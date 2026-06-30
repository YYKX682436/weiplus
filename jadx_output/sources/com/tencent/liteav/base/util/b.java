package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f46429a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f46430b;

    private b(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f46429a = runnable;
        this.f46430b = countDownLatch;
    }

    public static java.lang.Runnable a(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        return new com.tencent.liteav.base.util.b(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.util.CustomHandler.lambda$runAndWaitDone$1(this.f46429a, this.f46430b);
    }
}
