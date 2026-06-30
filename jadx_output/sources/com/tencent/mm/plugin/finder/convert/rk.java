package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rk extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f104479d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f104480e = new int[2];

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.sk f104481f;

    public rk(com.tencent.mm.plugin.finder.convert.sk skVar) {
        this.f104481f = skVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 2) {
            com.tencent.mm.plugin.finder.convert.sk skVar = this.f104481f;
            if (!skVar.f104561f) {
                fs2.b bVar = skVar.f104560e;
                android.view.View a17 = bVar.a();
                com.tencent.mm.plugin.finder.view.FinderTagView.f131494w.a();
                if (a17.findViewById(com.tencent.mm.R.id.egh) == null) {
                    skVar.f104561f = true;
                    com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = skVar.f104562g;
                    android.view.ViewParent parent = finderTagView != null ? finderTagView.getParent() : null;
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(skVar.f104562g);
                        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView2 = skVar.f104562g;
                        layoutParams.height = finderTagView2 != null ? finderTagView2.getHeight() : -2;
                    }
                    android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 48;
                    android.view.View a18 = bVar.a();
                    kotlin.jvm.internal.o.e(a18, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((android.view.ViewGroup) a18).addView(skVar.f104562g, layoutParams2);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (com.tencent.mm.plugin.finder.convert.sk.f104559i > -2) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f11920d];
            staggeredGridLayoutManager.u(iArr);
            int i19 = iArr[0];
            int i27 = com.tencent.mm.plugin.finder.convert.sk.f104559i;
            com.tencent.mm.plugin.finder.convert.sk skVar = this.f104481f;
            if (i19 == i27) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(i27);
                kotlin.jvm.internal.o.e(p07, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                in5.s0 s0Var = (in5.s0) p07;
                android.view.View view = s0Var.itemView;
                int[] iArr2 = this.f104479d;
                view.getLocationInWindow(iArr2);
                int[] iArr3 = this.f104480e;
                recyclerView.getLocationInWindow(iArr3);
                int i28 = iArr3[1] - iArr2[1];
                if (i28 > 0) {
                    android.view.View a17 = skVar.f104560e.a();
                    kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) a17;
                    if (!skVar.f104561f) {
                        skVar.f104561f = true;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.nwt);
                        com.tencent.mm.plugin.finder.view.FinderTagView.f131494w.a();
                        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.egh);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        frameLayout.getLayoutParams().height = p17.getHeight();
                        frameLayout.removeView(p17);
                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 48;
                        viewGroup.addView(p17, layoutParams);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert", "changeToDecorView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else if (i28 <= 0) {
                    android.view.View a18 = skVar.f104560e.a();
                    kotlin.jvm.internal.o.e(a18, "null cannot be cast to non-null type android.view.ViewGroup");
                    skVar.n((android.view.ViewGroup) a18, s0Var, recyclerView);
                }
            } else {
                androidx.recyclerview.widget.k3 p08 = recyclerView.p0(i27);
                if (p08 != null) {
                    android.view.View a19 = skVar.f104560e.a();
                    kotlin.jvm.internal.o.e(a19, "null cannot be cast to non-null type android.view.ViewGroup");
                    skVar.n((android.view.ViewGroup) a19, (in5.s0) p08, recyclerView);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
