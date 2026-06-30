package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI */
/* loaded from: classes15.dex */
public class ActivityC13047x63b575f5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, wt1.h, wt1.a0, wt1.f, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public static final /* synthetic */ int S = 0;
    public java.util.ArrayList A;
    public android.os.Vibrator F;
    public i11.e L;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 f176296e;

    /* renamed from: f, reason: collision with root package name */
    public tt1.j f176297f;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f176311w;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 f176314z;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176295d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f176298g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f176299h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f176300i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f176301m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f176302n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f176303o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f176304p = "";

    /* renamed from: q, reason: collision with root package name */
    public boolean f176305q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176306r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176307s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f176308t = false;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f176309u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f176310v = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f176312x = false;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f176313y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
    public int B = 3;
    public int C = 0;
    public int D = -1;
    public boolean E = false;
    public boolean G = true;
    public long H = 0;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f176294J = false;
    public boolean K = false;
    public float M = -85.0f;
    public float N = -1000.0f;
    public java.lang.String P = "";
    public final wt1.p Q = new wt1.p();
    public final i11.c R = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o(this);

    @Override // wt1.a0
    public void A1(java.lang.String str, wt1.b0 b0Var, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f176298g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onMarkFail()");
        this.f176306r = false;
        this.f176307s = false;
        d7(false);
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.atz);
        }
        lu1.r.c(this, str2);
    }

    @Override // wt1.a0
    public void C5(java.lang.String str, wt1.b0 b0Var) {
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(this.f176298g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
            return;
        }
        d7(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onMarkSuccess()");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "markSucc:" + b0Var.f530783b + " markCardId: " + b0Var.f530784c);
        this.f176307s = false;
        if (b0Var.f530783b != 1) {
            this.f176306r = false;
            lu1.r.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572329au0));
            return;
        }
        if (android.text.TextUtils.isEmpty(b0Var.f530784c) || this.f176297f.g().equals(b0Var.f530784c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
            this.f176306r = true;
            if (this.f176296e.V) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
                this.f176296e.a(this.f176308t, b0Var, true);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
        if (this.f176297f.i()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd y07 = xt1.t0.nj().y0(b0Var.f530784c);
            if (y07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
                lu1.r.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.atz));
                this.f176306r = false;
                return;
            }
            this.f176297f = y07;
            this.f176298g = b0Var.f530784c;
            V6();
            wt1.i Bi = xt1.t0.Bi();
            tt1.j jVar = this.f176297f;
            Bi.f530825i = jVar;
            if (Bi.f530826m && jVar != null && jVar.g() != null && !jVar.g().equals(Bi.f530825i.g())) {
                Bi.f530826m = false;
            }
            if (Bi.f530821e != null) {
                for (int i17 = 0; i17 < ((java.util.ArrayList) Bi.f530821e).size(); i17++) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) Bi.f530821e).get(i17);
                    if (weakReference != null) {
                        wt1.h hVar = (wt1.h) weakReference.get();
                        java.lang.Boolean bool = (java.lang.Boolean) Bi.f530822f.get(hVar);
                        if (hVar != null && bool != null && !bool.booleanValue()) {
                            hVar.y2(jVar);
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "update the mCardInfo");
            this.f176306r = true;
            if (this.f176296e.V) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
                this.f176296e.a(this.f176308t, b0Var, true);
            }
        }
    }

    @Override // wt1.f
    public void F1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "code change");
        ku1.i iVar = this.f176296e.f176477p;
        if (iVar instanceof ku1.y) {
            ((ku1.y) iVar).f393690l = xt1.t0.Ai().b();
            this.f176296e.f();
        }
    }

    public final void T6() {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f176297f.f())) {
            str = this.f176297f.f();
        } else {
            if (android.text.TextUtils.isEmpty(this.f176298g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
                return;
            }
            str = this.f176298g;
        }
        tt1.j jVar = this.f176297f;
        if (jVar != null && jVar.s0().f470098x == 1) {
            float f17 = this.M;
            float f18 = this.N;
            if (f17 == -85.0f || f18 == -1000.0f) {
                f17 = xt1.t0.ij().f530813d;
                f18 = xt1.t0.ij().f530814e;
            }
            gm0.j1.n().f354821b.g(new xt1.d0(str, f18, f17, this.f176297f.g()));
            return;
        }
        tt1.j jVar2 = this.f176297f;
        if (jVar2 != null && jVar2.s0().f470098x > 1) {
            float f19 = this.M;
            if (f19 != -85.0f) {
                float f27 = this.N;
                if (f27 != -1000.0f) {
                    this.K = false;
                    gm0.j1.n().f354821b.g(new xt1.d0(str, f27, f19, this.f176297f.g()));
                    return;
                }
            }
            if (this.K) {
                return;
            }
            this.K = true;
            if (this.f176294J) {
                if (this.L == null) {
                    Z6();
                }
                b7();
                return;
            }
            return;
        }
        tt1.j jVar3 = this.f176297f;
        if (jVar3 != null) {
            jVar3.t(null);
            V6();
            if (this.f176297f.i()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd y07 = xt1.t0.nj().y0(this.f176298g);
                if (y07 != null) {
                    y07.t(null);
                    xt1.t0.nj().mo9952xce0038c9(y07, this.f176298g);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe z07 = xt1.t0.cj().z0(this.f176298g);
            if (z07 != null) {
                z07.t(null);
                xt1.t0.cj().mo9952xce0038c9(z07, this.f176298g);
            }
        }
    }

    public final void U6() {
        r45.pd6 pd6Var = new r45.pd6();
        java.lang.String str = this.f176309u;
        pd6Var.f464502d = str;
        pd6Var.f464503e = this.f176310v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", str);
        gm0.j1.n().f354821b.g(new xt1.h0(this.f176298g, this.B, this.f176299h, this.f176301m, this.f176302n, this.f176303o, this.C, this.f176304p, pd6Var));
    }

    public final void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = this.f176314z;
        p0Var.f176636a = this.B;
        p0Var.f176637b = this.D;
        p0Var.f176638c = this.f176298g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = this.f176296e;
        tt1.j jVar = this.f176297f;
        java.util.ArrayList arrayList = this.A;
        b0Var.E = jVar;
        b0Var.U = p0Var;
        b0Var.F = arrayList;
        if (jVar != null && jVar.d()) {
            b0Var.f176479r.f176673g = true;
        }
        this.f176296e.f();
        xt1.t0.Bi().f530825i = this.f176297f;
    }

    public final void W6(boolean z17, int i17) {
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_code", this.P);
            intent.putExtra("key_card_id", this.f176298g);
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
                intent2.putExtra("key_card_id", this.f176298g);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + i17 + " errMsg = " + str + " ret_code:" + i18 + " ret_msg:" + str2);
        if (i18 == 10000) {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ar_);
            }
            this.f176297f.i0().f466714d = 4;
            V6();
        } else if (i18 == 10001) {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ard);
            }
            this.f176297f.i0().f466714d = 5;
            V6();
        } else if (i18 == 10002) {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.aug);
            }
        } else if (android.text.TextUtils.isEmpty(str2)) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ar8);
        }
        lu1.r.c(this, str2);
    }

    public final void Y6() {
        int i17 = this.B;
        this.D = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0();
        this.f176314z = p0Var;
        p0Var.f176636a = i17;
        p0Var.f176637b = i17;
        p0Var.f176638c = this.f176298g;
        p0Var.f176639d = this.f176299h;
        p0Var.f176641f = this.f176301m;
        p0Var.f176640e = this.f176300i;
        this.f176314z.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var2 = this.f176314z;
        p0Var2.f176642g = this.f176305q;
        p0Var2.f176643h = getIntent().getIntExtra("key_from_appbrand_type", 0);
    }

    public final void Z6() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.L = i11.h.e();
    }

    public final void a7(int i17) {
        int i18 = this.D;
        if (i18 != 7 && i18 != 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        xt1.g gVar = new xt1.g();
        gVar.f457979d = this.f176297f.f();
        gVar.f457980e = this.f176301m;
        gVar.f538010f = this.P;
        linkedList.add(gVar);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5145x1e9b259c c5145x1e9b259c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5145x1e9b259c();
        am.b bVar = c5145x1e9b259c.f135495g;
        bVar.f87733b = i17;
        if (i17 == -1) {
            bVar.f87732a = lu1.v.b(linkedList, true, this.D);
        } else {
            bVar.f87732a = lu1.v.b(linkedList, false, this.D);
        }
        c5145x1e9b259c.e();
    }

    public final void b7() {
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        r45.e64 i17 = su4.r2.i();
        if (this.M == -85.0f && this.N == -1000.0f) {
            if (i17 != null) {
                this.M = i17.f454580e;
                this.N = i17.f454579d;
            } else {
                this.M = 0.0f;
                this.N = 0.0f;
            }
            wt1.g0 ij6 = xt1.t0.ij();
            float f17 = this.M;
            float f18 = this.N;
            ij6.f530813d = f17;
            ij6.f530814e = f18;
            ij6.f530815f = java.lang.System.currentTimeMillis() / 1000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "refreshLbs lbsLatitude:%s，lbsLongitude：%s", java.lang.Float.valueOf(this.M), java.lang.Float.valueOf(this.N));
        float f19 = this.N;
        float f27 = this.M;
        wt1.p pVar = this.Q;
        synchronized (pVar.f530857i) {
            pVar.f530860o = f27;
            pVar.f530861p = f19;
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
        gm0.j1.n().f354821b.a(1057, this);
        gm0.j1.n().f354821b.a(1037, this);
        gm0.j1.n().f354821b.a(1058, this);
        gm0.j1.n().f354821b.a(1045, this);
        gm0.j1.n().f354821b.a(mc1.l.f72830x366c91de, this);
        gm0.j1.n().f354821b.a(1099, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de, this);
        gm0.j1.n().f354821b.a(1051, this);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.t.f34996x366c91de, this);
    }

    public final void d7(boolean z17) {
        if (z17) {
            this.f176295d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176295d;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f176295d.dismiss();
        this.f176295d = null;
    }

    public final void e7() {
        tt1.j jVar;
        if (this.I || (jVar = this.f176297f) == null) {
            return;
        }
        this.I = true;
        if (this.f176305q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ShareCardDetailUI", java.lang.Integer.valueOf(jVar.s0().f470083i), this.f176297f.f(), this.f176297f.g(), 0, java.lang.Integer.valueOf(this.D), this.f176299h, java.lang.Integer.valueOf(this.f176297f.n() ? 1 : 0), "");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardDetailView", java.lang.Integer.valueOf(jVar.s0().f470083i), this.f176297f.f(), this.f176297f.g(), 0, java.lang.Integer.valueOf(this.D), this.f176299h, java.lang.Integer.valueOf(this.f176297f.n() ? 1 : 0), "");
        }
    }

    public final void f7() {
        gm0.j1.n().f354821b.q(1057, this);
        gm0.j1.n().f354821b.q(1037, this);
        gm0.j1.n().f354821b.q(1058, this);
        gm0.j1.n().f354821b.q(1045, this);
        gm0.j1.n().f354821b.q(mc1.l.f72830x366c91de, this);
        gm0.j1.n().f354821b.q(1099, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de, this);
        gm0.j1.n().f354821b.q(1051, this);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.t.f34996x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569827pc;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0677  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.H = java.lang.System.currentTimeMillis();
        c7();
        wt1.i Bi = xt1.t0.Bi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        Bi.getClass();
        gm0.j1.n().f354821b.a(oc1.e.f73030x366c91de, Bi);
        xt1.t0.mj().c(Bi);
        wt1.c wi6 = xt1.t0.wi();
        if (wi6.f530791h == null) {
            wi6.f530791h = new java.util.ArrayList();
        }
        ((java.util.ArrayList) wi6.f530791h).add(new java.lang.ref.WeakReference(Bi));
        Bi.f530820d = new java.lang.ref.WeakReference(mo55332x76847179);
        wt1.i Bi2 = xt1.t0.Bi();
        if (Bi2.f530821e == null) {
            Bi2.f530821e = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Bi2.f530821e).add(new java.lang.ref.WeakReference(this));
        wt1.c0 Ri = xt1.t0.Ri();
        if (Ri.f530792d == null) {
            Ri.f530792d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f530792d).add(new java.lang.ref.WeakReference(this));
        wt1.g Ai = xt1.t0.Ai();
        Ai.getClass();
        gm0.j1.n().f354821b.a(nd1.a2.f72909x366c91de, Ai);
        Ai.f530804f.clear();
        Ai.f530805g = 0;
        wt1.g Ai2 = xt1.t0.Ai();
        if (Ai2.f530802d == null) {
            Ai2.f530802d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ai2.f530802d).add(new java.lang.ref.WeakReference(this));
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        tt1.j jVar;
        wt1.m mVar;
        tt1.l lVar;
        wt1.i Bi = xt1.t0.Bi();
        if (Bi.f530822f == null) {
            Bi.f530822f = new java.util.HashMap();
        }
        Bi.f530822f.remove(this);
        f7();
        xt1.t0.Bi().f(this);
        wt1.i Bi2 = xt1.t0.Bi();
        Bi2.getClass();
        gm0.j1.n().f354821b.q(oc1.e.f73030x366c91de, Bi2);
        xt1.t0.mj().d(Bi2);
        wt1.c wi6 = xt1.t0.wi();
        if (wi6.f530791h != null) {
            int i17 = 0;
            while (true) {
                if (i17 < ((java.util.ArrayList) wi6.f530791h).size()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) wi6.f530791h).get(i17);
                    if (weakReference != null && (lVar = (tt1.l) weakReference.get()) != null && lVar.equals(Bi2)) {
                        ((java.util.ArrayList) wi6.f530791h).remove(weakReference);
                        break;
                    }
                    i17++;
                } else {
                    break;
                }
            }
        }
        ((java.util.ArrayList) Bi2.f530821e).clear();
        Bi2.f530822f.clear();
        Bi2.f530824h.clear();
        Bi2.f530826m = false;
        xt1.t0.Ri().f(this);
        xt1.t0.Ai().g(this);
        wt1.g Ai = xt1.t0.Ai();
        Ai.getClass();
        gm0.j1.n().f354821b.q(nd1.a2.f72909x366c91de, Ai);
        Ai.f530804f.clear();
        Ai.f530810o = false;
        Ai.f530803e = "";
        Ai.f530805g = 0;
        Ai.f530806h = 0;
        Ai.f530807i = 0;
        Ai.f530808m = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = Ai.f530811p;
        if (!b4Var.e()) {
            b4Var.d();
        }
        Ai.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = this.f176296e;
        wt1.k kVar = b0Var.H;
        kVar.f530836b = null;
        ((java.util.ArrayList) kVar.f530838d).clear();
        b0Var.H = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 x3Var = b0Var.C;
        lu1.a0.F(x3Var.f176974e);
        java.util.ArrayList arrayList = x3Var.f176985p;
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
        if (x3Var.f176975f.isShowing()) {
            x3Var.f176975f.dismiss();
        }
        x3Var.f176975f = null;
        float f17 = x3Var.f176984o;
        android.view.WindowManager.LayoutParams attributes = x3Var.f176970a.getWindow().getAttributes();
        attributes.screenBrightness = f17;
        x3Var.f176970a.getWindow().setAttributes(attributes);
        x3Var.f176970a = null;
        x3Var.f176986q = null;
        b0Var.C = null;
        mu1.j jVar2 = b0Var.f176475n;
        if (jVar2 != null) {
            mu1.a aVar = (mu1.a) jVar2;
            aVar.f412872f = null;
            aVar.f412868b = null;
        }
        b0Var.f176469e.m78545xde66c1f2(null);
        b0Var.Y.mo48814x2efc64();
        b0Var.f176471g.f393665a = null;
        b0Var.f176474m.f393665a = null;
        b0Var.f176473i.f393665a = null;
        b0Var.A.f393665a = null;
        ku1.m mVar2 = b0Var.B;
        if (mVar2 != null) {
            ku1.c cVar = (ku1.c) mVar2;
            cVar.f393665a = null;
            cVar.f393600e = null;
            cVar.f393601f = null;
        }
        ku1.m mVar3 = b0Var.f176481t;
        if (mVar3 != null) {
            mVar3.f393665a = null;
        }
        ku1.m mVar4 = b0Var.f176480s;
        if (mVar4 != null) {
            mVar4.f393665a = null;
        }
        ku1.m mVar5 = b0Var.f176482u;
        if (mVar5 != null) {
            mVar5.f393665a = null;
        }
        ku1.m mVar6 = b0Var.f176483v;
        if (mVar6 != null) {
            mVar6.f393665a = null;
        }
        ku1.m mVar7 = b0Var.f176484w;
        if (mVar7 != null) {
            mVar7.f393665a = null;
        }
        ku1.m mVar8 = b0Var.f176485x;
        if (mVar8 != null) {
            mVar8.f393665a = null;
        }
        ku1.m mVar9 = b0Var.f176486y;
        if (mVar9 != null) {
            mVar9.f393665a = null;
        }
        ku1.m mVar10 = b0Var.f176487z;
        if (mVar10 != null) {
            mVar10.f393665a = null;
        }
        ku1.i iVar = b0Var.f176477p;
        if (iVar != null) {
            iVar.f();
        }
        b0Var.f176470f = null;
        wt1.n Ni = xt1.t0.Ni();
        if (Ni.f530843d != null) {
            int i18 = 0;
            while (true) {
                if (i18 < ((java.util.ArrayList) Ni.f530843d).size()) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) Ni.f530843d).get(i18);
                    if (weakReference2 != null && (mVar = (wt1.m) weakReference2.get()) != null && mVar.equals(b0Var)) {
                        ((java.util.ArrayList) Ni.f530843d).remove(weakReference2);
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
        }
        wt1.n Ni2 = xt1.t0.Ni();
        Ni2.f530845f = 0;
        Ni2.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "removeNetSceneListener!");
        gm0.j1.n().f354821b.q(1382, Ni2);
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de, Ni2);
        this.F.cancel();
        i11.e eVar = this.L;
        if (eVar != null) {
            ((i11.h) eVar).m(this.R);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.H;
        if (this.f176297f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13219, "CardDetailView", java.lang.Integer.valueOf(this.B), this.f176297f.f(), this.f176297f.g(), java.lang.Long.valueOf(currentTimeMillis));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.B);
            java.lang.String str = this.f176298g;
            g0Var.d(13219, "CardDetailView", valueOf, str, str, java.lang.Long.valueOf(currentTimeMillis));
        }
        if ((this.f176306r || this.f176307s) && (jVar = this.f176297f) != null && jVar.i()) {
            if (this.f176297f.n0()) {
                xt1.t0.Ri().d(this.f176298g, 0, 0, 2);
            } else {
                xt1.t0.Ri().d(this.f176298g, 0, 0, 1);
            }
        }
        wt1.p pVar = this.Q;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "uninit");
        wt1.t tVar = pVar.f530864s;
        if (tVar != null) {
            android.content.BroadcastReceiver broadcastReceiver = tVar.f530881e;
            if (broadcastReceiver == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardLbsOrBluetooth", "bluetoothStateListener null, return");
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
                tVar.f530881e = null;
            }
            pVar.f530864s = null;
        }
        pVar.f();
        pVar.f530868w = null;
        pVar.f530852d = null;
        super.onDestroy();
    }

    @Override // wt1.f
    /* renamed from: onFail */
    public void mo54446xc399519d(int i17, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        lu1.r.e(this, str, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
            W6(false, -1);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        f7();
        super.onPause();
        boolean z17 = true;
        this.f176296e.V = true;
        xt1.t0.Bi().e(this, false);
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this);
        wt1.p pVar = this.Q;
        if (!pVar.f530858m && !pVar.f530862q) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "stop");
            wt1.t tVar = pVar.f530864s;
            if (tVar != null) {
                tVar.c();
            }
            pVar.f();
            gm0.j1.n().f354821b.q(2574, pVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 69) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.r(this), null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.f176294J);
        if (this.f176294J) {
            return;
        }
        this.f176294J = true;
        Z6();
        if (this.L == null) {
            Z6();
        }
        b7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c7();
        b7();
        boolean z17 = false;
        this.f176296e.V = false;
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(this, this);
        xt1.t0.Bi().e(this, true);
        if ((this.f176306r || this.f176307s) && this.f176297f.i()) {
            boolean n07 = this.f176297f.n0();
            lu1.e eVar = lu1.e.CARDCODEREFRESHACTION_DOREFRESH;
            if (n07) {
                xt1.t0.Ri().d(this.f176298g, 0, 0, 2);
                java.lang.Boolean bool = (java.lang.Boolean) xt1.t0.Bi().f530824h.get(this.f176298g);
                if (bool != null && bool.booleanValue()) {
                    z17 = true;
                }
                if (!z17 || android.text.TextUtils.isEmpty(xt1.t0.Bi().f530827n)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
                    t5(xt1.t0.Bi().f530827n);
                }
                this.f176296e.f176477p.l(eVar);
            } else {
                xt1.t0.Ri().d(this.f176298g, 0, 0, 1);
                ku1.i iVar = this.f176296e.f176477p;
                if (iVar != null) {
                    iVar.l(eVar);
                }
            }
        }
        if (this.Q.f530855g) {
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
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r21, int r22, java.lang.String r23, com.p314xaae8f345.mm.p944x882e457a.m1 r24) {
        /*
            Method dump skipped, instructions count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // wt1.f
    /* renamed from: onSuccess */
    public void mo54447xe05b4124() {
        ku1.i iVar = this.f176296e.f176477p;
        if (iVar instanceof ku1.y) {
            ((ku1.y) iVar).f393690l = xt1.t0.Ai().b();
            this.f176296e.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "code get success");
    }

    @Override // wt1.a0
    public void p4(java.lang.String str, wt1.b0 b0Var) {
        if (android.text.TextUtils.isEmpty(str) || str.equals(this.f176298g)) {
            this.f176306r = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a0.class);
    }

    @Override // wt1.h
    public void t5(java.lang.String str) {
        hu1.g gVar = this.f176296e.f176470f;
        if (!(gVar == null ? false : ((hu1.a) gVar).f366604d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
            this.f176313y.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s(this, str));
        }
    }

    public final void x() {
        W6(true, -1);
    }

    @Override // wt1.h
    public void x3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onVibrate");
        this.F.vibrate(300L);
    }

    @Override // wt1.h
    public void x4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onFinishUI");
    }

    @Override // wt1.h
    public void y2(tt1.j jVar) {
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
            return;
        }
        tt1.j jVar2 = this.f176297f;
        if (jVar2 == null || !jVar2.g().equals(jVar.g())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
            return;
        }
        hu1.g gVar = this.f176296e.f176470f;
        if (!(gVar == null ? false : ((hu1.a) gVar).f366604d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onDataChange");
        this.f176297f = jVar;
        this.f176298g = jVar.g();
        if (this.f176297f.N() && xt1.t0.Ai().c()) {
            xt1.t0.Ai().a(this.f176297f.g());
        }
        V6();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        ku1.l0 l0Var;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 x3Var;
        db5.d5 d5Var;
        ku1.i iVar = this.f176296e.f176477p;
        if (iVar != null) {
            tt1.j jVar = iVar.f393628d;
            if (jVar == null || (l0Var = iVar.f393632h) == null || (viewGroup = iVar.f393631g) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
            } else {
                l0Var.e(viewGroup, jVar);
                if (iVar.f393628d.i0().f466723p == 2 && (x3Var = iVar.f393627c) != null && (d5Var = x3Var.f176975f) != null && d5Var.isShowing()) {
                    x3Var.f176975f.dismiss();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16827, this.f176298g, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }
}
