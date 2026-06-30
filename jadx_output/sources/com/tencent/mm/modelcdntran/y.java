package com.tencent.mm.modelcdntran;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm0.o f71163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(jm0.o oVar) {
        super(0);
        this.f71163d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("CdnFSC_SCOPE", this.f71163d, 0, 4, null);
    }
}
