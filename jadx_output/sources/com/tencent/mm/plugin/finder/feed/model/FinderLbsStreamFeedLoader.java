package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLbsStreamFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/w2", "com/tencent/mm/plugin/finder/feed/model/x2", "com/tencent/mm/plugin/finder/feed/model/a3", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLbsStreamFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f107468g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107469d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f107470e;

    /* renamed from: f, reason: collision with root package name */
    public int f107471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLbsStreamFeedLoader(java.lang.String finderUserName, r45.qt2 contextObj) {
        super(contextObj);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f107469d = finderUserName;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.a3(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.c3(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (response.getPullType() == 0 && (response instanceof com.tencent.mm.plugin.finder.feed.model.x2)) {
            this.f107471f = ((com.tencent.mm.plugin.finder.feed.model.x2) response).f108447a;
        }
        if (isInitOperation(response)) {
            return;
        }
        response.getHasMore();
        if (response.getHasMore() || (lVar = this.f107470e) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
