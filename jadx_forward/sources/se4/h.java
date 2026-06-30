package se4;

/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f488458a;

    /* renamed from: b, reason: collision with root package name */
    public static int f488459b;

    /* renamed from: c, reason: collision with root package name */
    public static final au5.k f488460c = new se4.e();

    public static void a(boolean z17, boolean z18, re4.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterInitManager", "isNeedPrepareAsk: %b, isNeedSaveDeviceInfo: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            au5.j.f95693r = android.os.Process.myUid();
            au5.k kVar = f488460c;
            wt5.a.f531069b = kVar;
            au5.b bVar = wt5.a.f531070c;
            if (bVar == null) {
                zt5.h.b("Soter.SoterCore", "soter: setTrebleServiceListener IMPL is null, not support soter", new java.lang.Object[0]);
            } else {
                bVar.r(kVar);
            }
            km5.q qVar = (km5.q) ((km5.q) km5.u.f(java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18))).i(new se4.b()).i(new se4.k()).i(new se4.j()).i(new se4.l());
            qVar.s(new se4.g(zVar));
            qVar.a(new se4.f(currentTimeMillis, zVar));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SoterInitManager", e17, "exception when init soter: %s", e17.getMessage());
            re4.n.c(4, 1001, 1L);
            if (zVar != null) {
                zVar.h(-1, "system error");
            }
            b(-1, "system error");
        }
    }

    public static void b(int i17, java.lang.String str) {
        ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi();
        if (!gm0.j1.b().n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterInitManager", "hasLogin false, do not sendSoterInitializedEvent");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5809x884a9cc c5809x884a9cc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5809x884a9cc();
        am.dn dnVar = c5809x884a9cc.f136117g;
        dnVar.f88012a = i17;
        dnVar.f88013b = str;
        c5809x884a9cc.e();
    }
}
