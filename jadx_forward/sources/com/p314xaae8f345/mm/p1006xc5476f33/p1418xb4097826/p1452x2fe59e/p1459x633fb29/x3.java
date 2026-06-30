package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class x3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703 f189981d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703 c13871x2b246703) {
        this.f189981d = c13871x2b246703;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703 c13871x2b246703 = this.f189981d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y3 y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y3(c13871x2b246703, i17, i18, str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (fVar instanceof r45.tu1) {
            r45.tu1 tu1Var = (r45.tu1) fVar;
            java.util.LinkedList<r45.s72> m75941xfb821914 = tu1Var.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                for (r45.s72 s72Var : m75941xfb821914) {
                    arrayList.add(new so2.s2(s72Var.m75939xb282bd08(0), (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) s72Var.m75936x14adae67(1), (r45.h32) s72Var.m75936x14adae67(2), (r45.c32) s72Var.m75936x14adae67(3)));
                }
            }
            y3Var.m56420x2a5f836b(arrayList);
            y3Var.m56421x73095078(c13871x2b246703.m56357x44e5026c());
            y3Var.m56419xdac5ee4d(tu1Var.m75933x41a8a7f2(3));
        }
        return y3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        return new ke2.h0(this.f189981d.m56357x44e5026c());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        return new ke2.h0(this.f189981d.m56357x44e5026c());
    }
}
