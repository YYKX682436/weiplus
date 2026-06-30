package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class zc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f35038x366c91de = 1129;

    /* renamed from: NAME */
    private static final java.lang.String f35039x24728b = "sendSms";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("content", "");
        int length = optString.length();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\x00-\\x7f]+");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        boolean matches = compile.matcher(optString).matches();
        if ((matches && length > 160) || (!matches && length > 70)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:the content of the text message exceeds the limit" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1517001);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        java.lang.String a17 = fp.s0.a(jSONObject.optString("phoneNumber", ""));
        android.content.Context f229340d = e9Var.getF229340d();
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:" + a17));
        intent.putExtra("sms_body", optString);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(f229340d, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiSendSms", "invoke", "(Lcom/tencent/mm/plugin/appbrand/AppBrandService;Lorg/json/JSONObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        f229340d.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(f229340d, "com/tencent/mm/plugin/appbrand/jsapi/JsApiSendSms", "invoke", "(Lcom/tencent/mm/plugin/appbrand/AppBrandService;Lorg/json/JSONObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, u(str2, jSONObject3));
    }
}
