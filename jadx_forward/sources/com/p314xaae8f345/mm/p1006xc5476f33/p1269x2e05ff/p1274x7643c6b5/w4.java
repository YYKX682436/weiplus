package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class w4 implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 f174795a;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var) {
        this.f174795a = s4Var;
    }

    @Override // mp1.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "transform to float ball animation cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = this.f174795a;
        gp1.v vVar = s4Var.f174669h;
        if (vVar != null) {
            vVar.u0(true);
        }
        s4Var.f174772n.q(true);
    }

    @Override // mp1.b
    /* renamed from: onAnimationEnd */
    public void mo50325xbb3aa236() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "transform to float ball animation end");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = this.f174795a;
        gp1.v vVar = s4Var.f174669h;
        if (vVar != null) {
            vVar.u0(true);
        }
        s4Var.f174772n.q(false);
    }
}
