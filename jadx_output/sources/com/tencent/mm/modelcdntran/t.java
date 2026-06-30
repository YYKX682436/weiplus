package com.tencent.mm.modelcdntran;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f71136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.modelcdntran.z zVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71135d = zVar;
        this.f71136e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.t(this.f71135d, this.f71136e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.t tVar = (com.tencent.mm.modelcdntran.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.g gVar = com.tencent.mm.modelcdntran.z.f71174n;
        com.tencent.mm.modelcdntran.z zVar = this.f71135d;
        kotlinx.coroutines.r2 d17 = zVar.a7().d(kotlinx.coroutines.a1.LAZY, this.f71136e);
        zVar.X6().add(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", "add job:" + d17.hashCode() + " and wait init, currentSize:" + zVar.X6().size());
        return jz5.f0.f302826a;
    }
}
