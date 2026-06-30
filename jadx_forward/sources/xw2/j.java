package xw2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw2.s f539232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f539233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f539234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xw2.s sVar, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539232e = sVar;
        this.f539233f = i17;
        this.f539234g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xw2.j jVar = new xw2.j(this.f539232e, this.f539233f, this.f539234g, interfaceC29045xdcb5ca57);
        jVar.f539231d = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw2.j) mo148xaf65a0fc((java.util.List) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return xw2.s.b(this.f539232e, (java.util.List) this.f539231d, this.f539233f, this.f539234g);
    }
}
