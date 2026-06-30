package com.tencent.mm.plugin.card.ui.v2;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "iu1/a1", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class CardTicketListUI extends com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI {
    public static final /* synthetic */ int B = 0;
    public au1.r A;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f95217i;

    /* renamed from: m, reason: collision with root package name */
    public iu1.v0 f95218m;

    /* renamed from: n, reason: collision with root package name */
    public int f95219n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95221p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95222q;

    /* renamed from: w, reason: collision with root package name */
    public iu1.w0 f95228w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f95229x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f95230y;

    /* renamed from: o, reason: collision with root package name */
    public final int f95220o = 10;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95223r = true;

    /* renamed from: s, reason: collision with root package name */
    public int f95224s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f95225t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f95226u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f95227v = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final iu1.o1 f95231z = new iu1.o1(this);

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI
    public void T6(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", java.lang.Float.valueOf(this.f95212d), java.lang.Float.valueOf(this.f95213e), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final void X6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "do delete ticket: %s", str);
        Z6(java.lang.Boolean.TRUE);
        new au1.j(str).l().h(new iu1.b1(this, str));
    }

    public final void Y6(boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f95219n);
        int i17 = this.f95220o;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "do get ticket: %s, %s, %s, %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f95221p), java.lang.Boolean.valueOf(this.f95222q));
        if (z17 || !(this.f95221p || this.f95222q)) {
            this.f95222q = true;
            if (z17) {
                int i18 = this.f95219n;
                if (i18 * 2 >= i17) {
                    i17 = i18 * 2;
                }
                this.f95219n = 0;
            }
            au1.r rVar = new au1.r(this.f95219n, i17, this.f95212d, this.f95213e);
            this.A = rVar;
            rVar.l().h(new iu1.c1(this, z17));
        }
    }

    public final void Z6(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f95230y;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        this.f95230y = u3Var;
    }

    public final void a7(r45.i45 i45Var, r45.j45 j45Var, r45.j45 j45Var2, r45.k45 k45Var) {
        r45.nj4 nj4Var;
        java.util.ArrayList arrayList = this.f95227v;
        if (i45Var != null) {
            arrayList.clear();
            java.util.LinkedList page_ticket_jump_element = i45Var.f376724d;
            kotlin.jvm.internal.o.f(page_ticket_jump_element, "page_ticket_jump_element");
            if (!page_ticket_jump_element.isEmpty()) {
                java.util.Iterator it = i45Var.f376724d.iterator();
                while (it.hasNext()) {
                    r45.h45 h45Var = (r45.h45) it.next();
                    iu1.w0 w0Var = new iu1.w0();
                    w0Var.f294973c = h45Var;
                    w0Var.f294971a = 1;
                    arrayList.add(w0Var);
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f95225t;
        if (j45Var != null) {
            java.util.LinkedList page_ticket_element = j45Var.f377579d;
            kotlin.jvm.internal.o.f(page_ticket_element, "page_ticket_element");
            if (!page_ticket_element.isEmpty()) {
                java.util.Iterator it6 = j45Var.f377579d.iterator();
                while (it6.hasNext()) {
                    r45.g45 g45Var = (r45.g45) it6.next();
                    iu1.w0 w0Var2 = new iu1.w0();
                    w0Var2.f294974d = g45Var;
                    w0Var2.f294971a = 2;
                    arrayList2.add(w0Var2);
                }
            }
        }
        java.util.ArrayList arrayList3 = this.f95226u;
        if (j45Var2 != null) {
            java.util.LinkedList page_ticket_element2 = j45Var2.f377579d;
            kotlin.jvm.internal.o.f(page_ticket_element2, "page_ticket_element");
            if (!page_ticket_element2.isEmpty()) {
                java.util.Iterator it7 = j45Var2.f377579d.iterator();
                while (it7.hasNext()) {
                    r45.g45 g45Var2 = (r45.g45) it7.next();
                    iu1.w0 w0Var3 = new iu1.w0();
                    w0Var3.f294974d = g45Var2;
                    w0Var3.f294971a = 2;
                    arrayList3.add(w0Var3);
                }
            }
        }
        if (k45Var != null && (nj4Var = k45Var.f378365d) != null) {
            iu1.w0 w0Var4 = new iu1.w0();
            this.f95228w = w0Var4;
            w0Var4.f294971a = 3;
            w0Var4.f294975e = nj4Var;
        }
        if (((!arrayList.isEmpty()) || (!arrayList2.isEmpty())) && ((!arrayList3.isEmpty()) || this.f95228w != null)) {
            iu1.v0 v0Var = this.f95218m;
            if (v0Var == null) {
                kotlin.jvm.internal.o.o("mTicketAdapter");
                throw null;
            }
            java.lang.String string = getString(com.tencent.mm.R.string.f490810aw2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            v0Var.E(string);
            iu1.v0 v0Var2 = this.f95218m;
            if (v0Var2 == null) {
                kotlin.jvm.internal.o.o("mTicketAdapter");
                throw null;
            }
            java.lang.String string2 = getString(com.tencent.mm.R.string.atj);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            v0Var2.B(string2);
        } else {
            iu1.v0 v0Var3 = this.f95218m;
            if (v0Var3 == null) {
                kotlin.jvm.internal.o.o("mTicketAdapter");
                throw null;
            }
            v0Var3.E("");
            iu1.v0 v0Var4 = this.f95218m;
            if (v0Var4 == null) {
                kotlin.jvm.internal.o.o("mTicketAdapter");
                throw null;
            }
            v0Var4.B("");
        }
        iu1.v0 v0Var5 = this.f95218m;
        if (v0Var5 == null) {
            kotlin.jvm.internal.o.o("mTicketAdapter");
            throw null;
        }
        iu1.w0 w0Var5 = this.f95228w;
        v0Var5.f294965f = arrayList;
        v0Var5.f294963d = arrayList2;
        v0Var5.f294964e = arrayList3;
        v0Var5.f294968i = w0Var5;
        v0Var5.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488372rj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cnr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95217i = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) findViewById;
        iu1.v0 v0Var = new iu1.v0(false);
        this.f95218m = v0Var;
        v0Var.setHasStableIds(true);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f95217i;
        if (loadMoreRecyclerView == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        iu1.v0 v0Var2 = this.f95218m;
        if (v0Var2 == null) {
            kotlin.jvm.internal.o.o("mTicketAdapter");
            throw null;
        }
        loadMoreRecyclerView.setAdapter(v0Var2);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = this.f95217i;
        if (loadMoreRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        loadMoreRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.i0 i0Var = new androidx.recyclerview.widget.i0(this, 1);
        i0Var.d(getResources().getDrawable(com.tencent.mm.R.drawable.f481109kz));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = this.f95217i;
        if (loadMoreRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        loadMoreRecyclerView3.N(i0Var);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView4 = this.f95217i;
        if (loadMoreRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        loadMoreRecyclerView4.setLoadingView(com.tencent.mm.R.layout.f488314pw);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483723bv1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById2;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView5 = this.f95217i;
        if (loadMoreRecyclerView5 == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        loadMoreRecyclerView5.setEmptyView(viewGroup);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView6 = this.f95217i;
        if (loadMoreRecyclerView6 == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        loadMoreRecyclerView6.setOnLoadingStateChangedListener(new iu1.d1(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView7 = this.f95217i;
        if (loadMoreRecyclerView7 == null) {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
        loadMoreRecyclerView7.setOnItemClickListener(new iu1.e1(this));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView8 = this.f95217i;
        if (loadMoreRecyclerView8 != null) {
            loadMoreRecyclerView8.setOnItemLongClickListener(new iu1.f1(this));
        } else {
            kotlin.jvm.internal.o.o("mTicketRv");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 256 && i18 == -1) {
            java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("key_finish_action", -1)) : null;
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_card_id") : null;
                kotlin.jvm.internal.o.d(stringExtra);
                X6(stringExtra);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
        if (this.f95223r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "firstLoad doGetTicketHomePage");
            Y6(false);
        }
        W6();
        r45.i45 i45Var = new r45.i45();
        r45.j45 j45Var = new r45.j45();
        r45.j45 j45Var2 = new r45.j45();
        r45.k45 k45Var = new r45.k45();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_JUMP_LIST_STRING_SYNC, null);
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            i45Var.parseFrom(bytes);
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_TICKET_LIST_STRING_SYNC, null);
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            j45Var.parseFrom(bytes2);
        }
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_LICENSE_LIST_STRING_SYNC, null);
        if (str3 != null) {
            byte[] bytes3 = str3.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
            j45Var2.parseFrom(bytes3);
        }
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_UNDER_TICKET_LIST_STRING_SYNC, null);
        if (str4 != null) {
            byte[] bytes4 = str4.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes4, "getBytes(...)");
            k45Var.parseFrom(bytes4);
        }
        a7(i45Var, j45Var, j45Var2, k45Var);
        setMMTitle(com.tencent.mm.R.string.jxu);
        setBackBtn(new iu1.g1(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new iu1.n1(this));
        if (getIntent().getBooleanExtra("key_ticket_page_is_from_jsapi", false)) {
            this.f95224s = 2;
        } else {
            this.f95224s = 1;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 6);
    }

    @Override // com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        au1.r rVar = this.A;
        if (rVar != null) {
            rVar.j();
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).hj(this.f95231z);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "do save snapshot");
        r45.i45 i45Var = new r45.i45();
        i45Var.f376724d = new java.util.LinkedList();
        java.util.Iterator it = this.f95227v.iterator();
        while (it.hasNext()) {
            r45.h45 h45Var = ((iu1.w0) it.next()).f294973c;
            if (h45Var != null) {
                i45Var.f376724d.add(h45Var);
            }
        }
        r45.j45 j45Var = new r45.j45();
        j45Var.f377579d = new java.util.LinkedList();
        java.util.Iterator it6 = this.f95225t.iterator();
        while (it6.hasNext()) {
            r45.g45 g45Var = ((iu1.w0) it6.next()).f294974d;
            if (g45Var != null) {
                j45Var.f377579d.add(g45Var);
            }
        }
        r45.j45 j45Var2 = new r45.j45();
        j45Var2.f377579d = new java.util.LinkedList();
        java.util.Iterator it7 = this.f95226u.iterator();
        while (it7.hasNext()) {
            r45.g45 g45Var2 = ((iu1.w0) it7.next()).f294974d;
            if (g45Var2 != null) {
                j45Var2.f377579d.add(g45Var2);
            }
        }
        r45.k45 k45Var = new r45.k45();
        iu1.w0 w0Var = this.f95228w;
        if (w0Var != null) {
            k45Var.f378365d = w0Var.f294975e;
        }
        byte[] byteArray = i45Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        java.nio.charset.Charset charset = r26.c.f368867c;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_JUMP_LIST_STRING_SYNC, new java.lang.String(byteArray, charset));
        byte[] byteArray2 = j45Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_TICKET_LIST_STRING_SYNC, new java.lang.String(byteArray2, charset));
        byte[] byteArray3 = j45Var2.toByteArray();
        kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_LICENSE_LIST_STRING_SYNC, new java.lang.String(byteArray3, charset));
        byte[] byteArray4 = k45Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray4, "toByteArray(...)");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_UNDER_TICKET_LIST_STRING_SYNC, new java.lang.String(byteArray4, charset));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f95229x) {
            Y6(true);
            this.f95229x = false;
        }
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(iu1.a1.class);
    }
}
