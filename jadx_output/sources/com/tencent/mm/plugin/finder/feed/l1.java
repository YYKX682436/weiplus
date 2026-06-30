package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l1 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f107266a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 f107267b;

    public l1(com.tencent.mm.plugin.finder.feed.s1 s1Var) {
        this.f107267b = s1Var;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f107266a || i17 <= 0) {
            return;
        }
        this.f107266a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.h1(this.f107267b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.s1 s1Var = this.f107267b;
        s1Var.getClass();
        s1Var.g();
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        android.view.View a17;
        if (((java.util.ArrayList) this.f107267b.g().f106613e.f294091d).size() == 0 && (a17 = this.f107267b.a()) != null) {
            com.tencent.mm.plugin.finder.feed.s1 s1Var = this.f107267b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = s1Var.f108963g;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(8);
            }
            android.view.View findViewById = a17.findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(ILcom/tencent/mm/view/refreshLayout/model/LoaderExtInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f107267b.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.i1(this.f107267b));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        android.view.View f213435x;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.s1 s1Var = this.f107267b;
        s1Var.getClass();
        android.view.View a17 = s1Var.a();
        if (a17 != null) {
            androidx.recyclerview.widget.f2 adapter = s1Var.getRecyclerView().getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (reason.f463517b != -1) {
                if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0) {
                    if (!(((com.tencent.mm.plugin.finder.feed.h2) s1Var).f106878m != 7)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRefreshEnd showEmptyView for count:");
                        sb6.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0);
                        com.tencent.mars.xlog.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", sb6.toString());
                        com.tencent.mars.xlog.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "showEmptyView");
                        android.view.View a18 = s1Var.a();
                        if (a18 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(a18, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            a18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(a18, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = s1Var.f108963g;
                            if (refreshLoadMoreLayout != null) {
                                refreshLoadMoreLayout.setVisibility(8);
                            }
                            android.widget.TextView textView = (android.widget.TextView) a18.findViewById(com.tencent.mm.R.id.dft);
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                            android.view.View findViewById = a18.findViewById(com.tencent.mm.R.id.lbi);
                            if (findViewById != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(8);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            android.view.View findViewById2 = a18.findViewById(com.tencent.mm.R.id.m2g);
                            if (findViewById2 != null) {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(8);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onRefreshEnd show headerView make rlLayout visible :");
                sb7.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0);
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", sb7.toString());
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(a17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = s1Var.f108963g;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setVisibility(0);
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "onRefreshEnd retry");
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(a17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = s1Var.f108963g;
                if (refreshLoadMoreLayout3 != null) {
                    refreshLoadMoreLayout3.setVisibility(8);
                }
                android.widget.TextView textView2 = (android.widget.TextView) a17.findViewById(com.tencent.mm.R.id.dft);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                android.widget.TextView textView3 = (android.widget.TextView) a17.findViewById(com.tencent.mm.R.id.m2g);
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.view.View findViewById3 = a17.findViewById(com.tencent.mm.R.id.lbi);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById4 = a17.findViewById(com.tencent.mm.R.id.m2g);
                if (findViewById4 != null) {
                    findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.feed.k1(s1Var, a17));
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.h2 h2Var = (com.tencent.mm.plugin.finder.feed.h2) s1Var;
        h2Var.getClass();
        if (h2Var.f106878m == 7 && !reason.f463521f && reason.f463523h != 0 && (f213435x = h2Var.f108963g.getF213435x()) != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(f213435x, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById5 = f213435x.findViewById(com.tencent.mm.R.id.ili);
            if (findViewById5 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById6 = f213435x.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById6 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/feed/FinderCampaignFeedUIContract$TopicFeedViewCallback", "onTopicOnRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        s1Var.getClass();
        s1Var.g();
    }
}
