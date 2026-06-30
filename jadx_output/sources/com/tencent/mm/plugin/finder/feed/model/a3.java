package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class a3 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final eb2.m0 f107698d;

    /* renamed from: e, reason: collision with root package name */
    public final fp0.t f107699e = new fp0.t("LbsStreamListData");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader f107700f;

    public a3(com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader) {
        this.f107700f = finderLbsStreamFeedLoader;
        this.f107698d = new eb2.m0(2, finderLbsStreamFeedLoader.getContextObj(), null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        this.f107699e.e();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        eb2.m0 m0Var = this.f107698d;
        m0Var.f250825m.dead();
        kotlinx.coroutines.z0.d(m0Var.f250826n, getTAG() + ":onDead", null, 2, null);
        this.f107699e.f();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj instanceof com.tencent.mm.plugin.finder.feed.model.w2) {
            this.f107699e.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.model.z2(this, obj, callback), null, 2, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        java.util.List list;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f107700f;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderLbsStreamFeedLoader.getCache();
        if (cache == null || (list = cache.f108300a) == null) {
            list = kz5.p0.f313996d;
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "[fetchInit] ret=" + list);
        com.tencent.mm.plugin.finder.feed.model.x2 x2Var = new com.tencent.mm.plugin.finder.feed.model.x2(0, 0, "", list.size());
        x2Var.setIncrementList(list);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderLbsStreamFeedLoader.getCache();
        x2Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        x2Var.setPullType(1000);
        callback.onFetchDone(x2Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f107700f;
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, new com.tencent.mm.plugin.finder.feed.model.w2(finderLbsStreamFeedLoader.f107469d, finderLbsStreamFeedLoader.getLastBuffer(), 2), callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader finderLbsStreamFeedLoader = this.f107700f;
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, new com.tencent.mm.plugin.finder.feed.model.w2(finderLbsStreamFeedLoader.f107469d, finderLbsStreamFeedLoader.getLastBuffer(), 0), callback, false, 4, null);
    }
}
