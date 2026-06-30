package c61;

/* loaded from: classes10.dex */
public final class ca extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f38923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.h0 f38924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f38926g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(kv.h0 h0Var, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f38924e = h0Var;
        this.f38925f = str;
        this.f38926g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.ca(this.f38924e, this.f38925f, this.f38926g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ca) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f38923d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            c61.ba baVar = new c61.ba(this.f38924e, this.f38925f, c0Var, this.f38926g, null);
            this.f38923d = 1;
            obj = kotlinx.coroutines.l.g(g3Var, baVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
