package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class pb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a f168548a;

    public pb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        this.f168548a = renderer;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb
    public java.lang.String a(java.lang.String str) {
        java.lang.String p17;
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String[] SCRIPTS_LIB_FOR_WEBVIEW = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128892k0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SCRIPTS_LIB_FOR_WEBVIEW, "SCRIPTS_LIB_FOR_WEBVIEW");
        java.lang.String str2 = "";
        if (kz5.z.G(SCRIPTS_LIB_FOR_WEBVIEW, str)) {
            java.lang.Object r17 = this.f168548a.r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) r17).M(str);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "app-wxss.js")) {
            ze.n c17 = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(c17, "app-wxss.js");
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "page-frame.html")) {
            ze.n c18 = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
            p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c7.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(c18, "page-frame.html"));
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f168548a.f167908m)) {
            ze.n c19 = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19);
            java.lang.String p18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(c19, str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int indexOf = p18.indexOf("<style>");
            int indexOf2 = p18.indexOf("</style>");
            java.lang.String u17 = u46.l.u((indexOf == -1 || indexOf2 == (-indexOf)) ? "" : p18.substring(indexOf + 7, indexOf2));
            int indexOf3 = p18.indexOf("<page>");
            int indexOf4 = p18.indexOf("</page>");
            java.lang.String u18 = u46.l.u((indexOf3 == -1 || indexOf4 == (-indexOf3)) ? "" : p18.substring(indexOf3 + 6, indexOf4));
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c7.a(p18);
            if (!(u17 == null || u17.length() == 0)) {
                sb6.append("var style = document.createElement('style');");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("style.innerHTML = atob(\"");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
                byte[] bytes = u17.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                sb7.append(android.util.Base64.encodeToString(bytes, 2));
                sb7.append("\");");
                sb6.append(sb7.toString());
                sb6.append("document.head.appendChild(style);");
            }
            if (!(u18 == null || u18.length() == 0)) {
                sb6.append("var page = document.createElement('page');");
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("page.innerHTML = atob(\"");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u18);
                byte[] bytes2 = u18.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
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
            p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(c(), str);
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("provideScript name[");
        sb9.append(str);
        sb9.append("] source.length[");
        sb9.append(p17 != null ? p17.length() : -1);
        sb9.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.MPPageScriptProviderDefaultImpl", sb9.toString());
        if (p17 == null || p17.length() == 0) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SCRIPTS_LIB_FOR_WEBVIEW, "SCRIPTS_LIB_FOR_WEBVIEW");
        if (kz5.z.G(SCRIPTS_LIB_FOR_WEBVIEW, str)) {
            str2 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128890i0 + "lib/" + str;
        } else {
            ze.n c27 = c();
            if ((c27 == null || (E0 = c27.E0()) == null || !E0.f128829w) ? false : true) {
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o.f128890i0);
                if (c() == null) {
                    sb10.append("preload/");
                } else {
                    ze.n c28 = c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28);
                    sb10.append(c28.f156336n);
                    sb10.append("/");
                    ze.n c29 = c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c29);
                    sb10.append(c29.E0().f387385r.mo49191x1c82a56c());
                    sb10.append("/");
                }
                sb10.append(str);
                str2 = sb10.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
            }
        }
        if (str2.length() == 0) {
            return p17;
        }
        return p17 + "\n//# sourceURL=" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str2);
    }

    public final ze.n c() {
        return this.f168548a.J();
    }
}
