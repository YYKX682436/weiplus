package bg2;

/* loaded from: classes2.dex */
public final class l6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f20270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f20272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(xg2.h hVar, kotlin.coroutines.Continuation continuation, bg2.q6 q6Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f20270d = hVar;
        this.f20271e = q6Var;
        this.f20272f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.l6(this.f20270d, continuation, this.f20271e, this.f20272f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.l6 l6Var = (bg2.l6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.d31 d31Var = (r45.d31) ((xg2.i) this.f20270d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f20271e.f20413e, "[requestFeedBack] success");
        this.f20272f.f310123d = d31Var;
        return jz5.f0.f302826a;
    }
}
