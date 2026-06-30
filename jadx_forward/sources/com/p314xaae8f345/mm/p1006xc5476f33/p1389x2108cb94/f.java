package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public final class f implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f181281d = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f181282e;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        this.f181281d.await();
        return this.f181282e;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f181281d.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (this.f181281d.await(j17, timeUnit)) {
            return this.f181282e;
        }
        throw new java.util.concurrent.TimeoutException();
    }
}
