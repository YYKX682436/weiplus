package bo2;

/* loaded from: classes2.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c f104555d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c c14445x62c29b8c) {
        this.f104555d = c14445x62c29b8c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        bo2.d dVar = new bo2.d(this.f104555d, i17, i18, str);
        if ((fVar instanceof r45.m03) && i17 == 0 && i18 == 0) {
            r45.m03 m03Var = (r45.m03) fVar;
            dVar.f104554a = m03Var;
            dVar.m56421x73095078(m03Var.m75934xbce7f2f(2));
            dVar.m56419xdac5ee4d(m03Var.m75939xb282bd08(3) == 1);
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = m03Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                arrayList.add(cu2.u.f303974a.o(h90Var.a(c19792x256d2725, 2097152), 11003));
            }
            dVar.m56420x2a5f836b(arrayList);
            o45.zg mo47979x2d63726f = (iVar == null || (oVar = iVar.f152179f) == null) ? null : oVar.mo47979x2d63726f();
            com.p314xaae8f345.mm.p944x882e457a.m mVar = mo47979x2d63726f instanceof com.p314xaae8f345.mm.p944x882e457a.m ? (com.p314xaae8f345.mm.p944x882e457a.m) mo47979x2d63726f : null;
            java.lang.Object obj = mVar != null ? mVar.f152217a : null;
            r45.l03 l03Var = obj instanceof r45.l03 ? (r45.l03) obj : null;
            dVar.m56423xd4b4a5a1(l03Var != null ? l03Var.m75939xb282bd08(5) : 0);
            dVar.m56425xf28d7bcd(iVar);
        }
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        vn2.k kVar = vn2.l.f519848a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c c14445x62c29b8c = this.f104555d;
        return vn2.k.d(kVar, null, c14445x62c29b8c.m56354xfe9224be(), c14445x62c29b8c.m56357x44e5026c(), 24, kVar.a(2), null, 32, null).d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        vn2.k kVar = vn2.l.f519848a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c c14445x62c29b8c = this.f104555d;
        return vn2.k.d(kVar, null, c14445x62c29b8c.m56354xfe9224be(), c14445x62c29b8c.m56357x44e5026c(), 24, kVar.a(1), null, 32, null).d();
    }
}
