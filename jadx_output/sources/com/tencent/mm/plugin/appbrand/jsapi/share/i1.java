package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class i1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 957;
    private static final java.lang.String NAME = "shareVideoMessage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.vfs.r6 absoluteFile;
        com.tencent.mm.vfs.r6 absoluteFile2;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, env is null");
            return;
        }
        android.content.Context f147807d = yVar.getF147807d();
        android.app.Activity activity = f147807d instanceof android.app.Activity ? (android.app.Activity) f147807d : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, activity is null");
            yVar.a(i17, o("fail:activity is null"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, data is null");
            yVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("videoPath");
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath is empty");
            yVar.a(i17, o("fail:videoPath is empty"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath: " + optString);
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = yVar.getFileSystem();
        java.lang.String o17 = (fileSystem == null || (absoluteFile2 = fileSystem.getAbsoluteFile(optString)) == null) ? null : absoluteFile2.o();
        if (o17 == null || o17.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath is illegal");
            yVar.a(i17, o("fail:videoPath is illegal"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, realVideoPath: " + o17);
        java.lang.String optString2 = jSONObject.optString("thumbPath");
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem2 = yVar.getFileSystem();
        java.lang.String o18 = (fileSystem2 == null || (absoluteFile = fileSystem2.getAbsoluteFile(optString2)) == null) ? null : absoluteFile.o();
        j91.d dVar = (j91.d) yVar.getRuntime().K1(j91.d.class);
        str = "";
        java.lang.String optString3 = jSONObject.optString("chatToolMode", "");
        boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
        if (dVar != null) {
            kotlin.jvm.internal.o.d(optString3);
            if (!j91.c.a(optString3)) {
                java.lang.String d17 = optBoolean ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).d() : "";
                str = optBoolean ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).c() : "";
                str2 = d17;
            } else {
                if (kotlin.jvm.internal.o.b(optString3, "allPage") && !((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).o(jSONObject)) {
                    java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str = str3 != null ? str3 : "";
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 101);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    yVar.a(i17, u(str, jSONObject2));
                    return;
                }
                com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                optBoolean = true;
                str2 = tVar.d();
                str = tVar.c();
            }
        } else {
            str2 = "";
        }
        boolean optBoolean2 = jSONObject.optBoolean("needShowEntrance", false);
        java.lang.String optString4 = jSONObject.optString("entrancePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, thumbPath: " + optString2 + ", realThumbPath: " + o18 + " needEntrance: " + optBoolean2 + " entrancePath: " + optString4 + " useForChatTool:" + optBoolean + " chatToolRoom:" + str);
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareVideoToConversationRequest shareVideoToConversationRequest = new com.tencent.mm.plugin.appbrand.jsapi.share.ShareVideoToConversationRequest(o17, o18, new com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams(optBoolean2, yVar.getAppId(), optString4, 1, cf.c.a(yVar).f77280f, cf.c.a(yVar).f77279e, optBoolean, str2, str, cf.c.a(yVar).f77281g));
        com.tencent.mm.plugin.appbrand.jsapi.share.h1 h1Var = new com.tencent.mm.plugin.appbrand.jsapi.share.h1(yVar, activity, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(activity, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, shareVideoToConversationRequest, h1Var, null);
    }
}
