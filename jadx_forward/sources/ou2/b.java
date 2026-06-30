package ou2;

/* loaded from: classes8.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430451d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430452e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f430453f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f430454g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f430455h;

    /* renamed from: i, reason: collision with root package name */
    public int f430456i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ou2.d f430457m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ts5.m f430458n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ts5.p f430459o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f430460p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ou2.d dVar, ts5.m mVar, ts5.p pVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f430457m = dVar;
        this.f430458n = mVar;
        this.f430459o = pVar;
        this.f430460p = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ou2.b(this.f430457m, this.f430458n, this.f430459o, this.f430460p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ou2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ou2.d dVar;
        ts5.m mVar;
        boolean z17;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2;
        ts5.p pVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f430456i;
        boolean z18 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dVar = this.f430457m;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar3 = dVar.f430467c;
            this.f430451d = dVar3;
            this.f430452e = dVar;
            mVar = this.f430458n;
            this.f430453f = mVar;
            ts5.p pVar2 = this.f430459o;
            this.f430454g = pVar2;
            boolean z19 = this.f430460p;
            this.f430455h = z19;
            this.f430456i = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar3;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            z17 = z19;
            dVar2 = kVar;
            pVar = pVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z17 = this.f430455h;
            pVar = (ts5.p) this.f430454g;
            mVar = (ts5.m) this.f430453f;
            dVar = (ou2.d) this.f430452e;
            dVar2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f430451d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        try {
            ou2.e eVar = dVar.f430465a;
            if (!z17) {
                z18 = false;
            }
            eVar.a(mVar, pVar, z18);
        } finally {
            try {
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2).d(null);
                return jz5.f0.f384359a;
            } catch (java.lang.Throwable th6) {
            }
        }
        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2).d(null);
        return jz5.f0.f384359a;
    }
}
