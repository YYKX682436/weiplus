package ci5;

/* loaded from: classes12.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ci5.q f41747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41748h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41749i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, sf3.g gVar, ci5.q qVar, mf3.k kVar, sf3.g gVar2, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41745e = str;
        this.f41746f = gVar;
        this.f41747g = qVar;
        this.f41748h = kVar;
        this.f41749i = gVar2;
        this.f41750m = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ci5.m(this.f41745e, this.f41746f, this.f41747g, this.f41748h, this.f41749i, this.f41750m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ci5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41744d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            ci5.l lVar = new ci5.l(this.f41745e, this.f41746f, this.f41747g, this.f41748h, this.f41749i, this.f41750m, null);
            this.f41744d = 1;
            if (kotlinx.coroutines.l.g(p0Var, lVar, this) == aVar) {
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
