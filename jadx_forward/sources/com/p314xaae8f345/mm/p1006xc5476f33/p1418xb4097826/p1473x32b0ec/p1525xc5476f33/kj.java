package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kj {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f194789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f194790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f194791c;

    /* renamed from: d, reason: collision with root package name */
    public final long f194792d;

    /* renamed from: e, reason: collision with root package name */
    public final int f194793e;

    /* renamed from: f, reason: collision with root package name */
    public final int f194794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f194795g;

    public kj(java.lang.String tabName, int i17, int i18, long j17, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        this.f194789a = tabName;
        this.f194790b = i17;
        this.f194791c = i18;
        this.f194792d = j17;
        this.f194793e = i19;
        this.f194794f = i27;
        this.f194795g = i28;
    }

    /* renamed from: equals */
    public boolean m56999xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kj kjVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kj) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f194789a, kjVar.f194789a) && this.f194790b == kjVar.f194790b && this.f194791c == kjVar.f194791c && this.f194792d == kjVar.f194792d && this.f194793e == kjVar.f194793e && this.f194794f == kjVar.f194794f && this.f194795g == kjVar.f194795g;
    }

    /* renamed from: hashCode */
    public int m57000x8cdac1b() {
        return (((((((((((this.f194789a.hashCode() * 31) + java.lang.Integer.hashCode(this.f194790b)) * 31) + java.lang.Integer.hashCode(this.f194791c)) * 31) + java.lang.Long.hashCode(this.f194792d)) * 31) + java.lang.Integer.hashCode(this.f194793e)) * 31) + java.lang.Integer.hashCode(this.f194794f)) * 31) + java.lang.Integer.hashCode(this.f194795g);
    }

    /* renamed from: toString */
    public java.lang.String m57001x9616526c() {
        return "LoadMoreReportCtx(tabName=" + this.f194789a + ", groupId=" + this.f194790b + ", pageIndex=" + this.f194791c + ", requestStartMs=" + this.f194792d + ", oldItemCount=" + this.f194793e + ", oldGiftCacheSize=" + this.f194794f + ", lastBufferSize=" + this.f194795g + ')';
    }
}
