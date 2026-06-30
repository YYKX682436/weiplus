package com.tencent.mm.plugin.biz;

@j95.b
/* loaded from: classes11.dex */
public class q extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static final long f93870d = com.tencent.mm.app.x.f53906a;

    public void Ai() {
        yq1.z zVar = (yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class));
        zVar.getClass();
        if (zVar.k().h(java.lang.String.valueOf("Biz_" + gm0.j1.b().j() + "_UserHasMigrateUnEncryptBizDb"))) {
            com.tencent.mars.xlog.Log.i("PluginBiz", "user has migrated db");
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.biz.p(this), "BrandServiceWorkerThread");
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        c01.d1.f37097d.a();
        Ai();
        if (qv.h.f366860a == null) {
            qv.h.f366860a = new java.util.HashSet();
            qv.h.f366861b.alive();
            i35.g gVar = (i35.g) gm0.j1.s(i35.g.class);
            ((java.util.ArrayList) ((aq1.n) gVar).f13070d).add(qv.h.f366862c);
        }
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
        yw.q3.f466437a.d();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        c01.d1 d1Var = c01.d1.f37097d;
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        if (c0Var != null) {
            c0Var.tc(c01.d1.f37103m);
        }
        qv.h.f366860a = null;
        qv.h.f366861b.dead();
        i35.e eVar = qv.h.f366862c;
        if (eVar != null) {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(eVar);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
    }

    public l75.k0 wi() {
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(c01.sa.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(c01.sa.class);
        }
        l75.k0 Q4 = ((c01.sa) a17).Q4();
        if (Q4 != null) {
            return Q4;
        }
        com.tencent.mars.xlog.Log.i("PluginBiz", "INewBizDataDB == null");
        return null;
    }
}
