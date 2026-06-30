package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFavFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/a1", "com/tencent/mm/plugin/finder/feed/model/b1", "com/tencent/mm/plugin/finder/feed/model/c1", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader */
/* loaded from: classes2.dex */
public final class C13859xe71bc226 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188941d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f188942e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f188943f;

    /* renamed from: g, reason: collision with root package name */
    public int f188944g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f188945h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c1 f188946i;

    /* renamed from: m, reason: collision with root package name */
    public long f188947m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f188948n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13859xe71bc226(java.lang.String finderUserName, r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        this.f188941d = finderUserName;
        this.f188942e = z17;
        this.f188946i = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c1.f189275d;
        this.f188948n = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a1(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e1(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: getPageName */
    public int mo55586xaf11af30() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response)) {
            return;
        }
        if (response.getPullType() == 0 && (response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b1) response;
            this.f188944g = b1Var.f189247a;
            if (this.f188947m == 0) {
                java.lang.String b17 = getB();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initTopics size:");
                java.util.List list = b1Var.f189248b;
                int i17 = 0;
                sb6.append(list != null ? list.size() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
                if (list != null) {
                    int size = list.size() <= Integer.MAX_VALUE ? list.size() : Integer.MAX_VALUE;
                    while (true) {
                        arrayList = this.f188948n;
                        if (i17 >= size) {
                            break;
                        }
                        arrayList.add(list.get(i17));
                        i17++;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5468xcc4031b7 c5468xcc4031b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5468xcc4031b7();
                    c5468xcc4031b7.f135806g.f87973a = arrayList;
                    c5468xcc4031b7.e();
                }
            }
        }
        this.f188945h = response.getHasMore();
        yz5.l lVar = this.f188943f;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: remove */
    public int mo56120xc84af884(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 a17;
        if (this.f188947m != 0 && (a17 = getStore().a("0")) != null) {
            java.util.ArrayList arrayList = a17.f189833a;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((so2.j5) it.next()).mo2128x1ed62e84() == j17) {
                    break;
                }
                i17++;
            }
            if (i17 != -1) {
                arrayList.remove(i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "remove from all index:" + i17);
        }
        return super.mo56120xc84af884(j17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: requestLoadMore */
    public boolean mo55589x84fe90a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "requestLoadMore hasMore:" + this.f188945h);
        if (this.f188942e || this.f188945h) {
            return super.mo55589x84fe90a(z17);
        }
        return false;
    }
}
