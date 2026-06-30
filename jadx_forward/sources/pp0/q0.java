package pp0;

/* loaded from: classes5.dex */
public interface q0 extends i95.m {
    static void od(pp0.q0 q0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseSdk");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        ((yy0.k8) q0Var).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManagerFeatureServiceImpl", "releaseSdk() called");
        az0.i5 i5Var = az0.i5.f97090a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "release - start release");
        p3325xe03a0797.p3326xc267989b.l.d(i5Var.r(), null, null, new az0.r4(true, z17, null), 3, null);
    }
}
