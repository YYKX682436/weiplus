package az0;

/* loaded from: classes5.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.k5 f15602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(az0.k5 k5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15602d = k5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.j5(this.f15602d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        az0.j5 j5Var = (az0.j5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        az0.k5 k5Var = this.f15602d;
        k5Var.f15627a.b();
        k5Var.f15627a.i();
        k5Var.f15629c = true;
        return jz5.f0.f302826a;
    }
}
