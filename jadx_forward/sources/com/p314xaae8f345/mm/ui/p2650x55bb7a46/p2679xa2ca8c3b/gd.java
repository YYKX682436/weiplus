package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class gd implements cn0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285565a;

    public gd(yb5.d dVar) {
        this.f285565a = dVar;
    }

    @Override // cn0.a
    public void a(long j17, int i17) {
        if (j17 == j17 && i17 == 0) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.m0 m0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291231a;
            java.lang.String x17 = this.f285565a.x();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6638x4349a8d9 c6638x4349a8d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6638x4349a8d9();
            c6638x4349a8d9.f139911d = c6638x4349a8d9.b("ChatName", x17, true);
            c6638x4349a8d9.f139913f = 2L;
            c6638x4349a8d9.f139914g = java.lang.System.currentTimeMillis();
            c6638x4349a8d9.f139915h = c6638x4349a8d9.b("LiveIDList", java.lang.String.valueOf(j17), true);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_card_flashing, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomCardFlashingSwitch: " + fj6);
            c6638x4349a8d9.f139912e = fj6 ? 1L : 2L;
            c6638x4349a8d9.k();
        }
    }
}
