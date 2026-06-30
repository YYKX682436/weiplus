package hu3;

/* loaded from: classes4.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f366688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(boolean z17, hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366688d = z17;
        this.f366689e = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu3.m0(this.f366688d, this.f366689e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hu3.m0 m0Var = (hu3.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        m0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f366688d;
        hu3.n0 n0Var = this.f366689e;
        if (z17) {
            ((hu3.q0) ((jz5.n) n0Var.E).mo141623x754a37bb()).b(i65.a.r(n0Var.f366693d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hth));
            ((hu3.q0) ((jz5.n) n0Var.E).mo141623x754a37bb()).show();
        } else {
            ((hu3.q0) ((jz5.n) n0Var.E).mo141623x754a37bb()).dismiss();
        }
        return jz5.f0.f384359a;
    }
}
