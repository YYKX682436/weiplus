package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 f161262c;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var) {
        this.f161260a = yVar;
        this.f161261b = i17;
        this.f161262c = w2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.j14 j14Var;
        r45.l24 l24Var = (r45.l24) obj;
        java.lang.Integer valueOf = (l24Var == null || (j14Var = l24Var.f460619d) == null) ? null : java.lang.Integer.valueOf(j14Var.f459024d);
        if (valueOf == null || valueOf.intValue() != -12000) {
            return new jz5.o(l24Var != null ? l24Var.f460619d : null, l24Var != null ? l24Var.f460620e : null, "/cgi-bin/mmbiz-bin/js-login");
        }
        km5.b c17 = km5.u.c();
        java.util.LinkedList linkedList = l24Var.f460621f;
        if (linkedList == null || linkedList.isEmpty()) {
            this.f161260a.a(this.f161261b, this.f161262c.o("fail:internal error scope empty"));
            return null;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r2(this.f161260a, c17, this.f161262c, l24Var, this.f161261b));
        return null;
    }
}
