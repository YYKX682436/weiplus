package yw3;

/* loaded from: classes11.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f548244e;

    public c5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f548243d = repairerPatchDemoUI;
        this.f548244e = mm6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548243d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = repairerPatchDemoUI.h;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            if (j0Var.isShowing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerPatchDemoUI.d, "update dialog is showing.");
                return;
            }
        }
        r45.mm6 mm6Var = this.f548244e;
        if (mm6Var.f462214t == 4) {
            ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
            w73.f.k(121);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 121L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 60L, 1L, false);
        }
        repairerPatchDemoUI.h = db5.e1.C(repairerPatchDemoUI.mo55332x76847179(), mm6Var.f462207m, mm6Var.f462206i, mm6Var.f462208n, mm6Var.f462209o, false, new yw3.a5(repairerPatchDemoUI, mm6Var), new yw3.b5(mm6Var));
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).Ai();
    }
}
