package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class d implements com.p3263xee53b379.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f302242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.b f302243b;

    public d(com.p3263xee53b379.b bVar, java.lang.String str) {
        this.f302243b = bVar;
        this.f302242a = str;
    }

    public final void a(java.lang.String str) {
        com.p3263xee53b379.b bVar = this.f302243b;
        bVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("responseId", this.f302242a);
        hashMap.put("responseData", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        "sending:".concat(java.lang.String.valueOf(jSONObject));
        bVar.f302234e.runOnUiThread(new com.p3263xee53b379.d0(bVar, java.lang.String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", jSONObject.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f"))));
    }
}
