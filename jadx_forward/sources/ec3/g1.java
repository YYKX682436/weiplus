package ec3;

/* loaded from: classes9.dex */
public final class g1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public boolean A;
    public int B;
    public int C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Point f332543d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f332544e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f332545f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f332546g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332547h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f332548i;

    /* renamed from: m, reason: collision with root package name */
    public long f332549m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j f332550n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f332551o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f332552p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f332553q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f332554r;

    /* renamed from: s, reason: collision with root package name */
    public int f332555s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f332556t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f332557u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f332558v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f332559w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f332560x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f332561y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f332562z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f332543d = new android.graphics.Point();
        this.f332544e = new java.util.ArrayList();
        this.f332557u = new java.util.LinkedHashMap();
        this.f332558v = "";
        this.f332559w = "";
        this.f332560x = "";
        this.f332561y = "";
        this.B = -1;
        this.D = "";
    }

    public static /* synthetic */ void d7(ec3.g1 g1Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        g1Var.c7(z17);
    }

    public static void e7(ec3.g1 g1Var, ec3.m mVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateRecommendList] itemCount: ");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = g1Var.f332545f;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSkinAdapter");
            throw null;
        }
        sb6.append(c22848x6ddd90cf.mo1894x7e414b06());
        sb6.append("，animDirection：");
        sb6.append(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", sb6.toString());
        if (mVar != ec3.m.f332584e) {
            if (mVar == ec3.m.f332587h) {
                ec3.r1.f332620a.c(g1Var.X6(), ec3.m.f332586g, g1Var.m158354x19263085(), new ec3.f1(g1Var, aVar));
            }
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = g1Var.f332545f;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8146xced61ae5();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSkinAdapter");
                throw null;
            }
        }
    }

    public final boolean O6() {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udo);
        if ((relativeLayout != null && relativeLayout.getVisibility() == 0) && this.f332553q) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ((ec3.l) pf5.z.f435481a.a(activity).a(ec3.l.class)).mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udp);
            if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean P6() {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udo);
        if ((relativeLayout != null && relativeLayout.getVisibility() == 0) && this.f332552p) {
            android.widget.LinearLayout Y6 = Y6();
            if (Y6 != null && Y6.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void Q6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f332546g;
        boolean z17 = false;
        if (c22621x7603e0172 != null && c22621x7603e0172.hasFocus()) {
            z17 = true;
        }
        if (!z17 || (c22621x7603e017 = this.f332546g) == null) {
            return;
        }
        c22621x7603e017.clearFocus();
    }

    public final void R6(boolean z17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHidePlaceOrder] needScrolltoTop：" + z17);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        if (activityC16373x8a110f13 != null && (viewOnFocusChangeListenerC22901x93fec4d2 = activityC16373x8a110f13.f227818x) != null) {
            viewOnFocusChangeListenerC22901x93fec4d2.postDelayed(new ec3.p(z17, this), 150L);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
        if (activityC16373x8a110f132 != null) {
            activityC16373x8a110f132.mo48674x36654fab();
        }
    }

    public final void S6() {
        boolean P6 = P6();
        boolean O6 = O6();
        boolean z17 = this.f332553q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] isInRecommendStyle：" + P6 + ",isInEntranceStyle:" + O6 + "、needShowNewFunctionStyle：" + z17);
        if (O6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] only EntranceStyle, return ");
            return;
        }
        java.util.ArrayList arrayList = this.f332544e;
        ec3.r1 r1Var = ec3.r1.f332620a;
        if (z17 && P6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] has EntranceStyle, doHideRecommendLayout");
            ec3.q qVar = new ec3.q(this);
            this.f332552p = false;
            r1Var.c(Y6(), ec3.m.f332586g, m158354x19263085(), new ec3.r(qVar));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = 19;
            objArr[1] = 0;
            objArr[2] = this.f332559w;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
            objArr[3] = activityC16373x8a110f13 != null ? activityC16373x8a110f13.s7() : null;
            objArr[4] = "";
            objArr[5] = "";
            objArr[6] = Z6();
            objArr[7] = java.lang.Integer.valueOf(arrayList.size());
            objArr[8] = this.f332560x;
            objArr[9] = 0;
            objArr[10] = "";
            objArr[11] = java.lang.Integer.valueOf(this.C);
            g0Var.d(18890, objArr);
            return;
        }
        if (!P6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] has gone,return");
            return;
        }
        ec3.r1.a(r1Var, Y6(), 1.0f, 0.0f, null, 8, null);
        r1Var.b((android.widget.RelativeLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udo), 0.0f, new ec3.s(this));
        this.f332552p = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[12];
        objArr2[0] = 19;
        objArr2[1] = 0;
        objArr2[2] = this.f332559w;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
        objArr2[3] = activityC16373x8a110f132 != null ? activityC16373x8a110f132.s7() : null;
        objArr2[4] = "";
        objArr2[5] = "";
        objArr2[6] = Z6();
        objArr2[7] = java.lang.Integer.valueOf(arrayList.size());
        objArr2[8] = this.f332560x;
        objArr2[9] = 0;
        objArr2[10] = "";
        objArr2[11] = java.lang.Integer.valueOf(this.C);
        g0Var2.d(18890, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T6(java.lang.String str) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        boolean z17 = activityC16373x8a110f13 != null ? activityC16373x8a110f13.f227789i2 : false;
        java.util.ArrayList arrayList = this.f332544e;
        int size = arrayList.size();
        boolean P6 = P6();
        boolean O6 = O6();
        int i17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] scene：" + i17 + "、isInRecommendStyle: " + P6 + "、isInEntranceStyle：" + O6 + "、isNewStyle：" + z17 + "、sizeCount：" + size);
        if (size <= 0 || !z17) {
            c7(true);
            S6();
            return;
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f332546g;
            if ((c22621x7603e017 != null && c22621x7603e017.hasFocus()) == false) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] do not has focus，do hide");
                c7(true);
                S6();
                return;
            }
        }
        if (P6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] has show recommend style，just update");
            U6(ec3.n.f332594e, i17, str, ec3.m.f332587h);
            this.B = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = 15;
            objArr[1] = 0;
            objArr[2] = this.f332559w;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
            objArr[3] = activityC16373x8a110f132 != null ? activityC16373x8a110f132.s7() : null;
            objArr[4] = "";
            objArr[5] = "";
            objArr[6] = Z6();
            objArr[7] = java.lang.Integer.valueOf(arrayList.size());
            objArr[8] = this.f332560x;
            objArr[9] = 0;
            objArr[10] = this.f332558v;
            objArr[11] = java.lang.Integer.valueOf(this.C);
            g0Var.d(18890, objArr);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[12];
        objArr2[0] = 15;
        objArr2[1] = 0;
        objArr2[2] = this.f332559w;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f133 = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630853 : null;
        objArr2[3] = activityC16373x8a110f133 != null ? activityC16373x8a110f133.s7() : null;
        objArr2[4] = "";
        objArr2[5] = "";
        objArr2[6] = Z6();
        objArr2[7] = java.lang.Integer.valueOf(arrayList.size());
        objArr2[8] = this.f332560x;
        objArr2[9] = 0;
        objArr2[10] = this.f332558v;
        objArr2[11] = java.lang.Integer.valueOf(this.C);
        g0Var2.d(18890, objArr2);
        if (O6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] isInNewFunctionEntranceStyle, need hide newfunctionstyle，then show recommend style");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            ec3.l lVar = (ec3.l) zVar.a(activity).a(ec3.l.class);
            ec3.d0 d0Var = new ec3.d0(this, i17, str);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            if (((ec3.g1) zVar.a(activity2).a(ec3.g1.class)).O6()) {
                ec3.r1.f332620a.c((android.widget.RelativeLayout) lVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udp), ec3.m.f332586g, lVar.m158354x19263085(), new ec3.b(d0Var));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] NotInNewFunctionEntranceStyle, show recommend style");
            V6();
            android.widget.LinearLayout Y6 = Y6();
            if (Y6 != null) {
                Y6.postDelayed(new ec3.e0(this), 400L);
            }
            U6(ec3.n.f332594e, i17, str, ec3.m.f332584e);
        }
        this.B = i17;
    }

    public final void U6(ec3.n nVar, int i17, java.lang.String str, ec3.m mVar) {
        if (nVar != ec3.n.f332593d) {
            if (nVar == ec3.n.f332594e) {
                this.f332552p = true;
                if (i17 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    android.widget.TextView W6 = W6();
                    if (W6 != null) {
                        W6.setText(str);
                    }
                } else if (i17 == 0 && this.B == 1) {
                    ec3.r1.f332620a.c(W6(), ec3.m.f332586g, m158354x19263085(), new ec3.c1(this, null));
                }
                e7(this, mVar, null, 2, null);
                return;
            }
            return;
        }
        this.f332552p = true;
        android.widget.TextView W62 = W6();
        if (W62 != null) {
            W62.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573972o80));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f332545f;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSkinAdapter");
            throw null;
        }
        c22848x6ddd90cf.m8146xced61ae5();
        android.widget.LinearLayout Y6 = Y6();
        if (Y6 != null) {
            Y6.postDelayed(new ec3.g0(this), 70L);
        }
    }

    public final void V6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        android.widget.RelativeLayout relativeLayout = activityC16373x8a110f13 != null ? activityC16373x8a110f13.f227824z : null;
        float b17 = i65.a.b(m80379x76847179(), 8);
        if (relativeLayout != null) {
            relativeLayout.setOutlineProvider(new zl5.a(true, false, b17));
        }
        if (relativeLayout != null) {
            relativeLayout.setClipToOutline(true);
        }
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udo);
        if (relativeLayout2 != null) {
            relativeLayout2.postDelayed(new ec3.i0(this), 150L);
        }
    }

    public final android.widget.TextView W6() {
        return (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udm);
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 X6() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udv);
    }

    public final android.widget.LinearLayout Y6() {
        return (android.widget.LinearLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.udx);
    }

    public final java.lang.String Z6() {
        return this.C == 1 ? this.D : a7();
    }

    public final java.lang.String a7() {
        android.text.Editable text;
        java.lang.String obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f332546g;
        return (c22621x7603e017 == null || (text = c22621x7603e017.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final void b7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openLiteAppForYuanBao] appid：" + str + "、path：" + str2 + "、query: " + str3 + "、miniversion：" + str4);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        bundle.putString("query", str3);
        bundle.putString("minVersion", str4);
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new ec3.u0(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(m158354x19263085(), bundle, true, false, sVar, new ec3.s0(this));
    }

    public final void c7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[resetRecommendData]");
        if (z17) {
            this.f332544e.clear();
            this.f332561y = "";
        }
        this.f332558v = "";
        this.f332560x = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[onDestroy]");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f332551o;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f332554r;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f332554r;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w2(int r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.g1.w2(int, boolean):void");
    }
}
