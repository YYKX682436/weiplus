package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderTopicTimelineUIContract$TopicLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public boolean f106157d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f106158e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f106159f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f106160g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f106161h;

    /* renamed from: i, reason: collision with root package name */
    public long f106162i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xn5 f106163m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f106164n;

    public FinderTopicTimelineUIContract$TopicLoader() {
        this(null);
    }

    public boolean c(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        return !response.getHasMore();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.a aVar;
        yz5.l lVar;
        yz5.l lVar2;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        xc2.k0 k0Var = (xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        java.util.List incrementList = response.getIncrementList();
        r45.qt2 contextObj = getContextObj();
        k0Var.h7(incrementList, contextObj != null ? contextObj.getInteger(5) : 0);
        if (isInitOperation(response)) {
            return;
        }
        if (response.getPullType() == 19 && (lVar2 = this.f106160g) != null) {
            lVar2.invoke(response);
        }
        if (response.getPullType() == 0 && (lVar = this.f106161h) != null) {
            lVar.invoke(response);
        }
        if (c(response) && (aVar = this.f106159f) != null) {
            aVar.invoke();
        }
        if (response.getPullType() == 2) {
            this.f106158e = response.getHasMore();
        } else if (response.getPullType() == 19) {
            this.f106157d = response.getHasMore();
        }
    }

    public FinderTopicTimelineUIContract$TopicLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f106157d = true;
        this.f106158e = true;
    }
}
