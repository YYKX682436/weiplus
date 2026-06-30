package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public final class x5 implements com.tencent.mm.plugin.appbrand.utils.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y5 f82132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82133e;

    public x5(java.lang.String str, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var, org.json.JSONObject jSONObject) {
        this.f82129a = str;
        this.f82130b = yVar;
        this.f82131c = i17;
        this.f82132d = y5Var;
        this.f82133e = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.q2
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, imageUrl: " + this.f82129a + ", resolvedPath: " + str + ", isPathCreated: " + z17);
        boolean z18 = str == null || str.length() == 0;
        com.tencent.mm.plugin.appbrand.jsapi.media.y5 y5Var = this.f82132d;
        int i17 = this.f82131c;
        com.tencent.mm.plugin.appbrand.y yVar = this.f82130b;
        if (!z18) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                android.app.Activity r07 = yVar.t3().r0();
                if (r07 != null) {
                    com.tencent.mm.plugin.appbrand.y yVar2 = this.f82130b;
                    yVar2.m(new com.tencent.mm.plugin.appbrand.jsapi.media.w5(r07, str, yVar2, this.f82133e, this.f82132d, this.f82131c, z17));
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, hostActivity is null");
                y5Var.getClass();
                java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, y5Var.u(str3, jSONObject));
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, resolvedPath is not exist");
        y5Var.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty("fail:Parse imageUrl fail, maybe imageUrl is illegal?") ? "fail:jsapi invalid request data" : "fail:Parse imageUrl fail, maybe imageUrl is illegal?";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, y5Var.u(str5, jSONObject2));
    }
}
