package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes7.dex */
public class y implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f175351a;

    public y(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f175351a = countDownLatch;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXBizLogic", "onInterrupt error");
        this.f175351a.countDown();
    }
}
