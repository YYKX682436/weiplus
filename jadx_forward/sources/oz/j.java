package oz;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431691d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f431693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f431694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oz.g f431695h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, oz.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f431693f = f9Var;
        this.f431694g = z17;
        this.f431695h = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz.j jVar = new oz.j(this.f431693f, this.f431694g, this.f431695h, interfaceC29045xdcb5ca57);
        jVar.f431692e = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oz.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f431691d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f431693f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xf0.n nVar = xf0.s.f535749f;
            xf0.i U6 = nVar.a().U6(f9Var, xf0.f.f535696d, true);
            if (U6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScheduledDownloadExecutor", "downloadVideo: abort, reason=paramsNull, msgId=" + f9Var.m124847x74d37ac6());
                return f0Var;
            }
            U6.f535723r = true;
            U6.f535724s = this.f431694g;
            xf0.s a17 = nVar.a();
            this.f431691d = 1;
            obj = a17.T6(U6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        xf0.j jVar = (xf0.j) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadVideo: done, msgId=" + f9Var.m124847x74d37ac6() + ", ret=" + jVar.f535726b);
        this.f431695h.mo157473x57429edc(jVar.f535726b);
        return f0Var;
    }
}
