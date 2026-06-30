package pi0;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f436218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint f436220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.m1 f436221g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f436222h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f436223i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f436224m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pi0.q qVar, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, pi0.m1 m1Var, boolean z17, boolean z18, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f436219e = qVar;
        this.f436220f = dartEntrypoint;
        this.f436221g = m1Var;
        this.f436222h = z17;
        this.f436223i = z18;
        this.f436224m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.p(this.f436219e, this.f436220f, this.f436221g, this.f436222h, this.f436223i, this.f436224m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((pi0.p) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f436218d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 d17 = this.f436219e.d();
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = this.f436220f;
            pi0.m1 m1Var = this.f436221g;
            boolean z17 = this.f436222h;
            boolean z18 = this.f436223i;
            boolean z19 = m1Var.f436206i;
            pi0.o oVar = new pi0.o(m1Var, this.f436224m);
            this.f436218d = 1;
            obj = d17.m137786xf6bf6fb2(dartEntrypoint, m1Var, z17, z18, z19, oVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
