package jy4;

/* loaded from: classes5.dex */
public class b0 implements vg3.t4 {
    @Override // vg3.t4
    public void A(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.j4 j4Var = (r45.j4) fVar;
        if (j4Var.f459093g == 51 || !c01.z1.r().equals(j4Var.f459091e.f454289d)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).o2(j4Var.f459092f.f454289d, j4Var.f459101r);
        if (o27.I0() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebWXSyncExtensionCallback", "[MicroMsg.MultiTerminalSyncMgr] msg not exit, svrID:%d", java.lang.Long.valueOf(j4Var.f459101r));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebWXSyncExtensionCallback", "[MicroMsg.MultiTerminalSyncMgr] selfSend msg, svrID:%d, localId:%d", java.lang.Long.valueOf(j4Var.f459101r), java.lang.Long.valueOf(o27.m124847x74d37ac6()));
            iy4.j.a(o27.m124847x74d37ac6(), o27.Q0());
        }
    }

    @Override // vg3.t4
    public /* bridge */ /* synthetic */ void E0(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
    }
}
