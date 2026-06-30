package ab2;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.plugin.finder.feed.k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.plugin.finder.storage.vj0 q17 = a1Var != null ? a1Var.q() : null;
        kotlin.jvm.internal.o.d(q17);
        return q17.a();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void g() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var != null) {
            a1Var.r(this.f107156e.getDataListJustForAdapter());
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void h() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(this.f107156e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void i() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107156e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        this.f107156e.requestRefresh();
    }

    public final boolean y(int i17) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        if (!(baseFeedLoader instanceof com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader)) {
            return true;
        }
        com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader finderBizProfileLoader = (com.tencent.mm.plugin.finder.biz.FinderBizProfileLoader) baseFeedLoader;
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(finderBizProfileLoader.getDataList(), i17);
        if (j5Var != null && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            if (baseFinderFeed.getFeedObject().getId() == finderBizProfileLoader.f102771g) {
                baseFinderFeed.v1(true);
                finderBizProfileLoader.f102780s = true;
                finderBizProfileLoader.f102776o = false;
            }
        }
        return finderBizProfileLoader.f102780s;
    }
}
