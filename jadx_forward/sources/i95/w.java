package i95;

/* loaded from: classes12.dex */
public abstract class w implements i95.m {
    private static final java.lang.String TAG = "MicroMsg.FeatureService";

    /* renamed from: mStatusLock */
    private final java.util.concurrent.locks.ReentrantLock f69869xeaf6b88a = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: mStatus */
    private volatile i95.r f69868x1a39f6bf = i95.r.INACTIVE;

    /* renamed from: mTransitTask */
    private volatile i95.v f69870x38358f4b = null;

    /* renamed from: mLastException */
    private volatile java.lang.Throwable f69866x4869eeec = null;

    /* renamed from: mLastCallerStack */
    private volatile java.lang.Throwable f69865x7c55551a = null;

    /* renamed from: mActivateSource */
    private volatile i95.w f69864xb34f70bb = null;

    /* renamed from: mNotifyingFlags */
    private final java.lang.ThreadLocal<i95.q> f69867x80d04bdb = new i95.n(this);

    /* renamed from: access$1000 */
    public static void m134964xbf18579f(i95.w wVar, android.content.Context context) {
        i95.q qVar = wVar.f69867x80d04bdb.get();
        try {
            wVar.toString();
            qVar.f371375a = true;
            wVar.mo8845x3e5a77bb(context);
            wVar.si(i95.r.ACTIVATED, null);
        } finally {
        }
    }

    /* renamed from: access$1100 */
    public static void m134965xbf185b60(i95.w wVar, android.content.Context context) {
        i95.q qVar = wVar.f69867x80d04bdb.get();
        try {
            wVar.toString();
            qVar.f371376b = true;
            wVar.mo204xfac946a6(context);
            wVar.si(i95.r.INITIALIZED, null);
        } finally {
        }
    }

    /* renamed from: access$1200 */
    public static void m134966xbf185f21(i95.w wVar, android.content.Context context) {
        i95.q qVar = wVar.f69867x80d04bdb.get();
        try {
            wVar.toString();
            qVar.f371377c = true;
            wVar.mo836xb8969aab(context);
            wVar.si(i95.r.ACTIVATED, null);
        } finally {
        }
    }

    /* renamed from: access$800 */
    public static void m134971xbbd798f8(i95.w wVar, i95.w wVar2) {
        wVar.getClass();
        for (i95.w wVar3 = wVar2; wVar3 != null; wVar3 = wVar3.m134973x9b3433e4()) {
            if (wVar3 == wVar) {
                throw new com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff(java.lang.String.format("circular dependency found between '%s' and '%s'", wVar2, wVar));
            }
        }
    }

    /* renamed from: access$900 */
    public static void m134972xbbd79cb9(i95.w wVar, i95.y yVar, java.util.concurrent.ForkJoinPool forkJoinPool, boolean z17) {
        j95.b bVar = (j95.b) wVar.getClass().getAnnotation(j95.b.class);
        if (bVar == null) {
            throw new java.lang.NullPointerException("Fail to get RegisterFeatureService annotation from class '" + wVar.getClass().getName() + "'");
        }
        java.lang.Class[] m140513x1e06fd29 = bVar.m140513x1e06fd29();
        java.util.HashSet hashSet = new java.util.HashSet(m140513x1e06fd29.length);
        if (m140513x1e06fd29.length > 0) {
            for (java.lang.Class cls : m140513x1e06fd29) {
                if (!hashSet.contains(cls)) {
                    if (wVar.getClass().isAssignableFrom(cls)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "[!] '%s' depends on itself.", wVar.getClass().getName());
                    } else {
                        hashSet.add(cls);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[+] resolve dependencies '%s' of '%s'.", hashSet, wVar);
        if (hashSet.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet.size());
        java.lang.Throwable th6 = new java.lang.Throwable(wVar.m134974x9108f711());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(forkJoinPool.submit((java.util.concurrent.Callable) new i95.o(wVar, yVar, (java.lang.Class) it.next(), th6, z17)));
        }
        i95.n0.l(arrayList, false);
    }

    /* renamed from: getActivateSource */
    public final i95.w m134973x9b3433e4() {
        try {
            this.f69869xeaf6b88a.lock();
            return this.f69864xb34f70bb;
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    /* renamed from: getLastCallerStack */
    public final java.lang.Throwable m134974x9108f711() {
        try {
            this.f69869xeaf6b88a.lock();
            return this.f69865x7c55551a;
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    /* renamed from: isTransitingToOrArrivedAt */
    public final boolean m134975xfd957e9(i95.r rVar) {
        try {
            this.f69869xeaf6b88a.lock();
            boolean z17 = true;
            if (this.f69870x38358f4b == null ? this.f69868x1a39f6bf != rVar : this.f69870x38358f4b.f371391i != rVar) {
                z17 = false;
            }
            return z17;
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    public final void oi() {
        toString();
        while (this.f69870x38358f4b != null && this.f69866x4869eeec == null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[+] '%s' was joined by '%s'", this, this.f69870x38358f4b.f371389g);
                i95.v vVar = this.f69870x38358f4b;
                this.f69869xeaf6b88a.unlock();
                vVar.getClass();
                i95.n0.f(new i95.s(vVar));
            } finally {
                this.f69869xeaf6b88a.lock();
            }
        }
        if (this.f69866x4869eeec != null) {
            throw this.f69866x4869eeec;
        }
    }

    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
    }

    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
    }

    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
    }

    /* renamed from: requireAccountInitialized */
    public final void m134976x2690a4ac() {
        if (!i95.n0.g()) {
            com.p314xaae8f345.mm.app.v5 a17 = com.p314xaae8f345.mm.app.v5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (a17 != com.p314xaae8f345.mm.app.v5.f135384h) {
                com.p314xaae8f345.mm.app.p5.f(TAG, "%s: require account status in process '%s' but not main process.", getClass().getName(), a17.f135400d);
                return;
            }
            throw new com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff(this + ": require account status before account status was prepared or after logout.");
        }
        try {
            this.f69869xeaf6b88a.lock();
            i95.v vVar = this.f69870x38358f4b;
            i95.r rVar = i95.r.INITIALIZED;
            if (vVar == null) {
                if (this.f69868x1a39f6bf == rVar) {
                    return;
                }
            }
            this.f69869xeaf6b88a.unlock();
            i95.q qVar = this.f69867x80d04bdb.get();
            if (qVar.f371375a) {
                throw new com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff(getClass().getName().concat(": require account status is not allowed in onCreate method."));
            }
            if (qVar.f371376b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "%s: require account initialized in 'onAccountInitialized' method.", this);
            } else if (qVar.f371377c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "%s: require account initialized in 'onAccountReleased' method.", this);
            } else {
                i95.n0.j(this, this, rVar, true, true, false);
            }
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    public final void ri(java.lang.Throwable th6) {
        java.lang.Throwable m134974x9108f711 = m134974x9108f711();
        if (m134974x9108f711 == null) {
            throw th6;
        }
        java.lang.Throwable th7 = th6;
        while (th7.getCause() != null) {
            th7 = th7.getCause();
        }
        java.lang.StackTraceElement[] stackTrace = th7.getStackTrace();
        java.lang.StackTraceElement[] stackTrace2 = m134974x9108f711.getStackTrace();
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[stackTrace.length + stackTrace2.length + 1];
        java.lang.System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, stackTrace.length);
        stackTraceElementArr[stackTrace.length] = new java.lang.StackTraceElement("________________________________Stacktraces.below.indicate.where.the.transit.task.being.submitted", "________________________________", "DividingLine", 0);
        java.lang.System.arraycopy(stackTrace2, 0, stackTraceElementArr, stackTrace.length + 1, stackTrace2.length);
        th7.setStackTrace(stackTraceElementArr);
        throw th6;
    }

    /* renamed from: setActivateSource */
    public final void m134977x632a9bf0(i95.w wVar) {
        try {
            this.f69869xeaf6b88a.lock();
            this.f69864xb34f70bb = wVar;
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    /* renamed from: setLastCallerStack */
    public final void m134978xc7df9085(java.lang.Throwable th6) {
        try {
            this.f69869xeaf6b88a.lock();
            if (this.f69870x38358f4b == null) {
                this.f69865x7c55551a = th6;
            }
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    public final void si(i95.r rVar, java.lang.Throwable th6) {
        try {
            this.f69869xeaf6b88a.lock();
            this.f69868x1a39f6bf = rVar;
            this.f69866x4869eeec = th6;
            if (th6 == null) {
                this.f69870x38358f4b = null;
            }
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }

    /* renamed from: transitLifecycleStatusOnDemand */
    public final boolean m134979xe0bd59d3(android.content.Context context, i95.y yVar, java.util.concurrent.ForkJoinPool forkJoinPool, i95.w wVar, i95.r rVar, i95.r rVar2, boolean z17, boolean z18, boolean z19) {
        i95.q qVar = this.f69867x80d04bdb.get();
        boolean z27 = qVar.f371375a;
        i95.r rVar3 = i95.r.ACTIVATED;
        i95.r rVar4 = i95.r.INITIALIZED;
        if ((z27 && rVar2 == rVar3) || (qVar.f371376b && (rVar2 == rVar3 || rVar2 == rVar4)) || (qVar.f371377c && (rVar2 == rVar3 || rVar2 == rVar4))) {
            if (!z19) {
                return false;
            }
            throw new com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff("Reentered lifecycle method of '" + this + "' when resolve '" + wVar + "'");
        }
        try {
            this.f69869xeaf6b88a.lock();
            i95.r rVar5 = this.f69868x1a39f6bf;
            if ((((rVar.ordinal() > rVar2.ordinal() || rVar5.ordinal() < rVar2.ordinal()) && (rVar.ordinal() < rVar2.ordinal() || rVar5.ordinal() > rVar2.ordinal())) || rVar == rVar4) && (this.f69870x38358f4b == null || z18)) {
                oi();
                i95.r rVar6 = this.f69868x1a39f6bf;
                if (rVar6 == i95.r.ERROR) {
                    throw new com.p314xaae8f345.mm.p2624x91727fcf.p2625x1d1e926c.C21320x5c919cff("re-init error occurred feature service.", this.f69866x4869eeec);
                }
                if (rVar6 == rVar && rVar6 != rVar2) {
                    this.f69870x38358f4b = new i95.v(this, context, yVar, forkJoinPool, wVar, rVar, rVar2, z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[+] Create transit task '%s' for transiting(%s => %s) of '%s', wait:%s, on_thread:%s(%s)", this.f69870x38358f4b, rVar, rVar2, this, java.lang.Boolean.valueOf(z18), java.lang.Thread.currentThread().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                    if (!z18) {
                        forkJoinPool.execute(this.f69870x38358f4b.f371394o);
                    } else if (android.os.Looper.myLooper() != null) {
                        try {
                            i95.v vVar = this.f69870x38358f4b;
                            this.f69869xeaf6b88a.unlock();
                            vVar.invoke();
                            this.f69869xeaf6b88a.lock();
                        } catch (java.lang.Throwable th6) {
                            this.f69869xeaf6b88a.lock();
                            throw th6;
                        }
                    } else {
                        i95.n0.f(new i95.p(this));
                    }
                    return true;
                }
            }
            return false;
        } finally {
            this.f69869xeaf6b88a.unlock();
        }
    }
}
