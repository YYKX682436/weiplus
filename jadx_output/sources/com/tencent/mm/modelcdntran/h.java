package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f70968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f70970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.modelcdntran.z zVar, java.lang.String str, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70968d = zVar;
        this.f70969e = str;
        this.f70970f = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.h(this.f70968d, this.f70969e, this.f70970f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.h hVar = (com.tencent.mm.modelcdntran.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelcdntran.z zVar = this.f70968d;
        java.util.concurrent.ConcurrentHashMap Y6 = zVar.Y6();
        com.tencent.mm.modelcdntran.g gVar = new com.tencent.mm.modelcdntran.g(zVar);
        java.lang.String str = this.f70969e;
        com.tencent.mm.modelcdntran.e eVar = (com.tencent.mm.modelcdntran.e) Y6.remove(str);
        int intValue = eVar != null ? ((java.lang.Number) gVar.invoke(str, eVar)).intValue() : -1;
        com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71085q, str);
        n1Var.f71105c = intValue;
        zVar.W6(this.f70970f, n1Var);
        return jz5.f0.f302826a;
    }
}
