package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.LinkedBlockingQueue f230563a;

    /* renamed from: c, reason: collision with root package name */
    public final int f230565c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Callable f230566d;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f230564b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Lock f230567e = new java.util.concurrent.locks.ReentrantLock();

    public i(int i17, java.util.concurrent.Callable callable) {
        this.f230565c = i17;
        this.f230563a = new java.util.concurrent.LinkedBlockingQueue(i17);
        this.f230566d = callable;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j jVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        if (this.f230563a == null) {
            return null;
        }
        ((java.util.concurrent.locks.ReentrantLock) this.f230567e).lock();
        this.f230563a.size();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f230563a;
        if (linkedBlockingQueue == null) {
            ((java.util.concurrent.locks.ReentrantLock) this.f230567e).unlock();
            return null;
        }
        if (!linkedBlockingQueue.isEmpty() || this.f230564b >= this.f230565c) {
            ((java.util.concurrent.locks.ReentrantLock) this.f230567e).unlock();
            jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j) this.f230563a.poll(5L, java.util.concurrent.TimeUnit.SECONDS);
        } else {
            this.f230564b++;
            ((java.util.concurrent.locks.ReentrantLock) this.f230567e).unlock();
            java.util.concurrent.Callable callable = this.f230566d;
            if (callable == null) {
                throw new java.lang.IllegalStateException("fetcher generator can not be null.");
            }
            android.os.SystemClock.elapsedRealtime();
            try {
                jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j) callable.call();
                android.os.SystemClock.elapsedRealtime();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FetcherPool", e17, " fetcher generater call error %s", e17.getMessage());
                throw e17;
            }
        }
        android.os.SystemClock.elapsedRealtime();
        return jVar;
    }

    public void b() {
        if (this.f230563a == null) {
            return;
        }
        java.util.concurrent.locks.Lock lock = this.f230567e;
        ((java.util.concurrent.locks.ReentrantLock) lock).lock();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f230563a;
        if (linkedBlockingQueue == null) {
            ((java.util.concurrent.locks.ReentrantLock) lock).unlock();
            return;
        }
        try {
            try {
                java.util.Iterator it = linkedBlockingQueue.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j) it.next()).mo66871x41012807();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FetcherPool", e17, "destroy fetcher %s", e17.getMessage());
            }
        } finally {
            this.f230563a = null;
            ((java.util.concurrent.locks.ReentrantLock) lock).unlock();
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.j jVar) {
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FetcherPool", "Null object can not be reused.");
            return;
        }
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f230563a;
        if (linkedBlockingQueue == null) {
            jVar.mo66871x41012807();
        } else {
            if (linkedBlockingQueue.contains(jVar)) {
                throw new java.lang.IllegalStateException("fetcher already in pool");
            }
            this.f230563a.offer(jVar);
        }
    }
}
