package ad5;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f84756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ad5.d f84758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.List list, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, yz5.q qVar, ad5.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f84755d = list;
        this.f84756e = f4Var;
        this.f84757f = qVar;
        this.f84758g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ad5.b(this.f84755d, this.f84756e, this.f84757f, this.f84758g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ad5.b bVar = (ad5.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> list = this.f84755d;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : list) {
            f9Var.Q0();
            c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
        }
        this.f84756e.dismiss();
        pm0.v.X(new ad5.a(this.f84757f, this.f84758g, list));
        return jz5.f0.f384359a;
    }
}
