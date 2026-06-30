package a0;

/* loaded from: classes14.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f293d;

    /* renamed from: e, reason: collision with root package name */
    public int f294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f296g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(n0.v2 v2Var, c0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295f = v2Var;
        this.f296g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.t0(this.f295f, this.f296g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        n0.v2 v2Var;
        n0.v2 v2Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v2Var = this.f295f;
            c0.d dVar = (c0.d) v2Var.getValue();
            if (dVar != null) {
                c0.e eVar = new c0.e(dVar);
                c0.o oVar = this.f296g;
                if (oVar != null) {
                    this.f293d = v2Var;
                    this.f294e = 1;
                    if (((c0.p) oVar).a(eVar, this) == aVar) {
                        return aVar;
                    }
                    v2Var2 = v2Var;
                }
                v2Var.setValue(null);
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v2Var2 = (n0.v2) this.f293d;
        kotlin.ResultKt.throwOnFailure(obj);
        v2Var = v2Var2;
        v2Var.setValue(null);
        return jz5.f0.f302826a;
    }
}
