package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class i2 extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258209d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var) {
        this.f258209d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "network status change from " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var = this.f258209d;
        if (h2Var.f258095e && i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = h2Var.f258091a.f257944a;
            int i18 = g1Var.L;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
            if (i18 == 0) {
                g1Var.L = c18912x54425f62.f258389j;
            }
            int e17 = vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (e17 != g1Var.L) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve: onVoipLocalNetTypeChange: local network type change from " + g1Var.L + " to " + e17);
                try {
                    byte[] bArr = new byte[4];
                    bArr[0] = (byte) e17;
                    int m72841x430a65b = c18912x54425f62.m72841x430a65b(301, bArr, 4);
                    if (m72841x430a65b < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + e17 + "fail:" + m72841x430a65b + ", [roomid=" + c18912x54425f62.f258413r + ", roomkey=" + c18912x54425f62.f258416s + "]");
                    }
                    r45.ww6 ww6Var = new r45.ww6();
                    ww6Var.f471080d = 3;
                    ww6Var.f471081e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, 1);
                    c18912x54425f62.m72792x4e33bdb7(ww6Var.mo14344x5f01b1f6(), ww6Var.mo14344x5f01b1f6().length);
                } catch (java.lang.Exception unused) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
                }
                g1Var.L = e17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = h2Var.f258091a;
            if (d3Var.f257944a.f258046e) {
                d3Var.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var2 = d3Var.f257944a;
                g1Var2.f258065x.c(linkedList);
                int i19 = 0;
                int i27 = 0;
                for (int i28 = 0; i28 < linkedList.size(); i28++) {
                    if (((r45.et4) linkedList.get(i28)).f455255g == 5 || ((r45.et4) linkedList.get(i28)).f455255g == 6) {
                        i27++;
                    }
                    if (((r45.et4) linkedList.get(i28)).f455255g == 4) {
                        i19++;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = g1Var2.f258065x;
                sb6.append(c18912x54425f622.f258417s0);
                sb6.append("|redirect:");
                sb6.append(i19);
                sb6.append(":");
                sb6.append(i27);
                c18912x54425f622.f258417s0 = sb6.toString();
                int i29 = c18912x54425f622.f258410q;
                if (i29 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipServiceEx", "current room Id is unavailable,can not run redirect cgi");
                    return;
                }
                mq4.s sVar = new mq4.s(i29, c18912x54425f622.f258416s, c18912x54425f622.f258413r, 0, 0, null, linkedList);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = c18912x54425f622.M1;
                l1Var.getClass();
                l1Var.Q = java.lang.System.currentTimeMillis();
                sVar.L();
            }
        }
    }
}
