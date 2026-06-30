package com.tencent.mm.plugin.card.ui;

@gm0.a2
/* loaded from: classes15.dex */
public class CardHomePageUI extends com.tencent.mm.plugin.card.base.CardBaseUI implements tt1.l, l75.q0 {
    public static final /* synthetic */ int P = 0;
    public android.widget.TextView L;
    public android.widget.LinearLayout M;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.g3 f94863w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.e2 f94864x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.e2 f94865y;

    /* renamed from: z, reason: collision with root package name */
    public eu1.f f94866z;
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
    public long f94862J = 0;
    public int K = 0;
    public boolean N = false;

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public xt1.r U6() {
        return xt1.r.HOME_MEMBER_CARD_TYPE;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void V6() {
        setMMTitle(com.tencent.mm.R.string.f490795at5);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.auc), new com.tencent.mm.plugin.card.ui.g2(this));
        eu1.f fVar = new eu1.f(this);
        this.f94866z = fVar;
        fVar.j();
        r45.yu yuVar = null;
        if (this.f94863w == null) {
            android.view.View contentView = getContentView();
            com.tencent.mm.plugin.card.ui.g3 g3Var = new com.tencent.mm.plugin.card.ui.g3(this, contentView);
            this.f94863w = g3Var;
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488344qq, null);
            g3Var.f95013f = inflate;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g3Var.f95014g = (android.widget.TextView) g3Var.f95013f.findViewById(com.tencent.mm.R.id.f483572ba1);
            g3Var.f95015h = (android.widget.ImageView) g3Var.f95013f.findViewById(com.tencent.mm.R.id.b_z);
            g3Var.f95013f.setOnClickListener(new com.tencent.mm.plugin.card.ui.e3(g3Var));
            g3Var.a();
            if (g3Var.f95016i == null) {
                android.view.View inflate2 = ((android.view.ViewStub) contentView.findViewById(com.tencent.mm.R.id.bay)).inflate();
                g3Var.f95016i = inflate2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(inflate2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "doRefreshEmptyMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(inflate2, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController", "doRefreshEmptyMsgLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g3Var.f95017m = (android.widget.TextView) g3Var.f95016i.findViewById(com.tencent.mm.R.id.f483572ba1);
                g3Var.f95018n = (android.widget.ImageView) g3Var.f95016i.findViewById(com.tencent.mm.R.id.b_z);
                g3Var.f95016i.setOnClickListener(new com.tencent.mm.plugin.card.ui.f3(g3Var));
            }
            this.f94863w.f95019o = true;
        }
        if (this.f94864x == null) {
            this.f94864x = new com.tencent.mm.plugin.card.ui.e2(this, findViewById(com.tencent.mm.R.id.bav), 1, this.f94866z);
        }
        if (this.f94865y == null) {
            this.f94865y = new com.tencent.mm.plugin.card.ui.e2(this, findViewById(com.tencent.mm.R.id.bcc), 3, this.f94866z);
        }
        com.tencent.mm.plugin.card.ui.e2 e2Var = this.f94864x;
        if (e2Var != null) {
            e2Var.f94990c.setOnClickListener(new com.tencent.mm.plugin.card.ui.k2(this));
        }
        com.tencent.mm.plugin.card.ui.e2 e2Var2 = this.f94865y;
        if (e2Var2 != null) {
            e2Var2.f94990c.setOnClickListener(new com.tencent.mm.plugin.card.ui.l2(this));
        }
        this.M = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f483568b95);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_HOME_PAGE_LIST_STRING_SYNC, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            r45.yu yuVar2 = new r45.yu();
            try {
                yuVar2.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                yuVar = yuVar2;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardHomePageUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (yuVar != null) {
            m7(yuVar);
        }
        setBackBtn(new com.tencent.mm.plugin.card.ui.h2(this));
    }

    @Override // tt1.l
    public void W0() {
        this.E = true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public boolean X6() {
        return true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public boolean Y6() {
        return true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void Z6() {
        o7();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void d7(tt1.j jVar, int i17) {
        super.d7(jVar, i17);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void e7(tt1.j jVar) {
        super.e7(jVar);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void f7() {
        if (this.G || this.F) {
            i7();
            return;
        }
        this.G = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "onLocationFail()");
        l7();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void g7() {
        if (!this.F) {
            this.F = true;
            l7();
            i7();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
            if (this.H) {
                i7();
            }
        }
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488318q0;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI
    public void h7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.H);
        if (this.H) {
            return;
        }
        this.H = true;
        gm0.j1.e().j(new com.tencent.mm.plugin.card.ui.i2(this));
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(Di));
        this.H = Di;
        if (Di) {
            gm0.j1.e().j(new com.tencent.mm.plugin.card.ui.i2(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
            l7();
        }
        super.initView();
    }

    public final void l7() {
        if (!this.D) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
        } else if (this.B) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        } else {
            if (this.A && !com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
                this.C = "";
            }
            this.B = true;
            this.D = false;
            gm0.j1.n().f273288b.g(new fu1.b(xt1.t0.ij().f449280d, xt1.t0.ij().f449281e, this.C));
        }
        if (lu1.a0.t()) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_GET_LAYOUT_SCENE_INT_SYNC, 1)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is " + intValue);
            gm0.j1.n().f273288b.g(new xt1.k0((double) xt1.t0.ij().f449280d, (double) xt1.t0.ij().f449281e, intValue));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
        }
        xt1.t0.ij().a("", "", 4);
    }

    public final void m7(r45.yu yuVar) {
        java.util.LinkedList linkedList;
        this.M.removeAllViews();
        if (yuVar == null || (linkedList = yuVar.f391370d) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ku kuVar = (r45.ku) it.next();
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488306po, (android.view.ViewGroup) this.M, false);
            new com.tencent.mm.plugin.card.ui.e2(this, inflate, 4, this.f94866z, kuVar).f94990c.setOnClickListener(new com.tencent.mm.plugin.card.ui.m2(this, kuVar));
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
        boolean f17 = bk0.a.g().f(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean f18 = bk0.a.g().f(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 2, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (b17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 1, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && !f18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 3, java.lang.Integer.valueOf(intExtra), "", 0, str2);
            return;
        }
        if (f17 && f18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 4, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else if (f18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 5, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardHomePageUI", 0, "", "", 0, java.lang.Integer.valueOf(intExtra), "", 0, str2);
        }
    }

    public final void o7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
        com.tencent.mm.plugin.card.ui.k kVar = (com.tencent.mm.plugin.card.ui.k) this.f94632e;
        if (this.L == null) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485874jf0);
            this.L = textView;
            textView.setOnClickListener(new com.tencent.mm.plugin.card.ui.j2(this));
        }
        if (kVar.getCount() > 0) {
            this.L.setVisibility(0);
            this.L.setText(getString(com.tencent.mm.R.string.avk, java.lang.Integer.valueOf(this.f94866z.g())));
            this.f94864x.a(8);
            return;
        }
        this.L.setVisibility(0);
        this.L.setText(getString(com.tencent.mm.R.string.avk, java.lang.Integer.valueOf(this.f94866z.g())));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.b_h);
        if (linearLayout != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.topMargin = i65.a.b(this, 29);
            layoutParams.bottomMargin = i65.a.b(this, 29);
            linearLayout.setLayoutParams(layoutParams);
        }
        this.f94864x.a(8);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.K = getIntent().getIntExtra("key_home_page_from_scene", 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.I = currentTimeMillis;
        this.f94862J = currentTimeMillis;
        initView();
        com.tencent.mm.plugin.card.ui.g3 g3Var = this.f94863w;
        g3Var.getClass();
        wt1.f0 Ui = xt1.t0.Ui();
        if (Ui.f449266a == null) {
            Ui.f449266a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ui.f449266a).add(new java.lang.ref.WeakReference(g3Var));
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1054, this);
        xt1.t0.mj().a();
        xt1.t0.wi().a(1);
        n7();
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.card.ui.n2(this));
        xt1.t0.mj().c(this);
        xt1.t0.cj().add(this);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 8, 2);
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.H) {
            i7();
        }
        com.tencent.mm.plugin.card.ui.g3 g3Var = this.f94863w;
        g3Var.getClass();
        xt1.t0.Ui().f(g3Var);
        this.f94866z.getClass();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1054, this);
        xt1.t0.mj().d(this);
        xt1.t0.cj().remove(this);
        wt1.f0.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "delelteAllIllegalStatusCard()");
        s75.d.b(new eu1.e(), "delelteAllIllegalStatusCard");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "CardHomePageUI", java.lang.Integer.valueOf(this.K), "", "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f94862J));
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
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

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        n7();
        this.E = true;
        this.D = true;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        this.E = true;
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(this.N), java.lang.Boolean.valueOf(this.E));
        if (this.H) {
            if (this.N && this.E) {
                this.C = "";
                this.F = false;
                i11.e eVar = this.f94641q;
                if (eVar != null) {
                    ((i11.h) eVar).k(this.f94645u, true);
                    com.tencent.mm.plugin.report.service.b1.f(22, 10);
                }
            }
        } else if (this.E) {
            this.C = "";
            l7();
        }
        this.E = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "updateView()");
        this.f94863w.a();
        o7();
        this.f94865y.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.I;
        if (j17 != 0) {
            int i17 = (int) (currentTimeMillis - j17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(0);
            iDKey.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(1);
            iDKey2.SetValue(i17);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
            this.I = 0L;
        }
        gm0.j1.e().j(new com.tencent.mm.plugin.card.ui.f2(this));
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.card.base.CardBaseUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.b) {
                this.B = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (m1Var instanceof xt1.k0) {
            o7();
            this.f94639o.onNotify();
            this.f94865y.b();
            m7(((xt1.k0) m1Var).f456514g);
            return;
        }
        if (m1Var instanceof fu1.b) {
            fu1.b bVar = (fu1.b) m1Var;
            this.B = false;
            this.C = bVar.f266820g;
            this.f94866z.q(bVar.f266819f, this.A);
            if (!this.f94866z.k() || !this.f94866z.l()) {
                this.A = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageUI", "updateView()");
            this.f94863w.a();
            o7();
            this.f94865y.b();
        }
    }
}
