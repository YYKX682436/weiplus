package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/biz/FinderBizProfileLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "ab2/z", "ab2/a0", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader */
/* loaded from: classes2.dex */
public final class C13681xd53f292f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f184301d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f184302e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f184303f;

    /* renamed from: g, reason: collision with root package name */
    public long f184304g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f184305h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lx f184306i;

    /* renamed from: m, reason: collision with root package name */
    public int f184307m;

    /* renamed from: n, reason: collision with root package name */
    public int f184308n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f184309o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f184310p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f184311q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f184312r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f184313s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13681xd53f292f(java.lang.String bizUsername, r45.qt2 qt2Var, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        z17 = (i17 & 4) != 0 ? false : z17;
        z18 = (i17 & 8) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        this.f184301d = bizUsername;
        this.f184302e = z17;
        this.f184303f = z18;
        this.f184306i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lx(m56387xe6796cde(), new ab2.c0(this));
        this.f184311q = new java.util.LinkedList();
    }

    public final java.util.List c(java.util.LinkedList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (hc2.o0.C((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List j17 = cu2.u.f303974a.j(arrayList, 2, m56354xfe9224be());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        return arrayList2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new ab2.z(this);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 d() {
        int size = m56387xe6796cde().size();
        while (true) {
            size--;
            if (-1 >= size) {
                return null;
            }
            so2.j5 j5Var = (so2.j5) m56387xe6796cde().get(size);
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                if (abstractC14490x69736cb5.getFeedObject().m59251x5db1b11() != 0) {
                    return abstractC14490x69736cb5;
                }
            }
        }
    }

    public final void e() {
        if (this.f184309o) {
            return;
        }
        this.f184309o = true;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f0Var.f391649d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209366n0).mo141623x754a37bb()).r()).intValue();
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new ab2.b0(this, f0Var, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: getPageName */
    public int mo55586xaf11af30() {
        return 21;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        java.util.List m56409x97891cf7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        long j17 = this.f184304g;
        if (j17 != 0 && (m56409x97891cf7 = response.m56409x97891cf7()) != null) {
            int i17 = 0;
            for (java.lang.Object obj : m56409x97891cf7) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    if (abstractC14490x69736cb5.getFeedObject().m59251x5db1b11() == j17) {
                        if (m56365xc95b2616(response) && i17 <= 7) {
                            this.f184307m = 0;
                        }
                        abstractC14490x69736cb5.v1(true);
                        getDispatcher().a();
                    }
                }
                i17 = i18;
            }
        }
        if (m56362x40f3992d(response)) {
            if (this.f184308n == 1) {
                e();
                return;
            }
            return;
        }
        if (2 == response.getPullType()) {
            this.f184310p = false;
        }
        response.getHasMore();
        yz5.l lVar = this.f184305h;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
        java.util.LinkedList linkedList = this.f184311q;
        java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
        linkedList.clear();
        java.util.Iterator it = linkedList2.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(response);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchLoadMoreDone */
    public void mo55588xef36e338(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55588xef36e338(response);
        if (this.f184309o) {
            int i17 = 0;
            for (java.lang.Object obj : m56387xe6796cde()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    if (abstractC14490x69736cb5.getFeedObject().m59251x5db1b11() == this.f184304g) {
                        abstractC14490x69736cb5.v1(true);
                        getDispatcher().b(i17, 1);
                        this.f184309o = false;
                        yz5.l lVar = this.f184312r;
                        if (lVar != null) {
                            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
                            return;
                        }
                        return;
                    }
                }
                i17 = i18;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: requestLoadMore */
    public boolean mo55589x84fe90a(boolean z17) {
        if (this.f184309o && this.f184310p) {
            return false;
        }
        this.f184310p = true;
        return super.mo55589x84fe90a(z17);
    }
}
