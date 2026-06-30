package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class t6 implements wd0.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74212a;

    public t6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI) {
        this.f74212a = loginPasswordUI;
    }

    public void a(int i17, final java.lang.String str) {
        wd0.d1[] d1VarArr = wd0.d1.f444702d;
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f74212a;
        if (i17 != 0 || str.isEmpty()) {
            int i18 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
            loginPasswordUI.m7(i17);
            return;
        }
        int i19 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "[fingerprint login] handleFingerprintAuth init result %d,errMsg %s", java.lang.Integer.valueOf(i17), str);
        if (wt5.a.o(loginPasswordUI.getContext(), 1)) {
            loginPasswordUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.t6$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.t6.this.f74212a;
                    loginPasswordUI2.g7(false);
                    loginPasswordUI2.V6();
                    com.tencent.mm.plugin.account.ui.m1 m1Var = new com.tencent.mm.plugin.account.ui.m1();
                    kotlinx.coroutines.y0 lifecycleAsyncScope = loginPasswordUI2.getLifecycleAsyncScope();
                    java.lang.String str2 = loginPasswordUI2.E;
                    androidx.appcompat.app.AppCompatActivity context = loginPasswordUI2.getContext();
                    m1Var.f74031g = new com.tencent.mm.plugin.account.ui.u6(loginPasswordUI2);
                    m1Var.f74028d = new du5.c();
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 4, false);
                    m1Var.f74029e = z2Var;
                    z2Var.f212072x.setVisibility(4);
                    android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.eev, (android.view.ViewGroup) null);
                    m1Var.f74025a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.twg);
                    m1Var.f74026b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.twh);
                    m1Var.f74027c = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.g5z);
                    com.tencent.mm.ui.bk.s0(m1Var.f74025a.getPaint());
                    com.tencent.mm.ui.bk.s0(m1Var.f74026b.getPaint());
                    int wi6 = ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi();
                    com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] isOnScreen: %s", java.lang.Integer.valueOf(wi6));
                    boolean z17 = wi6 == 2;
                    m1Var.f74032h = z17;
                    com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] isOnScreen: %b", java.lang.Boolean.valueOf(z17));
                    m1Var.b(context, false);
                    if (m1Var.f74032h) {
                        m1Var.f74025a.setVisibility(4);
                        m1Var.f74026b.setVisibility(8);
                        m1Var.f74027c.setVisibility(4);
                    } else {
                        m1Var.f74025a.setVisibility(0);
                        m1Var.f74027c.setVisibility(0);
                        m1Var.f74026b.setVisibility(8);
                    }
                    m1Var.f74029e.j(inflate);
                    m1Var.f74029e.l(new com.tencent.mm.plugin.account.ui.i1(m1Var));
                    m1Var.f74029e.C();
                    ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Vi(lifecycleAsyncScope, context, new wd0.b2(m1Var.f74028d, new com.tencent.mm.plugin.account.ui.l1(m1Var, context), str), new com.tencent.mm.plugin.account.ui.j1(m1Var, str2, lifecycleAsyncScope));
                    ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_login_logout", "view_exp", null);
                }
            });
        } else {
            loginPasswordUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.t6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.t6.this.f74212a;
                    loginPasswordUI2.g7(false);
                    ((is.f) ((js.r0) i95.n0.c(js.r0.class))).hj(loginPasswordUI2.E, false);
                    loginPasswordUI2.f73368y1 = true;
                    loginPasswordUI2.q7();
                    androidx.appcompat.app.AppCompatActivity context = loginPasswordUI2.getContext();
                    int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.d(com.tencent.mm.R.string.p99);
                    e4Var.c();
                }
            });
        }
    }
}
