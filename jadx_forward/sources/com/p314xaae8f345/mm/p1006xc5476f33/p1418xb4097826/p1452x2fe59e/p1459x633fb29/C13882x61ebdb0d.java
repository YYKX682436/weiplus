package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/v5", "com/tencent/mm/plugin/finder/feed/model/w5", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader */
/* loaded from: classes2.dex */
public final class C13882x61ebdb0d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f189092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f189093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f189094f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f189095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189096h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f189097i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f189098m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f189099n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f189100o;

    /* renamed from: p, reason: collision with root package name */
    public int f189101p;

    /* renamed from: q, reason: collision with root package name */
    public int f189102q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f189103r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f189104s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f189105t;

    public C13882x61ebdb0d(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f189097i = true;
        this.f189098m = "";
        this.f189100o = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
    /* renamed from: addUdfKv */
    public void mo56096xb5c28f61(org.json.JSONObject udfKv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        if (this.f189100o.length() == 0) {
            return;
        }
        try {
            udfKv.put("source_jump_info", this.f189100o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getB(), "addUdfKv cliReportInfo=" + this.f189100o);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(getB(), "addUdfKv error", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v5(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7
    /* renamed from: createDataMerger */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 mo55748xaddc49a0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y5(this);
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
        this.f189097i = response.getHasMore();
        if (response.getHasMore() || !(response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w5) || (lVar = this.f189104s) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: onFetchRefreshDone */
    public void mo55428xcbba01e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.mo55428xcbba01e2(response);
        if (!(response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w5) || (lVar = this.f189105t) == null) {
            return;
        }
        lVar.mo146xb9724478(response);
    }
}
