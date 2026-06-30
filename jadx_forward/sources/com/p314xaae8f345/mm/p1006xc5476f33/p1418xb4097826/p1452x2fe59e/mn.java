package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class mn extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn f188924a;

    public mn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar) {
        this.f188924a = rnVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f188924a.f190462e.g(true, 2);
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = this.f188924a;
        if (rnVar.f190462e.f188472n) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = rnVar.f190463f;
        if (c22801x87cbdc00 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(c22801x87cbdc00, null, 1, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = this.f188924a.f190462e;
        hnVar.f188468g = null;
        hnVar.g(false, 2);
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, yz5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        ?? r07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = this.f188924a;
        android.view.View findViewById = rnVar.f190461d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
        if (findViewById != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = rnVar.f190463f;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc00.m82555x4905e9fa().mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (reason.f545050b != -1) {
                if ((c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0) {
                    android.view.View findViewById2 = rnVar.f190461d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = rnVar.f190463f;
                        if (c22801x87cbdc002 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                            throw null;
                        }
                        c22801x87cbdc002.setVisibility(8);
                        android.widget.TextView textView = (android.widget.TextView) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.dft);
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        android.view.View findViewById3 = findViewById2.findViewById(com.p314xaae8f345.mm.R.id.lbi);
                        if (findViewById3 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View findViewById4 = findViewById2.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                        if (findViewById4 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = rnVar.f190463f;
                    if (c22801x87cbdc003 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                        throw null;
                    }
                    c22801x87cbdc003.setVisibility(0);
                }
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = rnVar.f190463f;
                if (c22801x87cbdc004 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
                c22801x87cbdc004.setVisibility(8);
                android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.dft);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.view.View findViewById5 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.lbi);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn.a(rnVar, true);
                android.view.View findViewById6 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (findViewById6 != null) {
                    findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ln(rnVar, findViewById));
                }
            }
            r07 = 0;
        } else {
            r07 = 0;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = rnVar.f190463f;
        if (c22801x87cbdc005 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.u(c22801x87cbdc005, r07, 1, r07);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw r07;
        }
    }
}
