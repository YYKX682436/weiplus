package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public class rr implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 f251964a;

    public rr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 activityC18115x808957e7) {
        this.f251964a = activityC18115x808957e7;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 activityC18115x808957e7 = this.f251964a;
        java.lang.String c17 = lz.a.c(activityC18115x808957e7.f248978f, i17);
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(c17)) {
            db5.e1.i(activityC18115x808957e7.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.i4t, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
            return;
        }
        activityC18115x808957e7.Y6(c17);
        if (!(activityC18115x808957e7.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18115x808957e7.f248979g, ",")).equals(activityC18115x808957e7.f248982m) || activityC18115x808957e7.f248980h == 0) {
            activityC18115x808957e7.m78501x43e00957(true);
        } else {
            activityC18115x808957e7.m78501x43e00957(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemDelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemMoreClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemMoreClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemAddClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7.f248975q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 activityC18115x808957e7 = this.f251964a;
        activityC18115x808957e7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealAddMemberBtn", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18115x808957e7.f248979g, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", activityC18115x808957e7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c, 1024) & (-16777217));
        intent.putExtra("always_select_contact", c17);
        j45.l.v(activityC18115x808957e7, ".ui.contact.SelectContactUI", intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealAddMemberBtn", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemAddClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemCancelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f251964a.f248978f;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.N();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemCancelClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemNormalClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 activityC18115x808957e7 = this.f251964a;
        java.lang.String c17 = lz.a.c(activityC18115x808957e7.f248978f, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        long j17 = activityC18115x808957e7.f248980h;
        if (j17 == 4) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 18);
        } else if (j17 == 5) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 19);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, activityC18115x808957e7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemNormalClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$9");
    }
}
