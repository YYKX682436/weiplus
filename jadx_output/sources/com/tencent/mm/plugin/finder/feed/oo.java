package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class oo extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f108669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.to f108670e;

    public oo(com.tencent.mm.plugin.finder.feed.to toVar) {
        this.f108670e = toVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$flowPreloadListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$flowPreloadListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$flowPreloadListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i18 <= 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$flowPreloadListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$flowPreloadListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        this.f108669d = linearLayoutManager.y();
        int itemCount = (linearLayoutManager.getItemCount() - this.f108669d) - 1;
        if (itemCount < 6 && itemCount >= 0) {
            com.tencent.mm.plugin.finder.feed.to toVar = this.f108670e;
            com.tencent.mars.xlog.Log.i(toVar.f109094h, "Preload triggered, remainSize=" + itemCount);
            toVar.g().J(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$flowPreloadListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
