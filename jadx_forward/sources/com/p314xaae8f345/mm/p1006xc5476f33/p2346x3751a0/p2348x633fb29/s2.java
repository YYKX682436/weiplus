package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class s2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f258334d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var) {
        this.f258334d = d3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = this.f258334d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = d3Var.f257944a;
        boolean z17 = true;
        if (g1Var.f258065x.f258407p == 1) {
            int i17 = g1Var.f258041a;
            if (i17 != 2 && i17 != 4) {
                z17 = false;
            }
            if (z17) {
                vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "call timeout!");
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = d3Var.f257944a;
                g1Var2.f258065x.M1.f258246a = 101;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11521, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                g1Var2.f258067z.M();
                d3Var.b(4);
            }
        }
        return false;
    }
}
