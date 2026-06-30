package tr0;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f502880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f502882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f502883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f502884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f502885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tr0.t tVar, int i17, int i18, int i19, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502881e = tVar;
        this.f502882f = i17;
        this.f502883g = i18;
        this.f502884h = i19;
        this.f502885i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr0.r(this.f502881e, this.f502882f, this.f502883g, this.f502884h, this.f502885i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f502880d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            tr0.t tVar = this.f502881e;
            if (tVar.A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "is taking picture ignore");
                return null;
            }
            tr0.b bVar = tVar.f502896y;
            tVar.z(bVar.f502819g, bVar.f502817e, 2);
            tr0.t tVar2 = this.f502881e;
            tVar2.A = true;
            int i18 = this.f502882f;
            int i19 = this.f502883g;
            int i27 = this.f502884h;
            boolean z17 = this.f502885i;
            this.f502880d = 1;
            obj = tr0.t.J(tVar2, i18, i19, i27, z17, this);
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
