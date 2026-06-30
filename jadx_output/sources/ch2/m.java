package ch2;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ch2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41402e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.m(this.f41402e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41401d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ch2.q qVar = this.f41402e;
            kotlinx.coroutines.flow.f3 f3Var = ((om2.g) qVar.business(om2.g.class)).f346303g;
            kotlin.jvm.internal.o.e(f3Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.tencent.mm.plugin.finder.live.viewmodel.data.business.ktv.SingState?>");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.flow.j n17 = kotlinx.coroutines.flow.l.n(f3Var, kotlinx.coroutines.internal.b0.f310484a);
            ch2.l lVar = new ch2.l(qVar);
            this.f41401d = 1;
            if (n17.a(lVar, this) == aVar) {
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
