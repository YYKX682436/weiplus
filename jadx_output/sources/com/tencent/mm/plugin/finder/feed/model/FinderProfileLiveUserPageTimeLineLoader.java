package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileLiveUserPageTimeLineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/p6", "com/tencent/mm/plugin/finder/feed/model/q6", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileLiveUserPageTimeLineLoader extends com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107590d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107591e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f107592f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f107593g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderProfileLiveUserPageTimeLineLoader(java.lang.String targetUsername, java.lang.String myUsername, boolean z17, r45.qt2 qt2Var, boolean z18) {
        super(com.tencent.mm.plugin.finder.feed.model.internal.m0.f108025r, targetUsername, qt2Var, false, z18, 0, null, false, 0L, null, 0, null, null, 8168, null);
        kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
        kotlin.jvm.internal.o.g(myUsername, "myUsername");
        this.f107590d = targetUsername;
        this.f107591e = myUsername;
        this.f107592f = z17;
        this.f107593g = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.p6(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.r6(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        setFetchEndCallback(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        if (this.f107592f) {
            super.onFetchDone(response);
            if (isInitOperation(response)) {
                return;
            }
        }
        if (2 == response.getPullType()) {
            setInnerLoadingMore(false);
        }
        yz5.l fetchEndCallback = getFetchEndCallback();
        if (fetchEndCallback != null) {
            fetchEndCallback.invoke(response);
        }
    }
}
