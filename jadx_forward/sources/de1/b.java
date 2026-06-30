package de1;

/* loaded from: classes.dex */
public abstract class b {
    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, int i17, java.lang.String errMsg, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.util.Map map2 = de1.a.f310902a;
        jc1.d dVar = (jc1.d) de1.a.f310902a.get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            java.lang.String q17 = k0Var.q(errMsg, dVar, map);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "makeReturnJson(...)");
            return q17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCardErrnoMigration", "makeReturnJson, errCode: " + i17 + ", errMsg: " + errMsg + ", errInfo is null, falling back");
        if (r26.n0.N(errMsg)) {
            errMsg = "TransitCard internal error: " + i17;
        }
        if (errMsg == null) {
            errMsg = "fail:internal error";
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(map instanceof java.util.HashMap)) {
            map = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        }
        map.put("errno", 4);
        java.lang.String t17 = k0Var.t(errMsg, map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "makeReturnJson(...)");
        return t17;
    }
}
