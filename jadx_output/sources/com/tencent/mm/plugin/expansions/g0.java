package com.tencent.mm.plugin.expansions;

/* loaded from: classes11.dex */
public class g0 implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f99750d;

    public g0(java.lang.Object obj) {
        this.f99750d = obj;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
        return this.f99750d;
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
        return this.f99750d;
    }
}
