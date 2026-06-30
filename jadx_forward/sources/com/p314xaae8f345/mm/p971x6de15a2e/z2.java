package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes13.dex */
public class z2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.a3 f153721d;

    public z2(com.p314xaae8f345.mm.p971x6de15a2e.a3 a3Var) {
        this.f153721d = a3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p971x6de15a2e.a3 a3Var = this.f153721d;
        int beginBroadcast = a3Var.f153498g.beginBroadcast();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkEvent", "listeners ct : %d", java.lang.Integer.valueOf(beginBroadcast));
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                a3Var.f153498g.finishBroadcast();
                return false;
            }
            try {
                ((com.p314xaae8f345.mm.p971x6de15a2e.s0) a3Var.f153498g.getBroadcastItem(beginBroadcast)).mo8869xde9f63df(a3Var.f153496e);
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkEvent", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
    }
}
