package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class x2 extends com.tencent.mm.plugin.appbrand.jsapi.file.k3 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.k3, com.tencent.mm.plugin.appbrand.jsapi.file.n
    public com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("append", true);
            return super.b(lVar, str, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.UnitAppendFile", "call with path(%s), put append fail ex = %s", str, e17);
            return new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail ERR_OP_FAIL", new java.lang.Object[0]);
        }
    }
}
