package c61;

/* loaded from: classes5.dex */
public final class ta extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f39307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterCgiRequest f39308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.tencent.pigeon.mm_foundation.FlutterCgiRequest flutterCgiRequest, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39308e = flutterCgiRequest;
        this.f39309f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.ta(this.f39308e, this.f39309f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ta) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f39307d;
        yz5.l lVar = this.f39309f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
        } catch (java.lang.Exception e17) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            c61.sa saVar = new c61.sa(lVar, e17, null);
            this.f39307d = 2;
            if (kotlinx.coroutines.l.g(g3Var, saVar, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.ka kaVar = new c61.ka(this.f39308e);
            this.f39307d = 1;
            obj = kaVar.s(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return f0Var;
                }
                if (i17 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.pigeon.mm_foundation.FlutterCgiResponse flutterCgiResponse = (com.tencent.pigeon.mm_foundation.FlutterCgiResponse) obj;
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        c61.ra raVar = new c61.ra(lVar, flutterCgiResponse, null);
        this.f39307d = 3;
        return kotlinx.coroutines.l.g(g3Var2, raVar, this) == aVar ? aVar : f0Var;
    }
}
