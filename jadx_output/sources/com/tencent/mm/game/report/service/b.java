package com.tencent.mm.game.report.service;

/* loaded from: classes8.dex */
public final class b implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj0.a f68206d;

    public b(mj0.a aVar) {
        this.f68206d = aVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        mj0.g gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameChatReport", "tryDoScene, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 0 && i18 == 0 && (gVar = this.f68206d.f326984d) != null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_UNREAD_MSG_SEQ_LONG_SYNC, java.lang.Long.valueOf(gVar.f326999e));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_UNREAD_MSG_STATE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(gVar.f327000f));
        }
        com.tencent.mm.game.report.service.c.f68210d = false;
        com.tencent.mm.game.report.service.c.f68207a.b();
        return 0;
    }
}
