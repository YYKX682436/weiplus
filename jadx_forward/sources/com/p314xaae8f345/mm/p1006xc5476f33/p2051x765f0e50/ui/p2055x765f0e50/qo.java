package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class qo implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 f243019d;

    public qo(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617) {
        this.f243019d = activityC17477x76962617;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = this.f243019d;
        d17.q(281, activityC17477x76962617.f242277m);
        gm0.j1.d().q(282, activityC17477x76962617.f242278n);
        activityC17477x76962617.f242277m = null;
        activityC17477x76962617.f242278n = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17477x76962617.f242280p;
        if (b4Var != null) {
            b4Var.d();
        }
        android.app.ProgressDialog progressDialog = activityC17477x76962617.f242275h;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        activityC17477x76962617.l7();
        return false;
    }
}
