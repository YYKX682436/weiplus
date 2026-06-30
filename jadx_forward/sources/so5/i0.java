package so5;

/* loaded from: classes14.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f492384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f492385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, so5.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492384d = i17;
        this.f492385e = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so5.i0(this.f492384d, this.f492385e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        so5.i0 i0Var = (so5.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Boolean bool = null;
        int i17 = this.f492384d;
        so5.k0 k0Var = this.f492385e;
        if (i17 == 480) {
            zq4.b bVar = k0Var.f492392f;
            if (bVar != null) {
                bool = java.lang.Boolean.valueOf(bVar.g(640, 480));
            }
        } else if (i17 == 720) {
            zq4.b bVar2 = k0Var.f492392f;
            if (bVar2 != null) {
                bool = java.lang.Boolean.valueOf(bVar2.g(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf));
            }
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            k0Var.f492393g = i17;
            k0Var.f492399p = true;
        }
        return jz5.f0.f384359a;
    }
}
