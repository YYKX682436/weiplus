package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/NativeDramaGridLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NativeDramaGridLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final eb2.e0 f106165d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106166e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.t0 f106167f;

    public NativeDramaGridLoader(r45.qt2 qt2Var) {
        super(qt2Var);
        this.f106165d = new eb2.e0(qt2Var, 0, 2, null);
        this.f106166e = 39;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f106167f = (ey2.t0) a17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.a30(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.c30(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(response);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/NativeDramaGridLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.d30(response, this));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/NativeDramaGridLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
