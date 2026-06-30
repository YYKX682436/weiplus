package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tn extends com.tencent.mm.plugin.finder.feed.k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader finderPoiRelateLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader) baseFeedLoader : null;
        if (finderPoiRelateLoader == null) {
            return;
        }
        finderPoiRelateLoader.f107553e = new com.tencent.mm.plugin.finder.feed.sn(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == so2.m4.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.bs();
                }
                hc2.l.a("Finder.FinderPoiRelateUIContract", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
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
}
