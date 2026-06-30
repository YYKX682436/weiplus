package com.tencent.mm.game.report.service;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static long f68208b;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f68210d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.game.report.service.c f68207a = new com.tencent.mm.game.report.service.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f68209c = new java.util.LinkedList();

    public final synchronized void a(android.os.Bundle bundle) {
        if (bundle != null) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                mj0.a aVar = new mj0.a();
                if (bundle.getInt("cmd", 0) == 1) {
                    if (f68208b == 0) {
                        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_UNREAD_MSG_SEQ_LONG_SYNC, 1000L);
                        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
                        f68208b = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) m17);
                    }
                    mj0.g gVar = new mj0.g();
                    long j17 = f68208b + 1;
                    f68208b = j17;
                    gVar.f326999e = j17;
                    gVar.f326998d = wo.w0.p();
                    gVar.f327000f = bundle.getBoolean("has_unread_msg", false);
                    aVar.f326984d = gVar;
                    com.tencent.mm.game.report.service.c cVar = f68207a;
                    synchronized (cVar) {
                        if (gm0.j1.b().m() && !gm0.m.r()) {
                            f68209c.add(aVar);
                            cVar.b();
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.GameChatReport", "report, account not ready");
                    }
                }
            } else {
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.game.report.service.a.class, null);
            }
        }
    }

    public final synchronized void b() {
        com.tencent.mm.modelbase.o oVar;
        if (f68210d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameChatReport", "tryDoScene isBusy");
            return;
        }
        java.util.LinkedList linkedList = f68209c;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameChatReport", "waitingList is null");
            return;
        }
        mj0.a aVar = (mj0.a) linkedList.remove(0);
        if (aVar != null) {
            f68210d = true;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/chatreport";
            lVar.f70667d = 4352;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            lVar.f70664a = aVar;
            lVar.f70665b = new mj0.b();
            oVar = lVar.a();
            com.tencent.mm.modelbase.z2.d(oVar, new com.tencent.mm.game.report.service.b(aVar), false);
        } else {
            oVar = null;
        }
        if (oVar == null) {
            b();
        }
    }
}
