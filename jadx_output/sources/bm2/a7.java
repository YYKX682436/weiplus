package bm2;

/* loaded from: classes8.dex */
public final class a7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f21774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f21775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f21776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(bm2.k7 k7Var, r45.yx1 yx1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21775e = k7Var;
        this.f21776f = yx1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm2.a7(this.f21775e, this.f21776f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm2.a7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f21774d;
        bm2.k7 k7Var = this.f21775e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sf2.d3 d3Var = k7Var.f22040i;
            this.f21774d = 1;
            obj = d3Var.o7(3, this.f21776f, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (obj != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            bm2.z6 z6Var = new bm2.z6(k7Var, null);
            this.f21774d = 2;
            if (kotlinx.coroutines.l.g(g3Var, z6Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
