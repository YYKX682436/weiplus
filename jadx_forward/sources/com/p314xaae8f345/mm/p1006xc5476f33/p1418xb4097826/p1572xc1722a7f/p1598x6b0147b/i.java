package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.j f203732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f203733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f203734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d f203735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.j jVar, java.lang.Object obj, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d c14575x3ee3558d) {
        super(1);
        this.f203732d = jVar;
        this.f203733e = obj;
        this.f203734f = n0Var;
        this.f203735g = c14575x3ee3558d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.String m56464xb5886c64 = this.f203732d.m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[call] hasPrefetch=false needToRefreshForPrefetch=false pullType=");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) this.f203733e).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) this.f203733e).getClass();
        sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) this.f203733e).f203740a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) this.f203733e).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.j jVar = this.f203732d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f fVar = jVar.f203736d;
        java.lang.Object obj2 = this.f203733e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.g(jVar, obj2, this.f203735g, this.f203734f, task);
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) obj2).f203740a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.h(jVar, task);
        java.util.List list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.k) obj2).f203741b;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyVideoFeedFetcher", "[fetch] pullType=" + i17 + " tabType=" + fVar.f203721g + " isPreloadMore=false, isGetHistory=" + fVar.f203724m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.c(gVar);
        if (i17 == 0 || i17 == 1) {
            fVar.f203724m = false;
        }
        java.util.ArrayList arrayList = null;
        if (i17 == 0) {
            gm0.j1.u().c().x(hc2.d0.c(fVar.f203721g), null);
        }
        java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(fVar.f203721g), "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyVideoFeedFetcher", "[innerFetch] use tabType=" + fVar.f203721g + " lastBuffer:" + b17);
        int i18 = fVar.f203721g;
        r45.qt2 qt2Var = fVar.f203722h;
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it.next()).getFeedObject().getFeedObject());
            }
        }
        db2.n3 n3Var = new db2.n3(i18, i17, b17, qt2Var, arrayList, false, false, false, 0, false, null, null, null, 8160, null);
        n3Var.e(new fb2.a(), 0);
        n3Var.e(new fb2.k(), 1);
        n3Var.e(new fb2.g(), 2);
        im5.c keeper = fVar.f203723i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keeper, "keeper");
        n3Var.f309627v = keeper;
        n3Var.f309625t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d(fVar, hVar);
        n3Var.f309624s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.e(i17, fVar, true, cVar);
        n3Var.i();
        return jz5.f0.f384359a;
    }
}
