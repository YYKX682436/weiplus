package qd4;

/* loaded from: classes15.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 f443401d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        this.f443401d = activityC18357x320c26e1;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1 = this.f443401d;
        activityC18357x320c26e1.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18357x320c26e1.f251082p.f443430r, ",");
        java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18357x320c26e1.f251082p.f443432t, ",");
        java.lang.String c19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18357x320c26e1.f251082p.f443431s, ",");
        java.lang.String c110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18357x320c26e1.f251082p.f443433u, ",");
        qd4.r rVar = activityC18357x320c26e1.f251082p;
        if (rVar.f443428p != activityC18357x320c26e1.f251075f || rVar.f443430r.size() != 0 || activityC18357x320c26e1.f251082p.f443432t.size() != 0) {
            qd4.r rVar2 = activityC18357x320c26e1.f251082p;
            if (rVar2.f443428p != activityC18357x320c26e1.f251076g || rVar2.f443431s.size() != 0 || activityC18357x320c26e1.f251082p.f443433u.size() != 0) {
                if ((activityC18357x320c26e1.f251082p.f443428p == activityC18357x320c26e1.f251075f && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c18)) || (activityC18357x320c26e1.f251082p.f443428p == activityC18357x320c26e1.f251076g && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c110))) {
                    db5.e1.y(activityC18357x320c26e1, activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbn), "", activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574752jc4), null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                } else {
                    activityC18357x320c26e1.l7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
                return true;
            }
        }
        db5.e1.y(activityC18357x320c26e1, activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbn), "", activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574752jc4), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
        return true;
    }
}
