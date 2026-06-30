package bc1;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "stopCollectInvokeCost";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopCollectInvokeCost", "env.invokeCostManager:" + lVar.getInvokeCostManager() + " invoke data:" + jSONObject + " stop");
        com.tencent.mm.plugin.appbrand.jsapi.Cif invokeCostManager = lVar.getInvokeCostManager();
        if (invokeCostManager != null) {
            synchronized (invokeCostManager) {
                com.tencent.mars.xlog.Log.i("Luggage.JsInvokeCostManager", invokeCostManager + " stop");
                invokeCostManager.f81317b = true;
            }
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
