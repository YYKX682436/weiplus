package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderInteractionSearchFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/j2", "com/tencent/mm/plugin/finder/feed/model/k2", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderInteractionSearchFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107460d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107461e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107462f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f107463g;

    /* renamed from: h, reason: collision with root package name */
    public final int f107464h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f107465i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f107466m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderInteractionSearchFeedLoader(r45.qt2 qt2Var, boolean z17, java.lang.String query, java.lang.String requestId, java.util.LinkedList tags, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(tags, "tags");
        this.f107460d = z17;
        this.f107461e = query;
        this.f107462f = requestId;
        this.f107463g = tags;
        this.f107464h = i17;
        com.tencent.mm.plugin.finder.feed.model.k2[] k2VarArr = com.tencent.mm.plugin.finder.feed.model.k2.f108112d;
        new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.j2(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.m2(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 22;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        this.f107466m = response.getHasMore();
        yz5.l lVar = this.f107465i;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        com.tencent.mars.xlog.Log.i(getB(), "requestLoadMore hasMore:" + this.f107466m);
        if (this.f107460d || this.f107466m) {
            return super.requestLoadMore(z17);
        }
        return false;
    }
}
