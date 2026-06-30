package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class wb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.xb f83727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.xb xbVar) {
        super(0);
        this.f83725d = c0Var;
        this.f83726e = i17;
        this.f83727f = xbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.jsapi.xb xbVar = this.f83727f;
        xbVar.getClass();
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
        this.f83725d.a(this.f83726e, xbVar.u(str, jSONObject));
        return jz5.f0.f302826a;
    }
}
