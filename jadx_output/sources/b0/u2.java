package b0;

/* loaded from: classes14.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16544d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.i2 f16546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(b0.i2 i2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16546f = i2Var;
        this.f16547g = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.u2 u2Var = new b0.u2(this.f16546f, this.f16547g, continuation);
        u2Var.f16545e = obj;
        return u2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.u2) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p1.q0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ?? r86;
        b0.t2 t2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16544d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r86 = (p1.a0) this.f16545e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p1.a0 a0Var = (p1.a0) this.f16545e;
            kotlin.ResultKt.throwOnFailure(obj);
            r86 = a0Var;
        }
        do {
            t2Var = new b0.t2(this.f16546f, this.f16547g, null);
            this.f16545e = r86;
            this.f16544d = 1;
            r86 = (p1.q0) r86;
        } while (r86.v(t2Var, this) != aVar);
        return aVar;
    }
}
