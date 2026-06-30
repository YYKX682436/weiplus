package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class m8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 925;
    public static final java.lang.String NAME = "requestOfflineUserBindQuery";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOfflineUserBindQuery", "invoke JsApiOfflineUserBindQuery! data is ：%s", jSONObject.toString());
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOfflineUserBindQuery", "fail:component is null");
        } else {
            if (yVar.getF147807d() != null) {
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = yVar.t3().u0();
                java.lang.String str = u07.f77278d;
                java.lang.String str2 = u07.f77279e;
                java.lang.String currentUrl = yVar.t3().x0().getCurrentUrl();
                java.lang.String optString = jSONObject.optString("nonceStr");
                java.lang.String optString2 = jSONObject.optString("timeStamp");
                java.lang.String optString3 = jSONObject.optString("paySign");
                java.lang.String optString4 = jSONObject.optString("signType");
                java.lang.String optString5 = jSONObject.optString("package");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", str);
                bundle.putString("appName", str2);
                bundle.putString("appPath", currentUrl);
                bundle.putString("nonceStr", optString);
                bundle.putString("timeStamp", optString2);
                bundle.putString("paySign", optString3);
                bundle.putString("signType", optString4);
                bundle.putString("packageInfo", optString5);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.jsapi.l8.class, new com.tencent.mm.plugin.appbrand.jsapi.j8(this, yVar, i17));
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOfflineUserBindQuery", "fail:context is null");
            yVar.a(i17, o("fail:context is null"));
        }
    }
}
