package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/v5", "com/tencent/mm/plugin/finder/feed/model/w5", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostPlayLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f107559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f107560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f107561f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f107562g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107563h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107564i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107565m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107566n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107567o;

    /* renamed from: p, reason: collision with root package name */
    public int f107568p;

    /* renamed from: q, reason: collision with root package name */
    public int f107569q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f107570r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f107571s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f107572t;

    public FinderPostPlayLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f107564i = true;
        this.f107565m = "";
        this.f107567o = "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void addUdfKv(org.json.JSONObject udfKv) {
        kotlin.jvm.internal.o.g(udfKv, "udfKv");
        if (this.f107567o.length() == 0) {
            return;
        }
        try {
            udfKv.put("source_jump_info", this.f107567o);
            com.tencent.mars.xlog.Log.i(getB(), "addUdfKv cliReportInfo=" + this.f107567o);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(getB(), "addUdfKv error", e17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.v5(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.y5(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        this.f107564i = response.getHasMore();
        if (response.getHasMore() || !(response instanceof com.tencent.mm.plugin.finder.feed.model.w5) || (lVar = this.f107571s) == null) {
            return;
        }
        lVar.invoke(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        if (!(response instanceof com.tencent.mm.plugin.finder.feed.model.w5) || (lVar = this.f107572t) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
