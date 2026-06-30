package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class t3 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f227172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler.Callback f227173b;

    public t3(java.util.concurrent.atomic.AtomicInteger atomicInteger, android.os.Handler.Callback callback) {
        this.f227172a = atomicInteger;
        this.f227173b = callback;
    }

    @Override // gb3.i
    /* renamed from: onComplete */
    public void mo66107x815f5438(boolean z17) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f227172a;
        atomicInteger.incrementAndGet();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.arg1 = atomicInteger.get();
        this.f227173b.handleMessage(obtain);
    }
}
