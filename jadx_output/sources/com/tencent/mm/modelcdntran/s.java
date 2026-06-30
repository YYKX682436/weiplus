package com.tencent.mm.modelcdntran;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.modelcdntran.z zVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71123d = zVar;
        this.f71124e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.s(this.f71123d, this.f71124e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.s sVar = (com.tencent.mm.modelcdntran.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.g gVar = com.tencent.mm.modelcdntran.z.f71174n;
        com.tencent.mm.modelcdntran.z zVar = this.f71123d;
        boolean z17 = !zVar.X6().isEmpty();
        int i17 = this.f71124e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", "run(" + i17 + ") before init job size=" + zVar.X6().size());
            for (kotlinx.coroutines.r2 r2Var : zVar.X6()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", "startBeforeInitJob(" + i17 + ") " + r2Var.hashCode() + " result:" + r2Var.start());
            }
            zVar.X6().clear();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSC", "run(" + i17 + ") before init job queue is empty");
        }
        return jz5.f0.f302826a;
    }
}
