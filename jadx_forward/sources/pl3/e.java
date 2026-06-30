package pl3;

/* loaded from: classes15.dex */
public class e implements kl3.h {

    /* renamed from: a, reason: collision with root package name */
    public final pl3.f f438236a = new pl3.f();

    /* renamed from: b, reason: collision with root package name */
    public final pl3.g f438237b = new pl3.g();

    /* renamed from: c, reason: collision with root package name */
    public final pl3.b f438238c = new pl3.b();

    /* renamed from: d, reason: collision with root package name */
    public b21.p f438239d = null;

    public final void A(b21.r rVar, long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fq5();
        lVar.f152198b = new r45.gq5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/reportmusic";
        lVar.f152200d = 2718;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.fq5 fq5Var = (r45.fq5) a17.f152243a.f152217a;
        r45.nr4 nr4Var = new r45.nr4();
        fq5Var.f456085d = nr4Var;
        b21.p pVar = this.f438239d;
        if (pVar != null) {
            nr4Var.f463149d = pVar.f98875a;
            fq5Var.f456086e = pVar.f98876b;
            this.f438239d = null;
        }
        nr4Var.f463150e = j18 + "";
        fq5Var.f456085d.f463151f = j17 + "";
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new pl3.d(this), false);
    }

    public void y(b21.r rVar, int i17, int i18) {
        int i19;
        boolean z17;
        boolean z18;
        int i27;
        int i28;
        int i29;
        int i37;
        pl3.b bVar = this.f438238c;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        c4582x424c344.m40331x936762bd(3);
        c4582x424c344.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        int i38 = rVar.f98878d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerErrIdKeyByMusicType, musicType:" + i38);
        if (i38 == 0) {
            i19 = 60;
        } else if (i38 != 1) {
            switch (i38) {
                case 4:
                    i19 = 62;
                    break;
                case 5:
                    i19 = 63;
                    break;
                case 6:
                    i19 = 64;
                    break;
                case 7:
                    i19 = 5;
                    break;
                case 8:
                    i19 = 65;
                    break;
                case 9:
                    i19 = 66;
                    break;
                default:
                    i19 = 6;
                    break;
            }
        } else {
            i19 = 61;
        }
        c4582x424c3442.m40331x936762bd(i19);
        c4582x424c3442.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3443.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        if (i17 == -1) {
            c4582x424c3443.m40331x936762bd(12);
        } else if (i17 == 6) {
            c4582x424c3443.m40331x936762bd(46);
        } else if (i17 == -2) {
            c4582x424c3443.m40331x936762bd(13);
        } else if (i17 == 5) {
            c4582x424c3443.m40331x936762bd(16);
        } else if (i17 == 4) {
            c4582x424c3443.m40331x936762bd(14);
        } else if (i17 == 20) {
            c4582x424c3443.m40331x936762bd(11);
        } else if (i17 == 21) {
            c4582x424c3443.m40331x936762bd(47);
        } else if (i17 == 19) {
            c4582x424c3443.m40331x936762bd(190);
        }
        c4582x424c3443.m40332x57b2b64f(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3444.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
        c4582x424c3444.m40332x57b2b64f(1L);
        if (i17 != 19 && (bVar.a() == null || !bVar.a().contains("text/html"))) {
            if (i17 == 21) {
                int i39 = rVar.f98878d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerPlayErrIdKeyByMusicType, musicType:" + i39);
                if (i39 == 0) {
                    i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de;
                } else if (i39 == 1) {
                    i37 = 160;
                } else if (i39 != 4) {
                    switch (i39) {
                        case 6:
                            i37 = 162;
                            break;
                        case 7:
                            i37 = 163;
                            break;
                        case 8:
                            i37 = 164;
                            break;
                        case 9:
                            i37 = 165;
                            break;
                        default:
                            i37 = 188;
                            break;
                    }
                } else {
                    i37 = 161;
                }
                c4582x424c3444.m40331x936762bd(i37);
                arrayList.add(c4582x424c3444);
            } else if (i17 == -1 || i17 == 6 || i17 == -2 || i17 == 5 || i17 == 4) {
                int i47 = rVar.f98878d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerNetworkErrIdKeyByMusicType, musicType:" + i47);
                if (i47 == 0) {
                    i29 = 151;
                } else if (i47 == 1) {
                    i29 = 152;
                } else if (i47 != 4) {
                    switch (i47) {
                        case 6:
                            i29 = 154;
                            break;
                        case 7:
                            i29 = 155;
                            break;
                        case 8:
                            i29 = 156;
                            break;
                        case 9:
                            i29 = 157;
                            break;
                        default:
                            i29 = 188;
                            break;
                    }
                } else {
                    i29 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5;
                }
                c4582x424c3444.m40331x936762bd(i29);
                arrayList.add(c4582x424c3444);
            }
        }
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        arrayList.add(c4582x424c3443);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "hasStatForHttpErr:%b, hasStatForUrlErr:%b, hasStatForNetworkErr:%b, hasStatForHttpRangeErr:%b, hasStatDownloadExceptionErr:%b", java.lang.Boolean.valueOf(bVar.f438221a), java.lang.Boolean.valueOf(bVar.f438223c), java.lang.Boolean.valueOf(bVar.f438226f), java.lang.Boolean.valueOf(bVar.f438222b), java.lang.Boolean.valueOf(bVar.f438224d));
        if (i17 == -1 && !bVar.f438221a) {
            bVar.f438221a = true;
            jl3.d dVar = bVar.f438230j;
            int i48 = dVar != null ? dVar.f381752o : 0;
            if (i48 == 403) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3445.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                c4582x424c3445.m40332x57b2b64f(1L);
                c4582x424c3445.m40331x936762bd(pl3.a.b(700));
                arrayList.add(c4582x424c3445);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.j(arrayList, true, false);
            g0Var.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i48), 0);
        }
        if (i17 == 6 && !bVar.f438222b) {
            bVar.f438222b = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.j(arrayList, true, false);
            g0Var2.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 == -2 && !bVar.f438223c) {
            bVar.f438223c = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.j(arrayList, true, false);
            g0Var3.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 == 5 && !bVar.f438224d) {
            bVar.f438224d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var4.j(arrayList, true, false);
            jl3.d dVar2 = bVar.f438230j;
            g0Var4.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 1, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(dVar2 != null ? dVar2.f381753p : 0));
        }
        if (i17 == 19 && !bVar.f438225e) {
            bVar.f438225e = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var5.j(arrayList, true, false);
            g0Var5.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 == 4 && !bVar.f438226f) {
            bVar.f438226f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var6.j(arrayList, true, false);
            g0Var6.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 1, java.lang.Integer.valueOf(i17), 0, 0);
        }
        if (i17 != 20 || bVar.f438227g) {
            z17 = true;
        } else {
            z17 = true;
            bVar.f438227g = true;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(c4582x424c3443);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList2, true, false);
        }
        if (i17 == 21 && !bVar.f438228h && bVar.f438227g) {
            bVar.f438228h = z17;
            if (bVar.a() == null || !bVar.a().contains("text/html")) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3446.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                c4582x424c3446.m40332x57b2b64f(1L);
                c4582x424c3446.m40331x936762bd(pl3.a.b(i18));
                arrayList.add(c4582x424c3446);
                switch (i18) {
                    case 704:
                    case 705:
                    case 706:
                        z18 = true;
                        break;
                    default:
                        z18 = false;
                        break;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3447 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c3447.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                    c4582x424c3447.m40332x57b2b64f(1L);
                    int i49 = rVar.f98878d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerDecodeErrIdKeyByMusicType, musicType:" + i49);
                    if (i49 == 0) {
                        i28 = 194;
                    } else if (i49 == 1) {
                        i28 = 195;
                    } else if (i49 != 4) {
                        switch (i49) {
                            case 6:
                                i28 = 197;
                                break;
                            case 7:
                                i28 = nd1.d1.f72919x366c91de;
                                break;
                            case 8:
                                i28 = 199;
                                break;
                            case 9:
                                i28 = 200;
                                break;
                            default:
                                i28 = 188;
                                break;
                        }
                    } else {
                        i28 = 196;
                    }
                    c4582x424c3447.m40331x936762bd(i28);
                    arrayList.add(c4582x424c3447);
                }
                i27 = i18;
            } else {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3448 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3448.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                c4582x424c3448.m40332x57b2b64f(1L);
                i27 = 701;
                c4582x424c3448.m40331x936762bd(pl3.a.b(701));
                arrayList.add(c4582x424c3448);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var7.j(arrayList, true, false);
            g0Var7.d(14777, 0, java.lang.Integer.valueOf(rVar.f98878d), 0, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), 0);
        }
    }

    public void z() {
        pl3.b bVar = this.f438238c;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "initIdKeyStatDataForMusicPlayer");
        bVar.f438221a = false;
        bVar.f438222b = false;
        bVar.f438223c = false;
        bVar.f438224d = false;
        bVar.f438225e = false;
        bVar.f438226f = false;
        bVar.f438227g = false;
        bVar.f438228h = false;
        bVar.f438229i = false;
    }
}
