package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class nf extends java.lang.Thread {

    /* renamed from: c, reason: collision with root package name */
    private static final int f132092c = 80;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132095d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f132096e = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f132093a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f132094b = false;

    public nf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        setName("tms-texture");
        this.f132095d = neVar;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(a()).c(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread create");
    }

    private void d() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(a()).c(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread resume");
        this.f132093a = false;
        synchronized (this) {
            notifyAll();
        }
    }

    private boolean e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132095d;
        if (neVar == null || (tkVar = neVar.f132039f) == null || tkVar.f133194e == 0) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() - tkVar.f133201l > 560) {
            tkVar.f133193d.m36172x4c93491(tkVar.f133194e);
            tkVar.f133201l = android.os.SystemClock.elapsedRealtime();
        }
        return tkVar.f133193d.m36192x4c0a8984(tkVar.f133194e);
    }

    private boolean f() {
        return this.f132094b;
    }

    public final int a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132095d;
        if (neVar != null) {
            return neVar.K;
        }
        return -1;
    }

    public final void b() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(a()).c(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread stop");
        this.f132093a = false;
        this.f132096e = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(a()).b(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread pause");
        this.f132093a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(a()).c(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread run");
        while (!this.f132096e) {
            boolean z17 = false;
            if (!this.f132093a && (neVar = this.f132095d) != null && (tkVar = neVar.f132039f) != null && tkVar.f133194e != 0) {
                if (android.os.SystemClock.elapsedRealtime() - tkVar.f133201l > 560) {
                    tkVar.f133193d.m36172x4c93491(tkVar.f133194e);
                    tkVar.f133201l = android.os.SystemClock.elapsedRealtime();
                }
                z17 = tkVar.f133193d.m36192x4c0a8984(tkVar.f133194e);
            }
            if (!z17) {
                try {
                    synchronized (this) {
                        wait(80L);
                    }
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(android.util.Log.getStackTraceString(e17));
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        this.f132094b = true;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(a()).c(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread destroy");
    }
}
