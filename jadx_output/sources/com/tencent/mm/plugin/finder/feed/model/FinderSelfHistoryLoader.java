package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/v7", "com/tencent/mm/plugin/finder/feed/model/w7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSelfHistoryLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final int f107643d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107644e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107645f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f107646g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f107647h;

    public FinderSelfHistoryLoader(int i17, boolean z17, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f107643d = i17;
        this.f107644e = z17;
        this.f107645f = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.v7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.y7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 32;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        this.f107645f = response.getHasMore();
        if (response.getHasMore() || !(response instanceof com.tencent.mm.plugin.finder.feed.model.w7) || (lVar = this.f107646g) == null) {
            return;
        }
        lVar.invoke(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        if (!(response instanceof com.tencent.mm.plugin.finder.feed.model.w7) || (lVar = this.f107647h) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
