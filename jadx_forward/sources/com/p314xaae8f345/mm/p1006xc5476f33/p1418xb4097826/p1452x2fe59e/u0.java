package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class u0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f190656a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 f190657b;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var) {
        this.f190657b = a1Var;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f190656a || i17 <= 0) {
            return;
        }
        this.f190656a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q0(this.f190657b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f190657b;
        a1Var.C(reason);
        a1Var.z().p(reason);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        android.view.View t17;
        if (this.f190657b.z().f188689e.m56393xfb854877() == 0 && (t17 = this.f190657b.t()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f190657b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = a1Var.f187713m;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.setVisibility(8);
            }
            android.view.View findViewById = t17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f190657b.R()) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r0(this.f190657b));
        } else {
            this.f190657b.z().v();
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = this.f190657b;
        if (a1Var.E(reason)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f187711h, "onRefreshEnd handleBySelf");
            a1Var.D(reason);
            return;
        }
        android.view.View t17 = a1Var.t();
        if (t17 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = a1Var.m56022x4905e9fa().mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            int i17 = reason.f545050b;
            java.lang.String str = a1Var.f187711h;
            if (i17 != -1) {
                if ((c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) > 0 || a1Var.V()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRefreshEnd show headerView make rlLayout visible :");
                    sb6.append(c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view = a1Var.f187718r;
                    if (view != null) {
                        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
                        if (textView != null) {
                            textView.setText(a1Var.B(reason));
                        }
                        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
                        if (textView2 != null) {
                            textView2.setText(a1Var.s(reason));
                        }
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = a1Var.f187713m;
                    if (c22801x87cbdc00 != null) {
                        c22801x87cbdc00.setVisibility(0);
                    }
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onRefreshEnd showEmptyView for count:");
                    sb7.append(c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                    a1Var.U();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRefreshEnd retry");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(t17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = a1Var.f187713m;
                if (c22801x87cbdc002 != null) {
                    c22801x87cbdc002.setVisibility(8);
                }
                android.widget.TextView textView3 = (android.widget.TextView) t17.findViewById(com.p314xaae8f345.mm.R.id.dft);
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.widget.TextView textView4 = (android.widget.TextView) t17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                android.view.View findViewById = t17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
                if (findViewById != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$6", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                a1Var.N(true);
                android.view.View findViewById2 = t17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t0(a1Var, t17));
                }
            }
        }
        a1Var.O(reason);
        a1Var.getClass();
        a1Var.z().mo56078xb3ee2b3f(reason);
    }
}
