package ch2;

/* loaded from: classes10.dex */
public final class s0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122990d;

    public s0(ch2.o2 o2Var) {
        this.f122990d = o2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Boolean bool;
        om2.a aVar = (om2.a) obj;
        if (aVar != null) {
            ch2.o2 o2Var = this.f122990d;
            o2Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAnchorOptionState: ");
            boolean z17 = aVar.f427801a;
            sb6.append(z17);
            sb6.append(" isPause: ");
            om2.i iVar = o2Var.q7().f427840n;
            if (iVar != null) {
                r45.ia4 ia4Var = iVar.f427856c;
                bool = java.lang.Boolean.valueOf(ia4Var != null && ia4Var.f458410o);
            } else {
                bool = null;
            }
            sb6.append(bool);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", sb6.toString());
            om2.i iVar2 = o2Var.q7().f427840n;
            if (iVar2 != null) {
                r45.ia4 ia4Var2 = iVar2.f427856c;
                if (z17) {
                    if (!(ia4Var2 != null && ia4Var2.f458410o)) {
                        pm0.v.X(new ch2.s(iVar2, o2Var));
                    }
                } else {
                    if (ia4Var2 != null && ia4Var2.f458410o) {
                        pm0.v.X(new ch2.t(iVar2, o2Var));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
