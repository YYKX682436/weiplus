package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class p5 implements sd1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.p5 f90529d = new com.tencent.mm.plugin.appbrand.utils.p5();

    /* renamed from: e, reason: collision with root package name */
    public static final sd1.c f90530e = sd1.c.f406677e;

    public sd1.c a(java.lang.String referrerPolicyStr) {
        kotlin.jvm.internal.o.g(referrerPolicyStr, "referrerPolicyStr");
        sd1.c cVar = kotlin.jvm.internal.o.b(referrerPolicyStr, ya.b.ORIGIN) ? sd1.c.f406676d : kotlin.jvm.internal.o.b(referrerPolicyStr, "no-referrer") ? sd1.c.f406677e : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicy, referrerPolicy: " + cVar);
        return cVar;
    }

    public sd1.c b(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        uh1.a aVar = (uh1.a) component.b(uh1.a.class);
        if (aVar != null) {
            return aVar.C;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyFallback, networkConfig is null");
        return null;
    }

    public sd1.c c(org.json.JSONObject data, com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(component, "component");
        java.lang.String d17 = d(data);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyOrFallback, referrerPolicyStr is null");
            return b(component);
        }
        sd1.c a17 = a(d17);
        return a17 == null ? b(component) : a17;
    }

    public java.lang.String d(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.has("referrerPolicy")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyStr, referrerPolicy does not exist");
            return null;
        }
        java.lang.String optString = data.optString("referrerPolicy");
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            return optString;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyStr, referrerPolicyStr is empty");
        return null;
    }

    public java.lang.String e(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        uh1.a aVar = (uh1.a) component.b(uh1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "provideReferrer, networkConfig is null");
            return null;
        }
        java.lang.String str = aVar.D;
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "provideReferrer, referrer is empty");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "provide, referrer: ".concat(str));
        return str;
    }
}
