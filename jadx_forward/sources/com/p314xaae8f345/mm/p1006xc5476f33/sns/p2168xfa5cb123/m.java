package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public int f246431b;

    /* renamed from: d, reason: collision with root package name */
    public int f246433d;

    /* renamed from: e, reason: collision with root package name */
    public int f246434e;

    /* renamed from: f, reason: collision with root package name */
    public int f246435f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f246436g;

    /* renamed from: i, reason: collision with root package name */
    public int f246438i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f246430a = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f246432c = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f246437h = "";

    public final void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickLike", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f246438i));
        lVarArr[1] = new jz5.l("associate_username", this.f246437h);
        lVarArr[2] = new jz5.l("sns_feed_id", this.f246432c);
        lVarArr[3] = new jz5.l("like_result", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[4] = new jz5.l("snsalbumsid", this.f246430a);
        lVarArr[5] = new jz5.l("is_pin_feed", java.lang.Integer.valueOf(this.f246434e));
        lVarArr[6] = new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f246431b));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        java.util.Objects.toString(ri.l0.a(i17));
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.t("sns_feed_like", i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickLike", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
    }

    public final int b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parserVisibleRange", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        int i17 = 1;
        if ((c17933xe8d1b226.m70362xf8db520e() & 1) != 0) {
            i17 = 2;
        } else {
            ca4.e1 e1Var = ca4.f1.f121430a;
            if (e1Var.e(c19806x4c372b7)) {
                i17 = 3;
            } else if (e1Var.c(c19806x4c372b7)) {
                i17 = 4;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parserVisibleRange", "com.tencent.mm.plugin.sns.statistics.SnsDetailReporter");
        return i17;
    }
}
