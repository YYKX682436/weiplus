package qd4;

/* loaded from: classes15.dex */
public class f implements android.widget.ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 f443398a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        this.f443398a = activityC18357x320c26e1;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1 = this.f443398a;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443428p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Z6(activityC18357x320c26e1, i17).equals("visible") && !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Z6(activityC18357x320c26e1, i17).equals("invisible")) {
            if (i18 >= 0 && (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Z6(activityC18357x320c26e1, i18).equals("visible") || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Z6(activityC18357x320c26e1, i18).equals("invisible"))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).c(i18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443428p = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.a7(activityC18357x320c26e1) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.a7(activityC18357x320c26e1).size() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            int h76 = activityC18357x320c26e1.h7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            if (h76 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.c7(activityC18357x320c26e1, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTransformDialog", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                db5.e1.y(activityC18357x320c26e1, activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574753jc5), null, activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574752jc4), new qd4.j(activityC18357x320c26e1));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTransformDialog", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        boolean z17 = activityC18357x320c26e1.f251086t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$802", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            activityC18357x320c26e1.f251084r = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$802", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.c7(activityC18357x320c26e1, i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC18357x320c26e1, null, activityC18357x320c26e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbl), false, false, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            activityC18357x320c26e1.f251088v = Q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
            return true;
        }
        qd4.r T6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1);
        T6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.ArrayList arrayList = T6.f443424l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (arrayList != null) {
            qd4.r T62 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1);
            T62.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            java.util.ArrayList arrayList2 = T62.f443424l;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            if (arrayList2.size() != 0) {
                if (i18 != i17) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Z6(activityC18357x320c26e1, i18).equals("visible")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).collapseGroup(i18);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443430r.clear();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443432t.clear();
                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Z6(activityC18357x320c26e1, i18).equals("invisible")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).collapseGroup(i18);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443431s.clear();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443433u.clear();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).post(new qd4.e(this, i17));
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).isGroupExpanded(i17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).c(i17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.V6(activityC18357x320c26e1).d(i17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443428p = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.c7(activityC18357x320c26e1, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.U6(activityC18357x320c26e1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
        return true;
    }
}
