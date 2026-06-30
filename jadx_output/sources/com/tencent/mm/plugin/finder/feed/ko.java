package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class ko extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f107225u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f107226v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17, androidx.fragment.app.Fragment fragment) {
        super(context, i17, i18, z17, 0, false, 48, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f107225u = fragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void J(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (i17 < 0 || i17 >= z().f107156e.getSize()) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object obj = z().f107156e.getDataListJustForAdapter().get(i17);
        h0Var.f310123d = obj;
        if ((obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && (this.f107225u instanceof com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment)) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            ym5.a1.h(itemView, new com.tencent.mm.plugin.finder.feed.jo(this, V6, h0Var, i17));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayContract", "onGridItemClick");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
            sb6.append(a07);
            sb6.append(" id:");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            sb6.append(baseFinderFeed.getFeedObject().getId());
            sb6.append(", pos:");
            sb6.append(a07);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayContract", sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
            androidx.fragment.app.Fragment fragment = this.f107225u;
            if (fragment instanceof com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) {
                intent.putExtra("topic_id", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).f110046x);
                java.lang.String str = ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).A;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("by_pass", str);
                intent.putExtra("from_object_id", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).f110048z);
                intent.putExtra("business_type", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).I);
                intent.putExtra("single_comment_scene", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).C);
                intent.putExtra("source_session_buffer", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).F);
                intent.putExtra("cli_report_info", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).f110042J);
                intent.putExtra("key_click_feed_id", j5Var.getItemId());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(this.f106174d, intent);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
            androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
            com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI finderPostPlayUI = activity instanceof com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI ? (com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI) activity : null;
            if (finderPostPlayUI != null) {
                finderPostPlayUI.f101801v = 2;
            }
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            i0Var.Zk((android.app.Activity) context, intent);
            kotlin.jvm.internal.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long itemId = j5Var.getItemId();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            java.lang.String w17 = baseFinderFeed2.w();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
            java.lang.String jSONObject = baseFinderFeed2.getUdfKv().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, itemId, w17, recyclerView, 0, jSONObject, 0L, null, 208, null);
            W(V6, j5Var, i17, "view_clk");
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    public final void W(r45.qt2 qt2Var, so2.j5 j5Var, int i17, java.lang.String str) {
        androidx.fragment.app.Fragment fragment = this.f107225u;
        if (fragment instanceof com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            long itemId = j5Var.getItemId();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            java.lang.String ek6 = o3Var.ek(itemId, baseFinderFeed != null ? baseFinderFeed.w() : null, qt2Var != null ? qt2Var.getInteger(5) : 0);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
            lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
            lVarArr[3] = new jz5.l("session_buffer", ek6);
            lVarArr[4] = new jz5.l("feed_id", pm0.v.u(hc2.o0.s(j5Var)));
            java.util.Map l17 = kz5.c1.l(lVarArr);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("finder_dstream_feed", str, l17, 1, false);
            l17.putAll(kz5.c1.k(new jz5.l("cluster_name", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).G), new jz5.l("source_feedid", pm0.v.u(((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).f110048z)), new jz5.l("source_session_buffer", ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).F), new jz5.l("cluster_id", pm0.v.u(((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).f110046x)), new jz5.l("cluster_tabtype", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment) fragment).f110047y)), new jz5.l("feed_id", pm0.v.u(hc2.o0.s(j5Var))), new jz5.l(ya.b.INDEX, java.lang.Integer.valueOf(i17))));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("cluster_feature_card", str, l17, 1, false);
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
        this.f106180m.setEnableRefresh(false);
        this.f106180m.setSuperNestedScroll(true);
        androidx.fragment.app.Fragment fragment = this.f107225u;
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
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayContract", "getEmptyView");
        android.view.View l17 = l(com.tencent.mm.R.id.f484229dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View v() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.bsd, null);
        this.f107226v = inflate;
        if (inflate != null) {
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ilh);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPostPlayContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f106180m.setLoadMoreFooter(new android.widget.ImageView(mMActivity));
        }
        return this.f107226v;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayContract", "getHeaderView");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayContract", "getItemDecoration");
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayContract", "getLayoutManager");
        return this.f106184q.d(context);
    }
}
