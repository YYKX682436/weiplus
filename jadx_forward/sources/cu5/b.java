package cu5;

/* loaded from: classes15.dex */
public abstract class b {
    public static void a() {
        android.util.SparseArray a17 = fu5.d.b().a();
        int size = a17.size();
        for (int i17 = 0; i17 < size; i17++) {
            wt5.a.s((java.lang.String) a17.valueAt(i17), false);
        }
        wt5.a.r();
    }

    public static void b() {
        if (!fu5.d.b().d() || wt5.a.q()) {
            return;
        }
        au5.b bVar = wt5.a.f531070c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: triggerConnecting IMPL is null, not support soter", new java.lang.Object[0]);
        } else {
            bVar.s();
        }
    }

    public static boolean c() {
        return fu5.d.b().d() && fu5.d.b().e();
    }

    public static void d(eu5.b bVar, boolean z17, iu5.e eVar) {
        zt5.h.c("Soter.SoterWrapperApi", "soter: starting prepare ask key. ", new java.lang.Object[0]);
        ju5.q0 q0Var = new ju5.q0(eVar, z17);
        q0Var.f383621a = bVar;
        if (ju5.n.c().a(q0Var, new eu5.c())) {
            return;
        }
        zt5.h.a("Soter.SoterWrapperApi", "soter: add prepareAppSecureKey task failed.", new java.lang.Object[0]);
    }

    public static void e(eu5.b bVar, boolean z17, boolean z18, int i17, iu5.e eVar, iu5.e eVar2) {
        zt5.h.c("Soter.SoterWrapperApi", "soter: starting prepare auth key: %d", java.lang.Integer.valueOf(i17));
        ju5.u0 u0Var = new ju5.u0(i17, eVar, eVar2, z17, z18);
        u0Var.f383621a = bVar;
        if (ju5.n.c().a(u0Var, new eu5.c())) {
            return;
        }
        zt5.h.a("Soter.SoterWrapperApi", "soter: add prepareAuthKey task failed.", new java.lang.Object[0]);
    }

    public static boolean f(int i17) {
        boolean d17 = fu5.d.b().d();
        java.lang.String str = (java.lang.String) fu5.d.b().a().get(i17);
        if (d17 && !zt5.l.b(str)) {
            return wt5.a.s(str, false).f557138a == 0;
        }
        if (d17) {
            zt5.h.f("Soter.SoterWrapperApi", "soter: scene not registered in init. please make sure", new java.lang.Object[0]);
            return false;
        }
        zt5.h.f("Soter.SoterWrapperApi", "soter: not initialized yet", new java.lang.Object[0]);
        return false;
    }

    public static void g(eu5.b bVar, ju5.c cVar) {
        zt5.h.c("Soter.SoterWrapperApi", "soter: request authorize provide challenge. scene: %d", java.lang.Integer.valueOf(cVar.f383599a));
        int i17 = cVar.f383602d;
        if (i17 == 1 || i17 == 2) {
            ju5.k0 k0Var = new ju5.k0(cVar);
            k0Var.f383621a = bVar;
            if (ju5.n.c().a(k0Var, new eu5.a())) {
                return;
            }
            zt5.h.a("Soter.SoterWrapperApi", "soter: add 2.0 requestAuthorizeAndSign task failed.", new java.lang.Object[0]);
            return;
        }
        ju5.z zVar = new ju5.z(cVar);
        zVar.f383621a = bVar;
        if (ju5.n.c().a(zVar, new eu5.a())) {
            return;
        }
        zt5.h.a("Soter.SoterWrapperApi", "soter: add 1.0 requestAuthorizeAndSign task failed.", new java.lang.Object[0]);
    }
}
