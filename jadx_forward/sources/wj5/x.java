package wj5;

/* loaded from: classes8.dex */
public final class x implements db5.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj5.y f528380a;

    public x(wj5.y yVar) {
        this.f528380a = yVar;
    }

    @Override // db5.i9
    public void a(java.lang.String fromWhere) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromWhere, "fromWhere");
        wj5.y yVar = this.f528380a;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) ((sb5.j2) yVar.f528381e.f542241c.a(sb5.j2.class))).n0(fromWhere);
        yVar.f528383g.m0();
    }

    @Override // db5.i9
    public void b() {
        boolean z17;
        wj5.y yVar = this.f528380a;
        if (iq.b.C(yVar.f528381e.g()) || iq.b.v(yVar.f528381e.g()) || iq.b.e(yVar.f528381e.g())) {
            return;
        }
        java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(yVar.f528381e.u().d1());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getTrackRoomInfo(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", java.lang.Integer.valueOf(b17.size()));
        if (((va3.z0) q21.d.a()).f(yVar.f528381e.u().d1())) {
            yb5.d dVar = yVar.f528381e;
            z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) dVar.f542241c.a(sb5.n.class))).u0() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).P;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.x()) && !z17) {
                db5.e1.s(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k1l), null);
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
            c6154xe47ae2d0.f136416g.f89116a = true;
            c6154xe47ae2d0.e();
            am.py pyVar = c6154xe47ae2d0.f136417h;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pyVar.f89204a) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.x(), pyVar.f89204a)) {
                yVar.q(dVar.x());
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d02 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
            c6154xe47ae2d02.f136416g.f89117b = true;
            c6154xe47ae2d02.e();
            yVar.q(dVar.x());
            return;
        }
        yb5.d dVar2 = yVar.f528381e;
        z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) dVar2.f542241c.a(sb5.n.class))).u0() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar2.f542241c.a(sb5.f.class))).P;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar2.x()) && !z17) {
            db5.e1.s(dVar2.g(), dVar2.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.joi), null);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d03 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
        c6154xe47ae2d03.f136416g.f89116a = true;
        c6154xe47ae2d03.e();
        am.py pyVar2 = c6154xe47ae2d03.f136417h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pyVar2.f89204a) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar2.x(), pyVar2.f89204a)) {
            yVar.p(dVar2.x());
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = yVar.f528383g.f544264f;
        if (c21532x4955f5be == null || c21532x4955f5be.getVisibility() != 0) {
            db5.e1.u(dVar2.g(), dVar2.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jo_), null, new wj5.v(yVar), wj5.w.f528379d);
        }
    }
}
