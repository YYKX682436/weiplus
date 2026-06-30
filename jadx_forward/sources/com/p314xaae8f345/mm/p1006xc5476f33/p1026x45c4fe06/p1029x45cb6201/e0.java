package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class e0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ec {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f157033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f157034b;

    public e0(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f157033a = atomicBoolean;
        this.f157034b = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ec
    /* renamed from: onSuccess */
    public void mo49281xe05b4124() {
        this.f157033a.set(true);
        this.f157034b.countDown();
    }
}
