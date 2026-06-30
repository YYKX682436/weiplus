package j75;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j75.k f379601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.d f379602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j75.k kVar, j75.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f379601d = kVar;
        this.f379602e = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j75.g(this.f379601d, this.f379602e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        j75.g gVar = (j75.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        j75.k kVar = this.f379601d;
        j75.a c17 = kVar.f379609g.c();
        c17.f379599d = this.f379602e;
        kVar.f379610h.a(c17);
        kVar.f379609g = c17;
        kVar.f379611i.mo127123xc2079749(c17.c());
        return jz5.f0.f384359a;
    }
}
