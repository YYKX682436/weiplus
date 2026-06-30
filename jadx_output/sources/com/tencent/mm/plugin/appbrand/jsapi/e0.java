package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class e0 extends com.tencent.mm.plugin.appbrand.jsapi.m implements com.tencent.mm.plugin.appbrand.jsapi.d0 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.f0 f80759v = new com.tencent.mm.plugin.appbrand.jsapi.f0();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f80760w = "AppBrandComponentWxaSharedKT";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Boolean f80761x;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F0(com.tencent.mm.plugin.appbrand.jsapi.e0 e0Var, org.json.JSONObject jSONObject, android.webkit.ValueCallback valueCallback, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: injectWxConfig");
        }
        if ((i17 & 2) != 0) {
            valueCallback = null;
        }
        e0Var.E0(jSONObject, valueCallback);
    }

    public org.json.JSONObject A0() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        y0(jSONObject);
        K0(jSONObject, "preload", java.lang.Boolean.TRUE);
        return jSONObject;
    }

    public long B0() {
        return this.f80759v.f80868a;
    }

    public long C0() {
        return this.f80759v.f80869b;
    }

    public final void D0(org.json.JSONObject __wxConfig) {
        kotlin.jvm.internal.o.g(__wxConfig, "__wxConfig");
        F0(this, __wxConfig, null, 2, null);
    }

    public final void E0(org.json.JSONObject __wxConfig, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        kotlin.jvm.internal.o.g(__wxConfig, "__wxConfig");
        getJsRuntime().evaluateJavascript("var __wxConfig = " + __wxConfig, valueCallback);
    }

    public abstract boolean G0();

    public abstract boolean H0();

    public void I0() {
        com.tencent.mm.plugin.appbrand.jsapi.f0 f0Var = this.f80759v;
        f0Var.getClass();
        f0Var.f80868a = java.lang.System.currentTimeMillis();
    }

    public void J0() {
        com.tencent.mm.plugin.appbrand.jsapi.f0 f0Var = this.f80759v;
        f0Var.getClass();
        f0Var.f80869b = java.lang.System.currentTimeMillis();
    }

    public final void K0(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(key, "key");
        try {
            obj.put(key, obj2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f80760w, e17, "put with key(" + key + ')', new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public abstract /* synthetic */ java.lang.String getAppId();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public abstract /* synthetic */ u81.b getAppState();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public abstract /* synthetic */ android.content.Context getContext();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    /* renamed from: getRuntime */
    public abstract /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime t3();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public abstract /* synthetic */ boolean isRunning();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public final void j(java.lang.Runnable runnable, long j17) {
        jz5.f0 f0Var;
        if (runnable == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 != null) {
            t37.j(runnable, j17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (G0() || H0()) {
                com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public final void m(java.lang.Runnable runnable) {
        jz5.f0 f0Var;
        if (runnable == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 != null) {
            t37.m(runnable);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (G0() || H0()) {
                com.tencent.mm.sdk.platformtools.u3.h(runnable);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 == null) {
            ((ku5.t0) ku5.t0.f312615d).g(runnable);
        } else {
            t37.o(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f80761x
            r1 = 0
            if (r0 != 0) goto L47
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r5.x()
            java.lang.String r2 = r5.f80760w
            if (r0 != 0) goto L14
            java.lang.String r0 = "isCollectInvokeCost false, libReader is null"
            com.tencent.mars.xlog.Log.w(r2, r0)
            r0 = r1
            goto L50
        L14:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r5.x()
            kotlin.jvm.internal.o.d(r0)
            java.lang.String r3 = "collectInvokeCost"
            java.lang.String r0 = r0.qe(r3)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.f80761x = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "this:"
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r3 = " isCollectInvokeCost:"
            r0.append(r3)
            java.lang.Boolean r3 = r5.f80761x
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
        L47:
            java.lang.Boolean r0 = r5.f80761x
            kotlin.jvm.internal.o.d(r0)
            boolean r0 = r0.booleanValue()
        L50:
            if (r0 == 0) goto L9d
            java.lang.String r0 = r5.f80760w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "this:"
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " invokeCostManager:"
            r2.append(r3)
            com.tencent.mm.plugin.appbrand.jsapi.if r3 = r5.getInvokeCostManager()
            r2.append(r3)
            java.lang.String r3 = " start"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r0, r2)
            com.tencent.mm.plugin.appbrand.jsapi.if r0 = r5.getInvokeCostManager()
            kotlin.jvm.internal.o.d(r0)
            monitor-enter(r0)
            java.lang.String r2 = "Luggage.JsInvokeCostManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            r3.append(r0)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = " start"
            r3.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9a
            com.tencent.mars.xlog.Log.i(r2, r3)     // Catch: java.lang.Throwable -> L9a
            r0.f81317b = r1     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r0)
            r0 = 1
            return r0
        L9a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.e0.t():boolean");
    }

    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public abstract /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x();

    public void y0(org.json.JSONObject config) {
        kotlin.jvm.internal.o.g(config, "config");
        z0(config);
        K0(config, "system", "Android " + android.os.Build.VERSION.RELEASE);
        K0(config, "systemApiLevel", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        K0(config, "brand", android.os.Build.BRAND);
        K0(config, "pixelRatio", java.lang.Float.valueOf(getContext().getResources().getDisplayMetrics().density));
    }

    public void z0(org.json.JSONObject provideConfig) {
        kotlin.jvm.internal.o.g(provideConfig, "provideConfig");
        com.tencent.mm.plugin.appbrand.jsapi.bg bgVar = com.tencent.mm.plugin.appbrand.jsapi.cg.f80198a;
        bgVar.a(provideConfig, "platform", com.eclipsesource.mmv8.Platform.ANDROID);
        bgVar.a(provideConfig, "brand", android.os.Build.BRAND);
        bgVar.a(provideConfig, "model", wo.w0.m());
    }
}
