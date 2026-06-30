package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public abstract class r extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 476;
    public static final java.lang.String NAME = "openADCanvas";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f78771g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask f78772h = null;

    public static void E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, mq0.z zVar, java.lang.String str) {
        if (jSONObject == null) {
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("adInfoXml", "");
            java.lang.String optString2 = jSONObject.optString("traceId", "");
            java.lang.String optString3 = jSONObject.optString("frameSetName", "");
            java.lang.String optString4 = jSONObject.optString("implType", "");
            java.lang.String optString5 = jSONObject.optString("bizName", "");
            java.lang.String optString6 = jSONObject.optString("bizScene", "");
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            if (c0Var == null) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("apiName", NAME);
            if (!android.text.TextUtils.isEmpty(optString)) {
                hashMap.put("uxinfo", optString);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                hashMap.put("errMsg", str);
            }
            ((mq0.i0) c0Var).Ai(zVar, optString5, optString6, optString2, optString3, optString4, mq0.b0.f330537e, hashMap);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r22, org.json.JSONObject r23, int r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.advertise.r.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public abstract void C(int i17);

    public abstract void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar);

    public abstract void F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.content.Intent intent, int i17);
}
