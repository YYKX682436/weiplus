package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q0 f239832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q0 f239833e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q0 q0Var, r45.q0 q0Var2) {
        this.f239833e = q0Var;
        this.f239832d = q0Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.q0 q0Var = this.f239832d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.q0 q0Var2 = this.f239833e;
        try {
            q0Var2.f239837d.f239716p = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CLOG_SAMPLING_REFRESH_TIME_LONG, java.lang.Long.valueOf(q0Var2.f239837d.f239716p));
            c17.i(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = q0Var2.f239837d;
            int i17 = g0Var.f239714n;
            int i18 = q0Var.f465059d;
            if (i17 == i18 && g0Var.f239715o == q0Var.f465062g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "Version not changed, use previous settings (%d / %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(q0Var.f465062g));
            } else {
                com.p314xaae8f345.mm.vfs.w6.R(com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFileStreamPath("clog-settings")).u(), q0Var.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.s(q0Var2.f239837d);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.cLog", e17, "Failed to parse response.", new java.lang.Object[0]);
        }
    }
}
