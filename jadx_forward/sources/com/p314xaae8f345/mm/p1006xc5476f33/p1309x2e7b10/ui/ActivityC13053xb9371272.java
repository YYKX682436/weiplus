package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.card.ui.CardHomePageUI */
/* loaded from: classes15.dex */
public class ActivityC13053xb9371272 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 implements tt1.l, l75.q0 {
    public static final /* synthetic */ int P = 0;
    public android.widget.TextView L;
    public android.widget.LinearLayout M;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g3 f176396w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2 f176397x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2 f176398y;

    /* renamed from: z, reason: collision with root package name */
    public eu1.f f176399z;
    public boolean A = true;
    public boolean B = false;
    public java.lang.String C = "";
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public long I = 0;

    /* renamed from: J, reason: collision with root package name */
    public long f176395J = 0;
    public int K = 0;
    public boolean N = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public xt1.r U6() {
        return xt1.r.HOME_MEMBER_CARD_TYPE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void V6() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572328at5);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.auc), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g2(this));
        eu1.f fVar = new eu1.f(this);
        this.f176399z = fVar;
        fVar.j();
        r45.yu yuVar = null;
        if (this.f176396w == null) {
            android.view.View m78513xc2a54588 = m78513xc2a54588();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g3 g3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g3(this, m78513xc2a54588);
            this.f176396w = g3Var;
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569877qq, null);
            g3Var.f176546f = inflate;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g3Var.f176547g = (android.widget.TextView) g3Var.f176546f.findViewById(com.p314xaae8f345.mm.R.id.f565105ba1);
            g3Var.f176548h = (android.widget.ImageView) g3Var.f176546f.findViewById(com.p314xaae8f345.mm.R.id.b_z);
            g3Var.f176546f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e3(g3Var));
            g3Var.a();
            if (g3Var.f176549i == null) {
                android.view.View inflate2 = ((android.view.ViewStub) m78513xc2a54588.findViewById(com.p314xaae8f345.mm.R.id.bay)).inflate();
                g3Var.f176549i = inflate2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(inflate2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "doRefreshEmptyMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(inflate2, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "doRefreshEmptyMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g3Var.f176550m = (android.widget.TextView) g3Var.f176549i.findViewById(com.p314xaae8f345.mm.R.id.f565105ba1);
                g3Var.f176551n = (android.widget.ImageView) g3Var.f176549i.findViewById(com.p314xaae8f345.mm.R.id.b_z);
                g3Var.f176549i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f3(g3Var));
            }
            this.f176396w.f176552o = true;
        }
        if (this.f176397x == null) {
            this.f176397x = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2(this, findViewById(com.p314xaae8f345.mm.R.id.bav), 1, this.f176399z);
        }
        if (this.f176398y == null) {
            this.f176398y = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2(this, findViewById(com.p314xaae8f345.mm.R.id.bcc), 3, this.f176399z);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2 e2Var = this.f176397x;
        if (e2Var != null) {
            e2Var.f176523c.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k2(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2 e2Var2 = this.f176398y;
        if (e2Var2 != null) {
            e2Var2.f176523c.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l2(this));
        }
        this.M = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f565101b95);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HOME_PAGE_LIST_STRING_SYNC, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            r45.yu yuVar2 = new r45.yu();
            try {
                yuVar2.mo11468x92b714fd(str.getBytes(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
                yuVar = yuVar2;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardHomePageUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (yuVar != null) {
            m7(yuVar);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.h2(this));
    }

    @Override // tt1.l
    public void W0() {
        this.E = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public boolean X6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public boolean Y6() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void Z6() {
        o7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void d7(tt1.j jVar, int i17) {
        super.d7(jVar, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void e7(tt1.j jVar) {
        super.e7(jVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void f7() {
        if (this.G || this.F) {
            i7();
            return;
        }
        this.G = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "onLocationFail()");
        l7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void g7() {
        if (!this.F) {
            this.F = true;
            l7();
            i7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
            if (this.H) {
                i7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569851q0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void h7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.H);
        if (this.H) {
            return;
        }
        this.H = true;
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.i2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
        this.H = Di;
        if (Di) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.i2(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
            l7();
        }
        super.mo43517x10010bd5();
    }

    public final void l7() {
        if (!this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
        } else if (this.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        } else {
            if (this.A && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
                this.C = "";
            }
            this.B = true;
            this.D = false;
            gm0.j1.n().f354821b.g(new fu1.b(xt1.t0.ij().f530813d, xt1.t0.ij().f530814e, this.C));
        }
        if (lu1.a0.t()) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_GET_LAYOUT_SCENE_INT_SYNC, 1)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is " + intValue);
            gm0.j1.n().f354821b.g(new xt1.k0((double) xt1.t0.ij().f530813d, (double) xt1.t0.ij().f530814e, intValue));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
        }
        xt1.t0.ij().a("", "", 4);
    }

    public final void m7(r45.yu yuVar) {
        java.util.LinkedList linkedList;
        this.M.removeAllViews();
        if (yuVar == null || (linkedList = yuVar.f472903d) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ku kuVar = (r45.ku) it.next();
            android.view.View inflate = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569839po, (android.view.ViewGroup) this.M, false);
            new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e2(this, inflate, 4, this.f176399z, kuVar).f176523c.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m2(this, kuVar));
            this.M.addView(inflate);
        }
    }

    public final void n7() {
        int intExtra = getIntent().getIntExtra("key_from_scene", 22);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(262152, 266256);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262152, 266256);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f17 = bk0.a.g().f(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f18 = bk0.a.g().f(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 2, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 1, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && !f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 3, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 4, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else if (f18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 5, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 0, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        }
    }

    public final void o7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.k) this.f176165e;
        if (this.L == null) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567407jf0);
            this.L = textView;
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.j2(this));
        }
        if (kVar.getCount() > 0) {
            this.L.setVisibility(0);
            this.L.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.avk, java.lang.Integer.valueOf(this.f176399z.g())));
            this.f176397x.a(8);
            return;
        }
        this.L.setVisibility(0);
        this.L.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.avk, java.lang.Integer.valueOf(this.f176399z.g())));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.b_h);
        if (linearLayout != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.topMargin = i65.a.b(this, 29);
            layoutParams.bottomMargin = i65.a.b(this, 29);
            linearLayout.setLayoutParams(layoutParams);
        }
        this.f176397x.a(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.K = getIntent().getIntExtra("key_home_page_from_scene", 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.I = currentTimeMillis;
        this.f176395J = currentTimeMillis;
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g3 g3Var = this.f176396w;
        g3Var.getClass();
        wt1.f0 Ui = xt1.t0.Ui();
        if (Ui.f530799a == null) {
            Ui.f530799a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ui.f530799a).add(new java.lang.ref.WeakReference(g3Var));
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de, this);
        gm0.j1.n().f354821b.a(1054, this);
        xt1.t0.mj().a();
        xt1.t0.wi().a(1);
        n7();
        android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n2(this));
        xt1.t0.mj().c(this);
        xt1.t0.cj().add(this);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 8, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.H) {
            i7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g3 g3Var = this.f176396w;
        g3Var.getClass();
        xt1.t0.Ui().f(g3Var);
        this.f176399z.getClass();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.x.f35000x366c91de, this);
        gm0.j1.n().f354821b.q(1054, this);
        xt1.t0.mj().d(this);
        xt1.t0.cj().mo49775xc84af884(this);
        wt1.f0.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
        s75.d.b(new eu1.e(), "delelteAllIllegalStatusCard");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "CardHomePageUI", java.lang.Integer.valueOf(this.K), "", "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f176395J));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            int i18 = this.K;
            if (i18 == 1 || i18 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("preferred_tab", 3);
                j45.l.u(this, "com.tencent.mm.ui.LauncherUI", intent, null);
                finish();
            } else {
                finish();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        n7();
        this.E = true;
        this.D = true;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        this.E = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(this.N), java.lang.Boolean.valueOf(this.E));
        if (this.H) {
            if (this.N && this.E) {
                this.C = "";
                this.F = false;
                i11.e eVar = this.f176174q;
                if (eVar != null) {
                    ((i11.h) eVar).k(this.f176178u, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
                }
            }
        } else if (this.E) {
            this.C = "";
            l7();
        }
        this.E = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "updateView()");
        this.f176396w.a();
        o7();
        this.f176398y.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.I;
        if (j17 != 0) {
            int i17 = (int) (currentTimeMillis - j17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(281);
            c4582x424c344.m40331x936762bd(0);
            c4582x424c344.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(281);
            c4582x424c3442.m40331x936762bd(1);
            c4582x424c3442.m40332x57b2b64f(i17);
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
            this.I = 0L;
        }
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f2(this));
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.b) {
                this.B = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (m1Var instanceof xt1.k0) {
            o7();
            this.f176172o.mo54458x50fc6e08();
            this.f176398y.b();
            m7(((xt1.k0) m1Var).f538047g);
            return;
        }
        if (m1Var instanceof fu1.b) {
            fu1.b bVar = (fu1.b) m1Var;
            this.B = false;
            this.C = bVar.f348353g;
            this.f176399z.q(bVar.f348352f, this.A);
            if (!this.f176399z.k() || !this.f176399z.l()) {
                this.A = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageUI", "updateView()");
            this.f176396w.a();
            o7();
            this.f176398y.b();
        }
    }
}
