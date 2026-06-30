package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class j7 implements com.tencent.mm.plugin.appbrand.ec {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f75615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f75616b;

    public j7(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f75615a = atomicBoolean;
        this.f75616b = countDownLatch;
    }

    @Override // com.tencent.mm.plugin.appbrand.ec
    public void onSuccess() {
        this.f75615a.set(true);
        this.f75616b.countDown();
    }
}
