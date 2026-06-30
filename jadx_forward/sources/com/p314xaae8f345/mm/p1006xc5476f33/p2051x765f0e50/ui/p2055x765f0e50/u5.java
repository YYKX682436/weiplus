package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class u5 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f243130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w5 f243131e;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w5 w5Var, de0.i iVar) {
        this.f243131e = w5Var;
        this.f243130d = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f243130d);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w5 w5Var = this.f243131e;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b.V6(w5Var.f243221f);
        return false;
    }
}
