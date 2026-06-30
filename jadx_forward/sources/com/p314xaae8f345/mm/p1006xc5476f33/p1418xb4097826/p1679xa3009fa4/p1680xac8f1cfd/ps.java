package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ps {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f217128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f217129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f217130c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f217131d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f217132e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f217133f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f217134g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f217135h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f217136i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f217137j;

    public ps(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, boolean z47) {
        this.f217128a = z17;
        this.f217129b = z18;
        this.f217130c = z19;
        this.f217131d = z27;
        this.f217132e = z28;
        this.f217133f = z29;
        this.f217134g = z37;
        this.f217135h = z38;
        this.f217136i = z39;
        this.f217137j = z47;
    }

    public final boolean a(boolean z17, boolean z18) {
        return (z17 || this.f217128a || this.f217129b || this.f217133f || this.f217130c || this.f217131d || this.f217132e || this.f217134g || this.f217135h || this.f217136i || this.f217137j || z18) ? false : true;
    }

    /* renamed from: equals */
    public boolean m63223xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ps)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ps psVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ps) obj;
        return this.f217128a == psVar.f217128a && this.f217129b == psVar.f217129b && this.f217130c == psVar.f217130c && this.f217131d == psVar.f217131d && this.f217132e == psVar.f217132e && this.f217133f == psVar.f217133f && this.f217134g == psVar.f217134g && this.f217135h == psVar.f217135h && this.f217136i == psVar.f217136i && this.f217137j == psVar.f217137j;
    }

    /* renamed from: hashCode */
    public int m63224x8cdac1b() {
        return (((((((((((((((((java.lang.Boolean.hashCode(this.f217128a) * 31) + java.lang.Boolean.hashCode(this.f217129b)) * 31) + java.lang.Boolean.hashCode(this.f217130c)) * 31) + java.lang.Boolean.hashCode(this.f217131d)) * 31) + java.lang.Boolean.hashCode(this.f217132e)) * 31) + java.lang.Boolean.hashCode(this.f217133f)) * 31) + java.lang.Boolean.hashCode(this.f217134g)) * 31) + java.lang.Boolean.hashCode(this.f217135h)) * 31) + java.lang.Boolean.hashCode(this.f217136i)) * 31) + java.lang.Boolean.hashCode(this.f217137j);
    }

    /* renamed from: toString */
    public java.lang.String m63225x9616526c() {
        return "UIStateCheckResult(isDrawerOpen=" + this.f217128a + ", isLikeDrawerOpen=" + this.f217129b + ", isAllLikeDrawerOpen=" + this.f217130c + ", isProfileDrawerOpen=" + this.f217131d + ", isBizProfileDrawerOpen=" + this.f217132e + ", isShowBulletInputUI=" + this.f217133f + ", isLongVideoEndLayoutShown=" + this.f217134g + ", isRecommendDrawerShown=" + this.f217135h + ", isProjectionPanelShown=" + this.f217136i + ", isInScaleMode=" + this.f217137j + ')';
    }
}
