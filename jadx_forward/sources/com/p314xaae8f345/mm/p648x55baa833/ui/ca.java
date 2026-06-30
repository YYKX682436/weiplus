package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class ca implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f145613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f145614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f145615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.da f145616g;

    public ca(boolean z17, android.app.ProgressDialog progressDialog, android.app.Activity activity, com.p314xaae8f345.mm.p648x55baa833.ui.da daVar) {
        this.f145613d = z17;
        this.f145614e = progressDialog;
        this.f145615f = activity;
        this.f145616g = daVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.g.f34926x366c91de, this);
        if (!this.f145613d) {
            this.f145614e.cancel();
        }
        this.f145615f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574443i75);
        kn.e0 e0Var = (kn.e0) m1Var;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(e0Var.f390922f);
            if (z07 == null) {
                z07 = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
            }
            z07.Y0(c01.z1.r(), e0Var.f390923g);
            c01.v1.M(z07);
            z17 = true;
        } else {
            z17 = false;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.da daVar = this.f145616g;
        if (daVar != null) {
            int i19 = e0Var.f390924h;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60 activityC10351x9a4a4f60 = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60) daVar;
            if (z17) {
                db5.e1.V(activityC10351x9a4a4f60, activityC10351x9a4a4f60.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i76), 0, null);
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p648x55baa833.ui.i8(activityC10351x9a4a4f60, z17, i19), 200L);
            } else {
                db5.e1.t(activityC10351x9a4a4f60, activityC10351x9a4a4f60.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574443i75), "", null);
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p648x55baa833.ui.j8(activityC10351x9a4a4f60, z17), 200L);
            }
        }
    }
}
