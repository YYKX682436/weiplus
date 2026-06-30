package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class p5 implements sd1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5 f172062d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5();

    /* renamed from: e, reason: collision with root package name */
    public static final sd1.c f172063e = sd1.c.f488210e;

    public sd1.c a(java.lang.String referrerPolicyStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referrerPolicyStr, "referrerPolicyStr");
        sd1.c cVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(referrerPolicyStr, ya.b.f77495x8b74a326) ? sd1.c.f488209d : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(referrerPolicyStr, "no-referrer") ? sd1.c.f488210e : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicy, referrerPolicy: " + cVar);
        return cVar;
    }

    public sd1.c b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        uh1.a aVar = (uh1.a) component.b(uh1.a.class);
        if (aVar != null) {
            return aVar.C;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyFallback, networkConfig is null");
        return null;
    }

    public sd1.c c(org.json.JSONObject data, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.lang.String d17 = d(data);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyOrFallback, referrerPolicyStr is null");
            return b(component);
        }
        sd1.c a17 = a(d17);
        return a17 == null ? b(component) : a17;
    }

    public java.lang.String d(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!data.has("referrerPolicy")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyStr, referrerPolicy does not exist");
            return null;
        }
        java.lang.String optString = data.optString("referrerPolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            return optString;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyStr, referrerPolicyStr is empty");
        return null;
    }

    public java.lang.String e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        uh1.a aVar = (uh1.a) component.b(uh1.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "provideReferrer, networkConfig is null");
            return null;
        }
        java.lang.String str = aVar.D;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.WxaReferrerHelper", "provideReferrer, referrer is empty");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaReferrerHelper", "provide, referrer: ".concat(str));
        return str;
    }
}
