package vf3;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vf3.e f517927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf3.g f517928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f517929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf3.g f517930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vf3.f f517931i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, vf3.e eVar, vf3.g gVar, gg3.c cVar, sf3.g gVar2, vf3.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f517926d = str;
        this.f517927e = eVar;
        this.f517928f = gVar;
        this.f517929g = cVar;
        this.f517930h = gVar2;
        this.f517931i = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vf3.h(this.f517926d, this.f517927e, this.f517928f, this.f517929g, this.f517930h, this.f517931i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vf3.h hVar = (vf3.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ui listener, id: ");
        sb6.append(this.f517926d);
        sb6.append(" , state: ");
        vf3.e eVar = this.f517927e;
        sb6.append(eVar.name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeLiveStateManager", sb6.toString());
        this.f517928f.A(this.f517929g, this.f517930h, eVar, this.f517931i);
        return jz5.f0.f384359a;
    }
}
