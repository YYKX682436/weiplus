package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.n1 f71111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.modelcdntran.n1 n1Var, com.tencent.mm.modelcdntran.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71111d = n1Var;
        this.f71112e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.o(this.f71111d, this.f71112e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.o oVar = (com.tencent.mm.modelcdntran.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.i2 i2Var;
        kotlinx.coroutines.flow.i2 i2Var2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelcdntran.n1 n1Var = this.f71111d;
        int ordinal = n1Var.f71103a.ordinal();
        com.tencent.mm.modelcdntran.z zVar = this.f71112e;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            com.tencent.mm.modelcdntran.e eVar = n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71077f ? (com.tencent.mm.modelcdntran.e) zVar.Y6().get(n1Var.f71104b) : (com.tencent.mm.modelcdntran.e) zVar.Y6().remove(n1Var.f71104b);
            if (eVar != null && (i2Var = eVar.f70928b) != null) {
                n1Var.f71106d = eVar.f70927a;
                jz5.g gVar = com.tencent.mm.modelcdntran.z.f71174n;
                zVar.W6(i2Var, n1Var);
            }
        } else if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
            com.tencent.mm.modelcdntran.e eVar2 = n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71080i ? (com.tencent.mm.modelcdntran.e) zVar.Z6().get(n1Var.f71104b) : (com.tencent.mm.modelcdntran.e) zVar.Z6().remove(n1Var.f71104b);
            if (eVar2 != null && (i2Var2 = eVar2.f70928b) != null) {
                n1Var.f71106d = eVar2.f70927a;
                jz5.g gVar2 = com.tencent.mm.modelcdntran.z.f71174n;
                zVar.W6(i2Var2, n1Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
