package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class b0 implements com.p314xaae8f345.mm.ui.da, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4, wt1.m {
    public ku1.e A;
    public ku1.m B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 C;
    public tt1.j E;
    public java.util.ArrayList F;
    public wt1.k H;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 T;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 U;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Y;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f176468d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f176469e;

    /* renamed from: f, reason: collision with root package name */
    public hu1.g f176470f;

    /* renamed from: g, reason: collision with root package name */
    public ku1.m f176471g;

    /* renamed from: i, reason: collision with root package name */
    public ku1.m f176473i;

    /* renamed from: m, reason: collision with root package name */
    public ku1.m f176474m;

    /* renamed from: n, reason: collision with root package name */
    public mu1.j f176475n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f176476o;

    /* renamed from: p, reason: collision with root package name */
    public ku1.i f176477p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f176478q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q4 f176479r;

    /* renamed from: s, reason: collision with root package name */
    public ku1.m f176480s;

    /* renamed from: t, reason: collision with root package name */
    public ku1.m f176481t;

    /* renamed from: u, reason: collision with root package name */
    public ku1.m f176482u;

    /* renamed from: v, reason: collision with root package name */
    public ku1.m f176483v;

    /* renamed from: w, reason: collision with root package name */
    public ku1.m f176484w;

    /* renamed from: x, reason: collision with root package name */
    public ku1.m f176485x;

    /* renamed from: y, reason: collision with root package name */
    public ku1.m f176486y;

    /* renamed from: z, reason: collision with root package name */
    public ku1.m f176487z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f176472h = false;
    public boolean D = true;
    public final java.util.List G = new java.util.ArrayList();
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f176467J = "";
    public int K = 0;
    public java.lang.String L = "";
    public java.lang.String M = "";
    public java.util.ArrayList N = new java.util.ArrayList();
    public java.util.ArrayList P = new java.util.ArrayList();
    public final java.util.HashMap Q = new java.util.HashMap();
    public final java.util.HashMap R = new java.util.HashMap();
    public final java.util.ArrayList S = new java.util.ArrayList();
    public boolean V = false;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e0(this);
    public final android.view.View.OnClickListener X = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.h0(this);

    public b0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.Y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5283xee2df026>(a0Var) { // from class: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$9
            {
                this.f39173x3fe91575 = -270499818;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5283xee2df026 c5283xee2df026) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5283xee2df026 c5283xee2df0262 = c5283xee2df026;
                if (gm0.j1.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "deal with card notify event ConsumedCardByOfflinePayEvent");
                    if (c5283xee2df0262 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5283xee2df026) {
                        c5283xee2df0262.f135606g.getClass();
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0.this.f176469e;
                        lu1.r.c(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awb));
                        return true;
                    }
                }
                return false;
            }
        };
        this.f176469e = abstractActivityC21394xb3d2c0cf;
        this.f176468d = view;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var) {
        b0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        tt1.j jVar = b0Var.E;
        if (jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) {
            intent.putExtra("key_card_info_data", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) jVar);
        } else if (jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) {
            intent.putExtra("key_card_info_data", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) jVar);
        }
        intent.putExtra("key_from_appbrand_type", b0Var.U.f176643h);
        intent.setClass(b0Var.f176469e, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b0Var.f176469e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardDetailUIContoller", "goToCardShopUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller", "goToCardShopUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "UsedStoresView", java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f176637b), b0Var.U.f176639d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var) {
        b0Var.getClass();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f415659j = false;
        rVar.f415651b = 0;
        rVar.f415652c = b0Var;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(b0Var.f176469e, rVar);
    }

    public void a(boolean z17, wt1.b0 b0Var, boolean z18) {
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardConsumedCodeUI", java.lang.Integer.valueOf(this.E.s0().f470083i), this.E.f(), this.E.g(), 0, java.lang.Integer.valueOf(this.U.f176637b), this.U.f176639d, java.lang.Integer.valueOf(this.E.n() ? 1 : 0), "");
            i(b0Var.f530782a);
            return;
        }
        r45.w50 w50Var = this.E.i0().f466731x;
        boolean n07 = this.E.n0();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f176469e;
        if (n07) {
            lu1.d.g(abstractActivityC21394xb3d2c0cf, b0Var.f530785d, b0Var.f530786e, z18, this.E);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 17, this.E.g(), this.E.f(), "", this.E.i0().f466731x.f470411d);
            return;
        }
        if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f470420p) && !android.text.TextUtils.isEmpty(w50Var.f470421q)) {
            java.lang.String g17 = this.E.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = this.U;
            lu1.d.e(g17, w50Var, p0Var.f176637b, p0Var.f176643h);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 6;
            objArr[1] = this.E.g();
            objArr[2] = this.E.f();
            objArr[3] = "";
            java.lang.String str = w50Var.f470411d;
            objArr[4] = str != null ? str : "";
            g0Var.d(11941, objArr);
            return;
        }
        if (w50Var == null || android.text.TextUtils.isEmpty(w50Var.f470414g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "CardConsumedCodeUI", java.lang.Integer.valueOf(this.E.s0().f470083i), this.E.f(), this.E.g(), 0, java.lang.Integer.valueOf(this.U.f176637b), this.U.f176639d, java.lang.Integer.valueOf(this.E.n() ? 1 : 0), "");
            i(b0Var.f530782a);
            return;
        }
        lu1.d.j(abstractActivityC21394xb3d2c0cf, lu1.a0.k(w50Var.f470414g, w50Var.f470415h), 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = 6;
        objArr2[1] = this.E.g();
        objArr2[2] = this.E.f();
        objArr2[3] = "";
        java.lang.String str2 = w50Var.f470411d;
        objArr2[4] = str2 != null ? str2 : "";
        g0Var2.d(11941, objArr2);
    }

    public final int d(int i17) {
        java.util.LinkedList linkedList = this.E.i0().f466729v;
        if (linkedList == null) {
            return i17;
        }
        java.util.HashMap hashMap = this.R;
        hashMap.clear();
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            r45.s1 s1Var = (r45.s1) linkedList.get(i18);
            boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s1Var.f466908e) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s1Var.f466909f)) ? false : true;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s1Var.f466907d) && z17) {
                this.S.add(s1Var.f466907d);
                this.Q.put(java.lang.Integer.valueOf(i17), s1Var.f466907d);
                hashMap.put(s1Var.f466907d, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o0(s1Var));
                i17++;
            }
        }
        return i17;
    }

    public final void e() {
        if (this.E.s0().f470089p0 == null || !this.E.s0().f470089p0.f454959d) {
            if (this.E.s0().f470083i == 10) {
                this.f176477p = new ku1.y();
                return;
            } else {
                this.f176477p = new ku1.n();
                return;
            }
        }
        this.f176477p = new ku1.r();
        wt1.n Ni = xt1.t0.Ni();
        if (Ni.f530843d == null) {
            Ni.f530843d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ni.f530843d).add(new java.lang.ref.WeakReference(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v54 */
    public void f() {
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList;
        java.util.List c17;
        int i17;
        int i18;
        int i19;
        tt1.j jVar = this.E;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo == null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var = this.T;
            if (s0Var != null) {
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var).f176657a.x();
                return;
            }
            return;
        }
        if (jVar.s0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getCardTpInfo() == null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var2 = this.T;
            if (s0Var2 != null) {
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var2).f176657a.x();
                return;
            }
            return;
        }
        if (this.E.i0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getDataInfo() == null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var3 = this.T;
            if (s0Var3 != null) {
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var3).f176657a.x();
                return;
            }
            return;
        }
        if (!this.E.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, not support card type :%d", java.lang.Integer.valueOf(this.E.s0().f470083i));
            if (android.text.TextUtils.isEmpty(this.E.s0().A)) {
                db5.e1.G(this.f176469e, h(com.p314xaae8f345.mm.R.C30867xcad56011.auh), null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d0(this));
                return;
            }
            lu1.d.j(this.f176469e, this.E.s0().A, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var4 = this.T;
            if (s0Var4 != null) {
                int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.S;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var4).f176657a.x();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "doUpdate()");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "doUpdate() showAcceptView:" + this.E.s0().W);
        wt1.k kVar = this.H;
        tt1.j jVar2 = this.E;
        java.util.ArrayList arrayList2 = this.F;
        int i38 = this.U.f176636a;
        kVar.f530836b = jVar2;
        kVar.f530840f = arrayList2;
        kVar.f530837c = i38;
        if ((this.f176470f != null && (!jVar2.i() ? !(!this.E.o() ? !(!this.E.Q() ? !(!this.E.d() ? !(!this.E.X() ? !(!this.E.m0() ? (this.f176470f instanceof hu1.a) : (this.f176470f instanceof hu1.d)) : (this.f176470f instanceof hu1.f)) : (this.f176470f instanceof hu1.c)) : (this.f176470f instanceof hu1.b)) : (this.f176470f instanceof hu1.e)) : (this.f176470f instanceof hu1.h))) != false) {
            hu1.a aVar = (hu1.a) this.f176470f;
            aVar.f366603c = null;
            aVar.f366602b = null;
            aVar.f366601a = null;
            this.f176470f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, need recreate show logic, card_type:%d", java.lang.Integer.valueOf(this.E.s0().f470083i));
        }
        if (this.f176470f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, mCardShowLogic == null, card_type:%d", java.lang.Integer.valueOf(this.E.s0().f470083i));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "createShowLogic, card_type:%d", java.lang.Integer.valueOf(this.E.s0().f470083i));
            boolean i39 = this.E.i();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f176469e;
            if (i39) {
                this.f176470f = new hu1.h(abstractActivityC21394xb3d2c0cf);
            } else {
                int i47 = this.E.s0().f470083i;
                if (i47 == 0) {
                    this.f176470f = new hu1.c(abstractActivityC21394xb3d2c0cf);
                } else if (i47 == 20) {
                    this.f176470f = new hu1.f(abstractActivityC21394xb3d2c0cf);
                } else if (i47 == 30) {
                    this.f176470f = new hu1.d(abstractActivityC21394xb3d2c0cf);
                } else if (i47 == 10) {
                    this.f176470f = new hu1.e(abstractActivityC21394xb3d2c0cf);
                } else if (i47 != 11) {
                    this.f176470f = new hu1.a(abstractActivityC21394xb3d2c0cf);
                } else {
                    this.f176470f = new hu1.b(abstractActivityC21394xb3d2c0cf);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, card_tye:%d", java.lang.Integer.valueOf(this.E.s0().f470083i));
        hu1.g gVar = this.f176470f;
        tt1.j jVar3 = this.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p0 p0Var = this.U;
        hu1.a aVar2 = (hu1.a) gVar;
        aVar2.f366603c = jVar3;
        aVar2.f366602b = p0Var;
        aVar2.x();
        hu1.a aVar3 = (hu1.a) this.f176470f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", java.lang.Integer.valueOf(!android.text.TextUtils.isEmpty(aVar3.f366603c.i0().f466722o) ? 1 : 0), aVar3.s(), java.lang.Integer.valueOf(aVar3.f366604d ? 1 : 0), java.lang.Integer.valueOf(aVar3.m() ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366606f ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366607g ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366608h ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366609i ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366610j ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366611k ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366612l ? 1 : 0), java.lang.Integer.valueOf(aVar3.f366613m ? 1 : 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "");
        boolean o17 = this.f176470f.o();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f176469e;
        if (o17) {
            abstractActivityC21394xb3d2c0cf2.mo54450xbf7c1df6(this.H.d());
        } else {
            abstractActivityC21394xb3d2c0cf2.mo54450xbf7c1df6("");
        }
        tt1.j jVar4 = this.E;
        if (jVar4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "updateWidget, mCardInfo is null");
        } else {
            if ((this.f176475n != null && (!jVar4.o() ? !this.E.Q() ? !(!this.E.d() ? !(!this.E.X() ? !(!this.E.m0() || (this.f176475n instanceof mu1.g)) : !(this.f176475n instanceof mu1.i)) : !(this.f176475n instanceof mu1.e)) : !(this.f176475n instanceof mu1.f) : (this.f176475n instanceof mu1.h))) != false) {
                android.view.View f17 = ((mu1.a) this.f176475n).f();
                if (f17 != null) {
                    this.f176476o.removeView(f17);
                }
                this.f176476o.removeAllViews();
                this.f176476o.invalidate();
                mu1.a aVar4 = (mu1.a) this.f176475n;
                aVar4.f412872f = null;
                aVar4.f412868b = null;
                this.f176475n = null;
            }
            if (this.f176475n == null) {
                boolean o18 = this.E.o();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = this.f176469e;
                if (o18) {
                    this.f176475n = new mu1.h(abstractActivityC21394xb3d2c0cf3);
                } else if (this.E.Q()) {
                    this.f176475n = new mu1.f(abstractActivityC21394xb3d2c0cf3);
                } else if (this.E.d()) {
                    this.f176475n = new mu1.e(abstractActivityC21394xb3d2c0cf3);
                } else if (this.E.X()) {
                    this.f176475n = new mu1.i(abstractActivityC21394xb3d2c0cf3);
                } else if (this.E.m0()) {
                    this.f176475n = new mu1.g(abstractActivityC21394xb3d2c0cf3);
                } else {
                    this.f176475n = new mu1.e(abstractActivityC21394xb3d2c0cf3);
                }
                mu1.a aVar5 = (mu1.a) this.f176475n;
                aVar5.f412867a = this.E;
                android.view.View f18 = aVar5.f();
                if (f18 != null) {
                    android.widget.LinearLayout linearLayout = this.f176476o;
                    f18.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(f18);
                }
                this.f176476o.invalidate();
                this.f176475n.mo148379xa0ca35fb(this.X);
                mu1.j jVar5 = this.f176475n;
                if (jVar5 != null) {
                    jVar5.d(false, false);
                }
            }
            if (this.f176475n != null) {
                if (this.E.X()) {
                    ((mu1.i) this.f176475n).f412923q = this.F;
                }
                mu1.a aVar6 = (mu1.a) this.f176475n;
                aVar6.f412867a = this.E;
                aVar6.i();
            }
        }
        if (this.f176470f.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateShareUsersInfoLayout()");
            this.f176471g.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't updateShareUsersInfoLayout()");
            this.f176471g.d(8);
        }
        if (this.f176470f.m()) {
            if (this.B == null) {
                ku1.c cVar = new ku1.c();
                this.B = cVar;
                cVar.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update CardAcceptView()");
            this.B.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardAcceptView()");
            ku1.m mVar = this.B;
            if (mVar != null) {
                mVar.d(8);
            }
        }
        this.f176469e.mo74408xb0dfae51(((hu1.a) this.f176470f).f366609i);
        if (((hu1.a) this.f176470f).f366611k) {
            java.util.HashMap hashMap = this.Q;
            hashMap.clear();
            java.util.ArrayList arrayList3 = this.S;
            arrayList3.clear();
            if (this.E.q()) {
                arrayList3.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.awa));
                hashMap.put(0, "menu_func_share_friend");
                arrayList3.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.aw_));
                hashMap.put(1, "menu_func_share_timeline");
                i19 = 2;
            } else {
                i19 = 0;
            }
            if (!android.text.TextUtils.isEmpty(this.E.i0().f466727t)) {
                arrayList3.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.aua));
                hashMap.put(java.lang.Integer.valueOf(i19), "menu_func_report");
                i19++;
            }
            d(i19);
            if (arrayList3.size() > 0) {
                this.f176469e.mo74408xb0dfae51(true);
            }
        }
        if (((hu1.a) this.f176470f).f366612l) {
            java.util.HashMap hashMap2 = this.Q;
            hashMap2.clear();
            java.util.ArrayList arrayList4 = this.S;
            arrayList4.clear();
            if (this.E.B() && this.E.u()) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E.s0().f470105z1)) {
                    arrayList4.add(this.E.s0().f470105z1);
                } else if (this.E.m0()) {
                    arrayList4.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.au_));
                } else {
                    arrayList4.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.au9));
                }
                hashMap2.put(0, "menu_func_gift");
                i18 = 1;
            } else {
                i18 = 0;
            }
            int d17 = d(i18);
            if (!android.text.TextUtils.isEmpty(this.E.i0().f466727t)) {
                arrayList4.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.aua));
                hashMap2.put(java.lang.Integer.valueOf(d17), "menu_func_report");
                d17++;
            }
            if (this.E.B()) {
                arrayList4.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
                hashMap2.put(java.lang.Integer.valueOf(d17), "menu_func_delete");
            } else if (this.E.i()) {
                java.lang.String r17 = c01.z1.r();
                java.lang.String a17 = this.E.a();
                if (r17 == null || !r17.equals(a17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "the card is not belong mine");
                } else {
                    arrayList4.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
                    hashMap2.put(java.lang.Integer.valueOf(d17), "menu_func_delete_share_card");
                }
            }
            if (arrayList4.size() > 0) {
                this.f176469e.mo74408xb0dfae51(true);
            }
        }
        if (((hu1.a) this.f176470f).f366613m) {
            java.util.HashMap hashMap3 = this.Q;
            hashMap3.clear();
            java.util.ArrayList arrayList5 = this.S;
            arrayList5.clear();
            if (android.text.TextUtils.isEmpty(this.E.i0().f466727t)) {
                i17 = 0;
            } else {
                arrayList5.add(h(com.p314xaae8f345.mm.R.C30867xcad56011.aua));
                hashMap3.put(0, "menu_func_report");
                i17 = 1;
            }
            d(i17);
            if (arrayList5.size() > 0) {
                this.f176469e.mo74408xb0dfae51(true);
            }
        }
        hu1.a aVar7 = (hu1.a) this.f176470f;
        boolean z17 = aVar7.f366610j;
        mu1.j jVar6 = this.f176475n;
        if (jVar6 != null && (jVar6 instanceof mu1.e)) {
        }
        boolean z18 = aVar7.f366607g;
        boolean z19 = aVar7.f366608h;
        if (jVar6 != null) {
            jVar6.d(z18, z19);
        }
        if (!this.E.o() && this.f176470f.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update mFromUserView");
            this.f176473i.e();
        } else if (this.E.o() && this.f176470f.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout for username");
            this.f176474m.e();
        } else if (this.f176470f.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout");
            this.f176474m.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update mFromUserView and mAcceptHeaderLayout");
            this.f176474m.d(8);
            this.f176473i.d(8);
        }
        mu1.j jVar7 = this.f176475n;
        if (jVar7 != null) {
            jVar7.c(((hu1.a) this.f176470f).f366604d);
        }
        j();
        if (this.f176470f.k()) {
            if (this.f176481t == null) {
                ku1.h0 h0Var = new ku1.h0();
                this.f176481t = h0Var;
                h0Var.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update CardStatusView");
            this.f176481t.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardStatusView");
            ku1.m mVar2 = this.f176481t;
            if (mVar2 != null) {
                mVar2.d(8);
            }
        }
        if (this.f176470f.d()) {
            if (this.f176480s == null) {
                ku1.d dVar = new ku1.d();
                this.f176480s = dVar;
                dVar.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update mAdtitleView()");
            this.f176480s.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update AdTitleView()");
            ku1.m mVar3 = this.f176480s;
            if (mVar3 != null) {
                mVar3.d(8);
            }
        }
        if (this.f176470f.q()) {
            if (this.f176482u == null) {
                ku1.o oVar = new ku1.o();
                this.f176482u = oVar;
                oVar.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update mCardDetailFieldView()");
            this.f176482u.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update mCardDetailFieldView()");
            ku1.m mVar4 = this.f176482u;
            if (mVar4 != null) {
                mVar4.d(8);
            }
        }
        if (this.f176470f.h()) {
            if (this.f176483v == null) {
                ku1.e0 e0Var = new ku1.e0();
                this.f176483v = e0Var;
                e0Var.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update CardSecondaryFieldView");
            this.f176483v.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardSecondaryFieldView");
            ku1.m mVar5 = this.f176483v;
            if (mVar5 != null) {
                mVar5.d(8);
            }
        }
        if (this.f176470f.b()) {
            if (this.f176484w == null) {
                ku1.q qVar = new ku1.q();
                this.f176484w = qVar;
                qVar.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update CardDetailTableView");
            this.f176484w.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardDetailTableView");
            ku1.m mVar6 = this.f176484w;
            if (mVar6 != null) {
                mVar6.d(8);
            }
        }
        hu1.a aVar8 = (hu1.a) this.f176470f;
        if (((aVar8.f366603c.i0().f466728u == null || android.text.TextUtils.isEmpty(aVar8.f366603c.i0().f466728u.f470411d)) ? false : true) == true) {
            if (this.f176485x == null) {
                ku1.i0 i0Var = new ku1.i0();
                this.f176485x = i0Var;
                i0Var.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update CardThirdFieldView");
            this.f176485x.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardThirdFieldView");
            ku1.m mVar7 = this.f176485x;
            if (mVar7 != null) {
                mVar7.d(8);
            }
        }
        if (this.f176470f.c()) {
            if (this.f176486y == null) {
                ku1.f fVar = new ku1.f();
                this.f176486y = fVar;
                fVar.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateCardAnnoucementView");
            this.f176486y.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't updateCardAnnoucementView");
            ku1.m mVar8 = this.f176486y;
            if (mVar8 != null) {
                mVar8.d(8);
            }
        }
        if (this.f176470f.e()) {
            if (this.f176487z == null) {
                ku1.c0 c0Var = new ku1.c0();
                this.f176487z = c0Var;
                c0Var.a(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateCardOperateFieldView");
            this.f176487z.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't updateCardOperateFieldView");
            ku1.m mVar9 = this.f176487z;
            if (mVar9 != null) {
                mVar9.d(8);
            }
        }
        if (this.f176470f.p()) {
            ((java.util.ArrayList) this.G).clear();
            java.util.List list = this.G;
            wt1.k kVar2 = this.H;
            ((java.util.ArrayList) kVar2.f530838d).clear();
            if (kVar2.f530836b.i0().B != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar2.f530836b.i0().B.f470411d)) {
                xt1.b bVar = new xt1.b();
                bVar.f537976t = 1;
                bVar.f461376d = kVar2.f530836b.i0().B.f470411d;
                bVar.f461378f = "";
                bVar.f461379g = "card://jump_card_gift";
                bVar.f461383n = kVar2.f530836b.i0().B.f470418n;
                ((java.util.ArrayList) kVar2.f530838d).add(bVar);
            }
            if (kVar2.f530836b.i0().f466717g != null && kVar2.f530836b.i0().f466717g.size() > 0 && (c17 = lu1.a0.c(kVar2.f530836b.i0().f466717g)) != null) {
                ((xt1.b) ((java.util.ArrayList) c17).get(0)).f537977u = false;
                ((java.util.ArrayList) kVar2.f530838d).addAll(c17);
            }
            if (((kVar2.f530837c == 6 && kVar2.f530836b.i0().f466721n <= 0) || lu1.a0.v(kVar2.f530837c)) && kVar2.f530836b.F() && kVar2.f530836b.B() && kVar2.f530836b.u()) {
                xt1.b bVar2 = new xt1.b();
                bVar2.f537976t = 1;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar2.f530836b.s0().f470105z1)) {
                    bVar2.f461376d = kVar2.f530836b.s0().f470105z1;
                } else if (kVar2.f530836b.m0()) {
                    bVar2.f461376d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.au_);
                } else {
                    bVar2.f461376d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.au9);
                }
                bVar2.f461378f = "";
                bVar2.f461379g = "card://jump_gift";
                ((java.util.ArrayList) kVar2.f530838d).add(bVar2);
            }
            if (kVar2.f530836b.i0().f466714d != 0 && kVar2.f530836b.i0().f466714d != 1) {
                int i48 = kVar2.f530836b.i0().f466714d;
            }
            int i49 = kVar2.f530837c;
            if (i49 != 3 && i49 == 6) {
                int i57 = kVar2.f530836b.i0().f466721n;
            }
            r45.de0 de0Var = kVar2.f530836b.s0().M;
            if (kVar2.f530836b.i0().f466728u != null) {
                android.text.TextUtils.isEmpty(kVar2.f530836b.i0().f466728u.f470411d);
            }
            xt1.b bVar3 = new xt1.b();
            ?? r86 = !kVar2.f530836b.m0() && (de0Var == null || (linkedList = de0Var.f453876g) == null || linkedList.size() <= 0 || android.text.TextUtils.isEmpty((java.lang.CharSequence) de0Var.f453876g.get(0))) && de0Var != null;
            bVar3.f537977u = false;
            bVar3.f537976t = 1;
            bVar3.f461376d = kVar2.d() + kVar2.c(com.p314xaae8f345.mm.R.C30867xcad56011.as7);
            bVar3.f461377e = "";
            bVar3.f461378f = "";
            bVar3.f461379g = "card://jump_detail";
            if (r86 != false) {
                ((java.util.ArrayList) kVar2.f530838d).add(bVar3);
            }
            if (!kVar2.f530836b.X() || kVar2.f530836b.s0().f470098x <= 0) {
                if (kVar2.f530836b.o() && kVar2.f530836b.s0().f470098x > 0) {
                    kVar2.a();
                } else if (kVar2.f530836b.s0().f470098x > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailDataMgr", "shop_count:" + kVar2.f530836b.s0().f470098x);
                    if (kVar2.f530836b.s0().f470098x >= 1 && (arrayList = kVar2.f530840f) != null && arrayList.size() >= 1) {
                        r45.nu nuVar = (r45.nu) kVar2.f530840f.get(0);
                        if (nuVar != null && nuVar.f463212n < 50000.0f) {
                            xt1.b bVar4 = new xt1.b();
                            bVar4.f537976t = 2;
                            bVar4.f461376d = nuVar.f463205d;
                            float f19 = nuVar.f463212n;
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = kVar2.f530835a;
                            bVar4.f461377e = abstractActivityC21394xb3d2c0cf4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avi, lu1.a0.D(abstractActivityC21394xb3d2c0cf4, f19), nuVar.f463211m);
                            bVar4.f461378f = "";
                            bVar4.f461379g = "card://jump_shop";
                            bVar4.f537981y = nuVar.f463207f;
                            bVar4.f537982z = kVar2.f530836b.s0().f470088p;
                            ((java.util.ArrayList) kVar2.f530838d).add(bVar4);
                        } else if (nuVar != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailDataMgr", "distance:" + nuVar.f463212n);
                        }
                    }
                    kVar2.a();
                }
            }
            if ((!kVar2.f530836b.m0() || kVar2.f530836b.i0().f466714d != 3) && !android.text.TextUtils.isEmpty(kVar2.f530836b.s0().f470081g)) {
                ((java.util.ArrayList) kVar2.f530838d).add(kVar2.b());
            }
            if (kVar2.f530836b.o()) {
                java.util.Iterator it = ((java.util.ArrayList) kVar2.f530838d).iterator();
                while (it.hasNext()) {
                    ((xt1.b) it.next()).f537980x = true;
                }
            }
            ((java.util.ArrayList) list).addAll(kVar2.f530838d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q4 q4Var = this.f176479r;
            java.util.List list2 = this.G;
            java.util.ArrayList arrayList6 = (java.util.ArrayList) q4Var.f176670d;
            arrayList6.clear();
            arrayList6.addAll(list2);
            this.f176479r.f176672f = this.E.m0();
            this.f176479r.notifyDataSetChanged();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "card is membership or share card or general coupon, not accept, don't updateCellData()");
        }
        if (this.f176470f.a()) {
            this.E.G(this.E.i0());
            lu1.a0.M(this.E);
            if (this.f176470f.l()) {
                ku1.i iVar = this.f176477p;
                if (iVar == null) {
                    e();
                    this.f176477p.a(this);
                    this.f176477p.e();
                } else if (iVar.k(this.E)) {
                    ku1.i iVar2 = this.f176477p;
                    tt1.j jVar8 = this.E;
                    if (jVar8 == null) {
                        iVar2.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
                    } else {
                        iVar2.f393628d = jVar8;
                    }
                    this.f176477p.e();
                }
            } else {
                ku1.i iVar3 = this.f176477p;
                if (iVar3 != null) {
                    iVar3.d(8);
                }
            }
            mu1.j jVar9 = this.f176475n;
            if (jVar9 != null) {
                jVar9.b(true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "don't update CardCodeView");
            ku1.i iVar4 = this.f176477p;
            if (iVar4 != null) {
                iVar4.d(8);
            }
            mu1.j jVar10 = this.f176475n;
            if (jVar10 != null) {
                jVar10.b(false);
            }
        }
        if (this.f176470f.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "update CardAdvertiseView");
            this.A.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardAdvertiseView");
            this.A.d(8);
        }
        this.C.f176986q = this.E;
    }

    public final java.lang.String g() {
        if (android.text.TextUtils.isEmpty(this.L) || android.text.TextUtils.isEmpty(this.M)) {
            return !android.text.TextUtils.isEmpty(this.L) ? this.L : !android.text.TextUtils.isEmpty(this.M) ? lu1.a0.j(this.M) : "";
        }
        return this.L + "," + lu1.a0.j(this.M);
    }

    public java.lang.String h(int i17) {
        return this.f176469e.getString(i17);
    }

    public void i(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        tt1.j jVar = this.E;
        if (jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) {
            intent.putExtra("key_card_info_data", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) jVar);
        } else if (jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) {
            intent.putExtra("key_card_info_data", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd) jVar);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f176469e;
        intent.setClass(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ViewOnClickListenerC13040xa2425b0d.class);
        intent.putExtra("key_from_scene", this.U.f176636a);
        intent.putExtra("key_previous_scene", this.U.f176637b);
        intent.putExtra("key_mark_user", str);
        intent.putExtra("key_from_appbrand_type", this.U.f176643h);
        abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 3);
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(this);
    }

    public final void j() {
        if (this.V) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "updateUIBackground onPause return");
            return;
        }
        boolean B = this.E.B();
        android.view.View view = this.f176468d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f176469e;
        if (B && this.E.o()) {
            view.findViewById(com.p314xaae8f345.mm.R.id.b9p).setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        } else {
            int d17 = lu1.a0.d(this.E.s0().f470088p);
            view.findViewById(com.p314xaae8f345.mm.R.id.b9p).setBackgroundColor(d17);
            abstractActivityC21394xb3d2c0cf.mo64405x4dab7448(d17);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565601cw2);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.gzh);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.cvy);
        if (this.E.B() && this.f176470f.i()) {
            if (this.E.d()) {
                findViewById.setClipToOutline(true);
                findViewById.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f0(this));
                findViewById3.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22));
            } else if (this.E.o()) {
                view.findViewById(com.p314xaae8f345.mm.R.id.gfa).setBackgroundResource(0);
                findViewById3.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            } else if (this.E.X()) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bz_);
                view.findViewById(com.p314xaae8f345.mm.R.id.gfa).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562641ky);
                findViewById3.setBackgroundResource(0);
            } else if (!this.E.Q() && this.E.m0()) {
                findViewById3.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            }
        } else if (this.E.i()) {
            if (this.f176470f.r() && this.f176472h) {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bz_);
                findViewById3.setBackgroundResource(0);
            } else if (!this.f176470f.r() || this.f176472h) {
                findViewById.setBackgroundResource(0);
                if (((hu1.a) this.f176470f).f366604d) {
                    findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bz9);
                } else {
                    findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bz_);
                }
            } else {
                findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bz9);
                findViewById3.setBackgroundResource(0);
            }
        } else if (this.E.d()) {
            findViewById.setClipToOutline(true);
            findViewById.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g0(this));
            findViewById3.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22));
        } else if (this.E.X()) {
            findViewById.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562671lm);
            findViewById3.setBackgroundResource(0);
        } else {
            findViewById.setBackgroundResource(0);
            findViewById3.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        if (this.E.m0()) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564986aw3);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(com.p314xaae8f345.mm.R.C30861xcebc809e.bz8));
            bitmapDrawable.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
            textView.setBackgroundDrawable(bitmapDrawable);
            textView.setVisibility(0);
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
        findViewById.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        findViewById.invalidate();
        findViewById3.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        findViewById3.invalidate();
        if (this.E.i() && this.f176470f.r() && this.f176472h) {
            android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.mtt);
            findViewById4.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            findViewById4.invalidate();
        }
        if (this.E.B() && this.f176470f.i()) {
            android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.gfa);
            rect.left = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
            int dimensionPixelOffset = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
            rect.right = dimensionPixelOffset;
            findViewById5.setPadding(rect.left, rect.top, dimensionPixelOffset, rect.bottom);
            findViewById5.invalidate();
            if (this.E.X()) {
                android.view.View findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.gfb);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById6.getLayoutParams();
                int dimensionPixelSize = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
                findViewById6.setLayoutParams(layoutParams);
            }
        }
        if (this.f176470f.i() || this.f176470f.r()) {
            if (this.f176475n != null && ((this.E.B() && this.E.d()) || this.E.i())) {
                this.f176475n.e(0);
            }
        } else if (this.f176475n != null && ((this.E.B() && this.E.d()) || this.E.i())) {
            if (((hu1.a) this.f176470f).f366604d) {
                this.f176475n.e(com.p314xaae8f345.mm.R.C30861xcebc809e.bza);
            } else {
                this.f176475n.e(com.p314xaae8f345.mm.R.C30861xcebc809e.f562669lk);
            }
        }
        if (this.f176475n != null && this.E.B() && this.E.o()) {
            this.f176475n.a(lu1.a0.n(abstractActivityC21394xb3d2c0cf, lu1.a0.d(this.E.s0().f470088p), abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561722qv)));
        }
        if (this.E.B() && this.E.o()) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
            if (android.text.TextUtils.isEmpty(this.E.s0().F)) {
                layoutParams2.height = 0;
                layoutParams2.weight = 1.0f;
            } else {
                layoutParams2.weight = 0.0f;
                layoutParams2.height = -2;
            }
            findViewById.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            int dimensionPixelSize2 = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
            layoutParams3.rightMargin = dimensionPixelSize2;
            layoutParams3.leftMargin = dimensionPixelSize2;
            if (this.E.o()) {
                layoutParams3.topMargin = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561409hp);
                layoutParams3.bottomMargin = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                int dimensionPixelSize3 = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi);
                layoutParams3.rightMargin = dimensionPixelSize3;
                layoutParams3.leftMargin = dimensionPixelSize3;
            } else {
                int dimensionPixelSize4 = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561106p);
                layoutParams3.bottomMargin = dimensionPixelSize4;
                layoutParams3.topMargin = dimensionPixelSize4;
            }
            findViewById2.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) findViewById3.getLayoutParams();
            layoutParams4.bottomMargin = 0;
            layoutParams4.topMargin = 0;
            layoutParams4.rightMargin = 0;
            layoutParams4.leftMargin = 0;
            if (this.E.o()) {
                layoutParams4.bottomMargin = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi);
            }
            if (android.text.TextUtils.isEmpty(this.E.s0().F)) {
                layoutParams4.height = 0;
                layoutParams4.weight = 1.0f;
            } else {
                layoutParams4.weight = 0.0f;
                layoutParams4.height = -2;
            }
            findViewById3.setLayoutParams(layoutParams4);
            if (!android.text.TextUtils.isEmpty(this.E.s0().F)) {
                android.view.View findViewById7 = view.findViewById(com.p314xaae8f345.mm.R.id.f564299ng);
                android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) findViewById7.getLayoutParams();
                layoutParams5.height = 0;
                layoutParams5.weight = 1.0f;
                findViewById7.setLayoutParams(layoutParams5);
            }
        }
        view.invalidate();
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f176469e;
        if (i17 == 0) {
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "tryNewForwardIntercept handle REQUEST_CODE_GIFT");
            if (i18 == -1 && intent != null) {
                this.I = intent.getStringExtra("Select_Conv_User");
                tt1.j jVar = this.E;
                if (jVar == null || jVar.s0() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
                } else {
                    java.lang.String u17 = ot0.q.u(lu1.u.b(this.E, this.U.f176641f, 2), null, null);
                    v05.b bVar = new v05.b();
                    bVar.m126728xdc93280d(u17);
                    vd5.a aVar = new vd5.a();
                    aVar.k(bVar);
                    ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(abstractActivityC21394xb3d2c0cf, aVar, this.I, n13.t.a(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j() { // from class: com.tencent.mm.plugin.card.ui.b0$$a
                        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
                        public final void a(boolean z18, java.lang.String str, int i19) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0.this;
                            if (!z18) {
                                b0Var.getClass();
                                return;
                            }
                            b0Var.f176467J = str;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s0 s0Var = b0Var.T;
                            if (s0Var != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q) s0Var).b(b0Var.I);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OperGift", 1, java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), b0Var.I);
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = b0Var.f176469e;
                            db5.e1.T(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.asp));
                        }
                    }));
                }
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        if (i17 != 0 && i17 != 1) {
            if (i17 == 2) {
                if (i18 != -1) {
                    return;
                }
                int intExtra = intent.getIntExtra("Ktag_range_index", 0);
                this.K = intExtra;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "mPrivateSelelct : %d", java.lang.Integer.valueOf(intExtra));
                if (this.K < 2) {
                    this.A.f393607d.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av6));
                    return;
                }
                this.L = intent.getStringExtra("Klabel_name_list");
                this.M = intent.getStringExtra("Kother_user_name_list");
                if (android.text.TextUtils.isEmpty(this.L) && android.text.TextUtils.isEmpty(this.M)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "mLabelNameList by getIntent is empty");
                    return;
                }
                java.util.List asList = java.util.Arrays.asList(this.L.split(","));
                this.P = lu1.a0.h(asList);
                this.N = lu1.a0.i(asList);
                java.lang.String str = this.M;
                if (str != null && str.length() > 0) {
                    this.N.addAll(java.util.Arrays.asList(this.M.split(",")));
                }
                if (this.P != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "mPrivateIdsList size is " + this.P.size());
                }
                if (this.N != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUIContoller", "mPrivateNamesList size is " + this.N.size());
                    java.util.Iterator it = this.N.iterator();
                    while (it.hasNext()) {
                    }
                }
                int i19 = this.K;
                if (i19 == 2) {
                    this.A.f393607d.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av8, g()));
                    return;
                } else if (i19 == 3) {
                    this.A.f393607d.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av7, g()));
                    return;
                } else {
                    this.A.f393607d.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.av6));
                    return;
                }
            }
            if (i17 == 3) {
                if (this.T != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDetailUI", "onConsumeCodeUIResult()");
                    return;
                }
                return;
            } else if (i17 != 4) {
                return;
            }
        }
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        this.I = stringExtra;
        tt1.j jVar2 = this.E;
        if (jVar2 == null || jVar2.s0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 == 0) {
            if (android.text.TextUtils.isEmpty(this.E.Y().f459113d) || this.E.m0()) {
                sb6.append(h(com.p314xaae8f345.mm.R.C30867xcad56011.jdx));
            } else {
                sb6.append(this.E.Y().f459113d);
            }
        } else if (i17 == 1) {
            sb6.append(h(com.p314xaae8f345.mm.R.C30867xcad56011.avh) + this.H.d());
        } else if (i17 == 4) {
            sb6.append(h(com.p314xaae8f345.mm.R.C30867xcad56011.aum) + this.H.d());
        }
        java.lang.String str2 = this.E.s0().f470086n + "\n" + this.E.s0().f470085m;
        r35.u3 u3Var = r35.t3.f450796a;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92();
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.E.s0().f470079e;
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n0(this, i17, stringExtra);
        ((ez.z0) u3Var).getClass();
        r35.j1.j(mo78514x143f1b92, sb7, str3, str2, null, true, string, n0Var);
    }
}
