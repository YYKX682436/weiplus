package ty0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f504362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uz0.c f504363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f504364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0.f1 f1Var, uz0.c cVar, yz5.l lVar, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504362d = f1Var;
        this.f504363e = cVar;
        this.f504364f = lVar;
        this.f504365g = e5Var;
        this.f504366h = e5Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ty0.f0(this.f504362d, this.f504363e, this.f504364f, this.f504365g, this.f504366h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ty0.f0 f0Var = (ty0.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        f0Var.mo150x989b7ca4(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        uz0.s d17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (!this.f504362d.a() && (d17 = this.f504363e.d()) != null) {
            java.lang.String m33856x92013dca = ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) ty0.z0.h(this.f504365g).get(d17.a())).m33856x92013dca();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33856x92013dca, "getMusicID(...)");
            this.f504364f.mo146xb9724478(m33856x92013dca);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicSelectorExpand", "select to " + ((java.lang.String) this.f504366h.mo128745x754a37bb()));
        }
        return jz5.f0.f384359a;
    }
}
