package ck2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f42410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ck2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42411e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ck2.e(this.f42411e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ck2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f42410d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ck2.o oVar = this.f42411e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.v4) oVar.business(mm2.v4.class)).f329479i;
            ck2.d dVar = new ck2.d(oVar);
            this.f42410d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(dVar, this) == aVar) {
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
