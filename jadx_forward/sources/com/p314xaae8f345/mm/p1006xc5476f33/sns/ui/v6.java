package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class v6 extends zd4.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f252155e;

    public v6(java.lang.ref.WeakReference weakReference) {
        super(weakReference);
        this.f252155e = weakReference;
    }

    @Override // zd4.m, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.lang.ref.WeakReference weakReference = this.f252155e;
        if (weakReference == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] WeakRef null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90 activityC17981xde240d90 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90) weakReference.get();
        if (activityC17981xde240d90 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] activity null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            return;
        }
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.P;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInTransforming", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = activityC17981xde240d90.f252220u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInTransforming", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] but not isInTransform");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 218) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            activityC17981xde240d90.f252220u = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                boolean z18 = activityC17981xde240d90.E;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    activityC17981xde240d90.l7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    if (i17 == 0 && i18 == 0) {
                        long M = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) m1Var).M();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        java.lang.Long l17 = activityC17981xde240d90.G;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        if (M == l17.longValue()) {
                            activityC17981xde240d90.finish();
                            db5.t7.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572119z7));
                        }
                    } else {
                        activityC17981xde240d90.finish();
                        db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.j_d));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
    }
}
