package aq1;

/* loaded from: classes12.dex */
public class z0 extends com.tencent.mm.network.r0 {
    public z0(android.content.Context context) {
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        if (i17 == 4 || i17 == 6) {
            if (!gm0.j1.a() || gm0.m.r()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OnNetworkAvailableListener", "dealWithNetworkAvailable hasSetuin:" + gm0.j1.a() + " isHold:" + gm0.m.r());
                return;
            }
            w21.p0.Bi().e();
            if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
                ((oz.s) ((pz.e) i95.n0.c(pz.e.class))).hj();
            }
            t21.o2.Zi().k();
            com.tencent.mm.pluginsdk.model.app.u5.Ni().d();
            c01.n8.c();
            c01.n8.c();
            zf4.l.Ai().c();
            new com.tencent.mm.autogen.events.StartFavServiceEvent().e();
        }
    }
}
