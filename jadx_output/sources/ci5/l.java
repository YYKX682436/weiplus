package ci5;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ci5.q f41740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41742h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41743i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, sf3.g gVar, ci5.q qVar, mf3.k kVar, sf3.g gVar2, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41738d = str;
        this.f41739e = gVar;
        this.f41740f = qVar;
        this.f41741g = kVar;
        this.f41742h = gVar2;
        this.f41743i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ci5.l(this.f41738d, this.f41739e, this.f41740f, this.f41741g, this.f41742h, this.f41743i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ci5.l lVar = (ci5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ci5.f fVar = ci5.f.f41728a;
        java.lang.String downloadPath = this.f41738d;
        kotlin.jvm.internal.o.f(downloadPath, "$downloadPath");
        pm0.v.X(new ci5.k(fVar.a(downloadPath, this.f41739e.c()), this.f41740f, this.f41741g, this.f41742h, this.f41743i));
        return jz5.f0.f302826a;
    }
}
