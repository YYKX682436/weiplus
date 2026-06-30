package cf5;

/* loaded from: classes11.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f122555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f122556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f122557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f122558h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f122559i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list, long j17, int i17, long j18, int i18, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122554d = list;
        this.f122555e = j17;
        this.f122556f = i17;
        this.f122557g = j18;
        this.f122558h = i18;
        this.f122559i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cf5.s(this.f122554d, this.f122555e, this.f122556f, this.f122557g, this.f122558h, this.f122559i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cf5.s sVar = (cf5.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cf5.t tVar = cf5.t.f122560a;
        cf5.m mVar = new cf5.m(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262143, null);
        tVar.a(this.f122554d, mVar);
        ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122562c).put(new java.lang.Long(this.f122555e), new cf5.n(this.f122555e, this.f122556f, this.f122557g, this.f122558h, this.f122559i, mVar));
        return jz5.f0.f384359a;
    }
}
