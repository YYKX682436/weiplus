package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLiveBizListUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public static final /* synthetic */ int C = 0;
    public int A;
    public java.lang.String B;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f109341v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109342w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f109343x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f109344y;

    /* renamed from: z, reason: collision with root package name */
    public final bm2.f1 f109345z = new bm2.f1();

    public final void d7(yz5.q qVar) {
        r45.nw1 nw1Var;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.d dVar = (mm2.d) efVar.i(mm2.d.class);
        java.lang.String str = dVar != null ? dVar.f328943g : null;
        if (str == null || str.length() == 0) {
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            str = c1Var != null ? c1Var.f328882s5 : null;
        }
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String str2 = c1Var2 != null ? c1Var2.f328852o : null;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = 0;
        long j18 = e1Var != null ? e1Var.f328983m : 0L;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var2 != null && (nw1Var = e1Var2.f328988r) != null) {
            j17 = nw1Var.getLong(0);
        }
        com.tencent.mars.xlog.Log.i("finder_live_biz_list", "username = " + str2 + ", objectId = " + pm0.v.u(j18) + ", liveId = " + j17 + ", biz username = " + str);
        r45.ld2 ld2Var = new r45.ld2();
        ld2Var.set(2, 1);
        ld2Var.set(3, str2);
        ld2Var.set(0, java.lang.Long.valueOf(j18));
        ld2Var.set(1, java.lang.Long.valueOf(j17));
        r45.ul3 ul3Var = new r45.ul3();
        ul3Var.set(0, str);
        ul3Var.set(1, java.lang.Integer.valueOf(this.A));
        ul3Var.set(3, this.B);
        ul3Var.set(2, 15);
        ul3Var.set(4, 0);
        pq5.g l17 = new ke2.o0("/cgi-bin/mmbiz-bin/finderlivegetprofilescreencast", 9914, ul3Var, ld2Var, null).l();
        l17.K(new com.tencent.mm.plugin.finder.feed.ui.w7(this, qVar));
        l17.f(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aom;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        android.os.Bundle extras;
        if (i17 == 5 && i18 == -1) {
            if (intent == null || (extras = intent.getExtras()) == null || (str = extras.getString("finder_biz_live_article_url")) == null) {
                str = "";
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_biz_live_article_url", str);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m2d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109343x = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.imn);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f109344y = findViewById2;
        android.view.View view = this.f109343x;
        if (view == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.a8(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.akl);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        this.f109342w = recyclerView;
        recyclerView.setAdapter(this.f109345z);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f109342w;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("bizList");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        findViewById(com.tencent.mm.R.id.mdg).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.b8(this));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.lr8);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById4;
        this.f109341v = wxRefreshLayout;
        mn5.a aVar = new mn5.a();
        aVar.f330191a = 0.5f;
        aVar.f330192b = 300;
        aVar.f330193c = false;
        aVar.f330195e = true;
        aVar.f330196f = true;
        aVar.f330197g = true;
        aVar.f330198h = true;
        aVar.f330199i = false;
        aVar.f330200j = true;
        aVar.f330201k = true;
        aVar.f330202l = true;
        aVar.f330203m = false;
        aVar.f330204n = false;
        aVar.f330205o = true;
        aVar.f330206p = false;
        aVar.f330207q = false;
        wxRefreshLayout.setCommonConfig(aVar);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = this.f109341v;
        if (wxRefreshLayout2 == null) {
            kotlin.jvm.internal.o.o("refreshLayout");
            throw null;
        }
        wxRefreshLayout2.setOnSimpleAction(new com.tencent.mm.plugin.finder.feed.ui.z7(this));
        setMMTitle(com.tencent.mm.R.string.dzc);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.x7(this));
        d7(new com.tencent.mm.plugin.finder.feed.ui.c8(this));
    }
}
