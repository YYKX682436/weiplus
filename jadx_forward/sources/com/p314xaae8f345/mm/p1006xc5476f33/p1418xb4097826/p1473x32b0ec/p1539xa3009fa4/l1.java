package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class l1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 f198740d;

    /* renamed from: e, reason: collision with root package name */
    public final yl2.g1 f198741e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1 f198742f;

    /* renamed from: g, reason: collision with root package name */
    public int f198743g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        yl2.g1 g1Var = new yl2.g1((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity, 0, 0L, 6, null);
        this.f198741e = g1Var;
        this.f198743g = 8;
        int intExtra = m158359x1e885992().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        long longExtra = m158359x1e885992().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        g1Var.f544542b = intExtra;
        g1Var.f544543c = longExtra;
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "handleConfirmPostLive");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = this.f198740d;
        if (d9Var != null) {
            d9Var.b();
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        yl2.g1 g1Var = this.f198741e;
        zy2.zb.qd(zbVar, 4, g1Var.f544542b, g1Var.f544543c, null, 8, null);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g1(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b0b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult,requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode:");
        sb6.append(i18);
        sb6.append(",face verify result:");
        sb6.append(intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", sb6.toString());
        if (i17 == 10002) {
            if (i18 == 1) {
                O6();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1 b1Var = this.f198742f;
            if (b1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b1.B5(b1Var, false, null, null, false, 0, 0L, 62, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f, m158354x19263085(), m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 1000L, null, 8, null);
        this.f198740d = a17;
        a17.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "prepare()");
        java.lang.String e17 = xy2.c.e(m80379x76847179());
        boolean z18 = false;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(m158354x19263085())) {
            z17 = true;
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
            u1Var.g(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dls));
            u1Var.n(m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f1(this));
            u1Var.q(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveVerifyUIC", "checkNetworkAvailable() network problem");
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveVerifyUIC", "prepare() checkNetworkAvailable failed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = this.f198740d;
            if (d9Var != null) {
                d9Var.b();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "checkAccountValid()");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVerifyUIC", "checkAccountValid() need create finder contact.");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_GO_TO_AFTER_CREATE_SUCCESS", 1);
            intent.putExtra("key_router_to_profile", false);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22385, 7, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c1(c0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d1(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e1(c0Var, this);
            ((c61.p2) ybVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.INSTANCE.m61671x6f167008(context, 3, intent, 10002, c1Var, d1Var, e1Var);
        } else {
            z18 = true;
        }
        if (z18) {
            pf5.e.m158344xbe96bc24(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k1(this, e17, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveVerifyUIC", "prepare() checkAccountValid failed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var2 = this.f198740d;
        if (d9Var2 != null) {
            d9Var2.b();
        }
    }
}
