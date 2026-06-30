package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes.dex */
public class b1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.c1 f83116d;

    public b1(com.tencent.mm.plugin.appbrand.jsapi.share.c1 c1Var, android.app.Activity activity, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f83116d = c1Var;
        this.f83113a = activity;
        this.f83114b = c0Var;
        this.f83115c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.share.c1 c1Var = this.f83116d;
        if (i17 != c1Var.f83119g) {
            return false;
        }
        int i19 = this.f83115c;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83114b;
        if (i18 == -1) {
            android.app.Activity activity = this.f83113a;
            db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.f490560yi));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareImageTimeline", "result is success");
            c1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i19, c1Var.u(str2, jSONObject));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareImageTimeline", "result is cancel");
            c1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i19, c1Var.u(str2, jSONObject2));
        }
        return true;
    }
}
