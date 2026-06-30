package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 f288972d;

    public a6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 b6Var) {
        this.f288972d = b6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 b6Var = this.f288972d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = b6Var.f289012e.f289534d;
        if (j0Var != null && j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "update dialog is showing.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "show update dialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 27L, 1L, false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574956k43));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.k3l);
        u1Var.a(true);
        u1Var.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y5(this));
        u1Var.e(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z5(this));
        u1Var.q(false);
        b6Var.f289012e.f289534d = u1Var.f293531c;
        k35.n1.a();
    }
}
