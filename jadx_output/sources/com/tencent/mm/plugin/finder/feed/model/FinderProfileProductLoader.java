package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileProductLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderProfileFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/w6", "com/tencent/mm/plugin/finder/feed/model/x6", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileProductLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107602d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f107603e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f107604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileProductLoader(java.lang.String finderUsername, r45.qt2 qt2Var, androidx.fragment.app.Fragment fragment) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f107602d = finderUsername;
        this.f107603e = fragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.w6(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || response.getHasMore() || (aVar = this.f107604f) == null) {
            return;
        }
        aVar.invoke();
    }
}
