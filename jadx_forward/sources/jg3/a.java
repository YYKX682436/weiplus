package jg3;

/* loaded from: classes12.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f381181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.d f381182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg3.f f381183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f381184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg3.e f381185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, gg3.d dVar, gg3.f fVar, gg3.c cVar, gg3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f381181d = str;
        this.f381182e = dVar;
        this.f381183f = fVar;
        this.f381184g = cVar;
        this.f381185h = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jg3.a(this.f381181d, this.f381182e, this.f381183f, this.f381184g, this.f381185h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jg3.a aVar = (jg3.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
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
        sb6.append(this.f381181d);
        sb6.append(" , state: ");
        gg3.d dVar = this.f381182e;
        sb6.append(dVar.name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeVideoStateManager", sb6.toString());
        this.f381183f.E(this.f381184g, dVar, this.f381185h);
        return jz5.f0.f384359a;
    }
}
