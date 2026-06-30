package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f80008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f80011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.x0 f80012h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i18, com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var) {
        super(1);
        this.f80008d = i17;
        this.f80009e = str;
        this.f80010f = lVar;
        this.f80011g = i18;
        this.f80012h = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String draftData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(draftData, "draftData");
        boolean z17 = draftData.length() == 0;
        com.tencent.mm.plugin.appbrand.jsapi.biz.x0 x0Var = this.f80012h;
        int i17 = this.f80011g;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80010f;
        java.lang.String str2 = this.f80009e;
        int i18 = this.f80008d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read draft is empty, draftType: " + i18 + ", scene:" + str2);
            x0Var.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, x0Var.u(str, jSONObject));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "read draft success, draftType: " + i18 + ", scene:" + str2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("draftData", draftData);
            x0Var.getClass();
            java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str = str5 != null ? str5 : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, x0Var.u(str, jSONObject2));
        }
        return jz5.f0.f302826a;
    }
}
