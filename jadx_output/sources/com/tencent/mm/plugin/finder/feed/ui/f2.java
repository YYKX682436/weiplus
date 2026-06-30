package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI f110001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI finderFeedListUI) {
        super(1);
        this.f110001d = finderFeedListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        int w17;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean hasMore = it.getHasMore();
        com.tencent.mm.plugin.finder.feed.ui.FinderFeedListUI finderFeedListUI = this.f110001d;
        if (hasMore) {
            com.tencent.mm.plugin.finder.feed.g9 g9Var = finderFeedListUI.f109233y;
            if (g9Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.r(g9Var.o(), false, null, null, 7, null);
            com.tencent.mm.plugin.finder.feed.g9 g9Var2 = finderFeedListUI.f109233y;
            if (g9Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = g9Var2.getRecyclerView();
            kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (adapter = recyclerView.getAdapter()) != null && (w17 = linearLayoutManager.w() + 1) < adapter.getItemCount()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI", "tryScrollToNextFeed", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI", "tryScrollToNextFeed", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        } else {
            com.tencent.mm.plugin.finder.feed.g9 g9Var3 = finderFeedListUI.f109233y;
            if (g9Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = g9Var3.o().getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f213435x, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.g9 g9Var4 = finderFeedListUI.f109233y;
            if (g9Var4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.I(g9Var4.o(), null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
