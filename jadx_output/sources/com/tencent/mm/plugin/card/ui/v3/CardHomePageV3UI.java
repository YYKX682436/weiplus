package com.tencent.mm.plugin.card.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/card/ui/v3/a", "com/tencent/mm/plugin/card/ui/v3/j", "com/tencent/mm/plugin/card/ui/v3/l", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes9.dex */
public final class CardHomePageV3UI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f95233y = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f95235e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f95236f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f95237g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f95238h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f95239i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f95240m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f95241n;

    /* renamed from: p, reason: collision with root package name */
    public int f95243p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95244q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95245r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f95246s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f95247t;

    /* renamed from: u, reason: collision with root package name */
    public r45.cu f95248u;

    /* renamed from: v, reason: collision with root package name */
    public r45.xt f95249v;

    /* renamed from: w, reason: collision with root package name */
    public int f95250w;

    /* renamed from: x, reason: collision with root package name */
    public int f95251x;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f95234d = "MicroMsg.CardHomePageV3UI";

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f95242o = new java.util.ArrayList();

    public static final void T6(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "go to card detail: %s", str);
        android.content.Intent intent = new android.content.Intent(cardHomePageV3UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        cardHomePageV3UI.startActivityForResult(intent, 4);
    }

    public final void U6(boolean z17) {
        java.lang.String str = this.f95234d;
        com.tencent.mars.xlog.Log.i(str, "do load home page");
        int i17 = 0;
        if (this.f95244q && !z17) {
            com.tencent.mars.xlog.Log.w(str, "already load complete");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f95236f;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.N(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
        }
        if (this.f95245r) {
            com.tencent.mars.xlog.Log.w(str, "is loading");
            return;
        }
        this.f95245r = true;
        int i18 = this.f95243p;
        if (z17) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f95236f;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setHasBottomMore(true);
        } else {
            i17 = i18;
        }
        pq5.g l17 = new bu1.c(i17, 10).l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.tencent.mm.plugin.card.ui.v3.m(this, z17));
    }

    public final void V6(r45.zt ztVar) {
        if (ztVar != null) {
            java.util.Iterator it = ztVar.f392364d.iterator();
            while (it.hasNext()) {
                r45.yt ytVar = (r45.yt) it.next();
                com.tencent.mm.plugin.card.ui.v3.a aVar = new com.tencent.mm.plugin.card.ui.v3.a();
                kotlin.jvm.internal.o.d(ytVar);
                aVar.f95284d = ytVar;
                this.f95242o.add(aVar);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f95241n;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("mPageAdapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        Y6();
    }

    public final void W6(r45.xt xtVar) {
        if (xtVar != null) {
            this.f95249v = xtVar;
            if (com.tencent.mm.sdk.platformtools.t8.K0(xtVar.f390384d)) {
                return;
            }
            removeAllOptionMenu();
            addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.card.ui.v3.t(this, xtVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(r45.cu r31) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.X6(r45.cu):void");
    }

    public final void Y6() {
        if (this.f95242o.isEmpty()) {
            android.view.View view = this.f95240m;
            if (view == null) {
                kotlin.jvm.internal.o.o("mHomePageEmptyView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f95239i;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("mHomePageRecentlyUsedCardTitleTv");
                throw null;
            }
        }
        android.view.View view2 = this.f95240m;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mHomePageEmptyView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI", "updateRecentlyUsedCardTitleLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = this.f95239i;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("mHomePageRecentlyUsedCardTitleTv");
            throw null;
        }
    }

    public final void Z6(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        android.widget.TextView textView = this.f95239i;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("mHomePageRecentlyUsedCardTitleTv");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488324q6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483729bw1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95235e = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483728bw0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95236f = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f95235e;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("mPageRv");
            throw null;
        }
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI$initView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.card.ui.v3.j(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.this);
            }
        }, this.f95242o, false);
        this.f95241n = wxRecyclerAdapter;
        wxRecyclerAdapter.setHasStableIds(true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f95235e;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mPageRv");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f95241n;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("mPageAdapter");
            throw null;
        }
        wxRecyclerView2.setAdapter(wxRecyclerAdapter2);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(getContext(), 1);
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.f481116l6));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f95235e;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mPageRv");
            throw null;
        }
        wxRecyclerView3.N(i0Var);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f95235e;
        if (wxRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mPageRv");
            throw null;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488322q4, (android.view.ViewGroup) wxRecyclerView4, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f95237g = viewGroup;
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.bv7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f95238h = (android.view.ViewGroup) findViewById3;
        android.view.ViewGroup viewGroup2 = this.f95237g;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById4 = viewGroup2.findViewById(com.tencent.mm.R.id.bv_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f95239i = (android.widget.TextView) findViewById4;
        android.view.ViewGroup viewGroup3 = this.f95237g;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById5 = viewGroup3.findViewById(com.tencent.mm.R.id.bv9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f95240m = findViewById5;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f95241n;
        if (wxRecyclerAdapter3 == null) {
            kotlin.jvm.internal.o.o("mPageAdapter");
            throw null;
        }
        android.view.ViewGroup viewGroup4 = this.f95237g;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        wxRecyclerAdapter3.T(viewGroup4, 2, false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f95236f;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        refreshLoadMoreLayout.setEnableRefresh(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f95236f;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        refreshLoadMoreLayout2.setLimitTopRequest(i65.a.b(getContext(), 1200) - ((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f95236f;
        if (refreshLoadMoreLayout3 == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        refreshLoadMoreLayout3.setRefreshTargetY(((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj)) - i65.a.b(getContext(), 1200));
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f95236f;
        if (refreshLoadMoreLayout4 == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        refreshLoadMoreLayout4.setDamping(1.85f);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f95236f;
        if (refreshLoadMoreLayout5 != null) {
            refreshLoadMoreLayout5.setActionCallback(new com.tencent.mm.plugin.card.ui.v3.p(this));
        } else {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r3 != 5) goto L17;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L1c
            r1 = 2
            if (r3 == r1) goto L18
            r1 = 3
            if (r3 == r1) goto L14
            r1 = 4
            if (r3 == r1) goto L10
            r1 = 5
            if (r3 == r1) goto L14
            goto L1f
        L10:
            r2.U6(r0)
            goto L1f
        L14:
            r2.U6(r0)
            goto L1f
        L18:
            r2.U6(r0)
            goto L1f
        L1c:
            r2.U6(r0)
        L1f:
            super.onActivityResult(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r4.initView()
            r5 = 2131757914(0x7f100b5a, float:1.9146777E38)
            r4.setMMTitle(r5)
            android.content.res.Resources r5 = r4.getResources()
            r0 = 2131099656(0x7f060008, float:1.7811671E38)
            int r5 = r5.getColor(r0)
            r4.setActionbarColor(r5)
            r4.hideActionbarLine()
            com.tencent.mm.plugin.card.ui.v3.q r5 = new com.tencent.mm.plugin.card.ui.v3.q
            r5.<init>(r4)
            r4.setBackBtn(r5)
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r0 = com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_V3_STRING_SYNC
            java.lang.String r1 = ""
            java.lang.Object r5 = r5.m(r0, r1)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            if (r5 == 0) goto L43
            int r2 = r5.length()
            if (r2 != 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = r0
        L44:
            if (r2 == 0) goto L47
            goto L66
        L47:
            r45.ti3 r2 = new r45.ti3
            r2.<init>()
            java.nio.charset.Charset r3 = r26.c.f368867c
            byte[] r5 = r5.getBytes(r3)
            java.lang.String r3 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r5, r3)
            r2.parseFrom(r5)     // Catch: java.lang.Exception -> L5b
            goto L67
        L5b:
            r5 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mm.sdk.platformtools.Log.a(r2, r1, r5)
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L81
            int r5 = r2.f386467g
            r4.f95243p = r5
            java.lang.String r5 = r2.f386471n
            r4.Z6(r5)
            r45.cu r5 = r2.f386466f
            r4.X6(r5)
            r45.zt r5 = r2.f386469i
            r4.V6(r5)
            r45.xt r5 = r2.f386470m
            r4.W6(r5)
        L81:
            r4.U6(r0)
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.f5> r5 = com.tencent.mm.plugin.appbrand.service.f5.class
            i95.m r5 = i95.n0.c(r5)
            com.tencent.mm.plugin.appbrand.service.f5 r5 = (com.tencent.mm.plugin.appbrand.service.f5) r5
            com.tencent.mm.plugin.appbrand.service.x6 r0 = com.tencent.mm.plugin.appbrand.service.x6.H
            r5.Rh(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f95246s) {
            com.tencent.mars.xlog.Log.i(this.f95234d, "no data to save snapshot");
            return;
        }
        r45.ti3 ti3Var = new r45.ti3();
        r45.ie ieVar = new r45.ie();
        ti3Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        ti3Var.f386466f = this.f95248u;
        android.widget.TextView textView = this.f95239i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mHomePageRecentlyUsedCardTitleTv");
            throw null;
        }
        ti3Var.f386471n = textView.getText().toString();
        ti3Var.f386469i = new r45.zt();
        ti3Var.f386467g = this.f95243p;
        ti3Var.f386470m = this.f95249v;
        java.util.Iterator it = this.f95242o.iterator();
        while (it.hasNext()) {
            ti3Var.f386469i.f392364d.add(((com.tencent.mm.plugin.card.ui.v3.a) it.next()).a());
        }
        pm0.v.K(null, new au1.e(ti3Var));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f95247t) {
            U6(true);
            this.f95247t = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.card.ui.v3.l.class);
    }
}
