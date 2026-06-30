package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class n0 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
        Cj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.mo808xfb85f7b0() + " @" + Cj.hashCode());
        if (m1Var.mo808xfb85f7b0() != 208) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o2) m1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]NetSceneSnsDownload download finish type:%d code:%d", "[image-flow]", o2Var.H(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.lang.String mediaId = o2Var.H();
            ta4.u0 u0Var = ta4.u0.f498371a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("netSceneSnsDownloadFinish", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            pm0.v.O("SnsImageLoadReporter", new ta4.i0(mediaId, i17, i18));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("netSceneSnsDownloadFinish", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            java.util.Set set = Cj.f245980j;
            if (i17 == 0 && i18 == 0) {
                if (m1Var.mo808xfb85f7b0() == 208) {
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0) it.next();
                        if (h0Var != null) {
                            if (o2Var.I() == 3) {
                                h0Var.mo853xb04a0d88(o2Var.H());
                            } else if (o2Var.I() == 1 || o2Var.I() == 5 || o2Var.I() == 7) {
                                h0Var.mo855x8dbd7aaa(o2Var.H());
                            } else if (o2Var.I() == 2 || o2Var.I() == 10 || o2Var.I() == 11 || o2Var.I() == 8) {
                                h0Var.mo852x876bfa6f(o2Var.H(), o2Var.I(), true);
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            } else {
                if (o2Var.I() == 2 || o2Var.I() == 10 || o2Var.I() == 11 || o2Var.I() == 8) {
                    java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 h0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0) it6.next();
                        if (h0Var2 != null) {
                            h0Var2.mo852x876bfa6f(o2Var.H(), o2Var.I(), false);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEnd");
    }
}
