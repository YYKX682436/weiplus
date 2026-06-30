package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLikedFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/d3", "com/tencent/mm/plugin/finder/feed/model/e3", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLikedFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107472d;

    /* renamed from: e, reason: collision with root package name */
    public int f107473e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107474f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f107475g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f107476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedLoader(boolean z17, com.tencent.mm.plugin.finder.feed.model.internal.m0 scene, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f107472d = z17;
        this.f107474f = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.d3(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.g3(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        this.f107474f = response.getHasMore();
        if (!(2 == response.getPullType()) || response.getHasMore() || (aVar = this.f107475g) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        if (response instanceof com.tencent.mm.plugin.finder.feed.model.e3) {
            this.f107473e = ((com.tencent.mm.plugin.finder.feed.model.e3) response).f107822a;
            yz5.l lVar = this.f107476h;
            if (lVar != null) {
                lVar.invoke(response);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int remove(long j17, boolean z17) {
        java.lang.Object obj;
        java.util.Iterator it = getDataList().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((so2.j5) obj).getItemId() == j17) {
                break;
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (!this.f107472d) {
            if (j5Var != null && j5Var.h() == 9) {
                return -1;
            }
        }
        return super.remove(j17, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int removeByLocalId(long j17, boolean z17) {
        java.lang.Object obj;
        java.util.Iterator it = getDataList().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((so2.j5) obj).getItemId() == j17) {
                break;
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        if (!this.f107472d) {
            if (j5Var != null && j5Var.h() == 9) {
                return -1;
            }
        }
        return super.removeByLocalId(j17, z17);
    }
}
