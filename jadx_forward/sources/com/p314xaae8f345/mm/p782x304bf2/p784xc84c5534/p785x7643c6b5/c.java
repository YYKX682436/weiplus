package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static long f149741b;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f149743d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.c f149740a = new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f149742c = new java.util.LinkedList();

    public final synchronized void a(android.os.Bundle bundle) {
        if (bundle != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                mj0.a aVar = new mj0.a();
                if (bundle.getInt("cmd", 0) == 1) {
                    if (f149741b == 0) {
                        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_UNREAD_MSG_SEQ_LONG_SYNC, 1000L);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
                        f149741b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) m17);
                    }
                    mj0.g gVar = new mj0.g();
                    long j17 = f149741b + 1;
                    f149741b = j17;
                    gVar.f408532e = j17;
                    gVar.f408531d = wo.w0.p();
                    gVar.f408533f = bundle.getBoolean("has_unread_msg", false);
                    aVar.f408517d = gVar;
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.c cVar = f149740a;
                    synchronized (cVar) {
                        if (gm0.j1.b().m() && !gm0.m.r()) {
                            f149742c.add(aVar);
                            cVar.b();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameChatReport", "report, account not ready");
                    }
                }
            } else {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.a.class, null);
            }
        }
    }

    public final synchronized void b() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        if (f149743d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChatReport", "tryDoScene isBusy");
            return;
        }
        java.util.LinkedList linkedList = f149742c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChatReport", "waitingList is null");
            return;
        }
        mj0.a aVar = (mj0.a) linkedList.remove(0);
        if (aVar != null) {
            f149743d = true;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/chatreport";
            lVar.f152200d = 4352;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            lVar.f152197a = aVar;
            lVar.f152198b = new mj0.b();
            oVar = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.z2.d(oVar, new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.p785x7643c6b5.b(aVar), false);
        } else {
            oVar = null;
        }
        if (oVar == null) {
            b();
        }
    }
}
