package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 f289311e;

    public j6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var, int i17) {
        this.f289311e = q5Var;
        this.f289310d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f289311e;
        android.app.ProgressDialog progressDialog = q5Var.f289541n;
        if (progressDialog != null) {
            progressDialog.setMessage(q5Var.f289542o.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572002vy) + this.f289310d + "%");
        }
    }
}
