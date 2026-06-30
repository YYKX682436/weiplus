package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ps extends com.tencent.mm.plugin.finder.feed.gj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.os presenter, int i17, int i18) {
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
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f106969e;
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract.Presenter");
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        if (((com.tencent.mm.plugin.finder.feed.os) c0Var).f108677y) {
            com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
            android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            o17.setLoadMoreFooter(inflate);
        }
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

    @Override // com.tencent.mm.plugin.finder.feed.gj, com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        recyclerView.setItemAnimator(new uw2.n0());
        recyclerView.setHasFixedSize(true);
        com.tencent.mm.plugin.finder.feed.c0 c0Var = this.f106969e;
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract.Presenter");
        com.tencent.mm.plugin.finder.feed.os osVar = (com.tencent.mm.plugin.finder.feed.os) c0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = osVar.D;
        if (baseFinderFeed != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderFeedDetailRelUIContract.ViewCallback", "cache exist!,show cache first");
            java.util.ArrayList f17 = osVar.f();
            if (f17 != null) {
                f17.clear();
            }
            java.util.ArrayList f18 = osVar.f();
            if (f18 != null) {
                f18.add(baseFinderFeed);
            }
            a().notifyDataSetChanged();
        }
        super.u();
    }
}
