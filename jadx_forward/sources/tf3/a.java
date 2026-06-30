package tf3;

/* loaded from: classes12.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf3.k f500475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf3.l f500476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.g f500477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f500478h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, sf3.k kVar, sf3.l lVar, sf3.g gVar, mf3.k kVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500474d = str;
        this.f500475e = kVar;
        this.f500476f = lVar;
        this.f500477g = gVar;
        this.f500478h = kVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tf3.a(this.f500474d, this.f500475e, this.f500476f, this.f500477g, this.f500478h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        tf3.a aVar = (tf3.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ui listener, id: ");
        sb6.append(this.f500474d);
        sb6.append(" , state: ");
        sf3.k kVar = this.f500475e;
        sb6.append(kVar.name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeImageStateManager", sb6.toString());
        this.f500476f.f(kVar, this.f500477g, this.f500478h.mo147256x74bf41ce());
        return jz5.f0.f384359a;
    }
}
