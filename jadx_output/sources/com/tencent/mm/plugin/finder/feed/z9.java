package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z9 extends com.tencent.mm.plugin.finder.feed.gj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.y9 presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
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
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f106968d).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        o17.setLoadMoreFooter(inflate);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o().getRecyclerView().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).C = false;
    }
}
