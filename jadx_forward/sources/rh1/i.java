package rh1;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh1.j f477166d;

    public i(rh1.j jVar, rh1.f fVar) {
        this.f477166d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f477166d.f477168b == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477166d.f477168b;
        if (o6Var.L0() || o6Var.S) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMultiTaskLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        if (o6Var.r0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMultiTaskLogic", "init, context is null");
            return;
        }
        if (this.f477166d.f477169c != null) {
            this.f477166d.f477169c.getClass();
        }
        rh1.c cVar = new rh1.c(new rh1.e(o6Var), o6Var);
        this.f477166d.f477169c = cVar;
        cVar.y(1, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.b(o6Var.f156336n, o6Var.f156338p.f158814g));
        if (o6Var.u0().B2 != null) {
            cVar.b0(o6Var.u0().B2.f156491d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMultiTaskLogic", "multiTaskData null! enter scene:%d", java.lang.Integer.valueOf(o6Var.g2()));
            if (o6Var.g2() == 1089 || o6Var.g2() == 1104) {
                cVar.f381654n = true;
            } else {
                cVar.f381654n = false;
            }
        }
        if (this.f477166d.f477168b != null) {
            o6Var.I1(new rh1.h(this));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new rh1.g(this));
    }
}
