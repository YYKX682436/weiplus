package ce;

/* loaded from: classes7.dex */
public class o extends re.a implements ce.g, ce.d {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.luggage.game.page.WAGamePageViewContainerLayout f40685f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.magicbrush.ui.MagicBrushView f40686g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ia f40687h;

    /* renamed from: i, reason: collision with root package name */
    public ce.e f40688i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f40689m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f40690n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f40691o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f40692p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f40693q;

    /* renamed from: r, reason: collision with root package name */
    public final ce.a f40694r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f40695s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f40696t;

    /* renamed from: u, reason: collision with root package name */
    public volatile ce.y f40697u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f40698v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f40699w;

    public o(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        super(bVar);
        this.f40689m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f40690n = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f40695s = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        this.f40696t = arrayList;
        this.f40697u = null;
        this.f40698v = new ce.q(this);
        this.f40694r = new ce.a();
        W();
        arrayList.add(0, new de.d());
        com.tencent.luggage.sdk.jsapi.component.service.a0 y17 = bVar.v3().y1();
        synchronized (this.f47331e) {
            ((java.util.HashMap) this.f47331e).putAll(y17.f47331e);
        }
    }

    @Override // ce.d
    public void C(android.view.View view) {
        if (view.getVisibility() == 0 && this.f40695s.compareAndSet(false, true)) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).D2("onNativeWidgetViewAdded");
        }
    }

    @Override // ni1.d
    public com.tencent.mm.plugin.appbrand.page.fb D(android.content.Context context) {
        return this.f40694r;
    }

    public final void K(final java.util.ArrayList arrayList, final yz5.l lVar) {
        ze.n J2 = J();
        if (J2 == null) {
            com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: runtime released. no screen canvas captured");
            lVar.invoke(null);
        } else if (!arrayList.isEmpty()) {
            ((de.a) arrayList.remove(0)).a(J2, new yz5.l() { // from class: ce.o$$f
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                    ce.o oVar = ce.o.this;
                    yz5.l lVar2 = lVar;
                    if (bitmap == null) {
                        oVar.K(arrayList, lVar2);
                        return null;
                    }
                    oVar.getClass();
                    lVar2.invoke(bitmap);
                    return null;
                }
            });
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: ran through all the delegates and not found anyone can provide with capturing");
            lVar.invoke(null);
        }
    }

    public final void M() {
        if (this.f40692p != null) {
            try {
                com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy: cleanupCanvasSecurityGuard");
                this.f40692p.recycle();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e17, "hy: cleanupCanvasSecurityGuard error!", new java.lang.Object[0]);
            }
            this.f40692p = null;
        }
    }

    public final void N() {
        if (this.f40693q != null) {
            ce.u uVar = new ce.u(this);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                uVar.run();
            } else {
                try {
                    ((ku5.t0) ku5.t0.f312615d).B(uVar).get();
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                    com.tencent.mars.xlog.Log.e("Luggage.Game.WAGamePageViewRenderer", "cleanupCoverScreenshot await ui get exception %s", e17);
                }
            }
        }
        android.graphics.Bitmap bitmap = this.f40691o;
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", e18, "hy: cleanupCoverScreenshot error!", new java.lang.Object[0]);
            }
            this.f40691o = null;
        }
    }

    public final void O(boolean z17, boolean z18) {
        if (!this.f40689m.get()) {
            com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: should not show cover");
            return;
        }
        if (!u46.a.b(new xi1.o[]{xi1.o.LANDSCAPE_SENSOR, xi1.o.LANDSCAPE_LOCKED, xi1.o.LANDSCAPE_LEFT, xi1.o.LANDSCAPE_RIGHT}, ((com.tencent.luggage.sdk.jsapi.component.b) F()).getWindowAndroid().getOrientationHandler().a())) {
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.h(new ce.x(this));
            }
        } else {
            com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy:deal with landscape games");
            if (this.f40693q == null) {
                com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "markBeforeStartToTransparent coverImage is NULL, return");
            } else {
                this.f40685f.setOnConfigurationChangedListener(new ce.w(this, z18));
            }
        }
    }

    public com.tencent.magicbrush.ui.MagicBrushView P(android.content.Context context) {
        return new com.tencent.magicbrush.ui.MagicBrushView(context, gh.y.SurfaceView);
    }

    public android.graphics.Bitmap Q(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap");
        android.graphics.Bitmap bitmap = null;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.e("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap canvasId is illegal");
            return null;
        }
        com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap canvasId:%d,sync:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f40686g;
        if (magicBrushView == null) {
            com.tencent.mars.xlog.Log.e("Luggage.Game.WAGamePageViewRenderer", "captureCanvas with [%d], view == null", java.lang.Integer.valueOf(i17));
        } else {
            bitmap = magicBrushView.getMagicBrush().f48591o.a(this.f40686g.getVirtualElementId(), i17, false);
        }
        com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap end");
        return bitmap;
    }

    public android.graphics.Bitmap R() {
        if (this.f40692p == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy: getCanvasSecurityGuardBitmap");
        return this.f40692p;
    }

    public final yd.u S() {
        ae.q qVar = (ae.q) ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().z1(ae.q.class);
        if (qVar == null) {
            return null;
        }
        return ((ae.a) qVar).F0();
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.f0 T() {
        if (J() == null || J().C0().getJsRuntime() == null) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.jsruntime.f0) J().C0().getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
    }

    public com.tencent.magicbrush.ui.MagicBrushView U() {
        return this.f40686g;
    }

    public void V(final boolean z17, final boolean z18, final de.a aVar) {
        N();
        this.f40690n.set(z18);
        this.f40689m.set(true);
        if (T() == null || T().g()) {
            com.tencent.mars.xlog.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy:markBeforeStartToTransparent");
            final yz5.l lVar = new yz5.l() { // from class: ce.o$$a
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    de.a aVar2;
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                    final ce.o oVar = ce.o.this;
                    oVar.f40691o = bitmap;
                    final boolean z19 = z17;
                    final boolean z27 = z18;
                    if (bitmap != null || (aVar2 = aVar) == null) {
                        oVar.O(z19, z27);
                        return null;
                    }
                    aVar2.a(oVar.J(), new yz5.l() { // from class: ce.o$$d
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            final android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj2;
                            final ce.o oVar2 = ce.o.this;
                            oVar2.getClass();
                            final boolean z28 = z19;
                            final boolean z29 = z27;
                            ((com.tencent.luggage.sdk.jsapi.component.b) oVar2.F()).T0(new java.lang.Runnable() { // from class: ce.o$$g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ce.o oVar3 = ce.o.this;
                                    oVar3.f40691o = bitmap2;
                                    oVar3.f40693q.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                                    oVar3.O(z28, z29);
                                }
                            });
                            return null;
                        }
                    });
                    return null;
                }
            };
            com.tencent.mm.plugin.appbrand.jsruntime.f0 T = T();
            if (T != null) {
                T.post(new java.lang.Runnable() { // from class: ce.o$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ce.o oVar = ce.o.this;
                        oVar.getClass();
                        oVar.K(new java.util.ArrayList(oVar.f40696t), lVar);
                    }
                });
            } else {
                com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: js thread handler is empty");
                lVar.invoke(null);
            }
        }
    }

    public void W() {
        G(ce.g.class, this);
    }

    public void X(com.tencent.magicbrush.MBRuntime mBRuntime, java.util.List list) {
        yg.a aVar;
        if (mBRuntime == null) {
            com.tencent.mars.xlog.Log.e("Luggage.Game.WAGamePageViewRenderer", "hy: can not retrieve runtime!");
            return;
        }
        yg.h hVar = mBRuntime.f48585i;
        synchronized (hVar.f462064a) {
            aVar = hVar.f462066c;
        }
        list.add(new yd.v("RT-FPS", "" + java.lang.Math.round(aVar.f462018a)));
        list.add(new yd.v("EX-FPS", "" + java.lang.Math.round(aVar.f462019b)));
        list.add(new yd.v("Jank", "" + aVar.f462020c));
        list.add(new yd.v("BigJank", "" + aVar.f462021d));
        list.add(new yd.v("Stutter", java.lang.String.format(java.util.Locale.ENGLISH, "%.2f%%", java.lang.Float.valueOf(aVar.f462022e * 100.0f))));
    }

    public void Y() {
        if (this.f40695s.compareAndSet(false, true)) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).D2("onFirstFrame");
            com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageReady_Game);
            com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInit_Game);
        }
    }

    public void Z(boolean z17) {
        yd.n nVar;
        com.tencent.luggage.game.page.WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f40685f;
        if (wAGamePageViewContainerLayout == null) {
            com.tencent.mars.xlog.Log.e("Luggage.Game.WAGamePageViewRenderer", "WVA.switchToWVAContainer: mRootView is null");
            return;
        }
        if (z17) {
            if (this.f40686g.getParent() == null) {
                this.f40685f.addView(this.f40686g, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
            if (this.f40699w.getParent() == null) {
                this.f40685f.addView(this.f40699w, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        wAGamePageViewContainerLayout.removeView(this.f40686g);
        if (this.f40699w.getParent() == null) {
            this.f40685f.addView(this.f40699w, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        yd.u S = S();
        if (S == null || (nVar = S.f460966b) == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = nVar.f460958m;
        nVar.setVisibility(8);
        b4Var.d();
    }

    @Override // ni1.d
    public boolean a(int i17, java.lang.String str) {
        if (F() != null) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().a(i17, str);
            return true;
        }
        com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "callback: component is null, callbackId: %d", java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (F() != null) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().g(str, str2);
            return true;
        }
        com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "publish: component is null, event: %s", str);
        return true;
    }

    @Override // ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        if (F() != null) {
            ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().e(str, str2, i17);
            return true;
        }
        com.tencent.mars.xlog.Log.w("Luggage.Game.WAGamePageViewRenderer", "dispatch: component is null, event: %s src:%d", str, java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public android.view.View f(android.view.LayoutInflater layoutInflater) {
        com.tencent.luggage.game.page.WAGamePageViewContainerLayout wAGamePageViewContainerLayout = new com.tencent.luggage.game.page.WAGamePageViewContainerLayout(layoutInflater.getContext(), null);
        this.f40685f = wAGamePageViewContainerLayout;
        return wAGamePageViewContainerLayout;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public boolean g() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public com.tencent.mm.plugin.appbrand.page.ia getCustomViewContainer() {
        return this.f40687h;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public com.tencent.mm.plugin.appbrand.page.ib i() {
        return this.f40688i;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        return true;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void k() {
        super.k();
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f40686g;
        if (magicBrushView != null) {
            magicBrushView.getMagicBrush().e();
        }
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void m() {
        super.m();
        N();
        M();
        ku5.u0 u0Var = ku5.t0.f312615d;
        final java.util.ArrayList arrayList = this.f40696t;
        java.util.Objects.requireNonNull(arrayList);
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: ce.o$$b
            @Override // java.lang.Runnable
            public final void run() {
                arrayList.clear();
            }
        });
        com.tencent.luggage.game.page.WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f40685f;
        if (wAGamePageViewContainerLayout == null || wAGamePageViewContainerLayout.f47260e == null) {
            return;
        }
        wAGamePageViewContainerLayout.f47260e = null;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void n() {
        super.n();
        this.f40689m.set(false);
        if (this.f40690n.get()) {
            N();
        }
        M();
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f40686g;
        if (magicBrushView != null) {
            magicBrushView.getMagicBrush().f();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public void o(al1.b bVar) {
        bVar.setFullscreenMode(true);
        boolean S = F() != null ? ((com.tencent.luggage.sdk.jsapi.component.b) F()).S() : false;
        mi1.f3.c(bVar.getCapsuleView(), bVar.getContext(), S);
        mi1.f3.b(bVar, S);
    }

    @Override // ni1.d
    public java.util.Map p() {
        return java.util.Collections.emptyMap();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public android.widget.RelativeLayout.LayoutParams q(android.view.View view, android.view.View view2) {
        return new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public boolean t() {
        return false;
    }

    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void v() {
        G(ni1.j.class, new ee.d((com.tencent.mm.plugin.appbrand.page.v5) F()));
        G(ni1.e.class, new ce.n((com.tencent.mm.plugin.appbrand.page.v5) F(), J().m0().f305748r.f305550a));
        if (((com.tencent.luggage.sdk.jsapi.component.b) F()).getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
            this.f40685f.f47260e = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) ((com.tencent.luggage.sdk.jsapi.component.b) F()).getWindowAndroid()).w();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public void x() {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d7
    public void z(android.view.View view) {
        ae.q qVar = (ae.q) r(ae.q.class);
        int i17 = 0;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", new ae.s(), "hy: not on game service!", new java.lang.Object[0]);
            return;
        }
        this.f40699w = new android.widget.FrameLayout(view.getContext());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.magicbrush.ui.MagicBrushView P = P(context);
        this.f40686g = P;
        P.setId(com.tencent.mm.R.id.f483127xb);
        com.tencent.magicbrush.MagicBrush w17 = ((ae.a) qVar).w();
        this.f40686g.setMagicBrush(w17);
        w17.f48589m.a(new yg.y() { // from class: ce.o$$e
            @Override // yg.y
            public final void b(int i18) {
                ce.o.this.Y();
            }
        });
        this.f40685f.addView(this.f40686g, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ce.e eVar = new ce.e(context);
        this.f40688i = eVar;
        eVar.setNativeWidgetAddedCallback(this);
        this.f40685f.addView(this.f40688i, -1, new android.view.ViewGroup.LayoutParams(-1, -1));
        ce.f fVar = new ce.f(this.f40688i);
        this.f40687h = fVar;
        xi1.m C1 = ((com.tencent.luggage.sdk.jsapi.component.b) F()).C1();
        fVar.f86764h = C1;
        C1.d(new com.tencent.mm.plugin.appbrand.page.z9(fVar));
        this.f40687h.v(new ce.r(this));
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f40687h;
        ce.s sVar = new ce.s(this);
        iaVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "setUnderViewAttacher notnull:%b", java.lang.Boolean.TRUE);
        iaVar.f86769m = sVar;
        android.widget.FrameLayout frameLayout = iaVar.f86768l;
        if (frameLayout != null && frameLayout.getParent() == null) {
            this.f40685f.addView(frameLayout, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        boolean z17 = ((com.tencent.luggage.sdk.jsapi.component.b) F()).t3().E0().f47296w;
        boolean z18 = ((com.tencent.luggage.sdk.jsapi.component.b) F()).t3().E0().f47296w;
        if (z17 || z18) {
            ae.q qVar2 = (ae.q) ((com.tencent.luggage.sdk.jsapi.component.b) F()).v3().z1(ae.q.class);
            if (qVar2 != null) {
                ae.a aVar = (ae.a) qVar2;
                yd.u F0 = aVar.F0();
                com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) F();
                com.tencent.magicbrush.MagicBrush w18 = aVar.w();
                com.tencent.luggage.game.page.WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f40685f;
                ce.t tVar = new ce.t(this, qVar2);
                F0.getClass();
                F0.f460970f = w18;
                if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                    throw new java.lang.IllegalStateException("You can only init GameInspector in main thread.");
                }
                if (F0.f460968d == 0) {
                    F0.f460965a = wAGamePageViewContainerLayout.getContext();
                    if (z17) {
                        yd.n nVar = new yd.n(F0.f460965a);
                        F0.f460966b = nVar;
                        nVar.f460957i = tVar;
                    }
                    if (z18) {
                        F0.f460967c = new yd.e(F0.f460970f, F0.f460965a, d0Var);
                    }
                    wAGamePageViewContainerLayout.setClipChildren(false);
                    float f17 = F0.f460965a.getResources().getDisplayMetrics().density;
                    if (F0.f460967c != null) {
                        wAGamePageViewContainerLayout.addView(F0.f460967c.f460939a, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 8388693;
                        layoutParams.bottomMargin = (int) (55.0f * f17);
                        int i18 = (int) (15.0f * f17);
                        layoutParams.rightMargin = i18;
                        layoutParams.leftMargin = i18;
                        wAGamePageViewContainerLayout.addView(F0.f460967c.f460945g, layoutParams);
                    }
                    if (F0.f460966b != null) {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        android.content.Context context2 = F0.f460965a;
                        if (context2 != null) {
                            nf.y yVar = nf.x.f336616b;
                            i17 = yVar != null ? yVar.c(context2) : com.tencent.mm.ui.v9.b(context2);
                        }
                        layoutParams2.topMargin = i17;
                        layoutParams2.leftMargin = (int) (f17 * 16.0f);
                        wAGamePageViewContainerLayout.addView(F0.f460966b, layoutParams2);
                    }
                    synchronized (F0.f460969e) {
                        if (F0.f460968d == 0) {
                            F0.f460968d = 1;
                            if (z18 && F0.f460967c != null) {
                                F0.f460967c.f460939a.post(new yd.o(F0));
                            }
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.Game.WAGamePageViewRenderer", new ae.s(), "hy: you're not on game service!", new java.lang.Object[0]);
            }
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f40693q = imageView;
        imageView.setVisibility(8);
        this.f40685f.addView(this.f40693q, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f40685f.addOnAttachStateChangeListener(this.f40698v);
    }
}
