package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.g0 f175664d = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        yq1.z zVar = (yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class));
        zVar.getClass();
        zVar.k().G(java.lang.String.valueOf("Biz_" + gm0.j1.b().j() + "_UserHasMigrateUnEncryptBizDb"), false);
        p75.n0 n0Var = dm.l1.Q;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(c01.sa.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(c01.sa.class);
        }
        l75.k0 Q4 = ((c01.sa) a17).Q4();
        if (Q4 != null) {
            Q4.mo70514xb06685ab(table, null, null);
        }
        return jz5.f0.f384359a;
    }
}
