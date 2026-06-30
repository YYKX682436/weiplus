package pl3;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f438231a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f438232b;

    /* renamed from: c, reason: collision with root package name */
    public static int f438233c;

    /* renamed from: d, reason: collision with root package name */
    public static long f438234d;

    /* renamed from: e, reason: collision with root package name */
    public static ql3.a f438235e;

    public static void a(b21.r rVar, boolean z17) {
        int i17;
        int i18;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicReportUtil", "idKeyReportMusicPlayerSum music is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        c4582x424c344.m40331x936762bd(0);
        c4582x424c344.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        c4582x424c3442.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3443.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        c4582x424c3443.m40332x57b2b64f(1L);
        if (z17) {
            c4582x424c3443.m40331x936762bd(10);
        } else {
            if (xl3.d.a(rVar)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14174, 2, java.lang.Integer.valueOf(rVar.f98878d));
                return;
            }
            if (xl3.d.b(rVar.f98878d)) {
                c4582x424c3443.m40331x936762bd(2);
                int i19 = rVar.f98878d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerSumidKeyByMusicType, musicType:" + i19);
                if (i19 == 0) {
                    i18 = 117;
                } else if (i19 != 1) {
                    switch (i19) {
                        case 4:
                            i18 = 119;
                            break;
                        case 5:
                            i18 = 120;
                            break;
                        case 6:
                            i18 = 121;
                            break;
                        case 7:
                            i18 = 122;
                            break;
                        case 8:
                            i18 = 123;
                            break;
                        case 9:
                            i18 = 124;
                            break;
                        case 10:
                            i18 = 125;
                            break;
                        case 11:
                            i18 = 126;
                            break;
                        default:
                            i18 = 127;
                            break;
                    }
                } else {
                    i18 = 118;
                }
                c4582x424c3442.m40331x936762bd(i18);
                arrayList.add(c4582x424c3442);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14174, 1, java.lang.Integer.valueOf(rVar.f98878d));
                if (ml3.d.a(rVar.Q)) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3444.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                    c4582x424c3444.m40331x936762bd(216);
                    c4582x424c3444.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3444);
                }
            } else {
                c4582x424c3443.m40331x936762bd(1);
                int i27 = rVar.f98878d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerSumidKeyByMusicType, musicType:" + i27);
                if (i27 == 0) {
                    i17 = 105;
                } else if (i27 != 1) {
                    switch (i27) {
                        case 4:
                            i17 = 107;
                            break;
                        case 5:
                            i17 = 108;
                            break;
                        case 6:
                            i17 = 109;
                            break;
                        case 7:
                            i17 = 110;
                            break;
                        case 8:
                            i17 = 111;
                            break;
                        case 9:
                            i17 = 112;
                            break;
                        default:
                            i17 = 113;
                            break;
                    }
                } else {
                    i17 = 106;
                }
                c4582x424c3442.m40331x936762bd(i17);
                arrayList.add(c4582x424c3442);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14174, 0, java.lang.Integer.valueOf(rVar.f98878d));
                if (ml3.d.a(rVar.Q)) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3445.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                    c4582x424c3445.m40331x936762bd(215);
                    c4582x424c3445.m40332x57b2b64f(1L);
                    arrayList.add(c4582x424c3445);
                }
            }
        }
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3443);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
    }

    public static final void b(int i17, int i18) {
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13232, z17.f66983xc8c6afdb, z17.f67001x79435ae5, z17.f66989xae75a955, java.lang.Integer.valueOf(z17.f66996x10603bf5), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), z17.f67002x3ed1b556, z17.f66974x28d45f97);
        }
    }

    public static void c(int i17, ql3.a aVar) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat music is null, err");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicReportUtil", "kvReportMusicNotificationStat scene:%d, action:%d, src:%s, title:%s, singer:%s", java.lang.Integer.valueOf(aVar.f66984xb1df81fa), java.lang.Integer.valueOf(i17), aVar.f67008x6e8dd380, aVar.f67001x79435ae5, aVar.f67002x3ed1b556);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15106, java.lang.Integer.valueOf(aVar.f66984xb1df81fa), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), aVar.f67008x6e8dd380, aVar.f67001x79435ae5, aVar.f67002x3ed1b556);
        }
    }

    public static final synchronized void d() {
        synchronized (pl3.c.class) {
            if (f438235e != null) {
                if (f438234d > 0) {
                    f438233c = (int) (f438233c + ((java.lang.System.currentTimeMillis() - f438234d) / 1000));
                    f438234d = 0L;
                }
                ql3.a aVar = f438235e;
                java.lang.String str = aVar.f66983xc8c6afdb;
                java.lang.String str2 = aVar.f67002x3ed1b556;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[11];
                ql3.a aVar2 = f438235e;
                objArr[0] = aVar2.f66983xc8c6afdb;
                int i17 = 1;
                objArr[1] = aVar2.f67001x79435ae5;
                objArr[2] = aVar2.f66989xae75a955;
                objArr[3] = java.lang.Integer.valueOf(aVar2.f66996x10603bf5);
                objArr[4] = 0;
                objArr[5] = java.lang.Integer.valueOf(f438233c);
                objArr[6] = java.lang.Integer.valueOf(f438231a ? 1 : 2);
                if (!f438232b) {
                    i17 = 2;
                }
                objArr[7] = java.lang.Integer.valueOf(i17);
                objArr[8] = 0;
                ql3.a aVar3 = f438235e;
                objArr[9] = aVar3.f67002x3ed1b556;
                objArr[10] = aVar3.f66974x28d45f97;
                g0Var.d(13044, objArr);
            }
            f438235e = null;
            f438231a = false;
            f438232b = false;
            f438233c = 0;
            f438234d = 0L;
        }
    }

    public static final void e(int i17) {
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicReportUtil", "ReportMusicPlayerShareStat ShareType:%d, MusicId:%s, MusicTitle:%s, Singer:%s, AppId:%s", java.lang.Integer.valueOf(i17), z17.f66983xc8c6afdb, z17.f67001x79435ae5, z17.f67002x3ed1b556, z17.f66974x28d45f97);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12836, java.lang.Integer.valueOf(i17), z17.f66983xc8c6afdb, z17.f67001x79435ae5, z17.f67002x3ed1b556, z17.f66974x28d45f97);
        }
    }

    public static final void f(int i17, int i18, int i19) {
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13042, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), z17.f66983xc8c6afdb, z17.f67001x79435ae5, z17.f66989xae75a955, java.lang.Integer.valueOf(z17.f66996x10603bf5), java.lang.Integer.valueOf(i19), z17.f67002x3ed1b556, z17.f66974x28d45f97);
        }
    }

    public static final void g(int i17) {
        b21.r b17;
        if (i17 != 2 || (b17 = b21.m.b()) == null) {
            return;
        }
        z30.y yVar = (z30.y) i95.n0.c(z30.y.class);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(b17.E, 0L);
        ((y30.w) yVar).getClass();
        o72.v2.d(V, 1, 0);
    }

    public static final void h(int i17) {
        b21.r b17;
        if (i17 != 2 || (b17 = b21.m.b()) == null) {
            return;
        }
        z30.y yVar = (z30.y) i95.n0.c(z30.y.class);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(b17.E, 0L);
        ((y30.w) yVar).getClass();
        o72.v2.d(V, 0, 0);
    }
}
