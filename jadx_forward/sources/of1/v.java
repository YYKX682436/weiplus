package of1;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o f426547e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f426548f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f426549g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.n f426550h;

    /* renamed from: i, reason: collision with root package name */
    public final nf.k f426551i;

    /* renamed from: j, reason: collision with root package name */
    public final nf.n f426552j;

    /* renamed from: k, reason: collision with root package name */
    public of1.u f426553k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f426554l;

    public v(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar, yz5.a aVar, boolean z17) {
        super(c22633x83752a59);
        this.f426550h = new of1.p(this);
        this.f426551i = new of1.q(this);
        this.f426552j = new of1.r(this);
        this.f426547e = oVar;
        this.f426548f = aVar;
        this.f426549g = z17;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        cf.o.a(consoleMessage, "MicroMsg.AppBrand.HTMLWebChromeClient", false);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean c(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f426547e;
        if (((of1.w1) oVar).v0()) {
            if (this.f426553k == null) {
                this.f426553k = new of1.u(this, null);
            }
            of1.u uVar = this.f426553k;
            android.content.Context mo50352x76847179 = ((of1.w1) oVar).m151232xaf156f4a().mo50352x76847179();
            uVar.getClass();
            android.content.ComponentCallbacks2 a17 = q75.a.a(mo50352x76847179);
            if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.c) a17;
                uVar.f426543a = cVar;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) cVar).U.add(uVar);
            }
        }
        java.lang.String m151219x74292566 = ((of1.w1) oVar).m151219x74292566();
        of1.s sVar = new of1.s(this);
        this.f426554l = sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(m151219x74292566, sVar);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.c cVar;
        of1.u uVar = this.f426553k;
        if (uVar != null && (cVar = uVar.f426543a) != null) {
            ((java.util.HashSet) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) cVar).U).remove(uVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f426547e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(((of1.w1) oVar).m151219x74292566(), this.f426554l);
        oVar.m51535x3498a0(new of1.t(this));
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2, com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        if (!this.f426549g) {
            super.g(str, callback);
        } else if (callback != null) {
            callback.invoke(str, true, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2, com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        of1.w1 w1Var = (of1.w1) this.f426547e;
        w1Var.getClass();
        if (!android.webkit.URLUtil.isValidUrl(str)) {
            w1Var.f426567e.e3(str);
        } else if (u46.l.a(str, w1Var.f426572m) || u46.l.a(str, w1Var.f426573n)) {
            w1Var.f426567e.e3("");
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, android.webkit.ValueCallback valueCallback, com.p314xaae8f345.p3210x3857dc.r0 r0Var) {
        nf.g a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w) this.f426548f.mo152xb9724478();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = this.f426547e;
        android.app.Activity v17 = ((of1.w1) oVar).m151232xaf156f4a() != null ? ((of1.w1) oVar).m151232xaf156f4a().v1() : null;
        if (wVar != null && v17 != null) {
            if (r0Var.c() != 0 && r0Var.c() != 1) {
                return false;
            }
            if (r0Var.b() != null && r0Var.b().length > 0) {
                java.lang.String[] b17 = r0Var.b();
                java.lang.String str = r0Var.d() ? "true" : "false";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebChromeClient", "onShowFileChooser mode: %d, catpure: %s", java.lang.Integer.valueOf(r0Var.c()), java.lang.Boolean.valueOf(r0Var.d()));
                of1.w1 w1Var = (of1.w1) oVar;
                android.app.Activity v18 = w1Var.m151232xaf156f4a() != null ? w1Var.m151232xaf156f4a().v1() : null;
                if (v18 != null && (a17 = nf.g.a(v18)) != null) {
                    a17.f(this.f426551i);
                    nf.n nVar = this.f426552j;
                    if (nVar != null) {
                        a17.f418116b.put(119, nVar);
                    }
                }
                this.f426550h.c(v17, wVar, valueCallback, b17, str, r0Var.a(), r0Var.c());
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLWebChromeClient", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2
    public void s() {
        of1.w1 w1Var = (of1.w1) this.f426547e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w17 = w1Var.f426567e.w1();
        if (w17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = w1Var.f426566d.x0();
        x07.getClass();
        x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l3(x07, w17, "scene_other", null));
    }

    public final void t() {
        nf.g a17;
        of1.w1 w1Var = (of1.w1) this.f426547e;
        android.app.Activity v17 = w1Var.m151232xaf156f4a() != null ? w1Var.m151232xaf156f4a().v1() : null;
        if (v17 == null || (a17 = nf.g.a(v17)) == null) {
            return;
        }
        nf.k kVar = this.f426551i;
        if (kVar != null) {
            a17.f418117c.remove(kVar);
        }
        if (this.f426552j == null) {
            return;
        }
        a17.f418116b.remove(119);
    }
}
