package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderMixAllFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/z4", "com/tencent/mm/plugin/finder/feed/model/a5", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMixAllFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f107524m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107526e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107527f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107528g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f107529h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f107530i;

    public FinderMixAllFeedLoader(boolean z17, r45.qt2 qt2Var, int i17, int i18) {
        super(qt2Var);
        this.f107525d = z17;
        this.f107526e = i17;
        this.f107527f = i18;
        this.f107528g = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.z4(this, this.f107526e, this.f107527f);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.c5(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        int i17 = this.f107526e;
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 10;
        }
        if (i17 != 4) {
            return 31;
        }
        return this.f107527f == 2 ? 35 : 34;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean ifDelLiveFeed() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
        this.f107529h = null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            yz5.l lVar = this.f107529h;
            if (lVar != null) {
                this.f107528g = response.getHasMore();
                lVar.invoke(response);
                return;
            }
            return;
        }
        this.f107528g = response.getHasMore();
        yz5.l lVar2 = this.f107529h;
        if (lVar2 != null) {
            lVar2.invoke(response);
        }
        if (!(2 == response.getPullType()) || response.getHasMore() || (aVar = this.f107530i) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        boolean z17 = response instanceof com.tencent.mm.plugin.finder.feed.model.a5;
    }
}
