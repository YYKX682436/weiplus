package bm2;

/* loaded from: classes3.dex */
public final class j4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103543d;

    public j4(bm2.n5 n5Var) {
        this.f103543d = n5Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            bm2.n5 n5Var = this.f103543d;
            n5Var.getClass();
            n5Var.f103678h.post(new bm2.m5(n5Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        bm2.n5 n5Var = this.f103543d;
        int i19 = n5Var.D;
        if (i19 > 0 && i19 < Integer.MAX_VALUE) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int y17 = c1162x665295de.y();
            java.lang.Object tag = n5Var.F.getTag();
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE);
            zl2.r4 r4Var = zl2.r4.f555483a;
            java.lang.String str = "onScrolled lastVisiblePos:" + y17 + ",selfItemPosition:" + n5Var.D + ",haveAttachStickView:" + b17;
            java.lang.String str2 = n5Var.f103682o;
            r4Var.M2(str2, str);
            int i27 = n5Var.D;
            if (y17 < i27 && b17) {
                android.view.View view = n5Var.f103677g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (y17 > i27) {
                android.view.View view2 = n5Var.f103677g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                int[] iArr = n5Var.I;
                iArr[1] = 0;
                android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(y17);
                if (mo7935xa188593e != null) {
                    mo7935xa188593e.getLocationOnScreen(iArr);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrolled lastVisibleViewY:");
                sb6.append(iArr[1]);
                sb6.append(",stickViewY:");
                int i28 = n5Var.G;
                sb6.append(i28);
                r4Var.M2(str2, sb6.toString());
                if (iArr[1] <= i28 || !b17) {
                    android.view.View view3 = n5Var.f103677g;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList4.add(4);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view4 = n5Var.f103677g;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter", "onRecyclerViewScrollLogic", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
