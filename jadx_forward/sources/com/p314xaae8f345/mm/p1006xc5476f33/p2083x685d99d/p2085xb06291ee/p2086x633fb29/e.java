package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f243956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s f243957e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar, double d17) {
        this.f243957e = sVar;
        this.f243956d = d17;
    }

    @Override // java.lang.Runnable
    public void run() {
        double d17 = this.f243956d;
        java.lang.Double valueOf = java.lang.Double.valueOf(d17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "SeekToFrame   %f  %s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        this.f243957e.B = d17;
    }
}
