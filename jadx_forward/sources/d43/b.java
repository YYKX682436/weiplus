package d43;

/* loaded from: classes4.dex */
public final class b implements u33.e {

    /* renamed from: d, reason: collision with root package name */
    public static final d43.b f307944d;

    /* renamed from: e, reason: collision with root package name */
    public static final b43.d f307945e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15788x7bba8bca f307946f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f307947g;

    /* renamed from: h, reason: collision with root package name */
    public static long f307948h;

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 f307949i;

    static {
        d43.b bVar = new d43.b();
        f307944d = bVar;
        f307945e = new b43.d(s33.i.KEEP_ALIVE_TYPE_GET_MY_CHAT_ROOM, bVar);
    }

    public final void a(java.lang.String str) {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) m17);
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.b() != null && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.b().f405596d) || ((r17 > 0L ? 1 : (r17 == 0L ? 0 : -1)) != 0 && (java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r17)) > 172800L ? 1 : (java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(r17)) == 172800L ? 0 : -1)) < 0)) {
            b43.d dVar = f307945e;
            dVar.f99335d = this;
            synchronized (dVar) {
                try {
                    dVar.f99341m = str == null ? "" : str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "startKeepAlive, topChatRoomName:%s", str);
                    if (dVar.f99338g) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("GameChatRoom.GetMyChatRoomKeepAliveService", "service exist", new java.lang.Object[0]);
                    } else {
                        dVar.f99338g = true;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("GameChatRoom.GetMyChatRoomKeepAliveService", "startKeepAlive success", new java.lang.Object[0]);
                        gm0.j1.d().a(4989, dVar);
                        dVar.a(null, dVar.f99341m, "");
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
        }
    }

    public final void b() {
        b43.d dVar = f307945e;
        synchronized (dVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "stopKeepAlive");
            dVar.f99335d = null;
            dVar.f99338g = false;
            dVar.f99339h = false;
            dVar.f99340i = false;
            dVar.f99341m = "";
            dVar.f99342n = "";
            dVar.f99343o = 2;
            ((java.util.LinkedList) dVar.f99344p).clear();
            gm0.j1.d().q(4989, dVar);
            if (dVar.f99337f != null) {
                gm0.j1.d().d(dVar.f99337f);
            }
        }
        f307946f = null;
        f307949i = null;
        f307947g = false;
    }

    @Override // u33.e
    public void w3(s33.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15788x7bba8bca c15788x7bba8bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15788x7bba8bca) fVar;
        if ((iVar == null ? -1 : d43.a.f307943a[iVar.ordinal()]) != 1 || c15788x7bba8bca == null) {
            return;
        }
        f307946f = c15788x7bba8bca;
        if (f307949i == null) {
            f307949i = c15788x7bba8bca.f36758x75467d1;
        }
        f307947g = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15788x7bba8bca.f36757xcf9821f6)) {
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d> it = c15788x7bba8bca.f36757xcf9821f6.iterator();
            while (it.hasNext()) {
                if (it.next().f36789xd8fdd641 > 0) {
                    f307947g = true;
                    f307948h = java.lang.System.currentTimeMillis();
                }
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062 c5593x207a1062 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5593x207a1062();
        c5593x207a1062.f135917g.f88779a = c15788x7bba8bca.mo14344x5f01b1f6();
        c5593x207a1062.e();
    }
}
