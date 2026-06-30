package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class y8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1209;
    private static final java.lang.String NAME = "openCTID";

    /* renamed from: g, reason: collision with root package name */
    public static final int f83939g = cf.b.a(new com.tencent.mm.plugin.appbrand.jsapi.v8(null));

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        android.app.Activity r07;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
            if (t37 == null || (r07 = t37.r0()) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, activity is null");
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                d0Var.a(i17, u(str, jSONObject2));
                return;
            }
            if (jSONObject == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, data is null");
                java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str5 = str7 != null ? str7 : "";
                java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                d0Var.a(i17, u(str5, jSONObject3));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, data: " + jSONObject);
                com.tencent.mm.plugin.appbrand.jsapi.x8 x8Var = new com.tencent.mm.plugin.appbrand.jsapi.x8(this, jSONObject, d0Var, i17);
                java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                java.lang.String optString = z65.c.a() ? jSONObject.optString("miniProgramID") : null;
                if (optString == null) {
                    optString = d0Var.getAppId();
                }
                if (optString == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, miniProgramID is null");
                    str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str5 = str != null ? str : "";
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    try {
                        jSONObject4.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    d0Var.a(i17, u(str5, jSONObject4));
                } else {
                    java.lang.String str10 = (java.lang.String) x8Var.invoke("orgID");
                    if (str10 != null && (str2 = (java.lang.String) x8Var.invoke("businessID")) != null && (str3 = (java.lang.String) x8Var.invoke("bizSeq")) != null && (str4 = (java.lang.String) x8Var.invoke("type")) != null) {
                        java.lang.String str11 = (java.lang.String) x8Var.invoke("miniProgramPlatformID");
                        if (str11 != null) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
                            intent.setFlags(8388608);
                            intent.putExtra("orgID", str10);
                            intent.putExtra("appID", str2);
                            intent.putExtra("bizSeq", str3);
                            intent.putExtra("type", str4);
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            jSONObject5.put("miniProgramID", optString);
                            jSONObject5.put("miniProgramPlatformID", str11);
                            java.lang.String optString2 = jSONObject.optString("authToken");
                            if (optString2 == null) {
                                optString2 = "";
                            }
                            jSONObject5.put("authToken", optString2);
                            java.lang.String optString3 = jSONObject.optString("signature");
                            if (optString3 == null) {
                                optString3 = "";
                            }
                            jSONObject5.put("signature", optString3);
                            java.lang.String optString4 = jSONObject.optString("mode");
                            if (optString4 == null) {
                                optString4 = "";
                            }
                            jSONObject5.put("mode", optString4);
                            java.lang.String optString5 = jSONObject.optString("expectData");
                            jSONObject5.put("expectData", optString5 == null ? "" : optString5);
                            intent.putExtra("extras", jSONObject5.toString());
                            intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, com.tencent.mm.sdk.platformtools.x2.f193072b);
                            if (com.tencent.mm.sdk.platformtools.t8.I0(r07, intent, true, false)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, intent: " + intent.getExtras());
                                com.tencent.mm.plugin.appbrand.jsapi.w8 w8Var = new com.tencent.mm.plugin.appbrand.jsapi.w8(r07, d0Var, i17, this);
                                nf.g.a(r07).f336584c.add(w8Var);
                                try {
                                    int i18 = f83939g;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                    arrayList.add(java.lang.Integer.valueOf(i18));
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.k(r07, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiOpenCTID", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponentWithExtra;Lorg/json/JSONObject;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                                    return;
                                } catch (java.lang.Exception e27) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiOpenCTID", e27, "invoke, startActivityForResult fail", new java.lang.Object[0]);
                                    nf.g.a(r07).f336584c.remove(w8Var);
                                    d0Var.a(i17, C());
                                    return;
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenCTID", "invoke, intent not available");
                            d0Var.a(i17, C());
                        }
                    }
                }
            }
        }
    }

    public final java.lang.String C() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("resultCode", "C0412002"), new jz5.l("resultDesc", "国家网络身份认证App尚未安装"));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(k17 instanceof java.util.HashMap)) {
            k17 = new java.util.HashMap(k17);
        }
        k17.put("errno", 0);
        return t("ok", k17);
    }
}
