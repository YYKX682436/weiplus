package bg2;

/* loaded from: classes2.dex */
public final class b8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f19953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f19954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f19955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(xg2.h hVar, kotlin.coroutines.Continuation continuation, bg2.l8 l8Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f19953d = hVar;
        this.f19954e = l8Var;
        this.f19955f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.b8(this.f19953d, continuation, this.f19954e, this.f19955f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.b8 b8Var = (bg2.b8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.vw0 vw0Var = (r45.vw0) ((xg2.i) this.f19953d).f454393b;
        com.tencent.mars.xlog.Log.i(this.f19954e.f20274e, "[requestClickFeedBack] success");
        this.f19955f.f310123d = vw0Var;
        return jz5.f0.f302826a;
    }
}
