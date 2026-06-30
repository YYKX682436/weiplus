package ix3;

/* loaded from: classes10.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.j1 f376979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ix3.j1 j1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376979d = j1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ix3.i1(this.f376979d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ix3.i1 i1Var = (ix3.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ix3.a2 a2Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ix3.j1 j1Var = this.f376979d;
        j75.f Q6 = j1Var.Q6();
        if (Q6 != null && (a2Var = (ix3.a2) Q6.mo140437x75286adb()) != null) {
            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(a2Var.f376894f, false);
            java.util.List S0 = s17 != null ? kz5.n0.S0(s17) : kz5.p0.f395529d;
            j75.f Q62 = j1Var.Q6();
            if (Q62 != null) {
                Q62.B3(new ix3.k1(S0));
            }
        }
        return jz5.f0.f384359a;
    }
}
