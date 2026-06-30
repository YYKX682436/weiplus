package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* renamed from: com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr */
/* loaded from: classes12.dex */
public final class C15587x9e6f975b {

    /* renamed from: ASSET_DEFAULT_MODEL */
    static final java.lang.String f36401x72b9843c = "fts/grouptrain/booster_main";
    private static final java.lang.String TAG = "MicroMsg.FTS.GroupTrainMgr";

    /* renamed from: sInstance */
    private static volatile com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b f36402xbfaed628;

    /* renamed from: contactWatcher */
    private l75.z0 f36404x2833697c;

    /* renamed from: model */
    private final com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o f36405x633fb29 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.o();

    /* renamed from: cache */
    private final com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f f36403x5a0af82 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f();

    /* renamed from: modelLoaded */
    private final java.util.concurrent.atomic.AtomicBoolean f36406x10e5548e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: prewarming */
    private final java.util.concurrent.atomic.AtomicBoolean f36408x2576db3a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: prewarmFinished */
    private volatile boolean f36407xc23a383a = false;

    private C15587x9e6f975b() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b m63570x9cf0d20b() {
        if (f36402xbfaed628 == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b.class) {
                if (f36402xbfaed628 == null) {
                    f36402xbfaed628 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b();
                }
            }
        }
        return f36402xbfaed628;
    }

    /* renamed from: listAllChatrooms */
    private java.util.List<java.lang.String> m63571x3b2751bd() {
        try {
            android.database.Cursor f17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().f275303d.f("select * from chatroom where chatroomname like '%@chatroom'", null, 2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (f17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a3();
                a3Var.mo9015xbf5d97fd(f17);
                arrayList.add(a3Var.f69088x37548063);
            }
            f17.close();
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "listAllChatrooms failed: %s", th6.getMessage());
            return new java.util.ArrayList();
        }
    }

    /* renamed from: readAll */
    private static java.lang.String m63572x4065382b(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(262144);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8));
        try {
            char[] cArr = new char[8192];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    bufferedReader.close();
                    return sb6.toString();
                }
                sb6.append(cArr, 0, read);
            }
        } catch (java.lang.Throwable th6) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerWatchers */
    public void m63573x12b99dfa() {
        try {
            if (this.f36404x2833697c != null) {
                return;
            }
            this.f36404x2833697c = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.j(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f36404x2833697c);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "registerWatchers failed: %s", th6.getMessage());
        }
    }

    /* renamed from: getCachedGroupCount */
    public int m63574x2186a408() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f fVar = this.f36403x5a0af82;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f219351d;
        reentrantReadWriteLock.readLock().lock();
        try {
            return ((java.util.HashMap) fVar.f219348a).size();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* renamed from: getCachedScore */
    public java.lang.Double m63575x1646b95a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f fVar = this.f36403x5a0af82;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f219351d;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (java.lang.Double) ((java.util.HashMap) fVar.f219348a).get(str);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* renamed from: getModelVersion */
    public int m63576x6d9c1be5() {
        return this.f36405x633fb29.f219399b;
    }

    /* renamed from: initIfNeeded */
    public void m63577xc10d7062(android.content.Context context) {
        if (this.f36406x10e5548e.compareAndSet(false, true)) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.g(this, context));
        }
    }

    /* renamed from: isModelLoaded */
    public boolean m63578xbcd9f104() {
        return this.f36406x10e5548e.get() && !this.f36405x633fb29.f219398a.isEmpty();
    }

    /* renamed from: isReady */
    public boolean m63579x7b5e8699() {
        return this.f36406x10e5548e.get() && !this.f36405x633fb29.f219398a.isEmpty() && this.f36407xc23a383a;
    }

    /* renamed from: loadDefaultModelInternal */
    public boolean m63580x977ac24b(android.content.Context context) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(f36401x72b9843c);
                boolean a17 = this.f36405x633fb29.a(m63572x4065382b(inputStream));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return a17;
            } catch (java.lang.Throwable th6) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th6;
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "loadDefaultModel asset open failed: %s", e17.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            return false;
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "loadDefaultModel unexpected: %s", th7.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return false;
        }
    }

    /* renamed from: loadDownloadedModel */
    public boolean m63581xb34be27c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "loadDownloadedModel called but downloader not wired yet: %s", str);
        return false;
    }

    /* renamed from: loadModelStringForTest */
    public boolean m63582x52009e87(java.lang.String str) {
        boolean a17 = this.f36405x633fb29.a(str);
        this.f36406x10e5548e.set(true);
        return a17;
    }

    /* renamed from: prewarmAllGroups */
    public void m63583x337e440d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List<java.lang.String> m63571x3b2751bd = m63571x3b2751bd();
        if (m63571x3b2751bd.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prewarm: no groups");
            return;
        }
        int i17 = 0;
        for (java.lang.String str : m63571x3b2751bd) {
            try {
                if (m63584x2576799e(str)) {
                    i17++;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "prewarm one %s failed: %s", str, th6.getMessage());
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "prewarm: total=%d, ok=%d, cost=%dms", java.lang.Integer.valueOf(m63571x3b2751bd.size()), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2));
        if (!this.f36407xc23a383a) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.p.b(11, 12, currentTimeMillis2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.p.b(9, 10, currentTimeMillis2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.p.b(15, 16, i17);
    }

    /* renamed from: prewarmOne */
    public boolean m63584x2576799e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !m63578xbcd9f104()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.c.a(str);
        a17.f219344r = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f36405x633fb29.f219398a.size());
        double c17 = this.f36405x633fb29.c(a17, arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f fVar = this.f36403x5a0af82;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f219351d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ((java.util.HashMap) fVar.f219348a).put(str, java.lang.Double.valueOf(c17));
            ((java.util.HashMap) fVar.f219349b).put(str, a17);
            ((java.util.HashMap) fVar.f219350c).put(str, java.util.Collections.unmodifiableList(new java.util.ArrayList(arrayList)));
            reentrantReadWriteLock.writeLock().unlock();
            return true;
        } catch (java.lang.Throwable th6) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th6;
        }
    }

    /* renamed from: prewarmSyncForTest */
    public void m63585x9a2d3518() {
        m63583x337e440d();
        this.f36407xc23a383a = true;
    }

    /* renamed from: scoreNow */
    public double m63586xe30f92e4(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.b a17;
        if (!m63578xbcd9f104()) {
            return -9999.0d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f fVar = this.f36403x5a0af82;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f219351d;
        reentrantReadWriteLock.readLock().lock();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.b) ((java.util.HashMap) fVar.f219349b).get(str);
            if (bVar != null) {
                a17 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.b();
                a17.f219327a = bVar.f219327a;
                a17.f219328b = bVar.f219328b;
                a17.f219329c = bVar.f219329c;
                a17.f219330d = bVar.f219330d;
                a17.f219331e = bVar.f219331e;
                a17.f219332f = bVar.f219332f;
                a17.f219333g = bVar.f219333g;
                a17.f219334h = bVar.f219334h;
                a17.f219335i = bVar.f219335i;
                a17.f219336j = bVar.f219336j;
                a17.f219337k = bVar.f219337k;
                a17.f219338l = bVar.f219338l;
                a17.f219339m = bVar.f219339m;
                a17.f219340n = bVar.f219340n;
                a17.f219341o = bVar.f219341o;
                a17.f219342p = bVar.f219342p;
                a17.f219343q = bVar.f219343q;
                a17.f219344r = bVar.f219344r;
            } else {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.c.a(str);
            }
            a17.f219344r = i17;
            boolean z17 = false;
            try {
                p13.w wVar = ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).f484624d;
                if (wVar != null) {
                    if (wVar.f432705l) {
                        z17 = true;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            if (z17) {
                a17.f219333g = a17.f219334h;
            }
            return this.f36405x633fb29.c(a17, null);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* renamed from: triggerPrewarmAsync */
    public void m63587xb66fb58c() {
        if (m63578xbcd9f104() && this.f36408x2576db3a.compareAndSet(false, true)) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.h(this), "fts.GroupTrainPrewarm");
        }
    }
}
