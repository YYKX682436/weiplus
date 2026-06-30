package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class z5 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.w0 f243346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b f243347e;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b, com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var) {
        this.f243347e = activityC17403xdaca9e1b;
        this.f243346d = w0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        gm0.j1.d().d(this.f243346d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b = this.f243347e;
        d17.q(255, activityC17403xdaca9e1b.f241803r);
        activityC17403xdaca9e1b.f241803r = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17403xdaca9e1b.f241802q;
        if (b4Var != null) {
            b4Var.d();
            activityC17403xdaca9e1b.f241802q = null;
        }
        android.app.ProgressDialog progressDialog = activityC17403xdaca9e1b.f241801p;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b.W6(activityC17403xdaca9e1b);
        return false;
    }
}
