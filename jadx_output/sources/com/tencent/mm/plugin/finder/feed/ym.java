package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ym extends com.tencent.mm.plugin.finder.feed.a1 implements ym5.l1 {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f111178u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f111179v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(com.tencent.mm.ui.MMActivity context, int i17, int i18, android.view.View parent) {
        super(context, 0, i17, false, i18, false, 32, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f111178u = parent;
        tu2.b bVar = new tu2.b();
        bVar.f422133c = true;
        bVar.f422131a = false;
        this.f111179v = new com.tencent.mm.plugin.finder.storage.f80(context, bVar, i17, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View A() {
        return this.f111178u;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public float F() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Pa).getValue()).r()).floatValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        int a07;
        boolean z17;
        java.lang.String t17;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null || (a07 = i17 - wxRecyclerAdapter.a0()) < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.feed.model.d5) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - qd2.h.f361767a >= 500) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
                z17 = true;
            }
            qd2.h.f361767a = currentTimeMillis;
            if (z17) {
                com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIContract.ViewCallback", "onItemClick return for fastClick");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, this.f106174d, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            cl0.g gVar = new cl0.g();
            com.tencent.mm.plugin.finder.feed.model.d5 d5Var = (com.tencent.mm.plugin.finder.feed.model.d5) j5Var;
            gVar.h("drama_tab_sessionid", pm0.v.u(d5Var.f107792d.getLong(2)));
            java.lang.Integer num = d5Var.f107797i;
            gVar.h("drama_rec_reason", num);
            java.lang.String str = d5Var.f107796h;
            gVar.h("drama_type", str);
            gVar.o("ref_commentscene", this.f106175e);
            intent.putExtra("CLIENT_KV_REPORTINFO", gVar.toString());
            hc2.e0.a(intent, 0, null, 3, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
            long j17 = d5Var.f107793e;
            java.lang.Long l17 = d5Var.f107799n;
            i0Var.ak(mMActivity, intent, j17, l17 != null ? l17.longValue() : 0L, null, d5Var.f107794f, 0L, null, this.f106175e, d5Var.f107800o);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick enterNativeDramaTimeline fixPos=");
            sb6.append(a07);
            sb6.append(" dramaId=");
            long j18 = d5Var.f107793e;
            sb6.append(pm0.v.u(j18));
            sb6.append(" dramaName=");
            sb6.append(d5Var.f107794f);
            sb6.append(" objectId=");
            sb6.append(pm0.v.u(l17 != null ? l17.longValue() : 0L));
            com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIContract.ViewCallback", sb6.toString());
            com.tencent.mm.ui.MMActivity activity = this.f106174d;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            cl0.g gVar2 = new cl0.g();
            gVar2.h("drama_id", pm0.v.u(j18));
            gVar2.h("drama_rec_reason", num);
            gVar2.h("drama_type", str);
            gVar2.h("drama_tab_sessionid", pm0.v.u(d5Var.f107792d.getLong(2)));
            java.lang.String gVar3 = gVar2.toString();
            kotlin.jvm.internal.o.f(gVar3, "toString(...)");
            java.lang.String t18 = r26.i0.t(gVar3, ",", ";", false);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            long itemId = j5Var.getItemId();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
            com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct finderFlowClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct();
            finderFlowClickStruct.f56845d = V6.getInteger(5);
            finderFlowClickStruct.f56846e = finderFlowClickStruct.b("SessionId", V6.getString(0), true);
            finderFlowClickStruct.f56847f = finderFlowClickStruct.b("ContextId", V6.getString(1), true);
            finderFlowClickStruct.f56848g = finderFlowClickStruct.b("ClickTabContextId", V6.getString(2), true);
            finderFlowClickStruct.f56849h = finderFlowClickStruct.b("ClickFeedid", pm0.v.u(itemId), true);
            finderFlowClickStruct.f56852k = c01.id.c();
            java.lang.String string = V6.getString(9);
            finderFlowClickStruct.f56853l = finderFlowClickStruct.b("PageTag", string != null ? r26.i0.t(string, ",", ";", false) : "", true);
            java.lang.String gVar4 = o3Var.kk().toString();
            kotlin.jvm.internal.o.f(gVar4, "toString(...)");
            finderFlowClickStruct.f56856o = finderFlowClickStruct.b("ScreenInfo", r26.i0.t(gVar4, ",", ";", false), true);
            if (recyclerView != null) {
                java.lang.String jSONArray = o3Var.ck(recyclerView).toString();
                kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
                t17 = r26.i0.t(jSONArray, ",", ";", false);
            } else {
                t17 = r26.i0.t("", ",", ";", false);
            }
            finderFlowClickStruct.f56850i = finderFlowClickStruct.b("AllFeedInfo", t17, true);
            finderFlowClickStruct.f56851j = az2.j.f16133r.b(V6.getInteger(5));
            finderFlowClickStruct.f56854m = finderFlowClickStruct.b("SessionBuffer", o3Var.ek(itemId, null, V6.getInteger(5)), true);
            finderFlowClickStruct.f56864w = finderFlowClickStruct.b("jump_id", V6.getString(16), true);
            finderFlowClickStruct.f56865x = finderFlowClickStruct.b("udf_kv", r26.i0.t(t18, ",", ";", false), true);
            finderFlowClickStruct.f56866y = 0L;
            finderFlowClickStruct.k();
            o3Var.Zk(finderFlowClickStruct);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean Q(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return holder.getItemViewType() == -7 || holder.getItemViewType() == -1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean R() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean S() {
        return false;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.f111179v;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void r(java.util.ArrayList data) {
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar;
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(data, "data");
        super.r(data);
        o().f293104n = null;
        android.view.View l17 = l(com.tencent.mm.R.id.ghf);
        if (l17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(l17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(l17, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View l18 = l(com.tencent.mm.R.id.m6h);
        com.tencent.mm.ui.MMActivity mMActivity = this.f106174d;
        if (l18 != null && (layoutParams = l18.getLayoutParams()) != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = com.tencent.mm.ui.bl.h(mMActivity) + com.tencent.mm.ui.bl.a(mMActivity);
            }
        }
        android.view.View l19 = l(com.tencent.mm.R.id.nuv);
        if (l19 != null) {
            l19.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f478512u));
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f106180m;
        int dimension = (int) this.f111178u.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi);
        int dimension2 = (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        android.view.View inflate = android.view.LayoutInflater.from(mMActivity).inflate(com.tencent.mm.R.layout.d0x, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        refreshLoadMoreLayout.setRefreshHeaderView(inflate);
        refreshLoadMoreLayout.setLimitTopRequest(dimension - dimension2);
        refreshLoadMoreLayout.setRefreshTargetY(dimension2 - dimension);
        refreshLoadMoreLayout.setDamping(1.7f);
        android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
        if (f213435x != null && (mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) f213435x.findViewById(com.tencent.mm.R.id.m6l)) != null) {
            mMProcessBar.setBackgroundResource(com.tencent.mm.R.drawable.avk);
        }
        in5.o.b(this.f106180m.getRecyclerView(), new com.tencent.mm.plugin.finder.feed.xm(this), in5.k.f293079d);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        return new com.tencent.mm.plugin.finder.feed.wm();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f111179v.d(context);
    }
}
