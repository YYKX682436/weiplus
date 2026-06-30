package bb1;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1180;
    public static final java.lang.String NAME = "getInferenceEnvInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.wexnet.WeXNet.INSTANCE.a();
            hashMap.put("ver", com.tencent.mm.wexnet.WeXNet.access$getXNetRuntimeVer());
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i17, t("ok", hashMap));
        } catch (com.tencent.mm.wexnet.w unused) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:environment not ready" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 2004010);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
        }
    }
}
