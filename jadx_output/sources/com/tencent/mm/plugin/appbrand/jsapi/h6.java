package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class h6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 916;
    public static final java.lang.String NAME = "getRandomValues";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("length", -1) : -1;
        if (optInt <= 0) {
            lVar.a(i17, o("fail: illegal length"));
            return;
        }
        byte[] bArr = new byte[optInt];
        new java.security.SecureRandom().nextBytes(bArr);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.nio.ByteBuffer e17 = com.tencent.mm.plugin.appbrand.utils.v3.e(bArr);
        kotlin.jvm.internal.o.f(e17, "wrapDirectByteBuffer(...)");
        linkedHashMap.put("randomValues", e17);
        if (com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT != com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getJsRuntime(), linkedHashMap, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class))) {
            lVar.a(i17, p("ok", linkedHashMap));
        } else {
            lVar.a(i17, o("fail: internal error"));
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetRandomValues", "invoke, convert NativeBuffer fail");
        }
    }
}
