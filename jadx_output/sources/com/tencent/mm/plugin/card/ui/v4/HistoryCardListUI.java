package com.tencent.mm.plugin.card.ui.v4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v4/HistoryCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "ju1/u0", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class HistoryCardListUI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f95422r = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f95423i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f95424m;

    /* renamed from: n, reason: collision with root package name */
    public ju1.k f95425n;

    /* renamed from: o, reason: collision with root package name */
    public ju1.j f95426o;

    /* renamed from: p, reason: collision with root package name */
    public int f95427p = 1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f95428q;

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
        this.f95423i = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483723bv1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95424m = (android.view.ViewGroup) findViewById2;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483724bv2);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483722bv0);
        weImageView.setImageResource(com.tencent.mm.R.raw.icon_history_card_empty);
        weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f95423i;
        if (loadMoreRecyclerView == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        boolean z17 = true;
        loadMoreRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        ju1.j jVar = new ju1.j(true);
        this.f95426o = jVar;
        jVar.setHasStableIds(true);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f95423i;
        if (loadMoreRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        ju1.j jVar2 = this.f95426o;
        if (jVar2 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListAdapter");
            throw null;
        }
        loadMoreRecyclerView2.setAdapter(jVar2);
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(getContext(), 1);
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.f481116l6));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = this.f95423i;
        if (loadMoreRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        loadMoreRecyclerView3.N(i0Var);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView4 = this.f95423i;
        if (loadMoreRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        loadMoreRecyclerView4.setLoadingView(com.tencent.mm.R.layout.f488314pw);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView5 = this.f95423i;
        if (loadMoreRecyclerView5 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        android.view.ViewGroup viewGroup = this.f95424m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mEmptyView");
            throw null;
        }
        loadMoreRecyclerView5.setEmptyView(viewGroup);
        textView.setText(com.tencent.mm.R.string.asz);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f95427p = getIntent().getIntExtra("card_type", 2);
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (z17) {
            setMMTitle(com.tencent.mm.R.string.jxt);
        } else {
            setMMTitle(stringExtra);
        }
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        hideActionbarLine();
        setBackBtn(new ju1.f1(this));
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ju1.k kVar;
        super.onCreate(bundle);
        initView();
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f95423i;
        if (loadMoreRecyclerView == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new ju1.a1(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f95423i;
        if (loadMoreRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        loadMoreRecyclerView2.setOnItemClickListener(new ju1.b1(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = this.f95423i;
        if (loadMoreRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mHistoryCardListRv");
            throw null;
        }
        loadMoreRecyclerView3.setOnItemLongClickListener(new ju1.c1(this));
        int i17 = this.f95427p;
        if (i17 == 2) {
            androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(this, null).a(ju1.n0.class);
            kotlin.jvm.internal.o.d(a17);
            kVar = (ju1.k) a17;
        } else if (i17 != 3) {
            androidx.lifecycle.c1 a18 = androidx.lifecycle.k1.a(this, null).a(ju1.n0.class);
            kotlin.jvm.internal.o.d(a18);
            kVar = (ju1.k) a18;
        } else {
            androidx.lifecycle.c1 a19 = androidx.lifecycle.k1.a(this, null).a(ju1.o1.class);
            kotlin.jvm.internal.o.d(a19);
            kVar = (ju1.k) a19;
        }
        this.f95425n = kVar;
        kVar.f301749d.observe(this, new ju1.v0(this));
        ju1.k kVar2 = this.f95425n;
        if (kVar2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        kVar2.f301750e.observe(this, new ju1.w0(this));
        ju1.k kVar3 = this.f95425n;
        if (kVar3 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        kVar3.f301751f.observe(this, new ju1.x0(this));
        ju1.k kVar4 = this.f95425n;
        if (kVar4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        kVar4.f301752g.observe(this, new ju1.y0(this));
        ju1.k kVar5 = this.f95425n;
        if (kVar5 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        kVar5.f301753h.observe(this, new ju1.z0(this));
        ju1.k kVar6 = this.f95425n;
        if (kVar6 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        kVar6.O6();
        ju1.k kVar7 = this.f95425n;
        if (kVar7 != null) {
            kVar7.N6(this);
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ju1.k kVar = this.f95425n;
        if (kVar != null) {
            kVar.R6();
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(ju1.u0.class);
    }
}
