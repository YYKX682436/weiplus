package oz;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431686d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f431688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f431689g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oz.g f431690h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, oz.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f431688f = f9Var;
        this.f431689g = z17;
        this.f431690h = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz.i iVar = new oz.i(this.f431688f, this.f431689g, this.f431690h, interfaceC29045xdcb5ca57);
        iVar.f431687e = obj;
        return iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oz.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f431686d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f431688f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v70.w wVar = (v70.w) ((xs.d1) i95.n0.c(xs.d1.class));
            l70.d cj6 = wVar.cj(f9Var, s70.c.f485452g, true);
            if (cj6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScheduledDownloadExecutor", "downloadImage: abort, reason=paramsNull, msgId=" + f9Var.m124847x74d37ac6());
                return f0Var;
            }
            cj6.f398349q = true;
            cj6.f398350r = this.f431689g;
            this.f431686d = 1;
            obj = wVar.bj(cj6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l70.e eVar = (l70.e) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadImage: done, msgId=" + f9Var.m124847x74d37ac6() + ", ret=" + eVar.f398352b);
        this.f431690h.mo157473x57429edc(eVar.f398352b);
        return f0Var;
    }
}
