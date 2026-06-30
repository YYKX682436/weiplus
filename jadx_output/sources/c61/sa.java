package c61;

/* loaded from: classes.dex */
public final class sa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f39296e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(yz5.l lVar, java.lang.Exception exc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39295d = lVar;
        this.f39296e = exc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.sa(this.f39295d, this.f39296e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.sa saVar = (c61.sa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        saVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f39295d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(this.f39296e))));
        return jz5.f0.f302826a;
    }
}
