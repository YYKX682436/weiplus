package ot2;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 f430389d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0) {
        this.f430389d = c14957x1a4885f0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        ot2.a aVar = new ot2.a(i17, i18, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.f430389d;
        aVar.m56421x73095078(c14957x1a4885f0.m56357x44e5026c());
        if ((fVar instanceof r45.du2) && i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.du2 du2Var = (r45.du2) fVar;
            java.util.LinkedList<r45.e21> m75941xfb821914 = du2Var.m75941xfb821914(2);
            if (m75941xfb821914 != null) {
                for (r45.e21 e21Var : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e21Var);
                    arrayList.add(new so2.x(e21Var));
                }
            }
            aVar.m56420x2a5f836b(arrayList);
            aVar.m56421x73095078(du2Var.m75934xbce7f2f(1));
            aVar.m56419xdac5ee4d(du2Var.m75939xb282bd08(3) == 1);
            c14957x1a4885f0.f207210e = du2Var.m75939xb282bd08(3);
            db2.w2 w2Var = iVar instanceof db2.w2 ? (db2.w2) iVar : null;
            aVar.m56423xd4b4a5a1(w2Var != null ? w2Var.f309747u : 0);
        }
        return aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.f430389d;
        db2.w2 w2Var = new db2.w2("", "", c14957x1a4885f0.f207209d, c14957x1a4885f0.m56357x44e5026c(), c14957x1a4885f0.f207213h, c14957x1a4885f0.f207212g);
        w2Var.f309747u = 2;
        return w2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.f430389d;
        db2.w2 w2Var = new db2.w2("", "", c14957x1a4885f0.f207209d, null, c14957x1a4885f0.f207213h, c14957x1a4885f0.f207212g);
        w2Var.f309747u = 4;
        return w2Var;
    }
}
