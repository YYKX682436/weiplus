package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1584;
    private static final java.lang.String NAME = "dispatchLiteAppAction";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDispatchLiteAppAction", "invoke dispatchLiteAppAction");
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDispatchLiteAppAction", "data is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str3, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) ((com.tencent.mm.plugin.appbrand.y) lVar).getRuntime().u0()).D;
        if (appBrandLaunchReferrer != null && (str = appBrandLaunchReferrer.f77327i) != null && str.startsWith("liteapp://")) {
            try {
                jSONObject.put("sourceAppId", appBrandLaunchReferrer.f77327i.substring(10));
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDispatchLiteAppAction", "json exception %s", e18.toString());
                str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str3 = str2 != null ? str2 : "";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                lVar.a(i17, u(str3, jSONObject3));
                return;
            }
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), com.tencent.mm.plugin.appbrand.jsapi.liteapp.f.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.liteapp.d$$a
            /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
            @Override // com.tencent.mm.ipcinvoker.r
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.liteapp.d$$a.a(java.lang.Object):void");
            }
        });
    }
}
