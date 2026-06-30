package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.m0 f291231a = new com.p314xaae8f345.mm.ui.p2731xc84c5534.m0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f291232b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f291233c = new java.util.HashSet();

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.l4 con, int i17) {
        no0.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(con, "con");
        java.lang.String j17 = con.j();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ot0.q v17 = ot0.q.v(j17);
        if (v17 != null && v17.f430199i == 60 && con.Q0() == 0 && (oVar = (no0.o) v17.y(no0.o.class)) != null) {
            long parseLong = java.lang.Long.parseLong(oVar.f420264b);
            java.lang.String h17 = con.h1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
            f291233c.add(java.lang.Long.valueOf(parseLong));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6637x652e1c84 c6637x652e1c84 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6637x652e1c84();
            c6637x652e1c84.f139905d = c6637x652e1c84.b("ChatName", h17, true);
            c6637x652e1c84.f139908g = java.lang.System.currentTimeMillis();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_list_show_live, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatListShowFlashingSwitch: " + fj6);
            c6637x652e1c84.f139906e = fj6 ? 3L : 2L;
            c6637x652e1c84.f139907f = 1L;
            c6637x652e1c84.f139909h = c6637x652e1c84.b("LiveIDList", java.lang.String.valueOf(parseLong), true);
            c6637x652e1c84.f139910i = i17;
            c6637x652e1c84.k();
        }
    }

    public final void b(java.lang.String chatName, long j17, java.lang.String actionToLiveId, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatName, "chatName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionToLiveId, "actionToLiveId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6639x3a144c86 c6639x3a144c86 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6639x3a144c86();
        c6639x3a144c86.f139916d = c6639x3a144c86.b("ChatName", chatName, true);
        c6639x3a144c86.f139917e = j17;
        c6639x3a144c86.f139918f = c6639x3a144c86.b("ActionToLiveId", actionToLiveId, true);
        c6639x3a144c86.f139919g = j18;
        c6639x3a144c86.f139920h = j19;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj6);
        c6639x3a144c86.f139921i = fj6 ? 1 : 2;
        c6639x3a144c86.k();
    }
}
