package qd4;

/* loaded from: classes15.dex */
public class g implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 f443399a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        this.f443399a = activityC18357x320c26e1;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChildClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1 = this.f443399a;
        if (i18 == com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).getChildrenCount(i17) - 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.c7(activityC18357x320c26e1, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.U6(activityC18357x320c26e1);
        } else {
            java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).getChild(i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).d(str);
            if (i17 == activityC18357x320c26e1.f251075f) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.W6(activityC18357x320c26e1, 1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443430r, str, view);
            } else if (i17 == activityC18357x320c26e1.f251076g) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.W6(activityC18357x320c26e1, 2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(activityC18357x320c26e1).f443431s, str, view);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChildClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$3");
        return false;
    }
}
