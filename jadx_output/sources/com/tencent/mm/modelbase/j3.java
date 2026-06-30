package com.tencent.mm.modelbase;

/* loaded from: classes5.dex */
public class j3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f70658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f70659b;

    public j3(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f70658a = atomicReference;
        this.f70659b = countDownLatch;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        this.f70658a.set((com.tencent.mm.modelbase.f) obj);
        this.f70659b.countDown();
        return null;
    }
}
