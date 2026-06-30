package yw3;

/* loaded from: classes11.dex */
public final class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f548275e;

    public f5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f548274d = repairerPatchDemoUI;
        this.f548275e = mm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548274d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = repairerPatchDemoUI.h;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            if (j0Var.isShowing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerPatchDemoUI.d, "update dialog is showing.");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerPatchDemoUI.d, "show update dialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 27L, 1L, false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574956k43));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.k3l);
        u1Var.a(true);
        r45.mm6 mm6Var = this.f548275e;
        u1Var.b(new yw3.d5(repairerPatchDemoUI, mm6Var));
        u1Var.e(new yw3.e5(mm6Var));
        u1Var.q(false);
        repairerPatchDemoUI.h = u1Var.f293531c;
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).Ai();
    }
}
