package com.tencent.mm.feature.lite;

/* loaded from: classes5.dex */
public class x implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f67282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f67283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f67284c;

    public x(com.tencent.mm.feature.lite.i iVar, org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2, com.tencent.mm.plugin.lite.s sVar) {
        this.f67282a = jSONArray;
        this.f67283b = jSONArray2;
        this.f67284c = sVar;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        org.json.JSONArray jSONArray = this.f67283b;
        org.json.JSONArray jSONArray2 = this.f67282a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            int length = jSONArray2.length();
            for (int i17 = 0; i17 < length; i17++) {
                if (str.equals(jSONArray2.optString(i17))) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        optJSONObject.put("state", "fail");
                    } else {
                        optJSONObject.put("state", ya.b.SUCCESS);
                        optJSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, com.tencent.mm.vfs.w6.i(str2, false));
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("preloadImages", jSONArray);
                    this.f67284c.d(hashMap);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppFeatureService", e17, "", new java.lang.Object[0]);
        }
    }
}
