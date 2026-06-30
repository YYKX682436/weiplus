package aw4;

/* loaded from: classes8.dex */
public class u extends com.tencent.xweb.h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f14904c = kz5.z.D0(new java.lang.Integer[]{0, 6, 10});

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f14905d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f14906a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14907b;

    public u(int i17) {
        this.f14906a = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.xweb.y0 C(com.tencent.xweb.WebView r14, com.tencent.xweb.x0 r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.u.C(com.tencent.xweb.WebView, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }

    public final void D(java.lang.String str, java.lang.String str2) {
        vu4.j jVar;
        java.lang.String str3;
        int i17 = this.f14906a;
        try {
            uv4.g g17 = com.tencent.mm.plugin.websearch.l2.g(i17);
            if (g17 != null) {
                uv4.b bVar = (uv4.b) g17;
                int b17 = bVar.b();
                java.lang.String str4 = bVar.f431422f;
                if (kotlin.jvm.internal.o.b(str4, "_udr")) {
                    jVar = vu4.j.f440340g;
                } else if (kotlin.jvm.internal.o.b(str4, "")) {
                    int i18 = bVar.f431417a;
                    jVar = b17 > (i18 != 0 ? i18 != 6 ? i18 != 10 ? 1 : 50000132 : 60000069 : 80211606) ? vu4.j.f440339f : vu4.j.f440338e;
                } else {
                    jVar = vu4.j.f440338e;
                }
            } else {
                jVar = vu4.j.f440338e;
            }
            vu4.j jVar2 = jVar;
            int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchTemplateUseUdr());
            if (g17 == null || (str3 = g17.l()) == null) {
                str3 = com.eclipsesource.mmv8.Platform.UNKNOWN;
            }
            java.lang.String str5 = str3;
            int b18 = g17 != null ? g17.b() : 1;
            new vu4.i(vu4.h.f440329g, jVar2, str, c17, b18, this.f14906a).a();
            if (kotlin.jvm.internal.o.b(str, ya.b.SUCCESS)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchClient", "Template displayed successfully - type: %d, packageType: %s, h5Version: %d, expt: %d, path: %s, message: %s", java.lang.Integer.valueOf(i17), jVar2.name(), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(c17), str5, str2);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchClient", "Template display failed - type: %d, packageType: %s, h5Version: %d, expt: %d, result: %s, path: %s, message: %s", java.lang.Integer.valueOf(i17), jVar2.name(), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(c17), str, str5, str2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchClient", e17, "reportTemplate failed", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        int i17 = this.f14906a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchClient", "onPageFinished: url=%s, templateType=%d", str, java.lang.Integer.valueOf(i17));
        if (this.f14907b || !f14904c.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "file://", false)) {
            z17 = true;
        }
        if (z17) {
            this.f14907b = true;
            D(ya.b.SUCCESS, "page finished successfully");
        }
    }

    @Override // com.tencent.xweb.h1
    public void q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.w0 w0Var) {
        java.lang.String str;
        java.lang.CharSequence a17;
        java.lang.String uri;
        if (this.f14907b || !f14904c.contains(java.lang.Integer.valueOf(this.f14906a))) {
            return;
        }
        if (x0Var != null && x0Var.isForMainFrame()) {
            android.net.Uri url = x0Var.getUrl();
            if ((url == null || (uri = url.toString()) == null || !r26.i0.y(uri, "file://", false)) ? false : true) {
                this.f14907b = true;
                int b17 = w0Var != null ? w0Var.b() : -1;
                if (w0Var == null || (a17 = w0Var.a()) == null || (str = a17.toString()) == null) {
                    str = "unknown error";
                }
                D("fail:" + b17 + ':' + str, "error_code=" + b17 + ", desc=" + str);
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchClient", "Template load error - type: %d, url: %s, errorCode: %d, desc: %s", java.lang.Integer.valueOf(this.f14906a), x0Var.getUrl(), java.lang.Integer.valueOf(b17), str);
                if (f14905d.compareAndSet(false, true)) {
                    ((ku5.t0) ku5.t0.f312615d).g(new aw4.t(this));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: already running, skip");
                }
            }
        }
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        com.tencent.xweb.y0 C = C(webView, x0Var);
        return C == null ? super.x(webView, x0Var) : C;
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        com.tencent.xweb.y0 C = C(webView, x0Var);
        if (C == null) {
            return null;
        }
        return C;
    }
}
