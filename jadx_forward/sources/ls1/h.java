package ls1;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final r45.wm6 f402521b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f402522c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3 f402523d;

    public h(r45.wm6 tmplParams, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 viewWV) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplParams, "tmplParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWV, "viewWV");
        this.f402521b = tmplParams;
        this.f402522c = viewWV;
        this.f402523d = new ls1.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 d() {
        return this.f402523d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, com.p314xaae8f345.p3210x3857dc.x0 request) {
        ls1.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.String uri = request.mo120512xb5887639().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        r45.wm6 wm6Var = this.f402521b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uri, wm6Var.f470827f)) {
            java.lang.String PREFIX = is1.l.f375958c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PREFIX, "PREFIX");
            if (!r26.i0.y(uri, PREFIX, false)) {
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewController", "getResourceResponse, requrl:%s, url:%s", uri, wm6Var.f470828g);
        if (request.mo120514xa25f36b5()) {
            java.lang.String initFilePath = wm6Var.f470828g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(initFilePath, "initFilePath");
            fVar = new ls1.f(initFilePath, false);
        } else {
            java.lang.String HARDCODE_URL = is1.l.f375957b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(HARDCODE_URL, "HARDCODE_URL");
            if (r26.i0.y(uri, HARDCODE_URL, false)) {
                int i17 = wm6Var.f470825d;
                java.lang.String uid = wm6Var.f470830i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uid, "uid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(HARDCODE_URL, "HARDCODE_URL");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile(HARDCODE_URL);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                java.lang.String replaceFirst = compile.matcher(uri).replaceFirst("");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceFirst, "replaceFirst(...)");
                fVar = new ls1.f(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.x1.b(i17, uid, replaceFirst), true);
            } else {
                java.lang.String PREFIX2 = is1.l.f375958c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PREFIX2, "PREFIX");
                if (r26.i0.y(uri, PREFIX2, false)) {
                    int i18 = wm6Var.f470825d;
                    java.lang.String uid2 = wm6Var.f470830i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uid2, "uid");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PREFIX2, "PREFIX");
                    java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile(PREFIX2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
                    java.lang.String replaceFirst2 = compile2.matcher(uri).replaceFirst("");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceFirst2, "replaceFirst(...)");
                    fVar = new ls1.f(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.x1.b(i18, uid2, replaceFirst2), true);
                } else {
                    fVar = null;
                }
            }
        }
        if (fVar != null) {
            com.p314xaae8f345.p3210x3857dc.y0 a17 = ls1.c.a(ls1.e0.f402507i2, this.f402522c, fVar.f402516a);
            if (a17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewController", "return intercepted success");
                return a17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewController", "return intercepted null");
            ax4.a.b(wm6Var.f470833o, 126, 1, true);
            if (fVar.f402517b) {
                ax4.a.b(wm6Var.f470833o, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, 1, true);
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean m(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = c();
        ls1.e0 e0Var = c17 instanceof ls1.e0 ? (ls1.e0) c17 : null;
        if (e0Var == null) {
            return false;
        }
        if (!e0Var.p0(e0Var.f263466i0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(url), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(e0Var.i()))) {
            if (!e0Var.p0(-121)) {
                return false;
            }
            java.lang.String k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(url);
            java.lang.String str = e0Var.X1;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullUrl");
                throw null;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k17, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(str))) {
                return false;
            }
        }
        if (!c().M()) {
            return false;
        }
        java.util.Iterator it = e0Var.Z.iterator();
        while (it.hasNext()) {
            pm0.v.X(new ls1.g((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3) it.next()));
        }
        e0Var.f263454c0 = true;
        e0Var.V0(e0Var.E1(url), true, 8);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, com.p314xaae8f345.p3210x3857dc.x0 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 c17 = c();
        ls1.e0 e0Var = c17 instanceof ls1.e0 ? (ls1.e0) c17 : null;
        if (e0Var != null && request.mo120514xa25f36b5() && request.mo120512xb5887639() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "edw opt, shouldOverride url isForMainFrame");
            java.lang.String uri = request.mo120512xb5887639().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
            java.lang.String HARDCODE_URL = ax4.a.f96647a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(HARDCODE_URL, "HARDCODE_URL");
            if (!r26.i0.y(uri, HARDCODE_URL, false) && c().M()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "edw opt, shouldOverride url exitTmpl");
                e0Var.H1();
                e0Var.f263454c0 = true;
            }
        }
        return super.q(webView, request);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        if (i17 == 0 && hy4.i.p(fullUrl) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(reqUrl), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(fullUrl))) {
            return true;
        }
        super.s(i17, z17, reqUrl, fullUrl);
        return false;
    }
}
