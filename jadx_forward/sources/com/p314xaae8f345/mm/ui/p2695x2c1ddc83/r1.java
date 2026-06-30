package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class r1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s1 f289563d;

    public r1(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s1 s1Var) {
        this.f289563d = s1Var;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s1 s1Var = this.f289563d;
        return s1Var.f289591f.f38859x6ac9171 || (progressDialog = s1Var.f289592g) == null || !progressDialog.isShowing();
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s1 s1Var = this.f289563d;
        s01.r.b(s1Var.f289590e, false, null);
        android.app.ProgressDialog progressDialog = s1Var.f289592g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
