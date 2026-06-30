package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class j3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159983b;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4 f159987f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f159988g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f159989h;

    /* renamed from: m, reason: collision with root package name */
    public km5.q f159994m;

    /* renamed from: n, reason: collision with root package name */
    public km5.q f159995n;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f159985d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f159986e = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f159990i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f159991j = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f159992k = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f159993l = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final cf.d f159984c = new cf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b4(this), 2);

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f159983b = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public void a() {
        g("interrupt()", new java.lang.Object[0]);
        this.f159985d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f159989h;
        this.f159989h = null;
        if (c0Var != null) {
            try {
                c0Var.h();
            } catch (java.lang.Throwable th6) {
                g("interrupt() cleanup service e=%s", th6);
            }
        }
        km5.q qVar = this.f159994m;
        if (qVar != null) {
            qVar.j(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f159988g;
        this.f159988g = null;
        if (n7Var != null) {
            try {
                n7Var.h();
            } catch (java.lang.Throwable th7) {
                g("interrupt() cleanup page e=%s", th7);
            }
        }
        km5.q qVar2 = this.f159995n;
        if (qVar2 != null) {
            qVar2.j(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public java.lang.String b() {
        return "AppBrandRuntimeBoostStrategy";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3
    public void c() {
        cf.d dVar = new cf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h4(this), 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(this.f159983b.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35231x151fe2a);
        l30.h hVar = (l30.h) i95.n0.c(l30.h.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i4 i4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i4(this, dVar);
        ((k30.a) hVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.c(i4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d2.a(this.f159983b, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j4(this, dVar));
    }

    public final java.lang.String f() {
        return java.lang.String.format(java.util.Locale.US, "Runtime[%s %d %s]~~%d~~ ", this.f159983b.f156336n, java.lang.Integer.valueOf(this.f159983b.f156338p.f158814g), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.d(this.f159983b.q2()).name(), java.lang.Integer.valueOf(hashCode()));
    }

    public final void g(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", f() + str, objArr);
    }

    public final void h(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", f() + str, objArr);
    }

    public final pq5.g i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g4 g4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g4(this, str);
        g4Var.f(this.f159983b);
        g4Var.N(new java.lang.Object[0]);
        return g4Var;
    }

    public final void j() {
        if (this.f159990i.getAndSet(true)) {
            return;
        }
        this.f159984c.a();
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var;
        if (this.f159991j.getAndSet(true)) {
            return;
        }
        if (this.f159989h != null && !this.f159985d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159983b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f159989h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onServiceProvidedBeforeRealInit, appId:%s, preloadedService:%s", o6Var.f156336n, c0Var);
            c0Var.g("onWxServiceInit", "");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (be1.f0.f100997h == null) {
                be1.f0.f100997h = new be1.e0();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    intentFilter.addAction("android.app.action.APP_BLOCK_STATE_CHANGED");
                }
                context.getApplicationContext().registerReceiver(be1.f0.f100997h, intentFilter);
                android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
                be1.f0.f101000n.set(com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a());
                be1.f0.f101001o.set(com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b());
                be1.f0.f100999m.set(wifiManager.isWifiEnabled());
                be1.f0.f101002p.set(new z2.n1(context).a());
                be1.f0.f100998i.set(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onWxServiceInitSent appId:%s", o6Var.f156336n);
            java.lang.String str = o6Var.u0().f158816i == null ? "" : o6Var.u0().f158816i;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_appbrand_precompile_js_file, false) && (mo50357xcd94f799 = c0Var.mo50357xcd94f799()) != null && (l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "precompiling appId:%s entryPagePath:%s", o6Var.f156336n, str);
                l0Var.mo51552x1b18fa30(o6Var.f156336n, str);
            }
            c0Var.N1(o6Var.u0().R1);
            c0Var.t1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a8(o6Var));
            if (o6Var.f167723v2 != null) {
                o6Var.f167723v2.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd service:%s", java.lang.Integer.valueOf(c0Var.hashCode()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd, thread:%s", java.lang.Thread.currentThread().getName());
            xj.k wi6 = ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).wi("MagicAdMiniProgram", "rewardAD");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "MagicAdMiniProgramInstaller[%s], exptInfo: %s, this: %s", o6Var.f156336n, wi6, o6Var);
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            mq0.a aVar = wi6.f536284a ? mq0.a.f412046e : mq0.a.f412045d;
            int i17 = wi6.f536285b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f8 f8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f8(o6Var);
            mq0.s0 s0Var = (mq0.s0) d0Var;
            s0Var.getClass();
            if (s0Var.f412149e.contains("MagicAdMiniProgram")) {
                if (mq0.m0.a(mq0.s0.f412146f, aVar)) {
                    ym5.a1.f(new mq0.n0(aVar, "MagicAdMiniProgram", i17, f8Var));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardIndexSystemReporter", "expt action " + aVar.name() + " skipped due to sampling");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] exptInfo: %s isPluginApp:%s", java.lang.Boolean.valueOf(wi6.f536284a), java.lang.Boolean.valueOf(o6Var.e3()));
            if (!wi6.f536284a || o6Var.e3()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd fail, exptInfo.open: %s, isPluginApp:%s", java.lang.Boolean.valueOf(wi6.f536284a), java.lang.Boolean.valueOf(o6Var.e3()));
            } else {
                ih1.u Q1 = c0Var.Q1();
                if (Q1 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd fail, mMBADInstaller is null");
                    mq0.d0 d0Var2 = (mq0.d0) i95.n0.c(mq0.d0.class);
                    mq0.a aVar2 = mq0.a.f412064z;
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
                    ((mq0.s0) d0Var2).Bi(aVar2, java.util.Collections.unmodifiableMap(hashMap), mq0.f0.f412087f);
                } else {
                    synchronized (o6Var.f167697a3) {
                        o6Var.f167698b3 = Q1;
                    }
                    java.lang.String str2 = o6Var.f156336n == null ? "" : o6Var.f156336n;
                    if (Q1.f373063a.isEmpty()) {
                        if (str2.isEmpty()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd fail, appId is empty");
                            mq0.d0 d0Var3 = (mq0.d0) i95.n0.c(mq0.d0.class);
                            mq0.a aVar3 = mq0.a.f412064z;
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
                            ((mq0.s0) d0Var3).Bi(aVar3, java.util.Collections.unmodifiableMap(hashMap2), mq0.f0.f412087f);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[MBAd] startMBAd, set AppId:%s", str2);
                            Q1.f373063a = str2;
                        }
                    }
                    android.app.Activity r07 = o6Var.r0();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MBAd] start, activity:");
                    sb6.append(r07 != null ? java.lang.Integer.valueOf(r07.hashCode()) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
                    pm0.v.X(new ih1.r(Q1, java.lang.System.currentTimeMillis(), r07));
                }
            }
        }
        this.f159984c.a();
    }

    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4 p4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var;
        if (!this.f159985d && (c0Var = this.f159989h) != null && !this.f159983b.q2() && this.f159983b.u0().d() && c0Var.G0()) {
            gf.l0 l0Var = gf.l0.f352648a;
            if (l0Var.b() && l0Var.a(c0Var.x())) {
                c0Var.Z1();
            }
        }
        if (this.f159995n == null || this.f159985d) {
            h("tryPreloadBeforeResourceDone mPageViewPipeline null || mProcessExpired", new java.lang.Object[0]);
            return;
        }
        if (this.f159986e) {
            h("tryPreloadBeforeResourceDone function already appended by reason[%s]", this.f159987f);
            return;
        }
        h("tryPreloadBeforeResourceDone tryDoAheadPreloadPageView by reason[%s]", p4Var);
        this.f159986e = true;
        this.f159987f = p4Var;
        if (this.f159995n.f390878d) {
            h("mPageViewPipeline has stopped", new java.lang.Object[0]);
        } else {
            this.f159995n.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y3(this, p4Var));
        }
    }
}
