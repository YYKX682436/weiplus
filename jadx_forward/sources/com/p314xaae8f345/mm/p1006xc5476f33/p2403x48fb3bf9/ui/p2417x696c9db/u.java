package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes7.dex */
public class u implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f268447a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f268448b;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f268451e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f268452f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.security.KeyStore f268453g = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.text.SimpleDateFormat f268454h = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mmZ", java.util.Locale.getDefault());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f268449c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f268450d = new java.util.HashMap();

    public u(android.content.Context context, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        this.f268447a = context;
        this.f268448b = c27816xac2547f9;
    }

    public boolean a(android.net.http.SslCertificate sslCertificate) {
        if (sslCertificate == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates sslCertificate is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates dnName = %s", sslCertificate.getIssuedBy().getDName());
        try {
            java.lang.reflect.Field declaredField = sslCertificate.getClass().getDeclaredField("mX509Certificate");
            declaredField.setAccessible(true);
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) declaredField.get(sslCertificate);
            if (this.f268453g == null) {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidCAStore");
                this.f268453g = keyStore;
                keyStore.load(null, null);
            }
            if (this.f268452f == null) {
                this.f268452f = new java.util.ArrayList();
                java.util.Enumeration<java.lang.String> aliases = this.f268453g.aliases();
                while (aliases.hasMoreElements()) {
                    java.lang.String nextElement = aliases.nextElement();
                    if (nextElement != null && nextElement.startsWith("user:")) {
                        this.f268452f.add(nextElement);
                    }
                }
            }
            java.util.Iterator it = this.f268452f.iterator();
            while (it.hasNext()) {
                try {
                    x509Certificate.verify(((java.security.cert.X509Certificate) this.f268453g.getCertificate((java.lang.String) it.next())).getPublicKey());
                    return true;
                } catch (java.lang.Exception unused) {
                }
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates ex %s", e17.getMessage());
            return false;
        }
    }

    public void b(java.lang.String str, com.p314xaae8f345.p3210x3857dc.l0 l0Var, android.net.http.SslError sslError) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, currentUrl = %s", str);
        if (this.f268448b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError fail, has been detached");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            l0Var.mo120274xae7a2e7a();
            return;
        }
        java.util.Map map = this.f268450d;
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.HashMap) map).get(str);
        if (bool != null) {
            if (bool.booleanValue()) {
                l0Var.a();
                return;
            } else {
                l0Var.mo120274xae7a2e7a();
                return;
            }
        }
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_skip_user_cert, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError skipUserCert = %d", java.lang.Integer.valueOf(Ni));
            if (Ni == 1 && a(sslError.getCertificate())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError use user certificatess");
                ((java.util.HashMap) map).put(str, java.lang.Boolean.TRUE);
                l0Var.a();
                return;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError : " + e17.getLocalizedMessage());
        }
        if (sslError == null || !com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str).equals(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(sslError.getUrl()))) {
            l0Var.mo120274xae7a2e7a();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = str;
            objArr[1] = sslError != null ? sslError.getUrl() : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "cancel request due to onReceiveSslError, error url not match current url = %s, error url = %s", objArr);
            return;
        }
        try {
            java.net.URL url = new java.net.URL(str);
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20826x9d88cca1()) != 1 || ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(str) || !android.webkit.URLUtil.isHttpsUrl(str)) {
                url.getHost();
                l0Var.mo120274xae7a2e7a();
                return;
            }
            java.util.Map map2 = this.f268449c;
            java.util.List list = (java.util.List) ((java.util.HashMap) map2).get(str);
            if (list != null && list.size() != 0) {
                list.add(l0Var);
                return;
            }
            c(str, sslError);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(l0Var);
            ((java.util.HashMap) map2).put(str, arrayList);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f268451e;
            if (j0Var != null && j0Var.isShowing()) {
                l0Var.mo120274xae7a2e7a();
            } else {
                android.content.Context context = this.f268447a;
                this.f268451e = db5.e1.K(context, false, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oor, url.getHost()), this.f268447a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oos), this.f268447a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq), this.f268447a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s(this, str), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t(this, str));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "create url fail : " + e18.getLocalizedMessage());
        }
    }

    public final void c(java.lang.String str, android.net.http.SslError sslError) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,");
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<sslerror><primaryerror>");
            sb7.append(sslError == null ? "-1" : java.lang.Integer.valueOf(sslError.getPrimaryError()));
            sb7.append("</primaryerror><clienttime>");
            sb7.append(android.util.Base64.encodeToString(this.f268454h.format(new java.util.Date()).getBytes(), 0));
            sb7.append("</clienttime><currenturl>");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str));
            }
            sb7.append("</currenturl>");
            android.net.http.SslCertificate certificate = sslError == null ? null : sslError.getCertificate();
            if (certificate != null) {
                android.net.http.SslCertificate.DName issuedBy = certificate.getIssuedBy();
                if (issuedBy != null) {
                    sb7.append("<issuedby>");
                    if (issuedBy.getDName() != null) {
                        sb7.append(android.util.Base64.encodeToString(issuedBy.getDName().getBytes(), 0));
                    }
                    sb7.append("</issuedby>");
                }
                android.net.http.SslCertificate.DName issuedTo = certificate.getIssuedTo();
                if (issuedTo != null) {
                    sb7.append("<issuedto>");
                    if (issuedTo.getDName() != null) {
                        sb7.append(android.util.Base64.encodeToString(issuedTo.getDName().getBytes(), 0));
                    }
                    sb7.append("</issuedto>");
                }
                java.lang.String validNotAfter = certificate.getValidNotAfter();
                if (validNotAfter != null) {
                    sb7.append("<getvalidnotafter>");
                    sb7.append(android.util.Base64.encodeToString(validNotAfter.getBytes(), 0));
                    sb7.append("</getvalidnotafter>");
                }
                java.lang.String validNotBefore = certificate.getValidNotBefore();
                if (validNotBefore != null) {
                    sb7.append("<getvalidnotbefore>");
                    sb7.append(android.util.Base64.encodeToString(validNotBefore.getBytes(), 0));
                    sb7.append("</getvalidnotbefore>");
                }
            }
            sb7.append("</sslerror>");
            str2 = sb7.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebView.MMSslErrorHandler", "buildXml ex = %s", e17.getMessage());
            str2 = "";
        }
        sb6.append(str2);
        java.lang.String sb8 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.MMSslErrorHandler", "reportWebViewSslError, value = %s", sb8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11098, sb8);
    }
}
