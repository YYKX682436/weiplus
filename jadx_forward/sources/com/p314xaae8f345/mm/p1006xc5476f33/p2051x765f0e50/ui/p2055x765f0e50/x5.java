package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f243258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f243259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f243260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y5 f243261g;

    public x5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y5 y5Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f243261g = y5Var;
        this.f243258d = m1Var;
        this.f243259e = i17;
        this.f243260f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y5 y5Var = this.f243261g;
        d17.q(255, y5Var.f243309d.f241803r);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b activityC17403xdaca9e1b = y5Var.f243309d;
        activityC17403xdaca9e1b.f241803r = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17403xdaca9e1b.f241802q;
        if (b4Var != null) {
            b4Var.d();
            y5Var.f243309d.f241802q = null;
        }
        android.app.ProgressDialog progressDialog = y5Var.f243309d.f241801p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f243258d;
        if (m1Var.mo808xfb85f7b0() == 255 && ((com.p314xaae8f345.mm.p957x53236a1b.w0) m1Var).f152977f == 1) {
            if (this.f243259e != -3 || this.f243260f != 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17403xdaca9e1b.W6(y5Var.f243309d);
                return;
            }
            android.content.Intent intent = new android.content.Intent(y5Var.f243309d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
            intent.putExtra("kintent_hint", y5Var.f243309d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hx9));
            y5Var.f243309d.startActivityForResult(intent, 0);
        }
    }
}
