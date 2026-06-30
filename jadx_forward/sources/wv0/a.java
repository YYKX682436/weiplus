package wv0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dx0.g f531429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.n f531430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dx0.g gVar, vv0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f531429d = gVar;
        this.f531430e = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wv0.a(this.f531429d, this.f531430e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wv0.a aVar = (wv0.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vv0.n nVar = this.f531430e;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = nVar.f521931a;
        dx0.g gVar = this.f531429d;
        gVar.f(c3971x241f78);
        gVar.b(nVar.f521931a);
        return jz5.f0.f384359a;
    }
}
