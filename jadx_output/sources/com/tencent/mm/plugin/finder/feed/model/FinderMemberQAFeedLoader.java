package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderMemberQAFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/s4", "com/tencent/mm/plugin/finder/feed/model/t4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMemberQAFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107512d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107513e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107514f;

    /* renamed from: g, reason: collision with root package name */
    public long f107515g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f107516h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.s4 f107517i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f107518m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f107519n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMemberQAFeedLoader(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String myFinderUsername, com.tencent.mm.protobuf.g gVar, int i17, long j17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(myFinderUsername, "myFinderUsername");
        this.f107512d = finderUsername;
        this.f107513e = myFinderUsername;
        this.f107514f = i17;
        this.f107515g = j17;
        setLastBuffer(gVar);
        this.f107516h = (kotlin.jvm.internal.o.b(finderUsername, myFinderUsername) || i17 == 6) ? false : true;
        this.f107517i = new com.tencent.mm.plugin.finder.feed.model.s4(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107517i;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.v4(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        yz5.l lVar = this.f107518m;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int supportMemberFeedType() {
        return 2;
    }
}
