package aw3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.f0 f14839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(dl.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14839d = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw3.g(this.f14839d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aw3.g gVar = (aw3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        l45.p pVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        c01.s2 s2Var = c01.s2.f37448x;
        int i17 = dl.f0.W;
        dl.f0 f0Var = this.f14839d;
        f0Var.getClass();
        l45.q qVar = f0Var.f235039a;
        if (qVar != null && (pVar = ((l45.n) qVar).f316475p) != null) {
            ((aw3.e) pVar).a(s2Var, null);
        }
        return jz5.f0.f302826a;
    }
}
