package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class p9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.r9 f82490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82492c;

    public p9(com.tencent.mm.plugin.appbrand.jsapi.r9 r9Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f82490a = r9Var;
        this.f82491b = d0Var;
        this.f82492c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMyAddress", "[openManageAddr]requestCode: %d, resultCode: %d, data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        com.tencent.mm.plugin.appbrand.jsapi.r9 r9Var = this.f82490a;
        if (i17 != (r9Var.hashCode() & 65535)) {
            return false;
        }
        r9Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f82491b.a(this.f82492c, r9Var.u(str, jSONObject));
        return true;
    }
}
