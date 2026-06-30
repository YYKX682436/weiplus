package b0;

/* loaded from: classes10.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16367d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.k2 f16369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16370g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(b0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16369f = k2Var;
        this.f16370g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.j2 j2Var = new b0.j2(this.f16369f, this.f16370g, continuation);
        j2Var.f16368e = obj;
        return j2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.j2) create((b0.p2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16367d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.p2 p2Var = (b0.p2) this.f16368e;
            b0.k2 k2Var = this.f16369f;
            k2Var.getClass();
            kotlin.jvm.internal.o.g(p2Var, "<set-?>");
            k2Var.f16387b = p2Var;
            this.f16367d = 1;
            if (this.f16370g.invoke(k2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
