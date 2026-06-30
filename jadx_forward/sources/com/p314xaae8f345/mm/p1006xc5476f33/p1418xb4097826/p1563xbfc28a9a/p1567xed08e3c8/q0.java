package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 f202804d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1) {
        this.f202804d = c14469x166b17d1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!(iVar instanceof bq.a1) || !(fVar instanceof r45.d51)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.d51) fVar).m75939xb282bd08(3) == 0) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.p0(i17, i18, str);
        r45.d51 d51Var = (r45.d51) fVar;
        java.util.LinkedList<r45.vx0> m75941xfb821914 = d51Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCollection_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.vx0 vx0Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vx0Var);
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e(vx0Var));
        }
        p0Var.m56420x2a5f836b(kz5.n0.V0(arrayList));
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf7 = p0Var.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        p0Var.m56423xd4b4a5a1(((bq.a1) iVar).f105008o);
        p0Var.m56421x73095078(d51Var.m75934xbce7f2f(4));
        p0Var.m56419xdac5ee4d(z17);
        return p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1 = this.f202804d;
        if (!(c14469x166b17d1.m56357x44e5026c() != null)) {
            super.mo56023xb639f2ea(callback);
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m56357x44e5026c = c14469x166b17d1.m56357x44e5026c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa(0, 0, "");
        c13924x37151faa.m56421x73095078(m56357x44e5026c);
        c13924x37151faa.m56420x2a5f836b(null);
        c13924x37151faa.m56423xd4b4a5a1(1000);
        callback.mo55587xb461ee3d(c13924x37151faa);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1 = this.f202804d;
        return new bq.a1(c14469x166b17d1.f202694e, c14469x166b17d1.m56357x44e5026c(), c14469x166b17d1.m56354xfe9224be(), 0, 1, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1 = this.f202804d;
        return new bq.a1(c14469x166b17d1.f202694e, c14469x166b17d1.m56357x44e5026c(), c14469x166b17d1.m56354xfe9224be(), 0, 1, 0);
    }
}
