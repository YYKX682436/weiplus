package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class n4 implements ls0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f163483a;

    public n4(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f163483a = countDownLatch;
    }

    @Override // ls0.m
    public void b(java.lang.String str) {
        this.f163483a.countDown();
    }
}
