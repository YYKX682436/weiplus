package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes5.dex */
public class j3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f152191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f152192b;

    public j3(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f152191a = atomicReference;
        this.f152192b = countDownLatch;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        this.f152191a.set((com.p314xaae8f345.mm.p944x882e457a.f) obj);
        this.f152192b.countDown();
        return null;
    }
}
