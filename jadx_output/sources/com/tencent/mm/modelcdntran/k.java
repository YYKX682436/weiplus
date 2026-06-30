package com.tencent.mm.modelcdntran;

/* loaded from: classes8.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f71025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f71026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.n1 f71027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.flow.i2 i2Var, com.tencent.mm.modelcdntran.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71026e = i2Var;
        this.f71027f = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.k(this.f71026e, this.f71027f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.modelcdntran.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f71025d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f71025d = 1;
            if (this.f71026e.emit(this.f71027f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
