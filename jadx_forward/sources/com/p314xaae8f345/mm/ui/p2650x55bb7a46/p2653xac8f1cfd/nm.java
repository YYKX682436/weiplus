package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class nm implements db5.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm f281130a;

    public nm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm smVar) {
        this.f281130a = smVar;
    }

    @Override // db5.i9
    public void a(java.lang.String str) {
        this.f281130a.n0(str);
    }

    @Override // db5.i9
    public void b() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm smVar = this.f281130a;
        if (iq.b.C(smVar.f280113d.g()) || iq.b.v(smVar.f280113d.g()) || iq.b.e(smVar.f280113d.g())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", java.lang.Integer.valueOf(((va3.z0) q21.d.a()).b(smVar.f280113d.u().d1()).size()));
        if (!((va3.z0) q21.d.a()).f(smVar.f280113d.u().d1())) {
            smVar.o0(true);
            return;
        }
        boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) smVar.f280113d.f542241c.a(sb5.n.class))).u0() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) smVar.f280113d.f542241c.a(sb5.f.class))).P;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(smVar.f280113d.x()) && !z17) {
            db5.e1.s(smVar.f280113d.g(), smVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1l), null);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
        c6154xe47ae2d0.f136416g.f89116a = true;
        c6154xe47ae2d0.e();
        am.py pyVar = c6154xe47ae2d0.f136417h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pyVar.f89204a) || smVar.f280113d.x().equals(pyVar.f89204a)) {
            smVar.q0(smVar.f280113d.x(), "fromBanner", false);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d02 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
        c6154xe47ae2d02.f136416g.f89117b = true;
        c6154xe47ae2d02.e();
        smVar.q0(smVar.f280113d.x(), "fromBanner", false);
    }
}
