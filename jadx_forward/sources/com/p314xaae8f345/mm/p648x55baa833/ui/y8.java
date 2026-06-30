package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class y8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f146219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.z8 f146220e;

    public y8(com.p314xaae8f345.mm.p648x55baa833.ui.z8 z8Var, android.app.ProgressDialog progressDialog) {
        this.f146220e = z8Var;
        this.f146219d = progressDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ProgressDialog progressDialog = this.f146219d;
        progressDialog.show();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e = this.f146220e.f146255a;
        activityC10357xc0cc360e.f145386q = false;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e.V6(activityC10357xc0cc360e, progressDialog);
    }
}
