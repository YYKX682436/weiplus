package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class i3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f70653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f70654e;

    public i3(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f70653d = atomicReference;
        this.f70654e = countDownLatch;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f70653d.set(new com.tencent.mm.modelbase.k3());
        this.f70654e.countDown();
        return false;
    }
}
