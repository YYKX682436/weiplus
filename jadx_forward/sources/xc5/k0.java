package xc5;

/* loaded from: classes12.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f535042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc5.l0 f535043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f535045h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf3.g f535046i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l70.d dVar, xc5.l0 l0Var, java.lang.String str, mf3.k kVar, sf3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535042e = dVar;
        this.f535043f = l0Var;
        this.f535044g = str;
        this.f535045h = kVar;
        this.f535046i = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.k0(this.f535042e, this.f535043f, this.f535044g, this.f535045h, this.f535046i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535041d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
            this.f535041d = 1;
            obj = ((v70.w) d1Var).bj(this.f535042e, this);
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
        xc5.l0 l0Var = this.f535043f;
        java.util.HashSet hashSet = (java.util.HashSet) ((jz5.n) l0Var.f535065g).mo141623x754a37bb();
        java.lang.String str = this.f535044g;
        hashSet.remove(str);
        l70.f fVar = eVar.f398351a;
        l70.f fVar2 = l70.f.f398353d;
        sf3.g gVar = this.f535046i;
        mf3.k kVar = this.f535045h;
        if (fVar == fVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "download mid success. mediaId: " + str);
            sf3.g e17 = kVar.e();
            sf3.g b17 = e17 != null ? e17.b(sf3.m.f488937f) : null;
            if (b17 != null && b17.f488924e != sf3.m.f488935d) {
                gVar = b17;
            }
            l0Var.W6(kVar, sf3.k.f488930e, gVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "download failed. mediaId: " + str + " ret: " + eVar.f398352b);
            l0Var.W6(kVar, sf3.k.f488931f, gVar);
        }
        return jz5.f0.f384359a;
    }
}
