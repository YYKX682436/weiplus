package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

@db5.a(m123858x6ac9171 = 2)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI */
/* loaded from: classes9.dex */
public class ActivityC18999x8e4b0cb extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0, mp5.v {
    public static final /* synthetic */ int W = 0;
    public android.widget.TextView A;
    public boolean B;
    public boolean C;
    public android.view.View D;
    public int E;
    public int F;
    public int G;
    public double H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final java.text.DecimalFormat f259314J;
    public boolean K;
    public java.lang.String L;
    public rr4.b M;
    public int N;
    public hs4.d P;
    public final java.lang.Runnable Q;
    public int R;
    public final java.lang.Runnable S;
    public final java.lang.Runnable T;
    public final java.util.HashMap U;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d V;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f259315d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259316e;

    /* renamed from: f, reason: collision with root package name */
    public double f259317f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259318g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f259319h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f259320i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f259321m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f259322n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f259323o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f259324p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f259325q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f259326r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f259327s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f259328t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f259329u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f259330v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f259331w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f259332x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f259333y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f259334z;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2);
    }

    public ActivityC18999x8e4b0cb() {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 270);
        this.f259318g = null;
        this.B = true;
        this.C = true;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.0d;
        this.I = 0;
        this.f259314J = new java.text.DecimalFormat("0.00");
        this.K = false;
        this.N = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.o(this);
        this.R = 0;
        this.S = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.l0(this);
        this.T = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.f(this);
        this.U = new java.util.HashMap();
        this.V = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.34
            {
                this.f39173x3fe91575 = 572563856;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = c5663xbbd89b80;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent callback");
                if (c5663xbbd89b802 == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.this;
                am.di diVar = c5663xbbd89b802.f135987g;
                if (diVar != null) {
                    if (diVar.f87986a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent bindCard Succ");
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.W;
                        activityC18999x8e4b0cb.b7();
                        activityC18999x8e4b0cb.K = true;
                        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC18999x8e4b0cb.m83105x7498fe14().get("key_pay_info");
                        if (c19760x34448d56 == null) {
                            c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                            c19760x34448d56.f273647m = activityC18999x8e4b0cb.f259318g;
                            c19760x34448d56.f273642e = 21;
                        }
                        activityC18999x8e4b0cb.m83096xe7b1ccf7(new ss4.b0(c19760x34448d56.f273647m, 4));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "KindaBindCardEvent bindCard Cancel");
                    }
                }
                activityC18999x8e4b0cb.V.mo48814x2efc64();
                return true;
            }
        };
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC18999x8e4b0cb.f259316e;
        double d17 = (c19091x9511676c == null || (i17 = activityC18999x8e4b0cb.E) == 0 || (i17 == 1 && c19091x9511676c.f69238xe5669181 <= 0.0d) || ((i17 == 1 && c19091x9511676c.f69238xe5669181 > 0.0d && activityC18999x8e4b0cb.F == 0) || activityC18999x8e4b0cb.H >= vr4.f1.wi().Ai().f95532h.Q2)) ? vr4.f1.wi().Ai().f95532h.Q2 : activityC18999x8e4b0cb.f259316e != null ? vr4.f1.wi().Ai().f95532h.Q2 - activityC18999x8e4b0cb.f259316e.f69242x17f4744b : vr4.f1.wi().Ai().f95532h.Q2;
        if (activityC18999x8e4b0cb.G != 1) {
            activityC18999x8e4b0cb.f259320i.m83213x765074af(activityC18999x8e4b0cb.f259314J.format(d17));
            activityC18999x8e4b0cb.g7();
            activityC18999x8e4b0cb.I = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "is_full_fetch_direct is 0!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "do fetch direct to pay!");
        activityC18999x8e4b0cb.I = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC18999x8e4b0cb.f259316e;
        if (c19091x9511676c2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c2.f69239x93565523)) {
            db5.t7.m123883x26a183b(activityC18999x8e4b0cb.mo55332x76847179(), activityC18999x8e4b0cb.f259316e.f69239x93565523, 0).show();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = activityC18999x8e4b0cb.f259316e;
        if (c19091x9511676c3 != null) {
            java.lang.String str3 = c19091x9511676c3.f69223x58802fcb;
            str2 = c19091x9511676c3.f69225xed6d60f6;
            str = str3;
        } else {
            str = "";
            str2 = str;
        }
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        activityC18999x8e4b0cb.e7(21, activityC18999x8e4b0cb.f259317f, "1", str, str2, activityC18999x8e4b0cb.I);
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        activityC18999x8e4b0cb.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = activityC18999x8e4b0cb.L;
        objArr[1] = 15;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC18999x8e4b0cb.f259316e;
        objArr[2] = c19091x9511676c != null ? c19091x9511676c.f69223x58802fcb : "";
        objArr[3] = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
        g0Var.d(16398, objArr);
        activityC18999x8e4b0cb.f39912xe2ad5320.v();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC18999x8e4b0cb.f259316e.f261113s3)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC18999x8e4b0cb.mo55332x76847179(), 2, 3);
        z2Var.y(activityC18999x8e4b0cb.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6));
        z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.d0(activityC18999x8e4b0cb, z2Var);
        android.view.View inflate = android.view.View.inflate(activityC18999x8e4b0cb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bte, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gwd);
        textView.setText(activityC18999x8e4b0cb.f259316e.f261113s3);
        textView.setTextSize(1, i65.a.q(activityC18999x8e4b0cb) * 17.0f);
        inflate.setPadding(0, i65.a.b(activityC18999x8e4b0cb, 40), 0, i65.a.b(activityC18999x8e4b0cb, 16));
        z2Var.t(inflate);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activityC18999x8e4b0cb);
        linearLayout.setOrientation(1);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) android.view.View.inflate(activityC18999x8e4b0cb, com.p314xaae8f345.mm.R.C30864xbddafb2a.btc, null);
        ((android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.gw9)).setVisibility(8);
        ((android.widget.TextView) linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.gw8)).setText(activityC18999x8e4b0cb.f259316e.f261114t3);
        linearLayout.addView(linearLayout2);
        java.util.ArrayList arrayList = activityC18999x8e4b0cb.f259316e.f261115u3;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i17 = 0; i17 < activityC18999x8e4b0cb.f259316e.f261115u3.size(); i17++) {
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) android.view.View.inflate(activityC18999x8e4b0cb, com.p314xaae8f345.mm.R.C30864xbddafb2a.btc, null);
                ((android.widget.TextView) linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.gw8)).setText((java.lang.CharSequence) activityC18999x8e4b0cb.f259316e.f261115u3.get(i17));
                linearLayout.addView(linearLayout3);
            }
        }
        z2Var.j(linearLayout);
        z2Var.C();
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        java.lang.String str;
        java.lang.String str2;
        int i17 = activityC18999x8e4b0cb.f259316e.f261118x3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = activityC18999x8e4b0cb.L;
        objArr[1] = 13;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC18999x8e4b0cb.f259316e;
        objArr[2] = c19091x9511676c != null ? c19091x9511676c.f69223x58802fcb : "";
        objArr[3] = c19091x9511676c != null ? c19091x9511676c.f69225xed6d60f6 : "";
        g0Var.d(16398, objArr);
        activityC18999x8e4b0cb.f39912xe2ad5320.v();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC18999x8e4b0cb.f259316e;
        int i18 = c19091x9511676c2.f261118x3;
        if (i18 == 1) {
            java.util.ArrayList arrayList = c19091x9511676c2.f261120z3;
            if (arrayList == null || arrayList.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "fetch_limit_recommend_bind_serial is null or 0");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c e17 = vr4.f1.wi().Ai().e((java.lang.String) arrayList.get(0));
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBalanceFetchUI", "find bankcard of %s is null", arrayList.get(0));
                return;
            }
            activityC18999x8e4b0cb.f259316e = e17;
            activityC18999x8e4b0cb.h7();
            activityC18999x8e4b0cb.i7();
            db5.t7.i(activityC18999x8e4b0cb, i65.a.r(activityC18999x8e4b0cb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.kfq), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            return;
        }
        if (i18 == 2) {
            java.util.ArrayList j17 = vr4.f1.wi().Ai().j();
            at4.f fVar = vr4.f1.wi().Ai().f95535k;
            if (fVar != null) {
                java.lang.String str3 = fVar.f95374i;
                str = fVar.f95373h;
                str2 = str3;
            } else {
                str = "";
                str2 = str;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (j17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "debit is null");
            } else {
                java.util.Iterator it = j17.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next();
                    java.util.Iterator it6 = activityC18999x8e4b0cb.f259316e.f261120z3.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str4 = (java.lang.String) it6.next();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && str4.equals(c19091x9511676c3.f69225xed6d60f6)) {
                            arrayList2.add(c19091x9511676c3);
                        }
                    }
                }
            }
            activityC18999x8e4b0cb.c7(activityC18999x8e4b0cb.mo55332x76847179(), arrayList2, activityC18999x8e4b0cb.f259316e, str, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.e0(activityC18999x8e4b0cb, arrayList2), false);
        }
    }

    public final double Y6(double d17) {
        return java.lang.Math.max(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0("" + (d17 - vr4.f1.wi().Ai().f95535k.f95371f), this.f259316e.f69238xe5669181 + "", 2, java.math.RoundingMode.HALF_UP).doubleValue(), this.H);
    }

    public final void Z6(ss4.e0 e0Var) {
        m73811xb6377d84();
        i7();
        if (this.E != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "showRemainFeeTip is_show_charge =" + this.E);
            return;
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_FETCH_CHARGE_TIP_DIALOG_BOOLEAN_SYNC;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue();
        at4.f fVar = vr4.f1.wi().Ai().f95535k;
        if (fVar == null || booleanValue) {
            return;
        }
        db5.e1.B(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvl, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(fVar.f95371f)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvn), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.r(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.s(this), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
    }

    public final void a7(android.content.Intent intent) {
        boolean z17 = false;
        if (intent != null && intent.getBooleanExtra("intent_bind_end", false)) {
            z17 = true;
        }
        this.K = z17;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "onNewIntent() bind card success");
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().get("key_pay_info");
            if (c19760x34448d56 == null) {
                c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d56.f273647m = this.f259318g;
                c19760x34448d56.f273642e = 21;
            }
            m83096xe7b1ccf7(new ss4.b0(c19760x34448d56.f273647m, 4));
        }
    }

    public final void b7() {
    }

    public void c7(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, java.lang.String str, java.lang.String str2, db5.t4 t4Var, boolean z17) {
        int i17;
        hs4.d dVar = this.P;
        if (dVar != null && dVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
            return;
        }
        this.U.clear();
        hs4.d dVar2 = new hs4.d(context);
        this.P = dVar2;
        dVar2.f366151c = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.w(this, list, context);
        db5.g4 g4Var = new db5.g4(this);
        if (z17) {
            g4Var.r(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.keu), null, getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80242x3fc51eb4), getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), false);
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false);
        if (fj6) {
            g4Var.t(1, "", true);
        }
        hs4.d dVar3 = this.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.x(this);
        dVar3.f366155g = g4Var;
        dVar3.f366153e = xVar;
        if (fj6) {
            dVar3.f366152d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.y(this, t4Var);
        } else {
            dVar3.f366149a.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.z(this, list);
        }
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.btw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ixu);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setText(str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ixt)).setText(str2);
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.cx_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(com.p314xaae8f345.mm.R.id.iwt).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.a0(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.iwt).setContentDescription(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdv));
        hs4.d dVar4 = this.P;
        dVar4.f366149a.t(inflate);
        dVar4.f366158j = inflate;
        if (list != null) {
            i17 = list.size();
            if (c19091x9511676c != null) {
                for (int i18 = 0; i18 < list.size(); i18++) {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i18)).f69225xed6d60f6.equals(c19091x9511676c.f69225xed6d60f6)) {
                        i17 = i18;
                    }
                }
            }
        } else {
            i17 = 0;
        }
        hs4.d dVar5 = this.P;
        dVar5.f366160l = true;
        dVar5.f366161m = i17;
        if (fj6) {
            dVar5.f366159k = false;
        } else {
            dVar5.f366159k = true;
        }
        dVar5.f366149a.y(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl_));
        this.P.d();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.iuk);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription(str + str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.b0(this, linearLayout), 500L);
    }

    public final void d7() {
        at4.n a17 = at4.n.a();
        if (a17.b()) {
            db5.e1.s(this, a17.f95435b, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().get("key_pay_info");
        if (c19760x34448d56 == null) {
            c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
            c19760x34448d56.f273647m = this.f259318g;
            c19760x34448d56.f273642e = 21;
        }
        bundle.putParcelable("key_pay_info", c19760x34448d56);
        bundle.putInt("key_scene", 21);
        boolean z17 = false;
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putInt("key_req_bind_scene", 0);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putInt("from_bind_ui", 2);
        bundle.putBoolean("key_bind_show_change_card", true);
        if (com.p314xaae8f345.mm.p2802xd031a825.b.a().b()) {
            this.V.mo48813x58998cd();
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(this, bundle);
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, qr4.a.class, bundle, null);
    }

    public final void e7(int i17, double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("payScene", i17);
        bundle.putString("totalFee", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString());
        bundle.putString("feeType", str);
        bundle.putString("bankType", str2);
        bundle.putString("bindSerial", str3);
        bundle.putString("operation", java.lang.String.valueOf(i18));
        bundle.putString("reportSessionId", this.L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "startWalletBalanceFetchUseCase totalFee：%s reportSessionId %s", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString(), this.L);
        ((h45.q) i95.n0.c(h45.q.class)).mo24840x83d7633e(this, bundle);
    }

    public final void f7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f259320i.m83183xfb85ada3(), 0.0d) <= 0.0d || !this.f259320i.n()) {
            this.f39912xe2ad5320.e(false);
        } else {
            this.f39912xe2ad5320.e(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* renamed from: fetchData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m73811xb6377d84() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.m73811xb6377d84():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb.g7():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d58;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.view.View view = this.D;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.bottomMargin = (int) f17;
            this.D.setLayoutParams(layoutParams);
        }
    }

    public final void h7() {
        if (this.f259316e != null) {
            double j17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j(this.f259316e.f261106l3 + "", "100", 2, java.math.RoundingMode.HALF_UP);
            this.H = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "min charge fee: %s", java.lang.Double.valueOf(j17));
        }
    }

    public final void i7() {
        at4.c cVar;
        at4.e[] eVarArr;
        if (this.f259320i.m83186xefe232c4() != null) {
            this.f259320i.m83186xefe232c4().setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i09), com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "mTotalFeeEHV.getTitleTv() is null");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.ael);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f259316e;
        if (c19091x9511676c != null) {
            at4.k c17 = dt4.b.c(this, c19091x9511676c.f69223x58802fcb, c19091x9511676c.F0());
            java.lang.String str = c17 != null ? c17.f95411a : "";
            imageView.setImageBitmap(null);
            if (this.f259316e.v0()) {
                imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ch9);
            } else {
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                gt4.c1 c1Var = new gt4.c1(str);
                ((x60.e) fVar).getClass();
                android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h(this, imageView));
                if (d17 != null) {
                    imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false));
                }
            }
            android.widget.TextView textView = (android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.acd);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = this.f259316e;
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfi, c19091x9511676c2.f69217xaef0808c, c19091x9511676c2.f69222x587fd4e1));
            ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.acd)).setVisibility(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259316e.f69236x5048ceff)) {
                ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setText(this.f259316e.f69236x5048ceff);
                ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setVisibility(0);
                if (this.f259316e.f69243x5d75d3a7 == 1) {
                    ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
                } else {
                    ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
                }
            }
        } else {
            imageView.setImageBitmap(null);
            ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.acd)).setText(this.f259319h);
            ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setText("");
            ((android.widget.TextView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setVisibility(8);
            ((android.widget.ImageView) this.f259321m.findViewById(com.p314xaae8f345.mm.R.id.ael)).setImageBitmap(null);
        }
        java.lang.String str2 = vr4.f1.wi().Ai().f95532h.U2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f259327s.setVisibility(0);
        this.f259328t.setVisibility(8);
        g7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 = vr4.f1.wi().Ai().f95532h;
        if (this.f259316e == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c3.f69255xfd79664d)) {
            this.f259326r.setText("");
            this.f259326r.setVisibility(8);
            int color = mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            this.N = color;
            this.f259324p.setTextColor(color);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(c19091x9511676c3.f69255xfd79664d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c3.f69253xe8447f03)) {
                spannableStringBuilder.append((java.lang.CharSequence) c19091x9511676c3.f69253xe8447f03);
            }
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(2, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.m(this, c19091x9511676c3)), c19091x9511676c3.f69255xfd79664d.length(), spannableStringBuilder.length(), 18);
            this.f259326r.setText(spannableStringBuilder);
            this.f259326r.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(mo55332x76847179()));
            this.f259326r.setVisibility(0);
            int color2 = mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            this.N = color2;
            this.f259324p.setTextColor(color2);
        }
        at4.f fVar2 = vr4.f1.wi().Ai().f95535k;
        m78548x39037dd1();
        if (fVar2 != null && (cVar = fVar2.f95375j) != null && (eVarArr = cVar.f95348a) != null && eVarArr.length > 0) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k(this, fVar2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c4 = this.f259316e;
        if (c19091x9511676c4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBalanceFetchUI", "updateFetchLimitView mDefaultBankcard is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c4.f261112r3)) {
            this.f259330v.setVisibility(8);
        } else {
            this.f259330v.setVisibility(0);
            this.f259331w.setText(this.f259316e.f261112r3);
            if (this.B) {
                this.B = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = this.L;
                objArr[1] = 14;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c5 = this.f259316e;
                objArr[2] = c19091x9511676c5 != null ? c19091x9511676c5.f69223x58802fcb : "";
                objArr[3] = c19091x9511676c5 != null ? c19091x9511676c5.f69225xed6d60f6 : "";
                g0Var.d(16398, objArr);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259316e.f261116v3)) {
            this.f259332x.setVisibility(8);
            return;
        }
        this.f259332x.setVisibility(0);
        this.f259334z.setText(this.f259316e.f261116v3);
        this.A.setText(this.f259316e.f261119y3);
        this.f259333y.m75396xca029dad(this.f259316e.f261117w3);
        if (this.C) {
            this.C = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = this.L;
            objArr2[1] = 12;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c6 = this.f259316e;
            objArr2[2] = c19091x9511676c6 != null ? c19091x9511676c6.f69223x58802fcb : "";
            objArr2[3] = c19091x9511676c6 != null ? c19091x9511676c6.f69225xed6d60f6 : "";
            g0Var2.d(16398, objArr2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ket);
        this.D = findViewById(com.p314xaae8f345.mm.R.id.e17);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.acc);
        this.f259321m = linearLayout;
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.acd)).getPaint(), 0.8f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c0(this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.acc);
        this.f259322n = findViewById;
        findViewById.setOnClickListener(c0Var);
        this.f259321m.setOnClickListener(c0Var);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.ach);
        this.f259320i = viewOnFocusChangeListenerC22907xe18534c2;
        qp5.p.g(viewOnFocusChangeListenerC22907xe18534c2);
        this.f259320i.m83211x749e7e77(this);
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = new com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223(this);
        this.f39912xe2ad5320 = c22894x55bf3223;
        c22894x55bf3223.d(this, -1);
        m83130x21cc23c2(this.f259320i.m83169xe7297452(), true, false);
        this.f39912xe2ad5320.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575023kf5));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((or4.c) pf5.z.f435481a.a(activity).a(or4.c.class)).m42291x53d8522f("keyboard_title_key", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575023kf5));
        this.f259320i.m83169xe7297452().setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.f0(this));
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f259329u = c22905xef04d72d;
        c22905xef04d72d.a();
        this.f259330v = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567268iu2);
        this.f259331w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567269iu3);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f567267iu1)).m82038x6e0975af(true);
        this.f259330v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.g0(this));
        this.f259332x = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.itz);
        this.f259333y = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.f567266iu0);
        this.f259334z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ity);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.itx);
        this.A = textView;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView);
        this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h0(this));
        this.f259323o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p_z);
        this.f259324p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565900e15);
        this.f259325q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565897e12);
        this.f259326r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565898e13);
        this.f259327s = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f565899e14);
        this.f259328t = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f565901e16);
        com.p314xaae8f345.mm.ui.bk.r0(this.f259325q.getPaint(), 0.8f);
        this.f259325q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.i0(this));
        this.f259320i.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.j0(this));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "3";
        c6241x543927b6.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k0(this, c6241x543927b6);
        c6241x543927b6.e();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        this.f39912xe2ad5320.o();
        return this.f39912xe2ad5320.o();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1 || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult cancel select");
            return;
        }
        int intExtra = intent.getIntExtra("key_select_index", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "onActivityResult select bankcard index is " + intExtra);
        java.util.ArrayList arrayList = this.f259315d;
        if (arrayList == null || intExtra < 0 || intExtra >= arrayList.size()) {
            java.util.ArrayList arrayList2 = this.f259315d;
            if (arrayList2 == null || intExtra < 0 || intExtra > arrayList2.size()) {
                this.f259316e = null;
            }
            d7();
        } else {
            this.f259316e = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f259315d.get(intExtra);
        }
        i7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.L = java.util.UUID.randomUUID().toString();
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        mo78530x8b45058f();
        a7(getIntent());
        m73811xb6377d84();
        this.f259319h = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfj);
        mo43517x10010bd5();
        i7();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(4, 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.Q);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.S);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.T);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "onDialogDismiss()");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.S, 300L);
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        this.f259320i.c(null);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        b7();
        a7(intent);
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f39912xe2ad5320.p()) {
            return;
        }
        this.R = 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        b7();
        super.onResume();
        if (this.R == 3 && mo48628x7c5cc589()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.T, 300L);
        }
        this.R = 2;
        f7();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ss4.e0)) {
            return false;
        }
        ss4.e0 e0Var = (ss4.e0) m1Var;
        Z6(e0Var);
        if (!e0Var.m83018x5c64639d()) {
            return false;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 m83012xc93a1ec9 = e0Var.m83012xc93a1ec9();
        m83012xc93a1ec9.i(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.n(this, m83012xc93a1ec9, e0Var));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(or4.c.class);
    }
}
