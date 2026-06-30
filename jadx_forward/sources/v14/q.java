package v14;

/* loaded from: classes5.dex */
public final class q implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v14.v f514112d;

    public q(v14.v vVar) {
        this.f514112d = vVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        e21.f0 f0Var = (e21.f0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyNameUIC", "opResult: " + f0Var);
        xg3.q0 q0Var = f0Var.f328049a;
        if (q0Var != null && q0Var.b() == 64) {
            v14.v vVar = this.f514112d;
            if (vVar.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c) {
                int i17 = f0Var.f328050b;
                if (i17 != 0 && (str = f0Var.f328052d) != null) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = vVar.m158354x19263085();
                    java.lang.String str2 = f0Var.f328051c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    db5.e1.s(m158354x19263085, str, str2);
                } else if (i17 == 0) {
                    gm0.j1.u().c().w(4, vVar.f514121e);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(7);
                    vVar.m158354x19263085().finish();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 1);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = vVar.f514120d;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
