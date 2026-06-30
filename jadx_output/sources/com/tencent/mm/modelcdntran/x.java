package com.tencent.mm.modelcdntran;

/* loaded from: classes10.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f71156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f71157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.modelcdntran.z zVar, dn.m mVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71155d = zVar;
        this.f71156e = mVar;
        this.f71157f = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.x(this.f71155d, this.f71156e, this.f71157f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.x xVar = (com.tencent.mm.modelcdntran.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelcdntran.z zVar = this.f71155d;
        com.tencent.mm.modelcdntran.z.T6(zVar, zVar.Z6(), this.f71156e, this.f71157f);
        return jz5.f0.f302826a;
    }
}
