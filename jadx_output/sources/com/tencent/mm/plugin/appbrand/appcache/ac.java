package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class ac implements com.tencent.mm.plugin.appbrand.appcache.y3 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.mb f75441j = new com.tencent.mm.plugin.appbrand.appcache.mb(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.ob f75442a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f75443b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f75444c;

    /* renamed from: d, reason: collision with root package name */
    public final k91.y0 f75445d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f75446e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f75447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f75448g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f75449h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f75450i;

    public ac(com.tencent.mm.plugin.appbrand.appcache.nb rt6, com.tencent.mm.plugin.appbrand.appcache.ob obVar) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f75442a = obVar;
        this.f75443b = rt6.getAppId();
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo c17 = rt6.c();
        this.f75444c = c17;
        this.f75446e = new java.util.concurrent.ConcurrentHashMap();
        this.f75447f = new java.util.concurrent.ConcurrentHashMap(100);
        com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "<init> appId:" + rt6.getAppId() + ", pkg:" + c17 + ", hash:" + hashCode());
        if (rt6.a()) {
            k91.y0 y0Var = new k91.y0();
            rt6.b(y0Var);
            this.f75445d = y0Var;
        } else {
            this.f75445d = null;
        }
        this.f75450i = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    public static final void b(com.tencent.mm.plugin.appbrand.appcache.ac acVar, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo) {
        acVar.getClass();
        java.lang.String name = modulePkgInfo.name;
        kotlin.jvm.internal.o.f(name, "name");
        com.tencent.mm.plugin.appbrand.appcache.y8 n17 = acVar.n(name, new com.tencent.mm.plugin.appbrand.appcache.tb(modulePkgInfo));
        kotlin.jvm.internal.o.d(n17);
        com.tencent.mm.plugin.appbrand.appcache.sb sbVar = new com.tencent.mm.plugin.appbrand.appcache.sb(acVar, modulePkgInfo);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f75447f;
        java.lang.String name2 = modulePkgInfo.name;
        kotlin.jvm.internal.o.f(name2, "name");
        com.tencent.mm.plugin.appbrand.appcache.x3 x3Var = new com.tencent.mm.plugin.appbrand.appcache.x3();
        x3Var.f76043d = n17;
        x3Var.f76044e = n17.b();
        x3Var.f76045f = modulePkgInfo.name;
        sbVar.invoke(x3Var);
        concurrentHashMap.put(name2, x3Var);
        for (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info : n17.j()) {
            java.lang.String fileName = wxaPkg$Info.f75389e;
            kotlin.jvm.internal.o.f(fileName, "fileName");
            com.tencent.mm.plugin.appbrand.appcache.x3 x3Var2 = new com.tencent.mm.plugin.appbrand.appcache.x3();
            x3Var2.f76043d = n17;
            x3Var2.f76044e = n17.b();
            x3Var2.f76045f = wxaPkg$Info.f75389e;
            x3Var2.f76046g = wxaPkg$Info.f75390f;
            x3Var2.f76047h = wxaPkg$Info.f75391g;
            sbVar.invoke(x3Var2);
            concurrentHashMap.put(fileName, x3Var2);
        }
    }

    public static final void m(com.tencent.mm.plugin.appbrand.appcache.ac acVar, java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo wxaPluginPkgInfo) {
        java.lang.String str2;
        acVar.getClass();
        com.tencent.mm.plugin.appbrand.appcache.mb mbVar = f75441j;
        java.lang.String pluginAccessPrefix = mbVar.a(str, wxaPluginPkgInfo);
        if (acVar.f75447f.get(pluginAccessPrefix) != null) {
            return;
        }
        java.lang.String provider = wxaPluginPkgInfo.provider;
        kotlin.jvm.internal.o.f(provider, "provider");
        com.tencent.mm.plugin.appbrand.appcache.y8 n17 = acVar.n(provider, new com.tencent.mm.plugin.appbrand.appcache.vb(wxaPluginPkgInfo));
        kotlin.jvm.internal.o.d(n17);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedMergePlugin hostModule:" + str + ", accessPrefix:" + pluginAccessPrefix + ", files:" + kz5.n0.g0(new java.util.LinkedList(n17.f76072h.keySet()), " , ", "{", "}", 0, null, null, 56, null));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("guardedMergePlugin hostModule:");
            sb6.append(str);
            sb6.append(", accessPrefix:");
            sb6.append(pluginAccessPrefix);
            sb6.append(", json:");
            java.io.InputStream c17 = n17.c("/plugin.json");
            sb6.append(c17 == null ? null : s46.d.d(c17, java.nio.charset.StandardCharsets.UTF_8));
            com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("guardedMergePlugin hostModule:");
            sb7.append(str);
            sb7.append(", accessPrefix:");
            sb7.append(pluginAccessPrefix);
            sb7.append(", darkmode-json:");
            java.io.InputStream c18 = n17.c("/plugin-darkmode.json");
            sb7.append(c18 == null ? null : s46.d.d(c18, java.nio.charset.StandardCharsets.UTF_8));
            com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", sb7.toString());
            com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedMergePlugin hostModule:" + str + ", accessPrefix:" + pluginAccessPrefix + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        com.tencent.mm.plugin.appbrand.appcache.ub ubVar = new com.tencent.mm.plugin.appbrand.appcache.ub(wxaPluginPkgInfo);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f75447f;
        com.tencent.mm.plugin.appbrand.appcache.x3 x3Var = new com.tencent.mm.plugin.appbrand.appcache.x3();
        x3Var.f76043d = n17;
        x3Var.f76044e = n17.b();
        ubVar.invoke(x3Var);
        concurrentHashMap.put(pluginAccessPrefix, x3Var);
        java.lang.String str4 = wxaPluginPkgInfo.prefixPath;
        if (str4 == null || str4.length() == 0) {
            str2 = pluginAccessPrefix.substring(0, pluginAccessPrefix.length() - mbVar.b(wxaPluginPkgInfo).length());
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        } else {
            str2 = pluginAccessPrefix;
        }
        if (r26.n0.E(str2, '/', false, 2, null)) {
            str2 = str2.substring(0, str2.length() - 1);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        for (com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info : n17.j()) {
            java.lang.String str5 = str2 + com.tencent.mm.plugin.appbrand.appstorage.l1.b(wxaPkg$Info.f75389e, false);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = acVar.f75447f;
            com.tencent.mm.plugin.appbrand.appcache.x3 x3Var2 = new com.tencent.mm.plugin.appbrand.appcache.x3();
            x3Var2.f76043d = n17;
            x3Var2.f76044e = n17.b();
            x3Var2.f76045f = wxaPkg$Info.f75389e;
            x3Var2.f76046g = wxaPkg$Info.f75390f;
            x3Var2.f76047h = wxaPkg$Info.f75391g;
            ubVar.invoke(x3Var2);
            concurrentHashMap2.put(str5, x3Var2);
        }
        k91.y0 y0Var = acVar.f75445d;
        if (y0Var != null) {
            kotlin.jvm.internal.o.g(pluginAccessPrefix, "pluginAccessPrefix");
            synchronized (y0Var.f305823d) {
                y0Var.f305823d.add(pluginAccessPrefix);
                k91.r rVar = y0Var.f305824e;
                if (rVar == null) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.appcache.y3 y3Var = y0Var.f305825f;
                if (y3Var == null) {
                    kotlin.jvm.internal.o.o("mPkgFileReader");
                    throw null;
                }
                y0Var.a(rVar, y3Var, pluginAccessPrefix);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.util.List a() {
        java.util.LinkedList moduleList = this.f75444c.f75402g;
        kotlin.jvm.internal.o.f(moduleList, "moduleList");
        return moduleList;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public boolean c(java.lang.String str, boolean z17) {
        boolean z18 = openReadPartialInfo(str) != null;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "canAccessFile appId:" + this.f75443b + ", url:" + str + ", ret:" + z18 + ", hash:" + hashCode());
        }
        return z18;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public void close() {
        com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "close, appId:" + this.f75443b + ", hash:" + hashCode());
        q(new com.tencent.mm.plugin.appbrand.appcache.pb(this));
        this.f75449h = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public boolean d(java.lang.String str) {
        return openReadPartialInfo(str) != null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.util.List e() {
        return (java.util.List) p(new com.tencent.mm.plugin.appbrand.appcache.wb(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.util.List f() {
        return (java.util.List) p(new com.tencent.mm.plugin.appbrand.appcache.rb(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public java.io.InputStream i(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = openReadPartialInfo(str);
        if (openReadPartialInfo != null) {
            return openReadPartialInfo.f76043d.c(openReadPartialInfo.f76045f);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public void j() {
        if (this.f75448g) {
            return;
        }
        q(new com.tencent.mm.plugin.appbrand.appcache.zb(this));
        this.f75448g = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public com.tencent.mm.plugin.appbrand.appcache.y8 l(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.appcache.y8) p(new com.tencent.mm.plugin.appbrand.appcache.qb(this, str));
    }

    public final com.tencent.mm.plugin.appbrand.appcache.y8 n(java.lang.String str, yz5.a aVar) {
        com.tencent.mm.plugin.appbrand.appcache.ob obVar;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f75446e;
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = (com.tencent.mm.plugin.appbrand.appcache.y8) concurrentHashMap.get(str);
        if (y8Var != null) {
            return y8Var;
        }
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var2 = (com.tencent.mm.plugin.appbrand.appcache.y8) aVar.invoke();
        if (y8Var2 == null) {
            return null;
        }
        boolean a17 = y8Var2.a();
        com.tencent.mars.xlog.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedObtainPkgInstance, appId:" + this.f75443b + ", name:" + str + ", pkgInnerVersion:" + y8Var2.p() + ", ok:" + a17);
        if (!a17 && (obVar = this.f75442a) != null) {
            obVar.b(str, y8Var2);
        }
        concurrentHashMap.put(str, y8Var2);
        return y8Var2;
    }

    public final void o(java.util.List _pkgList) {
        kotlin.jvm.internal.o.g(_pkgList, "_pkgList");
        if (this.f75449h) {
            return;
        }
        q(new com.tencent.mm.plugin.appbrand.appcache.xb(new java.util.LinkedList(_pkgList), this));
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y3
    public com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.appcache.x3) p(new com.tencent.mm.plugin.appbrand.appcache.yb(this, str));
    }

    public final java.lang.Object p(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f75450i.readLock();
        readLock.lock();
        try {
            return aVar.invoke();
        } finally {
            readLock.unlock();
        }
    }

    public final java.lang.Object q(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.f75450i;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return aVar.invoke();
        } finally {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
        }
    }
}
