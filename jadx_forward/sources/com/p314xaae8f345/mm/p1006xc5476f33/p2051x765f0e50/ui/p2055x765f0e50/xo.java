package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class xo implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.w0 f243299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 f243300e;

    public xo(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617, com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var) {
        this.f243300e = activityC17477x76962617;
        this.f243299d = w0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        gm0.j1.d().d(this.f243299d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = this.f243300e;
        d17.q(255, activityC17477x76962617.f242281q);
        activityC17477x76962617.f242281q = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17477x76962617.f242279o;
        if (b4Var != null) {
            b4Var.d();
            activityC17477x76962617.f242279o = null;
        }
        android.app.ProgressDialog progressDialog = activityC17477x76962617.f242275h;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        activityC17477x76962617.a7(true);
        return false;
    }
}
