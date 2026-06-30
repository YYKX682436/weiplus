package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class mn extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rn f107391a;

    public mn(com.tencent.mm.plugin.finder.feed.rn rnVar) {
        this.f107391a = rnVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f107391a.f108929e.g(true, 2);
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.rn rnVar = this.f107391a;
        if (rnVar.f108929e.f106939n) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = rnVar.f108930f;
        if (refreshLoadMoreLayout != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f107391a.f108929e;
        hnVar.f106935g = null;
        hnVar.g(false, 2);
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, yz5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        ?? r07;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.rn rnVar = this.f107391a;
        android.view.View findViewById = rnVar.f108928d.findViewById(com.tencent.mm.R.id.f484229dg3);
        if (findViewById != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = rnVar.f108930f;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = refreshLoadMoreLayout.getRecyclerView().getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (reason.f463517b != -1) {
                if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0) {
                    android.view.View findViewById2 = rnVar.f108928d.findViewById(com.tencent.mm.R.id.f484229dg3);
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = rnVar.f108930f;
                        if (refreshLoadMoreLayout2 == null) {
                            kotlin.jvm.internal.o.o("rlLayout");
                            throw null;
                        }
                        refreshLoadMoreLayout2.setVisibility(8);
                        android.widget.TextView textView = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.dft);
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        android.view.View findViewById3 = findViewById2.findViewById(com.tencent.mm.R.id.lbi);
                        if (findViewById3 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View findViewById4 = findViewById2.findViewById(com.tencent.mm.R.id.m2g);
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
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = rnVar.f108930f;
                    if (refreshLoadMoreLayout3 == null) {
                        kotlin.jvm.internal.o.o("rlLayout");
                        throw null;
                    }
                    refreshLoadMoreLayout3.setVisibility(0);
                }
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = rnVar.f108930f;
                if (refreshLoadMoreLayout4 == null) {
                    kotlin.jvm.internal.o.o("rlLayout");
                    throw null;
                }
                refreshLoadMoreLayout4.setVisibility(8);
                android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.dft);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.m2g);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.view.View findViewById5 = findViewById.findViewById(com.tencent.mm.R.id.lbi);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.finder.feed.rn.a(rnVar, true);
                android.view.View findViewById6 = findViewById.findViewById(com.tencent.mm.R.id.m2g);
                if (findViewById6 != null) {
                    findViewById6.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ln(rnVar, findViewById));
                }
            }
            r07 = 0;
        } else {
            r07 = 0;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = rnVar.f108930f;
        if (refreshLoadMoreLayout5 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout5, r07, 1, r07);
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw r07;
        }
    }
}
