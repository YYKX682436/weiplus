package cf5;

/* loaded from: classes11.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f41021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f41024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f41025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f41026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list, long j17, int i17, long j18, int i18, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41021d = list;
        this.f41022e = j17;
        this.f41023f = i17;
        this.f41024g = j18;
        this.f41025h = i18;
        this.f41026i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cf5.s(this.f41021d, this.f41022e, this.f41023f, this.f41024g, this.f41025h, this.f41026i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cf5.s sVar = (cf5.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cf5.t tVar = cf5.t.f41027a;
        cf5.m mVar = new cf5.m(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262143, null);
        tVar.a(this.f41021d, mVar);
        ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41029c).put(new java.lang.Long(this.f41022e), new cf5.n(this.f41022e, this.f41023f, this.f41024g, this.f41025h, this.f41026i, mVar));
        return jz5.f0.f302826a;
    }
}
