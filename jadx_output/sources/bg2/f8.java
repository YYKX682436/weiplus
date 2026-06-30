package bg2;

/* loaded from: classes2.dex */
public final class f8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f20093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f20095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(xg2.h hVar, kotlin.coroutines.Continuation continuation, bg2.l8 l8Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f20093d = hVar;
        this.f20094e = l8Var;
        this.f20095f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.f8(this.f20093d, continuation, this.f20094e, this.f20095f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.f8 f8Var = (bg2.f8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.d31 d31Var = (r45.d31) ((xg2.i) this.f20093d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f20094e.f20274e, "[requestFeedBack] success");
        this.f20095f.f310123d = d31Var;
        return jz5.f0.f302826a;
    }
}
