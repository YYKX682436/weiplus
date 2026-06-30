package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderInteractionSearchFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/j2", "com/tencent/mm/plugin/finder/feed/model/k2", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader */
/* loaded from: classes2.dex */
public final class C13864xeae7d925 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f188993d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f188994e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f188995f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f188996g;

    /* renamed from: h, reason: collision with root package name */
    public final int f188997h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f188998i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f188999m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13864xeae7d925(r45.qt2 qt2Var, boolean z17, java.lang.String query, java.lang.String requestId, java.util.LinkedList tags, int i17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        this.f188993d = z17;
        this.f188994e = query;
        this.f188995f = requestId;
        this.f188996g = tags;
        this.f188997h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.k2[] k2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.k2.f189645d;
        new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j2(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m2(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: getPageName */
    public int mo55586xaf11af30() {
        return 22;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response)) {
            return;
        }
        this.f188999m = response.getHasMore();
        yz5.l lVar = this.f188998i;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: requestLoadMore */
    public boolean mo55589x84fe90a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "requestLoadMore hasMore:" + this.f188999m);
        if (this.f188993d || this.f188999m) {
            return super.mo55589x84fe90a(z17);
        }
        return false;
    }
}
