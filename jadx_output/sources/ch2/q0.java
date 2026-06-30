package ch2;

/* loaded from: classes10.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41447e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.q0(this.f41447e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ch2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41446d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ch2.o2 o2Var = this.f41447e;
            kotlinx.coroutines.flow.j2 j2Var = o2Var.m7().f346292h;
            ch2.p0 p0Var = new ch2.p0(o2Var);
            this.f41446d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(p0Var, this) == aVar) {
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
