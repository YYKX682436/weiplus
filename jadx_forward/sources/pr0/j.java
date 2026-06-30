package pr0;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439388d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439389e;

    /* renamed from: f, reason: collision with root package name */
    public long f439390f;

    /* renamed from: g, reason: collision with root package name */
    public int f439391g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pr0.n f439393i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439394m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f439395n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f439396o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pr0.n nVar, java.lang.String str, long j17, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439393i = nVar;
        this.f439394m = str;
        this.f439395n = j17;
        this.f439396o = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.j jVar = new pr0.j(this.f439393i, this.f439394m, this.f439395n, this.f439396o, interfaceC29045xdcb5ca57);
        jVar.f439392h = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        long currentTimeMillis;
        yz5.p pVar;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        java.lang.Throwable th6;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439391g;
        pr0.n nVar = this.f439393i;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f439392h;
                currentTimeMillis = java.lang.System.currentTimeMillis();
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = nVar.f439433p;
                this.f439392h = y0Var;
                this.f439388d = dVar2;
                pVar = this.f439396o;
                this.f439389e = pVar;
                this.f439390f = currentTimeMillis;
                this.f439391g = 1;
                kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
                if (kVar.b(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j17 = this.f439390f;
                    dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f439392h;
                    try {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        java.lang.String str = pr0.n.f439429q;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cameraAsyncWithSync End[");
                        java.lang.String str2 = this.f439394m;
                        sb6.append(str2);
                        sb6.append("] total cost:");
                        long j18 = this.f439395n;
                        sb6.append(currentTimeMillis2 - j18);
                        sb6.append(" post cost:");
                        sb6.append(j17 - j18);
                        sb6.append(" exec cost:");
                        sb6.append(currentTimeMillis2 - j17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
                        nVar.n(str2, currentTimeMillis2 - j18);
                        return obj;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                        throw th6;
                    }
                }
                currentTimeMillis = this.f439390f;
                pVar = (yz5.p) this.f439389e;
                ?? r47 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f439388d;
                y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f439392h;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                kVar = r47;
            }
            this.f439392h = kVar;
            this.f439388d = null;
            this.f439389e = null;
            this.f439390f = currentTimeMillis;
            this.f439391g = 2;
            java.lang.Object mo149xb9724478 = pVar.mo149xb9724478(y0Var, this);
            if (mo149xb9724478 == aVar) {
                return aVar;
            }
            dVar = kVar;
            obj = mo149xb9724478;
            j17 = currentTimeMillis;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            long currentTimeMillis22 = java.lang.System.currentTimeMillis();
            java.lang.String str3 = pr0.n.f439429q;
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("cameraAsyncWithSync End[");
            java.lang.String str22 = this.f439394m;
            sb62.append(str22);
            sb62.append("] total cost:");
            long j182 = this.f439395n;
            sb62.append(currentTimeMillis22 - j182);
            sb62.append(" post cost:");
            sb62.append(j17 - j182);
            sb62.append(" exec cost:");
            sb62.append(currentTimeMillis22 - j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", sb62.toString());
            nVar.n(str22, currentTimeMillis22 - j182);
            return obj;
        } catch (java.lang.Throwable th8) {
            dVar = kVar;
            th6 = th8;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            throw th6;
        }
    }
}
