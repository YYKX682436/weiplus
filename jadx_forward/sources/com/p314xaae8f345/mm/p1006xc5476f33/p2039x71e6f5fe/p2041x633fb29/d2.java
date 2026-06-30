package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f240399a;

    /* renamed from: b, reason: collision with root package name */
    public final long f240400b;

    /* renamed from: c, reason: collision with root package name */
    public long f240401c;

    /* renamed from: d, reason: collision with root package name */
    public long f240402d;

    /* renamed from: e, reason: collision with root package name */
    public long f240403e;

    /* renamed from: f, reason: collision with root package name */
    public long f240404f;

    /* renamed from: g, reason: collision with root package name */
    public long f240405g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240406h;

    public d2(java.util.List codeResultList, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codeResultList, "codeResultList");
        this.f240399a = codeResultList;
        this.f240400b = j17;
    }

    /* renamed from: equals */
    public boolean m68632xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f240399a, d2Var.f240399a) && this.f240400b == d2Var.f240400b;
    }

    /* renamed from: hashCode */
    public int m68633x8cdac1b() {
        return (this.f240399a.hashCode() * 31) + java.lang.Long.hashCode(this.f240400b);
    }

    /* renamed from: toString */
    public java.lang.String m68634x9616526c() {
        return "ScanMultiCodeReportInfo(codeResultList=" + this.f240399a + ", scanCost=" + this.f240400b + ')';
    }
}
