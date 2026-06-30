package bg2;

/* loaded from: classes2.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(bg2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20106e = z3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.g3(this.f20106e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.g3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j2 j2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20105d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bg2.z3 z3Var = this.f20106e;
            bg2.n2 n2Var = (bg2.n2) z3Var.N6(bg2.n2.class);
            if (n2Var == null || (j2Var = n2Var.f20323f) == null) {
                return jz5.f0.f302826a;
            }
            bg2.f3 f3Var = new bg2.f3(z3Var);
            this.f20105d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(f3Var, this) == aVar) {
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
