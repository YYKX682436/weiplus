package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.page.v5 implements com.tencent.luggage.sdk.jsapi.component.o {
    public com.tencent.mm.plugin.appbrand.report.quality.o0 J1;
    public final com.tencent.mm.plugin.appbrand.report.model.h K1;
    public final java.lang.Runnable L1;
    public com.tencent.mm.plugin.appbrand.page.w M1;
    public com.tencent.mm.sdk.platformtools.n3 N1;

    public b(java.lang.Class<? extends com.tencent.mm.plugin.appbrand.page.d7> cls, com.tencent.luggage.sdk.jsapi.component.m mVar) {
        super(cls);
        this.J1 = com.tencent.mm.plugin.appbrand.report.quality.o0.CreateOnRuntimeInit;
        this.L1 = new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.luggage.sdk.jsapi.component.b.this.D3();
            }
        };
        final com.tencent.mm.plugin.appbrand.report.model.h a17 = (mVar == null ? new com.tencent.luggage.sdk.jsapi.component.c(this) : mVar).a(this);
        java.util.Objects.requireNonNull(a17);
        U(new com.tencent.mm.plugin.appbrand.jsapi.x() { // from class: com.tencent.luggage.sdk.jsapi.component.m$$a
            @Override // com.tencent.mm.plugin.appbrand.jsapi.x
            public final void b() {
                com.tencent.mm.plugin.appbrand.report.model.h.this.d();
            }
        });
        R(new com.tencent.mm.plugin.appbrand.jsapi.v() { // from class: com.tencent.luggage.sdk.jsapi.component.m$$b
            @Override // com.tencent.mm.plugin.appbrand.jsapi.v
            public final void c() {
                com.tencent.mm.plugin.appbrand.report.model.h.this.c();
            }
        });
        w(new com.tencent.mm.plugin.appbrand.jsapi.w() { // from class: com.tencent.luggage.sdk.jsapi.component.m$$c
            @Override // com.tencent.mm.plugin.appbrand.jsapi.w
            public final void onDestroy() {
                com.tencent.mm.plugin.appbrand.report.model.h hVar = com.tencent.mm.plugin.appbrand.report.model.h.this;
                com.tencent.mm.plugin.appbrand.report.w2 w2Var = hVar.f87981a;
                if (w2Var.f88420a.getAndSet(2) != 2) {
                    w2Var.f88421b.d();
                    com.tencent.mm.plugin.appbrand.report.t2 t2Var = w2Var.f88423d;
                    w2Var.f88421b = t2Var;
                    t2Var.getClass();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    t2Var.f88409a = java.lang.System.currentTimeMillis();
                }
                com.tencent.mm.plugin.appbrand.report.w2 w2Var2 = hVar.f87981a;
                w2Var2.f88420a.set(-1);
                w2Var2.f88421b = new com.tencent.mm.plugin.appbrand.report.v2(w2Var2, null);
            }
        });
        P(new com.tencent.mm.plugin.appbrand.jsapi.a0() { // from class: com.tencent.luggage.sdk.jsapi.component.m$$d
            @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
            public final void onReady() {
                com.tencent.mm.plugin.appbrand.report.model.h hVar = com.tencent.mm.plugin.appbrand.report.model.h.this;
                hVar.getClass();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                hVar.f87986f = java.lang.System.currentTimeMillis() - hVar.f87985e;
            }
        });
        this.K1 = a17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public org.json.JSONObject A0() {
        org.json.JSONObject A0 = super.A0();
        iz5.a.e(this.J1, com.tencent.mm.plugin.appbrand.report.quality.o0.CreateOnRuntimeInit);
        K0(A0, "envPreloadType", java.lang.Integer.valueOf(this.J1.ordinal()));
        return A0;
    }

    public final void A3(com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var) {
        this.J1 = o0Var;
        super.Q2();
        I0();
    }

    public void B3() {
        if (t3().x0().getPageCount() == 1) {
            com.tencent.mm.plugin.appbrand.page.m mVar = this.N;
            if (mVar.f86865b || !mVar.f86866c) {
                r1().setNavHidden(true);
                return;
            }
        }
        r1().setNavHidden(false);
    }

    public void C3(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
    }

    public final void D3() {
        if (!isRunning()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewLU", "showErrorPageView but not running, appId[%s] url[%s]", getAppId(), X1());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewLU", "showErrorPageView appId:%s, url:%s", getAppId(), X1());
        o1(false);
        com.tencent.mm.plugin.appbrand.page.w wVar = new com.tencent.mm.plugin.appbrand.page.w(getContext(), t3());
        android.widget.FrameLayout pageArea = getPageArea();
        this.M1 = wVar;
        pageArea.addView(wVar);
    }

    public void E3() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getPageArea().findViewById(com.tencent.mm.R.id.f483179ys);
        if (frameLayout == null) {
            frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setId(com.tencent.mm.R.id.f483179ys);
            getPageArea().addView(frameLayout, -1, -1);
        }
        frameLayout.setBackground(null);
        frameLayout.setVisibility(0);
        frameLayout.bringToFront();
        try {
            frameLayout.setBackground(new android.graphics.drawable.BitmapDrawable(getContext().getResources(), R1()));
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageViewLU", "showScreenshotCover oom, appId = %s, path = %s", getAppId(), X1());
            y3();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void H2(java.lang.String str) {
        super.h3(true);
        boolean a17 = t3().X1.a(this, com.tencent.luggage.sdk.jsapi.component.l.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewLU", "publishPageNotFound appId:%s, hasPermission:%b, url:%s", getAppId(), java.lang.Boolean.valueOf(a17), str);
        if (!a17) {
            D3();
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, nf.z.a(str));
        hashMap.put("query", nf.z.c(str));
        hashMap.put("rawPath", str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        hashMap.put("isEntryPage", java.lang.Boolean.valueOf(str.equals(t3().t0())));
        com.tencent.mm.plugin.appbrand.jsapi.n5 lVar = new com.tencent.luggage.sdk.jsapi.component.l(null);
        lVar.t(hashMap);
        i(lVar, null);
        R0(this.L1, 2000L);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void K2() {
        super.K2();
        q3(false);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.N1;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r
    public final void P0(java.lang.Runnable runnable) {
        if (t3() == null || !t3().a2()) {
            super.P0(runnable);
        } else if (runnable != null) {
            if (this.N1 == null) {
                this.N1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
            }
            this.N1.post(runnable);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r
    public final void R0(java.lang.Runnable runnable, long j17) {
        if (t3() == null || !t3().a2()) {
            super.R0(runnable, j17);
        } else if (runnable != null) {
            if (this.N1 == null) {
                this.N1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
            }
            this.N1.postDelayed(runnable, j17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r
    public final void S0(java.lang.Runnable runnable) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.N1;
        if (n3Var != null && runnable != null) {
            n3Var.removeCallbacks(runnable);
        }
        super.S0(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public android.graphics.Bitmap S1(boolean z17) {
        com.tencent.mm.plugin.appbrand.page.w wVar;
        android.graphics.Bitmap S1 = super.S1(z17);
        if (S1 != null && !z17 && (wVar = this.M1) != null) {
            com.tencent.mm.plugin.appbrand.page.ie.a(wVar, wVar, new android.graphics.Canvas(S1));
        }
        return S1;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void b3(boolean z17, al1.h0 h0Var) {
        boolean a17;
        si1.g gVar = t3().X1;
        int ordinal = h0Var.ordinal();
        if (ordinal != 0) {
            a17 = false;
            if (ordinal == 1 ? gVar.a(v3(), nd1.h1.class) || gVar.a(this, nd1.h1.class) : ordinal == 2 || ordinal == 3) {
                a17 = true;
            }
        } else {
            a17 = gVar.a(this, com.tencent.luggage.sdk.jsapi.component.k.class);
        }
        if (!a17) {
            z17 = true;
        }
        super.b3(z17, h0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public final com.tencent.mm.plugin.appbrand.jsapi.i0 f0() {
        return new com.tencent.luggage.sdk.jsapi.component.d(this, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void f2(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.f2(context, appBrandRuntime);
        w3().e(appBrandRuntime);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void h3(boolean z17) {
        super.h3(z17);
        if (z17) {
            return;
        }
        q3(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        if (n5Var instanceof com.tencent.luggage.sdk.jsapi.component.l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewLU", "publish onPageNotFound, appId:%s, webviewId:%d, data:%s", getAppId(), java.lang.Integer.valueOf(getComponentId()), n5Var.o());
        }
        super.i(n5Var, iArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public boolean k2() {
        ni1.j jVar = (ni1.j) B1(ni1.j.class);
        return jVar != null && jVar.e();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    public final void q3(boolean z17) {
        S0(this.L1);
        T0(new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.b$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.luggage.sdk.jsapi.component.b.this.x3();
            }
        });
        if (z17) {
            D2("cancelShowErrorPageViewRunnable");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public boolean r2(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        boolean r27 = super.r2(j17, str, wdVar);
        com.tencent.mm.plugin.appbrand.report.model.h w37 = w3();
        w37.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        w37.f87985e = java.lang.System.currentTimeMillis();
        w37.f87982b = str;
        if (r27) {
            int i17 = 0;
            q3(false);
            while (true) {
                if (i17 >= getPageArea().getChildCount()) {
                    break;
                }
                android.view.View childAt = getPageArea().getChildAt(i17);
                if (childAt instanceof com.tencent.mm.plugin.appbrand.page.w) {
                    getPageArea().removeView(childAt);
                    break;
                }
                i17++;
            }
        }
        return r27;
    }

    public void r3(android.os.Bundle bundle) {
        m(new com.tencent.luggage.sdk.jsapi.component.j(this));
    }

    public com.tencent.mm.plugin.appbrand.jsapi.webview.s s3() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    public ze.n t3() {
        return (ze.n) super.t3();
    }

    public km5.d u3() {
        return ((km5.q) km5.u.d()).h(new com.tencent.luggage.sdk.jsapi.component.h(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public com.tencent.luggage.sdk.jsapi.component.service.y v3() {
        return (com.tencent.luggage.sdk.jsapi.component.service.y) super.v3();
    }

    public final com.tencent.mm.plugin.appbrand.report.model.h w3() {
        return this.K1;
    }

    public final void x3() {
        if (getPageArea() == null || this.M1 == null) {
            return;
        }
        getPageArea().removeView(this.M1);
        this.M1 = null;
    }

    public void y3() {
        android.widget.FrameLayout pageArea = getPageArea();
        if (pageArea == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewLU", "hideScreenshotCover, pageArea is null");
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) pageArea.findViewById(com.tencent.mm.R.id.f483179ys);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            android.graphics.Bitmap bitmap = frameLayout.getBackground() instanceof android.graphics.drawable.BitmapDrawable ? ((android.graphics.drawable.BitmapDrawable) frameLayout.getBackground()).getBitmap() : null;
            frameLayout.setBackground(null);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public boolean z3() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getPageArea().findViewById(com.tencent.mm.R.id.f483179ys);
        return (frameLayout == null || frameLayout.getVisibility() != 0 || frameLayout.getBackground() == null) ? false : true;
    }

    public b() {
        this(com.tencent.mm.plugin.appbrand.page.wc.class, null);
    }
}
