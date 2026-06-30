package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class bs extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f106411u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f106412v;

    /* renamed from: w, reason: collision with root package name */
    public int f106413w;

    /* renamed from: x, reason: collision with root package name */
    public int f106414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17, androidx.fragment.app.Fragment fragment) {
        super(context, i17, i18, z17, 0, false, 48, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f106411u = fragment;
        this.f106413w = 337;
        this.f106414x = 336;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void J(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        androidx.fragment.app.Fragment fragment = this.f106411u;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (i17 < 0 || i17 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(i17);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j5Var.getItemId()));
        lVarArr[1] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[4] = new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j5Var.getItemId(), null, V6 != null ? V6.getInteger(5) : 0));
        d2Var.n(itemView, "finder_dstream_feed", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.c1.k(lVarArr), (r20 & 128) != 0 ? null : null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("Finder.FinderRecommendReasonContract", "onGridItemClick");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            com.tencent.mars.xlog.Log.i("Finder.FinderRecommendReasonContract", "onClick " + a07 + " id:" + ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() + ", pos:" + a07);
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = z().f107156e;
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader");
            com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = (com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader) baseFeedLoader;
            intent.putExtra("KEY_BY_PASS", finderRecommendReasonLoader.f107622d);
            intent.putExtra("KEY_PREFETCH", finderRecommendReasonLoader.f107623e);
            intent.putExtra("KEY_BUSINESS_TYPE", finderRecommendReasonLoader.f107624f);
            intent.putExtra("KEY_JUMP_FEEDID", finderRecommendReasonLoader.f107625g);
            intent.putExtra("KEY_SOURCE_SESSION_BUFFER", finderRecommendReasonLoader.f107626h);
            intent.putExtra("KEY_CLI_REPORT_INFO", finderRecommendReasonLoader.f107628m);
            intent.putExtra("key_click_feed_id", j5Var.getItemId());
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            iyVar.c(this.f106174d, intent);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f444181d, getRecyclerView(), baseFinderFeed.getFeedObject().getId(), z().f107156e.getDataListJustForAdapter(), null, 8, null), 14, null);
            androidx.fragment.app.Fragment fragment = this.f106411u;
            if (fragment instanceof com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment) {
                ((com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment) fragment).B = 2;
            }
            intent.putExtra("KEY_SINGLE_COMMENT_SCENE", this.f106413w);
            intent.putExtra("KEY_DOUBLE_COMMENT_SCENE", this.f106414x);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            i0Var.getClass();
            intent.setClass(activity, com.tencent.mm.plugin.finder.feed.ui.FinderRecommendReasonTimelineUI.class);
            iyVar.c(activity, intent);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRecommendReasonTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterRecommendReasonTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            kotlin.jvm.internal.o.g(fragment, "fragment");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long itemId = j5Var.getItemId();
            java.lang.String w17 = baseFinderFeed.w();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
            java.lang.String jSONObject = baseFinderFeed.getUdfKv().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, itemId, w17, recyclerView, 0, jSONObject, 0L, null, 208, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
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
        androidx.fragment.app.Fragment fragment = this.f106411u;
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
        com.tencent.mars.xlog.Log.i("Finder.FinderRecommendReasonContract", "getEmptyView");
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
        this.f106412v = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f106412v;
        android.view.View findViewById2 = view != null ? view.findViewById(com.tencent.mm.R.id.ilh) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderRecommendReasonContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f106180m.setLoadMoreFooter(new android.widget.ImageView(mMActivity));
        return this.f106412v;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        com.tencent.mars.xlog.Log.i("Finder.FinderRecommendReasonContract", "getHeaderView");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        com.tencent.mars.xlog.Log.i("Finder.FinderRecommendReasonContract", "getItemDecoration");
        ((com.tencent.mm.plugin.finder.storage.jj0) this.f106184q).getClass();
        return new com.tencent.mm.plugin.finder.storage.ij0();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FinderRecommendReasonContract", "getLayoutManager");
        return this.f106184q.d(context);
    }
}
