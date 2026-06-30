package c61;

/* loaded from: classes.dex */
public final class va extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f39360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(yz5.l lVar, java.lang.Exception exc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39359d = lVar;
        this.f39360e = exc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.va(this.f39359d, this.f39360e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.va vaVar = (c61.va) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f39359d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(this.f39360e))));
        return jz5.f0.f302826a;
    }
}
