package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class v0 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w0 f289712d;

    public v0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w0 w0Var) {
        this.f289712d = w0Var;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w0 w0Var = this.f289712d;
        return w0Var.f289738e.f38859x6ac9171 || (progressDialog = w0Var.f289739f) == null || !progressDialog.isShowing();
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w0 w0Var = this.f289712d;
        s01.r.b(w0Var.f289740g, false, null);
        android.app.ProgressDialog progressDialog = w0Var.f289739f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
