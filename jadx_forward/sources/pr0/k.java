package pr0;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f439402d;

    /* renamed from: e, reason: collision with root package name */
    public int f439403e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f439405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f439407i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pr0.n f439408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.p pVar, java.lang.String str, long j17, pr0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439405g = pVar;
        this.f439406h = str;
        this.f439407i = j17;
        this.f439408m = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.k kVar = new pr0.k(this.f439405g, this.f439406h, this.f439407i, this.f439408m, interfaceC29045xdcb5ca57);
        kVar.f439404f = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439403e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f439404f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f439402d = currentTimeMillis;
            this.f439403e = 1;
            if (this.f439405g.mo149xb9724478(y0Var, this) == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f439402d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.String str = pr0.n.f439429q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Launch End[");
        java.lang.String str2 = this.f439406h;
        sb6.append(str2);
        sb6.append("] total cost:");
        long j18 = this.f439407i;
        sb6.append(currentTimeMillis2 - j18);
        sb6.append(" post cost:");
        sb6.append(j17 - j18);
        sb6.append(" exec cost:");
        sb6.append(currentTimeMillis2 - j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
        this.f439408m.n(str2, currentTimeMillis2 - j18);
        return jz5.f0.f384359a;
    }
}
