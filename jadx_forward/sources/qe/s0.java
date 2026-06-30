package qe;

/* loaded from: classes7.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18 f443523a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f443524b = true;

    /* renamed from: c, reason: collision with root package name */
    public final qe.r0 f443525c = new qe.r0(this, new qe.q0(this));

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding");
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.UdpNativeInstallHelper", "createUdpBinding jsruntime is null");
            return;
        }
        com.p314xaae8f345.mm.udp.p2634x32db7abc.c.f277981a.mo78291xeb57c8f5("mmudp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.UdpNativeInstallHelper", "createUdpBinding jsThreadHandler is null");
            return;
        }
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f443524b = wi6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "createUdpBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        f0Var.k0(new qe.p0(this, tVar, new qe.o0(this, new java.lang.ref.WeakReference(f0Var))));
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.UdpNativeInstallHelper", "destroyUdpBinding");
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.UdpNativeInstallHelper", "destroyUdpBinding jsruntime is null");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(this.f443525c);
        }
    }
}
