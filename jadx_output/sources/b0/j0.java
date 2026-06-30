package b0;

/* loaded from: classes14.dex */
public final class j0 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f16353e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.s f16355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16356h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16357i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16358m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p1.s sVar, yz5.a aVar, yz5.a aVar2, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16355g = sVar;
        this.f16356h = aVar;
        this.f16357i = aVar2;
        this.f16358m = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.j0 j0Var = new b0.j0(this.f16355g, this.f16356h, this.f16357i, this.f16358m, continuation);
        j0Var.f16354f = obj;
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.j0) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p1.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16353e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.c cVar2 = (p1.c) this.f16354f;
            long j17 = this.f16355g.f350879a;
            b0.i0 i0Var = new b0.i0(this.f16358m);
            this.f16354f = cVar2;
            this.f16353e = 1;
            java.lang.Object f17 = b0.p0.f(cVar2, j17, i0Var, this);
            if (f17 == aVar) {
                return aVar;
            }
            cVar = cVar2;
            obj = f17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (p1.c) this.f16354f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.List list = ((p1.o0) cVar).f350864i.f350868h.f350842a;
            int size = list.size();
            for (int i18 = 0; i18 < size; i18++) {
                p1.s sVar = (p1.s) list.get(i18);
                if (p1.m.b(sVar)) {
                    sVar.a();
                }
            }
            this.f16356h.invoke();
        } else {
            this.f16357i.invoke();
        }
        return jz5.f0.f302826a;
    }
}
