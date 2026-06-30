package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderMemberFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/i4", "com/tencent/mm/plugin/finder/feed/model/k4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMemberFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f107506d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107507e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107508f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f107509g;

    /* renamed from: h, reason: collision with root package name */
    public final int f107510h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.k4 f107511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMemberFeedLoader(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, com.tencent.mm.protobuf.g gVar, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(finderMemberTicket, "finderMemberTicket");
        this.f107511i = new com.tencent.mm.plugin.finder.feed.model.k4(this);
        this.f107507e = finderUsername;
        this.f107508f = finderMemberTicket;
        setLastBuffer(gVar);
        this.f107510h = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107511i;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.m4(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return this.f107510h == 0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.n4(this, response));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int remove(long j17, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int remove = super.remove(j17, z17);
        if (remove != -1 && (recyclerView = this.f107506d) != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.model.o4(this));
        }
        return remove;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int supportMemberFeedType() {
        return this.f107510h == 1 ? 0 : 1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public void updateItem(long j17) {
        super.updateItem(j17);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f107506d;
        if (recyclerView != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.model.p4(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed updateItem(long j17, long j18) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed updateItem = super.updateItem(j17, j18);
        if (updateItem != null && (recyclerView = this.f107506d) != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.model.q4(this));
        }
        return updateItem;
    }
}
