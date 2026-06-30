package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f65482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.feature.chatrecordstts.b1 b1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f65483e = b1Var;
        this.f65484f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.k(this.f65483e, this.f65484f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((com.tencent.mm.feature.chatrecordstts.k) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65482d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cv.f1 mj6 = this.f65483e.mj();
            kotlin.jvm.internal.o.f(mj6, "<get-messageReaderService>(...)");
            java.lang.String str = this.f65484f;
            this.f65482d = 1;
            if (cv.f1.Qd(mj6, str, false, null, this, 4, null) == aVar) {
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
