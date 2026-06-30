package kf2;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f388726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf2.e f388727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f388728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f388729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, kf2.e eVar, long j17, int i17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f388726d = hVar;
        this.f388727e = eVar;
        this.f388728f = j17;
        this.f388729g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kf2.b(this.f388726d, interfaceC29045xdcb5ca57, this.f388727e, this.f388728f, this.f388729g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kf2.b bVar = (kf2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f388726d).f535914b;
        this.f388727e.a(this.f388728f, this.f388729g, aVar2);
        return jz5.f0.f384359a;
    }
}
