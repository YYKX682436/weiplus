package ch2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41301e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.c1(this.f41301e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ch2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41300d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ch2.o2 o2Var = this.f41301e;
            kotlinx.coroutines.flow.f3 f3Var = o2Var.q7().f346303g;
            ch2.b1 b1Var = new ch2.b1(o2Var);
            this.f41300d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(b1Var, this) == aVar) {
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
