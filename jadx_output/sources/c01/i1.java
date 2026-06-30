package c01;

/* loaded from: classes.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f37239d;

    /* renamed from: e, reason: collision with root package name */
    public int f37240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.j1 f37241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37242g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37243h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(c01.j1 j1Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f37241f = j1Var;
        this.f37242g = str;
        this.f37243h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c01.i1(this.f37241f, this.f37242g, this.f37243h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c01.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        c01.j1 j1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f37240e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c01.k1 k1Var = c01.k1.f37279a;
            c01.j1 j1Var2 = this.f37241f;
            this.f37239d = j1Var2;
            this.f37240e = 1;
            obj = k1Var.a(this.f37242g, this.f37243h, this);
            if (obj == aVar) {
                return aVar;
            }
            j1Var = j1Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j1Var = (c01.j1) this.f37239d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        j1Var.a(((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }
}
