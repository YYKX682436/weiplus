package aw3;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f14840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f14841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl.f0 f14842f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list, dl.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14841e = list;
        this.f14842f = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw3.h(this.f14841e, this.f14842f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aw3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f14840d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f14840d = 1;
            if (kotlinx.coroutines.h.a(this.f14841e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        aw3.g gVar = new aw3.g(this.f14842f, null);
        this.f14840d = 2;
        if (kotlinx.coroutines.l.g(g3Var, gVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
