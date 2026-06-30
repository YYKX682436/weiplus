package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f46427a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f46428b;

    private a(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f46427a = runnable;
        this.f46428b = countDownLatch;
    }

    public static java.lang.Runnable a(java.lang.Runnable runnable, java.util.concurrent.CountDownLatch countDownLatch) {
        return new com.tencent.liteav.base.util.a(runnable, countDownLatch);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.util.CustomHandler.lambda$runAndWaitDone$0(this.f46427a, this.f46428b);
    }
}
