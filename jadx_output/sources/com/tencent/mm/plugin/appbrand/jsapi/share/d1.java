package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class d1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.e1 f83123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f83124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83125c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83126d;

    public d1(com.tencent.mm.plugin.appbrand.jsapi.share.e1 e1Var, android.content.Context context, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f83123a = e1Var;
        this.f83124b = context;
        this.f83125c = e9Var;
        this.f83126d = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiShareTextToGroup", "requestCode:" + i17 + " resultCode: " + i18);
        com.tencent.mm.plugin.appbrand.jsapi.share.e1 e1Var = this.f83123a;
        if (i17 != e1Var.f83129g) {
            return false;
        }
        int i19 = this.f83126d;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83125c;
        if (i18 == -1) {
            android.content.Context context = this.f83124b;
            if (context instanceof android.app.Activity) {
                j91.d dVar = (j91.d) e9Var.getRuntime().K1(j91.d.class);
                if (dVar != null) {
                    com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                    if (tVar.f()) {
                        tVar.l();
                    }
                }
                com.tencent.mm.ui.widget.snackbar.j.c(context.getString(com.tencent.mm.R.string.fw6), null, context, null, null);
            }
            e1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i19, e1Var.u(str2, jSONObject));
        } else if (i18 == 0) {
            e1Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i19, e1Var.u(str2, jSONObject2));
        }
        return true;
    }
}
