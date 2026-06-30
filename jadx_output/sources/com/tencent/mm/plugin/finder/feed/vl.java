package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vl extends com.tencent.mm.plugin.finder.feed.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f110913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader, boolean z17, int i19) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f110913i = z17;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) baseFeedLoader : null;
        if (finderMemberFeedLoader == null) {
            return;
        }
        finderMemberFeedLoader.f107509g = new com.tencent.mm.plugin.finder.feed.ul(this, context);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        final tu2.b bVar = new tu2.b();
        bVar.f422132b = 2;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        if ((baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) && ((com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) baseFeedLoader).f107510h == 1) {
            return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderMemberFeedUIContract$MemberFeedPresenter$buildItemCoverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.convert.no(com.tencent.mm.plugin.finder.feed.vl.this.f110913i, bVar);
                }
            };
        }
        boolean z17 = this.f110913i;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderMemberFeedUIContract.MemberFeedViewCallback");
        return new com.tencent.mm.plugin.finder.storage.ha0(0, bVar, z17, ((com.tencent.mm.plugin.finder.feed.wl) a1Var).f110996u, 1, null).b(null);
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
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(callback, "callback");
        super.m(callback);
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var == null || (recyclerView = a1Var.getRecyclerView()) == null) {
            return;
        }
        ((gp2.v0) ((ws5.e) pf5.u.f353936a.e(ws5.g.class).c(ws5.e.class))).N6(this.f107155d);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f107156e;
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader");
        ((com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader) baseFeedLoader).f107506d = recyclerView;
        recyclerView.setItemAnimator(null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0, fs2.a
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void q() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void s() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        this.f107156e.requestRefresh();
    }
}
