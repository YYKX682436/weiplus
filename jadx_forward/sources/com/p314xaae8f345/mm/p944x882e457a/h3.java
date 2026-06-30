package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class h3 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f152175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f152176e;

    public h3(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f152175d = atomicReference;
        this.f152176e = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f152175d.set(com.p314xaae8f345.mm.p944x882e457a.f.a(i17, i18, str, oVar.f152244b.f152233a, m1Var, null));
        this.f152176e.countDown();
        return 0;
    }
}
