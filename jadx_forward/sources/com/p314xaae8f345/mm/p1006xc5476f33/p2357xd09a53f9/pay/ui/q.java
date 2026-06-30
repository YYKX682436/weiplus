package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde f260332d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde) {
        this.f260332d = activityC19033x1e329dde;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19033x1e329dde activityC19033x1e329dde = this.f260332d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = activityC19033x1e329dde.f260213n;
        if (n8Var != null) {
            n8Var.cancel();
            activityC19033x1e329dde.setResult(0);
            activityC19033x1e329dde.finish();
        }
    }
}
