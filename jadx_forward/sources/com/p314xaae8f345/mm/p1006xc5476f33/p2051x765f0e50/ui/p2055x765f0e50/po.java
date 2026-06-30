package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class po implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f242986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 f242987e;

    public po(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617, de0.i iVar) {
        this.f242987e = activityC17477x76962617;
        this.f242986d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f242986d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = this.f242987e;
        d17.q(281, activityC17477x76962617.f242277m);
        gm0.j1.d().q(282, activityC17477x76962617.f242278n);
        activityC17477x76962617.f242277m = null;
        activityC17477x76962617.f242278n = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17477x76962617.f242279o;
        if (b4Var != null) {
            b4Var.d();
            activityC17477x76962617.f242279o = null;
        }
        android.app.ProgressDialog progressDialog = activityC17477x76962617.f242275h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
