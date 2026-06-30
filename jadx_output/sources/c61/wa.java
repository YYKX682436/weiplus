package c61;

/* loaded from: classes5.dex */
public final class wa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f39388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterCgiRequest f39389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo f39390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39391g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(com.tencent.pigeon.mm_foundation.FlutterCgiRequest flutterCgiRequest, com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo flutterCgiFinderExtInfo, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39389e = flutterCgiRequest;
        this.f39390f = flutterCgiFinderExtInfo;
        this.f39391g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.wa(this.f39389e, this.f39390f, this.f39391g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.wa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f39388d;
        yz5.l lVar = this.f39391g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
        } catch (java.lang.Exception e17) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            c61.va vaVar = new c61.va(lVar, e17, null);
            this.f39388d = 2;
            if (kotlinx.coroutines.l.g(g3Var, vaVar, this) == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.na naVar = new c61.na(this.f39389e, this.f39390f);
            this.f39388d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            pq5.g l17 = naVar.l();
            l17.K(new c61.ma(rVar));
            rVar.m(new c61.la(l17));
            obj = rVar.j();
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
        c61.ua uaVar = new c61.ua(lVar, flutterCgiResponse, null);
        this.f39388d = 3;
        return kotlinx.coroutines.l.g(g3Var2, uaVar, this) == aVar ? aVar : f0Var;
    }
}
