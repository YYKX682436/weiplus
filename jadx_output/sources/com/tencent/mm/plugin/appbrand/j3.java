package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class j3 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78450b;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.p4 f78454f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.page.n7 f78455g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.service.c0 f78456h;

    /* renamed from: m, reason: collision with root package name */
    public km5.q f78461m;

    /* renamed from: n, reason: collision with root package name */
    public km5.q f78462n;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f78452d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f78453e = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f78457i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f78458j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f78459k = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f78460l = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final cf.d f78451c = new cf.d(new com.tencent.mm.plugin.appbrand.b4(this), 2);

    public j3(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78450b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void a() {
        g("interrupt()", new java.lang.Object[0]);
        this.f78452d = true;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f78456h;
        this.f78456h = null;
        if (c0Var != null) {
            try {
                c0Var.h();
            } catch (java.lang.Throwable th6) {
                g("interrupt() cleanup service e=%s", th6);
            }
        }
        km5.q qVar = this.f78461m;
        if (qVar != null) {
            qVar.j(true);
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f78455g;
        this.f78455g = null;
        if (n7Var != null) {
            try {
                n7Var.h();
            } catch (java.lang.Throwable th7) {
                g("interrupt() cleanup page e=%s", th7);
            }
        }
        km5.q qVar2 = this.f78462n;
        if (qVar2 != null) {
            qVar2.j(true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "AppBrandRuntimeBoostStrategy";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        cf.d dVar = new cf.d(new com.tencent.mm.plugin.appbrand.h4(this), 2);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInstallLibraries);
        l30.h hVar = (l30.h) i95.n0.c(l30.h.class);
        com.tencent.mm.plugin.appbrand.i4 i4Var = new com.tencent.mm.plugin.appbrand.i4(this, dVar);
        ((k30.a) hVar).getClass();
        com.tencent.mm.plugin.expansions.i0.c(i4Var);
        com.tencent.mm.plugin.appbrand.launching.d2.a(this.f78450b, new com.tencent.mm.plugin.appbrand.j4(this, dVar));
    }

    public final java.lang.String f() {
        return java.lang.String.format(java.util.Locale.US, "Runtime[%s %d %s]~~%d~~ ", this.f78450b.f74803n, java.lang.Integer.valueOf(this.f78450b.f74805p.f77281g), com.tencent.mm.plugin.appbrand.task.x0.d(this.f78450b.q2()).name(), java.lang.Integer.valueOf(hashCode()));
    }

    public final void g(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", f() + str, objArr);
    }

    public final void h(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", f() + str, objArr);
    }

    public final pq5.g i(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.g4 g4Var = new com.tencent.mm.plugin.appbrand.g4(this, str);
        g4Var.f(this.f78450b);
        g4Var.N(new java.lang.Object[0]);
        return g4Var;
    }

    public final void j() {
        if (this.f78457i.getAndSet(true)) {
            return;
        }
        this.f78451c.a();
    }

    public final void k() {
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime;
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var;
        if (this.f78458j.getAndSet(true)) {
            return;
        }
        if (this.f78456h != null && !this.f78452d) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78450b;
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f78456h;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onServiceProvidedBeforeRealInit, appId:%s, preloadedService:%s", o6Var.f74803n, c0Var);
            c0Var.g("onWxServiceInit", "");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (be1.f0.f19464h == null) {
                be1.f0.f19464h = new be1.e0();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    intentFilter.addAction("android.app.action.APP_BLOCK_STATE_CHANGED");
                }
                context.getApplicationContext().registerReceiver(be1.f0.f19464h, intentFilter);
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
                be1.f0.f19467n.set(com.tencent.mm.sdk.platformtools.n2.a());
                be1.f0.f19468o.set(com.tencent.mm.sdk.platformtools.n2.b());
                be1.f0.f19466m.set(wifiManager.isWifiEnabled());
                be1.f0.f19469p.set(new z2.n1(context).a());
                be1.f0.f19465i.set(true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onWxServiceInitSent appId:%s", o6Var.f74803n);
            java.lang.String str = o6Var.u0().f77283i == null ? "" : o6Var.u0().f77283i;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_precompile_js_file, false) && (jsRuntime = c0Var.getJsRuntime()) != null && (l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "precompiling appId:%s entryPagePath:%s", o6Var.f74803n, str);
                l0Var.precompile(o6Var.f74803n, str);
            }
            c0Var.N1(o6Var.u0().R1);
            c0Var.t1(new com.tencent.mm.plugin.appbrand.a8(o6Var));
            if (o6Var.f86190v2 != null) {
                o6Var.f86190v2.b();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd service:%s", java.lang.Integer.valueOf(c0Var.hashCode()));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd, thread:%s", java.lang.Thread.currentThread().getName());
            xj.k wi6 = ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).wi("MagicAdMiniProgram", "rewardAD");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "MagicAdMiniProgramInstaller[%s], exptInfo: %s, this: %s", o6Var.f74803n, wi6, o6Var);
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            mq0.a aVar = wi6.f454751a ? mq0.a.f330513e : mq0.a.f330512d;
            int i17 = wi6.f454752b;
            com.tencent.mm.plugin.appbrand.f8 f8Var = new com.tencent.mm.plugin.appbrand.f8(o6Var);
            mq0.s0 s0Var = (mq0.s0) d0Var;
            s0Var.getClass();
            if (s0Var.f330616e.contains("MagicAdMiniProgram")) {
                if (mq0.m0.a(mq0.s0.f330613f, aVar)) {
                    ym5.a1.f(new mq0.n0(aVar, "MagicAdMiniProgram", i17, f8Var));
                } else {
                    com.tencent.mars.xlog.Log.i("MagicCardIndexSystemReporter", "expt action " + aVar.name() + " skipped due to sampling");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] exptInfo: %s isPluginApp:%s", java.lang.Boolean.valueOf(wi6.f454751a), java.lang.Boolean.valueOf(o6Var.e3()));
            if (!wi6.f454751a || o6Var.e3()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd fail, exptInfo.open: %s, isPluginApp:%s", java.lang.Boolean.valueOf(wi6.f454751a), java.lang.Boolean.valueOf(o6Var.e3()));
            } else {
                ih1.u Q1 = c0Var.Q1();
                if (Q1 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd fail, mMBADInstaller is null");
                    mq0.d0 d0Var2 = (mq0.d0) i95.n0.c(mq0.d0.class);
                    mq0.a aVar2 = mq0.a.f330531z;
                    java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("errMsg", "get MBAdInstaller fail")};
                    java.util.HashMap hashMap = new java.util.HashMap(1);
                    java.util.Map.Entry entry = entryArr[0];
                    java.lang.Object key = entry.getKey();
                    java.util.Objects.requireNonNull(key);
                    java.lang.Object value = entry.getValue();
                    java.util.Objects.requireNonNull(value);
                    if (hashMap.put(key, value) != null) {
                        throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                    }
                    ((mq0.s0) d0Var2).Bi(aVar2, java.util.Collections.unmodifiableMap(hashMap), mq0.f0.f330554f);
                } else {
                    synchronized (o6Var.f86164a3) {
                        o6Var.f86165b3 = Q1;
                    }
                    java.lang.String str2 = o6Var.f74803n == null ? "" : o6Var.f74803n;
                    if (Q1.f291530a.isEmpty()) {
                        if (str2.isEmpty()) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd fail, appId is empty");
                            mq0.d0 d0Var3 = (mq0.d0) i95.n0.c(mq0.d0.class);
                            mq0.a aVar3 = mq0.a.f330531z;
                            java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("errMsg", "appId is empty")};
                            java.util.HashMap hashMap2 = new java.util.HashMap(1);
                            java.util.Map.Entry entry2 = entryArr2[0];
                            java.lang.Object key2 = entry2.getKey();
                            java.util.Objects.requireNonNull(key2);
                            java.lang.Object value2 = entry2.getValue();
                            java.util.Objects.requireNonNull(value2);
                            if (hashMap2.put(key2, value2) != null) {
                                throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
                            }
                            ((mq0.s0) d0Var3).Bi(aVar3, java.util.Collections.unmodifiableMap(hashMap2), mq0.f0.f330554f);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd, set AppId:%s", str2);
                            Q1.f291530a = str2;
                        }
                    }
                    android.app.Activity r07 = o6Var.r0();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MBAd] start, activity:");
                    sb6.append(r07 != null ? java.lang.Integer.valueOf(r07.hashCode()) : null);
                    com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
                    pm0.v.X(new ih1.r(Q1, java.lang.System.currentTimeMillis(), r07));
                }
            }
        }
        this.f78451c.a();
    }

    public void l(com.tencent.mm.plugin.appbrand.p4 p4Var) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var;
        if (!this.f78452d && (c0Var = this.f78456h) != null && !this.f78450b.q2() && this.f78450b.u0().d() && c0Var.G0()) {
            gf.l0 l0Var = gf.l0.f271115a;
            if (l0Var.b() && l0Var.a(c0Var.x())) {
                c0Var.Z1();
            }
        }
        if (this.f78462n == null || this.f78452d) {
            h("tryPreloadBeforeResourceDone mPageViewPipeline null || mProcessExpired", new java.lang.Object[0]);
            return;
        }
        if (this.f78453e) {
            h("tryPreloadBeforeResourceDone function already appended by reason[%s]", this.f78454f);
            return;
        }
        h("tryPreloadBeforeResourceDone tryDoAheadPreloadPageView by reason[%s]", p4Var);
        this.f78453e = true;
        this.f78454f = p4Var;
        if (this.f78462n.f309345d) {
            h("mPageViewPipeline has stopped", new java.lang.Object[0]);
        } else {
            this.f78462n.n(new com.tencent.mm.plugin.appbrand.y3(this, p4Var));
        }
    }
}
