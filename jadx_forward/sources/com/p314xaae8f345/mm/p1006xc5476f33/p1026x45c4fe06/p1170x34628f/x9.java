package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class x9 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168786a;

    /* renamed from: b, reason: collision with root package name */
    public uh1.y0 f168787b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.String f168788c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y9 f168789d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12532x6b57980();

    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f168786a = v5Var;
    }

    public android.webkit.WebResourceResponse a(java.lang.String str) {
        java.io.InputStream a17;
        android.webkit.WebResourceResponse webResourceResponse = null;
        if (str == null || !this.f168786a.mo50262x39e05d35()) {
            return null;
        }
        java.lang.String str2 = this.f168788c;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandWebViewClient", "getAppResourceResponse with reqURL[%s], hostURL isEmpty", str);
            return null;
        }
        if (!str.startsWith(str2)) {
            if (!android.webkit.URLUtil.isAboutUrl(str) && !android.webkit.URLUtil.isHttpUrl(str) && !android.webkit.URLUtil.isHttpsUrl(str) && !android.webkit.URLUtil.isDataUrl(str)) {
                ik1.b0 b0Var = new ik1.b0();
                this.f168786a.t3().mo48802x59eafec1().mo49307xcc440832(str, b0Var);
                if (b0Var.f373357a != null) {
                    java.lang.String c17 = s46.c.c(str);
                    android.webkit.WebResourceResponse webResourceResponse2 = new android.webkit.WebResourceResponse(!android.text.TextUtils.isEmpty(c17) ? q75.g.b(c17) : "", "", new nf.a((java.nio.ByteBuffer) b0Var.f373357a));
                    webResourceResponse2.setStatusCodeAndReasonPhrase(200, "OK");
                    webResourceResponse = webResourceResponse2;
                }
            }
            return webResourceResponse;
        }
        java.lang.String replaceFirst = str.replaceFirst(str2, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y9 y9Var = this.f168789d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168786a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12532x6b57980) y9Var).getClass();
        if ((u46.l.r(replaceFirst, "/WA") || u46.l.r(replaceFirst, "WA")) && v5Var.x() != null && (a17 = v5Var.x().a(replaceFirst)) != null) {
            android.webkit.WebResourceResponse webResourceResponse3 = new android.webkit.WebResourceResponse(q75.g.c(replaceFirst), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, a17);
            webResourceResponse3.setStatusCodeAndReasonPhrase(200, "OK");
            webResourceResponse = webResourceResponse3;
        }
        if (webResourceResponse == null) {
            webResourceResponse = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.r(this.f168786a.t3(), replaceFirst);
            if (webResourceResponse != null) {
                webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
            } else {
                if (replaceFirst.contains("%")) {
                    webResourceResponse = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.r(this.f168786a.t3(), android.net.Uri.decode(replaceFirst));
                    if (webResourceResponse != null) {
                        webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandWebViewClient", "getAppResourceResponse %s not found", str);
                webResourceResponse = new android.webkit.WebResourceResponse("image/*", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, new java.io.ByteArrayInputStream(new byte[0]));
                webResourceResponse.setStatusCodeAndReasonPhrase(404, "NotFound");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandWebViewClient", "tryInterceptWebViewRequest, reqURL = %s", str);
        return webResourceResponse;
    }

    public boolean b(android.net.http.SslCertificate sslCertificate) {
        boolean z17 = false;
        if (this.f168786a.t3() == null) {
            return false;
        }
        if (this.f168787b == null) {
            this.f168787b = uh1.j0.r((uh1.a) this.f168786a.t3().b(uh1.a.class));
        }
        if (this.f168787b == null) {
            return false;
        }
        sslCertificate.getIssuedTo().getDName();
        try {
            java.lang.reflect.Field declaredField = sslCertificate.getClass().getDeclaredField("mX509Certificate");
            declaredField.setAccessible(true);
            try {
                this.f168787b.checkServerTrusted(new java.security.cert.X509Certificate[]{(java.security.cert.X509Certificate) declaredField.get(sslCertificate)}, "generic");
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandWebViewClient", "Certificate check failed: " + e17);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AppBrandWebViewClient", "Certificate check failed: ", e18);
        }
        return z17;
    }

    public void c(java.lang.String str) {
    }
}
