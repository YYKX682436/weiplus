package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class f6 extends com.tencent.mm.plugin.appbrand.ui.hc implements com.tencent.mm.plugin.appbrand.ui.xc {
    public final com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo A;
    public final k91.b1 B;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f89704x;

    /* renamed from: y, reason: collision with root package name */
    public al1.k0 f89705y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f89706z;

    public f6(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo) {
        super(context);
        this.f89704x = o6Var;
        this.A = wxaAttributes$WxaVersionInfo;
        this.B = M(o6Var.u0());
        K(context);
    }

    public static k91.b1 M(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        if (appBrandInitConfigWC.L1.c()) {
            return appBrandInitConfigWC.L1.f77370t;
        }
        if (appBrandInitConfigWC.g()) {
            return k91.b1.f305542f;
        }
        k91.b1 b1Var = appBrandInitConfigWC.E2;
        return b1Var != null ? b1Var : k91.b1.f305540d;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc
    public java.lang.String D() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandPluginLoadingSplash:");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89704x;
        sb6.append(o6Var == null ? "null" : o6Var.f74803n);
        return sb6.toString();
    }

    public final void K(android.content.Context context) {
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        com.tencent.mm.plugin.appbrand.ui.kd kdVar = new com.tencent.mm.plugin.appbrand.ui.kd(context);
        this.f89705y = kdVar;
        kdVar.setBackgroundColor(i65.a.d(context, com.tencent.mm.R.color.a9e));
        addView(this.f89705y.getActionView());
        L();
    }

    public void L() {
        int color;
        int color2;
        int i17;
        int i18;
        ((com.tencent.mm.plugin.appbrand.ui.kd) this.f89705y).getClass();
        com.tencent.mm.plugin.appbrand.ui.d6 d6Var = new com.tencent.mm.plugin.appbrand.ui.d6(this);
        this.f89705y.setCloseButtonClickListener(d6Var);
        this.f89705y.setBackButtonClickListener(d6Var);
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89704x;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var == null ? null : o6Var.u0();
        java.lang.String str = "white";
        if (u07 != null && u07.L1.c()) {
            k91.b1 b17 = u07.L1.b();
            k91.b1 b1Var = k91.b1.f305542f;
            if (b17 == b1Var || u07.L1.b() == k91.b1.f305541e) {
                if (u07.L1.b() == b1Var) {
                    i18 = android.graphics.Color.parseColor("#191919");
                    i17 = android.graphics.Color.parseColor("#CCFFFFFF");
                    str = "black";
                } else {
                    i18 = getContext().getResources().getColor(com.tencent.mm.R.color.f478553an);
                    i17 = getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
                }
                this.f89705y.setLoadingIconVisibility(false);
                this.f89705y.setMainTitle(getContext().getString(com.tencent.mm.R.string.it));
                this.f89705y.setForegroundStyle(str);
                this.f89705y.setForegroundColor(i17);
                B(i18, "black".equals(str), true);
                k(i18);
            }
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.A;
        if (wxaAttributes$WxaVersionInfo == null) {
            color = N() ? b3.l.getColor(getContext(), com.tencent.mm.R.color.f478514w) : b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_BG_100);
            color2 = N() ? b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8) : b3.l.getColor(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
        } else {
            if (!N()) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaVersionInfo.f77460w)) {
                    i18 = b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_BG_100);
                } else {
                    java.lang.String str2 = wxaAttributes$WxaVersionInfo.f77460w;
                    int color3 = getContext().getResources().getColor(com.tencent.mm.R.color.f478491c);
                    try {
                        color3 = ik1.w.l(str2);
                    } catch (java.lang.Exception unused) {
                    }
                    i18 = color3;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaVersionInfo.f77459v)) {
                    i17 = b3.l.getColor(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
                } else {
                    java.lang.String str3 = wxaAttributes$WxaVersionInfo.f77459v;
                    int color4 = getContext().getResources().getColor(com.tencent.mm.R.color.a0c);
                    try {
                        i17 = ik1.w.l(str3);
                    } catch (java.lang.Exception unused2) {
                        i17 = color4;
                    }
                }
                str = "black";
                this.f89705y.setMainTitle(getContext().getString(com.tencent.mm.R.string.it));
                this.f89705y.setForegroundStyle(str);
                this.f89705y.setForegroundColor(i17);
                B(i18, "black".equals(str), true);
                k(i18);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaVersionInfo.f77462y)) {
                color = b3.l.getColor(getContext(), com.tencent.mm.R.color.f478514w);
            } else {
                java.lang.String str4 = wxaAttributes$WxaVersionInfo.f77462y;
                color = getContext().getResources().getColor(com.tencent.mm.R.color.f478491c);
                try {
                    color = ik1.w.l(str4);
                } catch (java.lang.Exception unused3) {
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wxaAttributes$WxaVersionInfo.f77461x)) {
                java.lang.String str5 = wxaAttributes$WxaVersionInfo.f77461x;
                i17 = getContext().getResources().getColor(com.tencent.mm.R.color.a0c);
                try {
                    i17 = ik1.w.l(str5);
                } catch (java.lang.Exception unused4) {
                }
                i18 = color;
                this.f89705y.setMainTitle(getContext().getString(com.tencent.mm.R.string.it));
                this.f89705y.setForegroundStyle(str);
                this.f89705y.setForegroundColor(i17);
                B(i18, "black".equals(str), true);
                k(i18);
            }
            color2 = b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8);
        }
        i17 = color2;
        i18 = color;
        this.f89705y.setMainTitle(getContext().getString(com.tencent.mm.R.string.it));
        this.f89705y.setForegroundStyle(str);
        this.f89705y.setForegroundColor(i17);
        B(i18, "black".equals(str), true);
        k(i18);
    }

    public final boolean N() {
        int ordinal = this.B.ordinal();
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            return com.tencent.mm.ui.bk.C();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        this.f89705y.setMainTitle(getContext().getString(com.tencent.mm.R.string.it));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
        setBackgroundColor(e3.b.g(i17, getContext().getResources().getColor(com.tencent.mm.R.color.f478491c)));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.xc
    public void l(yz5.a aVar) {
        this.f89706z = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        post(new com.tencent.mm.plugin.appbrand.ui.e6(this, aVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, android.view.View
    public final boolean post(java.lang.Runnable runnable) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this)) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89704x;
            if (o6Var != null && o6Var.a2()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
                return true;
            }
        }
        return super.post(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, android.view.View
    public final boolean postDelayed(java.lang.Runnable runnable, long j17) {
        boolean z17 = false;
        if (runnable == null) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this)) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89704x;
            if (o6Var != null && o6Var.a2()) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
                return true;
            }
        }
        return super.postDelayed(runnable, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    public void setBackButtonVisibility(boolean z17) {
        this.f89705y.setNavHidden(!z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setCanShowHideAnimation(boolean z17) {
    }

    public void setLoadingIconVisibility(boolean z17) {
        this.f89705y.setLoadingIconVisibility(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
    }

    public f6(android.content.Context context, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo) {
        super(context);
        this.f89704x = null;
        this.A = wxaAttributes$WxaVersionInfo;
        this.B = M(appBrandInitConfigWC);
        K(context);
    }
}
