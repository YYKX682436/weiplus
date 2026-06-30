package b0;

/* loaded from: classes14.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16445d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f16447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.p f16448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f16449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(float f17, z.p pVar, kotlin.jvm.internal.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16447f = f17;
        this.f16448g = pVar;
        this.f16449h = e0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.n2 n2Var = new b0.n2(this.f16447f, this.f16448g, this.f16449h, continuation);
        n2Var.f16446e = obj;
        return n2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.n2) create((b0.p2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        z.w wVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16445d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.p2 p2Var = (b0.p2) this.f16446e;
            z.p pVar = this.f16448g;
            b0.m2 m2Var = new b0.m2(this.f16449h, p2Var);
            this.f16445d = 1;
            z.w2 w2Var = z.q3.f468801a;
            java.lang.Float f17 = new java.lang.Float(0.0f);
            java.lang.Float f18 = new java.lang.Float(this.f16447f);
            z.x2 x2Var = (z.x2) w2Var;
            z.w wVar2 = (z.w) x2Var.f468873a.invoke(new java.lang.Float(0.0f));
            if (wVar2 == null) {
                z.w wVar3 = (z.w) x2Var.f468873a.invoke(f17);
                kotlin.jvm.internal.o.g(wVar3, "<this>");
                wVar = wVar3.c();
            } else {
                wVar = wVar2;
            }
            z.w wVar4 = wVar;
            java.lang.Object a17 = z.z1.a(new z.r(w2Var, f17, wVar4, 0L, 0L, false, 56, null), new z.a2(pVar, w2Var, f17, f18, wVar4), Long.MIN_VALUE, new z.q1(m2Var, w2Var), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
