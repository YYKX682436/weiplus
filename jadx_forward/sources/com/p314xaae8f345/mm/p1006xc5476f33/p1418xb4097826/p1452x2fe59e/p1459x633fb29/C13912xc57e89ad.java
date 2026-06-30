package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/g7", "com/tencent/mm/plugin/finder/feed/model/h7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader */
/* loaded from: classes2.dex */
public final class C13912xc57e89ad extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f189156e;

    /* renamed from: f, reason: collision with root package name */
    public int f189157f;

    /* renamed from: g, reason: collision with root package name */
    public long f189158g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189159h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f189160i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f189161m;

    /* renamed from: n, reason: collision with root package name */
    public int f189162n;

    /* renamed from: o, reason: collision with root package name */
    public int f189163o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f189164p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f189165q;

    public C13912xc57e89ad(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f189161m = "";
        this.f189162n = 336;
        this.f189163o = 337;
        this.f189164p = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: addUdfKv */
    public void mo56096xb5c28f61(org.json.JSONObject udfKv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        if (this.f189161m.length() == 0) {
            return;
        }
        try {
            udfKv.put("source_jump_info", this.f189161m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "addUdfKv cliReportInfo=" + this.f189161m);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(getB(), "addUdfKv error", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g7(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j7(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55587xb461ee3d(response);
        if (m56362x40f3992d(response)) {
            return;
        }
        this.f189164p = response.getHasMore();
        if (response.getHasMore() || !(response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h7) || (lVar = this.f189165q) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchRefreshDone */
    public void mo55428xcbba01e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55428xcbba01e2(response);
        boolean z17 = response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h7;
    }
}
