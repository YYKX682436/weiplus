package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public abstract class a0 extends com.tencent.luggage.sdk.jsapi.component.a implements ph1.s {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.e f47362f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.b f47363g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.libmmwebrtc.MMWebRTCBinding f47364h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.wemedia.WeMediaBinding f47365i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.magicar.MagicAR f47366m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.gameaccelerate.GameAccelerateRuntime f47367n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.luggage.sdk.jsapi.component.service.t0 f47368o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.luggage.sdk.jsapi.component.service.n2 f47369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f47370q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.profile.o f47371r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Object f47372s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f47373t;

    public a0(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        super(yVar);
        this.f47366m = null;
        this.f47367n = null;
        this.f47370q = false;
        this.f47372s = new byte[0];
        this.f47373t = new java.util.concurrent.ConcurrentHashMap();
        if (X()) {
            com.tencent.luggage.sdk.jsapi.component.service.i0 i0Var = new com.tencent.luggage.sdk.jsapi.component.service.i0(this, (com.tencent.mm.plugin.appbrand.jsapi.m) F());
            this.f47363g = i0Var;
            this.f47362f = new com.tencent.luggage.sdk.jsapi.component.service.e(i0Var);
        } else {
            this.f47362f = null;
            this.f47363g = null;
        }
        if (b0()) {
            this.f47368o = new com.tencent.luggage.sdk.jsapi.component.service.t0();
        } else {
            this.f47368o = null;
        }
    }

    public static com.tencent.mm.plugin.appbrand.jsruntime.f0 H(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var) {
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getJsRuntime();
        if (jsRuntime != null) {
            return (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        }
        com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: js runtime not installed");
        return null;
    }

    public void I(org.json.JSONObject jSONObject) {
    }

    public void J() {
        if (F() == null || ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime() == null) {
            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "hy: js runtime released when destroy");
            return;
        }
        f0(new com.tencent.luggage.sdk.jsapi.component.service.a0$$b());
        com.tencent.mm.plugin.appbrand.jsruntime.y yVar = (com.tencent.mm.plugin.appbrand.jsruntime.y) M(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
        if (yVar == null) {
            com.tencent.mars.xlog.Log.w("Luggage.BaseAppBrandServiceLogic", "hy: no AppBrandJsRuntimeAddonDestroyListener");
        } else {
            yVar.f0(new com.tencent.luggage.sdk.jsapi.component.service.f0(this), true);
            yVar.d0(new com.tencent.mm.plugin.appbrand.jsruntime.x() { // from class: com.tencent.luggage.sdk.jsapi.component.service.a0$$c
                @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
                public final void onDestroy() {
                    u81.h hVar;
                    com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = com.tencent.luggage.sdk.jsapi.component.service.a0.this;
                    if (a0Var.f47368o != null) {
                        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "start destroy cronet");
                        com.tencent.luggage.sdk.jsapi.component.service.t0 t0Var = a0Var.f47368o;
                        iz5.a.e(0, java.lang.Long.valueOf(t0Var.f47535a));
                        t0Var.f47539e.destroy(t0Var.f47535a);
                        t0Var.f47535a = 0L;
                    }
                    if (a0Var.f47369p != null) {
                        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "start destroy js bridge");
                        com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var = a0Var.f47369p;
                        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = n2Var.f47505d;
                        if (appBrandRuntime != null && (hVar = appBrandRuntime.N) != null) {
                            hVar.c(n2Var.f47503b);
                        }
                        com.tencent.mm.weapp_core.JsBridge jsBridge = n2Var.f47502a;
                        if (jsBridge == null) {
                            kotlin.jvm.internal.o.o("jsBridge");
                            throw null;
                        }
                        jsBridge.destroy();
                        a0Var.f47369p = null;
                    }
                }
            });
        }
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.t K() {
        return null;
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.u M(java.lang.Class cls) {
        if (F() != null && ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime() != null) {
            return ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime().h0(cls);
        }
        com.tencent.mars.xlog.Log.w("Luggage.BaseAppBrandServiceLogic", "hy: js runtime not ready");
        return null;
    }

    public java.lang.String N() {
        return ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getAppId();
    }

    public com.tencent.luggage.sdk.jsapi.component.service.e O() {
        if (!X()) {
            return null;
        }
        com.tencent.luggage.sdk.jsapi.component.service.e eVar = this.f47362f;
        java.util.Objects.requireNonNull(eVar);
        return eVar;
    }

    public java.lang.String P() {
        return ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getComponentId() + "";
    }

    public java.lang.String R(java.lang.String str) {
        return null;
    }

    public ze.n S() {
        if (F() == null) {
            return null;
        }
        return ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3();
    }

    public java.lang.String T() {
        return "";
    }

    public int U() {
        return -2;
    }

    public com.tencent.mm.plugin.appbrand.jsruntime.t V(int i17) {
        return (com.tencent.mm.plugin.appbrand.jsruntime.t) this.f47373t.get(java.lang.Integer.valueOf(i17));
    }

    public void W() {
    }

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return false;
    }

    public boolean Z() {
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) M(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
        return !(cl.q0.f42722l != null) && (wVar == null || ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0().f42732j);
    }

    public boolean a0() {
        return false;
    }

    public boolean b0() {
        return true;
    }

    public abstract boolean c0();

    public boolean d0(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0) {
            if ("WebRTC".equals(str)) {
                return w0();
            }
            if ("WeMedia".equals(str)) {
                synchronized (this) {
                    com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "triggerBindingWeMedia");
                    if (this.f47365i == null) {
                        if (F() == null) {
                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "triggerBindingWeMedia, getComponent lost");
                            return false;
                        }
                        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
                        if (jsRuntime == null) {
                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "triggerBindingWeMedia, js runtime lost");
                            return false;
                        }
                        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
                        if (l0Var == null) {
                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "triggerBindingWeMedia, v8 addon lost");
                            return false;
                        }
                        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "triggerBindingWeMedia");
                        kq5.c.f311287b = new com.tencent.luggage.sdk.jsapi.component.service.l0(this);
                        kq5.g.f311288a = new com.tencent.luggage.sdk.jsapi.component.service.m0(this);
                        com.tencent.mm.wemedia.WeMediaBinding weMediaBinding = new com.tencent.mm.wemedia.WeMediaBinding(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        this.f47365i = weMediaBinding;
                        weMediaBinding.init(l0Var.L(), l0Var.G(), l0Var.z(), lp0.b.D() + "/appbrand/", new com.tencent.luggage.sdk.jsapi.component.service.n0(this));
                        this.f47365i.onForeground();
                        if (((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3() != null) {
                            ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().N.a(new u81.f() { // from class: com.tencent.luggage.sdk.jsapi.component.service.a0$$a
                                @Override // u81.f
                                public final void D(java.lang.String str2, u81.b bVar) {
                                    com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = com.tencent.luggage.sdk.jsapi.component.service.a0.this;
                                    a0Var.getClass();
                                    int ordinal = bVar.ordinal();
                                    if (ordinal == 0) {
                                        a0Var.f47365i.onForeground();
                                    } else if (ordinal == 1) {
                                        a0Var.f47365i.onBackground();
                                    } else {
                                        if (ordinal != 2) {
                                            return;
                                        }
                                        a0Var.f47365i.onSuspend();
                                    }
                                }
                            });
                        } else {
                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "runtime not created!! will not trigger runtime lifecycle listening");
                        }
                        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "triggerBindingWeMedia done");
                    }
                    return true;
                }
            }
            if ("ARSession".equals(str)) {
                if (this.f47366m == null) {
                    if (F() == null) {
                        com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "lazyLoadMagicARSync, getComponent lost");
                    } else {
                        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime2 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
                        if (jsRuntime2 == null) {
                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "lazyLoadMagicARSync, js runtime lost");
                        } else {
                            com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var2 = (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime2.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
                            if (l0Var2 == null) {
                                com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "lazyLoadMagicARSync, v8 addon lost");
                            } else {
                                com.tencent.luggage.sdk.jsapi.component.service.s1 s1Var = com.tencent.luggage.sdk.jsapi.component.service.t1.f47540a;
                                if (s1Var.b("magicar", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ilinkres_d7d2cdfe")) {
                                    com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_d7d2cdfe", "magicar");
                                    java.lang.String path = Ui != null ? Ui.getPath() : null;
                                    if (path == null) {
                                        com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "libmagciar.so path is null");
                                    } else if (s1Var.b("weslam", com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ilinkres_d7d2cdfe")) {
                                        com.tencent.wechat.aff.udr.x Ui2 = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_d7d2cdfe", "weslam");
                                        java.lang.String path2 = Ui2 != null ? Ui2.getPath() : null;
                                        if (path2 == null) {
                                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "libweslam.so path is null");
                                        } else {
                                            xg.f.f454351a = new com.tencent.luggage.sdk.jsapi.component.service.o0(this, path, path2);
                                            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "triggerBindingMagicAR");
                                            com.tencent.magicar.MagicAR magicAR = new com.tencent.magicar.MagicAR(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                            this.f47366m = magicAR;
                                            magicAR.bindTo(l0Var2.L(), l0Var2.G(), l0Var2.z());
                                            this.f47366m.setMagicARCallback(new com.tencent.luggage.sdk.jsapi.component.service.p0(this));
                                            com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "lazyLoadMagicARSync, lazy load magic-ar ok");
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "libweslam.so download fail");
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "libmagciar.so download fail");
                                }
                            }
                        }
                    }
                }
                return true;
            }
            if ("Puppet".equals(str) || "GameAccelerator".equals(str)) {
                if (this.f47367n == null) {
                    if (F() == null) {
                        com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "lazyLoadGameAccelerate, getComponent lost");
                    } else {
                        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime3 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).getJsRuntime();
                        if (jsRuntime3 == null) {
                            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "lazyLoadGameAccelerate, js runtime lost");
                        } else {
                            com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var3 = (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime3.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
                            if (l0Var3 == null) {
                                com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "lazyLoadGameAccelerate, v8 addon lost");
                            } else {
                                com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "lazyLoadGameAccelerate");
                                yc.c.f460748a = new com.tencent.luggage.sdk.jsapi.component.service.a0$$d();
                                com.tencent.gameaccelerate.GameAccelerateRuntime gameAccelerateRuntime = new com.tencent.gameaccelerate.GameAccelerateRuntime();
                                this.f47367n = gameAccelerateRuntime;
                                gameAccelerateRuntime.a(l0Var3.L(), l0Var3.G());
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void e0() {
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime;
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) F();
        if (yVar == null || (jsRuntime = yVar.getJsRuntime()) == null || (l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)) == null) {
            return;
        }
        l0Var.v();
    }

    public void f0(android.webkit.ValueCallback valueCallback) {
        for (java.lang.Object obj : E()) {
            if (obj instanceof com.tencent.luggage.sdk.jsapi.component.service.z) {
                valueCallback.onReceiveValue((com.tencent.luggage.sdk.jsapi.component.service.z) obj);
            }
        }
    }

    public abstract void g0();

    public void h0(int i17, java.lang.String str) {
    }

    public abstract void i0();

    public void j0() {
        if (X()) {
            t0(new com.tencent.luggage.sdk.jsapi.component.service.g0(this));
        }
    }

    public void k0() {
        if (X()) {
            t0(new com.tencent.luggage.sdk.jsapi.component.service.h0(this));
        }
    }

    public void l0(int i17, long j17, long j18, long j19) {
        synchronized (this.f47372s) {
            if (this.f47373t.containsKey(java.lang.Integer.valueOf(i17))) {
                throw new java.lang.RuntimeException("workerId already exists");
            }
            this.f47373t.put(java.lang.Integer.valueOf(i17), new ue.e(O().f47398a, i17, j17, j18, j19));
        }
    }

    public void m0(int i17) {
        synchronized (this.f47372s) {
            com.tencent.mm.plugin.appbrand.jsruntime.t V = V(i17);
            if (V == null) {
                throw new java.lang.RuntimeException("workerId " + i17 + " not valid");
            }
            V.destroy();
            this.f47373t.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public void n0() {
        synchronized (this.f47331e) {
            ((java.util.HashMap) this.f47331e).clear();
        }
        synchronized (this) {
            this.f47330d = null;
        }
        com.tencent.luggage.sdk.jsapi.component.service.b bVar = this.f47363g;
        if (bVar != null) {
            bVar.f47385e.set(true);
            bVar.f47386f = "fail invalid running state : 4";
        }
        f0(new com.tencent.luggage.sdk.jsapi.component.service.a0$$f());
    }

    public void o0() {
        com.tencent.mars.xlog.Log.i("Luggage.BaseAppBrandServiceLogic", "hy: base service js runtime post created");
        if (X()) {
            com.tencent.luggage.sdk.jsapi.component.service.e eVar = this.f47362f;
            java.util.Objects.requireNonNull(eVar);
            eVar.f47398a.notifyCreate(r0());
            t0(new com.tencent.luggage.sdk.jsapi.component.service.r0(this));
        }
        f0(new android.webkit.ValueCallback() { // from class: com.tencent.luggage.sdk.jsapi.component.service.a0$$e
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) com.tencent.luggage.sdk.jsapi.component.service.a0.this.F();
                java.util.Objects.requireNonNull(yVar);
                ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) ((com.tencent.luggage.sdk.jsapi.component.service.z) obj)).getClass();
                if (gf.l0.f271115a.a(yVar.x())) {
                    yVar.getJsRuntime().addJavascriptInterface(new gf.x(), "SkylineGlobal");
                }
            }
        });
    }

    public java.util.Map p() {
        return null;
    }

    public void p0(org.json.JSONObject jSONObject) {
    }

    public void q0(final com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (X()) {
            t0(new com.tencent.luggage.sdk.jsapi.component.service.b0(this, appBrandRuntime));
            appBrandRuntime.N.a(new com.tencent.luggage.sdk.jsapi.component.service.d0(this));
        }
        t0(new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.service.a0$$h
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var;
                com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = com.tencent.luggage.sdk.jsapi.component.service.a0.this;
                com.tencent.luggage.sdk.jsapi.component.service.t0 t0Var = a0Var.f47368o;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = appBrandRuntime;
                if (t0Var != null) {
                    iz5.a.e(0, java.lang.Long.valueOf(t0Var.f47535a));
                    uh1.a aVar = (uh1.a) appBrandRuntime2.b(uh1.a.class);
                    t0Var.f47536b = aVar;
                    if (aVar.H) {
                        rc.e.f393910a.b();
                    }
                    t0Var.f47537c = appBrandRuntime2;
                    t0Var.f47539e.setupConfig(t0Var.f47535a, t0Var.f47536b.B, com.tencent.mm.vfs.w6.i("wcf://WxaCronetRequestCache/", true), 524288000L, uh1.j0.n(t0Var.f47536b, 0), uh1.j0.n(t0Var.f47536b, 3), uh1.j0.n(t0Var.f47536b, 2), bm5.f1.a(), t0Var.f47536b.F);
                }
                if (a0Var.f47369p == null || (l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) a0Var.M(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)) == null) {
                    return;
                }
                a0Var.f47369p.c(appBrandRuntime2, l0Var.z());
            }
        });
        f0(new android.webkit.ValueCallback() { // from class: com.tencent.luggage.sdk.jsapi.component.service.a0$$i
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = com.tencent.luggage.sdk.jsapi.component.service.a0.this;
                a0Var.getClass();
                java.util.Objects.requireNonNull((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F());
                ((com.tencent.luggage.sdk.jsapi.component.service.z) obj).getClass();
            }
        });
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.a
    public java.lang.Object r(java.lang.Class cls) {
        return com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class.equals(cls) ? cls.cast(((com.tencent.luggage.sdk.jsapi.component.service.y) F()).x()) : cls.isInstance(this) ? cls.cast(this) : super.r(cls);
    }

    public com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams r0() {
        if (((com.tencent.mm.plugin.appbrand.jsruntime.l0) M(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)) == null) {
            com.tencent.mars.xlog.Log.e("Luggage.BaseAppBrandServiceLogic", "add on v8 not ready!");
            return null;
        }
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams appBrandCommonBindingJniParams = new com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams();
        java.lang.String T = T();
        appBrandCommonBindingJniParams.wasmCachePath = T;
        if (!android.text.TextUtils.isEmpty(T)) {
            appBrandCommonBindingJniParams.wasmCachePath = com.tencent.mm.vfs.w6.i(appBrandCommonBindingJniParams.wasmCachePath, true);
        }
        appBrandCommonBindingJniParams.wasmOptState = U();
        return appBrandCommonBindingJniParams;
    }

    public void s0(java.util.function.Consumer consumer) {
        synchronized (this.f47372s) {
            java.util.Iterator it = this.f47373t.values().iterator();
            while (it.hasNext()) {
                consumer.accept((com.tencent.mm.plugin.appbrand.jsruntime.t) it.next());
            }
        }
    }

    public void t0(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) M(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.BaseAppBrandServiceLogic", "hy: no js thread addon. may be remote debug env");
            return;
        }
        ze.n t37 = F() != null ? ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3() : null;
        if (t37 != null) {
            runnable = com.tencent.mm.plugin.appbrand.utils.j3.a(t37, runnable);
        }
        f0Var.post(runnable);
    }

    public boolean u0(int i17, java.lang.String str) {
        return false;
    }

    public boolean v0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000f, B:11:0x001c, B:14:0x0025, B:16:0x002f, B:19:0x0038, B:21:0x0048, B:26:0x005c, B:29:0x0065, B:31:0x006d, B:34:0x0076, B:36:0x00ad, B:39:0x00c2), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x00cb, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000f, B:11:0x001c, B:14:0x0025, B:16:0x002f, B:19:0x0038, B:21:0x0048, B:26:0x005c, B:29:0x0065, B:31:0x006d, B:34:0x0076, B:36:0x00ad, B:39:0x00c2), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean w0() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "hy: test trigger binding webrtc"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mm.libmmwebrtc.MMWebRTCBinding r0 = r11.f47364h     // Catch: java.lang.Throwable -> Lcb
            r1 = 1
            if (r0 == 0) goto Lf
            monitor-exit(r11)
            return r1
        Lf:
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r11.F()     // Catch: java.lang.Throwable -> Lcb
            com.tencent.luggage.sdk.jsapi.component.service.y r0 = (com.tencent.luggage.sdk.jsapi.component.service.y) r0     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mm.plugin.appbrand.jsruntime.t r0 = r0.getJsRuntime()     // Catch: java.lang.Throwable -> Lcb
            r2 = 0
            if (r0 != 0) goto L25
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "hy: js runtime lost"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r11)
            return r2
        L25:
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.l0> r3 = com.tencent.mm.plugin.appbrand.jsruntime.l0.class
            com.tencent.mm.plugin.appbrand.jsruntime.u r0 = r0.h0(r3)     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mm.plugin.appbrand.jsruntime.l0 r0 = (com.tencent.mm.plugin.appbrand.jsruntime.l0) r0     // Catch: java.lang.Throwable -> Lcb
            if (r0 != 0) goto L38
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "hy: v8 addon lost"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r11)
            return r2
        L38:
            com.tencent.mm.sdk.platformtools.z1 r3 = com.tencent.mm.sdk.platformtools.z.f193124t     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = "FEATURE_ID"
            java.lang.String r3 = r3.a(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = "FLAVOR_RED"
            boolean r3 = kotlin.jvm.internal.o.b(r4, r3)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L59
            java.lang.String r3 = "libmmwebrtc_v8_13_2"
            java.lang.String r4 = "ilinkres_ae0cf48a"
            com.tencent.luggage.sdk.jsapi.component.service.s1 r5 = com.tencent.luggage.sdk.jsapi.component.service.t1.f47540a     // Catch: java.lang.Throwable -> Lcb
            r6 = 10000(0x2710, double:4.9407E-320)
            boolean r3 = r5.b(r3, r6, r4)     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L57
            goto L59
        L57:
            r3 = r2
            goto L5a
        L59:
            r3 = r1
        L5a:
            if (r3 != 0) goto L65
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "libmmwebrtc.so download fail"
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r11)
            return r2
        L65:
            java.lang.String r3 = "libmmwebrtc_v8_13_2"
            java.lang.String r3 = com.tencent.luggage.sdk.jsapi.component.service.t1.a(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L76
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r1 = "libmmwebrtc.so path is null"
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r11)
            return r2
        L76:
            com.tencent.luggage.sdk.jsapi.component.service.j0 r2 = new com.tencent.luggage.sdk.jsapi.component.service.j0     // Catch: java.lang.Throwable -> Lcb
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> Lcb
            ym0.f.f463128a = r2     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mm.libmmwebrtc.MMWebRTCBinding r4 = new com.tencent.mm.libmmwebrtc.MMWebRTCBinding     // Catch: java.lang.Throwable -> Lcb
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> Lcb
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lcb
            r11.f47364h = r4     // Catch: java.lang.Throwable -> Lcb
            com.tencent.luggage.sdk.jsapi.component.service.k0 r2 = new com.tencent.luggage.sdk.jsapi.component.service.k0     // Catch: java.lang.Throwable -> Lcb
            r2.<init>(r11)     // Catch: java.lang.Throwable -> Lcb
            ym0.i.f463129a = r2     // Catch: java.lang.Throwable -> Lcb
            long r5 = r0.L()     // Catch: java.lang.Throwable -> Lcb
            long r7 = r0.G()     // Catch: java.lang.Throwable -> Lcb
            long r9 = r0.z()     // Catch: java.lang.Throwable -> Lcb
            r4.create(r5, r7, r9)     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mm.libmmwebrtc.MMWebRTCBinding r0 = r11.f47364h     // Catch: java.lang.Throwable -> Lcb
            r0.enterForeground()     // Catch: java.lang.Throwable -> Lcb
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r11.F()     // Catch: java.lang.Throwable -> Lcb
            com.tencent.luggage.sdk.jsapi.component.service.y r0 = (com.tencent.luggage.sdk.jsapi.component.service.y) r0     // Catch: java.lang.Throwable -> Lcb
            ze.n r0 = r0.t3()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lc2
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r11.F()     // Catch: java.lang.Throwable -> Lcb
            com.tencent.luggage.sdk.jsapi.component.service.y r0 = (com.tencent.luggage.sdk.jsapi.component.service.y) r0     // Catch: java.lang.Throwable -> Lcb
            ze.n r0 = r0.t3()     // Catch: java.lang.Throwable -> Lcb
            u81.h r0 = r0.N     // Catch: java.lang.Throwable -> Lcb
            com.tencent.luggage.sdk.jsapi.component.service.a0$$g r2 = new com.tencent.luggage.sdk.jsapi.component.service.a0$$g     // Catch: java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Throwable -> Lcb
            r0.a(r2)     // Catch: java.lang.Throwable -> Lcb
            goto Lc9
        Lc2:
            java.lang.String r0 = "Luggage.BaseAppBrandServiceLogic"
            java.lang.String r2 = "hy: runtime not created!! will not trigger runtime lifecycle listening"
            com.tencent.mars.xlog.Log.e(r0, r2)     // Catch: java.lang.Throwable -> Lcb
        Lc9:
            monitor-exit(r11)
            return r1
        Lcb:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.sdk.jsapi.component.service.a0.w0():boolean");
    }
}
