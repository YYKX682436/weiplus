package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class h0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.j0 f83147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83150d;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.share.j0 j0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, android.app.Activity activity, int i17) {
        this.f83147a = j0Var;
        this.f83148b = e9Var;
        this.f83149c = activity;
        this.f83150d = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiShareEmojiMessage", "requestCode:" + i17 + " resultCode: " + i18);
        com.tencent.mm.plugin.appbrand.jsapi.share.j0 j0Var = this.f83147a;
        if (i17 != j0Var.f83164g) {
            return false;
        }
        int i19 = this.f83150d;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83148b;
        if (i18 == -1) {
            j91.d dVar = (j91.d) e9Var.getRuntime().K1(j91.d.class);
            if (dVar != null) {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                if (tVar.f()) {
                    tVar.l();
                }
            }
            android.app.Activity activity = this.f83149c;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            j0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i19, j0Var.u(str2, jSONObject));
        } else if (i18 == 0) {
            j0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i19, j0Var.u(str2, jSONObject2));
        }
        return true;
    }
}
