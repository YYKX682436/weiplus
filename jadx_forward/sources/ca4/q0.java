package ca4;

/* loaded from: classes4.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f121538a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f121539b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f121540c = new java.util.concurrent.ConcurrentHashMap();

    public java.lang.CharSequence a(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f121538a.get(e86Var.f454665m + "-" + e86Var.f454670r + "-" + e86Var.f454663h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        return charSequence;
    }

    public java.lang.String b(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        java.lang.String str = (java.lang.String) this.f121539b.get(e86Var.f454665m + "-" + e86Var.f454670r + "-" + e86Var.f454663h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        return str;
    }

    public java.lang.CharSequence c(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f121540c.get(e86Var.f454665m + "-" + e86Var.f454670r + "-" + e86Var.f454663h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        return charSequence;
    }

    public void d(r45.e86 e86Var, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("put", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        this.f121538a.put(e86Var.f454665m + "-" + e86Var.f454670r + "-" + e86Var.f454663h, charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("put", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }

    public void e(r45.e86 e86Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        this.f121539b.put(e86Var.f454665m + "-" + e86Var.f454670r + "-" + e86Var.f454663h, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putEmojiMd5", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }

    public void f(r45.e86 e86Var, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
        this.f121540c.put(e86Var.f454665m + "-" + e86Var.f454670r + "-" + e86Var.f454663h, charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putShortComment", "com.tencent.mm.plugin.sns.data.SnsCommentData");
    }
}
