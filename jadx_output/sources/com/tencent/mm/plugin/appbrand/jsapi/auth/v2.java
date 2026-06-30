package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class v2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o f79759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f79761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.w2 f79762d;

    public v2(com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var) {
        this.f79759a = oVar;
        this.f79760b = yVar;
        this.f79761c = i17;
        this.f79762d = w2Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.o oVar = this.f79759a;
        if (oVar != null) {
            oVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onInterrupt, appId[");
        com.tencent.mm.plugin.appbrand.y yVar = this.f79760b;
        sb6.append(yVar.getAppId());
        sb6.append("], callbackId[");
        int i17 = this.f79761c;
        sb6.append(i17);
        sb6.append("], e[");
        sb6.append(obj != null ? obj.toString() : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("Luggage.WXA.JsApiLoginLU", sb6.toString());
        if (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.s) {
            return;
        }
        boolean z17 = obj instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.p;
        com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var = this.f79762d;
        if (z17) {
            yVar.a(i17, w2Var.o("fail " + ((com.tencent.mm.plugin.appbrand.jsapi.auth.p) obj).getMessage()));
        } else if (obj instanceof java.lang.Throwable) {
            yVar.a(i17, w2Var.o("fail " + ((java.lang.Throwable) obj).getMessage()));
        } else {
            if (obj == null) {
                yVar.a(i17, w2Var.o("fail:internal error"));
                return;
            }
            yVar.a(i17, w2Var.o("fail " + obj));
        }
    }
}
