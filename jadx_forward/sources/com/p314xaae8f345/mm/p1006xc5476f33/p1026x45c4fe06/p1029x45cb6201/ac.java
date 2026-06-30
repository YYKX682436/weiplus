package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class ac implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 {

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.mb f156974j = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.mb(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ob f156975a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f156976b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f156977c;

    /* renamed from: d, reason: collision with root package name */
    public final k91.y0 f156978d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f156979e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f156980f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f156981g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f156982h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f156983i;

    public ac(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.nb rt6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ob obVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f156975a = obVar;
        this.f156976b = rt6.mo49257x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c17 = rt6.c();
        this.f156977c = c17;
        this.f156979e = new java.util.concurrent.ConcurrentHashMap();
        this.f156980f = new java.util.concurrent.ConcurrentHashMap(100);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "<init> appId:" + rt6.mo49257x74292566() + ", pkg:" + c17 + ", hash:" + hashCode());
        if (rt6.a()) {
            k91.y0 y0Var = new k91.y0();
            rt6.b(y0Var);
            this.f156978d = y0Var;
        } else {
            this.f156978d = null;
        }
        this.f156983i = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e) {
        acVar.getClass();
        java.lang.String name = c11656xaf63146e.f33454x337a8b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 n17 = acVar.n(name, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.tb(c11656xaf63146e));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.sb sbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.sb(acVar, c11656xaf63146e);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f156980f;
        java.lang.String name2 = c11656xaf63146e.f33454x337a8b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3();
        x3Var.f157576d = n17;
        x3Var.f157577e = n17.b();
        x3Var.f157578f = c11656xaf63146e.f33454x337a8b;
        sbVar.mo146xb9724478(x3Var);
        concurrentHashMap.put(name2, x3Var);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46 : n17.j()) {
            java.lang.String fileName = c11663x8e8dee46.f156922e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileName, "fileName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3();
            x3Var2.f157576d = n17;
            x3Var2.f157577e = n17.b();
            x3Var2.f157578f = c11663x8e8dee46.f156922e;
            x3Var2.f157579g = c11663x8e8dee46.f156923f;
            x3Var2.f157580h = c11663x8e8dee46.f156924g;
            sbVar.mo146xb9724478(x3Var2);
            concurrentHashMap.put(fileName, x3Var2);
        }
    }

    public static final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847) {
        java.lang.String str2;
        acVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.mb mbVar = f156974j;
        java.lang.String pluginAccessPrefix = mbVar.a(str, c11669x3195c847);
        if (acVar.f156980f.get(pluginAccessPrefix) != null) {
            return;
        }
        java.lang.String provider = c11669x3195c847.f33473xc52405f1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(provider, "provider");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 n17 = acVar.n(provider, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.vb(c11669x3195c847));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedMergePlugin hostModule:" + str + ", accessPrefix:" + pluginAccessPrefix + ", files:" + kz5.n0.g0(new java.util.LinkedList(n17.f157605h.keySet()), " , ", "{", "}", 0, null, null, 56, null));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("guardedMergePlugin hostModule:");
            sb6.append(str);
            sb6.append(", accessPrefix:");
            sb6.append(pluginAccessPrefix);
            sb6.append(", json:");
            java.io.InputStream c17 = n17.c("/plugin.json");
            sb6.append(c17 == null ? null : s46.d.d(c17, java.nio.charset.StandardCharsets.UTF_8));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("guardedMergePlugin hostModule:");
            sb7.append(str);
            sb7.append(", accessPrefix:");
            sb7.append(pluginAccessPrefix);
            sb7.append(", darkmode-json:");
            java.io.InputStream c18 = n17.c("/plugin-darkmode.json");
            sb7.append(c18 == null ? null : s46.d.d(c18, java.nio.charset.StandardCharsets.UTF_8));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", sb7.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedMergePlugin hostModule:" + str + ", accessPrefix:" + pluginAccessPrefix + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ub ubVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ub(c11669x3195c847);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f156980f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3();
        x3Var.f157576d = n17;
        x3Var.f157577e = n17.b();
        ubVar.mo146xb9724478(x3Var);
        concurrentHashMap.put(pluginAccessPrefix, x3Var);
        java.lang.String str4 = c11669x3195c847.f33472xb01af1d7;
        if (str4 == null || str4.length() == 0) {
            str2 = pluginAccessPrefix.substring(0, pluginAccessPrefix.length() - mbVar.b(c11669x3195c847).length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        } else {
            str2 = pluginAccessPrefix;
        }
        if (r26.n0.E(str2, '/', false, 2, null)) {
            str2 = str2.substring(0, str2.length() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46 : n17.j()) {
            java.lang.String str5 = str2 + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(c11663x8e8dee46.f156922e, false);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = acVar.f156980f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3();
            x3Var2.f157576d = n17;
            x3Var2.f157577e = n17.b();
            x3Var2.f157578f = c11663x8e8dee46.f156922e;
            x3Var2.f157579g = c11663x8e8dee46.f156923f;
            x3Var2.f157580h = c11663x8e8dee46.f156924g;
            ubVar.mo146xb9724478(x3Var2);
            concurrentHashMap2.put(str5, x3Var2);
        }
        k91.y0 y0Var = acVar.f156978d;
        if (y0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAccessPrefix, "pluginAccessPrefix");
            synchronized (y0Var.f387356d) {
                y0Var.f387356d.add(pluginAccessPrefix);
                k91.r rVar = y0Var.f387357e;
                if (rVar == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var = y0Var.f387358f;
                if (y3Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPkgFileReader");
                    throw null;
                }
                y0Var.a(rVar, y3Var, pluginAccessPrefix);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.util.List a() {
        java.util.LinkedList moduleList = this.f156977c.f156935g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moduleList, "moduleList");
        return moduleList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public boolean c(java.lang.String str, boolean z17) {
        boolean z18 = mo49254xc00e82af(str) != null;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "canAccessFile appId:" + this.f156976b + ", url:" + str + ", ret:" + z18 + ", hash:" + hashCode());
        }
        return z18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    /* renamed from: close */
    public void mo49253x5a5ddf8() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "close, appId:" + this.f156976b + ", hash:" + hashCode());
        q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pb(this));
        this.f156982h = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public boolean d(java.lang.String str) {
        return mo49254xc00e82af(str) != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.util.List e() {
        return (java.util.List) p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wb(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.util.List f() {
        return (java.util.List) p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.rb(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public java.io.InputStream i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = mo49254xc00e82af(str);
        if (mo49254xc00e82af != null) {
            return mo49254xc00e82af.f157576d.c(mo49254xc00e82af.f157578f);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public void j() {
        if (this.f156981g) {
            return;
        }
        q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.zb(this));
        this.f156981g = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 l(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qb(this, str));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 n(java.lang.String str, yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ob obVar;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f156979e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) concurrentHashMap.get(str);
        if (y8Var != null) {
            return y8Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) aVar.mo152xb9724478();
        if (y8Var2 == null) {
            return null;
        }
        boolean a17 = y8Var2.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.WxaRuntimePkgMergeDirReader", "guardedObtainPkgInstance, appId:" + this.f156976b + ", name:" + str + ", pkgInnerVersion:" + y8Var2.p() + ", ok:" + a17);
        if (!a17 && (obVar = this.f156975a) != null) {
            obVar.b(str, y8Var2);
        }
        concurrentHashMap.put(str, y8Var2);
        return y8Var2;
    }

    public final void o(java.util.List _pkgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_pkgList, "_pkgList");
        if (this.f156982h) {
            return;
        }
        q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.xb(new java.util.LinkedList(_pkgList), this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3
    /* renamed from: openReadPartialInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3) p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.yb(this, str));
    }

    public final java.lang.Object p(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f156983i.readLock();
        readLock.lock();
        try {
            return aVar.mo152xb9724478();
        } finally {
            readLock.unlock();
        }
    }

    public final java.lang.Object q(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.f156983i;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i17 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i18 = 0; i18 < readHoldCount; i18++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return aVar.mo152xb9724478();
        } finally {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
        }
    }
}
