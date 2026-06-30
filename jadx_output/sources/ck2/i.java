package ck2;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ck2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42417e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ck2.i(this.f42417e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ck2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42416d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ck2.o oVar = this.f42417e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.v4) oVar.business(mm2.v4.class)).f329481n;
            ck2.h hVar = new ck2.h(oVar);
            this.f42416d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(hVar, this) == aVar) {
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
