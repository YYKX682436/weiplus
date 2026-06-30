package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.http.SslError f263360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 f263361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263363g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263364h;

    public f1(android.net.http.SslError sslError, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var, java.lang.String str, int i17, int i18) {
        this.f263360d = sslError;
        this.f263361e = h1Var;
        this.f263362f = str;
        this.f263363g = i17;
        this.f263364h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        java.lang.String host;
        android.net.http.SslError sslError = this.f263360d;
        java.lang.String url = sslError.getUrl();
        if (url == null) {
            url = "";
        }
        try {
            uri = android.net.Uri.parse(url);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:".concat(url));
            uri = null;
        }
        java.lang.String str = (uri == null || (host = uri.getHost()) == null) ? "" : host;
        int primaryError = sslError.getPrimaryError();
        android.net.http.SslCertificate certificate = sslError.getCertificate();
        java.lang.String sslCertificate = certificate != null ? certificate.toString() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1 h1Var = this.f263361e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22086, 3, java.lang.Integer.valueOf(primaryError), str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, url), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1.a(h1Var, sslCertificate), 1, this.f263362f, java.lang.Integer.valueOf(this.f263363g), java.lang.Integer.valueOf(this.f263364h));
    }
}
