package ae1;

/* loaded from: classes7.dex */
public abstract class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        if (yVar == null) {
            return;
        }
        if (jSONObject != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new ae1.f(this, yVar, jSONObject, i17), "SmCryptoInvoker");
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, u(str, jSONObject2));
    }

    public abstract ae1.v1 C();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public java.nio.ByteBuffer y(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.v vVar, int i17) {
        java.nio.ByteBuffer j07 = vVar.j0(i17, false);
        return j07 == null ? java.nio.ByteBuffer.allocate(0) : j07;
    }
}
