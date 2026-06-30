package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ef implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 f249770d;

    public ef(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816) {
        this.f249770d = activityC18016xf3330816;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$7");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "onSceneEnd:%s errtype:%s errcode:%s", m1Var, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "onSceneEnd from NetSceneSnsObjectDetial");
            boolean I = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2) m1Var).I(i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816 = this.f249770d;
            if (I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPopMediasUI", "onSceneEnd: respObject nil, forbidAccess = true");
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.Q1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1702", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                activityC18016xf3330816.H1 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1702", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.Q1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$802", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            activityC18016xf3330816.J1 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$802", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            boolean z17 = activityC18016xf3330816.F1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                activityC18016xf3330816.t7();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$7");
    }
}
