package ch2;

/* loaded from: classes10.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41500e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.z0(this.f41500e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ch2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41499d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ch2.o2 o2Var = this.f41500e;
            kotlinx.coroutines.flow.f3 f3Var = o2Var.q7().A;
            ch2.y0 y0Var = new ch2.y0(o2Var);
            this.f41499d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(y0Var, this) == aVar) {
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
