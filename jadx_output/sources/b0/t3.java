package b0;

/* loaded from: classes14.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16537d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f16540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16542i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(b0.h2 h2Var, p1.a0 a0Var, yz5.q qVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16539f = h2Var;
        this.f16540g = a0Var;
        this.f16541h = qVar;
        this.f16542i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.t3 t3Var = new b0.t3(this.f16539f, this.f16540g, this.f16541h, this.f16542i, continuation);
        t3Var.f16538e = obj;
        return t3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.t3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16537d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f16538e;
            b0.h2 h2Var = this.f16539f;
            kotlinx.coroutines.sync.c.b(h2Var.f16331g, null, 1, null);
            h2Var.f16329e = false;
            h2Var.f16330f = false;
            b0.s3 s3Var = new b0.s3(this.f16541h, y0Var, this.f16539f, this.f16542i, null);
            this.f16537d = 1;
            if (((p1.q0) this.f16540g).v(s3Var, this) == aVar) {
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
