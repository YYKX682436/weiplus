package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class u2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 f258341d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var) {
        this.f258341d = d3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = this.f258341d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = d3Var.f257944a;
        g1Var.I++;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
        if (c18912x54425f62.f258410q == 0) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", fp.k.c() + "double link switch roomId == 0 ");
            d3Var.B.d();
        } else {
            c18912x54425f62.m72797x50d4bfb0(c18912x54425f62.f258391j1, c18912x54425f62.f258394k1, c18912x54425f62.f258397l1, 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = d3Var.f257944a;
            if (!g1Var2.H && 1 == g1Var2.f258065x.f38626xc6b01818) {
                g1Var2.H = true;
                g1Var2.f258040J = g1Var2.I;
            }
            if (1 == g1Var2.f258059r) {
                g1Var2.f258059r = 15;
            }
            if (true == g1Var2.H) {
                int i17 = g1Var2.I;
                if (i17 - g1Var2.f258040J == g1Var2.f258059r) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var2.f258065x;
                    if ((c18912x54425f622.f258367b1 & 1) == 0) {
                        g1Var2.f258040J = i17;
                        int m72832x3341bbea = c18912x54425f622.m72832x3341bbea();
                        int m72808x4886a6e9 = d3Var.f257944a.f258065x.m72808x4886a6e9();
                        if (1 == m72832x3341bbea && 1 == m72808x4886a6e9) {
                            vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  In the Same LAN, isDCSameLan = " + m72832x3341bbea);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var3 = d3Var.f257944a;
                            g1Var3.I = g1Var3.I + 1;
                            return true;
                        }
                        int m72828x2177849d = d3Var.f257944a.f258065x.m72828x2177849d();
                        int m72833xc951ce10 = d3Var.f257944a.f258065x.m72833xc951ce10();
                        int m72831xfe6807fa = d3Var.f257944a.f258065x.m72831xfe6807fa();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var4 = d3Var.f257944a;
                        int i18 = g1Var4.f258059r - 3;
                        g1Var4.f258065x.m72798x88348625(i18 <= 15 ? i18 : 15, d3Var.A);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f623 = d3Var.f257944a.f258065x;
                        new mq4.k(c18912x54425f623.f258410q, c18912x54425f623.f258416s, c18912x54425f623.f258413r, m72808x4886a6e9, m72833xc951ce10, m72831xfe6807fa, m72828x2177849d, d3Var.A, c18912x54425f623.f38636x13830f2).L();
                        d3Var.f257944a.f258065x.f258370c1++;
                        vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  doubleLinkSwitchReportStatus " + d3Var.f257944a.f258059r + " isFirstValidSampleSet " + d3Var.f257944a.H + " mGetValidSample " + d3Var.f257944a.f258065x.f38626xc6b01818 + "mDoubleLinkSwitchReqCnt " + d3Var.f257944a.f258065x.f258370c1 + "mTimerCounter " + d3Var.f257944a.I + "mLastSwitchTimer " + d3Var.f257944a.f258040J);
                    }
                }
            }
        }
        return true;
    }
}
