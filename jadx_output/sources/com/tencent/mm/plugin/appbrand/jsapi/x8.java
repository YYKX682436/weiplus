package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.y8 f83909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f83910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.plugin.appbrand.jsapi.y8 y8Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        super(1);
        this.f83909d = y8Var;
        this.f83910e = jSONObject;
        this.f83911f = d0Var;
        this.f83912g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        java.lang.String paramsKey = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(paramsKey, "paramsKey");
        org.json.JSONObject jSONObject = this.f83910e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(jSONObject.getString(paramsKey));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) m521constructorimpl;
        if (str != null) {
            return str;
        }
        com.tencent.mm.plugin.appbrand.jsapi.y8 y8Var = this.f83909d;
        y8Var.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f83911f.a(this.f83912g, y8Var.u(str2, jSONObject2));
        return null;
    }
}
