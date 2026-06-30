package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes10.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f274023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f274024b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f274025c = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f274026d = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f274027e;

    public c0(int i17) {
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("sizeLimit <= 0".toString());
        }
        this.f274023a = i17;
    }

    public final void a() {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f274026d).writeLock().lock();
        try {
            this.f274024b.clear();
            this.f274025c.clear();
            this.f274027e = 0;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f274026d).writeLock().unlock();
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        return this.f274024b.get(obj);
    }

    public final java.lang.Object c(java.lang.Object obj, yz5.l generator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(generator, "generator");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f274024b;
        java.lang.Object obj2 = concurrentHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f274026d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        try {
            java.lang.Object obj3 = concurrentHashMap.get(obj);
            if (obj3 != null) {
                return obj3;
            }
            java.lang.Object mo146xb9724478 = generator.mo146xb9724478(obj);
            d(obj, mo146xb9724478);
            return mo146xb9724478;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        }
    }

    public java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f274026d).writeLock().lock();
        try {
            java.lang.Object obj3 = this.f274024b.get(obj);
            while (this.f274027e >= this.f274023a && (!this.f274025c.isEmpty())) {
                java.lang.Object poll = this.f274025c.poll();
                if (poll != null) {
                    this.f274024b.remove(poll);
                    this.f274027e = this.f274024b.size();
                }
            }
            int i17 = this.f274027e;
            int i18 = this.f274023a;
            this.f274025c.offer(obj);
            this.f274024b.put(obj, obj2);
            this.f274027e = this.f274024b.size();
            return obj3;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f274026d).writeLock().unlock();
        }
    }

    public final boolean e(java.lang.Object obj) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f274026d).writeLock().lock();
        try {
            boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(this.f274024b).remove(obj) != null;
            this.f274025c.remove(obj);
            this.f274027e = this.f274024b.size();
            return z17;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f274026d).writeLock().unlock();
        }
    }
}
