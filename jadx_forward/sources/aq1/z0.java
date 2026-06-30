package aq1;

/* loaded from: classes12.dex */
public class z0 extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {
    public z0(android.content.Context context) {
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        if (i17 == 4 || i17 == 6) {
            if (!gm0.j1.a() || gm0.m.r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnNetworkAvailableListener", "dealWithNetworkAvailable hasSetuin:" + gm0.j1.a() + " isHold:" + gm0.m.r());
                return;
            }
            w21.p0.Bi().e();
            if (((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).bj()) {
                ((oz.s) ((pz.e) i95.n0.c(pz.e.class))).hj();
            }
            t21.o2.Zi().k();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().d();
            c01.n8.c();
            c01.n8.c();
            zf4.l.Ai().c();
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6115x1cf24afe().e();
        }
    }
}
