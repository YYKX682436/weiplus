package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.finder.s f81225d = new com.tencent.mm.plugin.appbrand.jsapi.finder.s();

    public s() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String optString;
        java.lang.String optString2;
        boolean z17;
        s40.b1 service = (s40.b1) obj;
        java.lang.String widgetData = (java.lang.String) obj2;
        yz5.l callback = (yz5.l) obj3;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(widgetData, "widgetData");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.feature.finder.live.t6 t6Var = (com.tencent.mm.feature.finder.live.t6) service;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(widgetData);
            optString = jSONObject.optString("productId");
            optString2 = jSONObject.optString("finder_username");
            kotlin.jvm.internal.o.d(optString);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(t6Var.f66944d, "checkProductRecordPlayWidgetDisplayable failed", e17);
            callback.invoke(java.lang.Boolean.FALSE);
        }
        if (!(optString.length() == 0)) {
            kotlin.jvm.internal.o.d(optString2);
            if (optString2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(widgetData), com.tencent.mm.feature.finder.live.h.class, new com.tencent.mm.feature.finder.live.c6(callback), null);
                return jz5.f0.f302826a;
            }
        }
        callback.invoke(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
