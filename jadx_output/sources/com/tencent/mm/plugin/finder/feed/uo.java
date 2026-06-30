package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class uo extends com.tencent.mm.plugin.finder.feed.dj {

    /* renamed from: y, reason: collision with root package name */
    public fc2.d f110828y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(com.tencent.mm.ui.MMActivity context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0
    public void B() {
        java.util.ArrayList arrayList;
        ym5.q1 q1Var;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        com.tencent.mm.plugin.finder.feed.wo woVar = i0Var instanceof com.tencent.mm.plugin.finder.feed.wo ? (com.tencent.mm.plugin.finder.feed.wo) i0Var : null;
        if (woVar != null && (q1Var = woVar.f106850q) != null && (baseFeedLoader = this.f106570t) != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(baseFeedLoader, q1Var, false, 2, null);
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var2 = this.f106424g;
        if (i0Var2 != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = this.f106570t;
            if (baseFeedLoader2 == null || (arrayList = baseFeedLoader2.getDataListJustForAdapter()) == null) {
                arrayList = new java.util.ArrayList();
            }
            i0Var2.r(arrayList);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void G(ym5.s3 reason) {
        int w17;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        if (i0Var instanceof com.tencent.mm.plugin.finder.feed.wo) {
            com.tencent.mm.plugin.finder.feed.wo woVar = i0Var instanceof com.tencent.mm.plugin.finder.feed.wo ? (com.tencent.mm.plugin.finder.feed.wo) i0Var : null;
            if (woVar == null || !reason.f463521f) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = woVar.o().getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager != null && (w17 = finderLinearLayoutManager.w() + 1) < woVar.a().getData().size() && w17 >= 0) {
                recyclerView.post(new com.tencent.mm.plugin.finder.feed.vo(recyclerView, w17));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void V() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106570t;
        if (baseFeedLoader != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(baseFeedLoader, false, 1, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "activity");
        this.f110828y = new com.tencent.mm.plugin.finder.report.w3(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6()).f125421b;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
            return;
        }
        fc2.d dVar = this.f110828y;
        if (dVar != null) {
            n17.a(dVar);
        } else {
            kotlin.jvm.internal.o.o("observerForExposeReport");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        super.onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
            return;
        }
        fc2.d dVar = this.f110828y;
        if (dVar != null) {
            n17.d(dVar);
        } else {
            kotlin.jvm.internal.o.o("observerForExposeReport");
            throw null;
        }
    }
}
