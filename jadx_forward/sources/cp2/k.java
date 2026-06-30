package cp2;

/* loaded from: classes2.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 {

    /* renamed from: d, reason: collision with root package name */
    public fp0.t f302362d;

    /* renamed from: e, reason: collision with root package name */
    public cp2.f f302363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302364f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc) {
        this.f302364f = c14500x958689dc;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: alive */
    public void mo56311x58998cd() {
        super.mo56311x58998cd();
        this.f302363e = new cp2.f(this.f302364f.m56354xfe9224be());
        fp0.t tVar = new fp0.t("FinderFollowTlSingleExecutor");
        tVar.e();
        this.f302362d = tVar;
    }

    public final void b(java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        fp0.t tVar = this.f302362d;
        java.lang.String valueOf = java.lang.String.valueOf(tVar != null ? java.lang.Integer.valueOf(tVar.f346819f) : null);
        fp0.t tVar2 = this.f302362d;
        if (tVar2 != null) {
            tVar2.mo129985x6761d4f();
        }
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reset ");
        sb6.append(invokeSource);
        sb6.append(" before toke:");
        sb6.append(valueOf);
        sb6.append(" after toke:");
        fp0.t tVar3 = this.f302362d;
        sb6.append(tVar3 != null ? java.lang.Integer.valueOf(tVar3.f346819f) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        im5.c cVar;
        super.mo56312x2efc64();
        cp2.f fVar = this.f302363e;
        if (fVar != null && (cVar = fVar.f302329h) != null) {
            cVar.mo10668x2efc64();
        }
        cp2.f fVar2 = this.f302363e;
        if (fVar2 != null) {
            fVar2.f302330i = null;
        }
        fp0.t tVar = this.f302362d;
        if (tVar != null) {
            tVar.mo129985x6761d4f();
        }
        this.f302362d = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetch */
    public void mo56275x5cd06ba(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        fp0.t tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!(obj instanceof cp2.l) || (tVar = this.f302362d) == null) {
            return;
        }
        tVar.b(new fp0.r(new cp2.i(this, obj, this.f302364f, callback), null, 2, null));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchInit */
    public void mo56023xb639f2ea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        r45.qt2 m56354xfe9224be;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302364f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.LinkedList<so2.j5> linkedList = new java.util.LinkedList();
        try {
            ey2.x2 O6 = ((ey2.c3) pf5.u.f435469a.e(c61.l7.class).a(ey2.c3.class)).O6(c14500x958689dc.f203004o);
            if (O6.f339102b.isEmpty()) {
                linkedList.addAll(bu2.d0.i(bu2.e0.f106031a, c14500x958689dc.f203005p, null, 2, null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "load init data from FirstPage, size:" + linkedList.size() + ", memoryCacheFlag:" + c14500x958689dc.f203004o + ", fileCacheFlag:" + c14500x958689dc.f203005p);
            } else {
                c14500x958689dc.f203006q = O6.f339107g;
                linkedList.addAll(O6.f339102b);
                if (O6.f339108h) {
                    new db2.x(2, O6.f339107g).l();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "load init data from cache, size:" + linkedList.size() + ", memoryCacheFlag:" + c14500x958689dc.f203004o + ", fileCacheFlag:" + c14500x958689dc.f203005p + " lastBuffer:" + c14500x958689dc.f203006q);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(m56464xb5886c64(), th6, "load init data exception", new java.lang.Object[0]);
        }
        for (so2.j5 j5Var : linkedList) {
            if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && (m56354xfe9224be = c14500x958689dc.m56354xfe9224be()) != null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject(), m56354xfe9224be.m75939xb282bd08(5), null);
            }
        }
        cp2.m mVar = new cp2.m(0, 0, "", null, null, 0, 56, null);
        mVar.m56423xd4b4a5a1(1000);
        mVar.m56420x2a5f836b(linkedList);
        mVar.m56421x73095078(c14500x958689dc.f203006q);
        callback.mo55587xb461ee3d(mVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchLoadMore */
    public void mo56024xaef8a235(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302364f;
        r45.dd2 dd2Var = c14500x958689dc.f203003n;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = c14500x958689dc.f203006q;
        int i17 = c14500x958689dc.f203004o;
        int i18 = c14500x958689dc.f202997e;
        int i19 = c14500x958689dc.f202996d;
        java.lang.String str = c14500x958689dc.f202998f;
        java.lang.String str2 = c14500x958689dc.f202999g;
        yz5.a aVar = c14500x958689dc.f203000h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, new cp2.l(2, dd2Var, gVar, i17, i18, i19, str, 0, 0L, str2, aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : -1, 384, null), callback, false, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: fetchRefresh */
    public void mo56025xae25fec1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 callback) {
        r45.dd2 dd2Var;
        az2.w e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302364f;
        int i17 = c14500x958689dc.f203002m;
        r45.dd2 dd2Var2 = c14500x958689dc.f203003n;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = c14500x958689dc.f203007r;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m56357x44e5026c = (gVar == null || !((c14500x958689dc.f203008s && i17 == 0) || i17 == 16)) ? i17 != 2 ? null : c14500x958689dc.m56357x44e5026c() : gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc2 = this.f302364f;
        int i18 = c14500x958689dc2.f203004o;
        int i19 = c14500x958689dc2.f202997e;
        int i27 = c14500x958689dc2.f202996d;
        java.lang.String str = c14500x958689dc2.f202998f;
        long j17 = c14500x958689dc2.f203012w;
        java.lang.String str2 = c14500x958689dc2.f202999g;
        yz5.a aVar = c14500x958689dc2.f203000h;
        cp2.l lVar = new cp2.l(i17, dd2Var2, m56357x44e5026c, i18, i19, i27, str, 0, j17, str2, aVar != null ? ((java.lang.Number) aVar.mo152xb9724478()).intValue() : -1, 128, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc3 = this.f302364f;
        if (c14500x958689dc3.f203002m == 0 && (dd2Var = c14500x958689dc3.f203003n) != null && !c14500x958689dc3.f203008s) {
            nq2.d dVar = nq2.d.f420513a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dd2Var);
            pq2.e c17 = dVar.c(dd2Var);
            if (c17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc4 = this.f302364f;
                int ordinal = c17.f439118n.ordinal();
                if (ordinal == 1) {
                    c17.f(new cp2.j(this, lVar, callback, c14500x958689dc4));
                    return;
                } else if (ordinal == 5 && (e17 = c17.e()) != null) {
                    c14500x958689dc4.f203006q = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) e17.f97693d).getLastBuffer();
                    callback.mo55587xb461ee3d((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) e17.f97693d);
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc5 = this.f302364f;
        c14500x958689dc5.f203006q = null;
        c14500x958689dc5.f203008s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.m56461x34ddd257(this, lVar, callback, false, 4, null);
    }
}
