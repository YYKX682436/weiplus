package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes8.dex */
public final class rj0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f209028e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.qj0.E, "FinderVideoState")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f209029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.qj0.E, "FinderVideoState", dm.e5.f318152s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.qj0.E;
        this.f209029d = db6;
    }

    public final void y0(long j17) {
        if (j17 == 0) {
            return;
        }
        p75.n0 n0Var = dm.e5.f318148o;
        p75.m0 i17 = dm.e5.f318151r.i(java.lang.Long.valueOf(j17));
        p75.n0 n0Var2 = dm.e5.f318148o;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        java.lang.String b17 = i17.b();
        java.lang.String[] e17 = i17.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 k0Var = this.f209029d;
        if (k0Var != null) {
            k0Var.mo70514xb06685ab(table, b17, e17);
        }
    }
}
