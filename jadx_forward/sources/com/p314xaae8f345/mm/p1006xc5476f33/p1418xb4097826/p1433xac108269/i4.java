package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f183784a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f183785b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f183786c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f183787d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183788e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f183789f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f183790g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f183791h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f183792i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f183793j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f183794k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f183795l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f183796m;

    public i4(boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String forwardTip, java.lang.String snsTip, java.lang.String favTip, java.lang.String forwardWeWorkTip, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardTip, "forwardTip");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsTip, "snsTip");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favTip, "favTip");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardWeWorkTip, "forwardWeWorkTip");
        this.f183784a = z17;
        this.f183785b = z18;
        this.f183786c = z19;
        this.f183787d = z27;
        this.f183788e = forwardTip;
        this.f183789f = snsTip;
        this.f183790g = favTip;
        this.f183791h = forwardWeWorkTip;
        this.f183792i = z28;
        this.f183793j = z29;
        this.f183794k = z37;
        this.f183795l = z38;
        this.f183796m = z39;
    }

    /* renamed from: equals */
    public boolean m55495xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4 i4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4) obj;
        return this.f183784a == i4Var.f183784a && this.f183785b == i4Var.f183785b && this.f183786c == i4Var.f183786c && this.f183787d == i4Var.f183787d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183788e, i4Var.f183788e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183789f, i4Var.f183789f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183790g, i4Var.f183790g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183791h, i4Var.f183791h) && this.f183792i == i4Var.f183792i && this.f183793j == i4Var.f183793j && this.f183794k == i4Var.f183794k && this.f183795l == i4Var.f183795l && this.f183796m == i4Var.f183796m;
    }

    /* renamed from: hashCode */
    public int m55496x8cdac1b() {
        return (((((((((((((((((((((((java.lang.Boolean.hashCode(this.f183784a) * 31) + java.lang.Boolean.hashCode(this.f183785b)) * 31) + java.lang.Boolean.hashCode(this.f183786c)) * 31) + java.lang.Boolean.hashCode(this.f183787d)) * 31) + this.f183788e.hashCode()) * 31) + this.f183789f.hashCode()) * 31) + this.f183790g.hashCode()) * 31) + this.f183791h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f183792i)) * 31) + java.lang.Boolean.hashCode(this.f183793j)) * 31) + java.lang.Boolean.hashCode(this.f183794k)) * 31) + java.lang.Boolean.hashCode(this.f183795l)) * 31) + java.lang.Boolean.hashCode(this.f183796m);
    }

    /* renamed from: toString */
    public java.lang.String m55497x9616526c() {
        return "ActionMenuInfo(forwardDisable=" + this.f183784a + ", snsDisable=" + this.f183785b + ", favDisable=" + this.f183786c + ", forwardWeWorkDisable=" + this.f183787d + ", forwardTip=" + this.f183788e + ", snsTip=" + this.f183789f + ", favTip=" + this.f183790g + ", forwardWeWorkTip=" + this.f183791h + ", hideForward=" + this.f183792i + ", hideSns=" + this.f183793j + ", hideGlobalFav=" + this.f183794k + ", hideForwardWeWork=" + this.f183795l + ", disableGlobalFav=" + this.f183796m + ')';
    }
}
