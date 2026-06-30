package gg1;

/* loaded from: classes7.dex */
public final class e1 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.k1 f353089d;

    public e1(gg1.k1 k1Var) {
        this.f353089d = k1Var;
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        x91.c cVar;
        java.lang.String str = (hVar == null || (cVar = hVar.f534180a) == null) ? null : cVar.f534174i;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "onAddDevice: udn = ".concat(str));
        gg1.k1 k1Var = this.f353089d;
        if (hVar == null || r26.n0.N(str)) {
            yz5.l lVar = k1Var.f353128h;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        x91.c cVar2 = k1Var.b().f534180a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cVar2 != null ? cVar2.f534174i : null)) {
            yz5.l lVar2 = k1Var.f353128h;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            ((b06.b) k1Var.f353123c).a(k1Var, gg1.k1.f353120k[0], hVar);
        }
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "reconnect: onUpdateDevice");
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastDeviceManager", "reconnect: onRemoveDevice");
    }
}
