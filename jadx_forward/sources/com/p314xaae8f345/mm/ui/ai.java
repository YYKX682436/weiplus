package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class ai implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f278670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f278671e;

    public ai(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2, android.app.ProgressDialog progressDialog) {
        this.f278671e = activityC21437xf483c2;
        this.f278670d = progressDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f278671e;
        g0Var.d(14553, 6, 3, activityC21437xf483c2.f278610n);
        android.app.ProgressDialog progressDialog = this.f278670d;
        progressDialog.show();
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.f278602x = false;
        activityC21437xf483c2.X6(progressDialog);
    }
}
