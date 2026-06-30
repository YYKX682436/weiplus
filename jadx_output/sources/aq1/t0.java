package aq1;

/* loaded from: classes11.dex */
public class t0 implements vg3.x4 {
    @Override // vg3.x4
    public void A(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.storage.f9 o27;
        r45.j4 j4Var = (r45.j4) fVar;
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        if (com.tencent.mm.storage.z3.R4(g17)) {
            com.tencent.mm.storage.a3 W0 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).W0(g17);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(g17, true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                ((c01.k7) c01.n8.a()).b(g17, 32, new aq1.s0(this, W0, g17));
            } else if (W0.Q0()) {
                com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = new com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent();
                am.vk vkVar = netSceneGetChatroomMemberDetailEvent.f54524g;
                vkVar.f8199a = g17;
                vkVar.f8200b = W0.D0();
                netSceneGetChatroomMemberDetailEvent.e();
            }
        }
        long j17 = j4Var.f377568r;
        int i17 = c01.ia.f37254a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17) || j17 <= 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = c01.ia.f37255b;
        if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) || (o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j17)) == null || com.tencent.mm.sdk.platformtools.t8.K0(o27.Q0()) || o27.I0() <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSourceHelper", "found sec msg of %s", java.lang.Long.valueOf(j17));
        c01.ia.O(o27, (java.lang.String) concurrentHashMap.get(java.lang.Long.valueOf(j17)), true);
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
    }

    @Override // vg3.x4
    public void E0(com.tencent.mm.protobuf.f fVar) {
        java.lang.String g17 = x51.j1.g(((r45.j4) fVar).f377558e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17) || ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j0(g17)) {
            return;
        }
        c01.n8.a().c(g17, 29);
    }
}
