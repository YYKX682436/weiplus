package of1;

/* loaded from: classes7.dex */
public final class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 f426450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426451c;

    public g0(of1.v0 v0Var) {
        this.f426451c = v0Var;
        this.f426450b = new of1.f0(v0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 d() {
        return this.f426450b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, com.p314xaae8f345.p3210x3857dc.x0 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f426451c.W1;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
            throw null;
        }
        if (((of1.w1) oVar).f426566d.q2()) {
            of1.v0 v0Var = this.f426451c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar2 = v0Var.W1;
            if (oVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                throw null;
            }
            java.lang.String Z = v0Var.Z();
            of1.w1 w1Var = (of1.w1) oVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.s0 s0Var = w1Var.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = w1Var.f426567e;
            if (!s0Var.f169631a) {
                s0Var.f169638h = Z;
                s0Var.f169639i = request.mo120512xb5887639().toString();
                s0Var.f169640j = request.mo120510x24dcf3d7();
                s0Var.f169641k = (java.lang.String) request.mo120511xaf5cb2ed().get("Referer");
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = n7Var.mo32091x9a3f0ba2().E0();
                if (E0 != null) {
                    s0Var.f169634d = E0.f387385r.f33456x1c82a56c;
                }
                s0Var.f169637g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ze.n mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = mo32091x9a3f0ba2 == null ? null : mo32091x9a3f0ba2.u0();
                if (u07 != null) {
                    s0Var.f169636f = u07.f128817z;
                } else {
                    int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.b(s0Var.f169632b, -1);
                    s0Var.f169636f = b17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_19358", "prepareCommonFields null = initConfig! apptype:%s", java.lang.Integer.valueOf(b17));
                }
                s0Var.f169636f += 1000;
                if (!s0Var.f169631a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Report.kv_19358", "report " + s0Var.m52428x9616526c());
                    ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(19358, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.o2.a(s0Var.f169632b, java.lang.Integer.valueOf(s0Var.f169634d), java.lang.Integer.valueOf(s0Var.f169635e), java.lang.Integer.valueOf(s0Var.f169636f), s0Var.f169637g, s0Var.f169638h, s0Var.f169639i, s0Var.f169640j, 0, 0, 0, 0, s0Var.f169641k));
                }
            }
        }
        of1.v0 v0Var2 = this.f426451c;
        android.net.Uri mo120512xb5887639 = request.mo120512xb5887639();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo120512xb5887639, "getUrl(...)");
        com.p314xaae8f345.p3210x3857dc.y0 E1 = v0Var2.E1(mo120512xb5887639);
        if (E1 != null) {
            return E1;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean j(java.lang.String url, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return this.f426451c.f426561g2.c(url, z17, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, com.p314xaae8f345.p3210x3857dc.x0 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (!request.mo120514xa25f36b5() || !v(request.mo120512xb5887639())) {
            return super.q(webView, request);
        }
        java.lang.String uri = request.mo120512xb5887639().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        of1.v0 v0Var = this.f426451c;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.e(uri, v0Var.Q())) {
            return super.r(webView, uri);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.D1(), "overrideUrl for " + uri + ", force sync geta8key because not in bizDomainList");
        v0Var.V0(uri, true, 8);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3(true, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 r(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        boolean z17 = false;
        boolean z18 = url.length() == 0;
        of1.v0 v0Var = this.f426451c;
        if (!z18) {
            try {
                z17 = v(android.net.Uri.parse(url));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(v0Var.D1(), "check shouldInterceptAndGetA8KeySyncForNotInBizDomainList for url:" + url + " parse uri failed " + e17);
            }
        }
        if (z17 && !com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.e(url, v0Var.Q())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.D1(), "overrideUrl for " + url + ", force sync geta8key because not in bizDomainList");
            v0Var.V0(url, true, 8);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3(true, true);
        }
        return super.r(webView, url);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        if (this.f426451c.f426561g2.a(i17, z17, reqUrl, fullUrl)) {
            return true;
        }
        super.s(i17, z17, reqUrl, fullUrl);
        return false;
    }

    public final boolean v(android.net.Uri uri) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f426451c.W1;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
            throw null;
        }
        java.util.ArrayList<java.lang.String> m151221x550c113f = ((of1.w1) oVar).m151221x550c113f();
        if (m151221x550c113f == null || m151221x550c113f.isEmpty()) {
            return false;
        }
        java.lang.String scheme = uri != null ? uri.getScheme() : null;
        if (!(scheme == null || scheme.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(scheme, "http") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(scheme, "https"))) {
            java.lang.String host = uri != null ? uri.getHost() : null;
            if (!(host == null || host.length() == 0) && !m151221x550c113f.contains(host)) {
                return true;
            }
        }
        return false;
    }
}
