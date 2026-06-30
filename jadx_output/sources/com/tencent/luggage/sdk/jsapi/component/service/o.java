package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f47507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n f47508b;

    public o(com.tencent.luggage.sdk.jsapi.component.service.n nVar, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        this.f47508b = nVar;
        this.f47507a = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "hy: wxa main context exception %s %s", str, str2);
        java.lang.String format = java.lang.String.format("{'message':'%s', 'stack': '%s'}", com.tencent.mm.plugin.appbrand.utils.w2.a(str), com.tencent.mm.plugin.appbrand.utils.w2.a(str2));
        com.tencent.mm.plugin.appbrand.jsapi.jf.a(this.f47507a, "onError", format, 0, 0);
        this.f47508b.J0(str, str2);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsRuntimeException", format);
    }
}
