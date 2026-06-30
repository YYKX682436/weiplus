package bc1;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getInvokeCost";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject jSONObject2;
        if (lVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.Cif invokeCostManager = lVar.getInvokeCostManager();
        if (invokeCostManager != null) {
            synchronized (invokeCostManager) {
                jSONObject2 = new org.json.JSONObject();
                for (java.util.Map.Entry entry : ((java.util.Map) ((jz5.n) invokeCostManager.f81316a).getValue()).entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    com.tencent.mm.plugin.appbrand.jsapi.gf gfVar = (com.tencent.mm.plugin.appbrand.jsapi.gf) entry.getValue();
                    long j17 = gfVar.f81263b / gfVar.f81262a;
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(gfVar.f81262a);
                    jSONArray.put(j17);
                    jSONObject2.put(str, jSONArray);
                }
            }
        } else {
            jSONObject2 = new org.json.JSONObject();
        }
        com.tencent.mm.plugin.appbrand.jsapi.Cif invokeCostManager2 = lVar.getInvokeCostManager();
        if (invokeCostManager2 != null) {
            synchronized (invokeCostManager2) {
                ((java.util.Map) ((jz5.n) invokeCostManager2.f81316a).getValue()).clear();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetInvokeCost", "invoke env:" + lVar + " data:" + jSONObject + " result:" + jSONObject2);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        lVar.a(i17, t("ok", hashMap));
    }
}
