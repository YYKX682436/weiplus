package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class a0 extends com.tencent.mm.plugin.finder.feed.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.gallery.d f111348i;

    /* renamed from: m, reason: collision with root package name */
    public final int f111349m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader, com.tencent.mm.plugin.finder.gallery.d galleryConfig, int i17) {
        super(context, 0, 0, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        kotlin.jvm.internal.o.g(galleryConfig, "galleryConfig");
        this.f111348i = galleryConfig;
        this.f111349m = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        return this.f111348i.a(this.f111349m);
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
    public void m(com.tencent.mm.plugin.finder.feed.a1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.m(callback);
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter o17 = a1Var != null ? a1Var.o() : null;
        if (o17 == null) {
            return;
        }
        o17.F = new com.tencent.mm.plugin.finder.gallery.z(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        this.f107156e.requestRefresh();
    }
}
