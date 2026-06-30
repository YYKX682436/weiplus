package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class bi {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ai f249447c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ai(null);

    /* renamed from: a, reason: collision with root package name */
    public r45.lh0 f249448a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7 f249449b;

    public static android.view.View d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bi biVar, android.content.Context context, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requireEcsView$default", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        biVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requireEcsView", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        if (biVar.f249449b == null) {
            biVar.f249449b = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7(context);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7 c18055x6570dbf7 = biVar.f249449b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18055x6570dbf7);
        r45.lh0 lh0Var = biVar.f249448a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lh0Var);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18055x6570dbf7.f248680f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindEcsShareInfo$default", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        c18055x6570dbf7.b(lh0Var, false, null, 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindEcsShareInfo$default", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        if (z17 && c18055x6570dbf7.getParent() != null) {
            android.view.ViewParent parent = c18055x6570dbf7.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(c18055x6570dbf7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requireEcsView", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requireEcsView$default", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        return c18055x6570dbf7;
    }

    public final void a(android.widget.RelativeLayout parent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addEcsViewToDynamicGridBottom", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (!c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addEcsViewToDynamicGridBottom", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.naf);
        layoutParams.setMargins(i17, i65.a.b(parent.getContext(), 4), i17, 0);
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View d17 = d(this, context, false, 2, null);
        f249447c.f(d17, 1, this.f249448a);
        parent.addView(d17, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addEcsViewToDynamicGridBottom", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDraftKey", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        r45.lh0 lh0Var = this.f249448a;
        java.lang.String str = lh0Var != null ? lh0Var.f461008f : null;
        if (str == null) {
            str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDraftKey", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        return str;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        boolean z17 = this.f249448a != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        return z17;
    }
}
