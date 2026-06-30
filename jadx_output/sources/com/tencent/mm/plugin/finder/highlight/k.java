package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class k extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.l f111442d;

    public k(com.tencent.mm.plugin.finder.highlight.l lVar) {
        this.f111442d = lVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        boolean z17 = recyclerView.computeVerticalScrollOffset() > 1;
        com.tencent.mm.plugin.finder.highlight.l lVar = this.f111442d;
        if (z17) {
            android.view.View view = lVar.f111447h;
            if (view == null) {
                kotlin.jvm.internal.o.o("headerBottomLine");
                throw null;
            }
            if (view.getVisibility() != 0) {
                android.view.View view2 = lVar.f111447h;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("headerBottomLine");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            }
        }
        if (!z17) {
            android.view.View view3 = lVar.f111447h;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("headerBottomLine");
                throw null;
            }
            if (view3.getVisibility() != 8) {
                android.view.View view4 = lVar.f111447h;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("headerBottomLine");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
