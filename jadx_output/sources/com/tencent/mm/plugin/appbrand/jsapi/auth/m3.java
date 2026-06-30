package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class m3 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n3 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.n24 f79639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.appbrand.jsapi.auth.h4 sharedContext, r45.n24 response) {
        super(sharedContext, null);
        kotlin.jvm.internal.o.g(sharedContext, "sharedContext");
        kotlin.jvm.internal.o.g(response, "response");
        this.f79639e = response;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n3
    public void d() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var = this.f79539d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.o0 o0Var = h4Var.f79572f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        o0Var.f79660i = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.jsapi.ff ffVar = h4Var.f79571e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.j4 j4Var = h4Var.f79570d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, this.f79639e.f381016e.i());
        com.tencent.mm.plugin.appbrand.jsapi.auth.o0 o0Var2 = h4Var.f79572f;
        o0Var2.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("queueLength", o0Var2.f79652a);
        jSONObject2.put("wxdataQueueTimestamp", o0Var2.f79653b);
        jSONObject2.put("wxdataDequeueTimestamp", o0Var2.f79654c);
        jSONObject2.put("isConfirm", o0Var2.f79655d);
        jSONObject2.put("beginCGITimestamp", o0Var2.f79656e);
        jSONObject2.put("CGICallbackTimestamp", o0Var2.f79657f);
        jSONObject2.put("beginCGITimestampAfterConfirm", o0Var2.f79658g);
        jSONObject2.put("CGICallbackTimestampAfterConfirm", o0Var2.f79659h);
        jSONObject2.put("wxlibCallbackTimestamp", o0Var2.f79660i);
        jSONObject.put("clientInfo", jSONObject2);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = ffVar.f81013b;
        j4Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(ffVar.f81016e, j4Var.u(str, jSONObject));
    }
}
