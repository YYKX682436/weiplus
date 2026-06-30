package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class l7 extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f107280u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f107281v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l7(com.tencent.mm.ui.MMActivity r12, androidx.fragment.app.Fragment r13, int r14, int r15, boolean r16, int r17, kotlin.jvm.internal.i r18) {
        /*
            r11 = this;
            r9 = r11
            r10 = r13
            r0 = r17 & 16
            if (r0 == 0) goto L9
            r0 = 0
            r4 = r0
            goto Lb
        L9:
            r4 = r16
        Lb:
            java.lang.String r0 = "context"
            r1 = r12
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r11
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f107280u = r10
            java.lang.String r0 = "Finder.FinderFavFeedUIContract.FavFeedViewCallback"
            r9.f107281v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.l7.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
        int dimension = (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.cuo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return hc2.x0.k(string, this.f106174d, '#', com.tencent.mm.R.raw.icons_outlined_star_new_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void C(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        if (reason.f463521f) {
            return;
        }
        W();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void D(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        android.view.View t17 = t();
        if (t17 != null) {
            androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (reason.f463517b != -1) {
                if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0) {
                    U();
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f106180m;
                    if (refreshLoadMoreLayout == null) {
                        return;
                    }
                    refreshLoadMoreLayout.setVisibility(0);
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f106180m;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setVisibility(0);
                }
                if (reason.f463521f) {
                    return;
                }
                W();
                android.view.View f213435x = this.f106180m.getF213435x();
                if (f213435x == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f213435x, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dft);
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.m2g);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = t17.findViewById(com.tencent.mm.R.id.m2g);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.k7(t17, this));
            }
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
            java.util.AbstractCollection dataList = ((com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader).getDataList();
            if (!dataList.isEmpty()) {
                dataList.clear();
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = z().f107156e;
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader2 instanceof com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader) baseFeedLoader2 : null;
                if (baseFinderFeedLoader != null) {
                    baseFinderFeedLoader.onDataChanged();
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean E(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapter);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", this, array);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        w04.l.INSTANCE.b(540999706);
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0 && a07 < z().f107156e.getSize()) {
            so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
            if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb6.append(baseFinderFeed.getFeedObject().getId());
            sb6.append(", pos:");
            sb6.append(a07);
            com.tencent.mars.xlog.Log.i(this.f107281v, sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
            com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader : null;
            intent.putExtra("key_active_topic_id", finderFavFeedLoader != null ? finderFavFeedLoader.f107414m : 0L);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).fj(this.f106174d, intent, 10001);
            androidx.fragment.app.Fragment fragment = this.f107280u;
            kotlin.jvm.internal.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, j5Var.getItemId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).w(), this.f106180m.getRecyclerView(), 0, null, 0L, null, 240, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V");
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
        if (z().f107156e.getSize() <= this.f106179i * 3) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
            if (((com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader).f107412h) {
                com.tencent.mm.view.RefreshLoadMoreLayout.K(this.f106180m, false, 1, null);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = z().f107156e;
        kotlin.jvm.internal.o.e(baseFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader2;
        int i17 = finderFavFeedLoader.f107411g - 1;
        finderFavFeedLoader.f107411g = i17;
        android.view.View view = this.f106185r;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
        if (textView == null) {
            return;
        }
        textView.setText(this.f106174d.getResources().getString(com.tencent.mm.R.string.cuu, java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void U() {
        android.view.View t17 = t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dft);
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = t17.findViewById(com.tencent.mm.R.id.m2g);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void W() {
        android.widget.TextView textView;
        java.lang.String str;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
        kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
        boolean z17 = ((com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader).f107414m == 0;
        android.view.View f213435x = this.f106180m.getF213435x();
        if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            if (z17) {
                java.util.AbstractCollection dataList = z().f107156e.getDataList();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : dataList) {
                    if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_FinderFavFeedFooterHint");
                if (d17 != null) {
                    str = java.lang.String.format(d17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
                    kotlin.jvm.internal.o.f(str, "format(...)");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = textView.getContext().getResources().getString(com.tencent.mm.R.string.cun, java.lang.Integer.valueOf(size));
                }
                textView.setText(str);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        android.view.View f213435x2 = this.f106180m.getF213435x();
        android.view.View findViewById = f213435x2 != null ? f213435x2.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            int i17 = z17 ? 8 : 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        fc2.o Z6;
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        android.widget.TextView textView = (android.widget.TextView) l(com.tencent.mm.R.id.dft);
        if (textView != null) {
            java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_FinderFavEmptyTips");
            if (d17 == null) {
                d17 = this.f106174d.getString(com.tencent.mm.R.string.cul);
            }
            textView.setText(d17);
        }
        androidx.fragment.app.Fragment fragment = this.f107280u;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(getRecyclerView());
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.Object obj = reason.f463519d;
        if (obj == null || !(obj instanceof java.lang.Integer)) {
            return null;
        }
        android.content.res.Resources resources = this.f106174d.getResources();
        java.lang.Object obj2 = reason.f463519d;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
        return resources.getString(com.tencent.mm.R.string.cuu, obj2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        android.view.View l17 = l(com.tencent.mm.R.id.f484229dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f106184q.d(context);
    }
}
