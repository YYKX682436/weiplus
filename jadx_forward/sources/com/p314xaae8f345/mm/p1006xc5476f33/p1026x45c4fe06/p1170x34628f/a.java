package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class a extends re.a implements com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.o, ni1.d {

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f167904f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb f167905g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f167906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167907i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167908m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 f167909n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib f167910o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia f167911p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd f167912q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f167913r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l f167914s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb f167915t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i f167916u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ob f167917v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f167918w;

    public a(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        super(bVar);
        this.f167906h = false;
        this.f167907i = false;
        this.f167918w = false;
    }

    public static int K(k91.f fVar, boolean z17, k91.z3 z3Var, boolean z18) {
        k91.z3 z3Var2 = k91.z3.TRANSPARENT;
        int i17 = 0;
        int i18 = z3Var == z3Var2 ? 0 : z17 ? -15132391 : -1;
        try {
            i18 = ik1.w.l(fVar.f387252h);
        } catch (java.lang.Exception unused) {
        }
        if (z3Var != z3Var2 && !z18) {
            i17 = -16777216;
        }
        return i17 | i18;
    }

    @Override // ni1.d
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb D(android.content.Context context) {
        if (context == null) {
            context = I();
        }
        this.f167905g = S(context);
        if (java.lang.System.currentTimeMillis() % 1000 == 1 || z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "do observeLongTask");
            this.f167905g.mo14658x74041feb(M(), "PageLongTaskReporter");
            this.f167913r = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar = this.f167905g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l(this, context);
        this.f167914s = lVar;
        fbVar.mo14658x74041feb(lVar, "__deviceInfo");
        return this.f167905g;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.v M() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.f(this);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i N(java.lang.String str) {
        if (this.f167916u == null) {
            this.f167916u = T();
            this.f167917v = U();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "getInjectionMode created mode name = %s, appId = %s, reason = %s", this.f167916u.mo52165x337a8b(), H(), str);
        }
        return this.f167916u;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb O() {
        if (this.f167915t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb R = R();
            this.f167915t = R;
            if (R == null) {
                this.f167915t = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pb(this);
            }
        }
        return this.f167915t;
    }

    public final void P(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AbstractMPPageViewRenderer", "[!]injectScript appId[%s] name[%s] url[%s] hash[%d] source EMPTY", H(), str, this.f167908m, java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
        nVar.f128885i = str;
        nVar.f128886j = str2;
        nVar.f128887k = str2.length();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int f17 = sj1.l.f(H(), "public:inject", "代码注入-" + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "injectScript start, appId[%s] name[%s] url[%s] hash[%d]", H(), str, this.f167908m, java.lang.Integer.valueOf(hashCode()));
        java.net.URL url = null;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AbstractMPPageViewRenderer", "[!] injectScript, valid name is required, appId:%s, url:%s", H(), this.f167908m);
            } else {
                url = new java.net.URL("https", com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj), str);
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).getF229341e(), url, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g(this, nVar, currentTimeMillis, f17));
    }

    public final boolean Q() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F();
        return bVar != null && bVar.mo50262x39e05d35();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.hb R() {
        return null;
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb S(android.content.Context context);

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i T() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5.class)).a() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j(this, null) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k(this, null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ob U() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l F = F();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(F);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F).b(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052.class)).f387385r;
        if (((c11667xc7e59dd6 == null || (c11670x2ef26cc7 = c11667xc7e59dd6.f156937i) == null) ? 0 : c11670x2ef26cc7.f156939d.size()) <= 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.nb();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc72 = c11667xc7e59dd6.f156937i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11670x2ef26cc72);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.mb(this, c11670x2ef26cc72);
    }

    public void V(java.lang.String str) {
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).H2(str);
    }

    public void W() {
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t();
    }

    public void X(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }

    public boolean Y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        return (F() == null || !((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).j2()) && ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3().u0().r() != k91.z3.TRANSPARENT && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH == wdVar;
    }

    public boolean Z() {
        return true;
    }

    public boolean a(int i17, java.lang.String str) {
        return false;
    }

    @Override // ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        return false;
    }

    @Override // ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public android.view.View f(android.view.LayoutInflater layoutInflater) {
        return new android.widget.FrameLayout(layoutInflater.getContext().getApplicationContext());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean g() {
        if (android.text.TextUtils.isEmpty(this.f167908m)) {
            this.f167908m = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).X1();
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).Y1();
        } else {
            java.lang.String str = this.f167908m;
            java.lang.String X1 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).X1();
            if ((str != null || X1 != null) && (str == null || !str.equals(X1))) {
                throw new iz5.d("", str, X1);
            }
        }
        return !((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).M0().c(this.f167908m, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    /* renamed from: getCustomViewContainer */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo14692x3eebbc35() {
        return this.f167911p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib i() {
        return this.f167910o;
    }

    public boolean j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        this.f167908m = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).X1();
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).Y1();
        if (Z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = this.f167909n;
            java.util.Objects.requireNonNull(p8Var);
            G(ni1.h.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F(), p8Var));
        }
        this.f167911p.v(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c(this));
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).Z0(wdVar);
        if (Q()) {
            java.util.Objects.requireNonNull((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F());
            java.util.Objects.requireNonNull(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).M1());
            java.util.Objects.requireNonNull(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3());
            this.f167905g.mo14671x67f06213(K(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).M1(), ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3().m0().g(), ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3().u0().r(), false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.tb tbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.tb((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F());
        G(ni1.a.class, tbVar);
        al1.b r17 = tbVar.f168659a.r1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getActionBar(...)");
        tbVar.a(r17);
        if (g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AbstractMPPageViewRenderer", "Empty page content, appId[%s] url[%s], abort inject", H(), str);
            V(str);
            return false;
        }
        if (Y(wdVar)) {
            this.f167912q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd(J().f156328d, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F());
        }
        W();
        if (!this.f167906h) {
            try {
                N("injectAppSharedPageFrameScript").d();
                this.f167906h = true;
            } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 unused) {
            }
        }
        java.lang.String str2 = this.f167908m;
        try {
            N(java.lang.String.format(java.util.Locale.ENGLISH, "injectModuleSharedPageFrameScript(%s)", str2)).a(str2);
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AbstractMPPageViewRenderer", "injectModuleSharedPageFrameScript appId[%s] path[%s] ScriptNotFoundException", H(), str2);
        }
        java.lang.String str3 = this.f167908m;
        try {
            N(java.lang.String.format(java.util.Locale.ENGLISH, "injectPageScript(%s)", str3)).b(str3);
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.AbstractMPPageViewRenderer", "injectPageScript appId[%s] url[%s] ScriptNotFoundException", H(), str3);
        }
        return true;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void k() {
        super.k();
        this.f167905g.c();
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void m() {
        super.m();
        this.f167910o.l(this.f167905g);
        this.f167905g.mo14659x5cd39ffa();
        this.f167905g = null;
        this.f167904f.removeAllViewsInLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = this.f167909n;
        if (p8Var != null) {
            p8Var.removeAllViewsInLayout();
            this.f167909n = null;
        }
        this.f167910o = null;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "dispatchForeground appId:%s, url:%s, mIsPageReady:%b", H(), this.f167908m, java.lang.Boolean.valueOf(this.f167907i));
        super.n();
        this.f167905g.b();
        ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).B3();
        if (this.f167907i || (bdVar = this.f167912q) == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f167904f;
        if (bdVar.getParent() != frameLayout) {
            android.view.View view = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).r1().f87273q;
            boolean z17 = view != null && view.getVisibility() == 0;
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).r1().mo2223x5b5c5185(true);
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).r1().m2228x63bd8add(this.f167912q);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar2 = this.f167912q;
            bdVar2.f167978g = z17;
            if (bdVar2.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f167912q.getParent()).removeView(this.f167912q);
            }
            frameLayout.addView(this.f167912q, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar3 = this.f167912q;
        android.content.Context I = I();
        al1.l lVar = bdVar3.f167976e;
        if (lVar != null) {
            lVar.D(I);
        }
        this.f167912q.b();
        this.f167912q.bringToFront();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "revealWaitingReadyCover appId:%s, url:%s", H(), this.f167908m);
    }

    public java.util.Map p() {
        le.a aVar = new le.a();
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o9());
        aVar.a(new qc1.v());
        aVar.a(new qc1.e());
        aVar.a(new qc1.c());
        aVar.a(new qc1.x());
        aVar.a(new qc1.n());
        aVar.a(new qc1.i());
        aVar.a(new qc1.y());
        aVar.a(new qc1.k());
        aVar.a(new qc1.m());
        aVar.a(new be1.f0());
        aVar.a(new be1.g0());
        aVar.a(new be1.d0());
        aVar.a(new be1.a0());
        aVar.a(new nd1.n());
        aVar.a(new nd1.h0());
        aVar.a(new nd1.g0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.oe());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.l());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.z());
        aVar.a(new nd1.d());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f6());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.a());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.m());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.l());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.h());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.g());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.j());
        aVar.a(new vb1.m());
        aVar.a(new vb1.p());
        aVar.a(new vb1.w());
        aVar.a(new vb1.y());
        aVar.a(new nd1.c());
        aVar.a(new cb1.m0());
        aVar.a(new cb1.a1());
        aVar.a(new cb1.g());
        aVar.a(new cb1.y0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qe());
        aVar.a(new be1.a1());
        aVar.a(new ac1.b());
        aVar.a(new ac1.g());
        aVar.a(new ac1.c());
        aVar.a(new cb1.j0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.y());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.c0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.e0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.p0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.k0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.u());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.m0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.i0());
        aVar.a(new tb1.k0());
        aVar.a(new tb1.t0());
        aVar.a(new tb1.s0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.n());
        aVar.a(new nd1.r0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.x());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.o0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.j0());
        aVar.a(new nd1.j1());
        aVar.a(new nd1.d1());
        aVar.a(new nd1.c2());
        aVar.a(new nd1.j());
        aVar.a(new nd1.t0());
        aVar.a(new nd1.s0());
        java.util.ArrayList arrayList = (java.util.ArrayList) uc1.h2.a();
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) it.next());
            }
        }
        aVar.a(new le1.i());
        aVar.a(new le1.c());
        aVar.a(new nd1.a2());
        aVar.a(new nd1.h());
        aVar.a(new le1.k());
        aVar.a(new le1.f());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.s());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.n());
        aVar.a(new nd1.h1());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.z());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m());
        aVar.a(new be1.b0());
        aVar.a(new be1.w0());
        aVar.a(new be1.j0());
        aVar.a(new be1.x0());
        aVar.a(new nd1.i2());
        aVar.a(new ud1.b());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.x0());
        aVar.a(new nd1.k2());
        aVar.a(new nd1.k1());
        aVar.a(new nd1.j0());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d6());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e6());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.i());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.v());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.n());
        aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b1());
        return aVar.f399643a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public android.widget.RelativeLayout.LayoutParams q(android.view.View view, android.view.View view2) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (view2 != null) {
            if (view2.getId() == -1) {
                view2.setId(com.p314xaae8f345.mm.R.id.f564711yr);
            }
            layoutParams.addRule(2, view2.getId());
        }
        return layoutParams;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.a
    public java.lang.Object r(java.lang.Class cls) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class.equals(cls) ? cls.cast(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).x()) : cls.isInstance(this) ? cls.cast(this) : super.r(cls);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean t() {
        return false;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void v() {
        G(ni1.e.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F()));
        G(ni1.j.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ad((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F()));
        G(ni1.h.class, (ni1.h) java.lang.reflect.Proxy.newProxyInstance(ni1.h.class.getClassLoader(), new java.lang.Class[]{ni1.h.class}, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 pv6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pv6, "pv");
        re.b bVar = new re.b(pv6, null);
        pv6.U(bVar);
        pv6.R(bVar);
        pv6.w(bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "dispatchPageReady appId:%s, url:%s", H(), this.f167908m);
        this.f167907i = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar = this.f167912q;
        if (bdVar != null) {
            bdVar.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar2 = this.f167912q;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(bdVar2)) {
                ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).r1().m2228x63bd8add(null);
                ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).r1().mo2223x5b5c5185(this.f167912q.f167978g);
                ((android.view.ViewGroup) this.f167912q.getParent()).removeView(this.f167912q);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AbstractMPPageViewRenderer", "dismissWaitingReadyCover appId:%s, url:%s", H(), this.f167908m);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd bdVar3 = this.f167912q;
            bdVar3.removeAllViews();
            al1.b bVar = bdVar3.f167977f;
            if (bVar != null) {
                bVar.f();
            }
            this.f167912q = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void z(android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        this.f167904f = frameLayout;
        frameLayout.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b(this));
        this.f167910o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t5((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F());
        if (this.f167905g == null) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).n0();
        }
        this.f167905g.i(I());
        this.f167905g.mo14672xad56317d(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).C1());
        this.f167905g.mo14674x6fa959a(this.f167910o);
        this.f167905g.mo14677x7f6cbb35(this.f167910o);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t5) this.f167910o).b(this.f167905g);
        if (Z()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8(J() != null ? J().f156328d : I(), this.f167905g);
            this.f167909n = p8Var;
            p8Var.addView(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t5) this.f167910o).f173198e);
            this.f167909n.m52210x886a8e0f(this.f167910o);
            this.f167909n.m52209x3876e65c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12500x2ca3e0(this));
            this.f167904f.addView(this.f167909n);
        } else {
            this.f167909n = null;
            this.f167904f.addView(this.f167905g.mo14669x50cdf8a2());
            this.f167904f.addView(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t5) this.f167910o).f173198e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t5) this.f167910o).f173198e);
        this.f167911p = iaVar;
        xi1.m C1 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).C1();
        iaVar.f168297h = C1;
        C1.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z9(iaVar));
    }
}
