package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f207451a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f207452b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f207453c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f207454d;

    public v0(long j17, java.lang.String query, java.lang.String requestId, java.lang.String hotWordId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hotWordId, "hotWordId");
        this.f207451a = j17;
        this.f207452b = query;
        this.f207453c = requestId;
        this.f207454d = hotWordId;
    }

    /* renamed from: equals */
    public boolean m58962xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v0) obj;
        return this.f207451a == v0Var.f207451a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207452b, v0Var.f207452b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207453c, v0Var.f207453c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207454d, v0Var.f207454d);
    }

    /* renamed from: hashCode */
    public int m58963x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f207451a) * 31) + this.f207452b.hashCode()) * 31) + this.f207453c.hashCode()) * 31) + this.f207454d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58964x9616526c() {
        return "ReportData(id=" + this.f207451a + ", query=" + this.f207452b + ", requestId=" + this.f207453c + ", hotWordId=" + this.f207454d + ')';
    }
}
