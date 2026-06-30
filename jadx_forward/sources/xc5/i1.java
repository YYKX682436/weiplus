package xc5;

/* loaded from: classes12.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f535014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f535015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.w f535016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l70.d f535017h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l70.d f535018i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sf3.g f535019m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg3.c f535020n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f535021o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(xc5.k1 k1Var, mf3.k kVar, mf3.w wVar, l70.d dVar, l70.d dVar2, sf3.g gVar, gg3.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535014e = k1Var;
        this.f535015f = kVar;
        this.f535016g = wVar;
        this.f535017h = dVar;
        this.f535018i = dVar2;
        this.f535019m = gVar;
        this.f535020n = cVar;
        this.f535021o = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.i1(this.f535014e, this.f535015f, this.f535016g, this.f535017h, this.f535018i, this.f535019m, this.f535020n, this.f535021o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535013d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l70.d dVar = this.f535017h;
            java.lang.String str = dVar.f398338f;
            l70.d dVar2 = this.f535018i;
            java.lang.String str2 = dVar2.f398338f;
            xc5.k1 k1Var = this.f535014e;
            mf3.k kVar = this.f535015f;
            mf3.w wVar = this.f535016g;
            if (k1Var.i7(kVar, wVar, str, str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "live res already exists. mediaId=" + kVar.mo2110x5db1b11());
                xc5.z0 z0Var = kVar instanceof xc5.z0 ? (xc5.z0) kVar : null;
                if (z0Var != null) {
                    z0Var.i(wVar, dVar.f398338f, dVar2.f398338f);
                }
                k1Var.l7(kVar, this.f535019m.c(), dVar2.f398338f);
                vf3.i.Z6(this.f535014e, this.f535015f, vf3.e.f517911e, null, this.f535020n, this.f535019m, 2, null);
                return f0Var;
            }
            xc5.k1 k1Var2 = this.f535014e;
            mf3.k kVar2 = this.f535015f;
            vf3.e eVar = vf3.e.f517913g;
            k1Var2.Y6(kVar2, eVar, new vf3.f(eVar, null, 0, 0.0f, 6, null), this.f535020n, this.f535019m);
            xc5.k1 k1Var3 = this.f535014e;
            mf3.k kVar3 = this.f535015f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f535021o;
            mf3.w wVar2 = this.f535016g;
            l70.d dVar3 = this.f535017h;
            l70.d dVar4 = this.f535018i;
            gg3.c cVar = this.f535020n;
            sf3.g gVar = this.f535019m;
            this.f535013d = 1;
            if (xc5.k1.b7(k1Var3, kVar3, f9Var, wVar2, dVar3, dVar4, cVar, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
