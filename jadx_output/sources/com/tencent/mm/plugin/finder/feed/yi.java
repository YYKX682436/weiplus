package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class yi implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f111172d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.zi f111173e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f111174f;

    public yi(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader loader) {
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f111172d = loader;
    }

    @Override // fs2.a
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("FinderLiveReservedNoticeListContract", "onDetach");
        this.f111173e = null;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f111172d;
        com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader finderLiveReservedNoticeListLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderLiveReservedNoticeListLoader) baseFeedLoader : null;
        if (finderLiveReservedNoticeListLoader != null) {
            finderLiveReservedNoticeListLoader.f107493e = null;
        }
        this.f111174f = null;
    }
}
