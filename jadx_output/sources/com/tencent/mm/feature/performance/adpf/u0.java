package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.w0 f67494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.feature.performance.adpf.w0 w0Var) {
        super(0);
        this.f67494d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return ((java.util.concurrent.locks.ReentrantLock) ((jz5.n) this.f67494d.f67500a).getValue()).newCondition();
    }
}
