package com.tencent.mm.modelcdntran;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f70937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f70938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f70939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlinx.coroutines.flow.n2 n2Var, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70938e = n2Var;
        this.f70939f = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.f0(this.f70938e, this.f70939f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.modelcdntran.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f70937d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelcdntran.e0 e0Var = new com.tencent.mm.modelcdntran.e0(this.f70939f);
            this.f70937d = 1;
            if (this.f70938e.a(e0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
