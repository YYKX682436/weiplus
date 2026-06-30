package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFavFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/a1", "com/tencent/mm/plugin/finder/feed/model/b1", "com/tencent/mm/plugin/finder/feed/model/c1", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFavFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107408d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107409e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f107410f;

    /* renamed from: g, reason: collision with root package name */
    public int f107411g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f107412h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.c1 f107413i;

    /* renamed from: m, reason: collision with root package name */
    public long f107414m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f107415n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFavFeedLoader(java.lang.String finderUserName, r45.qt2 qt2Var, boolean z17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f107408d = finderUserName;
        this.f107409e = z17;
        this.f107413i = com.tencent.mm.plugin.finder.feed.model.c1.f107742d;
        this.f107415n = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.a1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.e1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int getPageName() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        if (response.getPullType() == 0 && (response instanceof com.tencent.mm.plugin.finder.feed.model.b1)) {
            com.tencent.mm.plugin.finder.feed.model.b1 b1Var = (com.tencent.mm.plugin.finder.feed.model.b1) response;
            this.f107411g = b1Var.f107714a;
            if (this.f107414m == 0) {
                java.lang.String b17 = getB();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initTopics size:");
                java.util.List list = b1Var.f107715b;
                int i17 = 0;
                sb6.append(list != null ? list.size() : 0);
                com.tencent.mars.xlog.Log.i(b17, sb6.toString());
                if (list != null) {
                    int size = list.size() <= Integer.MAX_VALUE ? list.size() : Integer.MAX_VALUE;
                    while (true) {
                        arrayList = this.f107415n;
                        if (i17 >= size) {
                            break;
                        }
                        arrayList.add(list.get(i17));
                        i17++;
                    }
                    com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent finderFavTopicUpdateEvent = new com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent();
                    finderFavTopicUpdateEvent.f54273g.f6440a = arrayList;
                    finderFavTopicUpdateEvent.e();
                }
            }
        }
        this.f107412h = response.getHasMore();
        yz5.l lVar = this.f107410f;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int remove(long j17, boolean z17) {
        com.tencent.mm.plugin.finder.feed.model.r9 a17;
        if (this.f107414m != 0 && (a17 = getStore().a("0")) != null) {
            java.util.ArrayList arrayList = a17.f108300a;
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((so2.j5) it.next()).getItemId() == j17) {
                    break;
                }
                i17++;
            }
            if (i17 != -1) {
                arrayList.remove(i17);
            }
            com.tencent.mars.xlog.Log.i(getB(), "remove from all index:" + i17);
        }
        return super.remove(j17, z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        com.tencent.mars.xlog.Log.i(getB(), "requestLoadMore hasMore:" + this.f107412h);
        if (this.f107409e || this.f107412h) {
            return super.requestLoadMore(z17);
        }
        return false;
    }
}
