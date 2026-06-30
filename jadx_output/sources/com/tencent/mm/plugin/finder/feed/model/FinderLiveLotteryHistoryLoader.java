package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;", "Lso2/j5;", "com/tencent/mm/plugin/finder/feed/model/h3", "com/tencent/mm/plugin/finder/feed/model/i3", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveLotteryHistoryLoader extends com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<so2.j5> {

    /* renamed from: d, reason: collision with root package name */
    public final int f107477d;

    /* renamed from: e, reason: collision with root package name */
    public final long f107478e;

    /* renamed from: f, reason: collision with root package name */
    public final long f107479f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f107480g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f107481h;

    /* renamed from: i, reason: collision with root package name */
    public final int f107482i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLotteryHistoryLoader(int i17, long j17, long j18, java.lang.String objectNonceId) {
        super(null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f107477d = i17;
        this.f107478e = j17;
        this.f107479f = j18;
        this.f107480g = objectNonceId;
        this.f107482i = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.h3(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(response);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", this, array);
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
            return;
        }
        response.getHasMore();
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.j3(this, response));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/model/FinderLiveLotteryHistoryLoader", "com/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader", "onFetchDone", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V");
    }
}
