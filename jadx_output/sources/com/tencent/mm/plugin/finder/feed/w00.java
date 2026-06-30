package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class w00 extends com.tencent.mm.plugin.finder.feed.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.l f110945i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w00(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader, jz5.l lVar) {
        super(context, i17, i18, feedLoader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        this.f110945i = lVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderTingAudioCollectionUIContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == ms2.b.class.hashCode()) {
                    return new com.tencent.mm.plugin.finder.convert.eu(true, com.tencent.mm.plugin.finder.feed.w00.this.f110945i);
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mm.sdk.platformtools.Log.c("TingAudioCollectionPresenter", "type invalid", new java.lang.Object[0]);
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
        this.f107156e.requestInit(true);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void i() {
        com.tencent.mars.xlog.Log.i("TingAudioCollectionPresenter", "loadMoreData");
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107156e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        com.tencent.mars.xlog.Log.i("TingAudioCollectionPresenter", "requestRefresh");
        this.f107156e.requestRefresh();
    }
}
