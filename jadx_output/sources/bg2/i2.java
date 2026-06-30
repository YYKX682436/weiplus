package bg2;

/* loaded from: classes3.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f20156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(bg2.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20156e = n2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.i2(this.f20156e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20155d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bg2.n2 n2Var = this.f20156e;
            kotlinx.coroutines.flow.j2 j2Var = n2Var.f20323f;
            if (j2Var == null) {
                return jz5.f0.f302826a;
            }
            bg2.h2 h2Var = new bg2.h2(n2Var);
            this.f20155d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(h2Var, this) == aVar) {
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
