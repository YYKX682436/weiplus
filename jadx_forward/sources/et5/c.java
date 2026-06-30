package et5;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f338205a;

    static {
        new et5.b(null);
        try {
            boolean a17 = gm0.j1.a();
            if (a17 && f338205a == null) {
                f338205a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(c01.z1.r() + "_scan_cost_mmkv");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCostManager", "initMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f338205a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCostManager", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }
}
