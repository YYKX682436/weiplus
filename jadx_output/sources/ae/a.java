package ae;

/* loaded from: classes7.dex */
public class a extends com.tencent.luggage.sdk.jsapi.component.service.a0 implements ae.q {
    public qe.m0 A;
    public qe.f0 B;
    public qe.d1 C;
    public qe.m D;
    public com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper E;
    public final java.util.concurrent.ConcurrentHashMap F;
    public yd.u G;
    public com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback H;
    public int I;
    public qe.f V;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f3331u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3332v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.g1 f3333w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.luggage.sdk.jsapi.component.service.n1 f3334x;

    /* renamed from: y, reason: collision with root package name */
    public ud.b f3335y;

    /* renamed from: z, reason: collision with root package name */
    public qe.s0 f3336z;

    public a(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        super(yVar);
        this.f3331u = false;
        this.f3332v = false;
        this.f3333w = null;
        this.f3335y = null;
        this.F = new java.util.concurrent.ConcurrentHashMap();
        this.G = null;
        this.H = null;
        this.I = 0;
        G(ae.q.class, this);
        M0();
    }

    public ud.b A0(boolean z17, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        return new ae.f(this, ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getContext(), tVar, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public void B(java.lang.String str) {
        r45.n47 n47Var = new r45.n47();
        n47Var.f381078e = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).V0().getComponentId();
        n47Var.f381077d = str;
        this.f3333w.a0(n47Var, "domEvent");
    }

    public final void B0() {
        java.lang.String str;
        if (this.f3332v) {
            return;
        }
        this.f3332v = true;
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "Inject WAGame to MainContext");
        com.tencent.mm.plugin.appbrand.utils.d3.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), null, E0(), new ae.j(this));
        ae.l C0 = C0();
        com.tencent.mm.plugin.appbrand.nf.b((com.tencent.mm.plugin.appbrand.y) F(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(778L, 13L, 1L, false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean H0 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).H0();
        java.lang.String str2 = C0.f3357b;
        int length = str2 == null ? 0 : str2.length();
        ze.n t37 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3();
        com.tencent.mm.plugin.appbrand.utils.i3 i3Var = com.tencent.mm.plugin.appbrand.utils.i3.LIB;
        if (t37 == null || !((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().s2()) {
            com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) F();
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            java.lang.String str3 = C0.f3356a;
            java.lang.String str4 = C0.f3358c;
            java.lang.String str5 = C0.f3359d;
            int H02 = H0();
            java.lang.String str6 = C0.f3357b;
            com.tencent.mm.plugin.appbrand.utils.e3.h(e9Var, jsRuntime, str3, str4, str5, H02, str6, i3Var, new ae.c(this, C0.f3356a, str6, currentTimeMillis, length, H0));
            return;
        }
        java.lang.String M = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().M("WAServiceRemoteDebug.js");
        if (android.text.TextUtils.isEmpty(M)) {
            str = "";
        } else {
            str = M + ";";
        }
        C0.f3357b = str + ";(function(global) { var protectedConsole = global.console; Object.defineProperty(global, 'console', { get() { return protectedConsole; }, set() { } }); })(this);" + C0.f3357b;
        com.tencent.mm.plugin.appbrand.e9 e9Var2 = (com.tencent.mm.plugin.appbrand.e9) F();
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime2 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
        java.lang.String str7 = C0.f3356a;
        java.lang.String str8 = C0.f3357b;
        com.tencent.mm.plugin.appbrand.utils.e3.i(e9Var2, jsRuntime2, str7, str8, i3Var, new ae.c(this, str7, str8, currentTimeMillis, length, H0));
    }

    public ae.l C0() {
        ae.l lVar = new ae.l();
        lVar.f3356a = "WAGame.js";
        lVar.f3357b = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().M("WAGame.js");
        lVar.f3358c = "WAGame.js";
        lVar.f3359d = org.chromium.base.BaseSwitches.V + ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().i();
        return lVar;
    }

    public java.lang.String D0() {
        return null;
    }

    public java.lang.String E0() {
        return ik1.f.e("wxa_library/android.js") + ik1.f.e("wxa_library/shared_buffer.js") + ik1.f.e("wxa_library/lazy_load.js") + ik1.f.e("wxa_library/puppet_wrapper.js") + ik1.f.e("wxa_library/NativeGlobal-WAGame.js");
    }

    /* renamed from: F0, reason: collision with other method in class */
    public boolean mo0F0() {
        return false;
    }

    public ae.v G0(com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        return new ae.v(yVar, j0Var);
    }

    public int H0() {
        return 0;
    }

    public boolean I0() {
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void J() {
        super.J();
        if (S() != null && S().s2()) {
            com.tencent.mm.plugin.appbrand.utils.e3.f(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.F;
        java.util.Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer num = (java.lang.Integer) it.next();
            ae.p pVar = (ae.p) concurrentHashMap.get(num);
            if (pVar != null) {
                com.tencent.mm.plugin.appbrand.jsruntime.t V = V(num.intValue());
                ud.b bVar = pVar.f3364a;
                if (bVar != null) {
                    com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "destroy worker's magicbrush");
                    bVar.b();
                }
                qe.s0 s0Var = pVar.f3365b;
                if (s0Var != null) {
                    s0Var.b(V);
                }
                qe.m0 m0Var = pVar.f3366c;
                if (m0Var != null) {
                    m0Var.b(V);
                }
                qe.f0 f0Var = pVar.f3367d;
                if (f0Var != null) {
                    f0Var.b(V);
                }
                qe.d1 d1Var = pVar.f3368e;
                if (d1Var != null) {
                    d1Var.b(V);
                }
                qe.m mVar = pVar.f3369f;
                if (mVar != null) {
                    mVar.b(V);
                }
                com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = pVar.f3370g;
                if (wxAudioNativeInstallHelper != null) {
                    com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "destroy worker's wxaudio");
                    wxAudioNativeInstallHelper.destroyWxAudioBinding(V);
                }
            }
        }
        ud.b bVar2 = this.f3335y;
        if (bVar2 != null) {
            bVar2.b();
        }
        qe.s0 s0Var2 = this.f3336z;
        if (s0Var2 != null) {
            s0Var2.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.m0 m0Var2 = this.A;
        if (m0Var2 != null) {
            m0Var2.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.f0 f0Var2 = this.B;
        if (f0Var2 != null) {
            f0Var2.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.d1 d1Var2 = this.C;
        if (d1Var2 != null) {
            d1Var2.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.m mVar2 = this.D;
        if (mVar2 != null) {
            mVar2.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.f fVar = this.V;
        if (fVar != null) {
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
            com.tencent.mm.plugin.appbrand.jsruntime.u h07 = jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
            kotlin.jvm.internal.o.f(h07, "getAddon(...)");
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) h07).d0(new qe.b(fVar));
        }
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper2 = this.E;
        if (wxAudioNativeInstallHelper2 != null) {
            wxAudioNativeInstallHelper2.destroyWxAudioBinding(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback = this.H;
        if (cronetTaskNetworkStateCallback != null) {
            com.tencent.mars.cdn.CronetLogic.removeCronetTaskNetworkStateCallback(cronetTaskNetworkStateCallback);
        }
        if (S() == null || !S().b2()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime2 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
        final com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) F();
        java.util.List<com.tencent.mm.plugin.appbrand.jsruntime.r> w07 = ((com.tencent.mm.plugin.appbrand.jsruntime.b) ((com.tencent.mm.plugin.appbrand.jsruntime.j0) jsRuntime2.h0(com.tencent.mm.plugin.appbrand.jsruntime.j0.class))).w0(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) w07;
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s, contexts.size:%d", N(), java.lang.Integer.valueOf(linkedList.size()));
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(linkedList.size());
        for (final com.tencent.mm.plugin.appbrand.jsruntime.r rVar : w07) {
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).evaluateJavascript("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new android.webkit.ValueCallback() { // from class: ae.a$$a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    com.tencent.mm.plugin.appbrand.jsapi.x1.a(com.tencent.mm.plugin.appbrand.y.this, rVar, (java.lang.String) obj);
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s latch await failed:%s", N(), e17);
        } finally {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "post report coverage task for appId:%s latch await end", N());
        }
    }

    public void J0(boolean z17, java.lang.String str, cl.k1 k1Var) {
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public com.tencent.mm.plugin.appbrand.jsruntime.t K() {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "createJsRuntime");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.jsruntime.t y07 = y0(D0(), null);
        ae.v G0 = G0((com.tencent.luggage.sdk.jsapi.component.service.y) F(), (com.tencent.mm.plugin.appbrand.jsruntime.j0) y07.h0(com.tencent.mm.plugin.appbrand.jsruntime.j0.class));
        y07.setJsExceptionHandler(new ae.b(this));
        G0.getClass();
        y07.addJavascriptInterface(G0, "WeixinJSContext");
        com.tencent.mm.plugin.appbrand.utils.d3.b(y07, null, "(function(global) {\n    let loadJsFilesWithOptions = global.WeixinJSContext.loadJsFilesWithOptions\n    global.WeixinJSContext.loadJsFiles = function(contextId, paths, options) {\n        if (!options) {\n            options = '{}'\n        } else if (typeof options !== 'string') {\n            options = JSON.stringify(options)\n        }\n        loadJsFilesWithOptions(contextId, paths, options)\n    }\n})(this);", new ae.t(G0));
        com.tencent.mm.plugin.appbrand.utils.d3.b(y07, null, java.lang.String.format(";(function(){let interface = %s;let alloc = interface.alloc;let allocNativeGlobal = interface.allocNativeGlobal;interface.alloc = function(injectNativeGlobal) {if(injectNativeGlobal){return allocNativeGlobal();}else{return alloc();}}})();", "WeixinJSContext"), new ae.u(G0));
        G0.u();
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "[damonlei] createJsRuntime cost [%d]ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return y07;
    }

    public void K0(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public java.lang.String L() {
        org.json.JSONObject U0 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).U0();
        return java.lang.String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", U0.toString(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().m0().f305736J);
    }

    public void L0(int i17) {
    }

    public void M0() {
        new wd.k().b();
    }

    public final void N0() {
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        try {
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            if (jsRuntime == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
                return;
            }
            f0Var.C(-8);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AppBrandGameServiceLogicImp", th6, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    public boolean O0() {
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void W() {
        if (((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3() == null || !((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().s2()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new ae.k(this));
        com.eclipsesource.mmv8.V8.setBreakOnStart(java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
        if (wVar != null) {
            cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f42724b).h(new cl.z0(n07, "xdebug", true), false);
        }
        if (((com.tencent.luggage.sdk.jsapi.component.service.y) F()).G0()) {
            com.tencent.mm.plugin.appbrand.utils.e3.e(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).b1());
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean c0() {
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean d0(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.magicbrush.MagicBrush magicBrush;
        if (i17 == 0) {
            magicBrush = w();
        } else {
            ae.p pVar = (ae.p) this.F.get(java.lang.Integer.valueOf(i17));
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "lazyInitModule invalid workerId %d", java.lang.Integer.valueOf(i17));
                return false;
            }
            magicBrush = pVar.f3364a.f426569c;
            kotlin.jvm.internal.o.d(magicBrush);
        }
        if ("Image".equals(str) || "OffscreenCanvas".equals(str) || "MediaToolKit".equals(str) || "Profiler".equals(str)) {
            return true;
        }
        boolean equals = "Box2D".equals(str);
        com.tencent.luggage.sdk.jsapi.component.service.s1 s1Var = com.tencent.luggage.sdk.jsapi.component.service.t1.f47540a;
        if (equals) {
            if (!(kotlin.jvm.internal.o.b("FLAVOR_RED", com.tencent.mm.sdk.platformtools.z.f193124t.a("FEATURE_ID")) || s1Var.b("libmmbox2d_v8_13_2", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ilinkres_ae0cf48a"))) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmbox2d.so download fail");
                return false;
            }
            int i18 = com.tencent.magicbrush.MagicBrush.f48586q;
            magicBrush.t("mmbox2d");
            return true;
        }
        if (!"Phys3D".equals(str)) {
            return super.d0(i17, str, jSONObject);
        }
        if (!(kotlin.jvm.internal.o.b("FLAVOR_RED", com.tencent.mm.sdk.platformtools.z.f193124t.a("FEATURE_ID")) || s1Var.b("libmmphysx_v8_13_2", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ilinkres_ae0cf48a"))) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "libmmphysx.so download fail");
            return false;
        }
        int i19 = com.tencent.magicbrush.MagicBrush.f48586q;
        magicBrush.t("mmphysx");
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void g0() {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.init");
        this.f3331u = true;
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.initImpl mServiceReady = [%b], isRunning[%b]", java.lang.Boolean.valueOf(this.f3331u), java.lang.Boolean.valueOf(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).isRunning()));
        if (this.f3331u && ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).isRunning()) {
            try {
                com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppServiceWC.initImpl start");
                if (!this.f3332v) {
                    ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime().evaluateJavascript(ik1.f.e("wxa_library/android.js"), null);
                }
                ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).d1();
                B0();
                ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).m(new ae.i(this));
            } catch (java.lang.NullPointerException e17) {
                if (((com.tencent.luggage.sdk.jsapi.component.service.y) F()).isRunning()) {
                    throw e17;
                }
            }
        }
    }

    @Override // ae.r
    public int h() {
        return this.I;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void i0() {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "start preload");
        z0();
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).m0();
        B0();
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "WAGameAppService preloaded.");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void j0() {
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        super.j0();
        try {
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            if (jsRuntime == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
                return;
            }
            f0Var.C(10);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AppBrandGameServiceLogicImp", th6, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void k0() {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "onRuntimeResume");
        super.k0();
        N0();
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f3333w;
        if (g1Var != null) {
            g1Var.f77756m.bringToFront();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void l0(int i17, long j17, long j18, long j19) {
        super.l0(i17, j17, j18, j19);
        if (this.F.containsKey(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.RuntimeException("workerId already exists");
        }
        ae.p pVar = new ae.p(this, null);
        com.tencent.mm.plugin.appbrand.jsruntime.t V = V(i17);
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = new com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper(true);
        wxAudioNativeInstallHelper.createWxAudioBinding(V, F());
        wxAudioNativeInstallHelper.initConfigWXAudio(V, (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        wxAudioNativeInstallHelper.listenLifeCycle(F());
        qe.s0 s0Var = new qe.s0();
        s0Var.a(V, F());
        qe.m0 m0Var = new qe.m0();
        m0Var.a(V, F());
        qe.f0 f0Var = new qe.f0();
        f0Var.a(V, F(), 1004);
        if (I0()) {
            qe.m mVar = new qe.m();
            mVar.c(V);
            pVar.f3369f = mVar;
        } else {
            qe.d1 d1Var = new qe.d1();
            d1Var.a(V, F(), 1);
            pVar.f3368e = d1Var;
        }
        pVar.f3370g = wxAudioNativeInstallHelper;
        pVar.f3365b = s0Var;
        pVar.f3366c = m0Var;
        pVar.f3367d = f0Var;
        final ud.b A0 = A0(false, V);
        A0.a();
        int i18 = com.tencent.magicbrush.MBRuntime.f48576j;
        com.tencent.magicbrush.MagicBrush magicBrush = A0.f426569c;
        kotlin.jvm.internal.o.d(magicBrush);
        magicBrush.f();
        com.tencent.magicbrush.MagicBrush magicBrush2 = A0.f426569c;
        kotlin.jvm.internal.o.d(magicBrush2);
        com.tencent.magicbrush.MagicBrush magicBrush3 = this.f3335y.f426569c;
        kotlin.jvm.internal.o.d(magicBrush3);
        magicBrush2.f48579c = magicBrush3;
        ae.m mVar2 = new ae.m(this, null);
        com.tencent.magicbrush.MagicBrush magicBrush4 = this.f3335y.f426569c;
        kotlin.jvm.internal.o.d(magicBrush4);
        magicBrush4.f48589m.c(new yz5.l() { // from class: ae.a$$b
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.magicbrush.MagicBrush magicBrush5 = ud.b.this.f426569c;
                kotlin.jvm.internal.o.d(magicBrush5);
                magicBrush5.f48589m.a((yg.y) obj);
                return jz5.f0.f302826a;
            }
        });
        com.tencent.magicbrush.MagicBrush magicBrush5 = A0.f426569c;
        kotlin.jvm.internal.o.d(magicBrush5);
        magicBrush5.f48588l.a(mVar2);
        pVar.f3364a = A0;
        this.F.put(java.lang.Integer.valueOf(i17), pVar);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void m0(int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "onWorkerDestroyed %d", java.lang.Integer.valueOf(i17));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.F;
        ae.p pVar = (ae.p) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            throw new java.lang.RuntimeException("workerId not exists");
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t V = V(i17);
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = pVar.f3370g;
        if (wxAudioNativeInstallHelper != null) {
            wxAudioNativeInstallHelper.destroyWxAudioBinding(V);
        }
        ud.b bVar = pVar.f3364a;
        if (bVar != null) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "onWorkerDestroyed magicbrush %d", java.lang.Integer.valueOf(i17));
            bVar.b();
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        super.m0(i17);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void n0() {
        super.n0();
        ud.b bVar = this.f3335y;
        if (bVar != null) {
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrush", "awaitDestroyDone");
            if (!bVar.f426571e.a(5000L)) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f3333w;
        if (g1Var != null) {
            g1Var.destroy();
        }
        yd.u uVar = this.G;
        if (uVar != null) {
            uVar.f460968d = 2;
            uVar.f460971g.f280657a.clear();
            uVar.f460970f = null;
            if (uVar.f460967c != null) {
                uVar.f460967c.f460939a.destroy();
                uVar.f460967c = null;
            }
            yd.n nVar = uVar.f460966b;
            if (nVar != null) {
                nVar.f460958m.d();
                nVar.f460957i = null;
                ((java.util.ArrayList) nVar.f460955g).clear();
                uVar.f460966b = null;
            }
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void o0() {
        super.o0();
        qe.s0 s0Var = new qe.s0();
        this.f3336z = s0Var;
        s0Var.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), F());
        qe.m0 m0Var = new qe.m0();
        this.A = m0Var;
        m0Var.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), F());
        qe.f0 f0Var = new qe.f0();
        this.B = f0Var;
        f0Var.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), F(), 1004);
        if (I0()) {
            qe.m mVar = new qe.m();
            this.D = mVar;
            mVar.c(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        } else {
            qe.d1 d1Var = new qe.d1();
            this.C = d1Var;
            d1Var.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), F(), 1);
        }
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = new com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper(true);
        this.E = wxAudioNativeInstallHelper;
        wxAudioNativeInstallHelper.createWxAudioBinding(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), F());
        if (mo0F0()) {
            qe.f fVar = new qe.f();
            this.V = fVar;
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
            ((com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)).k0(new qe.e(jsRuntime, fVar));
        }
        if (S() == null || !S().s2()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "add MPRemoteDebugJSContextInterface");
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime2 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
        com.tencent.luggage.sdk.jsapi.component.service.n1 n1Var = new com.tencent.luggage.sdk.jsapi.component.service.n1((com.tencent.luggage.sdk.jsapi.component.service.y) F());
        this.f3334x = n1Var;
        jsRuntime2.addJavascriptInterface(n1Var, "DebuggerConnection");
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f3333w;
        if (g1Var != null) {
            this.f3334x.f47501a = g1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
    
        if (u46.a.a(new int[]{0, 1}, ((android.view.WindowManager) b3.l.getSystemService(((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) r0.getWindowAndroid()).f87645d, android.view.WindowManager.class)).getDefaultDisplay().getRotation()) == (xi1.o.d(r0.m0().f305748r.f305550a) == xi1.o.PORTRAIT)) goto L18;
     */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0(org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.a.p0(org.json.JSONObject):void");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void q0(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        super.q0(runtime);
        z0();
        ud.b bVar = this.f3335y;
        if (bVar != null) {
            bVar.getClass();
            kotlin.jvm.internal.o.g(runtime, "runtime");
            bVar.c(runtime);
            int i17 = com.tencent.magicbrush.MBRuntime.f48576j;
        }
        qe.d1 d1Var = this.C;
        if (d1Var != null) {
            d1Var.c(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        qe.m mVar = this.D;
        if (mVar != null) {
            mVar.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        qe.f0 f0Var = this.B;
        if (f0Var != null) {
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            com.tencent.mm.plugin.appbrand.jsapi.l F = F();
            f0Var.getClass();
            com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep");
            if (jsRuntime == null) {
                com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep jsruntime is null");
            } else {
                com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var2 = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
                if (f0Var2 == null) {
                    com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep jsThreadHandler is null");
                } else {
                    f0Var2.post(new qe.c0(f0Var, F));
                }
            }
        }
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = this.E;
        if (wxAudioNativeInstallHelper != null) {
            wxAudioNativeInstallHelper.initConfigWXAudio(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        qe.f fVar = this.V;
        if (fVar != null) {
            fVar.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        N0();
        runtime.x1(com.tencent.mm.plugin.appbrand.ui.bd.class, new ge.a(runtime));
        com.tencent.magicbrush.MagicBrush w17 = w();
        w17.f48590n.addSurfaceListenerForAllViews(new ae.d(this));
        this.E.listenLifeCycle(F());
        this.H = new ae.e(this);
        fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
        com.tencent.mars.cdn.CronetLogic.addCronetTaskNetworkStateCallback(this.H);
        com.tencent.mars.cdn.CronetLogic.setGoodNetNotifyInterval(j62.e.g().i("clicfg_android_cronet_weak_net_notify_interval", 5000, true, true));
    }

    @Override // ae.r
    public void s(int i17) {
        this.I = i17;
    }

    @Override // ae.r
    public com.tencent.magicbrush.MagicBrush w() {
        com.tencent.magicbrush.MagicBrush magicBrush = this.f3335y.f426569c;
        kotlin.jvm.internal.o.d(magicBrush);
        return magicBrush;
    }

    public void x0(com.tencent.mm.plugin.appbrand.profile.b bVar) {
    }

    @Override // ph1.s
    public final boolean y(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "hy: do nothing in game service when called from modularizing helper");
        return false;
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.t y0(java.lang.String str, byte[] bArr) {
        com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config = new com.tencent.mm.appbrand.v8.IJSRuntime$Config(str, bArr);
        iJSRuntime$Config.f53949g = true;
        iJSRuntime$Config.f53948f = "1";
        iJSRuntime$Config.f53951i = true;
        iJSRuntime$Config.f53956n = new java.lang.ref.WeakReference((com.tencent.mm.plugin.appbrand.jsapi.m) F());
        return new com.tencent.mm.plugin.appbrand.jsruntime.f(iJSRuntime$Config);
    }

    public final void z0() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f3335y != null);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "setup magicbrush. loaded?[%b]", objArr);
        if (this.f3335y != null) {
            return;
        }
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).n0();
        ud.b A0 = A0(O0(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        this.f3335y = A0;
        A0.a();
        ae.m mVar = new ae.m(this, null);
        com.tencent.magicbrush.MagicBrush magicBrush = this.f3335y.f426569c;
        kotlin.jvm.internal.o.d(magicBrush);
        magicBrush.f48589m.a(mVar);
        com.tencent.magicbrush.MagicBrush magicBrush2 = this.f3335y.f426569c;
        kotlin.jvm.internal.o.d(magicBrush2);
        magicBrush2.f48588l.a(mVar);
        com.tencent.magicbrush.MagicBrush magicBrush3 = this.f3335y.f426569c;
        kotlin.jvm.internal.o.d(magicBrush3);
        magicBrush3.f48590n.addListener(new ae.g(this));
        ae.h hVar = new ae.h(this);
        ah.d.f4713b = hVar;
        g8.c.f269408a = new ah.b(hVar);
    }

    public yd.u F0() {
        if (this.G == null) {
            synchronized (this) {
                if (this.G == null) {
                    this.G = new yd.u();
                }
            }
        }
        return this.G;
    }
}
