package v14;

/* loaded from: classes5.dex */
public final class b implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v14.g f514068d;

    public b(v14.g gVar) {
        this.f514068d = gVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        e21.f0 f0Var = (e21.f0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditSignatureUIC", "opResult: " + f0Var);
        xg3.q0 q0Var = f0Var.f328049a;
        if (q0Var != null && q0Var.b() == 64) {
            v14.g gVar = this.f514068d;
            if (gVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17371x5d66fcc2) {
                if (f0Var.f328050b != 0 || gVar.f514077e == null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(gVar.m158354x19263085());
                    java.lang.String str = f0Var.f328052d;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str = gVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571538i7);
                    }
                    u1Var.g(str);
                    u1Var.a(false);
                    u1Var.b(v14.a.f514067a);
                    u1Var.q(false);
                } else {
                    gm0.j1.u().c().w(12291, gVar.f514077e);
                    gVar.m158354x19263085().finish();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = gVar.f514076d;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
