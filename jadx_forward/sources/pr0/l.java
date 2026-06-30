package pr0;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439412e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f439413f;

    /* renamed from: g, reason: collision with root package name */
    public long f439414g;

    /* renamed from: h, reason: collision with root package name */
    public int f439415h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439416i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pr0.n f439418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f439419o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.p f439420p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, pr0.n nVar, long j17, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439417m = str;
        this.f439418n = nVar;
        this.f439419o = j17;
        this.f439420p = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pr0.l lVar = new pr0.l(this.f439417m, this.f439418n, this.f439419o, this.f439420p, interfaceC29045xdcb5ca57);
        lVar.f439416i = obj;
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        long currentTimeMillis;
        yz5.p pVar;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar;
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        java.lang.Throwable th6;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439415h;
        pr0.n nVar = this.f439418n;
        java.lang.String str2 = this.f439417m;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f439416i;
                currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str3 = pr0.n.f439429q;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "SyncLaunch Come In Launch[" + str2 + ']');
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = nVar.f439433p;
                this.f439416i = y0Var;
                this.f439411d = dVar2;
                this.f439412e = str2;
                pVar = this.f439420p;
                this.f439413f = pVar;
                this.f439414g = currentTimeMillis;
                this.f439415h = 1;
                kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
                if (kVar.b(null, this) == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j17 = this.f439414g;
                    dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f439416i;
                    try {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        java.lang.String str4 = pr0.n.f439429q;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SyncLaunch End[");
                        sb6.append(str2);
                        sb6.append("] total cost:");
                        long j18 = this.f439419o;
                        sb6.append(currentTimeMillis2 - j18);
                        sb6.append(" post cost:");
                        sb6.append(j17 - j18);
                        sb6.append(" exec cost:");
                        sb6.append(currentTimeMillis2 - j17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
                        nVar.n(str2, currentTimeMillis2 - j18);
                        return jz5.f0.f384359a;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                        throw th6;
                    }
                }
                currentTimeMillis = this.f439414g;
                pVar = (yz5.p) this.f439413f;
                str = (java.lang.String) this.f439412e;
                ?? r122 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f439411d;
                y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f439416i;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                kVar = r122;
            }
            java.lang.String str5 = pr0.n.f439429q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "SyncLaunch Come In Launch Lock[" + str + ']');
            this.f439416i = kVar;
            this.f439411d = null;
            this.f439412e = null;
            this.f439413f = null;
            this.f439414g = currentTimeMillis;
            this.f439415h = 2;
            if (pVar.mo149xb9724478(y0Var, this) == aVar) {
                return aVar;
            }
            dVar = kVar;
            j17 = currentTimeMillis;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            long currentTimeMillis22 = java.lang.System.currentTimeMillis();
            java.lang.String str42 = pr0.n.f439429q;
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("SyncLaunch End[");
            sb62.append(str2);
            sb62.append("] total cost:");
            long j182 = this.f439419o;
            sb62.append(currentTimeMillis22 - j182);
            sb62.append(" post cost:");
            sb62.append(j17 - j182);
            sb62.append(" exec cost:");
            sb62.append(currentTimeMillis22 - j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", sb62.toString());
            nVar.n(str2, currentTimeMillis22 - j182);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th8) {
            dVar = kVar;
            th6 = th8;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
            throw th6;
        }
    }
}
