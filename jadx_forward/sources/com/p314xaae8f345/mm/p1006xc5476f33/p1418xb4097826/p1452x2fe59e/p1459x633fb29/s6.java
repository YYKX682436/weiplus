package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class s6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13905xbf66d480 f189865d;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13905xbf66d480 c13905xbf66d480) {
        this.f189865d = c13905xbf66d480;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6 t6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13905xbf66d480 c13905xbf66d480 = this.f189865d;
        t6Var.m56420x2a5f836b(c13905xbf66d480.f189129f);
        t6Var.m56421x73095078(c13905xbf66d480.f189130g);
        return t6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!(iVar instanceof bq.d1) || !(fVar instanceof r45.ak2)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6 t6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6(i17, i18, str);
        r45.ak2 ak2Var = (r45.ak2) fVar;
        t6Var.m56421x73095078(ak2Var.m75934xbce7f2f(3));
        java.util.LinkedList<r45.qj2> m75941xfb821914 = ak2Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getDrama_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.qj2 qj2Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qj2Var);
            arrayList.add(new zb2.a(qj2Var));
        }
        t6Var.m56420x2a5f836b(arrayList);
        t6Var.m56419xdac5ee4d(ak2Var.m75933x41a8a7f2(2));
        t6Var.m56423xd4b4a5a1(((bq.d1) iVar).f105015o);
        return t6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13905xbf66d480 c13905xbf66d480 = this.f189865d;
        return new bq.d1(c13905xbf66d480.m56354xfe9224be(), c13905xbf66d480.f189127d, 2, c13905xbf66d480.m56357x44e5026c());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13905xbf66d480 c13905xbf66d480 = this.f189865d;
        return new bq.d1(c13905xbf66d480.m56354xfe9224be(), c13905xbf66d480.f189127d, 0, null);
    }
}
