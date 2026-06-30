package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 f243251d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var) {
        this.f243251d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, d85.f0.M, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w(this.f243251d))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "business switch close ,return");
            return;
        }
        android.graphics.Bitmap Q6 = this.f243251d.Q6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var = this.f243251d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        sb6.append(q75.c.d());
        sb6.append("mmqrcode");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v(this.f243251d, Q6);
        i0Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f0(Q6, sb7, i0Var, vVar));
    }
}
