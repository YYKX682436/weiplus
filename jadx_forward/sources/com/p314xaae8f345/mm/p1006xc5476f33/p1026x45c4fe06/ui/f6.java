package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class f6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 A;
    public final k91.b1 B;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f171237x;

    /* renamed from: y, reason: collision with root package name */
    public al1.k0 f171238y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f171239z;

    public f6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553) {
        super(context);
        this.f171237x = o6Var;
        this.A = c11829x68027553;
        this.B = M(o6Var.u0());
        K(context);
    }

    public static k91.b1 M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        if (c11809xbc286be4.L1.c()) {
            return c11809xbc286be4.L1.f158903t;
        }
        if (c11809xbc286be4.g()) {
            return k91.b1.f387075f;
        }
        k91.b1 b1Var = c11809xbc286be4.E2;
        return b1Var != null ? b1Var : k91.b1.f387073d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc
    public java.lang.String D() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandPluginLoadingSplash:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f171237x;
        sb6.append(o6Var == null ? "null" : o6Var.f156336n);
        return sb6.toString();
    }

    public final void K(android.content.Context context) {
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd kdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd(context);
        this.f171238y = kdVar;
        kdVar.mo134899x67f06213(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        addView(this.f171238y.mo2206x5ca2d9f1());
        L();
    }

    public void L() {
        int m9702x7444d5ad;
        int m9702x7444d5ad2;
        int i17;
        int i18;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.kd) this.f171238y).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d6 d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d6(this);
        this.f171238y.mo2218x262881b4(d6Var);
        this.f171238y.mo2215x1ae0b121(d6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f171237x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var == null ? null : o6Var.u0();
        java.lang.String str = "white";
        if (u07 != null && u07.L1.c()) {
            k91.b1 b17 = u07.L1.b();
            k91.b1 b1Var = k91.b1.f387075f;
            if (b17 == b1Var || u07.L1.b() == k91.b1.f387074e) {
                if (u07.L1.b() == b1Var) {
                    i18 = android.graphics.Color.parseColor("#191919");
                    i17 = android.graphics.Color.parseColor("#CCFFFFFF");
                    str = "black";
                } else {
                    i18 = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                    i17 = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96);
                }
                this.f171238y.mo2223x5b5c5185(false);
                this.f171238y.mo2224x4c2b09dd(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.it));
                this.f171238y.mo2220xf5e6816c(str);
                this.f171238y.mo2219xf502931e(i17);
                B(i18, "black".equals(str), true);
                k(i18);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = this.A;
        if (c11829x68027553 == null) {
            m9702x7444d5ad = N() ? b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w) : b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621);
            m9702x7444d5ad2 = N() ? b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230) : b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96);
        } else {
            if (!N()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11829x68027553.f158993w)) {
                    i18 = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621);
                } else {
                    java.lang.String str2 = c11829x68027553.f158993w;
                    int color = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                    try {
                        color = ik1.w.l(str2);
                    } catch (java.lang.Exception unused) {
                    }
                    i18 = color;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11829x68027553.f158992v)) {
                    i17 = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96);
                } else {
                    java.lang.String str3 = c11829x68027553.f158992v;
                    int color2 = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
                    try {
                        i17 = ik1.w.l(str3);
                    } catch (java.lang.Exception unused2) {
                        i17 = color2;
                    }
                }
                str = "black";
                this.f171238y.mo2224x4c2b09dd(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.it));
                this.f171238y.mo2220xf5e6816c(str);
                this.f171238y.mo2219xf502931e(i17);
                B(i18, "black".equals(str), true);
                k(i18);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11829x68027553.f158995y)) {
                m9702x7444d5ad = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w);
            } else {
                java.lang.String str4 = c11829x68027553.f158995y;
                m9702x7444d5ad = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                try {
                    m9702x7444d5ad = ik1.w.l(str4);
                } catch (java.lang.Exception unused3) {
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11829x68027553.f158994x)) {
                java.lang.String str5 = c11829x68027553.f158994x;
                i17 = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
                try {
                    i17 = ik1.w.l(str5);
                } catch (java.lang.Exception unused4) {
                }
                i18 = m9702x7444d5ad;
                this.f171238y.mo2224x4c2b09dd(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.it));
                this.f171238y.mo2220xf5e6816c(str);
                this.f171238y.mo2219xf502931e(i17);
                B(i18, "black".equals(str), true);
                k(i18);
            }
            m9702x7444d5ad2 = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
        }
        i17 = m9702x7444d5ad2;
        i18 = m9702x7444d5ad;
        this.f171238y.mo2224x4c2b09dd(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.it));
        this.f171238y.mo2220xf5e6816c(str);
        this.f171238y.mo2219xf502931e(i17);
        B(i18, "black".equals(str), true);
        k(i18);
    }

    public final boolean N() {
        int ordinal = this.B.ordinal();
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            return com.p314xaae8f345.mm.ui.bk.C();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: getView */
    public android.view.View mo52965xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        this.f171238y.mo2224x4c2b09dd(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.it));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void k(int i17) {
        setBackgroundColor(e3.b.g(i17, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc
    public void l(yz5.a aVar) {
        this.f171239z = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void n(yz5.a aVar) {
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e6(this, aVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, android.view.View
    public final boolean post(java.lang.Runnable runnable) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f171237x;
            if (o6Var != null && o6Var.a2()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
                return true;
            }
        }
        return super.post(runnable);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, android.view.View
    public final boolean postDelayed(java.lang.Runnable runnable, long j17) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f171237x;
            if (o6Var != null && o6Var.a2()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
                return true;
            }
        }
        return super.postDelayed(runnable, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setAppServiceType */
    public /* bridge */ /* synthetic */ void mo52967xf31bdbb0(int i17) {
    }

    /* renamed from: setBackButtonVisibility */
    public void m52984x5ca1166d(boolean z17) {
        this.f171238y.mo2227x506dbe6b(!z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setCanShowHideAnimation */
    public /* bridge */ /* synthetic */ void mo52968x5fa745f7(boolean z17) {
    }

    /* renamed from: setLoadingIconVisibility */
    public void m52985x5b5c5185(boolean z17) {
        this.f171238y.mo2223x5b5c5185(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setProgress */
    public void mo52970x3ae760af(int i17) {
    }

    public f6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553) {
        super(context);
        this.f171237x = null;
        this.A = c11829x68027553;
        this.B = M(c11809xbc286be4);
        K(context);
    }
}
