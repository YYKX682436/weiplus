package vw4;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f522747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f522748c;

    /* renamed from: d, reason: collision with root package name */
    public int f522749d;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, com.p314xaae8f345.p3210x3857dc.x0 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        try {
            if (this.f522747b && this.f522748c) {
                c().i();
                java.lang.String str = webView.mo120156xb5887639().toString();
                java.lang.String uri = request.mo120512xb5887639().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
                boolean mo120514xa25f36b5 = request.mo120514xa25f36b5();
                java.lang.String str2 = java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode();
                if (mo120514xa25f36b5 && uri.equals(str)) {
                    vw4.b bVar = vw4.b.f522745a;
                    if (bVar.d(uri) && !bVar.b(uri)) {
                        com.p314xaae8f345.p3210x3857dc.y0 a17 = vw4.a.f522744a.a(uri);
                        if (a17 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1951, 6);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: ok      , thread=" + str2 + ", isMainFrame=" + mo120514xa25f36b5 + ", controller=" + c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str);
                            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: default0, thread=" + str2 + ", isMainFrame=" + mo120514xa25f36b5 + ", controller=" + c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str);
                        }
                        return a17;
                    }
                }
                c().hashCode();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept, exp=" + th6);
        }
        super.f(webView, request);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, int i17, java.lang.String description, java.lang.String failingUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failingUrl, "failingUrl");
        try {
            if (this.f522747b && this.f522748c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "interceptLoadError: errorCode" + i17 + ", description" + description + ", failingUrl" + failingUrl);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "interceptLoadError, exp=" + th6);
        }
        super.g(webview, i17, description, failingUrl);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public void h() {
        vw4.b bVar = vw4.b.f522745a;
        this.f522747b = bVar.c();
        this.f522749d = 0;
        java.lang.String i17 = c().i();
        this.f522748c = (i17 == null || i17.length() == 0 ? false : r26.n0.D(i17, "adCgiRedirect=1", false, 2, null)) || bVar.d(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "onAttachController,  isExptEnabled=" + this.f522747b + ", hasFlag=" + this.f522748c + ", this.hash=" + hashCode() + ", controller.hash=" + c().hashCode() + ", thread=" + (java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode()) + ", rawUrl=" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, com.p314xaae8f345.p3210x3857dc.x0 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        try {
            if (this.f522747b && this.f522748c) {
                java.lang.String i17 = c().i();
                java.lang.String str = webView.mo120156xb5887639().toString();
                java.lang.String uri = request.mo120512xb5887639().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
                java.lang.String str2 = java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode();
                vw4.b bVar = vw4.b.f522745a;
                if (bVar.d(uri) && !bVar.b(uri)) {
                    webView.mo32265x141096a9(uri);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl : ok , thread=" + str2 + ", isForMainFrame=" + request.mo120514xa25f36b5() + ", reqUrl=" + uri + ", webUrl=" + str);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3(true, true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl : default, thread=" + str2 + ", isForMainFrame=" + request.mo120514xa25f36b5() + ", reqUrl=" + uri + ", webUrl=" + str);
                int i18 = this.f522749d + 1;
                this.f522749d = i18;
                if (i18 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19789, "ad_h5_multi_override", "", 0, 0, i17);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "overrideUrl, exp=" + th6);
        }
        return super.q(webView, request);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 r(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        try {
            if (this.f522747b && this.f522748c) {
                c().i();
                java.lang.String str = webView.mo120156xb5887639().toString();
                java.lang.String str2 = java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode();
                vw4.b bVar = vw4.b.f522745a;
                if (bVar.d(url) && !bVar.b(url)) {
                    webView.mo32265x141096a9(url);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl2: ok , thread=" + str2 + ", reqUrl=" + url + ", webUrl=" + str);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3(true, true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl2: default, thread=" + str2 + ", reqUrl=" + url + ", webUrl=" + str);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "overrideUrl2, exp=" + th6);
        }
        return super.r(webView, url);
    }
}
