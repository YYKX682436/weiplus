package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardDetailUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, wt1.h, wt1.a0, wt1.f, com.tencent.mm.sdk.platformtools.f7 {
    public static final /* synthetic */ int S = 0;
    public java.util.ArrayList A;
    public android.os.Vibrator F;
    public i11.e L;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.b0 f94763e;

    /* renamed from: f, reason: collision with root package name */
    public tt1.j f94764f;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f94778w;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.p0 f94781z;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94762d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f94765g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f94766h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f94767i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f94768m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f94769n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f94770o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f94771p = "";

    /* renamed from: q, reason: collision with root package name */
    public boolean f94772q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f94773r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f94774s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94775t = false;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f94776u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f94777v = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f94779x = false;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f94780y = new com.tencent.mm.sdk.platformtools.n3();
    public int B = 3;
    public int C = 0;
    public int D = -1;
    public boolean E = false;
    public boolean G = true;
    public long H = 0;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f94761J = false;
    public boolean K = false;
    public float M = -85.0f;
    public float N = -1000.0f;
    public java.lang.String P = "";
    public final wt1.p Q = new wt1.p();
    public final i11.c R = new com.tencent.mm.plugin.card.ui.o(this);

    @Override // wt1.a0
    public void A1(java.lang.String str, wt1.b0 b0Var, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f94765g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onMarkFail()");
        this.f94773r = false;
        this.f94774s = false;
        d7(false);
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.tencent.mm.R.string.atz);
        }
        lu1.r.c(this, str2);
    }

    @Override // wt1.a0
    public void C5(java.lang.String str, wt1.b0 b0Var) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f94765g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
            return;
        }
        d7(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onMarkSuccess()");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "markSucc:" + b0Var.f449250b + " markCardId: " + b0Var.f449251c);
        this.f94774s = false;
        if (b0Var.f449250b != 1) {
            this.f94773r = false;
            lu1.r.c(this, getString(com.tencent.mm.R.string.f490796au0));
            return;
        }
        if (android.text.TextUtils.isEmpty(b0Var.f449251c) || this.f94764f.g().equals(b0Var.f449251c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
            this.f94773r = true;
            if (this.f94763e.V) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
                this.f94763e.a(this.f94775t, b0Var, true);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
        if (this.f94764f.i()) {
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y07 = xt1.t0.nj().y0(b0Var.f449251c);
            if (y07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
                lu1.r.c(this, getString(com.tencent.mm.R.string.atz));
                this.f94773r = false;
                return;
            }
            this.f94764f = y07;
            this.f94765g = b0Var.f449251c;
            V6();
            wt1.i Bi = xt1.t0.Bi();
            tt1.j jVar = this.f94764f;
            Bi.f449292i = jVar;
            if (Bi.f449293m && jVar != null && jVar.g() != null && !jVar.g().equals(Bi.f449292i.g())) {
                Bi.f449293m = false;
            }
            if (Bi.f449288e != null) {
                for (int i17 = 0; i17 < ((java.util.ArrayList) Bi.f449288e).size(); i17++) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) Bi.f449288e).get(i17);
                    if (weakReference != null) {
                        wt1.h hVar = (wt1.h) weakReference.get();
                        java.lang.Boolean bool = (java.lang.Boolean) Bi.f449289f.get(hVar);
                        if (hVar != null && bool != null && !bool.booleanValue()) {
                            hVar.y2(jVar);
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "update the mCardInfo");
            this.f94773r = true;
            if (this.f94763e.V) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
                this.f94763e.a(this.f94775t, b0Var, true);
            }
        }
    }

    @Override // wt1.f
    public void F1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "code change");
        ku1.i iVar = this.f94763e.f94944p;
        if (iVar instanceof ku1.y) {
            ((ku1.y) iVar).f312157l = xt1.t0.Ai().b();
            this.f94763e.f();
        }
    }

    public final void T6() {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f94764f.f())) {
            str = this.f94764f.f();
        } else {
            if (android.text.TextUtils.isEmpty(this.f94765g)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
                return;
            }
            str = this.f94765g;
        }
        tt1.j jVar = this.f94764f;
        if (jVar != null && jVar.s0().f388565x == 1) {
            float f17 = this.M;
            float f18 = this.N;
            if (f17 == -85.0f || f18 == -1000.0f) {
                f17 = xt1.t0.ij().f449280d;
                f18 = xt1.t0.ij().f449281e;
            }
            gm0.j1.n().f273288b.g(new xt1.d0(str, f18, f17, this.f94764f.g()));
            return;
        }
        tt1.j jVar2 = this.f94764f;
        if (jVar2 != null && jVar2.s0().f388565x > 1) {
            float f19 = this.M;
            if (f19 != -85.0f) {
                float f27 = this.N;
                if (f27 != -1000.0f) {
                    this.K = false;
                    gm0.j1.n().f273288b.g(new xt1.d0(str, f27, f19, this.f94764f.g()));
                    return;
                }
            }
            if (this.K) {
                return;
            }
            this.K = true;
            if (this.f94761J) {
                if (this.L == null) {
                    Z6();
                }
                b7();
                return;
            }
            return;
        }
        tt1.j jVar3 = this.f94764f;
        if (jVar3 != null) {
            jVar3.t(null);
            V6();
            if (this.f94764f.i()) {
                com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y07 = xt1.t0.nj().y0(this.f94765g);
                if (y07 != null) {
                    y07.t(null);
                    xt1.t0.nj().update(y07, this.f94765g);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.card.model.CardInfo z07 = xt1.t0.cj().z0(this.f94765g);
            if (z07 != null) {
                z07.t(null);
                xt1.t0.cj().update(z07, this.f94765g);
            }
        }
    }

    public final void U6() {
        r45.pd6 pd6Var = new r45.pd6();
        java.lang.String str = this.f94776u;
        pd6Var.f382969d = str;
        pd6Var.f382970e = this.f94777v;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", str);
        gm0.j1.n().f273288b.g(new xt1.h0(this.f94765g, this.B, this.f94766h, this.f94768m, this.f94769n, this.f94770o, this.C, this.f94771p, pd6Var));
    }

    public final void V6() {
        com.tencent.mm.plugin.card.ui.p0 p0Var = this.f94781z;
        p0Var.f95103a = this.B;
        p0Var.f95104b = this.D;
        p0Var.f95105c = this.f94765g;
        com.tencent.mm.plugin.card.ui.b0 b0Var = this.f94763e;
        tt1.j jVar = this.f94764f;
        java.util.ArrayList arrayList = this.A;
        b0Var.E = jVar;
        b0Var.U = p0Var;
        b0Var.F = arrayList;
        if (jVar != null && jVar.d()) {
            b0Var.f94946r.f95140g = true;
        }
        this.f94763e.f();
        xt1.t0.Bi().f449292i = this.f94764f;
    }

    public final void W6(boolean z17, int i17) {
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_code", this.P);
            intent.putExtra("key_card_id", this.f94765g);
            intent.putExtra("key_finish_action", i17);
            setResult(-1, intent);
            if (z17) {
                finish();
                return;
            }
            return;
        }
        int i18 = this.D;
        if ((i18 == 7 || i18 == 8 || i18 == 16 || i18 == 26) && this.B == 3) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_code", this.P);
            if (i17 > 0) {
                intent2.putExtra("key_card_id", this.f94765g);
                intent2.putExtra("key_finish_action", i17);
            }
            setResult(-1, intent2);
            if (z17) {
                finish();
                return;
            }
            return;
        }
        if ((i18 != 7 || this.B != 7) && ((i18 != 16 || this.B != 16) && ((i18 != 8 || this.B != 8) && (i18 != 26 || this.B != 26)))) {
            if (z17) {
                finish();
            }
        } else {
            setResult(0);
            if (z17) {
                finish();
            }
        }
    }

    public final void X6(int i17, java.lang.String str, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + i17 + " errMsg = " + str + " ret_code:" + i18 + " ret_msg:" + str2);
        if (i18 == 10000) {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = getString(com.tencent.mm.R.string.ar_);
            }
            this.f94764f.i0().f385181d = 4;
            V6();
        } else if (i18 == 10001) {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = getString(com.tencent.mm.R.string.ard);
            }
            this.f94764f.i0().f385181d = 5;
            V6();
        } else if (i18 == 10002) {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = getString(com.tencent.mm.R.string.aug);
            }
        } else if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.tencent.mm.R.string.ar8);
        }
        lu1.r.c(this, str2);
    }

    public final void Y6() {
        int i17 = this.B;
        this.D = i17;
        com.tencent.mm.plugin.card.ui.p0 p0Var = new com.tencent.mm.plugin.card.ui.p0();
        this.f94781z = p0Var;
        p0Var.f95103a = i17;
        p0Var.f95104b = i17;
        p0Var.f95105c = this.f94765g;
        p0Var.f95106d = this.f94766h;
        p0Var.f95108f = this.f94768m;
        p0Var.f95107e = this.f94767i;
        this.f94781z.getClass();
        com.tencent.mm.plugin.card.ui.p0 p0Var2 = this.f94781z;
        p0Var2.f95109g = this.f94772q;
        p0Var2.f95110h = getIntent().getIntExtra("key_from_appbrand_type", 0);
    }

    public final void Z6() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.L = i11.h.e();
    }

    public final void a7(int i17) {
        int i18 = this.D;
        if (i18 != 7 && i18 != 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        xt1.g gVar = new xt1.g();
        gVar.f376446d = this.f94764f.f();
        gVar.f376447e = this.f94768m;
        gVar.f456477f = this.P;
        linkedList.add(gVar);
        com.tencent.mm.autogen.events.AcceptCouponCardEvent acceptCouponCardEvent = new com.tencent.mm.autogen.events.AcceptCouponCardEvent();
        am.b bVar = acceptCouponCardEvent.f53962g;
        bVar.f6200b = i17;
        if (i17 == -1) {
            bVar.f6199a = lu1.v.b(linkedList, true, this.D);
        } else {
            bVar.f6199a = lu1.v.b(linkedList, false, this.D);
        }
        acceptCouponCardEvent.e();
    }

    public final void b7() {
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        r45.e64 i17 = su4.r2.i();
        if (this.M == -85.0f && this.N == -1000.0f) {
            if (i17 != null) {
                this.M = i17.f373047e;
                this.N = i17.f373046d;
            } else {
                this.M = 0.0f;
                this.N = 0.0f;
            }
            wt1.g0 ij6 = xt1.t0.ij();
            float f17 = this.M;
            float f18 = this.N;
            ij6.f449280d = f17;
            ij6.f449281e = f18;
            ij6.f449282f = java.lang.System.currentTimeMillis() / 1000;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "refreshLbs lbsLatitude:%s，lbsLongitude：%s", java.lang.Float.valueOf(this.M), java.lang.Float.valueOf(this.N));
        float f19 = this.N;
        float f27 = this.M;
        wt1.p pVar = this.Q;
        synchronized (pVar.f449324i) {
            pVar.f449327o = f27;
            pVar.f449328p = f19;
        }
        if (this.K) {
            T6();
            this.K = false;
        }
        i11.e eVar = this.L;
        if (eVar != null) {
            ((i11.h) eVar).m(this.R);
        }
    }

    public final void c7() {
        gm0.j1.n().f273288b.a(1057, this);
        gm0.j1.n().f273288b.a(1037, this);
        gm0.j1.n().f273288b.a(1058, this);
        gm0.j1.n().f273288b.a(1045, this);
        gm0.j1.n().f273288b.a(mc1.l.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1099, this);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1051, this);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.webview.t.CTRL_INDEX, this);
    }

    public final void d7(boolean z17) {
        if (z17) {
            this.f94762d = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94762d;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f94762d.dismiss();
        this.f94762d = null;
    }

    public final void e7() {
        tt1.j jVar;
        if (this.I || (jVar = this.f94764f) == null) {
            return;
        }
        this.I = true;
        if (this.f94772q) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ShareCardDetailUI", java.lang.Integer.valueOf(jVar.s0().f388550i), this.f94764f.f(), this.f94764f.g(), 0, java.lang.Integer.valueOf(this.D), this.f94766h, java.lang.Integer.valueOf(this.f94764f.n() ? 1 : 0), "");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardDetailView", java.lang.Integer.valueOf(jVar.s0().f388550i), this.f94764f.f(), this.f94764f.g(), 0, java.lang.Integer.valueOf(this.D), this.f94766h, java.lang.Integer.valueOf(this.f94764f.n() ? 1 : 0), "");
        }
    }

    public final void f7() {
        gm0.j1.n().f273288b.q(1057, this);
        gm0.j1.n().f273288b.q(1037, this);
        gm0.j1.n().f273288b.q(1058, this);
        gm0.j1.n().f273288b.q(1045, this);
        gm0.j1.n().f273288b.q(mc1.l.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1099, this);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1051, this);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.webview.t.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488294pc;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0677  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.CardDetailUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.H = java.lang.System.currentTimeMillis();
        c7();
        wt1.i Bi = xt1.t0.Bi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        Bi.getClass();
        gm0.j1.n().f273288b.a(oc1.e.CTRL_INDEX, Bi);
        xt1.t0.mj().c(Bi);
        wt1.c wi6 = xt1.t0.wi();
        if (wi6.f449258h == null) {
            wi6.f449258h = new java.util.ArrayList();
        }
        ((java.util.ArrayList) wi6.f449258h).add(new java.lang.ref.WeakReference(Bi));
        Bi.f449287d = new java.lang.ref.WeakReference(context);
        wt1.i Bi2 = xt1.t0.Bi();
        if (Bi2.f449288e == null) {
            Bi2.f449288e = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Bi2.f449288e).add(new java.lang.ref.WeakReference(this));
        wt1.c0 Ri = xt1.t0.Ri();
        if (Ri.f449259d == null) {
            Ri.f449259d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f449259d).add(new java.lang.ref.WeakReference(this));
        wt1.g Ai = xt1.t0.Ai();
        Ai.getClass();
        gm0.j1.n().f273288b.a(nd1.a2.CTRL_INDEX, Ai);
        Ai.f449271f.clear();
        Ai.f449272g = 0;
        wt1.g Ai2 = xt1.t0.Ai();
        if (Ai2.f449269d == null) {
            Ai2.f449269d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ai2.f449269d).add(new java.lang.ref.WeakReference(this));
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        tt1.j jVar;
        wt1.m mVar;
        tt1.l lVar;
        wt1.i Bi = xt1.t0.Bi();
        if (Bi.f449289f == null) {
            Bi.f449289f = new java.util.HashMap();
        }
        Bi.f449289f.remove(this);
        f7();
        xt1.t0.Bi().f(this);
        wt1.i Bi2 = xt1.t0.Bi();
        Bi2.getClass();
        gm0.j1.n().f273288b.q(oc1.e.CTRL_INDEX, Bi2);
        xt1.t0.mj().d(Bi2);
        wt1.c wi6 = xt1.t0.wi();
        if (wi6.f449258h != null) {
            int i17 = 0;
            while (true) {
                if (i17 < ((java.util.ArrayList) wi6.f449258h).size()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) wi6.f449258h).get(i17);
                    if (weakReference != null && (lVar = (tt1.l) weakReference.get()) != null && lVar.equals(Bi2)) {
                        ((java.util.ArrayList) wi6.f449258h).remove(weakReference);
                        break;
                    }
                    i17++;
                } else {
                    break;
                }
            }
        }
        ((java.util.ArrayList) Bi2.f449288e).clear();
        Bi2.f449289f.clear();
        Bi2.f449291h.clear();
        Bi2.f449293m = false;
        xt1.t0.Ri().f(this);
        xt1.t0.Ai().g(this);
        wt1.g Ai = xt1.t0.Ai();
        Ai.getClass();
        gm0.j1.n().f273288b.q(nd1.a2.CTRL_INDEX, Ai);
        Ai.f449271f.clear();
        Ai.f449277o = false;
        Ai.f449270e = "";
        Ai.f449272g = 0;
        Ai.f449273h = 0;
        Ai.f449274i = 0;
        Ai.f449275m = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
        com.tencent.mm.sdk.platformtools.b4 b4Var = Ai.f449278p;
        if (!b4Var.e()) {
            b4Var.d();
        }
        Ai.f();
        com.tencent.mm.plugin.card.ui.b0 b0Var = this.f94763e;
        wt1.k kVar = b0Var.H;
        kVar.f449303b = null;
        ((java.util.ArrayList) kVar.f449305d).clear();
        b0Var.H = null;
        com.tencent.mm.plugin.card.ui.x3 x3Var = b0Var.C;
        lu1.a0.F(x3Var.f95441e);
        java.util.ArrayList arrayList = x3Var.f95452p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                lu1.a0.F((android.graphics.Bitmap) arrayList.remove(size));
            }
        }
        arrayList.clear();
        if (x3Var.f95442f.isShowing()) {
            x3Var.f95442f.dismiss();
        }
        x3Var.f95442f = null;
        float f17 = x3Var.f95451o;
        android.view.WindowManager.LayoutParams attributes = x3Var.f95437a.getWindow().getAttributes();
        attributes.screenBrightness = f17;
        x3Var.f95437a.getWindow().setAttributes(attributes);
        x3Var.f95437a = null;
        x3Var.f95453q = null;
        b0Var.C = null;
        mu1.j jVar2 = b0Var.f94942n;
        if (jVar2 != null) {
            mu1.a aVar = (mu1.a) jVar2;
            aVar.f331339f = null;
            aVar.f331335b = null;
        }
        b0Var.f94936e.mmSetOnActivityResultCallback(null);
        b0Var.Y.dead();
        b0Var.f94938g.f312132a = null;
        b0Var.f94941m.f312132a = null;
        b0Var.f94940i.f312132a = null;
        b0Var.A.f312132a = null;
        ku1.m mVar2 = b0Var.B;
        if (mVar2 != null) {
            ku1.c cVar = (ku1.c) mVar2;
            cVar.f312132a = null;
            cVar.f312067e = null;
            cVar.f312068f = null;
        }
        ku1.m mVar3 = b0Var.f94948t;
        if (mVar3 != null) {
            mVar3.f312132a = null;
        }
        ku1.m mVar4 = b0Var.f94947s;
        if (mVar4 != null) {
            mVar4.f312132a = null;
        }
        ku1.m mVar5 = b0Var.f94949u;
        if (mVar5 != null) {
            mVar5.f312132a = null;
        }
        ku1.m mVar6 = b0Var.f94950v;
        if (mVar6 != null) {
            mVar6.f312132a = null;
        }
        ku1.m mVar7 = b0Var.f94951w;
        if (mVar7 != null) {
            mVar7.f312132a = null;
        }
        ku1.m mVar8 = b0Var.f94952x;
        if (mVar8 != null) {
            mVar8.f312132a = null;
        }
        ku1.m mVar9 = b0Var.f94953y;
        if (mVar9 != null) {
            mVar9.f312132a = null;
        }
        ku1.m mVar10 = b0Var.f94954z;
        if (mVar10 != null) {
            mVar10.f312132a = null;
        }
        ku1.i iVar = b0Var.f94944p;
        if (iVar != null) {
            iVar.f();
        }
        b0Var.f94937f = null;
        wt1.n Ni = xt1.t0.Ni();
        if (Ni.f449310d != null) {
            int i18 = 0;
            while (true) {
                if (i18 < ((java.util.ArrayList) Ni.f449310d).size()) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) Ni.f449310d).get(i18);
                    if (weakReference2 != null && (mVar = (wt1.m) weakReference2.get()) != null && mVar.equals(b0Var)) {
                        ((java.util.ArrayList) Ni.f449310d).remove(weakReference2);
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
        }
        wt1.n Ni2 = xt1.t0.Ni();
        Ni2.f449312f = 0;
        Ni2.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "removeNetSceneListener!");
        gm0.j1.n().f273288b.q(1382, Ni2);
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX, Ni2);
        this.F.cancel();
        i11.e eVar = this.L;
        if (eVar != null) {
            ((i11.h) eVar).m(this.R);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.H;
        if (this.f94764f != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13219, "CardDetailView", java.lang.Integer.valueOf(this.B), this.f94764f.f(), this.f94764f.g(), java.lang.Long.valueOf(currentTimeMillis));
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.B);
            java.lang.String str = this.f94765g;
            g0Var.d(13219, "CardDetailView", valueOf, str, str, java.lang.Long.valueOf(currentTimeMillis));
        }
        if ((this.f94773r || this.f94774s) && (jVar = this.f94764f) != null && jVar.i()) {
            if (this.f94764f.n0()) {
                xt1.t0.Ri().d(this.f94765g, 0, 0, 2);
            } else {
                xt1.t0.Ri().d(this.f94765g, 0, 0, 1);
            }
        }
        wt1.p pVar = this.Q;
        pVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "uninit");
        wt1.t tVar = pVar.f449331s;
        if (tVar != null) {
            android.content.BroadcastReceiver broadcastReceiver = tVar.f449348e;
            if (broadcastReceiver == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothStateListener null, return");
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(broadcastReceiver);
                tVar.f449348e = null;
            }
            pVar.f449331s = null;
        }
        pVar.f();
        pVar.f449335w = null;
        pVar.f449319d = null;
        super.onDestroy();
    }

    @Override // wt1.f
    public void onFail(int i17, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        lu1.r.e(this, str, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
            W6(false, -1);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        f7();
        super.onPause();
        boolean z17 = true;
        this.f94763e.V = true;
        xt1.t0.Bi().e(this, false);
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        wt1.p pVar = this.Q;
        if (!pVar.f449325m && !pVar.f449329q) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "stop");
            wt1.t tVar = pVar.f449331s;
            if (tVar != null) {
                tVar.c();
            }
            pVar.f();
            gm0.j1.n().f273288b.q(2574, pVar);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 69) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.baz), false, new com.tencent.mm.plugin.card.ui.r(this), null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.f94761J);
        if (this.f94761J) {
            return;
        }
        this.f94761J = true;
        Z6();
        if (this.L == null) {
            Z6();
        }
        b7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c7();
        b7();
        boolean z17 = false;
        this.f94763e.V = false;
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        xt1.t0.Bi().e(this, true);
        if ((this.f94773r || this.f94774s) && this.f94764f.i()) {
            boolean n07 = this.f94764f.n0();
            lu1.e eVar = lu1.e.CARDCODEREFRESHACTION_DOREFRESH;
            if (n07) {
                xt1.t0.Ri().d(this.f94765g, 0, 0, 2);
                java.lang.Boolean bool = (java.lang.Boolean) xt1.t0.Bi().f449291h.get(this.f94765g);
                if (bool != null && bool.booleanValue()) {
                    z17 = true;
                }
                if (!z17 || android.text.TextUtils.isEmpty(xt1.t0.Bi().f449294n)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
                    t5(xt1.t0.Bi().f449294n);
                }
                this.f94763e.f94944p.l(eVar);
            } else {
                xt1.t0.Ri().d(this.f94765g, 0, 0, 1);
                ku1.i iVar = this.f94763e.f94944p;
                if (iVar != null) {
                    iVar.l(eVar);
                }
            }
        }
        if (this.Q.f449322g) {
            this.Q.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r21, int r22, java.lang.String r23, com.tencent.mm.modelbase.m1 r24) {
        /*
            Method dump skipped, instructions count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.CardDetailUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // wt1.f
    public void onSuccess() {
        ku1.i iVar = this.f94763e.f94944p;
        if (iVar instanceof ku1.y) {
            ((ku1.y) iVar).f312157l = xt1.t0.Ai().b();
            this.f94763e.f();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "code get success");
    }

    @Override // wt1.a0
    public void p4(java.lang.String str, wt1.b0 b0Var) {
        if (android.text.TextUtils.isEmpty(str) || str.equals(this.f94765g)) {
            this.f94773r = false;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.card.ui.a0.class);
    }

    @Override // wt1.h
    public void t5(java.lang.String str) {
        hu1.g gVar = this.f94763e.f94937f;
        if (!(gVar == null ? false : ((hu1.a) gVar).f285071d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
            this.f94780y.post(new com.tencent.mm.plugin.card.ui.s(this, str));
        }
    }

    public final void x() {
        W6(true, -1);
    }

    @Override // wt1.h
    public void x3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onVibrate");
        this.F.vibrate(300L);
    }

    @Override // wt1.h
    public void x4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onFinishUI");
    }

    @Override // wt1.h
    public void y2(tt1.j jVar) {
        if (jVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
            return;
        }
        tt1.j jVar2 = this.f94764f;
        if (jVar2 == null || !jVar2.g().equals(jVar.g())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
            return;
        }
        hu1.g gVar = this.f94763e.f94937f;
        if (!(gVar == null ? false : ((hu1.a) gVar).f285071d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onDataChange");
        this.f94764f = jVar;
        this.f94765g = jVar.g();
        if (this.f94764f.N() && xt1.t0.Ai().c()) {
            xt1.t0.Ai().a(this.f94764f.g());
        }
        V6();
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        ku1.l0 l0Var;
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.card.ui.x3 x3Var;
        db5.d5 d5Var;
        ku1.i iVar = this.f94763e.f94944p;
        if (iVar != null) {
            tt1.j jVar = iVar.f312095d;
            if (jVar == null || (l0Var = iVar.f312099h) == null || (viewGroup = iVar.f312098g) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
            } else {
                l0Var.e(viewGroup, jVar);
                if (iVar.f312095d.i0().f385190p == 2 && (x3Var = iVar.f312094c) != null && (d5Var = x3Var.f95442f) != null && d5Var.isShowing()) {
                    x3Var.f95442f.dismiss();
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16827, this.f94765g, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }
}
