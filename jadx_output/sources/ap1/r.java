package ap1;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ap1.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12733d = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ap1.r(this.f12733d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ap1.r rVar = (ap1.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f12733d.f12753m = new fo1.h();
        return jz5.f0.f302826a;
    }
}
