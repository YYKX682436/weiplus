package yd2;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f542578d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f542579e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f542580f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f542581g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f542582h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f542583i;

    /* renamed from: m, reason: collision with root package name */
    public int f542584m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yd2.a f542585n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yd2.l f542586o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yd2.b f542587p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yd2.j f542588q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yd2.b f542589r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yd2.n f542590s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yd2.a aVar, yd2.l lVar, yd2.b bVar, yd2.j jVar, yd2.b bVar2, yd2.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542585n = aVar;
        this.f542586o = lVar;
        this.f542587p = bVar;
        this.f542588q = jVar;
        this.f542589r = bVar2;
        this.f542590s = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yd2.e(this.f542585n, this.f542586o, this.f542587p, this.f542588q, this.f542589r, this.f542590s, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f542584m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yd2.a aVar2 = this.f542585n;
            this.f542578d = aVar2;
            yd2.l lVar = this.f542586o;
            this.f542579e = lVar;
            yd2.b bVar = this.f542587p;
            this.f542580f = bVar;
            yd2.j jVar = this.f542588q;
            this.f542581g = jVar;
            yd2.b bVar2 = this.f542589r;
            this.f542582h = bVar2;
            yd2.n nVar = this.f542590s;
            this.f542583i = nVar;
            this.f542584m = 1;
            oz5.n nVar2 = new oz5.n(pz5.f.b(this));
            aVar2.b(lVar, bVar, new yd2.d(nVar2, jVar, bVar2, nVar));
            obj = nVar2.a();
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
