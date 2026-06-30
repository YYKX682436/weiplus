package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class g extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f171250d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc f171251e;

    /* renamed from: f, reason: collision with root package name */
    public i81.q f171252f;

    /* renamed from: g, reason: collision with root package name */
    public final i81.l0 f171253g;

    public g(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar, i81.l0 l0Var) {
        super(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2;
        this.f171250d = o6Var;
        this.f171251e = vcVar;
        this.f171253g = l0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdLoadingSplash", "initRuntimeAdViewContainer, runtime:%s", o6Var);
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g0.a();
        i81.q qVar = new i81.q(context, o6Var);
        if (a17) {
            qVar.setBackgroundColor(0);
            qVar.setVisibility(8);
        } else {
            nf.y yVar = nf.x.f418149b;
            if (yVar != null ? yVar.mo53144x387a9983() : false) {
                qVar.setBackgroundColor(-16777216);
            } else {
                qVar.setBackgroundColor(-1);
            }
        }
        this.f171252f = qVar;
        qVar.b();
        i81.b bVar = this.f171252f.f371141g;
        if (bVar != null) {
            bVar.a(true, al1.h0.PageConfig);
        }
        this.f171252f.m134920xf5e6816c(false);
        this.f171252f.m134919x262881b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c(this));
        this.f171252f.m134921x9d906497(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d(this));
        this.f171252f.m134922x9b5ddf53(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e(this));
        i81.j.c(this.f171252f);
        if (vcVar != null) {
            addView(vcVar.mo52965xfb86a31b(), new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        i81.q qVar2 = this.f171252f;
        if (qVar2 != null) {
            addView(qVar2, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4
    public void E(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4) vcVar).E(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc
    public void a() {
        i81.q qVar = this.f171252f;
        if (qVar != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                qVar.setVisibility(8);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i81.n(qVar));
            }
        }
    }

    public final void b(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f171250d;
        if (o6Var.mo48803xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) {
            android.app.Activity w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) o6Var.mo48803xee5260a9()).w();
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
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.h(window, false, false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc
    public boolean d() {
        i81.q qVar = this.f171252f;
        return qVar != null && indexOfChild(qVar) >= 0 && this.f171252f.getVisibility() == 0 && i81.a0.a(this.f171250d).f371090a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc
    public void e(boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yc ycVar) {
        i81.q qVar = this.f171252f;
        if (qVar != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                qVar.a(z17, str, ycVar);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i81.l(qVar, z17, str, ycVar));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc
    public void g(yz5.a aVar) {
        i81.l0 l0Var = this.f171253g;
        if (l0Var != null) {
            final i81.b0 b0Var = (i81.b0) l0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, ShowAdState: %d, isSplashAdFinished:%s, canLoadingSplashFinish:%s", java.lang.Integer.valueOf(b0Var.f371061e), java.lang.Boolean.valueOf(b0Var.f371066j), java.lang.Boolean.valueOf(b0Var.f371067k));
            b0Var.f371067k = true;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g0.a()) {
                if (!i81.b0.i(b0Var.f371058b)) {
                    b0Var.h(null);
                } else if (b0Var.f371061e == 1) {
                    b0Var.h(null);
                }
                b0Var.a();
                return;
            }
            if (b0Var.f371069m != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hold splash hide listener, but it exists");
            } else if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hold splash hide listener, which is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hold splash hide listener, success");
                b0Var.f371069m = aVar;
            }
            if (!i81.m0.t4(b0Var.f371061e) && 10 != b0Var.f371061e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, but splash ad is requesting");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, splash ad closed");
                b0Var.h(new yz5.a() { // from class: i81.b0$$d
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        i81.b0.this.a();
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc
    /* renamed from: getInternalLoadingSplash */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc mo52986xf673f150() {
        return this.f171251e;
    }

    /* renamed from: getProgress */
    public int m52987x402effa3() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9) vcVar).m52964x402effa3();
        }
        return -2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc
    /* renamed from: getRuntimeAdViewContainer */
    public i81.q mo52988xc14343f7() {
        return this.f171252f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: getView */
    public android.view.View mo52965xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar != null) {
            vcVar.j(str, str2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar != null) {
            vcVar.k(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc
    public void l(yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.xc) vcVar).l(aVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wc
    public void m() {
        this.f171250d.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void n(yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar != null) {
            vcVar.n(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (i81.b0.i(this.f171250d)) {
                i81.q qVar = this.f171252f;
                qVar.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    qVar.setVisibility(8);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i81.n(qVar));
                }
            }
            b(getContext().getResources().getConfiguration());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAdLoadingSplash", "onAttachedToWindow exception", e17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setAppServiceType */
    public /* bridge */ /* synthetic */ void mo52967xf31bdbb0(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setCanShowHideAnimation */
    public void mo52968x5fa745f7(boolean z17) {
        this.f171251e.mo52968x5fa745f7(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setProgress */
    public void mo52970x3ae760af(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = this.f171251e;
        if (vcVar != null) {
            vcVar.mo52970x3ae760af(i17);
        }
    }
}
