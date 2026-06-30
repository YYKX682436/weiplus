package com.tencent.mm.plugin.card.ui.v4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "ju1/p", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class CouponAndGiftCardListV4UI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f95414s = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f95415i = "MicroMsg.CouponAndGiftCardListV4UI";

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f95416m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f95417n;

    /* renamed from: o, reason: collision with root package name */
    public ju1.j0 f95418o;

    /* renamed from: p, reason: collision with root package name */
    public ju1.j f95419p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95420q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f95421r;

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
    public void T6(int i17, boolean z17) {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488696a34;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cnr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95416m = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483723bv1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95417n = (android.view.ViewGroup) findViewById2;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f95416m;
        if (loadMoreRecyclerView == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        boolean z17 = true;
        loadMoreRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        ju1.j jVar = new ju1.j(false);
        this.f95419p = jVar;
        jVar.setHasStableIds(true);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f95416m;
        if (loadMoreRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        ju1.j jVar2 = this.f95419p;
        if (jVar2 == null) {
            kotlin.jvm.internal.o.o("mCardsCardListAdapter");
            throw null;
        }
        loadMoreRecyclerView2.setAdapter(jVar2);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(getContext(), 1);
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.f481116l6));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = this.f95416m;
        if (loadMoreRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        loadMoreRecyclerView3.N(i0Var);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView4 = this.f95416m;
        if (loadMoreRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        loadMoreRecyclerView4.setLoadingView(com.tencent.mm.R.layout.f488314pw);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView5 = this.f95416m;
        if (loadMoreRecyclerView5 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        android.view.ViewGroup viewGroup = this.f95417n;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mEmptyView");
            throw null;
        }
        loadMoreRecyclerView5.setEmptyView(viewGroup);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (z17) {
            setMMTitle(com.tencent.mm.R.string.f490787as3);
        } else {
            setMMTitle(stringExtra);
        }
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        hideActionbarLine();
        setBackBtn(new ju1.y(this));
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f95416m;
        if (loadMoreRecyclerView == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new ju1.v(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f95416m;
        if (loadMoreRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        loadMoreRecyclerView2.setOnItemClickListener(new ju1.w(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = this.f95416m;
        if (loadMoreRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mCouponCardListRv");
            throw null;
        }
        loadMoreRecyclerView3.setOnItemLongClickListener(new ju1.x(this));
        androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(this, null).a(ju1.j0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ju1.j0 j0Var = (ju1.j0) a17;
        this.f95418o = j0Var;
        j0Var.f301749d.observe(this, new ju1.q(this));
        ju1.j0 j0Var2 = this.f95418o;
        if (j0Var2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        j0Var2.f301750e.observe(this, new ju1.r(this));
        ju1.j0 j0Var3 = this.f95418o;
        if (j0Var3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        j0Var3.f301751f.observe(this, new ju1.s(this));
        ju1.j0 j0Var4 = this.f95418o;
        if (j0Var4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        j0Var4.f301752g.observe(this, new ju1.t(this));
        ju1.j0 j0Var5 = this.f95418o;
        if (j0Var5 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        j0Var5.f301753h.observe(this, new ju1.u(this));
        ju1.j0 j0Var6 = this.f95418o;
        if (j0Var6 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        j0Var6.O6();
        ju1.j0 j0Var7 = this.f95418o;
        if (j0Var7 != null) {
            j0Var7.N6(this);
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ju1.j0 j0Var = this.f95418o;
        if (j0Var != null) {
            j0Var.R6();
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f95420q) {
            ju1.j0 j0Var = this.f95418o;
            if (j0Var == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            j0Var.N6(this);
            this.f95420q = false;
        }
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(ju1.p.class);
    }
}
