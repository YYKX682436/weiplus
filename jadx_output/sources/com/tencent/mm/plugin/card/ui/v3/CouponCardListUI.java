package com.tencent.mm.plugin.card.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CouponCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "com/tencent/mm/plugin/card/ui/v3/v", "com/tencent/mm/plugin/card/ui/v3/w", "com/tencent/mm/plugin/card/ui/v3/g0", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class CouponCardListUI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {
    public static final /* synthetic */ int L = 0;
    public r45.iu A;
    public java.lang.String B;
    public r45.ru C;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int K;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f95254m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f95255n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f95256o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f95257p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f95258q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f95259r;

    /* renamed from: t, reason: collision with root package name */
    public int f95261t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f95262u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f95264w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f95265x;

    /* renamed from: z, reason: collision with root package name */
    public long f95267z;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f95253i = "MicroMsg.CouponCardListUI";

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f95260s = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public int f95263v = 10;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f95266y = "";
    public java.lang.String D = "";

    /* renamed from: J, reason: collision with root package name */
    public boolean f95252J = true;

    public static final void X6(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "go to card detail ui");
        android.content.Intent intent = new android.content.Intent(couponCardListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        androidx.appcompat.app.AppCompatActivity context = couponCardListUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
    public void T6(int i17, boolean z17) {
        if (this.f95252J && this.E == 1) {
            Y6(true);
        } else {
            if (z17) {
                return;
            }
            W6();
        }
    }

    public final void Y6(boolean z17) {
        int i17;
        java.lang.String str = "do load vip card list: " + this.G + ", " + this.f95261t + ", " + this.E;
        java.lang.String str2 = this.f95253i;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (this.f95262u && !z17) {
            com.tencent.mars.xlog.Log.w(str2, "already load complete");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f95255n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.N(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
        }
        if (this.G) {
            com.tencent.mars.xlog.Log.w(str2, "is loading");
            return;
        }
        this.G = true;
        int i18 = this.f95261t;
        if (z17) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f95255n;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
            refreshLoadMoreLayout2.setHasBottomMore(true);
            i17 = 0;
        } else {
            i17 = i18;
        }
        bu1.a aVar = new bu1.a(i17, this.f95263v, this.f95212d, this.f95213e, 1, this.E);
        aVar.f70649i = true;
        pq5.g l17 = aVar.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.tencent.mm.plugin.card.ui.v3.i0(this, z17)).f(this);
    }

    public final void Z6() {
        if (this.E <= 0 || !(!this.f95260s.isEmpty())) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f95259r;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("mCouponCardListAdapter");
                throw null;
            }
            if (this.f95257p == null) {
                kotlin.jvm.internal.o.o("mHeaderView");
                throw null;
            }
            wxRecyclerAdapter.i0(r5.hashCode(), false);
        } else {
            android.widget.TextView textView = this.f95258q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mSortTv");
                throw null;
            }
            textView.setText(this.D);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f95259r;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("mCouponCardListAdapter");
                throw null;
            }
            android.view.ViewGroup viewGroup = this.f95257p;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("mHeaderView");
                throw null;
            }
            wxRecyclerAdapter2.T(viewGroup, 2, false);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f95259r;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("mCouponCardListAdapter");
            throw null;
        }
    }

    public final void a7(r45.ud3 ud3Var) {
        java.util.ArrayList arrayList;
        r45.au auVar = ud3Var.f387259h;
        if (auVar == null || auVar.f370260d.isEmpty()) {
            return;
        }
        java.util.Iterator it = ud3Var.f387259h.f370260d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f95260s;
            if (!hasNext) {
                break;
            }
            r45.wt wtVar = (r45.wt) it.next();
            com.tencent.mm.plugin.card.ui.v3.w wVar = new com.tencent.mm.plugin.card.ui.v3.w(this);
            kotlin.jvm.internal.o.d(wtVar);
            wVar.f95391d = wtVar;
            arrayList.add(wVar);
        }
        if (arrayList.isEmpty()) {
            android.view.ViewGroup viewGroup = this.f95256o;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("mEmptyView");
                throw null;
            }
            viewGroup.setVisibility(0);
        } else {
            android.view.ViewGroup viewGroup2 = this.f95256o;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("mEmptyView");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f95259r;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("mCouponCardListAdapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488320q2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bw_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95254m = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bw8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95255n = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.bw6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f95256o = (android.view.ViewGroup) findViewById3;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f95254m;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$initView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.card.ui.v3.g0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI.this);
            }
        }, this.f95260s, false);
        this.f95259r = wxRecyclerAdapter;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f95254m;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f95254m;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488325q7, (android.view.ViewGroup) wxRecyclerView3, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f95257p = viewGroup;
        viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, i65.a.b(getContext(), 12));
        android.view.ViewGroup viewGroup2 = this.f95257p;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById4 = viewGroup2.findViewById(com.tencent.mm.R.id.bwb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f95258q = (android.widget.TextView) findViewById4;
        android.view.ViewGroup viewGroup3 = this.f95257p;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        viewGroup3.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.j0(this));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f95259r;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListAdapter");
            throw null;
        }
        android.view.ViewGroup viewGroup4 = this.f95257p;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.o.o("mHeaderView");
            throw null;
        }
        wxRecyclerAdapter2.T(viewGroup4, 2, false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f95255n;
        if (refreshLoadMoreLayout == null) {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
        refreshLoadMoreLayout.setEnableRefresh(false);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f95255n;
        if (refreshLoadMoreLayout2 != null) {
            refreshLoadMoreLayout2.setActionCallback(new com.tencent.mm.plugin.card.ui.v3.l0(this));
        } else {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f95264w) {
            com.tencent.mars.xlog.Log.i(this.f95253i, "no data to save snapshot");
            return;
        }
        r45.ud3 ud3Var = new r45.ud3();
        r45.ie ieVar = new r45.ie();
        ud3Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        ud3Var.f387259h = new r45.au();
        java.util.Iterator it = this.f95260s.iterator();
        while (it.hasNext()) {
            ud3Var.f387259h.f370260d.add(((com.tencent.mm.plugin.card.ui.v3.w) it.next()).a());
        }
        ud3Var.f387264p = this.C;
        ud3Var.f387257f = this.f95261t;
        ud3Var.f387261m = this.B;
        ud3Var.f387260i = this.A;
        pm0.v.K(null, new au1.b(ud3Var));
        r45.qu quVar = new r45.qu();
        quVar.f384259d = this.E;
        quVar.f384261f = this.D;
        quVar.f384260e = this.f95263v;
        pm0.v.K(null, new au1.d(quVar));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(this.f95253i, "do get mch infoset: %s", java.lang.Boolean.valueOf(this.f95265x));
        if (this.f95265x) {
            au1.o oVar = new au1.o(this.f95266y, this.f95267z, this.f95212d, this.f95213e, this.E, 1);
            oVar.f70649i = true;
            oVar.l().h(new com.tencent.mm.plugin.card.ui.v3.h0(this)).f(this);
        }
    }
}
