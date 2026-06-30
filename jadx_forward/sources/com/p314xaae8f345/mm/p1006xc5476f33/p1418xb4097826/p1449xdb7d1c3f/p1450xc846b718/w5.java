package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vs2 f187495a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187496b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f187497c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f187498d;

    /* renamed from: e, reason: collision with root package name */
    public final long f187499e;

    public w5(r45.vs2 vs2Var, java.lang.String entrancePath, java.lang.String reportExtInfo, java.lang.Boolean bool, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrancePath, "entrancePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtInfo, "reportExtInfo");
        this.f187495a = vs2Var;
        this.f187496b = entrancePath;
        this.f187497c = reportExtInfo;
        this.f187498d = bool;
        this.f187499e = j17;
    }

    /* renamed from: equals */
    public boolean m55971xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w5 w5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187495a, w5Var.f187495a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187496b, w5Var.f187496b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187497c, w5Var.f187497c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187498d, w5Var.f187498d) && this.f187499e == w5Var.f187499e;
    }

    /* renamed from: hashCode */
    public int m55972x8cdac1b() {
        r45.vs2 vs2Var = this.f187495a;
        int hashCode = (((((vs2Var == null ? 0 : vs2Var.hashCode()) * 31) + this.f187496b.hashCode()) * 31) + this.f187497c.hashCode()) * 31;
        java.lang.Boolean bool = this.f187498d;
        return ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f187499e);
    }

    /* renamed from: toString */
    public java.lang.String m55973x9616526c() {
        return "ReportInfo(ctrlInfo=" + this.f187495a + ", entrancePath=" + this.f187496b + ", reportExtInfo=" + this.f187497c + ", is_exempt_nm_control=" + this.f187498d + ", feedId=" + this.f187499e + ')';
    }
}
