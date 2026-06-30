package mh2;

/* loaded from: classes10.dex */
public final class d0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f407846d;

    public d0(mh2.k0 k0Var) {
        this.f407846d = k0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mh2.a m147304xa3cabb61;
        mh2.a m147301x4d6ec60e;
        mh2.a m147303x69bfd164;
        mh2.a m147302xbafad237;
        om2.d0 d0Var = (om2.d0) obj;
        mh2.k0 k0Var = this.f407846d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f407919g, "collect sing_state: " + d0Var);
        if (d0Var instanceof om2.v) {
            m147302xbafad237 = k0Var.m147302xbafad237();
            mh2.k0.f(k0Var, m147302xbafad237, d0Var);
            k0Var.f407924o = null;
        } else if (d0Var instanceof om2.x) {
            m147303x69bfd164 = k0Var.m147303x69bfd164();
            mh2.k0.f(k0Var, m147303x69bfd164, d0Var);
            k0Var.f407924o = ((om2.x) d0Var).f427921a.f427893a;
        } else if (d0Var instanceof om2.c0) {
            m147301x4d6ec60e = k0Var.m147301x4d6ec60e();
            mh2.k0.f(k0Var, m147301x4d6ec60e, d0Var);
            k0Var.f407924o = null;
        } else if (d0Var instanceof om2.e0) {
            om2.e0 e0Var = (om2.e0) d0Var;
            mh2.k0.a(k0Var, e0Var.f427832a);
            m147304xa3cabb61 = k0Var.m147304xa3cabb61();
            mh2.k0.f(k0Var, m147304xa3cabb61, d0Var);
            k0Var.f407924o = e0Var.f427832a.f427893a;
        }
        return jz5.f0.f384359a;
    }
}
