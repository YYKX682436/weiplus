package zm5;

/* loaded from: classes4.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f555762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zm5.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555762d = r0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zm5.j0(this.f555762d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zm5.j0 j0Var = (zm5.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryMainUIC", "init engine done");
        aq.n nVar = aq.o.f94455c;
        zm5.r0 r0Var = this.f555762d;
        if (nVar != null) {
            nVar.a(r0Var.m158354x19263085());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = r0Var.f555794f;
        boolean z17 = false;
        if (u3Var != null && u3Var.isShowing()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = r0Var.f555794f;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            r0Var.f555794f = null;
        }
        return jz5.f0.f384359a;
    }
}
