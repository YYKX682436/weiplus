package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class h3 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f70642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f70643e;

    public h3(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f70642d = atomicReference;
        this.f70643e = countDownLatch;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f70642d.set(com.tencent.mm.modelbase.f.a(i17, i18, str, oVar.f70711b.f70700a, m1Var, null));
        this.f70643e.countDown();
        return 0;
    }
}
