package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f f242948d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f) {
        this.f242948d = activityC17370xd188836f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.STORAGE;
        d85.f0 f0Var = d85.f0.M;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f = this.f242948d;
        if (((d85.d1) m0Var).Di(g0Var, f0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o0(activityC17370xd188836f))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ColorfulChatroomQRCodeUI", "business switch close ,return");
            return;
        }
        android.graphics.Bitmap V6 = activityC17370xd188836f.V6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        sb6.append(q75.c.d());
        sb6.append("mmqrcode");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n0(activityC17370xd188836f, V6);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g1(V6, sb7, activityC17370xd188836f, n0Var));
    }
}
