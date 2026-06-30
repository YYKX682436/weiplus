package no1;

/* loaded from: classes5.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            pm0.v.X(no1.a.f420267d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", "Skip to start foreground service, roam is not enable");
        }
    }

    public final void b() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", "Skip to stop foreground service, roam is not enable");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop: ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174258g != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", sb6.toString());
        pm0.v.X(no1.b.f420268d);
    }
}
