package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.luggage.sdk.jsapi.component.service.y {
    public com.tencent.mm.plugin.appbrand.o6 R;
    public com.tencent.mm.plugin.appbrand.service.x6 S;
    public boolean T;
    public java.lang.String U;
    public i81.r V;
    public org.json.JSONObject W;
    public final com.tencent.mm.plugin.appbrand.platform.window.activity.r0 X;
    public final java.lang.Object Y;
    public ih1.u Z;

    public c0() {
        this(com.tencent.mm.plugin.appbrand.service.j.class);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y
    public boolean D1() {
        return com.tencent.mm.plugin.appbrand.jsapi.p0.f82478f.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(51:1|(1:3)|4|(1:6)|7|(1:9)|10|(1:12)|13|(1:112)(1:17)|(1:19)|20|(1:22)|23|(3:24|25|(1:29))|31|32|33|(1:35)|36|(1:38)(1:108)|39|(1:41)(1:107)|42|(1:44)|46|(2:47|48)|(3:50|51|(1:53))|55|56|(1:58)|60|(2:97|98)|62|(2:92|93)|64|65|66|67|(1:69)|70|71|(1:73)|74|(2:75|76)|(4:81|82|83|84)|87|82|83|84|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d6, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceWC", "postProcessConfig, put operationInfo to appContactInfo fail", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02be A[Catch: Exception -> 0x02d5, TRY_LEAVE, TryCatch #4 {Exception -> 0x02d5, blocks: (B:56:0x02b6, B:58:0x02be), top: B:55:0x02b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E1(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.c0.E1(org.json.JSONObject):void");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y
    public void H1(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
        java.lang.String str = nVar.f47352i;
        getAppId();
        try {
            com.tencent.mm.plugin.appbrand.report.x0.f88426a.a(this, nVar, z17, j17, j18, obj);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceWC", "reportEvaluateResult get npe:%s", e17);
        }
        com.tencent.mm.plugin.appbrand.performance.m.f(getAppId(), "JsInject", j17, j18, java.lang.String.format("{ \"fileName\": \"%s\", \"fileSize\": %d }", str, java.lang.Long.valueOf(nVar.f47354k)));
    }

    public boolean K1() {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        return (appServiceSkylineExtensionImpl == null || appServiceSkylineExtensionImpl.f47716l) ? false : true;
    }

    public void L1() {
        synchronized (this.Y) {
            ih1.u uVar = this.Z;
            if (uVar == null) {
                return;
            }
            uVar.a();
            this.Z = null;
        }
    }

    public void M1() {
        i81.r rVar = this.V;
        if (rVar != null) {
            rVar.y();
            this.V = null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y
    public final void N0(xi1.g gVar) {
        if (gVar != null) {
            if (gVar.compareTo(getWindowAndroid()) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "setWindowAndroid changed, old:%s, new:%s, appId:%s, stack:%s", getWindowAndroid(), gVar, getAppId(), android.util.Log.getStackTraceString(new java.lang.Throwable()));
                super.N0(gVar);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandServiceWC", "setWindowAndroid, impl==null, appId:%s", getAppId());
        android.app.Application application = ((km0.c) gm0.j1.p().a()).f308989c;
        com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.X;
        r0Var.G(application);
        super.N0(r0Var);
    }

    public void N1(java.lang.String str) {
        this.U = str;
    }

    public final void O1(org.json.JSONObject jSONObject) {
        boolean z17;
        if (t3().r2()) {
            com.tencent.mm.plugin.appbrand.o6 t37 = t3();
            boolean z18 = true;
            if (t37.l2().f87790f == 1131 && t37.l2().f87804w) {
                t37.l2().f87804w = false;
                z17 = true;
            } else {
                z17 = false;
            }
            boolean andSet = t37.f86183o2.getAndSet(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "consumeNeedShowWvaDownloadSheet (%b, %b)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(andSet));
            if (!z17 && !andSet) {
                z18 = false;
            }
            K0(jSONObject, "needShowWvaDownloadSheet", java.lang.Boolean.valueOf(z18));
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public com.tencent.mm.plugin.appbrand.page.n2 P0() {
        return new com.tencent.mm.plugin.appbrand.service.f0(this);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.n7 V0() {
        return (com.tencent.mm.plugin.appbrand.page.n7) super.W0(com.tencent.mm.plugin.appbrand.page.n7.class);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public com.tencent.mm.plugin.appbrand.x9 Q0() {
        return new com.tencent.mm.plugin.appbrand.service.e0(this, this);
    }

    public ih1.u Q1() {
        synchronized (this.Y) {
            ih1.u uVar = this.Z;
            if (uVar != null) {
                return uVar;
            }
            V1(false);
            return this.Z;
        }
    }

    public final com.tencent.mm.plugin.appbrand.service.x6 R1() {
        return this.S;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: S1, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.o6 t3() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) super.t3();
        return o6Var != null ? o6Var : this.R;
    }

    public i81.r T1() {
        i81.r rVar = this.V;
        if (rVar != null) {
            return rVar;
        }
        i81.r rVar2 = new i81.r(this, t3().D2);
        this.V = rVar2;
        return rVar2;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public final org.json.JSONObject U0() {
        org.json.JSONObject jSONObject = this.W;
        if (jSONObject != null) {
            return cf.f.a(jSONObject);
        }
        org.json.JSONObject U0 = super.U0();
        if (t3().m0().f305749s.booleanValue()) {
            this.W = cf.f.a(U0);
        }
        return U0;
    }

    public java.lang.String U1() {
        return this.U;
    }

    public final void V1(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] initMBAd isPreload:%s, service:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(hashCode()));
        synchronized (this.Y) {
            if (this.Z != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandServiceWC", "[MBAd] initMBAd, mMBAdInstaller has init");
                return;
            }
            java.lang.String appId = getAppId() == null ? "" : getAppId();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] create new installer, appId:%s, service:%s", appId, java.lang.Integer.valueOf(hashCode()));
            ih1.u uVar = new ih1.u(appId, new com.tencent.mm.plugin.appbrand.service.i0(this));
            this.Z = uVar;
            if (z17) {
                uVar.d();
            }
        }
    }

    public boolean W1() {
        return this.T;
    }

    public boolean X1() {
        return A1().c0();
    }

    public void Y1(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        K0(jSONObject2, "isTeenMode", java.lang.Boolean.valueOf(t3().u0().I1));
        K0(jSONObject2, "isCareMode", java.lang.Boolean.valueOf(t3().u0().H1));
        K0(jSONObject2, "isAccessibilityMode", java.lang.Boolean.valueOf(la5.b.f317600a.g(true)));
        K0(jSONObject2, "isWechatUser", java.lang.Boolean.valueOf(t3().u0().J1));
        K0(jSONObject2, "regCountry", com.tencent.mm.sdk.platformtools.o4.M("wechat_reg_country").u("reg_country", "CN"));
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        K0(jSONObject3, "labelColor_light", "rgba(0,0,0,0.90)");
        K0(jSONObject3, "labelColor_dark", "rgba(255,255,255,0.80)");
        K0(jSONObject3, "tertiaryLabelColor_light", "rgba(0,0,0,0.30)");
        K0(jSONObject3, "secondaryLabelColor_light", "rgba(0,0,0,0.50)");
        K0(jSONObject3, "tertiaryLabelColor_dark", "rgba(255,255,255,0.30)");
        K0(jSONObject3, "secondaryLabelColor_dark", "rgba(255,255,255,0.50)");
        K0(jSONObject2, "commonColor", jSONObject3);
        K0(jSONObject, "userConfig", jSONObject2);
    }

    public void Z1() {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            int i17 = com.tencent.mm.plugin.appbrand.app.a8.f75015a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSkylineBootGuard", "<clinit>");
            gf.l0.d(new gf.r(appServiceSkylineExtensionImpl, this));
        }
    }

    public void a2() {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            int i17 = com.tencent.mm.plugin.appbrand.app.a8.f75015a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSkylineBootGuard", "<clinit>");
            gf.l0.d(new gf.r(appServiceSkylineExtensionImpl, this));
        }
    }

    public void b2(java.lang.String bizName, java.lang.String event, java.lang.String str) {
        ih1.u uVar = this.Z;
        if (uVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] sendEventToMBBiz mMBADInstaller is null");
            return;
        }
        uVar.getClass();
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(event, "event");
        if (kotlin.jvm.internal.o.b(event, "mbAd_connectSuccess")) {
            try {
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, mq0.z.f330637h, "MagicAdMiniProgram", "RewardAd", null, null, mq0.a0.f330532e, null, null, 216, null);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report ConnectSuccess failed", e17);
            }
        }
        if (kotlin.jvm.internal.o.b(bizName, "MagicAdMiniProgram")) {
            iq0.c cVar = uVar.f291532c;
            if (cVar != null) {
                ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase(event, str == null ? "" : str));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unhandled event: ");
        sb6.append(bizName);
        sb6.append(", ");
        sb6.append(event);
        sb6.append(", ");
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        com.tencent.mars.xlog.Log.w("MagicAdMiniProgramInstaller", sb6.toString());
    }

    public final void c2(com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        this.S = x6Var;
    }

    public void d2(boolean z17) {
        this.T = z17;
    }

    public final void e2() {
        java.util.Map map = i81.j.f289592a;
        com.tencent.mm.plugin.appbrand.service.g0 g0Var = new com.tencent.mm.plugin.appbrand.service.g0(this);
        if (A1() instanceof com.tencent.luggage.sdk.jsapi.component.service.n) {
            setEvalInterceptor(new com.tencent.mm.plugin.appbrand.service.h0(this, (com.tencent.luggage.sdk.jsapi.component.service.n) A1(), g0Var));
        } else {
            setEvalInterceptor(g0Var);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public final boolean f1(java.lang.String str) {
        if (super.f1(str)) {
            return true;
        }
        return W1() && ((java.util.HashSet) i81.j.f289593b).contains(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        if (isRunning()) {
            return super.getFileSystem();
        }
        java.util.Map map = i81.j.f289592a;
        return i81.i.f289590a;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.d0
    public final void h() {
        super.h();
        L1();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public void i1() {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(getAppId(), true);
        if (b17 != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            b17.I = java.lang.System.currentTimeMillis();
        }
        e2();
        d2(false);
        super.i1();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j1() {
        /*
            r7 = this;
            r7.e2()
            df.h r0 = df.h.f229470a
            r0.getClass()
            super.j1()
            java.util.Map r0 = i81.j.f289592a
            com.tencent.mm.plugin.appbrand.x9 r0 = r7.c1()
            em1.c r0 = r0.f92386f
            cl.q0 r1 = r0.f255017b
            r2 = 0
            if (r1 != 0) goto L19
            r0 = r2
        L19:
            r1 = 3
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrandServiceWC"
            if (r0 != 0) goto L86
            com.tencent.mm.plugin.appbrand.report.quality.o0 r0 = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit
            com.tencent.mm.plugin.appbrand.report.quality.o0 r6 = r7.w1()
            if (r0 == r6) goto L2a
            r0 = r4
            goto L3c
        L2a:
            com.tencent.luggage.sdk.jsapi.component.service.v1 r0 = r7.B1()
            if (r0 == 0) goto L3a
            com.tencent.luggage.sdk.jsapi.component.service.v1 r0 = r7.B1()
            boolean r0 = r0.f47557a
            if (r0 == 0) goto L3a
            r0 = r3
            goto L3b
        L3a:
            r0 = r4
        L3b:
            r0 = r0 ^ r3
        L3c:
            if (r0 == 0) goto L86
            java.lang.String r0 = "paramsCache"
            com.tencent.mm.sdk.platformtools.o4 r6 = com.tencent.mm.sdk.platformtools.o4.M(r0)
            java.lang.String r0 = r6.u(r0, r2)
            if (r0 == 0) goto L86
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r2 = r7.x()
            int r2 = r2.i()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L86
            java.lang.String r2 = "preload: createWXLibWorker"
            com.tencent.mars.xlog.Log.i(r5, r2)
            java.lang.String r2 = "#@#"
            int r2 = r0.indexOf(r2)
            int r2 = r2 + r1
            java.lang.String r0 = r0.substring(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "preload: params cache:"
            r2.<init>(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r5, r2)
            com.tencent.mm.plugin.appbrand.x9 r2 = r7.c1()
            java.lang.String r6 = "WASplashadWorker.js"
            r2.createWXLibWorker(r6, r0)
        L86:
            int r0 = r7.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "[MBAd] preloadMBAdIfEnable, service:%s"
            com.tencent.mars.xlog.Log.i(r5, r2, r0)
            java.lang.Class<wj.m> r0 = wj.m.class
            i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Exception -> Lcc
            wj.m r0 = (wj.m) r0     // Catch: java.lang.Exception -> Lcc
            wj.g1 r0 = (wj.g1) r0     // Catch: java.lang.Exception -> Lcc
            jz5.g r0 = r0.f446411e     // Catch: java.lang.Exception -> Lcc
            jz5.n r0 = (jz5.n) r0     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lcc
            jz5.o r0 = (jz5.o) r0     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r0 = r0.f302841d     // Catch: java.lang.Exception -> Lcc
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> Lcc
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lcc
            if (r0 == r3) goto Lba
            if (r0 != r1) goto Lb8
            goto Lba
        Lb8:
            r0 = r4
            goto Lbb
        Lba:
            r0 = r3
        Lbb:
            java.lang.String r1 = "[MBAd] preloadMBAdIfEnable, preloadEnabled:%s"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lc9
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> Lc9
            r2[r4] = r6     // Catch: java.lang.Exception -> Lc9
            com.tencent.mars.xlog.Log.i(r5, r1, r2)     // Catch: java.lang.Exception -> Lc9
            goto Ld8
        Lc9:
            r1 = move-exception
            r4 = r0
            goto Lce
        Lcc:
            r0 = move-exception
            r1 = r0
        Lce:
            java.lang.String r0 = "[MBAd] check preload expt failed: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.tencent.mars.xlog.Log.e(r5, r0, r1)
            r0 = r4
        Ld8:
            if (r0 != 0) goto Le0
            java.lang.String r0 = "[MBAd] preloadMBAdIfEnable fail, expt switch is off"
            com.tencent.mars.xlog.Log.i(r5, r0)
            goto Le3
        Le0:
            r7.V1(r3)
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.c0.j1():void");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public void l1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        io.flutter.embedding.engine.loader.FlutterLoader flutterLoader;
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        this.R = o6Var;
        if (x() == null) {
            L0(o6Var.S2(false));
        }
        n0();
        super.l1(appBrandRuntime);
        final com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class);
        if (appServiceSkylineExtensionImpl != null) {
            appServiceSkylineExtensionImpl.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.service.c0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.service.c0 c0Var = com.tencent.mm.plugin.appbrand.service.c0.this;
                    com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl2 = appServiceSkylineExtensionImpl;
                    java.lang.String str = c0Var.t3().f74803n;
                    com.tencent.skyline.SkylineRuntime skylineRuntime = appServiceSkylineExtensionImpl2.f47708d;
                    if (skylineRuntime == null) {
                        return;
                    }
                    if (str == null || android.text.TextUtils.isEmpty(str)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandServiceWC", "appId is null");
                        return;
                    }
                    boolean z17 = df.h.f229475f || df.h.a();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "enable chromium cronet=[%b] start", java.lang.Boolean.valueOf(z17));
                    try {
                        uh1.a aVar = (uh1.a) c0Var.t3().b(uh1.a.class);
                        skylineRuntime.enableCronet(true, aVar.D, aVar.B);
                    } catch (java.lang.Throwable th6) {
                        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandServiceWC", "enable cronet: %s", th6);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "enable cronet=[%b] end", java.lang.Boolean.valueOf(z17));
                }
            });
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.R;
        if (gf.y0.a(o6Var2, o6Var2.t0()) && (flutterLoader = io.flutter.FlutterInjector.instance().flutterLoader()) != null && flutterLoader.initialized()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "onRuntimeReady requireWARenderContext");
            Z1();
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r6 > 0) goto L13;
     */
    @Override // com.tencent.mm.plugin.appbrand.e9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p1(java.lang.String r19, long r20, long r22, java.lang.Object r24) {
        /*
            r18 = this;
            r0 = r24
            boolean r1 = r18.isRunning()
            if (r1 != 0) goto L9
            return
        L9:
            boolean r1 = r0 instanceof cl.k1
            r2 = 0
            if (r1 == 0) goto L25
            cl.k1 r0 = (cl.k1) r0
            long r4 = r0.f42675a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1e
            long r6 = r0.f42676b
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L1e
            goto L22
        L1e:
            r4 = r20
            r6 = r22
        L22:
            long r2 = r0.flatJSCompileCost
            goto L29
        L25:
            r4 = r20
            r6 = r22
        L29:
            r16 = r2
            com.tencent.mm.plugin.appbrand.report.quality.j r8 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a
            boolean r15 = r18.X1()
            r9 = r18
            r10 = r19
            r11 = r4
            r13 = r6
            r8.k(r9, r10, r11, r13, r15, r16)
            com.tencent.mm.plugin.appbrand.o6 r0 = r18.t3()
            java.lang.String r8 = r0.f74803n
            kg1.a r9 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWxConfig
            java.lang.String r10 = "wxConfig"
            r11 = r4
            r13 = r6
            com.tencent.mm.plugin.appbrand.keylogger.w.f(r8, r9, r10, r11, r13)
            com.tencent.mm.plugin.appbrand.o6 r0 = r18.t3()
            java.lang.String r8 = r0.f74803n
            kg1.a r9 = com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWxConfig_Game
            java.lang.String r10 = "wxConfig"
            r11 = r4
            r13 = r6
            com.tencent.mm.plugin.appbrand.keylogger.w.f(r8, r9, r10, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.c0.p1(java.lang.String, long, long, java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public java.lang.String q0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, int i18) {
        com.tencent.mm.plugin.appbrand.jsapi.k interceptor = getInterceptor();
        si1.a aVar = interceptor instanceof si1.a ? (si1.a) interceptor : null;
        boolean z18 = aVar != null && aVar.h(str, i17);
        try {
            return super.q0(str, str2, str3, i17, z17, c0Var, i18);
        } finally {
            if (z18) {
                aVar.g(str, i17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public java.lang.String r0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        if (jSONObject.has("__invoke_webviewId") && t3() != null && t3().x0() != null && (A1() instanceof com.tencent.mm.plugin.appbrand.service.j)) {
            com.tencent.mm.plugin.appbrand.service.j jVar = (com.tencent.mm.plugin.appbrand.service.j) A1();
            if ((jVar.F() == null || (appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) ((com.tencent.mm.plugin.appbrand.service.c0) jVar.F()).z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class)) == null) ? false : appServiceSkylineExtensionImpl.f47714j) {
                int optInt = jSONObject.optInt("__invoke_webviewId", 0);
                com.tencent.mm.plugin.appbrand.page.d5 x07 = t3().x0();
                x07.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                synchronized (x07.f86709o) {
                    linkedList.addAll(x07.f86711q);
                    linkedList.addAll(x07.f86710p);
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            v5Var = null;
                            break;
                        }
                        com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) it.next();
                        if (w2Var != null && (v5Var = w2Var.u(optInt)) != null) {
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = v5Var;
                if (v5Var2 != null) {
                    return v5Var2.r0(k0Var, jSONObject, jSONObject2, i17, c0Var);
                }
            }
        }
        return super.r0(k0Var, jSONObject, jSONObject2, i17, c0Var);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y
    public final com.tencent.mm.plugin.appbrand.jsapi.k u1() {
        com.tencent.mm.plugin.appbrand.o6 t37 = t3();
        return t37.u0().h() ? new com.tencent.mm.plugin.appbrand.wxassistant.b(t37, this) : new si1.a(t37, this);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y
    /* renamed from: v1 */
    public em1.b Q0() {
        return new com.tencent.mm.plugin.appbrand.service.e0(this, this);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.e0
    public void y0(org.json.JSONObject jSONObject) {
        super.y0(jSONObject);
        int i17 = com.tencent.mm.ui.widget.MMEditText.F;
        int i18 = android.os.Build.VERSION.SDK_INT;
        K0(jSONObject, "useClipboardWithPermissionNotify", java.lang.Boolean.valueOf(28 <= i18 && i18 <= 30 && u75.d.c()));
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        K0(jSONObject2, "env", "WeChat");
        K0(jSONObject2, "version", java.lang.Integer.valueOf(o45.wf.f343029g));
        K0(jSONObject, "host", jSONObject2);
        if (A1() instanceof com.tencent.mm.plugin.appbrand.service.j) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = ((com.tencent.mm.plugin.appbrand.service.j) A1()).M;
            K0(jSONObject, "isSnapshoting", java.lang.Boolean.FALSE);
            if (wxaPkgV8SnapshotInfo != null) {
                K0(jSONObject, "snapshotMetaInfo", wxaPkgV8SnapshotInfo.f90673p);
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        K0(jSONObject3, "picTextNameVersion", ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() ? "1" : "0");
        K0(jSONObject3, "photoAccountOpen", ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Di() ? "1" : "0");
        K0(jSONObject3, "supportViewPhotoAcct", ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() ? "1" : "0");
        K0(jSONObject, "bizEditor", jSONObject3);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.e0
    public void z0(org.json.JSONObject jSONObject) {
        new com.tencent.mm.plugin.appbrand.service.z6().a(jSONObject);
    }

    public c0(java.lang.Class<? extends com.tencent.luggage.sdk.jsapi.component.service.a0> cls) {
        super(cls);
        this.T = false;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f81584q = z65.c.a();
        this.W = null;
        this.X = new xi1.h();
        this.Y = new java.lang.Object();
        this.Z = null;
    }
}
