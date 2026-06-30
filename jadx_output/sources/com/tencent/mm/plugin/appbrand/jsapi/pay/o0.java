package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class o0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.p0 f82642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f82643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82645d;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.pay.p0 p0Var, java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82642a = p0Var;
        this.f82643b = weakReference;
        this.f82644c = c0Var;
        this.f82645d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("JsApiQuickSendRedPacket", "on result, requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.jsapi.pay.p0 p0Var = this.f82642a;
        if (p0Var.f82649g != i17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) this.f82643b.get();
        if (c0Var != null && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            boolean b17 = kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
            com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f82644c;
            int i19 = this.f82645d;
            if (b17) {
                com.tencent.mars.xlog.Log.i("JsApiQuickSendRedPacket", "[mmOnActivityResult] cancel");
                if (c0Var2 != null) {
                    p0Var.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:quick send redpacket cancel select conversation" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 701117);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    c0Var.a(i19, p0Var.u(str2, jSONObject));
                }
            } else if (kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                com.tencent.mars.xlog.Log.i("JsApiQuickSendRedPacket", "[mmOnActivityResult] pay success");
                if (c0Var2 != null) {
                    p0Var.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 0);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    c0Var.a(i19, p0Var.u(str2, jSONObject2));
                }
            } else {
                com.tencent.mars.xlog.Log.e("JsApiQuickSendRedPacket", "[mmOnActivityResult] unknow error");
                if (c0Var2 != null) {
                    p0Var.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 101);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    c0Var.a(i19, p0Var.u(str2, jSONObject3));
                }
            }
        }
        return true;
    }
}
