package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj0.a f149739d;

    public b(mj0.a aVar) {
        this.f149739d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        mj0.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChatReport", "tryDoScene, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0 && (gVar = this.f149739d.f408517d) != null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_UNREAD_MSG_SEQ_LONG_SYNC, java.lang.Long.valueOf(gVar.f408532e));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_UNREAD_MSG_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(gVar.f408533f));
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.c.f149743d = false;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.c.f149740a.b();
        return 0;
    }
}
