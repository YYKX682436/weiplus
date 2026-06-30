package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class x9 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f87253a;

    /* renamed from: b, reason: collision with root package name */
    public uh1.y0 f87254b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.String f87255c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.y9 f87256d = new com.tencent.mm.plugin.appbrand.page.x9$$a();

    public x9(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f87253a = v5Var;
    }

    public android.webkit.WebResourceResponse a(java.lang.String str) {
        java.io.InputStream a17;
        android.webkit.WebResourceResponse webResourceResponse = null;
        if (str == null || !this.f87253a.isRunning()) {
            return null;
        }
        java.lang.String str2 = this.f87255c;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandWebViewClient", "getAppResourceResponse with reqURL[%s], hostURL isEmpty", str);
            return null;
        }
        if (!str.startsWith(str2)) {
            if (!android.webkit.URLUtil.isAboutUrl(str) && !android.webkit.URLUtil.isHttpUrl(str) && !android.webkit.URLUtil.isHttpsUrl(str) && !android.webkit.URLUtil.isDataUrl(str)) {
                ik1.b0 b0Var = new ik1.b0();
                this.f87253a.t3().getFileSystem().readFile(str, b0Var);
                if (b0Var.f291824a != null) {
                    java.lang.String c17 = s46.c.c(str);
                    android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(!android.text.TextUtils.isEmpty(c17) ? q75.g.b(c17) : "", "", new nf.a((java.nio.ByteBuffer) b0Var.f291824a));
                    webResourceResponse2.setStatusCodeAndReasonPhrase(200, "OK");
                    webResourceResponse = webResourceResponse2;
                }
            }
            return webResourceResponse;
        }
        java.lang.String replaceFirst = str.replaceFirst(str2, "");
        com.tencent.mm.plugin.appbrand.page.y9 y9Var = this.f87256d;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87253a;
        ((com.tencent.mm.plugin.appbrand.page.x9$$a) y9Var).getClass();
        if ((u46.l.r(replaceFirst, "/WA") || u46.l.r(replaceFirst, "WA")) && v5Var.x() != null && (a17 = v5Var.x().a(replaceFirst)) != null) {
            android.webkit.WebResourceResponse webResourceResponse3 = new android.webkit.WebResourceResponse(q75.g.c(replaceFirst), com.tencent.mapsdk.internal.rv.f51270c, a17);
            webResourceResponse3.setStatusCodeAndReasonPhrase(200, "OK");
            webResourceResponse = webResourceResponse3;
        }
        if (webResourceResponse == null) {
            webResourceResponse = com.tencent.mm.plugin.appbrand.appcache.la.r(this.f87253a.t3(), replaceFirst);
            if (webResourceResponse != null) {
                webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
            } else {
                if (replaceFirst.contains("%")) {
                    webResourceResponse = com.tencent.mm.plugin.appbrand.appcache.la.r(this.f87253a.t3(), android.net.Uri.decode(replaceFirst));
                    if (webResourceResponse != null) {
                        webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
                    }
                }
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandWebViewClient", "getAppResourceResponse %s not found", str);
                webResourceResponse = new android.webkit.WebResourceResponse("image/*", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, new java.io.ByteArrayInputStream(new byte[0]));
                webResourceResponse.setStatusCodeAndReasonPhrase(404, "NotFound");
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandWebViewClient", "tryInterceptWebViewRequest, reqURL = %s", str);
        return webResourceResponse;
    }

    public boolean b(android.net.http.SslCertificate sslCertificate) {
        boolean z17 = false;
        if (this.f87253a.t3() == null) {
            return false;
        }
        if (this.f87254b == null) {
            this.f87254b = uh1.j0.r((uh1.a) this.f87253a.t3().b(uh1.a.class));
        }
        if (this.f87254b == null) {
            return false;
        }
        sslCertificate.getIssuedTo().getDName();
        try {
            java.lang.reflect.Field declaredField = sslCertificate.getClass().getDeclaredField("mX509Certificate");
            declaredField.setAccessible(true);
            try {
                this.f87254b.checkServerTrusted(new java.security.cert.X509Certificate[]{(java.security.cert.X509Certificate) declaredField.get(sslCertificate)}, "generic");
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandWebViewClient", "Certificate check failed: " + e17);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandWebViewClient", "Certificate check failed: ", e18);
        }
        return z17;
    }

    public void c(java.lang.String str) {
    }
}
