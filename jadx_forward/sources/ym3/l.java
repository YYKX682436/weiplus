package ym3;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f544700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.f f544701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.i f544702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f544703g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ym3.d f544704h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym3.n f544705i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f544706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ym3.f fVar, v65.i iVar, ym3.c cVar, ym3.d dVar, ym3.n nVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f544701e = fVar;
        this.f544702f = iVar;
        this.f544703g = cVar;
        this.f544704h = dVar;
        this.f544705i = nVar;
        this.f544706m = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ym3.l(this.f544701e, this.f544702f, this.f544703g, this.f544704h, this.f544705i, this.f544706m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ym3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f544700d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = this.f544701e.a(this.f544702f, this.f544703g);
            ym3.k kVar = new ym3.k(this.f544704h, this.f544705i, this.f544703g, this.f544706m, this.f544702f);
            this.f544700d = 1;
            if (a17.a(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
