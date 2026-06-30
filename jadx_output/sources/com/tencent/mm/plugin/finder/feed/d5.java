package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class d5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f106547b;

    public d5(com.tencent.mm.plugin.finder.feed.a7 a7Var, fp0.r rVar) {
        this.f106546a = a7Var;
        this.f106547b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.model.y yVar;
        int i17;
        int i18;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106546a;
        boolean z17 = true;
        a7Var.G = true;
        java.util.List list = ((com.tencent.mm.plugin.finder.feed.m2) obj).f107344b;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", "[preloadPrevPage] empty!");
            a7Var.G = false;
        } else {
            yw2.a0 a0Var = a7Var.f106216o;
            androidx.recyclerview.widget.RecyclerView recyclerView = a0Var != null ? a0Var.s().getRecyclerView() : null;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                int childCount = recyclerView.getChildCount();
                int i19 = 0;
                while (true) {
                    yVar = a7Var.f106210g;
                    if (i19 >= childCount) {
                        i17 = 0;
                        i18 = -1;
                        break;
                    }
                    android.view.View childAt = recyclerView.getChildAt(i19);
                    i18 = recyclerView.u0(childAt);
                    so2.y0 y0Var = (so2.y0) kz5.n0.a0(yVar.f108469d, i18);
                    if (y0Var != null && !(y0Var instanceof so2.z0)) {
                        i17 = childAt.getTop();
                        break;
                    }
                    i19++;
                }
                yVar.b(list, true, false);
                adapter.notifyItemRangeInserted(yVar.f108468c == null ? 0 : 1, list.size());
                if (i18 != -1) {
                    int size = i18 + list.size();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(java.lang.Integer.valueOf(size));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "insertItemsOnPreloadPrev", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "insertItemsOnPreloadPrev", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            }
        }
        a7Var.f106231y0 = false;
        a7Var.I(false);
        this.f106547b.b(fp0.u.f265290f);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.finder.feed.a7.B(a7Var, list);
        }
        com.tencent.mm.plugin.finder.feed.a7.i(a7Var);
        return jz5.f0.f302826a;
    }
}
