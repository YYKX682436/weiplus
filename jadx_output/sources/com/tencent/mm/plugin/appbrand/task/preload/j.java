package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.task.preload.j f89132a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Map f89133b;

    static {
        f89133b = new java.util.HashMap();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_preload_miniprogram, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "clicfg_preload_miniprogram jsonStr error!");
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(Zi);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(jSONArray.optString(i17));
                int optInt = jSONObject.optInt(dm.i4.COL_ID);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("preloadRate");
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optJSONArray.optString(i18));
                    int optInt2 = jSONObject2.optInt("innerScene");
                    float optDouble = (float) jSONObject2.optDouble("low");
                    float optDouble2 = (float) jSONObject2.optDouble("middle");
                    float optDouble3 = (float) jSONObject2.optDouble("high");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put(0, java.lang.Float.valueOf(optDouble));
                    hashMap2.put(1, java.lang.Float.valueOf(optDouble2));
                    hashMap2.put(2, java.lang.Float.valueOf(optDouble3));
                    hashMap.put(java.lang.Integer.valueOf(optInt2), hashMap2);
                    linkedList.add(hashMap);
                }
                f89133b.put(java.lang.Integer.valueOf(optInt), linkedList);
            }
            f89133b.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "generateScenePredictMap json exception:%s", e17);
            f89133b.clear();
            f89133b = null;
        }
    }

    public java.util.Map a(int i17, int i18) {
        java.util.Map map = f89133b;
        if (map == null || ((java.util.HashMap) map).size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "getScenePredictRate map null!");
            return null;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) ((java.util.HashMap) f89133b).get(java.lang.Integer.valueOf(i17));
        if (linkedList.size() > 0) {
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                java.util.Map map2 = (java.util.Map) linkedList.get(i19);
                if (map2.containsKey(java.lang.Integer.valueOf(i18))) {
                    return (java.util.Map) map2.get(java.lang.Integer.valueOf(i18));
                }
            }
        }
        return null;
    }
}
