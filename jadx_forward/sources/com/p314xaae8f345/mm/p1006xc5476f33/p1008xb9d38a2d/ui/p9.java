package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public final class p9 implements com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 f155644a;

    public p9(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1.AnonymousClass1 anonymousClass1) {
        this.f155644a = activityC11450xd4511c1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void b(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155644a;
        activityC11450xd4511c1.f154994e = activityC11450xd4511c1.f154993d.f290746a;
        if (activityC11450xd4511c1.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC11450xd4511c1, activityC11450xd4511c1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11450xd4511c1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, null);
        activityC11450xd4511c1.f154995f = Q;
        Q.setOnCancelListener(activityC11450xd4511c1.f154996g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "dkwt Ready to Facebook auth user[%s] token[%d][%s]", "facebook@wechat_auth", java.lang.Integer.valueOf(activityC11450xd4511c1.f154994e.length()), activityC11450xd4511c1.f154994e.substring(0, 4));
        activityC11450xd4511c1.f154997h = new com.p314xaae8f345.mm.p957x53236a1b.v0("facebook@wechat_auth", activityC11450xd4511c1.f154994e, 0, "", "", "", 0, "", true, false);
        gm0.j1.d().g(activityC11450xd4511c1.f154997h);
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void c(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h hVar) {
        hVar.getMessage();
        java.lang.String message = hVar.getMessage();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155644a;
        db5.e1.s(activityC11450xd4511c1, message, activityC11450xd4511c1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c88));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1.V6(activityC11450xd4511c1, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(activityC11450xd4511c1.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",2");
        n71.a.b(10645, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(582L, 8L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void d(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n nVar) {
        nVar.getMessage();
        java.lang.String message = nVar.getMessage();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155644a;
        db5.e1.s(activityC11450xd4511c1, message, activityC11450xd4511c1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c88));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1.V6(activityC11450xd4511c1, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(activityC11450xd4511c1.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",2");
        n71.a.b(10645, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(582L, 7L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    /* renamed from: onCancel */
    public void mo48702x3d6f0539() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155644a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1.V6(activityC11450xd4511c1, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(activityC11450xd4511c1.getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",2");
        n71.a.b(10645, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(582L, 9L, 1L, false);
    }
}
