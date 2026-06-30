package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes11.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope f65504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope) {
        super(0);
        this.f65504d = supervisedLifecycleScope;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f65504d.f65331f <= 1) {
            return new kotlinx.coroutines.g2(((ku5.t0) ku5.t0.f312615d).p(this.f65504d.f65329d));
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = this.f65504d;
        java.lang.String str = supervisedLifecycleScope.f65329d;
        int i17 = supervisedLifecycleScope.f65331f;
        return new kotlinx.coroutines.g2(((ku5.t0) u0Var).o(str, i17, i17, new java.util.concurrent.LinkedBlockingQueue()));
    }
}
