package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class t6 implements wd0.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f155745a;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98) {
        this.f155745a = activityC11419x78fe9e98;
    }

    public void a(int i17, final java.lang.String str) {
        wd0.d1[] d1VarArr = wd0.d1.f526235d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = this.f155745a;
        if (i17 != 0 || str.isEmpty()) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
            activityC11419x78fe9e98.m7(i17);
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "[fingerprint login] handleFingerprintAuth init result %d,errMsg %s", java.lang.Integer.valueOf(i17), str);
        if (wt5.a.o(activityC11419x78fe9e98.mo55332x76847179(), 1)) {
            activityC11419x78fe9e98.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.t6$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6.this.f155745a;
                    activityC11419x78fe9e982.g7(false);
                    activityC11419x78fe9e982.V6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1();
                    p3325xe03a0797.p3326xc267989b.y0 lifecycleAsyncScope = activityC11419x78fe9e982.getLifecycleAsyncScope();
                    java.lang.String str2 = activityC11419x78fe9e982.E;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11419x78fe9e982.mo55332x76847179();
                    m1Var.f155564g = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u6(activityC11419x78fe9e982);
                    m1Var.f155561d = new du5.c();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179, 2, 4, false);
                    m1Var.f155562e = z2Var;
                    z2Var.f293605x.setVisibility(4);
                    android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eev, (android.view.ViewGroup) null);
                    m1Var.f155558a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.twg);
                    m1Var.f155559b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.twh);
                    m1Var.f155560c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.g5z);
                    com.p314xaae8f345.mm.ui.bk.s0(m1Var.f155558a.getPaint());
                    com.p314xaae8f345.mm.ui.bk.s0(m1Var.f155559b.getPaint());
                    int wi6 = ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] isOnScreen: %s", java.lang.Integer.valueOf(wi6));
                    boolean z17 = wi6 == 2;
                    m1Var.f155565h = z17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] isOnScreen: %b", java.lang.Boolean.valueOf(z17));
                    m1Var.b(mo55332x76847179, false);
                    if (m1Var.f155565h) {
                        m1Var.f155558a.setVisibility(4);
                        m1Var.f155559b.setVisibility(8);
                        m1Var.f155560c.setVisibility(4);
                    } else {
                        m1Var.f155558a.setVisibility(0);
                        m1Var.f155560c.setVisibility(0);
                        m1Var.f155559b.setVisibility(8);
                    }
                    m1Var.f155562e.j(inflate);
                    m1Var.f155562e.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i1(m1Var));
                    m1Var.f155562e.C();
                    ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Vi(lifecycleAsyncScope, mo55332x76847179, new wd0.b2(m1Var.f155561d, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l1(m1Var, mo55332x76847179), str), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j1(m1Var, str2, lifecycleAsyncScope));
                    ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_login_logout", "view_exp", null);
                }
            });
        } else {
            activityC11419x78fe9e98.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.t6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6.this.f155745a;
                    activityC11419x78fe9e982.g7(false);
                    ((is.f) ((js.r0) i95.n0.c(js.r0.class))).hj(activityC11419x78fe9e982.E, false);
                    activityC11419x78fe9e982.f154901y1 = true;
                    activityC11419x78fe9e982.q7();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11419x78fe9e982.mo55332x76847179();
                    int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
                    e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p99);
                    e4Var.c();
                }
            });
        }
    }
}
