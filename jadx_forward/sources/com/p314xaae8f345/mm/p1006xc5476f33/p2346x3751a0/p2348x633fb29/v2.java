package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class v2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f258346d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var) {
        this.f258346d = d3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = this.f258346d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = d3Var.f257944a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
        int i17 = c18912x54425f62.f258410q;
        if (i17 == 0) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", fp.k.c() + " roomId == 0 ");
            d3Var.C.d();
        } else {
            if (g1Var.f258041a >= 5) {
                mq4.o oVar = new mq4.o(i17, c18912x54425f62.f258416s, g1Var.S, g1Var.G, c18912x54425f62.m72779x945f31df());
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = d3Var.f257944a.f258065x.M1;
                if (l1Var.P != 0) {
                    l1Var.g(-1L);
                }
                l1Var.P = java.lang.System.currentTimeMillis();
                oVar.L();
            }
        }
        return true;
    }
}
