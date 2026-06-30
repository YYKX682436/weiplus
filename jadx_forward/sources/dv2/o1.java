package dv2;

/* loaded from: classes8.dex */
public class o1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f325450d;

    /* renamed from: e, reason: collision with root package name */
    public int f325451e;

    /* renamed from: f, reason: collision with root package name */
    public int f325452f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 f325453g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f325454h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 f325455i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f325456m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f325457n;

    /* renamed from: o, reason: collision with root package name */
    public final qd2.j1 f325458o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325458o = new qd2.j1();
    }

    public static final void O6(dv2.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 h9Var) {
        o1Var.f325455i = h9Var;
        m8Var.c(h9Var);
    }

    public final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 preCheckInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 preCheckCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preCheckInfo, "preCheckInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preCheckCallback, "preCheckCallback");
        boolean Q6 = Q6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[doPreCheck] enable:" + Q6);
        if (Q6) {
            boolean z17 = true;
            if (this.f325452f != 1 && (this.f325450d != 0 || this.f325451e != 0)) {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[isNeedCheck] isNeed:" + z17 + " appearTimes:" + this.f325452f + " showTipsDialogCount:" + this.f325450d + " jumpH5Count:" + this.f325451e);
            if (z17) {
                this.f325453g = preCheckInfo;
                this.f325454h = preCheckCallback;
                T6(preCheckInfo, preCheckCallback);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 h9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9(true, false, null, 4, null);
        this.f325455i = h9Var;
        preCheckCallback.c(h9Var);
    }

    public boolean Q6() {
        return false;
    }

    public int R6() {
        return 0;
    }

    public int S6() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 preCheckInfo, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 preCheckCallback) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preCheckInfo, "preCheckInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preCheckCallback, "preCheckCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        int R6 = R6();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f325456m;
        int S6 = S6();
        dv2.n1 n1Var = new dv2.n1(this, c0Var, preCheckCallback);
        this.f325458o.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doPreCheck] utilsCmdId:");
        sb6.append(R6);
        sb6.append(" desc:");
        java.lang.String str = preCheckInfo.f183738a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckHelper", sb6.toString());
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, java.lang.Integer.valueOf(R6));
        if (R6 == 1) {
            r45.db5 db5Var = new r45.db5();
            db5Var.set(0, str);
            byte[] bArr = preCheckInfo.f183739b;
            db5Var.set(1, bArr != null ? pm0.b0.h(bArr) : null);
            db5Var.set(2, preCheckInfo.f183740c);
            a17 = hc2.b.a(db5Var);
        } else if (R6 != 2) {
            a17 = null;
        } else {
            r45.a66 a66Var = new r45.a66();
            a66Var.set(0, str);
            a17 = hc2.b.a(a66Var);
        }
        hx0Var.set(1, a17);
        db2.c4 c4Var = new db2.c4(5, null, 0, hx0Var, xy2.c.d(context), null, gVar, true, 38, null);
        pq5.g l17 = c4Var.l();
        l17.f(context instanceof im5.b ? (im5.b) context : null);
        l17.K(new qd2.i1(n1Var, preCheckInfo, context, R6, S6));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderSafePrecheckMaxDuration", 2000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FINDER_SAFE_PRE_CHECK_MAX_DURATION maxDuration = " + b17);
        long j17 = (long) b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[preCheckInner] maxDuration:" + j17);
        if (j17 > 0) {
            pf5.e.m158344xbe96bc24(this, null, null, new dv2.m1(j17, c0Var, c4Var, this, preCheckCallback, null), 3, null);
        }
    }

    public final void U6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f325457n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(m158354x19263085(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, false, null);
        this.f325457n = Q;
        if (Q != null) {
            Q.show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "requestCode:" + i17 + " resultCode:" + i18 + " appearTimes:" + this.f325452f);
        if (i17 == S6()) {
            this.f325451e++;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.F).mo141623x754a37bb()).r()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[checkFinderUtils] start");
                U6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var = this.f325453g;
                if (g9Var == null) {
                    g9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9("", null, null, false, false, 30, null);
                }
                g9Var.f183741d = false;
                T6(g9Var, new dv2.k1(this));
                return;
            }
            if (this.f325452f == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[checkRealName] start");
                U6();
                pq5.g l17 = new db2.u2(3, "", xy2.c.e(m80379x76847179()), null, 8, null).l();
                android.content.ComponentCallbacks2 m80379x76847179 = m80379x76847179();
                l17.f(m80379x76847179 instanceof im5.b ? (im5.b) m80379x76847179 : null);
                l17.K(new dv2.l1(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f325457n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f325457n = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f325458o = new qd2.j1();
    }
}
