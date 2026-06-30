package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class v5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f243164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w5 f243165e;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w5 w5Var, de0.i iVar) {
        this.f243165e = w5Var;
        this.f243164d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f243164d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w5 w5Var = this.f243165e;
        d17.q(281, w5Var.f243219d);
        w5Var.f243219d = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = w5Var.f243220e;
        if (b4Var != null) {
            b4Var.d();
            w5Var.f243220e = null;
        }
        android.app.ProgressDialog progressDialog = w5Var.f243221f.f241801p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
