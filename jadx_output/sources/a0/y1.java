package a0;

/* loaded from: classes14.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.r2 f338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a0.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f338d = r2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.y1(this.f338d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a0.y1 y1Var = (a0.y1) create((jz5.f0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((a0.t2) this.f338d).f298a.update();
        return jz5.f0.f302826a;
    }
}
