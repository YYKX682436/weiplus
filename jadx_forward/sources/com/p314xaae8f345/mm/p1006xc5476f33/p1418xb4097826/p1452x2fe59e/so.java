package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class so extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to f190533a;

    public so(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar) {
        this.f190533a = toVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar = this.f190533a.f190628i;
        if (noVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(noVar.f190120d, false, 1, null);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lo(noVar));
        }
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar = this.f190533a;
        toVar.getClass();
        android.view.View view4 = toVar.f190631o;
        if (view4 != null && !reason.f545054f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "handleLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "handleLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById = view4.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "handleLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "handleLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar = toVar.f190628i;
        if (noVar != null) {
            android.view.View view5 = null;
            if (reason.f545054f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar2 = noVar.f190121e;
                if (toVar2 != null && (view = toVar2.f190631o) != null) {
                    view5 = view.findViewById(com.p314xaae8f345.mm.R.id.ilh);
                }
                android.view.View view6 = view5;
                if (view6 == null) {
                    return;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar3 = noVar.f190121e;
            android.view.View findViewById2 = (toVar3 == null || (view3 = toVar3.f190631o) == null) ? null : view3.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar4 = noVar.f190121e;
            if (toVar4 != null && (view2 = toVar4.f190631o) != null) {
                view5 = view2.findViewById(com.p314xaae8f345.mm.R.id.ilh);
            }
            android.view.View view7 = view5;
            if (view7 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        android.view.View a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar = this.f190533a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar = toVar.f190628i;
        if (((noVar == null || (abstractC13834x56f46d28 = noVar.f190120d) == null || abstractC13834x56f46d28.m56393xfb854877() != 0) ? false : true) && (a17 = toVar.a()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            toVar.g().setVisibility(8);
            android.view.View findViewById = a17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar2 = toVar.f190628i;
        if (noVar2 != null) {
            noVar2.f190120d.mo56155xd210094c();
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar = this.f190533a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = toVar.g().m82555x4905e9fa().mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        android.view.View a17 = toVar.a();
        if (a17 != null) {
            if (reason.f545050b == -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                toVar.g().setVisibility(8);
                android.widget.TextView textView = (android.widget.TextView) a17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.view.View findViewById = a17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = a17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ro(a17, toVar));
                    return;
                }
                return;
            }
            if ((c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) > 0) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                toVar.g().setVisibility(0);
                return;
            }
            android.view.View a18 = toVar.a();
            if (a18 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(a18, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(a18, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                toVar.g().setVisibility(8);
                android.widget.TextView textView2 = (android.widget.TextView) a18.findViewById(com.p314xaae8f345.mm.R.id.dft);
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.view.View findViewById3 = a18.findViewById(com.p314xaae8f345.mm.R.id.lbi);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById4 = a18.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (findViewById4 == null) {
                    return;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
