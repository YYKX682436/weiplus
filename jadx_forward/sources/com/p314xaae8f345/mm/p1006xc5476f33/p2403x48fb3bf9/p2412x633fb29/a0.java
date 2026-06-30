package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes9.dex */
public abstract class a0 {
    public static boolean a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z zVar) {
        if (c5303xc75d2f73 == null || zVar == null || !(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f264743a))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or wrapper is invalid");
            if (c5303xc75d2f73 == null) {
                return false;
            }
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        if (zVar.f264750h) {
            jq0Var.i(zVar.f264748f);
        }
        gp0Var.K0(zVar.f264743a);
        gp0Var.O0(zVar.f264744b);
        gp0Var.m0(zVar.f264745c);
        gp0Var.o0(zVar.f264746d);
        gp0Var.H0(zVar.f264751i);
        gp0Var.x0(true);
        gp0Var.z0(true);
        gp0Var.h0(5);
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.o(zVar.f264746d);
        tq0Var.p(zVar.f264744b);
        tq0Var.j(zVar.f264745c);
        if (zVar.f264750h) {
            tq0Var.f468215y = zVar.f264749g;
            tq0Var.f468216z = true;
        }
        bq0Var.r(tq0Var);
        bq0Var.k(zVar.f264752j);
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(3);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.b(zVar.f264747e);
        jq0Var.f(zVar.f264743a);
        java.lang.String str = gp0Var.f456937d;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = str;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 5;
        bq0Var.o(jq0Var);
        bq0Var.f452497f.add(gp0Var);
        return true;
    }
}
