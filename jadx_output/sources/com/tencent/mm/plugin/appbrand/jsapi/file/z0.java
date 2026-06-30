package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.ArrayMap f81146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f81147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.b1 f81149g;

    public z0(android.util.ArrayMap arrayMap, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.file.b1 b1Var) {
        this.f81146d = arrayMap;
        this.f81147e = v5Var;
        this.f81148f = i17;
        this.f81149g = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : this.f81146d.entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.b1 b1Var = this.f81149g;
        b1Var.getClass();
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
        this.f81147e.a(this.f81148f, b1Var.u(str, jSONObject));
    }
}
