package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class zc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1129;
    private static final java.lang.String NAME = "sendSms";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("content", "");
        int length = optString.length();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\x00-\\x7f]+");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        boolean matches = compile.matcher(optString).matches();
        if ((matches && length > 160) || (!matches && length > 70)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:the content of the text message exceeds the limit" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1517001);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        java.lang.String a17 = fp.s0.a(jSONObject.optString("phoneNumber", ""));
        android.content.Context f147807d = e9Var.getF147807d();
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:" + a17));
        intent.putExtra("sms_body", optString);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(f147807d, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiSendSms", "invoke", "(Lcom/tencent/mm/plugin/appbrand/AppBrandService;Lorg/json/JSONObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        f147807d.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(f147807d, "com/tencent/mm/plugin/appbrand/jsapi/JsApiSendSms", "invoke", "(Lcom/tencent/mm/plugin/appbrand/AppBrandService;Lorg/json/JSONObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, u(str2, jSONObject3));
    }
}
