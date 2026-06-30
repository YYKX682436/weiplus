package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f258463d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var) {
        this.f258463d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int e17 = vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = this.f258463d;
        if (m40093xb9aa8b5f) {
            int h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.E = h17;
            d3Var.f257944a.f258065x.m72845xe50c1ace(4, h17);
        }
        int d17 = vq4.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        d3Var.f257944a.f258065x.m72845xe50c1ace(d17, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipServiceEx", "nettype %d wifi rssi %d ratiotype %d radio signal value %d", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.E), java.lang.Integer.valueOf(d17), -1);
    }
}
