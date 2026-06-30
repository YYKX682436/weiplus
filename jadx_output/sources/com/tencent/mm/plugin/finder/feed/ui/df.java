package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class df extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI f109944d;

    public df(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
        this.f109944d = finderLiveVoteHistoryUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (!recyclerView.canScrollVertically(1)) {
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI = this.f109944d;
            if (finderLiveVoteHistoryUI.f109447y == 1) {
                pq5.g l17 = new ly2.c(finderLiveVoteHistoryUI.f109445w, finderLiveVoteHistoryUI.f109448z, finderLiveVoteHistoryUI.f109446x).l();
                l17.K(new com.tencent.mm.plugin.finder.feed.ui.cf(finderLiveVoteHistoryUI));
                kotlin.jvm.internal.o.e(finderLiveVoteHistoryUI, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f(finderLiveVoteHistoryUI);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
