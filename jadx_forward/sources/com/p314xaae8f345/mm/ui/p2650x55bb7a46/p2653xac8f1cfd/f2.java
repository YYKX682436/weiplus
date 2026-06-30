package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280539d;

    public f2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, java.lang.String str) {
        this.f280539d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForGetRoomInfo conversation size:%s", java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f280539d, str) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str)) != null) {
                if ((((long) z07.f69084x8729abea) & 2097152) == 2097152 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f69081x1856cb8d)) {
                    ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).m(str).b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForGetRoomInfo %s", str);
                }
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OPEN_IM_MIGRATE_CHECK_ALL_CONVERSATION_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
    }
}
