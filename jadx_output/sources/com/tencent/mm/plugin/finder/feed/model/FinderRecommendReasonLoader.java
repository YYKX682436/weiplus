package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderRecommendReasonLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/g7", "com/tencent/mm/plugin/finder/feed/model/h7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRecommendReasonLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f107623e;

    /* renamed from: f, reason: collision with root package name */
    public int f107624f;

    /* renamed from: g, reason: collision with root package name */
    public long f107625g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107626h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107627i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107628m;

    /* renamed from: n, reason: collision with root package name */
    public int f107629n;

    /* renamed from: o, reason: collision with root package name */
    public int f107630o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f107631p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f107632q;

    public FinderRecommendReasonLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f107628m = "";
        this.f107629n = 336;
        this.f107630o = 337;
        this.f107631p = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void addUdfKv(org.json.JSONObject udfKv) {
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        if (this.f107628m.length() == 0) {
            return;
        }
        try {
            udfKv.put("source_jump_info", this.f107628m);
            com.tencent.mars.xlog.Log.i(getB(), "addUdfKv cliReportInfo=" + this.f107628m);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(getB(), "addUdfKv error", e17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.g7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.j7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        this.f107631p = response.getHasMore();
        if (response.getHasMore() || !(response instanceof com.tencent.mm.plugin.finder.feed.model.h7) || (lVar = this.f107632q) == null) {
            return;
        }
        lVar.invoke(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        boolean z17 = response instanceof com.tencent.mm.plugin.finder.feed.model.h7;
    }
}
