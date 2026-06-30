package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f0 f162292v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f0();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f162293w = "AppBrandComponentWxaSharedKT";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Boolean f162294x;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void F0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0 e0Var, org.json.JSONObject jSONObject, android.webkit.ValueCallback valueCallback, int i17, java.lang.Object obj) {
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
        return this.f162292v.f162401a;
    }

    public long C0() {
        return this.f162292v.f162402b;
    }

    public final void D0(org.json.JSONObject __wxConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(__wxConfig, "__wxConfig");
        F0(this, __wxConfig, null, 2, null);
    }

    public final void E0(org.json.JSONObject __wxConfig, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(__wxConfig, "__wxConfig");
        mo50357xcd94f799().mo14660x738236e6("var __wxConfig = " + __wxConfig, valueCallback);
    }

    public abstract boolean G0();

    public abstract boolean H0();

    public void I0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f0 f0Var = this.f162292v;
        f0Var.getClass();
        f0Var.f162401a = java.lang.System.currentTimeMillis();
    }

    public void J0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f0 f0Var = this.f162292v;
        f0Var.getClass();
        f0Var.f162402b = java.lang.System.currentTimeMillis();
    }

    public final void K0(org.json.JSONObject obj, java.lang.String key, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            obj.put(key, obj2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f162293w, e17, "put with key(" + key + ')', new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppId */
    public abstract /* synthetic */ java.lang.String mo48798x74292566();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, uh1.u
    /* renamed from: getAppState */
    public abstract /* synthetic */ u81.b mo48799xc0ccc466();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getAuthorizeDialogContainer */
    public /* bridge */ /* synthetic */ fl1.g2 mo50351x14ed3266() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getContext */
    public abstract /* synthetic */ android.content.Context mo50352x76847179();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    /* renamed from: getLifecycleOwner */
    public /* bridge */ /* synthetic */ p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f() {
        return null;
    }

    /* renamed from: getRuntime */
    public abstract /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t3();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: getWindowAndroid */
    public /* bridge */ /* synthetic */ xi1.g mo50261xee5260a9() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /* renamed from: isRunning */
    public abstract /* synthetic */ boolean mo50262x39e05d35();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public final void j(java.lang.Runnable runnable, long j17) {
        jz5.f0 f0Var;
        if (runnable == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = t3();
        if (t37 != null) {
            t37.j(runnable, j17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (G0() || H0()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, j17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public final void m(java.lang.Runnable runnable) {
        jz5.f0 f0Var;
        if (runnable == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = t3();
        if (t37 != null) {
            t37.m(runnable);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (G0() || H0()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t
    public android.content.Context n() {
        return mo50352x76847179();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l
    public void o(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = t3();
        if (t37 == null) {
            ((ku5.t0) ku5.t0.f394148d).g(runnable);
        } else {
            t37.o(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t() {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.f162294x
            r1 = 0
            if (r0 != 0) goto L47
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r5.x()
            java.lang.String r2 = r5.f162293w
            if (r0 != 0) goto L14
            java.lang.String r0 = "isCollectInvokeCost false, libReader is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
            r0 = r1
            goto L50
        L14:
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r0 = r5.x()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            java.lang.String r3 = "collectInvokeCost"
            java.lang.String r0 = r0.qe(r3)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.f162294x = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "this:"
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r3 = " isCollectInvokeCost:"
            r0.append(r3)
            java.lang.Boolean r3 = r5.f162294x
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
        L47:
            java.lang.Boolean r0 = r5.f162294x
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            boolean r0 = r0.booleanValue()
        L50:
            if (r0 == 0) goto L9d
            java.lang.String r0 = r5.f162293w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "this:"
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " invokeCostManager:"
            r2.append(r3)
            com.tencent.mm.plugin.appbrand.jsapi.if r3 = r5.mo50356x8f2ff6d2()
            r2.append(r3)
            java.lang.String r3 = " start"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)
            com.tencent.mm.plugin.appbrand.jsapi.if r0 = r5.mo50356x8f2ff6d2()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            monitor-enter(r0)
            java.lang.String r2 = "Luggage.JsInvokeCostManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            r3.append(r0)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = " start"
            r3.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)     // Catch: java.lang.Throwable -> L9a
            r0.f162850b = r1     // Catch: java.lang.Throwable -> L9a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e0.t():boolean");
    }

    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
    public abstract /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x();

    public void y0(org.json.JSONObject config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        z0(config);
        K0(config, "system", "Android " + android.os.Build.VERSION.RELEASE);
        K0(config, "systemApiLevel", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        K0(config, "brand", android.os.Build.BRAND);
        K0(config, "pixelRatio", java.lang.Float.valueOf(mo50352x76847179().getResources().getDisplayMetrics().density));
    }

    public void z0(org.json.JSONObject provideConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provideConfig, "provideConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bg bgVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cg.f161731a;
        bgVar.a(provideConfig, "platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        bgVar.a(provideConfig, "brand", android.os.Build.BRAND);
        bgVar.a(provideConfig, "model", wo.w0.m());
    }
}
