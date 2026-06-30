package xt2;

/* loaded from: classes3.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f538628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f538630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(xt2.e3 e3Var, cm2.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538629e = e3Var;
        this.f538630f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xt2.x2 x2Var = new xt2.x2(this.f538629e, this.f538630f, interfaceC29045xdcb5ca57);
        x2Var.f538628d = obj;
        return x2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xt2.x2 x2Var = (xt2.x2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f538628d;
        xt2.e3 e3Var = this.f538629e;
        p3325xe03a0797.p3326xc267989b.r2 m175928xb5884c87 = e3Var.m175928xb5884c87();
        if (m175928xb5884c87 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(m175928xb5884c87, null, 1, null);
        }
        e3Var.m175941xca0273fb(p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new xt2.w2(e3Var, this.f538630f, null), 3, null));
        return jz5.f0.f384359a;
    }
}
