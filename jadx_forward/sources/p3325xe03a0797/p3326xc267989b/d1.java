package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class d1 extends p3325xe03a0797.p3326xc267989b.b2 implements java.lang.Runnable {

    /* renamed from: _thread */
    private static volatile java.lang.Thread f72698x6d510b29;

    /* renamed from: debugStatus */
    private static volatile int f72699xa3400825;

    /* renamed from: n, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.d1 f391690n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f391691o;

    static {
        java.lang.Long l17;
        p3325xe03a0797.p3326xc267989b.d1 d1Var = new p3325xe03a0797.p3326xc267989b.d1();
        f391690n = d1Var;
        d1Var.N(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l17 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l17 = 1000L;
        }
        f391691o = timeUnit.toNanos(l17.longValue());
    }

    @Override // p3325xe03a0797.p3326xc267989b.c2
    public java.lang.Thread R() {
        java.lang.Thread thread = f72698x6d510b29;
        if (thread == null) {
            synchronized (this) {
                thread = f72698x6d510b29;
                if (thread == null) {
                    thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    f72698x6d510b29 = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // p3325xe03a0797.p3326xc267989b.c2
    public void S(long j17, p3325xe03a0797.p3326xc267989b.z1 z1Var) {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p3325xe03a0797.p3326xc267989b.b2
    public void V(java.lang.Runnable runnable) {
        if (f72699xa3400825 == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.V(runnable);
    }

    public final synchronized void b0() {
        int i17 = f72699xa3400825;
        if (i17 == 2 || i17 == 3) {
            f72699xa3400825 = 3;
            Z();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        p3325xe03a0797.p3326xc267989b.v3.f392218b.set(this);
        try {
            synchronized (this) {
                int i17 = f72699xa3400825;
                if (i17 == 2 || i17 == 3) {
                    z17 = false;
                } else {
                    f72699xa3400825 = 1;
                    notifyAll();
                    z17 = true;
                }
            }
            if (!z17) {
                f72698x6d510b29 = null;
                b0();
                if (X()) {
                    return;
                }
                R();
                return;
            }
            long j17 = Long.MAX_VALUE;
            while (true) {
                java.lang.Thread.interrupted();
                long P = P();
                if (P == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    long nanoTime = java.lang.System.nanoTime();
                    if (j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        j17 = f391691o + nanoTime;
                    }
                    long j18 = j17 - nanoTime;
                    if (j18 <= 0) {
                        f72698x6d510b29 = null;
                        b0();
                        if (X()) {
                            return;
                        }
                        R();
                        return;
                    }
                    if (P > j18) {
                        P = j18;
                    }
                } else {
                    j17 = Long.MAX_VALUE;
                }
                if (P > 0) {
                    int i18 = f72699xa3400825;
                    if (i18 == 2 || i18 == 3) {
                        f72698x6d510b29 = null;
                        b0();
                        if (X()) {
                            return;
                        }
                        R();
                        return;
                    }
                    java.util.concurrent.locks.LockSupport.parkNanos(this, P);
                }
            }
        } catch (java.lang.Throwable th6) {
            f72698x6d510b29 = null;
            b0();
            if (!X()) {
                R();
            }
            throw th6;
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.b2, p3325xe03a0797.p3326xc267989b.w1
    /* renamed from: shutdown */
    public void mo143971xf5e80656() {
        f72699xa3400825 = 4;
        super.mo143971xf5e80656();
    }

    @Override // p3325xe03a0797.p3326xc267989b.b2, p3325xe03a0797.p3326xc267989b.i1
    public p3325xe03a0797.p3326xc267989b.s1 v(long j17, java.lang.Runnable runnable, oz5.l lVar) {
        long j18 = j17 > 0 ? j17 >= 9223372036854L ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : 1000000 * j17 : 0L;
        if (j18 >= 4611686018427387903L) {
            return p3325xe03a0797.p3326xc267989b.j3.f392081d;
        }
        long nanoTime = java.lang.System.nanoTime();
        p3325xe03a0797.p3326xc267989b.y1 y1Var = new p3325xe03a0797.p3326xc267989b.y1(j18 + nanoTime, runnable);
        a0(nanoTime, y1Var);
        return y1Var;
    }
}
