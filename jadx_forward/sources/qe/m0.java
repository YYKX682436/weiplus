package qe;

/* loaded from: classes7.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38 f443508a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f443509b = true;

    /* renamed from: c, reason: collision with root package name */
    public final qe.l0 f443510c = new qe.l0(this, new qe.k0(this));

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding");
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.TcpNativeInstallHelper", "createTcpBinding jsruntime is null");
            return;
        }
        com.p314xaae8f345.mm.tcp.p2626x32db76dc.c.f277945a.mo78211xeb57c8f5("mmtcp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.TcpNativeInstallHelper", "createTcpBinding jsThreadHandler is null");
            return;
        }
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f443509b = wi6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "createTcpBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        f0Var.k0(new qe.j0(this, tVar, new qe.i0(this, new java.lang.ref.WeakReference(f0Var))));
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.TcpNativeInstallHelper", "destroyTcpBinding");
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.TcpNativeInstallHelper", "destroyTcpBinding jsruntime is null");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(this.f443510c);
        }
    }
}
