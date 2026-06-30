package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes11.dex */
public class g0 implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f181283d;

    public g0(java.lang.Object obj) {
        this.f181283d = obj;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f181283d;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return this.f181283d;
    }
}
