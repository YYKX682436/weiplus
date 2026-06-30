package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ei implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f249774d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f249775e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f249776f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.e86 f249777g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 f249778h;

    /* renamed from: i, reason: collision with root package name */
    public final int f249779i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 f249780m;

    public ei(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, java.lang.String snsId, r45.e86 commentInfo, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 galleryTitleM, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentInfo, "commentInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryTitleM, "galleryTitleM");
        this.f249774d = context;
        this.f249775e = snsInfo;
        this.f249776f = snsId;
        this.f249777g = commentInfo;
        this.f249778h = galleryTitleM;
        this.f249779i = i17;
    }

    public final r45.e86 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return this.f249777g;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return this.f249775e;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c() {
        java.util.List<r45.m33> list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        if (this.f249780m == null) {
            r45.e86 e86Var = this.f249777g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFlipItems", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252784d;
                java.util.LinkedList SnsCommentImageInfo = e86Var.A;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SnsCommentImageInfo, "SnsCommentImageInfo");
                java.lang.Object X = kz5.n0.X(SnsCommentImageInfo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X, "first(...)");
                r45.jj4 s17 = q2Var.s((r45.d86) X);
                r45.m33 m33Var = new r45.m33();
                m33Var.f461642d = s17;
                m33Var.f461643e = this.f249776f;
                m33Var.f461644f = 0;
                m33Var.f461645g = 0;
                list = kz5.b0.c(m33Var);
            } catch (java.lang.Exception unused) {
                list = kz5.p0.f395529d;
            }
            java.util.List<r45.m33> list2 = list;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlipItems", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3(this.f249774d);
            c18064xe6e1a3b3.m70774xdfe95330(true);
            c18064xe6e1a3b3.m70583x9f17ba6(true);
            c18064xe6e1a3b3.m70781x8fe1d3cf(false);
            c18064xe6e1a3b3.m70785xbe0666f0(true);
            c18064xe6e1a3b3.m70775x7065439f(false);
            c18064xe6e1a3b3.setClickable(true);
            c18064xe6e1a3b3.D = 8;
            c18064xe6e1a3b3.m70776x5329a87e(list2);
            if (!list2.isEmpty()) {
                c18064xe6e1a3b3.X(list2, e86Var.f454659d, 0, null, this.f249778h);
            }
            if (this.f249775e.m70377x3172ed()) {
                c18064xe6e1a3b3.m70773x764ba26f(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            this.f249780m = c18064xe6e1a3b3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = this.f249780m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c18064xe6e1a3b32, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return c18064xe6e1a3b32;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f249780m;
        if (c18064xe6e1a3b3 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18064xe6e1a3b3);
            c18064xe6e1a3b3.f0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = this.f249780m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18064xe6e1a3b32);
            c18064xe6e1a3b32.h0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b33 = this.f249780m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18064xe6e1a3b33);
            c18064xe6e1a3b33.Z();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b34 = this.f249780m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18064xe6e1a3b34);
            c18064xe6e1a3b34.Y();
        }
        this.f249780m = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        boolean m70377x3172ed = this.f249775e.m70377x3172ed();
        r45.e86 e86Var = this.f249777g;
        if (m70377x3172ed) {
            long j17 = e86Var.f454670r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            return j17;
        }
        long j18 = e86Var.f454665m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return j18;
    }

    @Override // in5.c
    public int h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemType", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        int i17 = this.f249777g.f454662g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemType", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return i17;
    }
}
