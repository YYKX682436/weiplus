package ab2;

/* loaded from: classes2.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f f84333d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f) {
        this.f84333d = c13681xd53f292f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "fetchInit initCount ");
        ab2.a0 a0Var = new ab2.a0(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f = this.f84333d;
        if (c13681xd53f292f.f184302e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13681xd53f292f.m56353x743e55cc();
            a0Var.m56420x2a5f836b(m56353x743e55cc != null ? m56353x743e55cc.f189833a : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13681xd53f292f.m56353x743e55cc();
            a0Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        } else {
            bu2.d0 d0Var = bu2.e0.f106031a;
            c13681xd53f292f.getClass();
            a0Var.m56420x2a5f836b(d0Var.h(21, c13681xd53f292f.f184301d));
        }
        return a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.ArrayList arrayList = null;
        if (!(iVar instanceof bq.z1)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0) ? ((bq.z1) iVar).f105081z : true;
        ab2.a0 a0Var = new ab2.a0(i17, i18, str);
        bq.z1 z1Var = (bq.z1) iVar;
        java.util.List list = z1Var.f105080y;
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
            }
        }
        a0Var.m56420x2a5f836b(arrayList);
        a0Var.m56423xd4b4a5a1(z1Var.B);
        a0Var.m56419xdac5ee4d(z17);
        a0Var.m56421x73095078(z1Var.E());
        if (z1Var.B == 1) {
            int i19 = z1Var.H;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f = this.f84333d;
            c13681xd53f292f.f184308n = i19;
            c13681xd53f292f.f184307m = z1Var.G;
        }
        return a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f = this.f84333d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 d17 = c13681xd53f292f.d();
        return new bq.z1("", d17 != null ? d17.mo2128x1ed62e84() : 0L, c13681xd53f292f.m56357x44e5026c(), 2, c13681xd53f292f.m56354xfe9224be(), 0, 0L, false, c13681xd53f292f.f184301d, c13681xd53f292f.f184304g, null, null, null, c13681xd53f292f.f184303f, false, null, false, null, null, d17 != null ? d17.w() : null, 515296, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13681xd53f292f c13681xd53f292f = this.f84333d;
        return new bq.z1("", 0L, null, 1, c13681xd53f292f.m56354xfe9224be(), 0, 0L, false, c13681xd53f292f.f184301d, c13681xd53f292f.f184304g, null, null, null, c13681xd53f292f.f184303f, false, null, false, null, null, null, 1039584, null);
    }
}
