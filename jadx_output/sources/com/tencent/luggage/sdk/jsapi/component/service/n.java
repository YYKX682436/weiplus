package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class n extends com.tencent.luggage.sdk.jsapi.component.service.a0 implements com.tencent.mm.plugin.appbrand.debugger.v0 {
    public qe.m A;
    public qe.f B;
    public com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper C;
    public com.tencent.mm.plugin.appbrand.debugger.g1 D;
    public com.tencent.luggage.sdk.jsapi.component.service.n1 E;
    public com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback F;
    public final com.tencent.mm.plugin.appbrand.xc G;
    public final java.util.Map H;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.l1 f47482u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f47483v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f47484w;

    /* renamed from: x, reason: collision with root package name */
    public qe.s0 f47485x;

    /* renamed from: y, reason: collision with root package name */
    public qe.m0 f47486y;

    /* renamed from: z, reason: collision with root package name */
    public qe.d1 f47487z;

    public n(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        super(yVar);
        this.f47483v = false;
        this.f47484w = false;
        this.D = null;
        this.F = null;
        this.G = new com.tencent.mm.plugin.appbrand.xc() { // from class: com.tencent.luggage.sdk.jsapi.component.service.n$$b
            @Override // com.tencent.mm.plugin.appbrand.xc
            public final void f(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
                com.tencent.luggage.sdk.jsapi.component.service.n.x0(com.tencent.luggage.sdk.jsapi.component.service.n.this, appBrandRuntime, appBrandInitConfig);
            }
        };
        this.H = new java.util.HashMap();
        this.f47482u = new com.tencent.luggage.sdk.jsapi.component.service.l1(this);
        G(com.tencent.mm.plugin.appbrand.debugger.v0.class, this);
    }

    private void L0() {
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        try {
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            if (jsRuntime == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
                return;
            }
            ze.n S = S();
            int i17 = S == null ? false : S.Z1() ? -4 : -2;
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "setJSThreadHighPriority, priority: %d", java.lang.Integer.valueOf(i17));
            f0Var.C(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AppBrandMiniProgramServiceLogicImp", th6, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    public static void x0(com.tencent.luggage.sdk.jsapi.component.service.n nVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "onRuntimeInitConfigUpdated");
        if (appBrandRuntime == null || !appBrandRuntime.V) {
            return;
        }
        nVar.L0();
    }

    public com.tencent.luggage.sdk.jsapi.component.service.t A0() {
        java.lang.String[] strArr = {"WAServiceMainContext.js"};
        java.lang.String str = strArr[0];
        android.content.res.AssetFileDescriptor G0 = K0() ? ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().G0(str) : null;
        if (G0 != null) {
            com.tencent.luggage.sdk.jsapi.component.service.t tVar = new com.tencent.luggage.sdk.jsapi.component.service.t();
            tVar.f47531a = str;
            tVar.f47532b = G0;
            return tVar;
        }
        java.lang.String M = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().M(str);
        if (android.text.TextUtils.isEmpty(M)) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "boostrap(%s) scripts not found. versionCode:%d", u46.a.c(strArr, "{}"), java.lang.Integer.valueOf(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().i())));
        }
        com.tencent.luggage.sdk.jsapi.component.service.t tVar2 = new com.tencent.luggage.sdk.jsapi.component.service.t();
        tVar2.f47531a = str;
        tVar2.f47533c = M;
        return tVar2;
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public void B(java.lang.String str) {
        r45.n47 n47Var = new r45.n47();
        n47Var.f381078e = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).V0().getComponentId();
        n47Var.f381077d = str;
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.D;
        if (g1Var != null) {
            g1Var.a0(n47Var, "domEvent");
        }
    }

    public java.lang.String B0() {
        java.lang.String e17 = ik1.f.e("wxa_library/android.js");
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "getEnvBootstrapScript, android.js.length=%d", java.lang.Integer.valueOf(e17.length()));
        java.lang.String str = (e17.concat("\n;(function(global){ delete global.NativeGlobal.invokeHandler; })(this);\n") + ik1.f.e("wxa_library/shared_buffer.js")) + ik1.f.e("wxa_library/lazy_load.js");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("WXAUDIO");
        linkedList.add("TCP");
        linkedList.add("UDP");
        if (!linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                str = str + ik1.f.e("wxa_library/wx_global_ctor_module_lazy_load.js").replaceFirst(java.util.regex.Pattern.quote("${__module__}"), (java.lang.String) it.next());
            }
        }
        return str;
    }

    public int C0() {
        return 0;
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.t D0() {
        return ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
    }

    public final boolean E0(final java.lang.String str) {
        java.lang.Boolean bool = (java.lang.Boolean) ((java.util.HashMap) this.H).get(str);
        if (bool != null && bool.booleanValue()) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "guardedCheckLoadModule appId:%s, name:%s, module already injected", N(), str);
            return false;
        }
        ((java.util.HashMap) this.H).put(str, java.lang.Boolean.TRUE);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "guardedCheckLoadModule appId:%s, name:%s, before injection", N(), str);
        com.tencent.luggage.sdk.jsapi.component.service.l1 l1Var = this.f47482u;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.n$$f
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str2 = str;
                com.tencent.luggage.sdk.jsapi.component.service.n nVar = com.tencent.luggage.sdk.jsapi.component.service.n.this;
                nVar.getClass();
                try {
                    com.tencent.luggage.sdk.jsapi.component.service.v0 v0Var = new com.tencent.luggage.sdk.jsapi.component.service.v0(str2);
                    com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F();
                    java.util.Objects.requireNonNull(yVar);
                    v0Var.a(yVar);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "loadModule using isolate context, notify but get exception %s");
                }
            }
        };
        synchronized (l1Var.f47472d) {
            if (l1Var.f47473e) {
                runnable.run();
                return true;
            }
            l1Var.f47472d.addLast(runnable);
            return true;
        }
    }

    public boolean F0() {
        return false;
    }

    public boolean G0() {
        return true;
    }

    public com.tencent.luggage.sdk.jsapi.component.service.f H0(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        return new com.tencent.luggage.sdk.jsapi.component.service.m1((com.tencent.luggage.sdk.jsapi.component.service.y) F(), j0Var);
    }

    public void I0(boolean z17, java.lang.String str, cl.k1 k1Var) {
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void J() {
        com.tencent.mm.plugin.appbrand.xc xcVar;
        super.J();
        if (S() != null && S().s2()) {
            com.tencent.mm.plugin.appbrand.utils.e3.f(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        ze.n S = S();
        if (S != null && (xcVar = this.G) != null) {
            S.I.remove(xcVar);
        }
        qe.s0 s0Var = this.f47485x;
        if (s0Var != null) {
            s0Var.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.m0 m0Var = this.f47486y;
        if (m0Var != null) {
            m0Var.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.d1 d1Var = this.f47487z;
        if (d1Var != null) {
            d1Var.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.m mVar = this.A;
        if (mVar != null) {
            mVar.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        qe.f fVar = this.B;
        if (fVar != null) {
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
            com.tencent.mm.plugin.appbrand.jsruntime.u h07 = jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
            kotlin.jvm.internal.o.f(h07, "getAddon(...)");
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) h07).d0(new qe.b(fVar));
        }
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = this.C;
        if (wxAudioNativeInstallHelper != null) {
            wxAudioNativeInstallHelper.destroyWxAudioBinding(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        }
        com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback cronetTaskNetworkStateCallback = this.F;
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
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "post report coverage task for appId:%s, contexts.size:%d", N(), java.lang.Integer.valueOf(linkedList.size()));
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(linkedList.size());
        for (final com.tencent.mm.plugin.appbrand.jsruntime.r rVar : w07) {
            try {
                ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).evaluateJavascript("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new android.webkit.ValueCallback() { // from class: com.tencent.luggage.sdk.jsapi.component.service.n$$e
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.jsapi.x1.a(com.tencent.mm.plugin.appbrand.y.this, rVar, (java.lang.String) obj);
                        countDownLatch.countDown();
                    }
                });
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "post report coverage task for appId:%s latch await failed:%s", N(), e17);
            } finally {
                com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "post report coverage task for appId:%s latch await end", N());
            }
        }
        countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void J0(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public com.tencent.mm.plugin.appbrand.jsruntime.t K() {
        return new com.tencent.mm.plugin.appbrand.jsruntime.g(null, null);
    }

    public boolean K0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public java.lang.String L() {
        org.json.JSONObject U0 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).U0();
        return java.lang.String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", U0.toString(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().m0().f305736J);
    }

    public boolean M0() {
        return false;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public java.lang.String R(java.lang.String str) {
        return "";
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void W() {
        if (((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3() == null || !((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().s2()) {
            return;
        }
        if (com.tencent.mm.plugin.appbrand.debugger.y1.f(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().u0().F).f77634g == 1) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "initRemoteDebug");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.luggage.sdk.jsapi.component.service.s(this));
            com.eclipsesource.mmv8.V8.setBreakOnStart(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
            if (wVar != null) {
                cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0();
                n07.getClass();
                ((cl.a) n07.f42724b).h(new cl.z0(n07, "xdebug", true), false);
            }
            if (((com.tencent.luggage.sdk.jsapi.component.service.y) F()).G0()) {
                com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "debugBreakForPreload");
                com.tencent.mm.plugin.appbrand.utils.e3.e(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).b1());
            }
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final boolean c0() {
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean d0(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0) {
            if (u46.l.d("WXAUDIO", str)) {
                com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = new com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper();
                this.C = wxAudioNativeInstallHelper;
                wxAudioNativeInstallHelper.createWxAudioBinding(D0(), F());
                this.C.initConfigWXAudio(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
                if (S() != null) {
                    this.C.listenLifeCycle(F());
                }
                return true;
            }
            if (u46.l.d("TCP", str)) {
                qe.m0 m0Var = new qe.m0();
                this.f47486y = m0Var;
                m0Var.a(D0(), F());
                return true;
            }
            if (u46.l.d("UDP", str)) {
                qe.s0 s0Var = new qe.s0();
                this.f47485x = s0Var;
                s0Var.a(D0(), F());
                return true;
            }
            if (u46.l.d("WSS", str)) {
                com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "WSS LazyLoad is not supported! appId:%s", N());
                return false;
            }
        }
        return super.d0(i17, str, jSONObject);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void g0() {
        sj1.l.e(P(), "public:prepare", "注入WXConfig");
        if (!this.f47483v) {
            ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime().evaluateJavascript(ik1.f.e("wxa_library/android.js"), null);
        }
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).d1();
        sj1.l.g(P());
        sj1.l.e(P(), "public:prepare", "基础库注入");
        z0(false);
        sj1.l.g(P());
        sj1.l.e(P(), "public:prepare", "代码注入(如有必要)");
        this.f47482u.f47471c.b();
        sj1.l.g(P());
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).O0();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void i0() {
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).m0();
        z0(true);
        f0(new com.tencent.luggage.sdk.jsapi.component.service.n$$a());
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
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AppBrandMiniProgramServiceLogicImp", th6, "[CAPTURED CRASH]", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void k0() {
        super.k0();
        L0();
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.D;
        if (g1Var != null) {
            g1Var.f77756m.bringToFront();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void n0() {
        super.n0();
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.D;
        if (g1Var != null) {
            g1Var.destroy();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void o0() {
        com.tencent.luggage.sdk.jsapi.component.service.f H0;
        super.o0();
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
        com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var = (com.tencent.mm.plugin.appbrand.jsruntime.j0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.j0.class);
        if (j0Var != null && (H0 = H0(jsRuntime, j0Var)) != null) {
            jsRuntime.addJavascriptInterface(H0, "WeixinJSContext");
            jsRuntime.evaluateJavascript("(function(global) {\n    let loadJsFilesWithOptions = global.WeixinJSContext.loadJsFilesWithOptions\n    global.WeixinJSContext.loadJsFiles = function(contextId, paths, options) {\n        if (!options) {\n            options = '{}'\n        } else if (typeof options !== 'string') {\n            options = JSON.stringify(options)\n        }\n        loadJsFilesWithOptions(contextId, paths, options)\n    }\n})(this);", null);
            H0.u();
        }
        if (S() != null && S().s2()) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "run in debug mode, add MPRemoteDebugJSContextInterface");
            com.tencent.luggage.sdk.jsapi.component.service.n1 n1Var = new com.tencent.luggage.sdk.jsapi.component.service.n1((com.tencent.luggage.sdk.jsapi.component.service.y) F());
            this.E = n1Var;
            jsRuntime.addJavascriptInterface(n1Var, "DebuggerConnection");
            com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.D;
            if (g1Var != null) {
                this.E.f47501a = g1Var;
            }
        }
        jsRuntime.setJsExceptionHandler(new com.tencent.luggage.sdk.jsapi.component.service.o(this, jsRuntime));
        if (G0()) {
            qe.m mVar = new qe.m();
            this.A = mVar;
            mVar.c(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        } else {
            qe.d1 d1Var = new qe.d1();
            this.f47487z = d1Var;
            d1Var.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), F(), 0);
        }
        if (F0()) {
            qe.f fVar = new qe.f();
            this.B = fVar;
            com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime2 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
            kotlin.jvm.internal.o.g(jsRuntime2, "jsRuntime");
            ((com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime2.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)).k0(new qe.e(jsRuntime2, fVar));
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void p0(org.json.JSONObject jSONObject) {
        java.util.Objects.requireNonNull((com.tencent.luggage.sdk.jsapi.component.service.y) F());
        java.util.Objects.requireNonNull(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3());
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).K0(jSONObject, "isLazyLoad", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.appbrand.page.u5) ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().b(com.tencent.mm.plugin.appbrand.page.u5.class)).a()));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void q0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.xc xcVar;
        super.q0(appBrandRuntime);
        java.util.Objects.requireNonNull((com.tencent.luggage.sdk.jsapi.component.service.y) F());
        qe.d1 d1Var = this.f47487z;
        if (d1Var != null) {
            d1Var.c(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        qe.m mVar = this.A;
        if (mVar != null) {
            mVar.a(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        qe.f fVar = this.B;
        if (fVar != null) {
            fVar.b(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper = this.C;
        if (wxAudioNativeInstallHelper != null) {
            wxAudioNativeInstallHelper.initConfigWXAudio(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), (com.tencent.mm.plugin.appbrand.jsapi.d0) F());
        }
        L0();
        ze.n S = S();
        if (S != null && (xcVar = this.G) != null) {
            S.I.add(xcVar);
        }
        appBrandRuntime.x1(com.tencent.mm.plugin.appbrand.ui.bd.class, new com.tencent.mm.plugin.appbrand.ui.zd(appBrandRuntime));
        com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper2 = this.C;
        if (wxAudioNativeInstallHelper2 != null) {
            wxAudioNativeInstallHelper2.listenLifeCycle(F());
        }
        com.tencent.luggage.sdk.jsapi.component.service.p pVar = new com.tencent.luggage.sdk.jsapi.component.service.p(this);
        this.F = pVar;
        com.tencent.mars.cdn.CronetLogic.addCronetTaskNetworkStateCallback(pVar);
    }

    @Override // ph1.s
    public final boolean y(java.lang.String str) {
        boolean E0;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.H) {
            E0 = E0(str);
        }
        return E0;
    }

    public void y0(com.tencent.mm.plugin.appbrand.profile.b bVar) {
    }

    public final void z0(final boolean z17) {
        java.lang.String str;
        if (this.f47483v) {
            return;
        }
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t();
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) F();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = N();
        objArr[1] = java.lang.Integer.valueOf(e9Var != null ? e9Var.getComponentId() : 0);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "execInternalInitScript, appId:%s, id:%d, preload:%b", objArr);
        com.tencent.mm.plugin.appbrand.nf.b((com.tencent.mm.plugin.appbrand.y) F(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime());
        java.lang.String B0 = B0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
        com.tencent.luggage.sdk.jsapi.component.service.q qVar = new com.tencent.luggage.sdk.jsapi.component.service.q(this, currentTimeMillis, z17);
        java.lang.String str2 = null;
        com.tencent.mm.plugin.appbrand.utils.d3.b(jsRuntime, null, B0, qVar);
        final com.tencent.luggage.sdk.jsapi.component.service.t A0 = A0();
        final java.lang.String str3 = A0.f47531a;
        android.content.res.AssetFileDescriptor assetFileDescriptor = A0.f47532b;
        java.lang.String str4 = (!A0.f47534d && android.text.TextUtils.isEmpty(null)) ? str3 : null;
        if (!A0.f47534d && android.text.TextUtils.isEmpty(null)) {
            str2 = org.chromium.base.BaseSwitches.V + ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().i();
        }
        final java.lang.String str5 = str2;
        final java.lang.String str6 = str4;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.n$$c
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str7 = str3;
                java.lang.String str8 = str6;
                java.lang.String str9 = str5;
                boolean z18 = z17;
                com.tencent.luggage.sdk.jsapi.component.service.n nVar = com.tencent.luggage.sdk.jsapi.component.service.n.this;
                nVar.getClass();
                com.tencent.luggage.sdk.jsapi.component.service.t tVar = A0;
                java.lang.String M = !android.text.TextUtils.isEmpty(tVar.f47533c) ? tVar.f47533c : ((com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F()).x().M(str7);
                com.tencent.mm.plugin.appbrand.utils.e3.h((com.tencent.mm.plugin.appbrand.e9) nVar.F(), ((com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F()).getJsRuntime(), str7, str8, str9, nVar.C0(), M, com.tencent.mm.plugin.appbrand.utils.i3.LIB, new com.tencent.luggage.sdk.jsapi.component.service.u(str7, M, (com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F(), nVar, z18, (com.tencent.luggage.sdk.jsapi.component.service.o) null));
            }
        };
        ze.n t37 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3();
        com.tencent.mm.plugin.appbrand.utils.i3 i3Var = com.tencent.mm.plugin.appbrand.utils.i3.LIB;
        if (t37 != null && ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().s2()) {
            java.lang.String M = assetFileDescriptor == null ? ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().M(str3) : ik1.f.f(assetFileDescriptor);
            java.lang.String M2 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x().M("WAServiceRemoteDebug.js");
            if (android.text.TextUtils.isEmpty(M2)) {
                str = "";
            } else {
                str = M2 + ";";
                this.f47484w = true;
            }
            com.tencent.mm.plugin.appbrand.utils.e3.i((com.tencent.mm.plugin.appbrand.e9) F(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), str3, str + M, i3Var, new com.tencent.luggage.sdk.jsapi.component.service.u(str3, M, (com.tencent.luggage.sdk.jsapi.component.service.y) F(), this, z17, (com.tencent.luggage.sdk.jsapi.component.service.o) null));
        } else if (assetFileDescriptor == null) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "execInternalInitScript, bootstrap fd is null for name:%s", str3);
            runnable.run();
        } else {
            com.tencent.mm.plugin.appbrand.utils.e3.j((com.tencent.mm.plugin.appbrand.e9) F(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime(), str3, str4, str5, C0(), assetFileDescriptor, i3Var, new com.tencent.luggage.sdk.jsapi.component.service.r(this, str3, assetFileDescriptor, (com.tencent.luggage.sdk.jsapi.component.service.y) F(), this, z17, runnable));
        }
        this.f47483v = true;
        this.f47482u.a();
        f0(new com.tencent.luggage.sdk.jsapi.component.service.n$$d());
    }
}
