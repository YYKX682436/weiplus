package bt;

/* loaded from: classes5.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt.u0 f24116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f24117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(bt.u0 u0Var, java.lang.StringBuilder sb6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f24116d = u0Var;
        this.f24117e = sb6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bt.s0(this.f24116d, this.f24117e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bt.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bt.u0 u0Var = this.f24116d;
        u0Var.f24127e = u0Var.wi();
        java.lang.StringBuilder sb6 = this.f24117e;
        sb6.append(" getDiscoveryRedDotType retry success!");
        return sb6;
    }
}
