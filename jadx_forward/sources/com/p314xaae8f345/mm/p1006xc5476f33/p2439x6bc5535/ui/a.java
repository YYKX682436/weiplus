package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.z0 f269524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 f269525e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5, iy4.z0 z0Var) {
        this.f269525e = activityC19503x99c967c5;
        this.f269524d = z0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f269524d);
        android.app.ProgressDialog progressDialog = this.f269525e.f269500m;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
