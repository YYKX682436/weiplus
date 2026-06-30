package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public final class f implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f99748d = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f99749e;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        this.f99748d.await();
        return this.f99749e;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f99748d.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f99748d.await(j17, timeUnit)) {
            return this.f99749e;
        }
        throw new java.util.concurrent.TimeoutException();
    }
}
