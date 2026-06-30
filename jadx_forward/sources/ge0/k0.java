package ge0;

/* loaded from: classes4.dex */
public class k0 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsPostSceneEnd");
        if (m1Var.mo808xfb85f7b0() == 209) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostSceneEnd", "snsPostSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(hashCode()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r2 r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r2) m1Var;
            int L = r2Var.L();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            if (L == ba4.b.f100233c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = ba4.b.f100231a;
                if (c6889x9caa3908 != null) {
                    c6889x9caa3908.f142061o = (int) (java.lang.System.currentTimeMillis() - ba4.b.f100232b);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = ba4.b.f100231a;
                if (c6889x9caa39082 != null) {
                    c6889x9caa39082.f142060n = i18;
                }
                if (c6889x9caa39082 != null) {
                    c6889x9caa39082.k();
                }
                ba4.b.f100231a = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            boolean z17 = r2Var.f246163m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                long j17 = r2Var.f246161h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostSceneEnd", "get the del post come back %d " + j17, java.lang.Integer.valueOf(L));
                if (j17 != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().c(j17);
                    gm0.j1.i();
                    gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(j17, 1));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().L0(L);
                if (j17 != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().y0(j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u1.a(j17);
                }
            }
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().k(r2Var.L(), true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().k(r2Var.L(), false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.f246520a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.u0 u0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.f246520a;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6911x9d13da42 c6911x9d13da42 = u0Var2.f246512a;
            c6911x9d13da42.f142292o = currentTimeMillis - u0Var2.f246513b;
            c6911x9d13da42.f142286i = 7L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.b(u0Var2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 Nj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj();
            Nj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScenePost", "com.tencent.mm.plugin.sns.model.UploadManager");
            Nj.f246090b = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScenePost", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsPostSceneEnd");
    }
}
