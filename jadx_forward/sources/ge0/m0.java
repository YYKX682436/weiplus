package ge0;

/* loaded from: classes4.dex */
public class m0 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEnd");
        if (m1Var.mo808xfb85f7b0() == 207) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadSceneEnd", "snsUploadSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(hashCode()));
            boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3;
            int I = z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3) m1Var).I() : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(I, i17, i18);
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
                if (z17) {
                    int i19 = i18 + 10000;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                    if (I == ba4.b.f100233c) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = ba4.b.f100231a;
                        if (c6889x9caa3908 != null) {
                            c6889x9caa3908.f142061o = (int) (java.lang.System.currentTimeMillis() - ba4.b.f100232b);
                        }
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa39082 = ba4.b.f100231a;
                        if (c6889x9caa39082 != null) {
                            c6889x9caa39082.f142060n = i19;
                        }
                        if (c6889x9caa39082 != null) {
                            c6889x9caa39082.k();
                        }
                        ba4.b.f100231a = null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEnd");
    }
}
