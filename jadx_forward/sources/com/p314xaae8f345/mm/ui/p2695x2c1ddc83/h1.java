package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class h1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289246e;

    public h1(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.app.ProgressDialog progressDialog) {
        this.f289245d = c19762x487075a;
        this.f289246e = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f289245d.f38859x6ac9171;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f289246e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
