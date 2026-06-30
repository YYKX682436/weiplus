package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f170599d;

    public f(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f170599d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f170599d.countDown();
    }
}
