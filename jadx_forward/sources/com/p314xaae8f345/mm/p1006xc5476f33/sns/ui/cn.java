package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class cn implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18081xc64c43f9 f249670d;

    public cn(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18081xc64c43f9 activityC18081xc64c43f9) {
        this.f249670d = activityC18081xc64c43f9;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$3");
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18081xc64c43f9.f248822v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18081xc64c43f9 activityC18081xc64c43f9 = this.f249670d;
        activityC18081xc64c43f9.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendNotInterest", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        activityC18081xc64c43f9.f248834p = 0;
        java.util.HashMap hashMap = activityC18081xc64c43f9.f248826e;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (((java.lang.Boolean) hashMap.get(java.lang.Integer.valueOf(intValue))).booleanValue()) {
                int i17 = activityC18081xc64c43f9.f248834p;
                if (i17 == 0) {
                    activityC18081xc64c43f9.f248834p = intValue;
                } else {
                    activityC18081xc64c43f9.f248834p = intValue | i17;
                }
            }
        }
        if (activityC18081xc64c43f9.f248835q != 0 && activityC18081xc64c43f9.f248833o != 0) {
            activityC18081xc64c43f9.f248838t = db5.e1.Q(activityC18081xc64c43f9.mo55332x76847179(), activityC18081xc64c43f9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC18081xc64c43f9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dn(activityC18081xc64c43f9));
            activityC18081xc64c43f9.f248839u = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(activityC18081xc64c43f9.f248835q, activityC18081xc64c43f9.f248833o, activityC18081xc64c43f9.f248834p, activityC18081xc64c43f9.f248837s ? activityC18081xc64c43f9.f248829h.getText().toString() : null);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(activityC18081xc64c43f9.f248839u);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendNotInterest", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$3");
        return true;
    }
}
