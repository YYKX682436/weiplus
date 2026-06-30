package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "iu1/a", "iu1/b", "iu1/c", "iu1/m", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI */
/* loaded from: classes9.dex */
public final class ActivityC13064xaf775f76 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {
    public static final int N = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
    public static final int P;
    public boolean A;
    public boolean B;
    public int D;
    public int E;
    public boolean G;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public r45.wt f176715J;
    public boolean K;
    public android.app.Dialog L;
    public au1.p M;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f176716i;

    /* renamed from: m, reason: collision with root package name */
    public iu1.c f176717m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f176718n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f176719o;

    /* renamed from: p, reason: collision with root package name */
    public int f176720p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176722r;

    /* renamed from: w, reason: collision with root package name */
    public iu1.a f176727w;

    /* renamed from: x, reason: collision with root package name */
    public iu1.a f176728x;

    /* renamed from: y, reason: collision with root package name */
    public iu1.a f176729y;

    /* renamed from: q, reason: collision with root package name */
    public int f176721q = 10;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f176723s = "";

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f176724t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f176725u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f176726v = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f176730z = true;
    public int C = -1;
    public final java.util.ArrayList F = new java.util.ArrayList();
    public r45.xt H = new r45.xt();

    static {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        P = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
    }

    public static final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        if (activityC13064xaf775f76.F != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13064xaf775f76.mo55332x76847179(), 1, false);
            k0Var.f293405n = new iu1.b0(activityC13064xaf775f76);
            k0Var.f293414s = new iu1.d0(activityC13064xaf775f76);
            k0Var.v();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595
    public void T6(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "location finish: [%s, %s], ret: %s, isOk: %s", java.lang.Float.valueOf(this.f176745d), java.lang.Float.valueOf(this.f176746e), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (!this.f176730z) {
            if (z17) {
                return;
            }
            W6();
            return;
        }
        if (this.D == 1 && i17 < 0 && this.E == 1) {
            this.E = 0;
            if (i17 == -2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 30);
            }
        }
        Y6();
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "do get card Home page: %s, %s", java.lang.Boolean.valueOf(this.f176722r), java.lang.Boolean.valueOf(this.A));
        boolean z17 = this.K;
        if (z17 || !(this.f176722r || this.A)) {
            this.A = true;
            r45.qu quVar = null;
            if (z17) {
                android.view.ViewGroup viewGroup = this.f176719o;
                if (viewGroup == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLoadingView2");
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
                if (quVar2.f465792d == this.E) {
                    quVar = quVar2;
                    break;
                }
            }
            this.f176721q = quVar != null ? quVar.f465793e : 10;
            android.app.Dialog dialog = this.L;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (this.f176725u.isEmpty()) {
                this.L = db5.e1.Q(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, true, null);
            }
            au1.p pVar = new au1.p(this.f176720p, this.f176721q, this.f176745d, this.f176746e, 1, this.E);
            this.M = pVar;
            pVar.f152182i = true;
            pVar.l().h(new iu1.o(this)).f(this);
        }
    }

    public final void Z6() {
        r45.xt xtVar = this.H;
        if (xtVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xtVar.f471917d)) {
            return;
        }
        m78548x39037dd1();
        m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new iu1.a0(this, xtVar));
    }

    public final void a7(r45.au auVar, r45.eu euVar, r45.du duVar) {
        int i17 = 0;
        java.util.ArrayList arrayList = this.f176725u;
        if (auVar != null) {
            java.util.LinkedList card_home_page_element = auVar.f451793d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_home_page_element, "card_home_page_element");
            if (!card_home_page_element.isEmpty()) {
                java.util.Iterator it = auVar.f451793d.iterator();
                while (it.hasNext()) {
                    r45.wt wtVar = (r45.wt) it.next();
                    iu1.a aVar = new iu1.a(this);
                    aVar.f376364a = wtVar;
                    aVar.f376365b = 0;
                    arrayList.add(aVar);
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f176726v;
        if (euVar != null) {
            java.util.LinkedList card_home_page_element2 = euVar.f455260d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_home_page_element2, "card_home_page_element");
            if (!card_home_page_element2.isEmpty()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(euVar.f455261e)) {
                    euVar.f455261e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.asr);
                }
                if (this.f176728x == null) {
                    iu1.a aVar2 = new iu1.a(this);
                    this.f176728x = aVar2;
                    aVar2.f376365b = 1;
                }
                iu1.a aVar3 = this.f176728x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
                java.lang.String section_title = euVar.f455261e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(section_title, "section_title");
                aVar3.f376366c = section_title;
                java.util.Iterator it6 = euVar.f455260d.iterator();
                while (it6.hasNext()) {
                    r45.wt wtVar2 = (r45.wt) it6.next();
                    iu1.a aVar4 = new iu1.a(this);
                    aVar4.f376364a = wtVar2;
                    aVar4.f376365b = 2;
                    arrayList2.add(aVar4);
                }
            }
        }
        java.util.ArrayList arrayList3 = this.f176724t;
        if (duVar != null) {
            java.util.LinkedList card_home_page_top_cell = duVar.f454280d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_home_page_top_cell, "card_home_page_top_cell");
            if (!card_home_page_top_cell.isEmpty()) {
                java.util.Iterator it7 = card_home_page_top_cell.iterator();
                while (it7.hasNext()) {
                    int i18 = i17 + 1;
                    r45.bu buVar = (r45.bu) it7.next();
                    iu1.a aVar5 = new iu1.a(this);
                    aVar5.f376369f = buVar;
                    aVar5.f376365b = 6;
                    if (i17 == card_home_page_top_cell.size() - 1) {
                        aVar5.f376370g = true;
                    }
                    arrayList3.add(aVar5);
                    i17 = i18;
                }
            }
        }
        iu1.a aVar6 = new iu1.a(this);
        this.f176729y = aVar6;
        aVar6.f376365b = 5;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty() || !(!arrayList3.isEmpty())) {
            this.f176727w = null;
            return;
        }
        iu1.a aVar7 = new iu1.a(this);
        this.f176727w = aVar7;
        aVar7.f376365b = 7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569850pz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.bvz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) findViewById;
        this.f176716i = c12808x5de4409f;
        c12808x5de4409f.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        iu1.c cVar = new iu1.c(this);
        this.f176717m = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = this.f176716i;
        if (c12808x5de4409f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c12808x5de4409f2.mo7960x6cab2c8d(cVar);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = this.f176716i;
        if (c12808x5de4409f3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        boolean z17 = false;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569847pw, (android.view.ViewGroup) c12808x5de4409f3, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f176718n = (android.view.ViewGroup) inflate;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.bvy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f176719o = (android.view.ViewGroup) findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f4 = this.f176716i;
        if (c12808x5de4409f4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        android.view.ViewGroup viewGroup = this.f176718n;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mLoadingView");
            throw null;
        }
        c12808x5de4409f4.m53682x626a4c3f(viewGroup);
        iu1.q qVar = new iu1.q(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f5 = this.f176716i;
        if (c12808x5de4409f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c12808x5de4409f5.N(qVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f6 = this.f176716i;
        if (c12808x5de4409f6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c12808x5de4409f6.m53683x6891e372(new iu1.r(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f7 = this.f176716i;
        if (c12808x5de4409f7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c12808x5de4409f7.m53687xa1aeda28(new iu1.s(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f8 = this.f176716i;
        if (c12808x5de4409f8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c12808x5de4409f8.m53688x1c3e70c(new iu1.w(this));
        r45.au auVar = new r45.au();
        r45.eu euVar = new r45.eu();
        r45.du duVar = new r45.du();
        r45.ru ruVar = new r45.ru();
        r45.xt xtVar = this.H;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardSnapshotMgr", "load home page snapshot");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_STORE_LIST_STRING_SYNC, null);
        boolean z18 = true;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            auVar.mo11468x92b714fd(bytes);
            z17 = true;
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_UNDER_LIST_STRING_SYNC, null);
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            euVar.mo11468x92b714fd(bytes2);
            z17 = true;
        }
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_TOP_LIST_STRING_SYNC, null);
        if (str3 != null) {
            byte[] bytes3 = str3.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
            duVar.mo11468x92b714fd(bytes3);
            z17 = true;
        }
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_SORT_INFO_LIST_STRING_SYNC, null);
        if (str4 != null) {
            byte[] bytes4 = str4.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes4, "getBytes(...)");
            ruVar.mo11468x92b714fd(bytes4);
            z17 = true;
        }
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_FAQ_ITEM_STRING_SYNC, null);
        if (str5 == null) {
            z18 = z17;
        } else if (xtVar != null) {
            byte[] bytes5 = str5.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes5, "getBytes(...)");
            xtVar.mo11468x92b714fd(bytes5);
        }
        java.util.ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.addAll(ruVar.f466742d);
        a7(auVar, euVar, duVar);
        if (!z18) {
            java.util.ArrayList arrayList2 = this.f176725u;
            if (arrayList2.isEmpty() && this.f176726v.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "show init view");
                iu1.a aVar = new iu1.a(this);
                aVar.f376365b = 3;
                iu1.a aVar2 = new iu1.a(this);
                aVar2.f376365b = 3;
                arrayList2.add(aVar);
                arrayList2.add(aVar2);
            }
        }
        Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f9 = this.f176716i;
        if (c12808x5de4409f9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c12808x5de4409f9.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo78530x8b45058f();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572328at5);
        this.I = getIntent().getIntExtra("key_home_page_from_scene", 0);
        mo43517x10010bd5();
        this.D = 1;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SORT_TYPE_INT_SYNC, 1);
        this.E = r17;
        if (r17 == 0) {
            this.E = 1;
        }
        if (this.D == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 14);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "on create, scene: %s", java.lang.Integer.valueOf(this.I));
        mo54448x9c8c0d33(new iu1.x(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 4);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 8, 2);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.CardHomePageNewUI)).Rj(this, iy1.a.Cards);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SORT_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.E));
        au1.p pVar = this.M;
        java.lang.String str = null;
        if (pVar != null) {
            pVar.j();
            this.M = null;
        }
        wt1.f0.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "do save snap shot");
        r45.au auVar = new r45.au();
        auVar.f451793d = new java.util.LinkedList();
        java.util.Iterator it = this.f176725u.iterator();
        while (it.hasNext()) {
            r45.wt wtVar = ((iu1.a) it.next()).f376364a;
            if (wtVar != null) {
                auVar.f451793d.add(wtVar);
            }
        }
        r45.eu euVar = new r45.eu();
        iu1.a aVar = this.f176728x;
        if (aVar != null) {
            java.lang.String str2 = aVar.f376366c;
            if (str2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionTitle");
                throw null;
            }
            str = str2;
        }
        euVar.f455261e = str;
        euVar.f455260d = new java.util.LinkedList();
        java.util.Iterator it6 = this.f176726v.iterator();
        while (it6.hasNext()) {
            r45.wt wtVar2 = ((iu1.a) it6.next()).f376364a;
            if (wtVar2 != null) {
                euVar.f455260d.add(wtVar2);
            }
        }
        r45.du duVar = new r45.du();
        java.util.Iterator it7 = this.f176724t.iterator();
        while (it7.hasNext()) {
            r45.bu buVar = ((iu1.a) it7.next()).f376369f;
            if (buVar != null) {
                duVar.f454280d.add(buVar);
            }
        }
        r45.ru ruVar = new r45.ru();
        ruVar.f466742d.addAll(this.F);
        r45.xt xtVar = this.H;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardSnapshotMgr", "save home page snapshot");
        byte[] mo14344x5f01b1f6 = auVar.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        java.nio.charset.Charset charset = r26.c.f450400c;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_STORE_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f6, charset));
        byte[] mo14344x5f01b1f62 = euVar.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_UNDER_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f62, charset));
        byte[] mo14344x5f01b1f63 = duVar.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_TOP_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f63, charset));
        byte[] mo14344x5f01b1f64 = ruVar.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f64, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_SORT_INFO_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f64, charset));
        if (xtVar != null) {
            byte[] mo14344x5f01b1f65 = xtVar.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f65, "toByteArray(...)");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_FAQ_ITEM_STRING_SYNC, new java.lang.String(mo14344x5f01b1f65, charset));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        r45.wt wtVar;
        super.onResume();
        if (!this.B || (wtVar = this.f176715J) == null || this.C == -1) {
            if (this.G) {
                this.K = true;
                this.f176720p = 0;
                this.G = false;
                Y6();
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
        java.lang.String card_pack_merchant_id = wtVar.f470960d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        r45.wt wtVar2 = this.f176715J;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar2);
        long j17 = wtVar2.f470977x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "do get mch infoset: %s", card_pack_merchant_id);
        new au1.o(card_pack_merchant_id, j17, this.f176745d, this.f176746e, this.E, 0).l().h(new iu1.p(this, card_pack_merchant_id));
        this.B = false;
        this.f176715J = null;
    }
}
