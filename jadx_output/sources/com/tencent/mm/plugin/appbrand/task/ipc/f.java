package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f89066d;

    public f(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f89066d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f89066d.countDown();
    }
}
