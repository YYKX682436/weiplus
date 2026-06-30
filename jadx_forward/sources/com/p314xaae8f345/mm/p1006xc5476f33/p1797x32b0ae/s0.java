package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes7.dex */
public class s0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f225703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f225704b;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String[] strArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f225703a = strArr;
        this.f225704b = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check fail, errCode: " + i17);
        this.f225704b.countDown();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check success, path: " + c3712x3ed8a441.f14369x346425);
        this.f225703a[0] = c3712x3ed8a441.f14369x346425;
        this.f225704b.countDown();
    }
}
