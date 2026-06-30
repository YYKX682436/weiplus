package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class p implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.q f82648f;

    public p(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.pay.q qVar) {
        this.f82646d = c0Var;
        this.f82647e = i17;
        this.f82648f = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfoWC", "callback result", new java.lang.Object[0]);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_readmode_enable", java.lang.Boolean.valueOf(bundle.getBoolean("is_readmode_enable")));
        linkedHashMap.put("is_risk", java.lang.Boolean.valueOf(bundle.getBoolean("is_risk")));
        com.tencent.mm.plugin.appbrand.jsapi.pay.q qVar = this.f82648f;
        qVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        linkedHashMap.put("errno", 0);
        this.f82646d.a(this.f82647e, qVar.t("ok", linkedHashMap));
    }
}
