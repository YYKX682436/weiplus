package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class xh implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment f110736a;

    public xh(com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment) {
        this.f110736a = finderPostPlaySquareContainerFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment = this.f110736a;
        com.tencent.mm.plugin.finder.feed.to toVar = finderPostPlaySquareContainerFragment.f109491u;
        if (toVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View a17 = toVar.a();
        if (a17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.feed.to toVar2 = finderPostPlaySquareContainerFragment.f109491u;
            if (toVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            toVar2.g().getRecyclerView().setVisibility(0);
        }
        com.tencent.mm.plugin.finder.feed.to toVar3 = finderPostPlaySquareContainerFragment.f109491u;
        if (toVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = toVar3.g().getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                yj0.a.d(linearLayoutManager2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$initOnCreate$1$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }
}
