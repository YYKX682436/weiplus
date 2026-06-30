package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f166619d;

    public qb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.tb tbVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f166619d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f166619d.countDown();
    }
}
