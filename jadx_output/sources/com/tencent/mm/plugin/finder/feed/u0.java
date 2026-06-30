package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f109123a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f109124b;

    public u0(com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        this.f109124b = a1Var;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f109123a || i17 <= 0) {
            return;
        }
        this.f109123a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.q0(this.f109124b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f109124b;
        a1Var.C(reason);
        a1Var.z().p(reason);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        android.view.View t17;
        if (this.f109124b.z().f107156e.getSize() == 0 && (t17 = this.f109124b.t()) != null) {
            com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f109124b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = a1Var.f106180m;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(8);
            }
            android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f109124b.R()) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.r0(this.f109124b));
        } else {
            this.f109124b.z().v();
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f109124b;
        if (a1Var.E(reason)) {
            com.tencent.mars.xlog.Log.i(a1Var.f106178h, "onRefreshEnd handleBySelf");
            a1Var.D(reason);
            return;
        }
        android.view.View t17 = a1Var.t();
        if (t17 != null) {
            androidx.recyclerview.widget.f2 adapter = a1Var.getRecyclerView().getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            int i17 = reason.f463517b;
            java.lang.String str = a1Var.f106178h;
            if (i17 != -1) {
                if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) > 0 || a1Var.V()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRefreshEnd show headerView make rlLayout visible :");
                    sb6.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0);
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view = a1Var.f106185r;
                    if (view != null) {
                        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
                        if (textView != null) {
                            textView.setText(a1Var.B(reason));
                        }
                        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
                        if (textView2 != null) {
                            textView2.setText(a1Var.s(reason));
                        }
                    }
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = a1Var.f106180m;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(0);
                    }
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onRefreshEnd showEmptyView for count:");
                    sb7.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0);
                    com.tencent.mars.xlog.Log.i(str, sb7.toString());
                    a1Var.U();
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "onRefreshEnd retry");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = a1Var.f106180m;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setVisibility(8);
                }
                android.widget.TextView textView3 = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dft);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.widget.TextView textView4 = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.m2g);
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.lbi);
                if (findViewById != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                a1Var.N(true);
                android.view.View findViewById2 = t17.findViewById(com.tencent.mm.R.id.m2g);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.t0(a1Var, t17));
                }
            }
        }
        a1Var.O(reason);
        a1Var.getClass();
        a1Var.z().onRefreshEnd(reason);
    }
}
