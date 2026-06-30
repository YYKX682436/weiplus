package com.tencent.mm.network;

/* loaded from: classes13.dex */
public class z2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.a3 f72188d;

    public z2(com.tencent.mm.network.a3 a3Var) {
        this.f72188d = a3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.network.a3 a3Var = this.f72188d;
        int beginBroadcast = a3Var.f71965g.beginBroadcast();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkEvent", "listeners ct : %d", java.lang.Integer.valueOf(beginBroadcast));
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                a3Var.f71965g.finishBroadcast();
                return false;
            }
            try {
                ((com.tencent.mm.network.s0) a3Var.f71965g.getBroadcastItem(beginBroadcast)).onNetworkChange(a3Var.f71963e);
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.NetworkEvent", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
    }
}
