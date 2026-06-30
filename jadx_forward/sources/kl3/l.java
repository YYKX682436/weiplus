package kl3;

/* loaded from: classes16.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        b21.r rVar;
        b21.o a17;
        b21.r rVar2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf) abstractC20979x809547d1;
        ((gm0.c) ((c01.w7) i95.n0.c(c01.w7.class))).getClass();
        if (gm0.j1.a()) {
            if (kl3.t.f390376g != null) {
                am.gk gkVar = c5720xee9b9abf.f136042g;
                int i17 = gkVar.f88303a;
                if (i17 == 13) {
                    kl3.h hVar = (kl3.h) sl3.b.b(kl3.h.class);
                    if (hVar != null) {
                        b21.p pVar = gkVar.f88310h;
                        pl3.e eVar = (pl3.e) hVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatReportService", "reportMusicPlayerTime");
                        if (pVar != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatReportService", "MusicReportInfo h5CurrentMusicIDOfReport:%s, h5ReportListIDOfReport:%s", pVar.f98875a, pVar.f98876b);
                        }
                        b21.r j17 = kl3.t.g().j();
                        if (kl3.t.g().a().i() && j17 != null && j17.f98878d == 10) {
                            eVar.f438239d = pVar;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatReportService", "H5 music is playing, not report first");
                        } else {
                            eVar.f438239d = pVar;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatReportService", "report music info");
                            eVar.A(null, 0L, 0L, 0L);
                        }
                    }
                } else if (i17 != 16) {
                    am.hk hkVar = c5720xee9b9abf.f136043h;
                    switch (i17) {
                        case -3:
                            hkVar.f88371b = kl3.t.g().a().i();
                            break;
                        case -2:
                            hkVar.f88370a = kl3.t.g().j();
                            break;
                        case -1:
                            kl3.t.g().o();
                            break;
                        case 0:
                            kl3.t.g().n(gkVar.f88304b);
                            break;
                        case 1:
                            kl3.t.g().a().d();
                            break;
                        case 2:
                            kl3.t.g().a().mo67221xc84dc82d();
                            break;
                        case 3:
                            kl3.t.g().f390377e.u(gkVar.f88304b);
                            break;
                        case 4:
                            kl3.t g17 = kl3.t.g();
                            java.util.List list = gkVar.f88305c;
                            int i18 = gkVar.f88306d;
                            g17.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusicList");
                            b21.r j18 = g17.j();
                            b21.r q17 = g17.f390377e.q(list, i18);
                            if (j18 != null && q17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(j18.f98879e, q17.f98879e) && (a17 = b21.m.a()) != null && com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27.equals(a17.f98874e)) {
                                g17.f390372a.i();
                                rl3.t tVar = g17.f390373b;
                                if (tVar.i() && (rVar2 = tVar.f478810k) != null && rVar2.a(q17)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "updateCurrentMusicWrapper src:%s", tVar.f478816q);
                                    double d17 = q17.K;
                                    if (d17 > 0.0d && d17 != tVar.f478810k.K) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "setPlaybackRate playbackRate:%f", java.lang.Double.valueOf(d17));
                                        tVar.B((float) q17.K);
                                        tVar.f478810k.K = q17.K;
                                    }
                                    float f17 = q17.L;
                                    if (f17 >= 0.0f && f17 != tVar.f478810k.L) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "setVolume volume:%f", java.lang.Float.valueOf(f17));
                                        float f18 = q17.L;
                                        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = tVar.f478811l;
                                        if (c25323xb43a8cc != null && f18 >= 0.0f) {
                                            c25323xb43a8cc.mo93664x27f73e1c(f18, f18);
                                        }
                                        tVar.f478810k.L = q17.L;
                                    }
                                }
                                g17.f390374c.i();
                                g17.f390377e.i(q17);
                                break;
                            } else {
                                g17.h(q17);
                                break;
                            }
                            break;
                        case 5:
                            kl3.t.g().f390377e.t(gkVar.f88305c, gkVar.f88307e);
                            break;
                        case 6:
                            kl3.t g18 = kl3.t.g();
                            b21.r rVar3 = gkVar.f88304b;
                            g18.getClass();
                            if (rVar3 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerManager", "startMusicInList");
                                g18.h(g18.f390377e.d(rVar3));
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerManager", "musicWrapper is null");
                                break;
                            }
                        case 7:
                            hkVar.f88371b = kl3.t.g().a().c(gkVar.f88308f);
                            break;
                        case 8:
                            hkVar.f88373d = kl3.t.g().a().f();
                            break;
                        case 9:
                            hkVar.f88371b = kl3.t.g().a().g();
                            break;
                        case 10:
                            hkVar.f88371b = kl3.t.g().a().h();
                            break;
                        case 11:
                            kl3.t.g().p(600000);
                            break;
                    }
                } else {
                    kl3.t g19 = kl3.t.g();
                    b21.r rVar4 = gkVar.f88304b;
                    g19.f390372a.i();
                    rl3.t tVar2 = g19.f390373b;
                    if (tVar2.i() && (rVar = tVar2.f478810k) != null && rVar.a(rVar4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "updateCurrentMusicWrapper src:%s", tVar2.f478816q);
                        double d18 = rVar4.K;
                        if (d18 > 0.0d && d18 != tVar2.f478810k.K) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "setPlaybackRate playbackRate:%f", java.lang.Double.valueOf(d18));
                            tVar2.B((float) rVar4.K);
                            tVar2.f478810k.K = rVar4.K;
                        }
                        float f19 = rVar4.L;
                        if (f19 >= 0.0f && f19 != tVar2.f478810k.L) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "setVolume volume:%f", java.lang.Float.valueOf(f19));
                            float f27 = rVar4.L;
                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc2 = tVar2.f478811l;
                            if (c25323xb43a8cc2 != null && f27 >= 0.0f) {
                                c25323xb43a8cc2.mo93664x27f73e1c(f27, f27);
                            }
                            tVar2.f478810k.L = rVar4.L;
                        }
                    }
                    g19.f390374c.i();
                    g19.f390377e.i(rVar4);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicActionListener", "don't anything, must init MusicPlayerManager first with MusicLogic before!");
            }
        }
        return false;
    }
}
