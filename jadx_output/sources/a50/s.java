package a50;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f1532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1534f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a50.a0 a0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1533e = a0Var;
        this.f1534f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a50.s(this.f1533e, this.f1534f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a50.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f1532d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.storage.y2 y2Var = com.tencent.mm.storage.z2.f196390a;
            this.f1532d = 1;
            obj = y2Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.q(new a50.r(this.f1533e, this.f1534f, (com.tencent.wechat.mm.finder_box.d1) obj));
        return jz5.f0.f302826a;
    }
}
