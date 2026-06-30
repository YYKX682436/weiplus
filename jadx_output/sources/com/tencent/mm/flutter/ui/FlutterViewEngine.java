package com.tencent.mm.flutter.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/mm/flutter/ui/FlutterViewEngine;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Lpi0/o0;", "pageContainer", "<init>", "(Lpi0/o0;)V", "bj0/f", "mm_foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterViewEngine implements androidx.lifecycle.x {
    public io.flutter.embedding.engine.renderer.FlutterUiDisplayListener A;
    public long B;
    public final java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public final pi0.o0 f68129d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f68130e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68131f;

    /* renamed from: g, reason: collision with root package name */
    public final pi0.l1 f68132g;

    /* renamed from: h, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterEngine f68133h;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.RenderSurface f68134i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f68135m;

    /* renamed from: n, reason: collision with root package name */
    public final bj0.t f68136n;

    /* renamed from: o, reason: collision with root package name */
    public final io.flutter.embedding.android.FlutterView f68137o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f68138p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f68139q;

    /* renamed from: r, reason: collision with root package name */
    public final bj0.g f68140r;

    /* renamed from: s, reason: collision with root package name */
    public io.flutter.plugin.platform.PlatformPlugin f68141s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.lifecycle.n f68142t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f68143u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f68144v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f68145w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f68146x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f68147y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f68148z;

    /* JADX WARN: Removed duplicated region for block: B:23:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FlutterViewEngine(pi0.o0 r12) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.ui.FlutterViewEngine.<init>(pi0.o0):void");
    }

    public static final void a(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine, bj0.f fVar) {
        flutterViewEngine.getClass();
        io.flutter.Log.i(flutterViewEngine.C, "removeSnapshot reason:" + fVar);
        flutterViewEngine.f68138p.setVisibility(8);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    private final void onPause() {
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer;
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        java.lang.String str = this.C;
        io.flutter.Log.i(str, "onPause:false");
        if (this.f68135m != null) {
            androidx.lifecycle.n nVar = this.f68142t;
            androidx.lifecycle.n nVar2 = androidx.lifecycle.n.STARTED;
            if (nVar != nVar2) {
                this.f68142t = nVar2;
            }
        }
        bj0.s a17 = bj0.s.f21129f.a(this.f68130e);
        if (a17 != null) {
            int hashCode = hashCode();
            io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "viewPause hash:" + hashCode + ", ViewStack.size:" + a17.f21131a.size() + ", currentAppState:" + a17.f21135e);
            bj0.q a18 = a17.a();
            if (a18 != null && (flutterEngine = (io.flutter.embedding.engine.FlutterEngine) a18.f21124b.get()) != null && a18.f21123a == hashCode) {
                io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "viewPause: called");
                flutterEngine.getLifecycleChannel().appIsInactive();
                a17.f21135e = 1;
            }
        }
        pi0.i0 i0Var = pi0.k0.f354629c;
        java.lang.String str2 = this.f68131f;
        pi0.k0 a19 = i0Var.a(str2);
        if (a19 != null) {
            a19.a("HybridNavPageState.WillDisappear");
        }
        pi0.k0 a27 = i0Var.a(str2);
        if (a27 != null) {
            a27.a("HybridNavPageState.Inactive");
        }
        if (e() && d() == io.flutter.embedding.android.RenderMode.texture) {
            io.flutter.embedding.android.FlutterView flutterView = this.f68137o;
            if ((flutterView == null || (attachedRenderer = flutterView.getAttachedRenderer()) == null || !attachedRenderer.isDisplayingFlutterUi()) ? false : true) {
                io.flutter.Log.i(str, "try resumeToTextureView");
                i();
            }
        }
        this.f68144v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
    
        if (r12 != r3.intValue()) goto L36;
     */
    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onResume() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.ui.FlutterViewEngine.onResume():void");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    private final void onStart() {
        this.f68133h.recordStartupTiming("mm_view_engine_on_start");
        pi0.k0 a17 = pi0.k0.f354629c.a(this.f68131f);
        if (a17 != null) {
            a17.a("HybridNavPageState.WillAppear");
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    private final void onStop() {
        io.flutter.Log.i(this.C, "onStop");
        if (this.f68135m == null || pi0.r.f354717a.k() != null) {
            this.f68139q = false;
        } else {
            this.f68139q = true;
        }
        if (this.f68142t.a(androidx.lifecycle.n.STARTED)) {
            this.f68142t = androidx.lifecycle.n.CREATED;
        }
        bj0.s a17 = bj0.s.f21129f.a(this.f68130e);
        if (a17 != null) {
            int hashCode = hashCode();
            io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "viewStop hash:" + hashCode + ", ViewStack.size:" + a17.f21131a.size() + ", currentAppState:" + a17.f21135e);
            bj0.q a18 = a17.a();
            if (a18 != null) {
                a18.f21127e = false;
            }
            if (a18 != null) {
                io.flutter.embedding.engine.FlutterEngine flutterEngine = (io.flutter.embedding.engine.FlutterEngine) a18.f21124b.get();
                int i17 = a18.f21123a;
                if (flutterEngine != null && i17 == hashCode) {
                    io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "viewStop: called");
                    flutterEngine.getLifecycleChannel().appIsPaused();
                    a17.f21134d.put(java.lang.Integer.valueOf(hashCode), flutterEngine);
                    a17.f21135e = 2;
                }
            }
            synchronized (a17.f21131a) {
                if (a17.f21131a.size() > 2) {
                    java.util.List<bj0.q> subList = a17.f21131a.subList(0, (r3.size() - 2) - 1);
                    kotlin.jvm.internal.o.f(subList, "subList(...)");
                    for (bj0.q qVar : subList) {
                        if (!a17.f21132b.contains(java.lang.Integer.valueOf(qVar.f21123a)) && qVar.f21123a != a17.f21133c) {
                            io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "recycle engine view:" + qVar.f21123a);
                            a17.f21132b.add(java.lang.Integer.valueOf(qVar.f21123a));
                        }
                    }
                }
            }
        }
        pi0.i0 i0Var = pi0.k0.f354629c;
        pi0.k0 a19 = i0Var.a(this.f68131f);
        if (a19 != null) {
            a19.a("HybridNavPageState.DidDisappear");
        }
        pi0.k0 a27 = i0Var.a(this.f68131f);
        if (a27 != null) {
            a27.a("HybridNavPageState.Paused");
        }
    }

    public final void b() {
        java.lang.Object obj;
        bj0.s a17 = bj0.s.f21129f.a(this.f68130e);
        if (a17 != null) {
            int hashCode = hashCode();
            synchronized (a17.f21131a) {
                io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "viewFinish hash:" + hashCode + ", ViewStack.size:" + a17.f21131a.size());
                java.util.Iterator it = a17.f21131a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((bj0.q) obj).f21123a == hashCode) {
                            break;
                        }
                    }
                }
                bj0.q qVar = (bj0.q) obj;
                if (qVar != null) {
                    qVar.f21126d = true;
                }
            }
        }
    }

    public final com.tencent.mm.flutter.ui.FlutterPageStyle c() {
        return this.f68129d.S3();
    }

    public final io.flutter.embedding.android.RenderMode d() {
        return c().f68119f == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent ? (c().f68117d == 0 && pi0.g0.f354572e.a(this.f68131f)) ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture : io.flutter.embedding.android.RenderMode.surface;
    }

    public final boolean e() {
        return !pi0.g0.f354572e.a(this.f68131f) && c().f68126p && c().f68117d == 0 && d() == io.flutter.embedding.android.RenderMode.texture;
    }

    public final void f() {
        android.view.Display.Mode mode;
        java.lang.String str = this.C;
        io.flutter.Log.i(str, "onCreate");
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f68133h;
        flutterEngine.recordStartupTiming("mm_view_engine_on_create");
        c61.v9 v9Var = (c61.v9) this.f68132g.j(c61.v9.class);
        if (v9Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (v9Var.f39358m == 0) {
                io.flutter.Log.i("MicroMsg.FlutterAPMPlugin", "setPageEnterMills:" + currentTimeMillis);
                v9Var.f39358m = currentTimeMillis;
            }
        }
        pi0.i0 i0Var = pi0.k0.f354629c;
        java.lang.String str2 = this.f68131f;
        pi0.k0 a17 = i0Var.a(str2);
        if (a17 != null) {
            a17.a("HybridNavPageState.ViewReady");
        }
        pi0.k0 a18 = i0Var.a(str2);
        if (a18 != null) {
            a18.a("HybridNavPageState.PageEnter");
        }
        pi0.o0 o0Var = this.f68129d;
        o0Var.y6().a(this);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f68135m;
        if (appCompatActivity != null) {
            flutterEngine.getActivityControlSurface().attachToActivity(new bj0.j(this), o0Var.y6());
        }
        if (appCompatActivity != null) {
            this.f68141s = new io.flutter.plugin.platform.PlatformPlugin(appCompatActivity, flutterEngine.getPlatformChannel());
        }
        io.flutter.embedding.android.FlutterView flutterView = this.f68137o;
        if (flutterView != null) {
            flutterView.attachToFlutterEngine(flutterEngine);
        }
        flutterEngine.getRenderer().resumeScheduleFrame();
        if (appCompatActivity != null && android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.Display display = appCompatActivity.getDisplay();
            android.view.Display.Mode mode2 = null;
            android.view.Display.Mode[] supportedModes = display != null ? display.getSupportedModes() : null;
            if (supportedModes == null) {
                io.flutter.Log.i(str, "cannot get support display mode");
            } else {
                io.flutter.Log.i(str, "support display mode size:" + supportedModes.length);
                android.graphics.Point point = new android.graphics.Point();
                android.view.Display display2 = appCompatActivity.getDisplay();
                if (display2 != null) {
                    display2.getRealSize(point);
                }
                android.view.Display display3 = appCompatActivity.getDisplay();
                java.lang.Float valueOf = (display3 == null || (mode = display3.getMode()) == null) ? null : java.lang.Float.valueOf(mode.getRefreshRate());
                io.flutter.Log.i(str, "current refreshRate:" + valueOf);
                for (android.view.Display.Mode mode3 : supportedModes) {
                    io.flutter.Log.i(str, "refreshRate:" + mode3.getRefreshRate());
                    if (point.x == mode3.getPhysicalWidth() && point.y == mode3.getPhysicalHeight() && (mode2 == null || mode3.getRefreshRate() > mode2.getRefreshRate())) {
                        mode2 = mode3;
                    }
                }
                if (mode2 != null) {
                    android.view.WindowManager.LayoutParams attributes = appCompatActivity.getWindow().getAttributes();
                    if (valueOf == null || mode2.getRefreshRate() > valueOf.floatValue()) {
                        io.flutter.Log.i(str, "refresh rate diff, try set:" + mode2.getRefreshRate());
                        attributes.preferredDisplayModeId = mode2.getModeId();
                        appCompatActivity.getWindow().setAttributes(attributes);
                    }
                }
            }
        }
        bj0.t tVar = this.f68136n;
        if (tVar != null) {
            tVar.a(new bj0.k(this));
        }
        pi0.r.f354717a.f(this.f68140r);
    }

    public final void g() {
        io.flutter.embedding.engine.renderer.RenderSurface attachedRenderSurface;
        pi0.k0 a17 = pi0.k0.f354629c.a(this.f68131f);
        if (a17 != null) {
            a17.a("HybridNavPageState.PageExit");
        }
        this.f68133h.getActivityControlSurface().detachFromActivity();
        this.f68129d.y6().c(this);
        this.f68142t = androidx.lifecycle.n.DESTROYED;
        io.flutter.plugin.platform.PlatformPlugin platformPlugin = this.f68141s;
        if (platformPlugin != null) {
            platformPlugin.destroy();
        }
        this.f68141s = null;
        io.flutter.embedding.android.FlutterView flutterView = this.f68137o;
        if (!(flutterView != null && flutterView.isAttachedToFlutterEngine())) {
            io.flutter.Log.i(this.C, "flutterView renderer not attach engine now, just detach platform bridge");
            if (flutterView != null) {
                flutterView.detachPlatformBridges();
            }
            io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f68133h;
            flutterEngine.getRenderer().stopRenderingToSurface((flutterView == null || (attachedRenderSurface = flutterView.getAttachedRenderSurface()) == null) ? null : attachedRenderSurface.getRenderSurface());
            flutterEngine.getRenderer().setSemanticsEnabled(false);
        } else if (flutterView != null) {
            flutterView.detachFromFlutterEngine();
        }
        bj0.s a18 = bj0.s.f21129f.a(this.f68130e);
        if (a18 != null) {
            int hashCode = hashCode();
            synchronized (a18.f21131a) {
                io.flutter.embedding.engine.FlutterEngine flutterEngine2 = a18.f21131a.isEmpty() ^ true ? (io.flutter.embedding.engine.FlutterEngine) ((bj0.q) kz5.n0.i0(a18.f21131a)).f21124b.get() : null;
                java.util.ArrayList arrayList = a18.f21131a;
                bj0.r rVar = new bj0.r(hashCode);
                kotlin.jvm.internal.o.g(arrayList, "<this>");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) rVar.invoke(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                a18.f21134d.remove(java.lang.Integer.valueOf(hashCode));
                io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "viewDestroy hash:" + hashCode + ", ViewStack.size:" + a18.f21131a.size() + ", currentAppState:" + a18.f21135e + ", topEngine:" + flutterEngine2);
                if (a18.f21131a.isEmpty() && flutterEngine2 != null) {
                    if (a18.f21135e < 1) {
                        io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "checkSendAppState, add missing inactive state");
                        flutterEngine2.getLifecycleChannel().appIsInactive();
                        a18.f21135e = 1;
                    }
                    if (a18.f21135e < 2) {
                        io.flutter.Log.i("MicroMsg.FlutterViewEngine.Stack", "checkSendAppState, add missing paused state");
                        flutterEngine2.getLifecycleChannel().appIsPaused();
                        a18.f21135e = 2;
                    }
                    flutterEngine2.getLifecycleChannel().appIsDetached();
                    a18.f21135e = 3;
                    a18.f21133c = 0;
                    a18.f21132b.clear();
                }
            }
        }
        kotlinx.coroutines.l.d(this.f68143u, null, null, new bj0.l(this, null), 3, null);
    }

    public final void h() {
        if (this.f68135m == null || this.f68137o == null) {
            return;
        }
        this.f68133h.getActivityControlSurface().onUserLeaveHint();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r2.isInSwapSurface() == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            pi0.r r0 = pi0.r.f354717a
            boolean r0 = r0.c()
            java.lang.String r1 = r5.C
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "blockResumeTextureView "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            io.flutter.Log.i(r1, r0)
            return
        L1c:
            io.flutter.embedding.engine.renderer.FlutterUiDisplayListener r0 = r5.A
            io.flutter.embedding.android.FlutterView r2 = r5.f68137o
            if (r0 == 0) goto L35
            if (r2 == 0) goto L32
            io.flutter.embedding.engine.renderer.FlutterRenderer r0 = r2.getAttachedRenderer()
            if (r0 == 0) goto L32
            io.flutter.embedding.engine.renderer.FlutterUiDisplayListener r3 = r5.A
            kotlin.jvm.internal.o.d(r3)
            r0.removeIsDisplayingFlutterUiListener(r3)
        L32:
            r0 = 0
            r5.A = r0
        L35:
            r0 = 0
            if (r2 == 0) goto L40
            boolean r3 = r2.isInSwapSurface()
            r4 = 1
            if (r3 != r4) goto L40
            goto L41
        L40:
            r4 = r0
        L41:
            if (r4 == 0) goto L4d
            java.lang.String r3 = "do resumeToTextureView"
            io.flutter.Log.i(r1, r3)
            if (r2 == 0) goto L4d
            r2.switchSurface(r0)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.ui.FlutterViewEngine.i():void");
    }

    public final void j() {
        boolean z17 = this.f68147y;
        java.lang.String str = this.C;
        if (!z17) {
            io.flutter.Log.i(str, "switchToSurfaceView wait isTextureViewUpdated");
            this.f68148z = true;
            return;
        }
        boolean z18 = false;
        this.f68148z = false;
        if (this.f68146x) {
            io.flutter.Log.i(str, "switchToSurfaceView isWaitingAnimEnd");
            return;
        }
        if (d() == io.flutter.embedding.android.RenderMode.texture) {
            io.flutter.embedding.android.FlutterView flutterView = this.f68137o;
            if (flutterView != null && !flutterView.isInSwapSurface()) {
                z18 = true;
            }
            if (z18) {
                io.flutter.Log.i(str, "do switchToSurfaceView, previousPause:" + this.f68144v + ", isWaitingSwitchSurfaceView:" + this.f68145w);
                io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = flutterView != null ? flutterView.getAttachedRenderer() : null;
                if (attachedRenderer == null) {
                    io.flutter.Log.e(str, "do switchToSurfaceView renderer is null");
                    return;
                }
                this.f68145w = true;
                bj0.o oVar = new bj0.o(this, attachedRenderer);
                if (attachedRenderer.isDisplayingFlutterUi()) {
                    io.flutter.Log.i(str, "switchToSurfaceView flutter already displayed");
                    oVar.invoke();
                    return;
                }
                if (this.f68144v) {
                    oVar.invoke();
                    return;
                }
                io.flutter.Log.i(str, "switchToSurfaceView flutter not displayed");
                io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener = this.A;
                if (flutterUiDisplayListener != null) {
                    kotlin.jvm.internal.o.d(flutterUiDisplayListener);
                    attachedRenderer.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
                    this.A = null;
                }
                bj0.m mVar = new bj0.m(this, attachedRenderer, oVar);
                this.A = mVar;
                attachedRenderer.addIsDisplayingFlutterUiListener(mVar);
            }
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer;
        io.flutter.Log.i(this.C, "onDestroy");
        pi0.r.f354717a.g(this.f68140r);
        if (this.A != null) {
            io.flutter.embedding.android.FlutterView flutterView = this.f68137o;
            if (flutterView != null && (attachedRenderer = flutterView.getAttachedRenderer()) != null) {
                io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener = this.A;
                kotlin.jvm.internal.o.d(flutterUiDisplayListener);
                attachedRenderer.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
            }
            this.A = null;
        }
        if (this.f68142t != androidx.lifecycle.n.DESTROYED) {
            g();
        }
    }
}
