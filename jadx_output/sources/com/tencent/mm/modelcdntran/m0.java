package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f71070d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f71071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f71072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f71073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f71074h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlinx.coroutines.flow.n2 n2Var, java.lang.ref.WeakReference weakReference, kotlinx.coroutines.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71072f = n2Var;
        this.f71073g = weakReference;
        this.f71074h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelcdntran.m0 m0Var = new com.tencent.mm.modelcdntran.m0(this.f71072f, this.f71073g, this.f71074h, continuation);
        m0Var.f71071e = obj;
        return m0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.modelcdntran.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f71070d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f71071e;
            kotlinx.coroutines.flow.n2 n2Var = this.f71072f;
            if (n2Var == null) {
                return jz5.f0.f302826a;
            }
            com.tencent.mm.modelcdntran.l0 l0Var = new com.tencent.mm.modelcdntran.l0(this.f71073g, y0Var, this.f71074h);
            this.f71070d = 1;
            if (n2Var.a(l0Var, this) == aVar) {
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
