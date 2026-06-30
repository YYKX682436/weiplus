package com.tencent.mm.plugin.card.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/VipCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "com/tencent/mm/plugin/card/ui/v3/t0", "com/tencent/mm/plugin/card/ui/v3/c1", "com/tencent/mm/plugin/card/ui/v3/f1", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class VipCardListUI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {
    public static final /* synthetic */ int S = 0;
    public boolean A;
    public r45.iu C;
    public java.lang.String D;
    public r45.ru E;
    public r45.iu F;
    public java.lang.String G;
    public java.lang.String H;
    public java.util.List I;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int P;
    public com.tencent.mm.ui.widget.dialog.u3 R;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f95270m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f95271n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f95272o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f95273p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f95274q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f95275r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f95276s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f95277t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f95278u;

    /* renamed from: w, reason: collision with root package name */
    public int f95280w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f95282y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f95283z;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f95269i = "MicroMsg.VipCardListUI";

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f95279v = new java.util.ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public int f95281x = 10;
    public int B = 1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f95268J = "";
    public boolean Q = true;

    public static final void X6(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, "go to card detail ui");
        android.content.Intent intent = new android.content.Intent(vipCardListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        androidx.appcompat.app.AppCompatActivity context = vipCardListUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static final void Y6(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, android.view.MenuItem menuItem) {
        vipCardListUI.L = vipCardListUI.K;
        vipCardListUI.K = 1;
        vipCardListUI.f95268J = java.lang.String.valueOf(menuItem.getTitle());
        vipCardListUI.c7();
        vipCardListUI.Z6(true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 5);
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
    public void T6(int i17, boolean z17) {
        if (this.Q && this.K == 1) {
            Z6(true);
        } else {
            if (z17) {
                return;
            }
            W6();
        }
    }

    public final void Z6(boolean z17) {
        int i17;
        java.lang.String str = "do load vip card list: " + this.M + ", " + this.f95280w + ", " + this.K;
        java.lang.String str2 = this.f95269i;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (this.f95282y && !z17) {
            com.tencent.mars.xlog.Log.w(str2, "already load complete");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f95271n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.N(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
        }
        if (this.M) {
            com.tencent.mars.xlog.Log.w(str2, "is loading");
            return;
        }
        this.M = true;
        int i18 = this.f95280w;
        if (z17) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f95271n;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setHasBottomMore(true);
            i17 = 0;
        } else {
            i17 = i18;
        }
        bu1.b bVar = new bu1.b(i17, this.f95281x, this.f95212d, this.f95213e, this.K);
        bVar.f70649i = true;
        pq5.g l17 = bVar.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.tencent.mm.plugin.card.ui.v3.h1(this, z17)).f(this);
    }

    public final void a7(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.R;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        this.R = u3Var;
    }

    public final void b7() {
        java.util.List list = this.I;
        if (!(list == null || list.isEmpty())) {
            java.util.List list2 = this.I;
            if (list2 != null) {
                removeAllOptionMenu();
                addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.card.ui.v3.u1(this, list2, list2));
                return;
            }
            return;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        if (this.F != null) {
            java.lang.String str = this.H;
            if (!(str == null || str.length() == 0)) {
                c0Var.f310112d = true;
            }
        }
        if (this.C != null) {
            c0Var2.f310112d = true;
        }
        if (c0Var.f310112d || c0Var2.f310112d) {
            removeAllOptionMenu();
            addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.card.ui.v3.r1(this, c0Var, c0Var2));
        }
    }

    public final void c7() {
        boolean z17;
        boolean z18 = true;
        if (this.K <= 0 || !(!this.f95279v.isEmpty()) || this.E == null) {
            android.view.ViewGroup viewGroup = this.f95274q;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("mSortLayout");
                throw null;
            }
            viewGroup.setVisibility(8);
            z17 = false;
        } else {
            android.widget.TextView textView = this.f95275r;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mSortTv");
                throw null;
            }
            textView.setText(this.f95268J);
            android.view.ViewGroup viewGroup2 = this.f95274q;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("mSortLayout");
                throw null;
            }
            viewGroup2.setVisibility(0);
            android.view.ViewGroup viewGroup3 = this.f95274q;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("mSortLayout");
                throw null;
            }
            viewGroup3.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.v1(this));
            z17 = true;
        }
        java.lang.String str = this.G;
        if ((str == null || str.length() == 0) || this.F == null) {
            android.view.ViewGroup viewGroup4 = this.f95276s;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("mTopPhoneVipCardLayout");
                throw null;
            }
            viewGroup4.setVisibility(8);
            z18 = z17;
        } else {
            android.view.ViewGroup viewGroup5 = this.f95276s;
            if (viewGroup5 == null) {
                kotlin.jvm.internal.o.o("mTopPhoneVipCardLayout");
                throw null;
            }
            viewGroup5.setVisibility(0);
            android.widget.TextView textView2 = this.f95277t;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mTopPhoneVipCardTv");
                throw null;
            }
            textView2.setText(this.G);
            android.view.ViewGroup viewGroup6 = this.f95276s;
            if (viewGroup6 == null) {
                kotlin.jvm.internal.o.o("mTopPhoneVipCardLayout");
                throw null;
            }
            viewGroup6.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.w1(this));
        }
        if (z18) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f95278u;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("mVipCardListAdapter");
                throw null;
            }
            android.view.ViewGroup viewGroup7 = this.f95273p;
            if (viewGroup7 != null) {
                wxRecyclerAdapter.T(viewGroup7, 2, false);
                return;
            } else {
                kotlin.jvm.internal.o.o("mHeaderView");
                throw null;
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f95278u;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("mVipCardListAdapter");
            throw null;
        }
        if (this.f95273p != null) {
            wxRecyclerAdapter2.i0(r1.hashCode(), false);
        } else {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
    }

    public final void d7(r45.ni3 ni3Var) {
        java.util.ArrayList arrayList;
        this.E = ni3Var.f381423i;
        java.util.Iterator it = ni3Var.f381422h.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f95279v;
            if (!hasNext) {
                break;
            }
            r45.tt ttVar = (r45.tt) it.next();
            com.tencent.mm.plugin.card.ui.v3.t0 t0Var = new com.tencent.mm.plugin.card.ui.v3.t0();
            kotlin.jvm.internal.o.d(ttVar);
            t0Var.f95376d = ttVar;
            arrayList.add(t0Var);
        }
        if (arrayList.isEmpty()) {
            android.view.ViewGroup viewGroup = this.f95272o;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("mEmptyView");
                throw null;
            }
            viewGroup.setVisibility(0);
        } else {
            android.view.ViewGroup viewGroup2 = this.f95272o;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("mEmptyView");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f95278u;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("mVipCardListAdapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488327q9;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bw_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95270m = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bw8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95271n = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.bw6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f95272o = (android.view.ViewGroup) findViewById3;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f95270m;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("mVipCardListRv");
            throw null;
        }
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$initView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.card.ui.v3.c1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI.this);
            }
        }, this.f95279v, false);
        this.f95278u = wxRecyclerAdapter;
        wxRecyclerAdapter.setHasStableIds(true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f95270m;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mVipCardListRv");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f95278u;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("mVipCardListAdapter");
            throw null;
        }
        wxRecyclerView2.setAdapter(wxRecyclerAdapter2);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(getContext(), 1);
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.f481116l6));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f95270m;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mVipCardListRv");
            throw null;
        }
        wxRecyclerView3.N(i0Var);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f95270m;
        if (wxRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mVipCardListRv");
            throw null;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488325q7, (android.view.ViewGroup) wxRecyclerView4, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f95273p = viewGroup;
        android.view.View findViewById4 = viewGroup.findViewById(com.tencent.mm.R.id.bwb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f95275r = (android.widget.TextView) findViewById4;
        android.view.ViewGroup viewGroup2 = this.f95273p;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById5 = viewGroup2.findViewById(com.tencent.mm.R.id.bwa);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f95274q = (android.view.ViewGroup) findViewById5;
        android.view.ViewGroup viewGroup3 = this.f95273p;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById6 = viewGroup3.findViewById(com.tencent.mm.R.id.bwd);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f95276s = (android.view.ViewGroup) findViewById6;
        android.view.ViewGroup viewGroup4 = this.f95273p;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById7 = viewGroup4.findViewById(com.tencent.mm.R.id.bwe);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f95277t = (android.widget.TextView) findViewById7;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f95278u;
        if (wxRecyclerAdapter3 == null) {
            kotlin.jvm.internal.o.o("mVipCardListAdapter");
            throw null;
        }
        android.view.ViewGroup viewGroup5 = this.f95273p;
        if (viewGroup5 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        wxRecyclerAdapter3.T(viewGroup5, 2, false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f95271n;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        refreshLoadMoreLayout.setEnableRefresh(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f95271n;
        if (refreshLoadMoreLayout2 != null) {
            refreshLoadMoreLayout2.setActionCallback(new com.tencent.mm.plugin.card.ui.v3.j1(this));
        } else {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.v3.VipCardListUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f95283z) {
            com.tencent.mars.xlog.Log.i(this.f95269i, "no data to save snapshot");
            return;
        }
        r45.ni3 ni3Var = new r45.ni3();
        r45.ie ieVar = new r45.ie();
        ni3Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        java.util.Iterator it = this.f95279v.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.card.ui.v3.t0 t0Var = (com.tencent.mm.plugin.card.ui.v3.t0) it.next();
            t0Var.a();
            ni3Var.f381422h.add(t0Var.a());
        }
        ni3Var.f381423i = this.E;
        ni3Var.f381420f = this.f95280w;
        ni3Var.f381427p = this.D;
        ni3Var.f381426o = this.C;
        ni3Var.f381431t = (java.util.LinkedList) this.I;
        ni3Var.f381428q = this.F;
        ni3Var.f381429r = this.H;
        ni3Var.f381430s = this.G;
        pm0.v.K(null, new au1.g(ni3Var));
        r45.qu quVar = new r45.qu();
        quVar.f384259d = this.K;
        quVar.f384261f = this.f95268J;
        quVar.f384260e = this.f95281x;
        pm0.v.K(null, new au1.h(quVar));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.A) {
            Z6(true);
            this.A = false;
        }
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.card.ui.v3.f1.class);
    }
}
