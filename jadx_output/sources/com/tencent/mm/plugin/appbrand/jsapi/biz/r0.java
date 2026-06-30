package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes.dex */
public final class r0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f80006f;

    public r0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        this.f80004d = lVar;
        this.f80005e = i17;
        this.f80006f = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f80006f;
        x0Var.getClass();
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
        this.f80004d.a(this.f80005e, x0Var.u(str, jSONObject));
    }
}
