package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rk extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f186012d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public final int[] f186013e = new int[2];

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sk f186014f;

    public rk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sk skVar) {
        this.f186014f = skVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sk skVar = this.f186014f;
            if (!skVar.f186094f) {
                fs2.b bVar = skVar.f186093e;
                android.view.View a17 = bVar.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w.a();
                if (a17.findViewById(com.p314xaae8f345.mm.R.id.egh) == null) {
                    skVar.f186094f = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = skVar.f186095g;
                    android.view.ViewParent parent = c15352x8ed10a39 != null ? c15352x8ed10a39.getParent() : null;
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(skVar.f186095g);
                        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a392 = skVar.f186095g;
                        layoutParams.height = c15352x8ed10a392 != null ? c15352x8ed10a392.getHeight() : -2;
                    }
                    android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
                    layoutParams2.gravity = 48;
                    android.view.View a18 = bVar.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a18, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((android.view.ViewGroup) a18).addView(skVar.f186095g, layoutParams2);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sk.f186092i > -2) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
            int[] iArr = new int[c1164x587b7ff1.f93453d];
            c1164x587b7ff1.u(iArr);
            int i19 = iArr[0];
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sk.f186092i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sk skVar = this.f186014f;
            if (i19 == i27) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p07, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.SimpleViewHolder");
                in5.s0 s0Var = (in5.s0) p07;
                android.view.View view = s0Var.f3639x46306858;
                int[] iArr2 = this.f186012d;
                view.getLocationInWindow(iArr2);
                int[] iArr3 = this.f186013e;
                recyclerView.getLocationInWindow(iArr3);
                int i28 = iArr3[1] - iArr2[1];
                if (i28 > 0) {
                    android.view.View a17 = skVar.f186093e.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) a17;
                    if (!skVar.f186094f) {
                        skVar.f186094f = true;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.nwt);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w.a();
                        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.egh);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                    android.view.View a18 = skVar.f186093e.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a18, "null cannot be cast to non-null type android.view.ViewGroup");
                    skVar.n((android.view.ViewGroup) a18, s0Var, recyclerView);
                }
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = recyclerView.p0(i27);
                if (p08 != null) {
                    android.view.View a19 = skVar.f186093e.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a19, "null cannot be cast to non-null type android.view.ViewGroup");
                    skVar.n((android.view.ViewGroup) a19, (in5.s0) p08, recyclerView);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedTagsConvert$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
