package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderMemberTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/w4", "com/tencent/mm/plugin/finder/feed/model/x4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMemberTimelineLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107520d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107521e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107522f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f107523g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMemberTimelineLoader(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(finderMemberTicket, "finderMemberTicket");
        this.f107520d = finderUsername;
        this.f107521e = finderMemberTicket;
        this.f107522f = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.x4(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || response.getHasMore() || (lVar = this.f107523g) == null) {
            return;
        }
        lVar.invoke(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchInitDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse initResponse) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(initResponse, "initResponse");
        super.onFetchInitDone(initResponse);
        if (initResponse.getHasMore() || (lVar = this.f107523g) == null) {
            return;
        }
        lVar.invoke(initResponse);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchLoadMoreDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchLoadMoreDone(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int supportMemberFeedType() {
        return 2;
    }
}
