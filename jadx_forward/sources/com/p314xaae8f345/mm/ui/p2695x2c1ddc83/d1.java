package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class d1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f289157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f289158e;

    public d1(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, android.app.ProgressDialog progressDialog) {
        this.f289157d = c19762x487075a;
        this.f289158e = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f289157d;
        return (c19762x487075a != null && c19762x487075a.f38859x6ac9171) || !((progressDialog = this.f289158e) == null || progressDialog.isShowing());
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f289158e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
