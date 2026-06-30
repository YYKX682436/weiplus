package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f189596a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f189597b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f189598c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f189599d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f189600e;

    public w0(long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f189596a = (i17 & 1) != 0 ? 0L : j17;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f189599d = reentrantLock;
        this.f189600e = reentrantLock.newCondition();
    }

    public final boolean a() {
        try {
            this.f189599d.lock();
            boolean z17 = this.f189598c != null;
            this.f189598c = null;
            return z17;
        } finally {
            this.f189599d.unlock();
        }
    }

    public void b(yz5.l call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        this.f189599d.lock();
        try {
            if (this.f189597b) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                this.f189600e.await(1L, java.util.concurrent.TimeUnit.MINUTES);
                long uptimeMillis2 = this.f189596a - (android.os.SystemClock.uptimeMillis() - uptimeMillis);
                if (uptimeMillis2 > 0) {
                    this.f189600e.await(uptimeMillis2, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            } else if (this.f189598c != null) {
                long j17 = this.f189596a;
                if (j17 > 0) {
                    this.f189600e.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
            this.f189599d.unlock();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = this.f189598c;
            this.f189598c = null;
            call.mo146xb9724478(c13924x37151faa);
        } catch (java.lang.Throwable th6) {
            this.f189599d.unlock();
            throw th6;
        }
    }
}
