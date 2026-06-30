package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f71011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.modelcdntran.z zVar, java.lang.String str, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71009d = zVar;
        this.f71010e = str;
        this.f71011f = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.j(this.f71009d, this.f71010e, this.f71011f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.j jVar = (com.tencent.mm.modelcdntran.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelcdntran.z zVar = this.f71009d;
        java.util.concurrent.ConcurrentHashMap Z6 = zVar.Z6();
        com.tencent.mm.modelcdntran.i iVar = new com.tencent.mm.modelcdntran.i(zVar);
        java.lang.String str = this.f71010e;
        com.tencent.mm.modelcdntran.e eVar = (com.tencent.mm.modelcdntran.e) Z6.remove(str);
        int intValue = eVar != null ? ((java.lang.Number) iVar.invoke(str, eVar)).intValue() : -1;
        com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71090v, str);
        n1Var.f71105c = intValue;
        zVar.W6(this.f71011f, n1Var);
        return jz5.f0.f302826a;
    }
}
