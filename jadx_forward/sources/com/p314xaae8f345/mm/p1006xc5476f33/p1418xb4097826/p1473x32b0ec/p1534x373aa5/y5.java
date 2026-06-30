package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f198353a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f198354b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f198355c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198356d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f198357e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f198358f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f198359g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f198360h;

    public y5(yz5.a aVar, yz5.a aVar2, yz5.l lVar, java.lang.String str, qo0.c cVar, boolean z17, boolean z18, java.lang.String str2) {
        this.f198353a = aVar;
        this.f198354b = aVar2;
        this.f198355c = lVar;
        this.f198356d = str;
        this.f198357e = cVar;
        this.f198358f = z17;
        this.f198359g = z18;
        this.f198360h = str2;
    }

    /* renamed from: equals */
    public boolean m57830xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y5 y5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198353a, y5Var.f198353a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198354b, y5Var.f198354b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198355c, y5Var.f198355c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198356d, y5Var.f198356d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198357e, y5Var.f198357e) && this.f198358f == y5Var.f198358f && this.f198359g == y5Var.f198359g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f198360h, y5Var.f198360h);
    }

    /* renamed from: hashCode */
    public int m57831x8cdac1b() {
        yz5.a aVar = this.f198353a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        yz5.a aVar2 = this.f198354b;
        int hashCode2 = (hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        yz5.l lVar = this.f198355c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.lang.String str = this.f198356d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        qo0.c cVar = this.f198357e;
        int hashCode5 = (((((hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f198358f)) * 31) + java.lang.Boolean.hashCode(this.f198359g)) * 31;
        java.lang.String str2 = this.f198360h;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m57832x9616526c() {
        return "FinderLiveLikeContainerData(postLikeCallback=" + this.f198353a + ", postHighLightLikeCallback=" + this.f198354b + ", layoutCallback=" + this.f198355c + ", sessionId=" + this.f198356d + ", statusMonitor=" + this.f198357e + ", shouldHandleTouch=" + this.f198358f + ", isDisableLikeHeadIcon=" + this.f198359g + ", headUrl=" + this.f198360h + ')';
    }
}
