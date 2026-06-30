package com.tencent.mm.modelcdntran;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f71095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.z f71096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.coroutines.Continuation continuation, com.tencent.mm.modelcdntran.z zVar, java.lang.String str, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f71095d = continuation;
        this.f71096e = zVar;
        this.f71097f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.n(this.f71095d, this.f71096e, this.f71097f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modelcdntran.n nVar = (com.tencent.mm.modelcdntran.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f71095d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(this.f71096e.Y6().containsKey(this.f71097f))));
        return jz5.f0.f302826a;
    }
}
