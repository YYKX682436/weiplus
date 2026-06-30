package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class b0 implements com.tencent.mm.ui.da, com.tencent.mm.plugin.card.ui.s4, wt1.m {
    public ku1.e A;
    public ku1.m B;
    public com.tencent.mm.plugin.card.ui.x3 C;
    public tt1.j E;
    public java.util.ArrayList F;
    public wt1.k H;
    public com.tencent.mm.plugin.card.ui.s0 T;
    public com.tencent.mm.plugin.card.ui.p0 U;
    public final com.tencent.mm.sdk.event.IListener Y;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f94935d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f94936e;

    /* renamed from: f, reason: collision with root package name */
    public hu1.g f94937f;

    /* renamed from: g, reason: collision with root package name */
    public ku1.m f94938g;

    /* renamed from: i, reason: collision with root package name */
    public ku1.m f94940i;

    /* renamed from: m, reason: collision with root package name */
    public ku1.m f94941m;

    /* renamed from: n, reason: collision with root package name */
    public mu1.j f94942n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f94943o;

    /* renamed from: p, reason: collision with root package name */
    public ku1.i f94944p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f94945q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.card.ui.q4 f94946r;

    /* renamed from: s, reason: collision with root package name */
    public ku1.m f94947s;

    /* renamed from: t, reason: collision with root package name */
    public ku1.m f94948t;

    /* renamed from: u, reason: collision with root package name */
    public ku1.m f94949u;

    /* renamed from: v, reason: collision with root package name */
    public ku1.m f94950v;

    /* renamed from: w, reason: collision with root package name */
    public ku1.m f94951w;

    /* renamed from: x, reason: collision with root package name */
    public ku1.m f94952x;

    /* renamed from: y, reason: collision with root package name */
    public ku1.m f94953y;

    /* renamed from: z, reason: collision with root package name */
    public ku1.m f94954z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f94939h = false;
    public boolean D = true;
    public final java.util.List G = new java.util.ArrayList();
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f94934J = "";
    public int K = 0;
    public java.lang.String L = "";
    public java.lang.String M = "";
    public java.util.ArrayList N = new java.util.ArrayList();
    public java.util.ArrayList P = new java.util.ArrayList();
    public final java.util.HashMap Q = new java.util.HashMap();
    public final java.util.HashMap R = new java.util.HashMap();
    public final java.util.ArrayList S = new java.util.ArrayList();
    public boolean V = false;
    public final com.tencent.mm.sdk.platformtools.n3 W = new com.tencent.mm.plugin.card.ui.e0(this);
    public final android.view.View.OnClickListener X = new com.tencent.mm.plugin.card.ui.h0(this);

    public b0(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.Y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent>(a0Var) { // from class: com.tencent.mm.plugin.card.ui.CardDetailUIContoller$9
            {
                this.__eventId = -270499818;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent consumedCardByOfflinePayEvent) {
                com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent consumedCardByOfflinePayEvent2 = consumedCardByOfflinePayEvent;
                if (gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "deal with card notify event ConsumedCardByOfflinePayEvent");
                    if (consumedCardByOfflinePayEvent2 instanceof com.tencent.mm.autogen.events.ConsumedCardByOfflinePayEvent) {
                        consumedCardByOfflinePayEvent2.f54073g.getClass();
                        com.tencent.mm.ui.MMActivity mMActivity2 = com.tencent.mm.plugin.card.ui.b0.this.f94936e;
                        lu1.r.c(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.awb));
                        return true;
                    }
                }
                return false;
            }
        };
        this.f94936e = mMActivity;
        this.f94935d = view;
    }

    public static void b(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        b0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        tt1.j jVar = b0Var.E;
        if (jVar instanceof com.tencent.mm.plugin.card.model.CardInfo) {
            intent.putExtra("key_card_info_data", (com.tencent.mm.plugin.card.model.CardInfo) jVar);
        } else if (jVar instanceof com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) {
            intent.putExtra("key_card_info_data", (com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) jVar);
        }
        intent.putExtra("key_from_appbrand_type", b0Var.U.f95110h);
        intent.setClass(b0Var.f94936e, com.tencent.mm.plugin.card.ui.CardShopUI.class);
        com.tencent.mm.ui.MMActivity mMActivity = b0Var.f94936e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardDetailUIContoller", "goToCardShopUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/card/ui/CardDetailUIContoller", "goToCardShopUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "UsedStoresView", java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), 0, java.lang.Integer.valueOf(b0Var.U.f95104b), b0Var.U.f95106d, java.lang.Integer.valueOf(b0Var.E.n() ? 1 : 0), "");
    }

    public static void c(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        b0Var.getClass();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f334126j = false;
        rVar.f334118b = 0;
        rVar.f334119c = b0Var;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(b0Var.f94936e, rVar);
    }

    public void a(boolean z17, wt1.b0 b0Var, boolean z18) {
        if (!z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardConsumedCodeUI", java.lang.Integer.valueOf(this.E.s0().f388550i), this.E.f(), this.E.g(), 0, java.lang.Integer.valueOf(this.U.f95104b), this.U.f95106d, java.lang.Integer.valueOf(this.E.n() ? 1 : 0), "");
            i(b0Var.f449249a);
            return;
        }
        r45.w50 w50Var = this.E.i0().f385198x;
        boolean n07 = this.E.n0();
        com.tencent.mm.ui.MMActivity mMActivity = this.f94936e;
        if (n07) {
            lu1.d.g(mMActivity, b0Var.f449252d, b0Var.f449253e, z18, this.E);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 17, this.E.g(), this.E.f(), "", this.E.i0().f385198x.f388878d);
            return;
        }
        if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f388887p) && !android.text.TextUtils.isEmpty(w50Var.f388888q)) {
            java.lang.String g17 = this.E.g();
            com.tencent.mm.plugin.card.ui.p0 p0Var = this.U;
            lu1.d.e(g17, w50Var, p0Var.f95104b, p0Var.f95110h);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 6;
            objArr[1] = this.E.g();
            objArr[2] = this.E.f();
            objArr[3] = "";
            java.lang.String str = w50Var.f388878d;
            objArr[4] = str != null ? str : "";
            g0Var.d(11941, objArr);
            return;
        }
        if (w50Var == null || android.text.TextUtils.isEmpty(w50Var.f388881g)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardConsumedCodeUI", java.lang.Integer.valueOf(this.E.s0().f388550i), this.E.f(), this.E.g(), 0, java.lang.Integer.valueOf(this.U.f95104b), this.U.f95106d, java.lang.Integer.valueOf(this.E.n() ? 1 : 0), "");
            i(b0Var.f449249a);
            return;
        }
        lu1.d.j(mMActivity, lu1.a0.k(w50Var.f388881g, w50Var.f388882h), 1);
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = 6;
        objArr2[1] = this.E.g();
        objArr2[2] = this.E.f();
        objArr2[3] = "";
        java.lang.String str2 = w50Var.f388878d;
        objArr2[4] = str2 != null ? str2 : "";
        g0Var2.d(11941, objArr2);
    }

    public final int d(int i17) {
        java.util.LinkedList linkedList = this.E.i0().f385196v;
        if (linkedList == null) {
            return i17;
        }
        java.util.HashMap hashMap = this.R;
        hashMap.clear();
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            r45.s1 s1Var = (r45.s1) linkedList.get(i18);
            boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(s1Var.f385375e) && com.tencent.mm.sdk.platformtools.t8.K0(s1Var.f385376f)) ? false : true;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(s1Var.f385374d) && z17) {
                this.S.add(s1Var.f385374d);
                this.Q.put(java.lang.Integer.valueOf(i17), s1Var.f385374d);
                hashMap.put(s1Var.f385374d, new com.tencent.mm.plugin.card.ui.o0(s1Var));
                i17++;
            }
        }
        return i17;
    }

    public final void e() {
        if (this.E.s0().f388556p0 == null || !this.E.s0().f388556p0.f373426d) {
            if (this.E.s0().f388550i == 10) {
                this.f94944p = new ku1.y();
                return;
            } else {
                this.f94944p = new ku1.n();
                return;
            }
        }
        this.f94944p = new ku1.r();
        wt1.n Ni = xt1.t0.Ni();
        if (Ni.f449310d == null) {
            Ni.f449310d = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ni.f449310d).add(new java.lang.ref.WeakReference(this));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo == null");
            com.tencent.mm.plugin.card.ui.s0 s0Var = this.T;
            if (s0Var != null) {
                int i27 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                ((com.tencent.mm.plugin.card.ui.q) s0Var).f95124a.x();
                return;
            }
            return;
        }
        if (jVar.s0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getCardTpInfo() == null");
            com.tencent.mm.plugin.card.ui.s0 s0Var2 = this.T;
            if (s0Var2 != null) {
                int i28 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                ((com.tencent.mm.plugin.card.ui.q) s0Var2).f95124a.x();
                return;
            }
            return;
        }
        if (this.E.i0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getDataInfo() == null");
            com.tencent.mm.plugin.card.ui.s0 s0Var3 = this.T;
            if (s0Var3 != null) {
                int i29 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                ((com.tencent.mm.plugin.card.ui.q) s0Var3).f95124a.x();
                return;
            }
            return;
        }
        if (!this.E.c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, not support card type :%d", java.lang.Integer.valueOf(this.E.s0().f388550i));
            if (android.text.TextUtils.isEmpty(this.E.s0().A)) {
                db5.e1.G(this.f94936e, h(com.tencent.mm.R.string.auh), null, false, new com.tencent.mm.plugin.card.ui.d0(this));
                return;
            }
            lu1.d.j(this.f94936e, this.E.s0().A, 0);
            com.tencent.mm.plugin.card.ui.s0 s0Var4 = this.T;
            if (s0Var4 != null) {
                int i37 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
                ((com.tencent.mm.plugin.card.ui.q) s0Var4).f95124a.x();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "doUpdate()");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "doUpdate() showAcceptView:" + this.E.s0().W);
        wt1.k kVar = this.H;
        tt1.j jVar2 = this.E;
        java.util.ArrayList arrayList2 = this.F;
        int i38 = this.U.f95103a;
        kVar.f449303b = jVar2;
        kVar.f449307f = arrayList2;
        kVar.f449304c = i38;
        if ((this.f94937f != null && (!jVar2.i() ? !(!this.E.o() ? !(!this.E.Q() ? !(!this.E.d() ? !(!this.E.X() ? !(!this.E.m0() ? (this.f94937f instanceof hu1.a) : (this.f94937f instanceof hu1.d)) : (this.f94937f instanceof hu1.f)) : (this.f94937f instanceof hu1.c)) : (this.f94937f instanceof hu1.b)) : (this.f94937f instanceof hu1.e)) : (this.f94937f instanceof hu1.h))) != false) {
            hu1.a aVar = (hu1.a) this.f94937f;
            aVar.f285070c = null;
            aVar.f285069b = null;
            aVar.f285068a = null;
            this.f94937f = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, need recreate show logic, card_type:%d", java.lang.Integer.valueOf(this.E.s0().f388550i));
        }
        if (this.f94937f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, mCardShowLogic == null, card_type:%d", java.lang.Integer.valueOf(this.E.s0().f388550i));
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "createShowLogic, card_type:%d", java.lang.Integer.valueOf(this.E.s0().f388550i));
            boolean i39 = this.E.i();
            com.tencent.mm.ui.MMActivity mMActivity = this.f94936e;
            if (i39) {
                this.f94937f = new hu1.h(mMActivity);
            } else {
                int i47 = this.E.s0().f388550i;
                if (i47 == 0) {
                    this.f94937f = new hu1.c(mMActivity);
                } else if (i47 == 20) {
                    this.f94937f = new hu1.f(mMActivity);
                } else if (i47 == 30) {
                    this.f94937f = new hu1.d(mMActivity);
                } else if (i47 == 10) {
                    this.f94937f = new hu1.e(mMActivity);
                } else if (i47 != 11) {
                    this.f94937f = new hu1.a(mMActivity);
                } else {
                    this.f94937f = new hu1.b(mMActivity);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, card_tye:%d", java.lang.Integer.valueOf(this.E.s0().f388550i));
        hu1.g gVar = this.f94937f;
        tt1.j jVar3 = this.E;
        com.tencent.mm.plugin.card.ui.p0 p0Var = this.U;
        hu1.a aVar2 = (hu1.a) gVar;
        aVar2.f285070c = jVar3;
        aVar2.f285069b = p0Var;
        aVar2.x();
        hu1.a aVar3 = (hu1.a) this.f94937f;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", java.lang.Integer.valueOf(!android.text.TextUtils.isEmpty(aVar3.f285070c.i0().f385189o) ? 1 : 0), aVar3.s(), java.lang.Integer.valueOf(aVar3.f285071d ? 1 : 0), java.lang.Integer.valueOf(aVar3.m() ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285073f ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285074g ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285075h ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285076i ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285077j ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285078k ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285079l ? 1 : 0), java.lang.Integer.valueOf(aVar3.f285080m ? 1 : 0));
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "");
        boolean o17 = this.f94937f.o();
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f94936e;
        if (o17) {
            mMActivity2.setMMTitle(this.H.d());
        } else {
            mMActivity2.setMMTitle("");
        }
        tt1.j jVar4 = this.E;
        if (jVar4 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "updateWidget, mCardInfo is null");
        } else {
            if ((this.f94942n != null && (!jVar4.o() ? !this.E.Q() ? !(!this.E.d() ? !(!this.E.X() ? !(!this.E.m0() || (this.f94942n instanceof mu1.g)) : !(this.f94942n instanceof mu1.i)) : !(this.f94942n instanceof mu1.e)) : !(this.f94942n instanceof mu1.f) : (this.f94942n instanceof mu1.h))) != false) {
                android.view.View f17 = ((mu1.a) this.f94942n).f();
                if (f17 != null) {
                    this.f94943o.removeView(f17);
                }
                this.f94943o.removeAllViews();
                this.f94943o.invalidate();
                mu1.a aVar4 = (mu1.a) this.f94942n;
                aVar4.f331339f = null;
                aVar4.f331335b = null;
                this.f94942n = null;
            }
            if (this.f94942n == null) {
                boolean o18 = this.E.o();
                com.tencent.mm.ui.MMActivity mMActivity3 = this.f94936e;
                if (o18) {
                    this.f94942n = new mu1.h(mMActivity3);
                } else if (this.E.Q()) {
                    this.f94942n = new mu1.f(mMActivity3);
                } else if (this.E.d()) {
                    this.f94942n = new mu1.e(mMActivity3);
                } else if (this.E.X()) {
                    this.f94942n = new mu1.i(mMActivity3);
                } else if (this.E.m0()) {
                    this.f94942n = new mu1.g(mMActivity3);
                } else {
                    this.f94942n = new mu1.e(mMActivity3);
                }
                mu1.a aVar5 = (mu1.a) this.f94942n;
                aVar5.f331334a = this.E;
                android.view.View f18 = aVar5.f();
                if (f18 != null) {
                    android.widget.LinearLayout linearLayout = this.f94943o;
                    f18.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(f18);
                }
                this.f94943o.invalidate();
                this.f94942n.setOnClickListener(this.X);
                mu1.j jVar5 = this.f94942n;
                if (jVar5 != null) {
                    jVar5.d(false, false);
                }
            }
            if (this.f94942n != null) {
                if (this.E.X()) {
                    ((mu1.i) this.f94942n).f331390q = this.F;
                }
                mu1.a aVar6 = (mu1.a) this.f94942n;
                aVar6.f331334a = this.E;
                aVar6.i();
            }
        }
        if (this.f94937f.r()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateShareUsersInfoLayout()");
            this.f94938g.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't updateShareUsersInfoLayout()");
            this.f94938g.d(8);
        }
        if (this.f94937f.m()) {
            if (this.B == null) {
                ku1.c cVar = new ku1.c();
                this.B = cVar;
                cVar.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update CardAcceptView()");
            this.B.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardAcceptView()");
            ku1.m mVar = this.B;
            if (mVar != null) {
                mVar.d(8);
            }
        }
        this.f94936e.showOptionMenu(((hu1.a) this.f94937f).f285076i);
        if (((hu1.a) this.f94937f).f285078k) {
            java.util.HashMap hashMap = this.Q;
            hashMap.clear();
            java.util.ArrayList arrayList3 = this.S;
            arrayList3.clear();
            if (this.E.q()) {
                arrayList3.add(h(com.tencent.mm.R.string.awa));
                hashMap.put(0, "menu_func_share_friend");
                arrayList3.add(h(com.tencent.mm.R.string.aw_));
                hashMap.put(1, "menu_func_share_timeline");
                i19 = 2;
            } else {
                i19 = 0;
            }
            if (!android.text.TextUtils.isEmpty(this.E.i0().f385194t)) {
                arrayList3.add(h(com.tencent.mm.R.string.aua));
                hashMap.put(java.lang.Integer.valueOf(i19), "menu_func_report");
                i19++;
            }
            d(i19);
            if (arrayList3.size() > 0) {
                this.f94936e.showOptionMenu(true);
            }
        }
        if (((hu1.a) this.f94937f).f285079l) {
            java.util.HashMap hashMap2 = this.Q;
            hashMap2.clear();
            java.util.ArrayList arrayList4 = this.S;
            arrayList4.clear();
            if (this.E.B() && this.E.u()) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.E.s0().f388572z1)) {
                    arrayList4.add(this.E.s0().f388572z1);
                } else if (this.E.m0()) {
                    arrayList4.add(h(com.tencent.mm.R.string.au_));
                } else {
                    arrayList4.add(h(com.tencent.mm.R.string.au9));
                }
                hashMap2.put(0, "menu_func_gift");
                i18 = 1;
            } else {
                i18 = 0;
            }
            int d17 = d(i18);
            if (!android.text.TextUtils.isEmpty(this.E.i0().f385194t)) {
                arrayList4.add(h(com.tencent.mm.R.string.aua));
                hashMap2.put(java.lang.Integer.valueOf(d17), "menu_func_report");
                d17++;
            }
            if (this.E.B()) {
                arrayList4.add(h(com.tencent.mm.R.string.f490367t0));
                hashMap2.put(java.lang.Integer.valueOf(d17), "menu_func_delete");
            } else if (this.E.i()) {
                java.lang.String r17 = c01.z1.r();
                java.lang.String a17 = this.E.a();
                if (r17 == null || !r17.equals(a17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "the card is not belong mine");
                } else {
                    arrayList4.add(h(com.tencent.mm.R.string.f490367t0));
                    hashMap2.put(java.lang.Integer.valueOf(d17), "menu_func_delete_share_card");
                }
            }
            if (arrayList4.size() > 0) {
                this.f94936e.showOptionMenu(true);
            }
        }
        if (((hu1.a) this.f94937f).f285080m) {
            java.util.HashMap hashMap3 = this.Q;
            hashMap3.clear();
            java.util.ArrayList arrayList5 = this.S;
            arrayList5.clear();
            if (android.text.TextUtils.isEmpty(this.E.i0().f385194t)) {
                i17 = 0;
            } else {
                arrayList5.add(h(com.tencent.mm.R.string.aua));
                hashMap3.put(0, "menu_func_report");
                i17 = 1;
            }
            d(i17);
            if (arrayList5.size() > 0) {
                this.f94936e.showOptionMenu(true);
            }
        }
        hu1.a aVar7 = (hu1.a) this.f94937f;
        boolean z17 = aVar7.f285077j;
        mu1.j jVar6 = this.f94942n;
        if (jVar6 != null && (jVar6 instanceof mu1.e)) {
        }
        boolean z18 = aVar7.f285074g;
        boolean z19 = aVar7.f285075h;
        if (jVar6 != null) {
            jVar6.d(z18, z19);
        }
        if (!this.E.o() && this.f94937f.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update mFromUserView");
            this.f94940i.e();
        } else if (this.E.o() && this.f94937f.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout for username");
            this.f94941m.e();
        } else if (this.f94937f.j()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout");
            this.f94941m.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update mFromUserView and mAcceptHeaderLayout");
            this.f94941m.d(8);
            this.f94940i.d(8);
        }
        mu1.j jVar7 = this.f94942n;
        if (jVar7 != null) {
            jVar7.c(((hu1.a) this.f94937f).f285071d);
        }
        j();
        if (this.f94937f.k()) {
            if (this.f94948t == null) {
                ku1.h0 h0Var = new ku1.h0();
                this.f94948t = h0Var;
                h0Var.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update CardStatusView");
            this.f94948t.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardStatusView");
            ku1.m mVar2 = this.f94948t;
            if (mVar2 != null) {
                mVar2.d(8);
            }
        }
        if (this.f94937f.d()) {
            if (this.f94947s == null) {
                ku1.d dVar = new ku1.d();
                this.f94947s = dVar;
                dVar.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update mAdtitleView()");
            this.f94947s.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update AdTitleView()");
            ku1.m mVar3 = this.f94947s;
            if (mVar3 != null) {
                mVar3.d(8);
            }
        }
        if (this.f94937f.q()) {
            if (this.f94949u == null) {
                ku1.o oVar = new ku1.o();
                this.f94949u = oVar;
                oVar.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update mCardDetailFieldView()");
            this.f94949u.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update mCardDetailFieldView()");
            ku1.m mVar4 = this.f94949u;
            if (mVar4 != null) {
                mVar4.d(8);
            }
        }
        if (this.f94937f.h()) {
            if (this.f94950v == null) {
                ku1.e0 e0Var = new ku1.e0();
                this.f94950v = e0Var;
                e0Var.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update CardSecondaryFieldView");
            this.f94950v.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardSecondaryFieldView");
            ku1.m mVar5 = this.f94950v;
            if (mVar5 != null) {
                mVar5.d(8);
            }
        }
        if (this.f94937f.b()) {
            if (this.f94951w == null) {
                ku1.q qVar = new ku1.q();
                this.f94951w = qVar;
                qVar.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update CardDetailTableView");
            this.f94951w.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardDetailTableView");
            ku1.m mVar6 = this.f94951w;
            if (mVar6 != null) {
                mVar6.d(8);
            }
        }
        hu1.a aVar8 = (hu1.a) this.f94937f;
        if (((aVar8.f285070c.i0().f385195u == null || android.text.TextUtils.isEmpty(aVar8.f285070c.i0().f385195u.f388878d)) ? false : true) == true) {
            if (this.f94952x == null) {
                ku1.i0 i0Var = new ku1.i0();
                this.f94952x = i0Var;
                i0Var.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update CardThirdFieldView");
            this.f94952x.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardThirdFieldView");
            ku1.m mVar7 = this.f94952x;
            if (mVar7 != null) {
                mVar7.d(8);
            }
        }
        if (this.f94937f.c()) {
            if (this.f94953y == null) {
                ku1.f fVar = new ku1.f();
                this.f94953y = fVar;
                fVar.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateCardAnnoucementView");
            this.f94953y.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't updateCardAnnoucementView");
            ku1.m mVar8 = this.f94953y;
            if (mVar8 != null) {
                mVar8.d(8);
            }
        }
        if (this.f94937f.e()) {
            if (this.f94954z == null) {
                ku1.c0 c0Var = new ku1.c0();
                this.f94954z = c0Var;
                c0Var.a(this);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateCardOperateFieldView");
            this.f94954z.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't updateCardOperateFieldView");
            ku1.m mVar9 = this.f94954z;
            if (mVar9 != null) {
                mVar9.d(8);
            }
        }
        if (this.f94937f.p()) {
            ((java.util.ArrayList) this.G).clear();
            java.util.List list = this.G;
            wt1.k kVar2 = this.H;
            ((java.util.ArrayList) kVar2.f449305d).clear();
            if (kVar2.f449303b.i0().B != null && !com.tencent.mm.sdk.platformtools.t8.K0(kVar2.f449303b.i0().B.f388878d)) {
                xt1.b bVar = new xt1.b();
                bVar.f456443t = 1;
                bVar.f379843d = kVar2.f449303b.i0().B.f388878d;
                bVar.f379845f = "";
                bVar.f379846g = "card://jump_card_gift";
                bVar.f379850n = kVar2.f449303b.i0().B.f388885n;
                ((java.util.ArrayList) kVar2.f449305d).add(bVar);
            }
            if (kVar2.f449303b.i0().f385184g != null && kVar2.f449303b.i0().f385184g.size() > 0 && (c17 = lu1.a0.c(kVar2.f449303b.i0().f385184g)) != null) {
                ((xt1.b) ((java.util.ArrayList) c17).get(0)).f456444u = false;
                ((java.util.ArrayList) kVar2.f449305d).addAll(c17);
            }
            if (((kVar2.f449304c == 6 && kVar2.f449303b.i0().f385188n <= 0) || lu1.a0.v(kVar2.f449304c)) && kVar2.f449303b.F() && kVar2.f449303b.B() && kVar2.f449303b.u()) {
                xt1.b bVar2 = new xt1.b();
                bVar2.f456443t = 1;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar2.f449303b.s0().f388572z1)) {
                    bVar2.f379843d = kVar2.f449303b.s0().f388572z1;
                } else if (kVar2.f449303b.m0()) {
                    bVar2.f379843d = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.au_);
                } else {
                    bVar2.f379843d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.au9);
                }
                bVar2.f379845f = "";
                bVar2.f379846g = "card://jump_gift";
                ((java.util.ArrayList) kVar2.f449305d).add(bVar2);
            }
            if (kVar2.f449303b.i0().f385181d != 0 && kVar2.f449303b.i0().f385181d != 1) {
                int i48 = kVar2.f449303b.i0().f385181d;
            }
            int i49 = kVar2.f449304c;
            if (i49 != 3 && i49 == 6) {
                int i57 = kVar2.f449303b.i0().f385188n;
            }
            r45.de0 de0Var = kVar2.f449303b.s0().M;
            if (kVar2.f449303b.i0().f385195u != null) {
                android.text.TextUtils.isEmpty(kVar2.f449303b.i0().f385195u.f388878d);
            }
            xt1.b bVar3 = new xt1.b();
            ?? r86 = !kVar2.f449303b.m0() && (de0Var == null || (linkedList = de0Var.f372343g) == null || linkedList.size() <= 0 || android.text.TextUtils.isEmpty((java.lang.CharSequence) de0Var.f372343g.get(0))) && de0Var != null;
            bVar3.f456444u = false;
            bVar3.f456443t = 1;
            bVar3.f379843d = kVar2.d() + kVar2.c(com.tencent.mm.R.string.as7);
            bVar3.f379844e = "";
            bVar3.f379845f = "";
            bVar3.f379846g = "card://jump_detail";
            if (r86 != false) {
                ((java.util.ArrayList) kVar2.f449305d).add(bVar3);
            }
            if (!kVar2.f449303b.X() || kVar2.f449303b.s0().f388565x <= 0) {
                if (kVar2.f449303b.o() && kVar2.f449303b.s0().f388565x > 0) {
                    kVar2.a();
                } else if (kVar2.f449303b.s0().f388565x > 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailDataMgr", "shop_count:" + kVar2.f449303b.s0().f388565x);
                    if (kVar2.f449303b.s0().f388565x >= 1 && (arrayList = kVar2.f449307f) != null && arrayList.size() >= 1) {
                        r45.nu nuVar = (r45.nu) kVar2.f449307f.get(0);
                        if (nuVar != null && nuVar.f381679n < 50000.0f) {
                            xt1.b bVar4 = new xt1.b();
                            bVar4.f456443t = 2;
                            bVar4.f379843d = nuVar.f381672d;
                            float f19 = nuVar.f381679n;
                            com.tencent.mm.ui.MMActivity mMActivity4 = kVar2.f449302a;
                            bVar4.f379844e = mMActivity4.getString(com.tencent.mm.R.string.avi, lu1.a0.D(mMActivity4, f19), nuVar.f381678m);
                            bVar4.f379845f = "";
                            bVar4.f379846g = "card://jump_shop";
                            bVar4.f456448y = nuVar.f381674f;
                            bVar4.f456449z = kVar2.f449303b.s0().f388555p;
                            ((java.util.ArrayList) kVar2.f449305d).add(bVar4);
                        } else if (nuVar != null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailDataMgr", "distance:" + nuVar.f381679n);
                        }
                    }
                    kVar2.a();
                }
            }
            if ((!kVar2.f449303b.m0() || kVar2.f449303b.i0().f385181d != 3) && !android.text.TextUtils.isEmpty(kVar2.f449303b.s0().f388548g)) {
                ((java.util.ArrayList) kVar2.f449305d).add(kVar2.b());
            }
            if (kVar2.f449303b.o()) {
                java.util.Iterator it = ((java.util.ArrayList) kVar2.f449305d).iterator();
                while (it.hasNext()) {
                    ((xt1.b) it.next()).f456447x = true;
                }
            }
            ((java.util.ArrayList) list).addAll(kVar2.f449305d);
            com.tencent.mm.plugin.card.ui.q4 q4Var = this.f94946r;
            java.util.List list2 = this.G;
            java.util.ArrayList arrayList6 = (java.util.ArrayList) q4Var.f95137d;
            arrayList6.clear();
            arrayList6.addAll(list2);
            this.f94946r.f95139f = this.E.m0();
            this.f94946r.notifyDataSetChanged();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "card is membership or share card or general coupon, not accept, don't updateCellData()");
        }
        if (this.f94937f.a()) {
            this.E.G(this.E.i0());
            lu1.a0.M(this.E);
            if (this.f94937f.l()) {
                ku1.i iVar = this.f94944p;
                if (iVar == null) {
                    e();
                    this.f94944p.a(this);
                    this.f94944p.e();
                } else if (iVar.k(this.E)) {
                    ku1.i iVar2 = this.f94944p;
                    tt1.j jVar8 = this.E;
                    if (jVar8 == null) {
                        iVar2.getClass();
                        com.tencent.mars.xlog.Log.e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
                    } else {
                        iVar2.f312095d = jVar8;
                    }
                    this.f94944p.e();
                }
            } else {
                ku1.i iVar3 = this.f94944p;
                if (iVar3 != null) {
                    iVar3.d(8);
                }
            }
            mu1.j jVar9 = this.f94942n;
            if (jVar9 != null) {
                jVar9.b(true);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "don't update CardCodeView");
            ku1.i iVar4 = this.f94944p;
            if (iVar4 != null) {
                iVar4.d(8);
            }
            mu1.j jVar10 = this.f94942n;
            if (jVar10 != null) {
                jVar10.b(false);
            }
        }
        if (this.f94937f.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "update CardAdvertiseView");
            this.A.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "don't update CardAdvertiseView");
            this.A.d(8);
        }
        this.C.f95453q = this.E;
    }

    public final java.lang.String g() {
        if (android.text.TextUtils.isEmpty(this.L) || android.text.TextUtils.isEmpty(this.M)) {
            return !android.text.TextUtils.isEmpty(this.L) ? this.L : !android.text.TextUtils.isEmpty(this.M) ? lu1.a0.j(this.M) : "";
        }
        return this.L + "," + lu1.a0.j(this.M);
    }

    public java.lang.String h(int i17) {
        return this.f94936e.getString(i17);
    }

    public void i(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        tt1.j jVar = this.E;
        if (jVar instanceof com.tencent.mm.plugin.card.model.CardInfo) {
            intent.putExtra("key_card_info_data", (com.tencent.mm.plugin.card.model.CardInfo) jVar);
        } else if (jVar instanceof com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) {
            intent.putExtra("key_card_info_data", (com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) jVar);
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f94936e;
        intent.setClass(mMActivity, com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI.class);
        intent.putExtra("key_from_scene", this.U.f95103a);
        intent.putExtra("key_previous_scene", this.U.f95104b);
        intent.putExtra("key_mark_user", str);
        intent.putExtra("key_from_appbrand_type", this.U.f95110h);
        mMActivity.startActivityForResult(intent, 3);
        mMActivity.mmSetOnActivityResultCallback(this);
    }

    public final void j() {
        if (this.V) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "updateUIBackground onPause return");
            return;
        }
        boolean B = this.E.B();
        android.view.View view = this.f94935d;
        com.tencent.mm.ui.MMActivity mMActivity = this.f94936e;
        if (B && this.E.o()) {
            view.findViewById(com.tencent.mm.R.id.b9p).setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
            mMActivity.setActionbarColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
        } else {
            int d17 = lu1.a0.d(this.E.s0().f388555p);
            view.findViewById(com.tencent.mm.R.id.b9p).setBackgroundColor(d17);
            mMActivity.setActionbarColor(d17);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f484068cw2);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.gzh);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.cvy);
        if (this.E.B() && this.f94937f.i()) {
            if (this.E.d()) {
                findViewById.setClipToOutline(true);
                findViewById.setOutlineProvider(new com.tencent.mm.plugin.card.ui.f0(this));
                findViewById3.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.UN_BW_97));
            } else if (this.E.o()) {
                view.findViewById(com.tencent.mm.R.id.gfa).setBackgroundResource(0);
                findViewById3.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
            } else if (this.E.X()) {
                findViewById.setBackgroundResource(com.tencent.mm.R.drawable.bz_);
                view.findViewById(com.tencent.mm.R.id.gfa).setBackgroundResource(com.tencent.mm.R.drawable.f481108ky);
                findViewById3.setBackgroundResource(0);
            } else if (!this.E.Q() && this.E.m0()) {
                findViewById3.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
            }
        } else if (this.E.i()) {
            if (this.f94937f.r() && this.f94939h) {
                findViewById.setBackgroundResource(com.tencent.mm.R.drawable.bz_);
                findViewById3.setBackgroundResource(0);
            } else if (!this.f94937f.r() || this.f94939h) {
                findViewById.setBackgroundResource(0);
                if (((hu1.a) this.f94937f).f285071d) {
                    findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.bz9);
                } else {
                    findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.bz_);
                }
            } else {
                findViewById.setBackgroundResource(com.tencent.mm.R.drawable.bz9);
                findViewById3.setBackgroundResource(0);
            }
        } else if (this.E.d()) {
            findViewById.setClipToOutline(true);
            findViewById.setOutlineProvider(new com.tencent.mm.plugin.card.ui.g0(this));
            findViewById3.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.UN_BW_97));
        } else if (this.E.X()) {
            findViewById.setBackgroundResource(com.tencent.mm.R.drawable.f481138lm);
            findViewById3.setBackgroundResource(0);
        } else {
            findViewById.setBackgroundResource(0);
            findViewById3.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        if (this.E.m0()) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483453aw3);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.c0(com.tencent.mm.R.drawable.bz8));
            bitmapDrawable.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
            textView.setBackgroundDrawable(bitmapDrawable);
            textView.setVisibility(0);
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
        findViewById.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        findViewById.invalidate();
        findViewById3.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        findViewById3.invalidate();
        if (this.E.i() && this.f94937f.r() && this.f94939h) {
            android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.mtt);
            findViewById4.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            findViewById4.invalidate();
        }
        if (this.E.B() && this.f94937f.i()) {
            android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.gfa);
            rect.left = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479866hf);
            int dimensionPixelOffset = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479866hf);
            rect.right = dimensionPixelOffset;
            findViewById5.setPadding(rect.left, rect.top, dimensionPixelOffset, rect.bottom);
            findViewById5.invalidate();
            if (this.E.X()) {
                android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.gfb);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById6.getLayoutParams();
                int dimensionPixelSize = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
                findViewById6.setLayoutParams(layoutParams);
            }
        }
        if (this.f94937f.i() || this.f94937f.r()) {
            if (this.f94942n != null && ((this.E.B() && this.E.d()) || this.E.i())) {
                this.f94942n.e(0);
            }
        } else if (this.f94942n != null && ((this.E.B() && this.E.d()) || this.E.i())) {
            if (((hu1.a) this.f94937f).f285071d) {
                this.f94942n.e(com.tencent.mm.R.drawable.bza);
            } else {
                this.f94942n.e(com.tencent.mm.R.drawable.f481136lk);
            }
        }
        if (this.f94942n != null && this.E.B() && this.E.o()) {
            this.f94942n.a(lu1.a0.n(mMActivity, lu1.a0.d(this.E.s0().f388555p), mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480189qv)));
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
            int dimensionPixelSize2 = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
            layoutParams3.rightMargin = dimensionPixelSize2;
            layoutParams3.leftMargin = dimensionPixelSize2;
            if (this.E.o()) {
                layoutParams3.topMargin = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479876hp);
                layoutParams3.bottomMargin = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479877hq);
                int dimensionPixelSize3 = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi);
                layoutParams3.rightMargin = dimensionPixelSize3;
                layoutParams3.leftMargin = dimensionPixelSize3;
            } else {
                int dimensionPixelSize4 = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479573p);
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
                layoutParams4.bottomMargin = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi);
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
                android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.f482766ng);
                android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) findViewById7.getLayoutParams();
                layoutParams5.height = 0;
                layoutParams5.weight = 1.0f;
                findViewById7.setLayoutParams(layoutParams5);
            }
        }
        view.invalidate();
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        com.tencent.mm.ui.MMActivity mMActivity = this.f94936e;
        if (i17 == 0) {
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "tryNewForwardIntercept handle REQUEST_CODE_GIFT");
            if (i18 == -1 && intent != null) {
                this.I = intent.getStringExtra("Select_Conv_User");
                tt1.j jVar = this.E;
                if (jVar == null || jVar.s0() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
                } else {
                    java.lang.String u17 = ot0.q.u(lu1.u.b(this.E, this.U.f95108f, 2), null, null);
                    v05.b bVar = new v05.b();
                    bVar.fromXml(u17);
                    vd5.a aVar = new vd5.a();
                    aVar.k(bVar);
                    ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(mMActivity, aVar, this.I, n13.t.a(new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.plugin.card.ui.b0$$a
                        @Override // com.tencent.mm.ui.widget.dialog.j
                        public final void a(boolean z18, java.lang.String str, int i19) {
                            com.tencent.mm.plugin.card.ui.b0 b0Var = com.tencent.mm.plugin.card.ui.b0.this;
                            if (!z18) {
                                b0Var.getClass();
                                return;
                            }
                            b0Var.f94934J = str;
                            com.tencent.mm.plugin.card.ui.s0 s0Var = b0Var.T;
                            if (s0Var != null) {
                                ((com.tencent.mm.plugin.card.ui.q) s0Var).b(b0Var.I);
                            }
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperGift", 1, java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), b0Var.I);
                            com.tencent.mm.ui.MMActivity mMActivity2 = b0Var.f94936e;
                            db5.e1.T(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.asp));
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
                com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "mPrivateSelelct : %d", java.lang.Integer.valueOf(intExtra));
                if (this.K < 2) {
                    this.A.f312074d.setText(mMActivity.getString(com.tencent.mm.R.string.av6));
                    return;
                }
                this.L = intent.getStringExtra("Klabel_name_list");
                this.M = intent.getStringExtra("Kother_user_name_list");
                if (android.text.TextUtils.isEmpty(this.L) && android.text.TextUtils.isEmpty(this.M)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "mLabelNameList by getIntent is empty");
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
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "mPrivateIdsList size is " + this.P.size());
                }
                if (this.N != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUIContoller", "mPrivateNamesList size is " + this.N.size());
                    java.util.Iterator it = this.N.iterator();
                    while (it.hasNext()) {
                    }
                }
                int i19 = this.K;
                if (i19 == 2) {
                    this.A.f312074d.setText(mMActivity.getString(com.tencent.mm.R.string.av8, g()));
                    return;
                } else if (i19 == 3) {
                    this.A.f312074d.setText(mMActivity.getString(com.tencent.mm.R.string.av7, g()));
                    return;
                } else {
                    this.A.f312074d.setText(mMActivity.getString(com.tencent.mm.R.string.av6));
                    return;
                }
            }
            if (i17 == 3) {
                if (this.T != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "onConsumeCodeUIResult()");
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
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 == 0) {
            if (android.text.TextUtils.isEmpty(this.E.Y().f377580d) || this.E.m0()) {
                sb6.append(h(com.tencent.mm.R.string.jdx));
            } else {
                sb6.append(this.E.Y().f377580d);
            }
        } else if (i17 == 1) {
            sb6.append(h(com.tencent.mm.R.string.avh) + this.H.d());
        } else if (i17 == 4) {
            sb6.append(h(com.tencent.mm.R.string.aum) + this.H.d());
        }
        java.lang.String str2 = this.E.s0().f388553n + "\n" + this.E.s0().f388552m;
        r35.u3 u3Var = r35.t3.f369263a;
        com.tencent.mm.ui.ga controller = mMActivity.getController();
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = this.E.s0().f388546e;
        java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.f490551ya);
        com.tencent.mm.plugin.card.ui.n0 n0Var = new com.tencent.mm.plugin.card.ui.n0(this, i17, stringExtra);
        ((ez.z0) u3Var).getClass();
        r35.j1.j(controller, sb7, str3, str2, null, true, string, n0Var);
    }
}
