package he0;

/* loaded from: classes4.dex */
public class x4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public x4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 Pj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z7 z7Var = Pj.f245841a;
        if (z7Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(z7Var.f246346b, c5814x771f4db2.f136121g.f88379c)) {
            am.hn hnVar = c5814x771f4db2.f136121g;
            if (hnVar.f88378b != 0) {
                Pj.w();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
            } else {
                int i17 = hnVar.f88377a;
                if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnlineVideoListener", "Moov ready: %s", hnVar.f88379c);
                    am.hn hnVar2 = c5814x771f4db2.f136121g;
                    z7Var.f246354j = hnVar2.f88380d;
                    z7Var.f246355k = hnVar2.f88381e;
                } else if (i17 == 5) {
                    z7Var.f246352h = hnVar.f88380d;
                    z7Var.f246353i = hnVar.f88381e;
                }
                int i18 = c5814x771f4db2.f136121g.f88377a;
                if (i18 == 4 || i18 == 6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h7(Pj));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.OnlineVideoListener");
        return false;
    }
}
