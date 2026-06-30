package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class e0 implements com.tencent.mm.plugin.appbrand.ec {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f75500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f75501b;

    public e0(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f75500a = atomicBoolean;
        this.f75501b = countDownLatch;
    }

    @Override // com.tencent.mm.plugin.appbrand.ec
    public void onSuccess() {
        this.f75500a.set(true);
        this.f75501b.countDown();
    }
}
