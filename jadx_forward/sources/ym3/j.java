package ym3;

/* loaded from: classes.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f544689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.n f544690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.i f544691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f544692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ym3.d f544693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f544694i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ym3.n nVar, v65.i iVar, ym3.c cVar, ym3.d dVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f544690e = nVar;
        this.f544691f = iVar;
        this.f544692g = cVar;
        this.f544693h = dVar;
        this.f544694i = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ym3.j(this.f544690e, this.f544691f, this.f544692g, this.f544693h, this.f544694i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ym3.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f544689d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ym3.n nVar = this.f544690e;
            v65.i iVar = this.f544691f;
            ym3.c cVar = this.f544692g;
            ym3.d dVar = this.f544693h;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = this.f544694i;
            this.f544689d = 1;
            if (ym3.n.d(nVar, iVar, cVar, dVar, i2Var, this) == aVar) {
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
