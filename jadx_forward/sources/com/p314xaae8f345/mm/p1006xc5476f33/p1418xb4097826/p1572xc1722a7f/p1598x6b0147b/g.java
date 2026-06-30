package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class g implements db2.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.j f203725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f203726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d f203727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f203728g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fp0.r f203729h;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.j jVar, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d c14575x3ee3558d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, fp0.r rVar) {
        this.f203725d = jVar;
        this.f203726e = obj;
        this.f203727f = c14575x3ee3558d;
        this.f203728g = n0Var;
        this.f203729h = rVar;
    }

    @Override // db2.u3
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean z17 = info.f189303h != 0;
        java.lang.String m56464xb5886c64 = this.f203725d.m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] onFetchDone... pullType=");
        sb6.append(i17);
        sb6.append(", isPreloadMore=false hasMore:");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) this.f203726e).getClass();
        sb6.append(z17);
        sb6.append("  list:");
        java.util.LinkedList linkedList = info.f189300e;
        sb6.append(hc2.o0.p(linkedList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.l(info.f189296a, info.f189297b, info.f189298c, null, 8, null);
        lVar.m56420x2a5f836b(linkedList);
        lVar.m56423xd4b4a5a1(i17);
        lVar.m56419xdac5ee4d(z17);
        lVar.m56422x9a5c5d15(info.f189304i);
        rq2.v vVar = rq2.v.f480424a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d c14575x3ee3558d = this.f203727f;
        r45.qt2 m56354xfe9224be = c14575x3ee3558d.m56354xfe9224be();
        vVar.h(m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(5) : -1, linkedList);
        this.f203728g.mo55587xb461ee3d(lVar);
        this.f203729h.b(fp0.u.f346823f);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d.f203698g;
        c14575x3ee3558d.getClass();
        if (1 == lVar.getPullType() || lVar.getPullType() == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e c5471xc77af86e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5471xc77af86e();
            c5471xc77af86e.f135809g.f88285a = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "handleFluentSwitch intercept exit");
            c5471xc77af86e.e();
        }
    }
}
