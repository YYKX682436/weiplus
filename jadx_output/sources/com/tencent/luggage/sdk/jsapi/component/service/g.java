package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class g implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f47424a;

    public g(com.tencent.luggage.sdk.jsapi.component.service.f fVar, com.tencent.mm.plugin.appbrand.jsruntime.r rVar) {
        this.f47424a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterface[multicontext]", "hy: on exception! message: %s, stacktrace %s", str, str2);
        com.tencent.mm.plugin.appbrand.jsapi.lf.a(this.f47424a, "onError", java.lang.String.format("{'message':'%s', 'stack': '%s'}", com.tencent.mm.plugin.appbrand.utils.w2.a(str), com.tencent.mm.plugin.appbrand.utils.w2.a(str2)), 0);
        java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f354931a.f354932a).get(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.NAME);
        if (list != null && list.size() > 0) {
            android.support.v4.media.f.a(list.get(0));
            throw null;
        }
    }
}
