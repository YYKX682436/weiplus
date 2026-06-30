package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class wo extends com.tencent.mm.plugin.finder.feed.gj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.uo presenter, int i17, int i18) {
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
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        o17.setLoadMoreFooter(inflate);
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.f486458la3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        if (recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
            if (finderRecyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, null, 2, null);
            }
        }
    }
}
