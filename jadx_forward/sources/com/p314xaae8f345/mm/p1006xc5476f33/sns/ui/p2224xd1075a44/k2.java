package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252715a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.e86 f252716b;

    public k2(java.lang.String snsId, r45.e86 comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        this.f252715a = snsId;
        this.f252716b = comment;
    }

    /* renamed from: equals */
    public boolean m71324xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.k2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.k2) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f252715a, k2Var.f252715a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f252716b, k2Var.f252716b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        return b17;
    }

    /* renamed from: hashCode */
    public int m71325x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        int hashCode = (this.f252715a.hashCode() * 31) + this.f252716b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m71326x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        java.lang.String str = "SnsCommentMediaLoadItem(snsId=" + this.f252715a + ", comment=" + this.f252716b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
        return str;
    }
}
