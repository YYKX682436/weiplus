package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f65515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.feature.chatrecordstts.b1 b1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f65516e = b1Var;
        this.f65517f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.p(this.f65516e, this.f65517f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((com.tencent.mm.feature.chatrecordstts.p) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65515d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65516e;
            cv.f1 mj6 = b1Var.mj();
            com.tencent.mm.feature.chatrecordstts.o oVar = new com.tencent.mm.feature.chatrecordstts.o(b1Var);
            this.f65515d = 1;
            if (((pn4.z) mj6).bj(this.f65517f, false, oVar, this) == aVar) {
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
