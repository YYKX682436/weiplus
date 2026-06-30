package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickClearTextBtn", "onClickCancelBtn", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLiveBizSearchUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements tj5.w, tj5.n {
    public android.view.View A;
    public final bm2.f1 B = new bm2.f1();
    public int C;
    public java.lang.String D;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f109348v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109349w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSSearchView f109350x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f109351y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f109352z;

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
    }

    @Override // tj5.n
    public boolean G0() {
        hideVKB();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f109350x;
        if (fTSSearchView != null) {
            e7(fTSSearchView.getFtsEditText().getEditText().getText().toString());
            return true;
        }
        kotlin.jvm.internal.o.o("searchView");
        throw null;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final void d7(java.lang.String str, yz5.q qVar) {
        r45.nw1 nw1Var;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.d dVar = (mm2.d) efVar.i(mm2.d.class);
        java.lang.String str2 = dVar != null ? dVar.f328943g : null;
        if (str2 == null || str2.length() == 0) {
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            str2 = c1Var != null ? c1Var.f328882s5 : null;
        }
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String str3 = c1Var2 != null ? c1Var2.f328852o : null;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = 0;
        long j18 = e1Var != null ? e1Var.f328983m : 0L;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var2 != null && (nw1Var = e1Var2.f328988r) != null) {
            j17 = nw1Var.getLong(0);
        }
        com.tencent.mars.xlog.Log.i("finder_live_biz_list", "username = " + str3 + ", objectId = " + pm0.v.u(j18) + ", liveId = " + j17 + ", biz username = " + str2);
        r45.ld2 ld2Var = new r45.ld2();
        ld2Var.set(2, 1);
        ld2Var.set(3, str3);
        ld2Var.set(0, java.lang.Long.valueOf(j18));
        ld2Var.set(1, java.lang.Long.valueOf(j17));
        r45.jx5 jx5Var = new r45.jx5();
        jx5Var.set(0, str2);
        jx5Var.set(1, java.lang.Integer.valueOf(this.C));
        jx5Var.set(4, this.D);
        jx5Var.set(2, 15);
        jx5Var.set(3, str);
        pq5.g l17 = new ke2.o0("/cgi-bin/mmbiz-bin/finderlivesearchscreencastappmsg", 11675, jx5Var, ld2Var, null).l();
        l17.K(new com.tencent.mm.plugin.finder.feed.ui.k8(this, qVar));
        l17.f(this);
    }

    public final void e7(java.lang.String str) {
        this.C = 0;
        this.D = null;
        android.view.View view = this.f109351y;
        if (view == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f109352z;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.A;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", ya.a.SEARCH, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d7(str, new com.tencent.mm.plugin.finder.feed.ui.l8(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aop;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return null;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle extras;
        java.lang.String string;
        if (i17 != 5 || i18 != -1 || intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("finder_biz_live_article_url")) == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("finder_biz_live_article_url", string);
        setResult(-1, intent2);
        finish();
    }

    @Override // tj5.w
    public void onClickBackBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(android.view.View view) {
        hideVKB();
        finish();
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = this.f109350x;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().e();
        } else {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m2d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109351y = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kcj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f109352z = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.imn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.A = findViewById3;
        android.view.View view = this.f109351y;
        if (view == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.h8(this));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) this, false);
        this.f109350x = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = this.f109350x;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(getString(com.tencent.mm.R.string.f490549y8));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = this.f109350x;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = this.f109350x;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = this.f109350x;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().g();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = this.f109350x;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView6);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = this.f109350x;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = this.f109350x;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView8.getFtsEditText().t();
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.akl);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        this.f109349w = recyclerView;
        recyclerView.setAdapter(this.B);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f109349w;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("bizList");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.lr8);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById5;
        this.f109348v = wxRefreshLayout;
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
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = this.f109348v;
        if (wxRefreshLayout2 == null) {
            kotlin.jvm.internal.o.o("refreshLayout");
            throw null;
        }
        wxRefreshLayout2.setOnSimpleAction(new com.tencent.mm.plugin.finder.feed.ui.g8(this));
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.f8(this));
    }
}
