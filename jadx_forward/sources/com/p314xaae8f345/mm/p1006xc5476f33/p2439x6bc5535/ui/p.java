package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class p implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.m1 f269588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91 f269589e;

    public p(com.p314xaae8f345.mm.p957x53236a1b.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91 activityC19504xce272b91) {
        this.f269588d = m1Var;
        this.f269589e = activityC19504xce272b91;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f269588d);
        android.app.ProgressDialog progressDialog = this.f269589e.f269518g;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
