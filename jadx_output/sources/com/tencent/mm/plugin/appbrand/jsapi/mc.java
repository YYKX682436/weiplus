package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class mc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1536;
    public static final java.lang.String NAME = "resolveExternalFileRefs";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        jc1.d dVar;
        jc1.d dVar2;
        java.lang.String str4;
        org.json.JSONArray optJSONArray;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "env is null");
            return;
        }
        str = "";
        java.util.ArrayList<java.lang.String> arrayList = null;
        if (e9Var.getFileSystem() == null) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "fileSystem is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var.getRuntime();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = runtime != null ? runtime.u0() : null;
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = u07 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU ? (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07 : null;
        if (appBrandInitConfigLU == null) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "initConfig is null");
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str, jSONObject3));
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = appBrandInitConfigLU.D;
        if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer != null ? appBrandLaunchReferrer.f77335t : null)) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "externalFileRefs is empty");
            str2 = android.text.TextUtils.isEmpty("fail:externalFileRefs empty") ? "fail:internal error" : "fail:externalFileRefs empty";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str2, jSONObject4));
            return;
        }
        try {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject(appBrandInitConfigLU.D.f77335t);
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("fileRefKeys")) != null) {
                arrayList = new java.util.ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    java.lang.Object obj = optJSONArray.get(i18);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    arrayList.add((java.lang.String) obj);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "fileRefKeys is empty");
                java.lang.String str8 = android.text.TextUtils.isEmpty("fail:fileRefKeys empty") ? "fail:jsapi invalid request data" : "fail:fileRefKeys empty";
                java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                try {
                    jSONObject6.put("errno", 101);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                e9Var.a(i17, u(str8, jSONObject6));
                return;
            }
            com.tencent.mars.xlog.Log.i("Luggage.JsApiResolveExternalFileRefs", "resolveExternalFileRefs, fileRefKeys:" + arrayList + ", externalFileRefs:" + jSONObject5);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.o.d(arrayList);
            for (java.lang.String str10 : arrayList) {
                org.json.JSONObject optJSONObject = jSONObject5.optJSONObject(str10);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    java.lang.String optString2 = optJSONObject.optString("type");
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(optString);
                    java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(optString2);
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = str;
                    }
                    ik1.b0 b0Var = new ik1.b0();
                    str3 = str;
                    com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = e9Var.getFileSystem();
                    kotlin.jvm.internal.o.d(fileSystem);
                    com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = fileSystem.createTempFileFrom(r6Var, extensionFromMimeType, false, b0Var);
                    kotlin.jvm.internal.o.f(createTempFileFrom, "createTempFileFrom(...)");
                    if (createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                        java.lang.Object value = b0Var.f291824a;
                        kotlin.jvm.internal.o.f(value, "value");
                        str4 = (java.lang.String) value;
                        dVar2 = jc1.f.f298912a;
                        linkedHashMap.put(str10, kz5.c1.j(new jz5.l(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str4), new jz5.l("errno", java.lang.Integer.valueOf(dVar2.f298903a)), new jz5.l("errMsg", dVar2.f298904b)));
                        str = str3;
                    } else {
                        com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "createTempFile failed, fileOpResult:" + createTempFileFrom + ", fileRefKey:" + str10 + ", fileRef:" + optJSONObject);
                        dVar = !r6Var.m() ? jc1.e.f298905a : !r6Var.h() ? jc1.e.f298910f : jc1.e.f298906b;
                    }
                } else {
                    str3 = str;
                    dVar = new jc1.d(1300022, "fail:fileRefKey not found");
                }
                dVar2 = dVar;
                str4 = str3;
                linkedHashMap.put(str10, kz5.c1.j(new jz5.l(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str4), new jz5.l("errno", java.lang.Integer.valueOf(dVar2.f298903a)), new jz5.l("errMsg", dVar2.f298904b)));
                str = str3;
            }
            java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
            linkedHashMap.put("errno", 0);
            e9Var.a(i17, t("ok", linkedHashMap));
        } catch (java.lang.Exception e28) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiResolveExternalFileRefs", "externalFileRefs is invalid, " + e28.getMessage());
            str2 = android.text.TextUtils.isEmpty("fail:externalFileRefs invalid") ? "fail:internal error" : "fail:externalFileRefs invalid";
            java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            try {
                jSONObject7.put("errno", 4);
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
            }
            e9Var.a(i17, u(str2, jSONObject7));
        }
    }
}
