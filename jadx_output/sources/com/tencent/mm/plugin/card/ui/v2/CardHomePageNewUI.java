package com.tencent.mm.plugin.card.ui.v2;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "iu1/a", "iu1/b", "iu1/c", "iu1/m", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes9.dex */
public final class CardHomePageNewUI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {
    public static final int N = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40);
    public static final int P;
    public boolean A;
    public boolean B;
    public int D;
    public int E;
    public boolean G;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public r45.wt f95182J;
    public boolean K;
    public android.app.Dialog L;
    public au1.p M;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f95183i;

    /* renamed from: m, reason: collision with root package name */
    public iu1.c f95184m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f95185n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f95186o;

    /* renamed from: p, reason: collision with root package name */
    public int f95187p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95189r;

    /* renamed from: w, reason: collision with root package name */
    public iu1.a f95194w;

    /* renamed from: x, reason: collision with root package name */
    public iu1.a f95195x;

    /* renamed from: y, reason: collision with root package name */
    public iu1.a f95196y;

    /* renamed from: q, reason: collision with root package name */
    public int f95188q = 10;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f95190s = "";

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f95191t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f95192u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f95193v = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f95197z = true;
    public int C = -1;
    public final java.util.ArrayList F = new java.util.ArrayList();
    public r45.xt H = new r45.xt();

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
        P = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
    }

    public static final void X6(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        if (cardHomePageNewUI.F != null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardHomePageNewUI.getContext(), 1, false);
            k0Var.f211872n = new iu1.b0(cardHomePageNewUI);
            k0Var.f211881s = new iu1.d0(cardHomePageNewUI);
            k0Var.v();
        }
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
    public void T6(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "location finish: [%s, %s], ret: %s, isOk: %s", java.lang.Float.valueOf(this.f95212d), java.lang.Float.valueOf(this.f95213e), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (!this.f95197z) {
            if (z17) {
                return;
            }
            W6();
            return;
        }
        if (this.D == 1 && i17 < 0 && this.E == 1) {
            this.E = 0;
            if (i17 == -2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 30);
            }
        }
        Y6();
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "do get card Home page: %s, %s", java.lang.Boolean.valueOf(this.f95189r), java.lang.Boolean.valueOf(this.A));
        boolean z17 = this.K;
        if (z17 || !(this.f95189r || this.A)) {
            this.A = true;
            r45.qu quVar = null;
            if (z17) {
                android.view.ViewGroup viewGroup = this.f95186o;
                if (viewGroup == null) {
                    kotlin.jvm.internal.o.o("mLoadingView2");
                    throw null;
                }
                viewGroup.setVisibility(0);
            }
            java.util.Iterator it = this.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.qu quVar2 = (r45.qu) it.next();
                if (quVar2.f384259d == this.E) {
                    quVar = quVar2;
                    break;
                }
            }
            this.f95188q = quVar != null ? quVar.f384260e : 10;
            android.app.Dialog dialog = this.L;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (this.f95192u.isEmpty()) {
                this.L = db5.e1.Q(getContext(), getContext().getString(com.tencent.mm.R.string.f490386tj), getContext().getString(com.tencent.mm.R.string.ggc), false, true, null);
            }
            au1.p pVar = new au1.p(this.f95187p, this.f95188q, this.f95212d, this.f95213e, 1, this.E);
            this.M = pVar;
            pVar.f70649i = true;
            pVar.l().h(new iu1.o(this)).f(this);
        }
    }

    public final void Z6() {
        r45.xt xtVar = this.H;
        if (xtVar == null || com.tencent.mm.sdk.platformtools.t8.K0(xtVar.f390384d)) {
            return;
        }
        removeAllOptionMenu();
        addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new iu1.a0(this, xtVar));
    }

    public final void a7(r45.au auVar, r45.eu euVar, r45.du duVar) {
        int i17 = 0;
        java.util.ArrayList arrayList = this.f95192u;
        if (auVar != null) {
            java.util.LinkedList card_home_page_element = auVar.f370260d;
            kotlin.jvm.internal.o.f(card_home_page_element, "card_home_page_element");
            if (!card_home_page_element.isEmpty()) {
                java.util.Iterator it = auVar.f370260d.iterator();
                while (it.hasNext()) {
                    r45.wt wtVar = (r45.wt) it.next();
                    iu1.a aVar = new iu1.a(this);
                    aVar.f294831a = wtVar;
                    aVar.f294832b = 0;
                    arrayList.add(aVar);
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f95193v;
        if (euVar != null) {
            java.util.LinkedList card_home_page_element2 = euVar.f373727d;
            kotlin.jvm.internal.o.f(card_home_page_element2, "card_home_page_element");
            if (!card_home_page_element2.isEmpty()) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(euVar.f373728e)) {
                    euVar.f373728e = getString(com.tencent.mm.R.string.asr);
                }
                if (this.f95195x == null) {
                    iu1.a aVar2 = new iu1.a(this);
                    this.f95195x = aVar2;
                    aVar2.f294832b = 1;
                }
                iu1.a aVar3 = this.f95195x;
                kotlin.jvm.internal.o.d(aVar3);
                java.lang.String section_title = euVar.f373728e;
                kotlin.jvm.internal.o.f(section_title, "section_title");
                aVar3.f294833c = section_title;
                java.util.Iterator it6 = euVar.f373727d.iterator();
                while (it6.hasNext()) {
                    r45.wt wtVar2 = (r45.wt) it6.next();
                    iu1.a aVar4 = new iu1.a(this);
                    aVar4.f294831a = wtVar2;
                    aVar4.f294832b = 2;
                    arrayList2.add(aVar4);
                }
            }
        }
        java.util.ArrayList arrayList3 = this.f95191t;
        if (duVar != null) {
            java.util.LinkedList card_home_page_top_cell = duVar.f372747d;
            kotlin.jvm.internal.o.f(card_home_page_top_cell, "card_home_page_top_cell");
            if (!card_home_page_top_cell.isEmpty()) {
                java.util.Iterator it7 = card_home_page_top_cell.iterator();
                while (it7.hasNext()) {
                    int i18 = i17 + 1;
                    r45.bu buVar = (r45.bu) it7.next();
                    iu1.a aVar5 = new iu1.a(this);
                    aVar5.f294836f = buVar;
                    aVar5.f294832b = 6;
                    if (i17 == card_home_page_top_cell.size() - 1) {
                        aVar5.f294837g = true;
                    }
                    arrayList3.add(aVar5);
                    i17 = i18;
                }
            }
        }
        iu1.a aVar6 = new iu1.a(this);
        this.f95196y = aVar6;
        aVar6.f294832b = 5;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty() || !(!arrayList3.isEmpty())) {
            this.f95194w = null;
            return;
        }
        iu1.a aVar7 = new iu1.a(this);
        this.f95194w = aVar7;
        aVar7.f294832b = 7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488317pz;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bvz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById;
        this.f95183i = loadMoreRecyclerView;
        loadMoreRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        iu1.c cVar = new iu1.c(this);
        this.f95184m = cVar;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f95183i;
        if (loadMoreRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        loadMoreRecyclerView2.setAdapter(cVar);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = this.f95183i;
        if (loadMoreRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        boolean z17 = false;
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488314pw, (android.view.ViewGroup) loadMoreRecyclerView3, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f95185n = (android.view.ViewGroup) inflate;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.bvy);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95186o = (android.view.ViewGroup) findViewById2;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView4 = this.f95183i;
        if (loadMoreRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        android.view.ViewGroup viewGroup = this.f95185n;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mLoadingView");
            throw null;
        }
        loadMoreRecyclerView4.setLoadingView(viewGroup);
        iu1.q qVar = new iu1.q(this);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView5 = this.f95183i;
        if (loadMoreRecyclerView5 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        loadMoreRecyclerView5.N(qVar);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView6 = this.f95183i;
        if (loadMoreRecyclerView6 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        loadMoreRecyclerView6.setOnLoadingStateChangedListener(new iu1.r(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView7 = this.f95183i;
        if (loadMoreRecyclerView7 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        loadMoreRecyclerView7.setOnItemClickListener(new iu1.s(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView8 = this.f95183i;
        if (loadMoreRecyclerView8 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        loadMoreRecyclerView8.setOnItemLongClickListener(new iu1.w(this));
        r45.au auVar = new r45.au();
        r45.eu euVar = new r45.eu();
        r45.du duVar = new r45.du();
        r45.ru ruVar = new r45.ru();
        r45.xt xtVar = this.H;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardSnapshotMgr", "load home page snapshot");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_STORE_LIST_STRING_SYNC, null);
        boolean z18 = true;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            auVar.parseFrom(bytes);
            z17 = true;
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_UNDER_LIST_STRING_SYNC, null);
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            euVar.parseFrom(bytes2);
            z17 = true;
        }
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_TOP_LIST_STRING_SYNC, null);
        if (str3 != null) {
            byte[] bytes3 = str3.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
            duVar.parseFrom(bytes3);
            z17 = true;
        }
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_SORT_INFO_LIST_STRING_SYNC, null);
        if (str4 != null) {
            byte[] bytes4 = str4.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes4, "getBytes(...)");
            ruVar.parseFrom(bytes4);
            z17 = true;
        }
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_FAQ_ITEM_STRING_SYNC, null);
        if (str5 == null) {
            z18 = z17;
        } else if (xtVar != null) {
            byte[] bytes5 = str5.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes5, "getBytes(...)");
            xtVar.parseFrom(bytes5);
        }
        java.util.ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.addAll(ruVar.f385209d);
        a7(auVar, euVar, duVar);
        if (!z18) {
            java.util.ArrayList arrayList2 = this.f95192u;
            if (arrayList2.isEmpty() && this.f95193v.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "show init view");
                iu1.a aVar = new iu1.a(this);
                aVar.f294832b = 3;
                iu1.a aVar2 = new iu1.a(this);
                aVar2.f294832b = 3;
                arrayList2.add(aVar);
                arrayList2.add(aVar2);
            }
        }
        Z6();
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView9 = this.f95183i;
        if (loadMoreRecyclerView9 == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = loadMoreRecyclerView9.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        setMMTitle(com.tencent.mm.R.string.f490795at5);
        this.I = getIntent().getIntExtra("key_home_page_from_scene", 0);
        initView();
        this.D = 1;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SORT_TYPE_INT_SYNC, 1);
        this.E = r17;
        if (r17 == 0) {
            this.E = 1;
        }
        if (this.D == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 14);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "on create, scene: %s", java.lang.Integer.valueOf(this.I));
        setBackBtn(new iu1.x(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 4);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 8, 2);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.CardHomePageNewUI)).Rj(this, iy1.a.Cards);
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SORT_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.E));
        au1.p pVar = this.M;
        java.lang.String str = null;
        if (pVar != null) {
            pVar.j();
            this.M = null;
        }
        wt1.f0.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "do save snap shot");
        r45.au auVar = new r45.au();
        auVar.f370260d = new java.util.LinkedList();
        java.util.Iterator it = this.f95192u.iterator();
        while (it.hasNext()) {
            r45.wt wtVar = ((iu1.a) it.next()).f294831a;
            if (wtVar != null) {
                auVar.f370260d.add(wtVar);
            }
        }
        r45.eu euVar = new r45.eu();
        iu1.a aVar = this.f95195x;
        if (aVar != null) {
            java.lang.String str2 = aVar.f294833c;
            if (str2 == null) {
                kotlin.jvm.internal.o.o("sectionTitle");
                throw null;
            }
            str = str2;
        }
        euVar.f373728e = str;
        euVar.f373727d = new java.util.LinkedList();
        java.util.Iterator it6 = this.f95193v.iterator();
        while (it6.hasNext()) {
            r45.wt wtVar2 = ((iu1.a) it6.next()).f294831a;
            if (wtVar2 != null) {
                euVar.f373727d.add(wtVar2);
            }
        }
        r45.du duVar = new r45.du();
        java.util.Iterator it7 = this.f95191t.iterator();
        while (it7.hasNext()) {
            r45.bu buVar = ((iu1.a) it7.next()).f294836f;
            if (buVar != null) {
                duVar.f372747d.add(buVar);
            }
        }
        r45.ru ruVar = new r45.ru();
        ruVar.f385209d.addAll(this.F);
        r45.xt xtVar = this.H;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardSnapshotMgr", "save home page snapshot");
        byte[] byteArray = auVar.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        java.nio.charset.Charset charset = r26.c.f368867c;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_STORE_LIST_STRING_SYNC, new java.lang.String(byteArray, charset));
        byte[] byteArray2 = euVar.toByteArray();
        kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_UNDER_LIST_STRING_SYNC, new java.lang.String(byteArray2, charset));
        byte[] byteArray3 = duVar.toByteArray();
        kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_TOP_LIST_STRING_SYNC, new java.lang.String(byteArray3, charset));
        byte[] byteArray4 = ruVar.toByteArray();
        kotlin.jvm.internal.o.f(byteArray4, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_SORT_INFO_LIST_STRING_SYNC, new java.lang.String(byteArray4, charset));
        if (xtVar != null) {
            byte[] byteArray5 = xtVar.toByteArray();
            kotlin.jvm.internal.o.f(byteArray5, "toByteArray(...)");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_FAQ_ITEM_STRING_SYNC, new java.lang.String(byteArray5, charset));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        r45.wt wtVar;
        super.onResume();
        if (!this.B || (wtVar = this.f95182J) == null || this.C == -1) {
            if (this.G) {
                this.K = true;
                this.f95187p = 0;
                this.G = false;
                Y6();
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.d(wtVar);
        java.lang.String card_pack_merchant_id = wtVar.f389427d;
        kotlin.jvm.internal.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        r45.wt wtVar2 = this.f95182J;
        kotlin.jvm.internal.o.d(wtVar2);
        long j17 = wtVar2.f389444x;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "do get mch infoset: %s", card_pack_merchant_id);
        new au1.o(card_pack_merchant_id, j17, this.f95212d, this.f95213e, this.E, 0).l().h(new iu1.p(this, card_pack_merchant_id));
        this.B = false;
        this.f95182J = null;
    }
}
