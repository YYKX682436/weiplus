package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc;

/* loaded from: classes7.dex */
public abstract class v {
    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, int i17, java.lang.String errMsg, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.util.Map map2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.u.f163969a;
        jc1.d dVar = (jc1.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.u.f163969a.get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            java.lang.String q17 = k0Var.q(errMsg, dVar, map);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "makeReturnJson(...)");
            return q17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.NFCErrnoMigrationLogic", "makeReturnJson, errCode: " + i17 + ", errInfo is null");
        java.lang.String p17 = k0Var.p(errMsg, map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
