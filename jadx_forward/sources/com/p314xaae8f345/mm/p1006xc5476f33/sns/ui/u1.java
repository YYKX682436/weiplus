package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class u1 implements b45.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252086a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f252087b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f252088c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f252089d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.e86 f252090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f252091f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f252092g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f252093h;

    /* renamed from: i, reason: collision with root package name */
    public final int f252094i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f252095j;

    public u1(java.lang.String str, java.lang.String str2, r45.e86 e86Var, java.lang.String str3, java.lang.String str4, android.view.View view, int i17, java.lang.String str5, java.lang.String str6) {
        this.f252086a = "";
        this.f252087b = "";
        this.f252088c = "";
        this.f252089d = "";
        this.f252094i = -1;
        this.f252086a = str;
        this.f252087b = str2;
        this.f252090e = e86Var;
        this.f252089d = str3;
        this.f252088c = str4;
        this.f252092g = view;
        this.f252093h = str5;
        this.f252094i = i17;
        this.f252095j = str6;
    }

    @Override // b45.a
    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMsgId", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        java.lang.String format = java.lang.String.format("%s_%s", this.f252095j, java.lang.Integer.valueOf(this.f252090e.f454665m));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMsgId", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return format;
    }

    @Override // b45.a
    public int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getA8KeySnsItemScene", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return 3;
    }

    public boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.e86 e86Var = this.f252090e;
        int i17 = e86Var.f454665m;
        sb6.append(i17 != 0 ? i17 : e86Var.f454670r);
        sb6.append("");
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.e(this.f252087b, sb6.toString());
        int i18 = this.f252094i;
        int i19 = i18 != 1 ? i18 == 2 ? 4 : -1 : 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f(e17);
        if (f17 == null || !f17.f246180d || f17.f246181e || (f17.f246182f & i19) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslated", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return true;
    }

    @Override // b45.a
    /* renamed from: getUserName */
    public java.lang.String mo9820x6bf53a6c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        r45.e86 e86Var = this.f252090e;
        if (e86Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
            return null;
        }
        java.lang.String str = e86Var.f454659d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserName", "com.tencent.mm.plugin.sns.ui.CommentClickInfo");
        return str;
    }
}
