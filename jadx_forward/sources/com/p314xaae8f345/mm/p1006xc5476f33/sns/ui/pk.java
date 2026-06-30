package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class pk implements android.widget.ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 f251779a;

    public pk(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10) {
        this.f251779a = activityC18072xf2d2bc10;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j4.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10 activityC18072xf2d2bc10 = this.f251779a;
        if (a17 && activityC18072xf2d2bc10.getIntent().getBooleanExtra("Kis_with_together", false) && i17 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC18072xf2d2bc10);
            u1Var.g(activityC18072xf2d2bc10.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhr));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            u1Var.q(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return false;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85893h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.U(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "user click [previousGroup: %d    onGroupClick:%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (i17 <= 1) {
            if (i18 > 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).c(i18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85893h = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.X6(activityC18072xf2d2bc10) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.X6(activityC18072xf2d2bc10).size() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            int d76 = activityC18072xf2d2bc10.d7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            if (d76 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.Z6(activityC18072xf2d2bc10, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTransformDialog", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                db5.e1.y(activityC18072xf2d2bc10, activityC18072xf2d2bc10.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574753jc5), null, activityC18072xf2d2bc10.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574752jc4), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tk(activityC18072xf2d2bc10));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTransformDialog", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        boolean z17 = activityC18072xf2d2bc10.f248763r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$702", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            activityC18072xf2d2bc10.f248761p = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$702", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.Z6(activityC18072xf2d2bc10, i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC18072xf2d2bc10, null, activityC18072xf2d2bc10.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbl), false, false, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            activityC18072xf2d2bc10.f248765t = Q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return true;
        }
        if (i18 != i17) {
            if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).collapseGroup(2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85896k.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85898m.clear();
            } else if (i18 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).collapseGroup(3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85897l.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85899n.clear();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ok(this, i17));
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).isGroupExpanded(i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).c(i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.a7(activityC18072xf2d2bc10).d(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18072xf2d2bc10.T6(activityC18072xf2d2bc10).f85893h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
        return true;
    }
}
