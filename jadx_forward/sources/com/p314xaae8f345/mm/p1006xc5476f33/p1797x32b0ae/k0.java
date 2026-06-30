package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f225379a;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f225379a = countDownLatch;
    }

    public void a(java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "batchCheckLiteApp appIds:" + arrayList.toString());
        this.f225379a.countDown();
    }
}
