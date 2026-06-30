package com.p314xaae8f345.mm.p1006xc5476f33.biz;

@j95.b
/* loaded from: classes11.dex */
public class q extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static final long f175403d = com.p314xaae8f345.mm.app.x.f135439a;

    public void Ai() {
        yq1.z zVar = (yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class));
        zVar.getClass();
        if (zVar.k().h(java.lang.String.valueOf("Biz_" + gm0.j1.b().j() + "_UserHasMigrateUnEncryptBizDb"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginBiz", "user has migrated db");
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.biz.p(this), "BrandServiceWorkerThread");
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        c01.d1.f118630d.a();
        Ai();
        if (qv.h.f448393a == null) {
            qv.h.f448393a = new java.util.HashSet();
            qv.h.f448394b.mo48813x58998cd();
            i35.g gVar = (i35.g) gm0.j1.s(i35.g.class);
            ((java.util.ArrayList) ((aq1.n) gVar).f94603d).add(qv.h.f448395c);
        }
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
        yw.q3.f547970a.d();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        c01.d1 d1Var = c01.d1.f118630d;
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        if (c0Var != null) {
            c0Var.tc(c01.d1.f118636m);
        }
        qv.h.f448393a = null;
        qv.h.f448394b.mo48814x2efc64();
        i35.e eVar = qv.h.f448395c;
        if (eVar != null) {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(eVar);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
    }

    public l75.k0 wi() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(c01.sa.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(c01.sa.class);
        }
        l75.k0 Q4 = ((c01.sa) a17).Q4();
        if (Q4 != null) {
            return Q4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginBiz", "INewBizDataDB == null");
        return null;
    }
}
