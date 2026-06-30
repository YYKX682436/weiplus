package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class wb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb f281699e;

    public wb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar, java.lang.String str) {
        this.f281699e = jbVar;
        this.f281698d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        java.lang.String str = this.f281698d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = this.f281699e;
        try {
            boolean z18 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_UnionTransfer_Int, 0) == 1;
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AssociatechatroomPayTransferEntranceGrayscaleStatus", 0);
            if (z18) {
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) == null) {
                z17 = false;
            } else {
                z17 = (z07.f69084x8729abea & 134217728) > 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM grey:%s showTransferEntry:%b ChatroomStatus:%s", java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(z07.f69084x8729abea));
            }
            if (b17 == 1) {
                if (z17) {
                    return;
                }
                jbVar.f280796e.U(14);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, grey is 1, but showTransferEntry false");
                return;
            }
            if (b17 != 2) {
                jbVar.f280796e.U(16);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, close");
                return;
            }
            boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_union_transfer_chatroom, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM grey is 2, abtest: %s showTransferEntry: %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z17));
            if (!z19 && !z17) {
                jbVar.f280796e.U(15);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, grey is 2, but showTransferEntry and abtest is false");
            }
        } catch (java.lang.Exception e17) {
            jbVar.f280796e.U(17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.FootComponent", e17, "", new java.lang.Object[0]);
        }
    }
}
