package he0;

/* loaded from: classes4.dex */
public class u5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public u5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50 c6066x1782ba50 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        if (c6066x1782ba50 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50) {
            am.yv yvVar = c6066x1782ba50.f136349g;
            int i17 = yvVar.f90014a;
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276842m;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]start do download ", "[image-flow]", yvVar.f90015b.f459388d);
                ca4.s0 s0Var = new ca4.s0(yvVar.f90015b);
                s0Var.d(1);
                s0Var.e(yvVar.f90015b.f459388d);
                if (yvVar.f90015b.f459389e == 6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().d(yvVar.f90015b, 5, s0Var, s7Var);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().d(yvVar.f90015b, 1, s0Var, s7Var);
                }
            } else if (i17 == 3) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), yvVar.f90016c) + ca4.z0.V(yvVar.f90016c);
                yvVar.f90017d = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]GENERATE_PATH:%s", "[image-flow]", yvVar.f90016c, str);
            } else if (i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]start do download big img", "[image-flow]", yvVar.f90015b.f459388d);
                ca4.s0 s0Var2 = new ca4.s0(yvVar.f90015b);
                s0Var2.d(3);
                s0Var2.e(yvVar.f90015b.f459388d);
                if (yvVar.f90015b.f459389e == 6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().d(yvVar.f90015b, 4, null, s7Var);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().d(yvVar.f90015b, 2, s0Var2, s7Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        return false;
    }
}
