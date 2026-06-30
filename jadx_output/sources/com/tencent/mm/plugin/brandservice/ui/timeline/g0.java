package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.g0 f94131d = new com.tencent.mm.plugin.brandservice.ui.timeline.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.c1 a17;
        yq1.z zVar = (yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class));
        zVar.getClass();
        zVar.k().G(java.lang.String.valueOf("Biz_" + gm0.j1.b().j() + "_UserHasMigrateUnEncryptBizDb"), false);
        p75.n0 n0Var = dm.l1.Q;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f352676a;
        kotlin.jvm.internal.o.g(table, "table");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(c01.sa.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(c01.sa.class);
        }
        l75.k0 Q4 = ((c01.sa) a17).Q4();
        if (Q4 != null) {
            Q4.delete(table, null, null);
        }
        return jz5.f0.f302826a;
    }
}
