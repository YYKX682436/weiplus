package by4;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f36373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f36374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.coroutines.Continuation continuation, qc0.m1 m1Var, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f36373d = continuation;
        this.f36374e = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new by4.a(this.f36373d, this.f36374e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        by4.a aVar = (by4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f36373d.resumeWith(kotlin.Result.m521constructorimpl(this.f36374e));
        return jz5.f0.f302826a;
    }
}
