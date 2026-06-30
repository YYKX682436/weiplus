package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/FinderProfileTemplateLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderProfileFeedLoader;", "com/tencent/mm/plugin/finder/feed/bp", "com/tencent/mm/plugin/finder/feed/cp", "com/tencent/mm/plugin/finder/feed/dp", "com/tencent/mm/plugin/finder/feed/ep", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileTemplateLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106106d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.dp f106107e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.bp f106108f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f106109g;

    public FinderProfileTemplateLoader(java.lang.String str, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f106106d = str;
        this.f106107e = com.tencent.mm.plugin.finder.feed.dp.f106580d;
        this.f106108f = com.tencent.mm.plugin.finder.feed.bp.f106403d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.ep(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        this.f106108f = getDataListJustForAdapter().isEmpty() ^ true ? com.tencent.mm.plugin.finder.feed.bp.f106405f : com.tencent.mm.plugin.finder.feed.bp.f106404e;
        if (isInitOperation(response) || response.getHasMore() || (aVar = this.f106109g) == null) {
            return;
        }
        aVar.invoke();
    }
}
