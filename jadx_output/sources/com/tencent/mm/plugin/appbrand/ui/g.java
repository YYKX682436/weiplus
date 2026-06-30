package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class g extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.ui.vc, com.tencent.mm.plugin.appbrand.ui.wc, com.tencent.mm.plugin.appbrand.ui.xc, com.tencent.mm.plugin.appbrand.launching.y4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f89717d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.vc f89718e;

    /* renamed from: f, reason: collision with root package name */
    public i81.q f89719f;

    /* renamed from: g, reason: collision with root package name */
    public final i81.l0 f89720g;

    public g(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.ui.vc vcVar, i81.l0 l0Var) {
        super(context);
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        this.f89717d = o6Var;
        this.f89718e = vcVar;
        this.f89720g = l0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAdLoadingSplash", "initRuntimeAdViewContainer, runtime:%s", o6Var);
        boolean a17 = com.tencent.mm.plugin.appbrand.utils.g0.a();
        i81.q qVar = new i81.q(context, o6Var);
        if (a17) {
            qVar.setBackgroundColor(0);
            qVar.setVisibility(8);
        } else {
            nf.y yVar = nf.x.f336616b;
            if (yVar != null ? yVar.isDarkMode() : false) {
                qVar.setBackgroundColor(-16777216);
            } else {
                qVar.setBackgroundColor(-1);
            }
        }
        this.f89719f = qVar;
        qVar.b();
        i81.b bVar = this.f89719f.f289608g;
        if (bVar != null) {
            bVar.a(true, al1.h0.PageConfig);
        }
        this.f89719f.setForegroundStyle(false);
        this.f89719f.setCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.ui.c(this));
        this.f89719f.setOnHideListener(new com.tencent.mm.plugin.appbrand.ui.d(this));
        this.f89719f.setOptionButtonClickListener(new com.tencent.mm.plugin.appbrand.ui.e(this));
        i81.j.c(this.f89719f);
        if (vcVar != null) {
            addView(vcVar.getView(), new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        i81.q qVar2 = this.f89719f;
        if (qVar2 != null) {
            addView(qVar2, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.y4
    public void E(int i17) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar instanceof com.tencent.mm.plugin.appbrand.launching.y4) {
            ((com.tencent.mm.plugin.appbrand.launching.y4) vcVar).E(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.zc
    public void a() {
        i81.q qVar = this.f89719f;
        if (qVar != null) {
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                qVar.setVisibility(8);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new i81.n(qVar));
            }
        }
    }

    public final void b(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89717d;
        if (o6Var.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
            android.app.Activity w17 = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) o6Var.getWindowAndroid()).w();
            boolean z17 = configuration.orientation == 2;
            if ((z17 && w17 != null && w17.isInMultiWindowMode() && w17.getRequestedOrientation() == 1) || w17 == null) {
                return;
            }
            android.view.Window window = w17.getWindow();
            android.view.View decorView = window.getDecorView();
            if (z17) {
                window.addFlags(1024);
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
            } else {
                if (o6Var.q2()) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.ui.na.h(window, false, false);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wc
    public boolean d() {
        i81.q qVar = this.f89719f;
        return qVar != null && indexOfChild(qVar) >= 0 && this.f89719f.getVisibility() == 0 && i81.a0.a(this.f89717d).f289557a;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.zc
    public void e(boolean z17, java.lang.String str, com.tencent.mm.plugin.appbrand.ui.yc ycVar) {
        i81.q qVar = this.f89719f;
        if (qVar != null) {
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                qVar.a(z17, str, ycVar);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(new i81.l(qVar, z17, str, ycVar));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.zc
    public void g(yz5.a aVar) {
        i81.l0 l0Var = this.f89720g;
        if (l0Var != null) {
            final i81.b0 b0Var = (i81.b0) l0Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, ShowAdState: %d, isSplashAdFinished:%s, canLoadingSplashFinish:%s", java.lang.Integer.valueOf(b0Var.f289528e), java.lang.Boolean.valueOf(b0Var.f289533j), java.lang.Boolean.valueOf(b0Var.f289534k));
            b0Var.f289534k = true;
            if (!com.tencent.mm.plugin.appbrand.utils.g0.a()) {
                if (!i81.b0.i(b0Var.f289525b)) {
                    b0Var.h(null);
                } else if (b0Var.f289528e == 1) {
                    b0Var.h(null);
                }
                b0Var.a();
                return;
            }
            if (b0Var.f289536m != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hold splash hide listener, but it exists");
            } else if (aVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hold splash hide listener, which is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hold splash hide listener, success");
                b0Var.f289536m = aVar;
            }
            if (!i81.m0.t4(b0Var.f289528e) && 10 != b0Var.f289528e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, but splash ad is requesting");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, splash ad closed");
                b0Var.h(new yz5.a() { // from class: i81.b0$$d
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        i81.b0.this.a();
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wc
    public com.tencent.mm.plugin.appbrand.ui.vc getInternalLoadingSplash() {
        return this.f89718e;
    }

    public int getProgress() {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.c9) {
            return ((com.tencent.mm.plugin.appbrand.ui.c9) vcVar).getProgress();
        }
        return -2;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wc
    public i81.q getRuntimeAdViewContainer() {
        return this.f89719f;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar != null) {
            vcVar.j(str, str2);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar != null) {
            vcVar.k(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.xc
    public void l(yz5.a aVar) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.xc) {
            ((com.tencent.mm.plugin.appbrand.ui.xc) vcVar).l(aVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.wc
    public void m() {
        this.f89717d.m(new com.tencent.mm.plugin.appbrand.ui.f(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar != null) {
            vcVar.n(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (i81.b0.i(this.f89717d)) {
                i81.q qVar = this.f89719f;
                qVar.getClass();
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    qVar.setVisibility(8);
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new i81.n(qVar));
                }
            }
            b(getContext().getResources().getConfiguration());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAdLoadingSplash", "onAttachedToWindow exception", e17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void setCanShowHideAnimation(boolean z17) {
        this.f89718e.setCanShowHideAnimation(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
        com.tencent.mm.plugin.appbrand.ui.vc vcVar = this.f89718e;
        if (vcVar != null) {
            vcVar.setProgress(i17);
        }
    }
}
