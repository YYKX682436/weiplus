package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class a9 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f145567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e f145568e;

    public a9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10357xc0cc360e activityC10357xc0cc360e, android.app.ProgressDialog progressDialog) {
        this.f145568e = activityC10357xc0cc360e;
        this.f145567d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f145568e.f145386q;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f145567d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
