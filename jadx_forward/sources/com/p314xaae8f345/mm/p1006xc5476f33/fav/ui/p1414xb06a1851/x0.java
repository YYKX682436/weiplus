package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class x0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f182345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 f182346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182347f;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var) {
        this.f182347f = activityC13591xdaafa82c;
        this.f182345d = k0Var;
        this.f182346e = a1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f182345d;
        k0Var.o(null);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = this.f182347f;
        if (activityC13591xdaafa82c.f182163r) {
            if (activityC13591xdaafa82c.f182160o.t0()) {
                g4Var.f(2, activityC13591xdaafa82c.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
            if (activityC13591xdaafa82c.f182160o.u0()) {
                g4Var.f(1, activityC13591xdaafa82c.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbx));
            }
            g4Var.f(3, activityC13591xdaafa82c.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccr));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = this.f182346e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.f182220e)) {
                return;
            }
            activityC13591xdaafa82c.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.g0(activityC13591xdaafa82c, a1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "fetchCodeInfo code: %s, hasGet: %b", a1Var.f182220e, java.lang.Boolean.valueOf(a1Var.f182225j));
            if (!a1Var.f182225j) {
                a1Var.f182225j = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC13591xdaafa82c.f182164s).h(a1Var.f182221f, a1Var.f182220e);
            }
            k0Var.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC13591xdaafa82c.f182164s).b(g0Var, a1Var.f182221f, a1Var.f182220e, 4));
        }
    }
}
