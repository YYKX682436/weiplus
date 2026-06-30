package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes4.dex */
public class y0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f264723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f264724b;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z0 z0Var, int[] iArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f264723a = iArr;
        this.f264724b = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckTextLanguage", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int[] iArr = this.f264723a;
        iArr[0] = 2;
        java.util.concurrent.CountDownLatch countDownLatch = this.f264724b;
        if (i17 != 0 || i18 != 0) {
            countDownLatch.countDown();
            return;
        }
        int i19 = ((r45.o20) oVar.f152244b.f152233a).f463374e;
        if (i19 == 1) {
            iArr[0] = 0;
        } else if (i19 == 2) {
            iArr[0] = 1;
        }
        countDownLatch.countDown();
    }
}
