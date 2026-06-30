package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 f226441d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var) {
        this.f226441d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var = this.f226441d;
        if (q2Var.K) {
            android.app.ProgressDialog progressDialog = q2Var.L;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            q2Var.H();
        }
        q2Var.K = false;
    }
}
