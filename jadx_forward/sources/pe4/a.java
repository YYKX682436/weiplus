package pe4;

/* loaded from: classes15.dex */
public enum a {
    IML;

    public pe4.o a(android.app.Activity activity, re4.c0 c0Var, re4.d0 d0Var, android.os.Handler handler) {
        if (c0Var == null || d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFactory", "hy: reqmodel or resp model is null");
            return null;
        }
        if ((c0Var.f476052a & 1) != 0 && wt5.a.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return new pe4.m(new java.lang.ref.WeakReference(activity), c0Var, d0Var, handler);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFactory", "hy: no matching: %d", java.lang.Byte.valueOf(c0Var.f476052a));
        return null;
    }
}
