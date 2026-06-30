package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f229527a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f229528b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f229529c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f229530d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f229531e;

    public s(java.lang.String customName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customName, "customName");
        this.f229527a = customName;
        this.f229528b = new java.util.concurrent.ConcurrentHashMap();
        this.f229529c = new java.util.concurrent.ConcurrentHashMap(100);
        this.f229531e = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.a) b(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.r(this, str));
    }

    public final java.lang.Object b(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f229531e.readLock();
        readLock.lock();
        try {
            return aVar.mo152xb9724478();
        } finally {
            readLock.unlock();
        }
    }

    public final java.lang.Object c(yz5.a aVar) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.f229531e;
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
