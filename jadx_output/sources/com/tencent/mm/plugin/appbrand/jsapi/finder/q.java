package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f81218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.t f81220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.finder.t tVar) {
        super(1);
        this.f81218d = c0Var;
        this.f81219e = i17;
        this.f81220f = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("hasFinderWidget", booleanValue);
        com.tencent.mm.plugin.appbrand.jsapi.finder.t tVar = this.f81220f;
        tVar.getClass();
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
        this.f81218d.a(this.f81219e, tVar.u(str, jSONObject));
        return jz5.f0.f302826a;
    }
}
