package gi;

/* renamed from: gi.p$$d */
/* loaded from: classes12.dex */
public final /* synthetic */ class C28361x337574 implements wh.t0 {
    @Override // wh.t0
    /* renamed from: accept */
    public final void mo40853xab27b508(java.lang.Object obj) {
        rh.h2 h2Var = (rh.h2) obj;
        h2Var.getClass();
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper() || android.os.Looper.myLooper() == h2Var.f476827a.f444870f.getLooper()) {
            throw new java.lang.IllegalStateException("'#configureMonitorConsuming' should work within worker thread except matrix thread!");
        }
        if (h2Var.f476941b > 0) {
            oj.j.c("Matrix.battery.InternalMonitorFeature", "#configureMonitorConsuming, tid = " + h2Var.f476941b, new java.lang.Object[0]);
            int i17 = h2Var.f476941b;
            rh.g2 g2Var = new rh.g2();
            g2Var.f476907d = i17;
            g2Var.f476911h = wh.m.d(h2Var.f476827a.d(), h2Var.f476827a.f444876o);
            g2Var.f476912i = wh.m.r(h2Var.f476827a.d());
            try {
                java.util.concurrent.Callable callable = h2Var.f476827a.f444868d.f444817c;
                g2Var.f476913j = callable == null ? "" : (java.lang.String) callable.call();
            } catch (java.lang.Exception unused) {
                g2Var.f476913j = "";
            }
            wh.t1 e17 = wh.u1.e(android.os.Process.myPid(), i17);
            if (e17 == null) {
                g2Var = null;
            } else {
                g2Var.f476910g = rh.x2.b(java.lang.Long.valueOf(e17.a()));
                g2Var.f476908e = e17.f527406a;
            }
            if (g2Var != null) {
                rh.f fVar = h2Var.f476942c;
                if (fVar != null) {
                    h2Var.f476827a.f444868d.f444816b.f(new rh.e(g2Var, fVar, g2Var));
                }
                h2Var.f476942c = g2Var;
            }
        }
    }
}
