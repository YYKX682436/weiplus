package aw4;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f96437c = kz5.z.D0(new java.lang.Integer[]{0, 6, 10});

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f96438d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f96439a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f96440b;

    public u(int i17) {
        this.f96439a = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p3210x3857dc.y0 C(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 r14, com.p314xaae8f345.p3210x3857dc.x0 r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.u.C(com.tencent.xweb.WebView, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }

    public final void D(java.lang.String str, java.lang.String str2) {
        vu4.j jVar;
        java.lang.String str3;
        int i17 = this.f96439a;
        try {
            uv4.g g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i17);
            if (g17 != null) {
                uv4.b bVar = (uv4.b) g17;
                int b17 = bVar.b();
                java.lang.String str4 = bVar.f512955f;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "_udr")) {
                    jVar = vu4.j.f521873g;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "")) {
                    int i18 = bVar.f512950a;
                    jVar = b17 > (i18 != 0 ? i18 != 6 ? i18 != 10 ? 1 : 50000132 : 60000069 : 80211606) ? vu4.j.f521872f : vu4.j.f521871e;
                } else {
                    jVar = vu4.j.f521871e;
                }
            } else {
                jVar = vu4.j.f521871e;
            }
            vu4.j jVar2 = jVar;
            int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20691x38805a76());
            if (g17 == null || (str3 = g17.l()) == null) {
                str3 = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
            }
            java.lang.String str5 = str3;
            int b18 = g17 != null ? g17.b() : 1;
            new vu4.i(vu4.h.f521862g, jVar2, str, c17, b18, this.f96439a).a();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ya.b.f77504xbb80cbe3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchClient", "Template displayed successfully - type: %d, packageType: %s, h5Version: %d, expt: %d, path: %s, message: %s", java.lang.Integer.valueOf(i17), jVar2.name(), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(c17), str5, str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchClient", "Template display failed - type: %d, packageType: %s, h5Version: %d, expt: %d, result: %s, path: %s, message: %s", java.lang.Integer.valueOf(i17), jVar2.name(), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(c17), str, str5, str2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchClient", e17, "reportTemplate failed", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        int i17 = this.f96439a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchClient", "onPageFinished: url=%s, templateType=%d", str, java.lang.Integer.valueOf(i17));
        if (this.f96440b || !f96437c.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        boolean z17 = false;
        if (str != null && r26.i0.y(str, "file://", false)) {
            z17 = true;
        }
        if (z17) {
            this.f96440b = true;
            D(ya.b.f77504xbb80cbe3, "page finished successfully");
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.w0 w0Var) {
        java.lang.String str;
        java.lang.CharSequence a17;
        java.lang.String uri;
        if (this.f96440b || !f96437c.contains(java.lang.Integer.valueOf(this.f96439a))) {
            return;
        }
        if (x0Var != null && x0Var.mo120514xa25f36b5()) {
            android.net.Uri mo120512xb5887639 = x0Var.mo120512xb5887639();
            if ((mo120512xb5887639 == null || (uri = mo120512xb5887639.toString()) == null || !r26.i0.y(uri, "file://", false)) ? false : true) {
                this.f96440b = true;
                int b17 = w0Var != null ? w0Var.b() : -1;
                if (w0Var == null || (a17 = w0Var.a()) == null || (str = a17.toString()) == null) {
                    str = "unknown error";
                }
                D("fail:" + b17 + ':' + str, "error_code=" + b17 + ", desc=" + str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchClient", "Template load error - type: %d, url: %s, errorCode: %d, desc: %s", java.lang.Integer.valueOf(this.f96439a), x0Var.mo120512xb5887639(), java.lang.Integer.valueOf(b17), str);
                if (f96438d.compareAndSet(false, true)) {
                    ((ku5.t0) ku5.t0.f394148d).g(new aw4.t(this));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchClient", "triggerTemplateIntegrityCheck: already running, skip");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 x(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        com.p314xaae8f345.p3210x3857dc.y0 C = C(c27816xac2547f9, x0Var);
        return C == null ? super.x(c27816xac2547f9, x0Var) : C;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 y(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, android.os.Bundle bundle) {
        com.p314xaae8f345.p3210x3857dc.y0 C = C(c27816xac2547f9, x0Var);
        if (C == null) {
            return null;
        }
        return C;
    }
}
