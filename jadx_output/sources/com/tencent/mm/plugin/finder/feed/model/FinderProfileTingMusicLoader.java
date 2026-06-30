package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileTingMusicLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "com/tencent/mm/plugin/finder/feed/model/c7", "com/tencent/mm/plugin/finder/feed/model/d7", "com/tencent/mm/plugin/finder/feed/model/e7", "com/tencent/mm/plugin/finder/feed/model/f7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderProfileTingMusicLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final int f107613d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107614e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107615f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f107616g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f107617h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107618i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.d7 f107619m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.c7 f107620n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.q f107621o;

    public FinderProfileTingMusicLoader(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(qt2Var);
        this.f107613d = i17;
        this.f107614e = i18;
        this.f107615f = i19;
        this.f107616g = str;
        this.f107617h = str2;
        this.f107618i = iResponse;
        this.f107619m = com.tencent.mm.plugin.finder.feed.model.d7.f107802d;
        this.f107620n = com.tencent.mm.plugin.finder.feed.model.c7.f107752d;
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.f7 b(db2.f6 f6Var, int i17, int i18, java.lang.String str);

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.e7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onAlive() {
        super.onAlive();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public void onDead() {
        super.onDead();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(response);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/model/FinderProfileTingMusicLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        this.f107620n = getDataListJustForAdapter().size() > 0 ? com.tencent.mm.plugin.finder.feed.model.c7.f107754f : com.tencent.mm.plugin.finder.feed.model.c7.f107753e;
        this.f107620n = getDataListJustForAdapter().size() > 0 ? com.tencent.mm.plugin.finder.feed.model.c7.f107754f : com.tencent.mm.plugin.finder.feed.model.c7.f107753e;
        boolean isInitOperation = isInitOperation(response);
        yz5.q qVar = this.f107621o;
        if (qVar != null) {
            qVar.invoke(java.lang.Boolean.valueOf(isInitOperation), java.lang.Boolean.valueOf(response.getHasMore()), response.getIncrementList());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/model/FinderProfileTingMusicLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
