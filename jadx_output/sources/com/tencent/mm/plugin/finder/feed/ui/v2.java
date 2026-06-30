package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final /* synthetic */ class v2 extends kotlin.jvm.internal.a implements yz5.p {
    public v2(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI.class, "applyUIState", "applyUIState(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", 4);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dv2.n nVar = (dv2.n) obj;
        com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI finderFollowAggregationUI = (com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI) this.f310102d;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI.f109245y;
        finderFollowAggregationUI.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowAggregationUI", "applyUIState: " + nVar);
        if (nVar.f243904a) {
            android.view.View view = finderFollowAggregationUI.f109247u;
            if (view == null) {
                kotlin.jvm.internal.o.o("tabLayoutContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = finderFollowAggregationUI.f109248v;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("followOnlyTitleContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = finderFollowAggregationUI.f109247u;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("tabLayoutContainer");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = finderFollowAggregationUI.f109248v;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("followOnlyTitleContainer");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "applyUIState", "(Lcom/tencent/mm/plugin/finder/uic/FinderFollowAggregationTabUIC$UIState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = finderFollowAggregationUI.f109249w;
        if (textView != null) {
            textView.setText(nVar.f243905b);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("followOnlyTitleTv");
        throw null;
    }
}
