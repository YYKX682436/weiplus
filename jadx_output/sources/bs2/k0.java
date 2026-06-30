package bs2;

/* loaded from: classes2.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f23874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(bs2.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23875e = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bs2.k0(this.f23875e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bs2.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f23874d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed N6 = ((ey2.b1) pf5.u.f353936a.e(c61.l7.class).a(ey2.b1.class)).N6(0, hc2.d0.b(4));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            bs2.j0 j0Var = new bs2.j0(N6, this.f23875e, null);
            this.f23874d = 1;
            if (kotlinx.coroutines.l.g(g3Var, j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
