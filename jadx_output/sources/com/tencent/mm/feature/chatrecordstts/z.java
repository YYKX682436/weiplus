package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes9.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f65567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.feature.chatrecordstts.b1 b1Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65566d = b1Var;
        this.f65567e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.chatrecordstts.z(this.f65566d, this.f65567e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.feature.chatrecordstts.z zVar = (com.tencent.mm.feature.chatrecordstts.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kz5.h0.B(this.f65566d.f65355r, new com.tencent.mm.feature.chatrecordstts.y(this.f65567e));
        return jz5.f0.f302826a;
    }
}
