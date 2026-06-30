package bg2;

/* loaded from: classes2.dex */
public final class h6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f20141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f20143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(xg2.h hVar, kotlin.coroutines.Continuation continuation, bg2.q6 q6Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f20141d = hVar;
        this.f20142e = q6Var;
        this.f20143f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.h6(this.f20141d, continuation, this.f20142e, this.f20143f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.h6 h6Var = (bg2.h6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.vw0 vw0Var = (r45.vw0) ((xg2.i) this.f20141d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f20142e.f20413e, "[requestClickFeedBack] success");
        this.f20143f.f310123d = vw0Var;
        return jz5.f0.f302826a;
    }
}
