package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class kg<D extends com.tencent.mapsdk.internal.jz> implements com.tencent.mapsdk.internal.jy<D>, com.tencent.mapsdk.internal.kf<D> {

    /* renamed from: a, reason: collision with root package name */
    private java.util.concurrent.locks.ReentrantReadWriteLock f50076a = new java.util.concurrent.locks.ReentrantReadWriteLock();

    @Override // com.tencent.mapsdk.internal.kf
    public final void b(java.lang.String str, D d17) {
        try {
            this.f50076a.writeLock().lock();
            a(str, (java.lang.String) d17);
        } finally {
            this.f50076a.writeLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.kf
    public final void j() {
        try {
            this.f50076a.writeLock().lock();
            b();
        } finally {
            this.f50076a.writeLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.kf
    public final long k() {
        try {
            this.f50076a.readLock().lock();
            return c();
        } finally {
            this.f50076a.readLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.kf
    public final long l() {
        try {
            this.f50076a.readLock().lock();
            return d();
        } finally {
            this.f50076a.readLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.kf
    public final com.tencent.mapsdk.internal.kf<D> m() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.kf
    public final D b(java.lang.String str, java.lang.Class<D> cls) {
        try {
            this.f50076a.readLock().lock();
            return a(str, cls);
        } finally {
            this.f50076a.readLock().unlock();
        }
    }

    @Override // com.tencent.mapsdk.internal.kf
    public final boolean b(java.lang.String str) {
        try {
            this.f50076a.writeLock().lock();
            return a(str);
        } finally {
            this.f50076a.writeLock().unlock();
        }
    }
}
