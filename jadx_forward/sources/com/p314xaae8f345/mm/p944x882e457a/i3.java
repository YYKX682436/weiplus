package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class i3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f152186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f152187e;

    public i3(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f152186d = atomicReference;
        this.f152187e = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        this.f152186d.set(new com.p314xaae8f345.mm.p944x882e457a.k3());
        this.f152187e.countDown();
        return false;
    }
}
