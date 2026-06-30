package pr0;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f439376d;

    /* renamed from: e, reason: collision with root package name */
    public int f439377e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f439379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f439381i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pr0.n f439382m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.p pVar, java.lang.String str, long j17, pr0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439379g = pVar;
        this.f439380h = str;
        this.f439381i = j17;
        this.f439382m = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.i iVar = new pr0.i(this.f439379g, this.f439380h, this.f439381i, this.f439382m, interfaceC29045xdcb5ca57);
        iVar.f439378f = obj;
        return iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439377e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f439378f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f439376d = currentTimeMillis;
            this.f439377e = 1;
            obj = this.f439379g.mo149xb9724478(y0Var, this);
            if (obj == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f439376d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.String str = pr0.n.f439429q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Async End[");
        java.lang.String str2 = this.f439380h;
        sb6.append(str2);
        sb6.append("] total cost:");
        long j18 = this.f439381i;
        sb6.append(currentTimeMillis2 - j18);
        sb6.append(" post cost:");
        sb6.append(j17 - j18);
        sb6.append(" exec cost:");
        sb6.append(currentTimeMillis2 - j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
        this.f439382m.n(str2, currentTimeMillis2 - j18);
        return obj;
    }
}
