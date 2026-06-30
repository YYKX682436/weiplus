package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class p0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0 f236998d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0 t0Var) {
        this.f236998d = t0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0 t0Var = this.f236998d;
        if (c01.ia.e(t0Var.f237019e.f236811w)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15 = t0Var.f237019e;
        if (activityC16966x2b279c15.A && !c01.ia.C(activityC16966x2b279c15.f236811w)) {
            g4Var.f(0, t0Var.f237019e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c152 = t0Var.f237019e;
        if (activityC16966x2b279c152.A && activityC16966x2b279c152.getIntent().getIntExtra("from_scene", 0) == 0) {
            g4Var.f(2, t0Var.f237019e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
        }
        if (t0Var.f237018d) {
            g4Var.f(3, t0Var.f237019e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2b));
        }
    }
}
