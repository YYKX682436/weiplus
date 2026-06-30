package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1 f161281f;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1 v1Var) {
        this.f161279d = yVar;
        this.f161280e = i17;
        this.f161281f = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161279d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5(yVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.t1(yVar, this.f161280e, this.f161281f));
        rt1.p1 p1Var = new rt1.p1(qt1.g.f448057e);
        j5Var.f161136d = p1Var;
        p1Var.f481006b = j5Var;
        p1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e(null, false, null, false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = j5Var.f161133a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7029xb9e95492 c7029xb9e95492 = j5Var.f161140h;
        c7029xb9e95492.f143449d = c7029xb9e95492.b("AppId", yVar2.mo48798x74292566(), true);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(yVar2.mo48798x74292566(), true) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7029xb9e95492 c7029xb9e954922 = j5Var.f161140h;
            c7029xb9e954922.f143450e = r2.f169672i;
            c7029xb9e954922.f143451f = r2.f169669f;
            c7029xb9e954922.f143452g = r2.f169670g;
        }
        rt1.z0 z0Var = j5Var.f161136d;
        if (z0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPresenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e b17 = ((rt1.p1) z0Var).b();
        b17.f176158f = yVar2.mo48798x74292566();
        b17.f176159g = yVar2.t3().S0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1.f33870x24728b);
        yVar2.t3().N.a(j5Var.f161142j);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = yVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar2 : null;
        if (v5Var != null) {
            v5Var.w(j5Var.f161142j);
        }
        yVar2.t3().I.add(j5Var);
    }
}
