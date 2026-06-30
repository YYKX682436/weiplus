package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class i7 extends com.tencent.mm.plugin.finder.feed.k0 {

    /* renamed from: i, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f106993i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.tencent.mm.ui.MMActivity context, androidx.fragment.app.Fragment fragment, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(loader, "loader");
        this.f106993i = fragment;
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

    @Override // com.tencent.mm.plugin.finder.feed.k0, fs2.a
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        this.f107156e.requestRefresh();
    }
}
