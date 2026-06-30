package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class v extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f65541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.j f65543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.feature.chatrecordstts.b1 b1Var, com.tencent.mm.feature.chatrecordstts.j jVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f65542e = b1Var;
        this.f65543f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.v(this.f65542e, this.f65543f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((com.tencent.mm.feature.chatrecordstts.v) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65541d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.chatrecordstts.b1 b1Var = this.f65542e;
            cv.f1 mj6 = b1Var.mj();
            com.tencent.mm.storage.f9 f9Var = this.f65543f.f65467a;
            com.tencent.mm.feature.chatrecordstts.u uVar = new com.tencent.mm.feature.chatrecordstts.u(b1Var);
            this.f65541d = 1;
            if (((pn4.z) mj6).cj(f9Var, false, uVar, this) == aVar) {
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
