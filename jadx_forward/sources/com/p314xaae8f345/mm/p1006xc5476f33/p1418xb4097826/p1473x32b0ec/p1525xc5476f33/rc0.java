package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rc0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f195658d;

    public rc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var) {
        this.f195658d = nd0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f195658d;
        if (i17 == nd0Var.L) {
            nd0Var.I1(8);
            nd0Var.u1();
        } else if (i17 == nd0Var.K) {
            boolean C1 = nd0Var.C1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "has been look for one min ,isFollow" + C1);
            nd0Var.G1(C1, "#3", java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        } else if (i17 == nd0Var.M) {
            java.lang.Long valueOf = java.lang.Long.valueOf(((mm2.e1) nd0Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            if (!(valueOf.longValue() != 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                dk2.Cif.f315159a.a(nd0Var.f195148p, valueOf.longValue(), dk2.hf.f315123h, true);
            }
        }
        return true;
    }
}
