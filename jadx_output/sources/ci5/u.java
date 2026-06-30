package ci5;

/* loaded from: classes12.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41789h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, gg3.c cVar, ci5.b0 b0Var, mf3.k kVar, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41785d = str;
        this.f41786e = cVar;
        this.f41787f = b0Var;
        this.f41788g = kVar;
        this.f41789h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ci5.u(this.f41785d, this.f41786e, this.f41787f, this.f41788g, this.f41789h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ci5.u uVar = (ci5.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ci5.f fVar = ci5.f.f41728a;
        java.lang.String downloadPath = this.f41785d;
        kotlin.jvm.internal.o.f(downloadPath, "$downloadPath");
        pm0.v.X(new ci5.t(fVar.a(downloadPath, this.f41786e.f271728c), this.f41787f, this.f41788g, this.f41786e, this.f41789h));
        return jz5.f0.f302826a;
    }
}
