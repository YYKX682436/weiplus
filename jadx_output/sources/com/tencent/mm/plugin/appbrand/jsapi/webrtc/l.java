package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1377;
    public static final java.lang.String NAME = "operateWebRTCVoiceRecord";

    /* renamed from: g, reason: collision with root package name */
    public mi1.w0 f83848g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("operate") : null;
        if (kotlin.jvm.internal.o.b(optString, "start")) {
            this.f83848g = mi1.c.a(c0Var != null ? c0Var.t3() : null).h(mi1.d.VOICE);
        } else if (kotlin.jvm.internal.o.b(optString, "stop")) {
            mi1.w0 w0Var = this.f83848g;
            if (w0Var != null) {
                w0Var.dismiss();
            }
            this.f83848g = null;
        } else {
            if (c0Var != null) {
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i17, u(str, jSONObject2));
            }
            mi1.w0 w0Var2 = this.f83848g;
            if (w0Var2 != null) {
                w0Var2.dismiss();
            }
            this.f83848g = null;
        }
        if (c0Var != null) {
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str4, jSONObject3));
        }
    }
}
