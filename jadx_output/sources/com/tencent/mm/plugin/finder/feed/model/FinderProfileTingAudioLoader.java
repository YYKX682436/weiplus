package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileTingAudioLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "com/tencent/mm/plugin/finder/feed/model/y6", "com/tencent/mm/plugin/finder/feed/model/z6", "com/tencent/mm/plugin/finder/feed/model/a7", "com/tencent/mm/plugin/finder/feed/model/b7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderProfileTingAudioLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final int f107605d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107606e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107607f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f107608g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.IResponse f107609h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.z6 f107610i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.y6 f107611m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.q f107612n;

    public FinderProfileTingAudioLoader(int i17, int i18, java.lang.String str, java.lang.String str2, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(qt2Var);
        this.f107605d = i17;
        this.f107606e = i18;
        this.f107607f = str;
        this.f107608g = str2;
        this.f107609h = iResponse;
        this.f107610i = com.tencent.mm.plugin.finder.feed.model.z6.f108511d;
        this.f107611m = com.tencent.mm.plugin.finder.feed.model.y6.f108479d;
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.a7 b(db2.e6 e6Var, int i17, int i18, java.lang.String str);

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.b7(this);
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
        yj0.a.b("com/tencent/mm/plugin/finder/feed/model/FinderProfileTingAudioLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        kotlin.jvm.internal.o.g(response, "response");
        if (response.getPullType() == 0) {
            getDataList().clear();
        }
        super.onFetchDone(response);
        this.f107611m = getDataListJustForAdapter().size() > 0 ? com.tencent.mm.plugin.finder.feed.model.y6.f108481f : com.tencent.mm.plugin.finder.feed.model.y6.f108480e;
        this.f107611m = getDataListJustForAdapter().size() > 0 ? com.tencent.mm.plugin.finder.feed.model.y6.f108481f : com.tencent.mm.plugin.finder.feed.model.y6.f108480e;
        boolean isInitOperation = isInitOperation(response);
        yz5.q qVar = this.f107612n;
        if (qVar != null) {
            qVar.invoke(java.lang.Boolean.valueOf(isInitOperation), java.lang.Boolean.valueOf(response.getHasMore()), response.getIncrementList());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/model/FinderProfileTingAudioLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
