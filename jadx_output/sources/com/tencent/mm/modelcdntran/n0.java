package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f71098d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f71099e;

    /* renamed from: f, reason: collision with root package name */
    public int f71100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.m f71101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f71102h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dn.m mVar, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71101g = mVar;
        this.f71102h = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelcdntran.n0(this.f71101g, this.f71102h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.modelcdntran.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f71100f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dn.m mVar = this.f71101g;
            this.f71098d = mVar;
            java.lang.ref.WeakReference weakReference = this.f71102h;
            this.f71099e = weakReference;
            this.f71100f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
            kotlinx.coroutines.flow.n2 e76 = aj6 != null ? aj6.e7(mVar) : null;
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            rVar.m(new com.tencent.mm.modelcdntran.k0(mVar, lifecycleScope != null ? v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.m0(e76, weakReference, rVar, null), 1, null) : null));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
