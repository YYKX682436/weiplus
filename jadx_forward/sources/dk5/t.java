package dk5;

/* loaded from: classes12.dex */
public final class t implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public static final dk5.t f316425d = new dk5.t();

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qi3.e0 e0Var = (qi3.e0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.FileSendLogic", "sendFile event:" + e0Var);
        int ordinal = e0Var.f445224a.ordinal();
        qi3.b0 b0Var = e0Var.f445225b;
        if (ordinal == 2) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.b.f291152a.b(e0Var.f445230g, 1, b0Var.id());
        } else if (ordinal == 4) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.b.f291152a.b(e0Var.f445230g, 2, b0Var.id());
        } else if (ordinal == 7) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.b.f291152a.b(e0Var.f445230g, 3, b0Var.id());
        }
        return jz5.f0.f384359a;
    }
}
