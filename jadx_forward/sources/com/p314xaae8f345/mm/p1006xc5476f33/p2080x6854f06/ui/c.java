package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f243777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f243778e;

    public c(android.app.ProgressDialog progressDialog, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f243777d = progressDialog;
        this.f243778e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f243777d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f243778e.mo50305x3d8a09a2(0);
        }
    }
}
