package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderPoiFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/g5", "com/tencent/mm/plugin/finder/feed/model/h5", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderPoiFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f107534d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f96 f107535e;

    /* renamed from: f, reason: collision with root package name */
    public zy2.o9 f107536f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f107537g;

    /* renamed from: h, reason: collision with root package name */
    public int f107538h;

    /* renamed from: i, reason: collision with root package name */
    public int f107539i;

    /* renamed from: m, reason: collision with root package name */
    public int f107540m;

    /* renamed from: n, reason: collision with root package name */
    public long f107541n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f107542o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107543p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f107544q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f107545r;

    /* renamed from: s, reason: collision with root package name */
    public r45.bp2 f107546s;

    /* renamed from: t, reason: collision with root package name */
    public int f107547t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107548u;

    /* renamed from: v, reason: collision with root package name */
    public long f107549v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f107550w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f107551x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.g5 f107532y = new com.tencent.mm.plugin.finder.feed.model.g5(null);

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f107533z = new java.util.HashMap();
    public static final java.util.concurrent.locks.ReentrantLock A = new java.util.concurrent.locks.ReentrantLock();

    public FinderPoiFeedLoader() {
        this(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return (com.tencent.mm.plugin.finder.feed.model.ha) ((jz5.n) this.f107534d).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.j5(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void onFeedUpdateEventCallback(com.tencent.mm.autogen.events.FeedUpdateEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        super.onFeedUpdateEventCallback(event);
        if (this.f107540m == 2) {
            am.ia iaVar = event.f54252g;
            if (iaVar.f6919b == 4) {
                java.util.Iterator it = getDataList().iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == iaVar.f6918a) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    getDispatcher().c(i17, 1, new jz5.l(3, 1));
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        this.f107545r = false;
        if (!isInitOperation(response) && this.f107548u == null) {
            this.f107549v = java.lang.System.currentTimeMillis() / 1000;
            this.f107548u = response;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        this.f107545r = true;
        return super.requestLoadMore(z17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void requestRefresh() {
        getTAG();
        getLastBuffer();
        if (this.f107548u != null && this.f107550w) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.finder.feed.model.l5(this));
            return;
        }
        if (this.f107545r) {
            com.tencent.mars.xlog.Log.w(getTAG(), "requestRefresh() skip since it is requesting");
            return;
        }
        this.f107546s = null;
        this.f107547t = 0;
        ((java.util.ArrayList) this.f107544q).clear();
        this.f107542o = null;
        this.f107543p = null;
        this.f107548u = null;
        this.f107549v = 0L;
        this.f107545r = true;
        getLastBuffer();
        super.requestRefresh();
    }

    public FinderPoiFeedLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f107534d = jz5.h.b(new com.tencent.mm.plugin.finder.feed.model.k5(this));
        this.f107544q = new java.util.ArrayList();
        this.f107551x = "";
    }
}
