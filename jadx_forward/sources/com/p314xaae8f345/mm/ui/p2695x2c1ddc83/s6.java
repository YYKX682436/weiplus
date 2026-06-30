package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289599d;

    public s6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d) {
        this.f289599d = c22376x88ed722d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar = this.f289599d.f288913w;
        if (!qVar.f289523t) {
            qVar.f289523t = true;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.a(qVar, android.os.Looper.getMainLooper());
            c01.d9.b().p().a(qVar);
            qVar.h();
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289599d.f288914x;
        if (o5Var.F) {
            return;
        }
        o5Var.F = true;
        c01.d9.b().p().a(o5Var);
        o5Var.A(true);
        if (o5Var.s()) {
            java.util.Collection n17 = o5Var.n();
            long j17 = o5Var.f289470t;
            long j18 = 100 * 1.0f;
            if (j17 <= 0) {
                return;
            }
            java.lang.String r17 = c01.z1.r();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getLong("top_session_info_report", 0L) > j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20052x5ccc6a01()) * 1000) {
                ((ku5.t0) ku5.t0.f394148d).g(new bg5.j(n17, j17, j18, currentTimeMillis, r17));
            }
        }
    }
}
