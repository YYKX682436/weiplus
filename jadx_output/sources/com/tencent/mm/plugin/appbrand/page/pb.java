package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class pb implements com.tencent.mm.plugin.appbrand.page.hb {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.a f87015a;

    public pb(com.tencent.mm.plugin.appbrand.page.a renderer) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        this.f87015a = renderer;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.hb
    public java.lang.String a(java.lang.String str) {
        java.lang.String p17;
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String[] SCRIPTS_LIB_FOR_WEBVIEW = com.tencent.luggage.sdk.jsapi.component.o.f47359k0;
        kotlin.jvm.internal.o.f(SCRIPTS_LIB_FOR_WEBVIEW, "SCRIPTS_LIB_FOR_WEBVIEW");
        java.lang.String str2 = "";
        if (kz5.z.G(SCRIPTS_LIB_FOR_WEBVIEW, str)) {
            java.lang.Object r17 = this.f87015a.r(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
            kotlin.jvm.internal.o.d(r17);
            p17 = ((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) r17).M(str);
        } else if (kotlin.jvm.internal.o.b(str, "app-wxss.js")) {
            ze.n c17 = c();
            kotlin.jvm.internal.o.d(c17);
            p17 = com.tencent.mm.plugin.appbrand.appcache.la.p(c17, "app-wxss.js");
        } else if (kotlin.jvm.internal.o.b(str, "page-frame.html")) {
            ze.n c18 = c();
            kotlin.jvm.internal.o.d(c18);
            p17 = com.tencent.mm.plugin.appbrand.page.c7.a(com.tencent.mm.plugin.appbrand.appcache.la.p(c18, "page-frame.html"));
        } else if (kotlin.jvm.internal.o.b(str, this.f87015a.f86375m)) {
            ze.n c19 = c();
            kotlin.jvm.internal.o.d(c19);
            java.lang.String p18 = com.tencent.mm.plugin.appbrand.appcache.la.p(c19, str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int indexOf = p18.indexOf("<style>");
            int indexOf2 = p18.indexOf("</style>");
            java.lang.String u17 = u46.l.u((indexOf == -1 || indexOf2 == (-indexOf)) ? "" : p18.substring(indexOf + 7, indexOf2));
            int indexOf3 = p18.indexOf("<page>");
            int indexOf4 = p18.indexOf("</page>");
            java.lang.String u18 = u46.l.u((indexOf3 == -1 || indexOf4 == (-indexOf3)) ? "" : p18.substring(indexOf3 + 6, indexOf4));
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.page.c7.a(p18);
            if (!(u17 == null || u17.length() == 0)) {
                sb6.append("var style = document.createElement('style');");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("style.innerHTML = atob(\"");
                kotlin.jvm.internal.o.d(u17);
                byte[] bytes = u17.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                sb7.append(android.util.Base64.encodeToString(bytes, 2));
                sb7.append("\");");
                sb6.append(sb7.toString());
                sb6.append("document.head.appendChild(style);");
            }
            if (!(u18 == null || u18.length() == 0)) {
                sb6.append("var page = document.createElement('page');");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("page.innerHTML = atob(\"");
                kotlin.jvm.internal.o.d(u18);
                byte[] bytes2 = u18.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                sb8.append(android.util.Base64.encodeToString(bytes2, 2));
                sb8.append("\");");
                sb6.append(sb8.toString());
                sb6.append("document.body.appendChild(page);");
            }
            if (!(a17 == null || a17.length() == 0)) {
                sb6.append(a17);
                sb6.append(';');
            }
            p17 = sb6.toString();
        } else {
            p17 = com.tencent.mm.plugin.appbrand.appcache.la.p(c(), str);
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("provideScript name[");
        sb9.append(str);
        sb9.append("] source.length[");
        sb9.append(p17 != null ? p17.length() : -1);
        sb9.append(']');
        com.tencent.mars.xlog.Log.i("Luggage.WXA.MPPageScriptProviderDefaultImpl", sb9.toString());
        if (p17 == null || p17.length() == 0) {
            return null;
        }
        kotlin.jvm.internal.o.f(SCRIPTS_LIB_FOR_WEBVIEW, "SCRIPTS_LIB_FOR_WEBVIEW");
        if (kz5.z.G(SCRIPTS_LIB_FOR_WEBVIEW, str)) {
            str2 = com.tencent.luggage.sdk.jsapi.component.o.f47357i0 + "lib/" + str;
        } else {
            ze.n c27 = c();
            if ((c27 == null || (E0 = c27.E0()) == null || !E0.f47296w) ? false : true) {
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(com.tencent.luggage.sdk.jsapi.component.o.f47357i0);
                if (c() == null) {
                    sb10.append("preload/");
                } else {
                    ze.n c28 = c();
                    kotlin.jvm.internal.o.d(c28);
                    sb10.append(c28.f74803n);
                    sb10.append("/");
                    ze.n c29 = c();
                    kotlin.jvm.internal.o.d(c29);
                    sb10.append(c29.E0().f305852r.pkgVersion());
                    sb10.append("/");
                }
                sb10.append(str);
                str2 = sb10.toString();
                kotlin.jvm.internal.o.f(str2, "toString(...)");
            }
        }
        if (str2.length() == 0) {
            return p17;
        }
        return p17 + "\n//# sourceURL=" + com.tencent.mm.plugin.appbrand.utils.w2.a(str2);
    }

    public final ze.n c() {
        return this.f87015a.J();
    }
}
