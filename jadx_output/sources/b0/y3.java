package b0;

/* loaded from: classes14.dex */
public final class y3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f16607e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16610h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16611i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f16612m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(b0.h2 h2Var, yz5.l lVar, yz5.l lVar2, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16609g = h2Var;
        this.f16610h = lVar;
        this.f16611i = lVar2;
        this.f16612m = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.y3 y3Var = new b0.y3(this.f16609g, this.f16610h, this.f16611i, this.f16612m, continuation);
        y3Var.f16608f = obj;
        return y3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.y3) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16607e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.c cVar = (p1.c) this.f16608f;
            this.f16607e = 1;
            obj = b0.d4.f(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        p1.s sVar = (p1.s) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0.h2 h2Var = this.f16609g;
        if (sVar != null) {
            sVar.a();
            h2Var.f16329e = true;
            kotlinx.coroutines.sync.c.c(h2Var.f16331g, null, 1, null);
            this.f16610h.invoke(new d1.e(sVar.f350881c));
            return f0Var;
        }
        h2Var.f16330f = true;
        kotlinx.coroutines.sync.c.c(h2Var.f16331g, null, 1, null);
        yz5.l lVar = this.f16611i;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(new d1.e(((p1.s) this.f16612m.f310123d).f350881c));
        return f0Var;
    }
}
