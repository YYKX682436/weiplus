package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class kg<D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> {

    /* renamed from: a, reason: collision with root package name */
    private java.util.concurrent.locks.ReentrantReadWriteLock f131609a = new java.util.concurrent.locks.ReentrantReadWriteLock();

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final void b(java.lang.String str, D d17) {
        try {
            this.f131609a.writeLock().lock();
            a(str, (java.lang.String) d17);
        } finally {
            this.f131609a.writeLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final void j() {
        try {
            this.f131609a.writeLock().lock();
            b();
        } finally {
            this.f131609a.writeLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final long k() {
        try {
            this.f131609a.readLock().lock();
            return c();
        } finally {
            this.f131609a.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final long l() {
        try {
            this.f131609a.readLock().lock();
            return d();
        } finally {
            this.f131609a.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> m() {
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final D b(java.lang.String str, java.lang.Class<D> cls) {
        try {
            this.f131609a.readLock().lock();
            return a(str, cls);
        } finally {
            this.f131609a.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final boolean b(java.lang.String str) {
        try {
            this.f131609a.writeLock().lock();
            return a(str);
        } finally {
            this.f131609a.writeLock().unlock();
        }
    }
}
