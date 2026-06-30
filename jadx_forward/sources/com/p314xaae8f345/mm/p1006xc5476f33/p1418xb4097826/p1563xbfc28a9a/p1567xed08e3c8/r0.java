package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 f202806d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1) {
        this.f202806d = c14469x166b17d1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!(iVar instanceof bq.v) || !(fVar instanceof r45.nr0)) {
            return null;
        }
        boolean z17 = true;
        if (i17 == 0 && i18 == 0 && ((r45.nr0) fVar).f463146f == 0) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.p0(i17, i18, str);
        java.util.LinkedList<r45.t50> collection_feed_list = ((r45.nr0) fVar).f463144d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(collection_feed_list, "collection_feed_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection_feed_list, 10));
        for (r45.t50 t50Var : collection_feed_list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t50Var);
            arrayList.add(new jo2.a(t50Var, false, this.f202806d.f202694e));
        }
        p0Var.m56420x2a5f836b(kz5.n0.V0(arrayList));
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf7 = p0Var.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        p0Var.m56423xd4b4a5a1(((bq.v) iVar).f105067o);
        p0Var.m56421x73095078(p0Var.getLastBuffer());
        p0Var.m56419xdac5ee4d(z17);
        return p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1 = this.f202806d;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1 = this.f202806d;
        return new bq.v(c14469x166b17d1.m56354xfe9224be(), c14469x166b17d1.f202694e, c14469x166b17d1.f202693d, c14469x166b17d1.f202696g, c14469x166b17d1.m56357x44e5026c(), 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1 c14469x166b17d1 = this.f202806d;
        return new bq.v(c14469x166b17d1.m56354xfe9224be(), c14469x166b17d1.f202694e, c14469x166b17d1.f202693d, c14469x166b17d1.f202696g, c14469x166b17d1.m56357x44e5026c(), 0);
    }
}
