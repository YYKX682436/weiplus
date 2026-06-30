package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class fv {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys f184956a;

    /* renamed from: b, reason: collision with root package name */
    public long f184957b;

    /* renamed from: c, reason: collision with root package name */
    public long f184958c;

    /* renamed from: d, reason: collision with root package name */
    public int f184959d;

    public fv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, long j17, long j18, long j19, int i17) {
        this.f184956a = ysVar;
        this.f184957b = j17;
        this.f184958c = j19;
        this.f184959d = i17;
    }

    /* renamed from: equals */
    public boolean m55672xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv fvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f184956a, fvVar.f184956a) && this.f184957b == fvVar.f184957b && this.f184958c == fvVar.f184958c && this.f184959d == fvVar.f184959d;
    }

    /* renamed from: hashCode */
    public int m55673x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = this.f184956a;
        return ((((((((ysVar == null ? 0 : ysVar.hashCode()) * 31) + java.lang.Long.hashCode(this.f184957b)) * 31) + java.lang.Long.hashCode(0L)) * 31) + java.lang.Long.hashCode(this.f184958c)) * 31) + java.lang.Integer.hashCode(this.f184959d);
    }

    /* renamed from: toString */
    public java.lang.String m55674x9616526c() {
        return "ExposeItem(item=" + this.f184956a + ", feedId=" + this.f184957b + ", sumTimeMs=0, startTimeMs=" + this.f184958c + ", position=" + this.f184959d + ')';
    }
}
