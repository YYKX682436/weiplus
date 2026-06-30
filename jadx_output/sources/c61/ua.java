package c61;

/* loaded from: classes5.dex */
public final class ua extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterCgiResponse f39337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(yz5.l lVar, com.tencent.pigeon.mm_foundation.FlutterCgiResponse flutterCgiResponse, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39336d = lVar;
        this.f39337e = flutterCgiResponse;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.ua(this.f39336d, this.f39337e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        c61.ua uaVar = (c61.ua) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f39336d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(this.f39337e)));
        return jz5.f0.f302826a;
    }
}
