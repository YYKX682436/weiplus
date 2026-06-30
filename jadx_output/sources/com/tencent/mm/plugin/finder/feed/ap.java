package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ap extends com.tencent.mm.plugin.finder.feed.gj {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f106320r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.zo presenter, int i17, int i18, boolean z17) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f106320r = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f106968d).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        o17.setLoadMoreFooter(inflate);
        if (o().getRecyclerView().getItemDecorationCount() > 0) {
            o().getRecyclerView().T0(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.gj, com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f106969e;
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
        ((com.tencent.mm.plugin.finder.feed.dj) c0Var).V();
        if (this.f106320r) {
            kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
            ((com.tencent.mm.plugin.finder.feed.dj) c0Var).P();
        }
    }
}
