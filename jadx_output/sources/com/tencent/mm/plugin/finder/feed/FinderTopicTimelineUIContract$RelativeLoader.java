package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$RelativeLoader", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader;", "com/tencent/mm/plugin/finder/feed/k20", "com/tencent/mm/plugin/finder/feed/l20", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicTimelineUIContract$RelativeLoader extends com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader {

    /* renamed from: o, reason: collision with root package name */
    public final long f106147o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f106148p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.vx0 f106149q;

    /* renamed from: r, reason: collision with root package name */
    public final int f106150r;

    /* renamed from: s, reason: collision with root package name */
    public final int f106151s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f106152t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f106153u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f106154v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f106155w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f106156x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTopicTimelineUIContract$RelativeLoader(long j17, java.lang.String objectNonceId, r45.vx0 vx0Var, int i17, int i18, java.lang.String fromUsername, java.lang.String toUsername, java.lang.String sessionId, r45.qt2 qt2Var, boolean z17, boolean z18, com.tencent.mm.protobuf.g gVar) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f106147o = j17;
        this.f106148p = objectNonceId;
        this.f106149q = vx0Var;
        this.f106150r = i17;
        this.f106151s = i18;
        this.f106152t = fromUsername;
        this.f106153u = toUsername;
        this.f106154v = sessionId;
        this.f106155w = gVar;
        this.f106157d = z17;
        this.f106158e = z18;
        this.f106156x = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader
    public boolean c(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        return !response.getHasMore() && response.getPullType() == 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.l20(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.n20(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        java.lang.String b17 = getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFetchDone pullType=");
        sb6.append(response.getPullType());
        sb6.append(" hasMore=");
        sb6.append(response.getHasMore());
        sb6.append(" objList=[");
        java.util.List<so2.j5> incrementList = response.getIncrementList();
        java.lang.String str = null;
        if (incrementList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(incrementList, 10));
            for (so2.j5 j5Var : incrementList) {
                arrayList.add(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null);
            }
            str = kz5.n0.g0(arrayList, null, null, null, 0, null, com.tencent.mm.plugin.finder.feed.o20.f108617d, 31, null);
        }
        sb6.append(str);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        if (response.getPullType() == 19) {
            this.f106156x = true;
        }
    }
}
