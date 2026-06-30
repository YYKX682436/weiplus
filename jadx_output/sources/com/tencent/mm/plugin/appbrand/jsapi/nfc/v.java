package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public abstract class v {
    public static final java.lang.String a(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17, java.lang.String errMsg, java.util.Map map) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        java.util.Map map2 = com.tencent.mm.plugin.appbrand.jsapi.nfc.u.f82436a;
        jc1.d dVar = (jc1.d) com.tencent.mm.plugin.appbrand.jsapi.nfc.u.f82436a.get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            java.lang.String q17 = k0Var.q(errMsg, dVar, map);
            kotlin.jvm.internal.o.f(q17, "makeReturnJson(...)");
            return q17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.NFCErrnoMigrationLogic", "makeReturnJson, errCode: " + i17 + ", errInfo is null");
        java.lang.String p17 = k0Var.p(errMsg, map);
        kotlin.jvm.internal.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
