package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.storage.y f83438g;

    public x(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, int i18, com.tencent.mm.plugin.appbrand.jsapi.storage.y yVar) {
        this.f83435d = c0Var;
        this.f83436e = i17;
        this.f83437f = i18;
        this.f83438g = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83435d;
        com.tencent.mm.plugin.appbrand.launching.n nVar = (com.tencent.mm.plugin.appbrand.launching.n) c0Var.t3().f86172i2.b();
        java.lang.String str = c0Var.t3().u0().f47277w;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp b17 = nVar.b(this.f83436e, str);
        com.tencent.mm.plugin.appbrand.jsapi.storage.y yVar = this.f83438g;
        int i17 = this.f83437f;
        if (b17 != null && b17.f84337e == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("fetchedData", b17.f84336d);
            yVar.getClass();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            c0Var.a(i17, yVar.t("ok", hashMap));
            return;
        }
        yVar.getClass();
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
        c0Var.a(i17, yVar.u(str3, jSONObject));
    }
}
