package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public long f244462a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f244463b;

    /* renamed from: c, reason: collision with root package name */
    public int f244464c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f244465d;

    public r1(long j17, java.lang.String finderJumpId, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 1) != 0 ? 0L : j17;
        finderJumpId = (i18 & 2) != 0 ? "" : finderJumpId;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        z17 = (i18 & 8) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderJumpId, "finderJumpId");
        this.f244462a = j17;
        this.f244463b = finderJumpId;
        this.f244464c = i17;
        this.f244465d = z17;
    }

    /* renamed from: equals */
    public boolean m69382xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.r1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.r1) obj;
        if (this.f244462a != r1Var.f244462a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f244463b, r1Var.f244463b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        if (this.f244464c != r1Var.f244464c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
            return false;
        }
        boolean z17 = this.f244465d;
        boolean z18 = r1Var.f244465d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m69383x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        int hashCode = (((((java.lang.Long.hashCode(this.f244462a) * 31) + this.f244463b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f244464c)) * 31) + java.lang.Boolean.hashCode(this.f244465d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m69384x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        java.lang.String str = "FinderConfig(finderFeedId=" + this.f244462a + ", finderJumpId=" + this.f244463b + ", finderCommentScene=" + this.f244464c + ", isFinderEnableBulletComment=" + this.f244465d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$FinderConfig");
        return str;
    }
}
