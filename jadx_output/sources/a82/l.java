package a82;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2066d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n2 f2068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2069g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.t f2070h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlinx.coroutines.flow.n2 n2Var, java.lang.String str, a82.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f2068f = n2Var;
        this.f2069g = str;
        this.f2070h = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a82.l lVar = new a82.l(this.f2068f, this.f2069g, this.f2070h, continuation);
        lVar.f2067e = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f2066d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f2067e;
            kotlinx.coroutines.flow.n2 n2Var = this.f2068f;
            if (n2Var == null) {
                return jz5.f0.f302826a;
            }
            a82.k kVar = new a82.k(this.f2069g, y0Var, this.f2070h);
            this.f2066d = 1;
            if (n2Var.a(kVar, this) == aVar) {
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
