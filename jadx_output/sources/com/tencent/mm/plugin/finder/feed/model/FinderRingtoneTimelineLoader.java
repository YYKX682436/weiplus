package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderRingtoneTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/r7", "com/tencent/mm/plugin/finder/feed/model/s7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderRingtoneTimelineLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final long f107639d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107640e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107641f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f107642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRingtoneTimelineLoader(long j17, java.lang.String nonceId, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f107639d = j17;
        this.f107640e = nonceId;
        this.f107641f = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.r7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.u7(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || (lVar = this.f107642g) == null) {
            return;
        }
        lVar.invoke(response);
    }
}
