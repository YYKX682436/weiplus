package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f85086d;

    public qb(com.tencent.mm.plugin.appbrand.launching.tb tbVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f85086d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f85086d.countDown();
    }
}
