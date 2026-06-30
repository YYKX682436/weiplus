package kl3;

/* loaded from: classes15.dex */
public abstract class q implements kl3.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f390375d = new kl3.p(this);

    /* renamed from: a, reason: collision with root package name */
    public final rl3.p f390372a = new rl3.p();

    /* renamed from: b, reason: collision with root package name */
    public final rl3.t f390373b = new rl3.t();

    /* renamed from: c, reason: collision with root package name */
    public final rl3.u f390374c = new rl3.u();

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a();

    public void b(b21.r rVar) {
        if (xl3.d.a(rVar)) {
            rl3.u uVar = this.f390374c;
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            uVar.m(rVar, -1);
            return;
        }
        if (rVar == null || !xl3.d.b(rVar.f98878d)) {
            rl3.p pVar = this.f390372a;
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            pVar.m(rVar, -1);
            return;
        }
        rl3.t tVar = this.f390373b;
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
        tVar.m(rVar, -1);
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "sendPreemptedEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 10;
        jkVar.f88573f = "preempted";
        jkVar.f88577j = "not from app brand appid";
        jkVar.f88574g = true;
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
    }

    public void d(final b21.r rVar) {
        if (xl3.d.a(rVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "use musicPlayer");
            e();
            final rl3.u uVar = this.f390374c;
            uVar.v();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "init and start download");
            uVar.mo67222x66343656();
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "music is null");
            } else {
                if (uVar.f478762d != null) {
                    pl3.c.a(rVar, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "initIdKeyStatData");
                    ((pl3.e) uVar.f478762d).z();
                }
                uVar.f478828m = rVar;
                if (uVar.f478827l == null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                    uVar.f478827l = c26520x2c78c47d;
                    c26520x2c78c47d.mo100945x683d6267(rVar.Q);
                    uVar.f478827l.mo100954x6954c27b(new com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener() { // from class: rl3.u$$a
                        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
                        /* renamed from: onError */
                        public final void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            if (kl3.t.g().j() == null) {
                                return;
                            }
                            uVar2.mo67222x66343656();
                            uVar2.r(uVar2.f478828m);
                            kl3.h hVar = uVar2.f478762d;
                            if (hVar != null) {
                                ((pl3.e) hVar).y(uVar2.f478828m, i17, i18);
                            }
                        }
                    });
                    uVar.f478827l.mo100951xa4560c71(new com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener() { // from class: rl3.u$$b
                        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
                        /* renamed from: onCompletion */
                        public final void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "setEvents, onComplete");
                            if (kl3.t.g().j() == null) {
                                return;
                            }
                            uVar2.l(uVar2.f478828m);
                        }
                    });
                    uVar.f478827l.mo100959x6aa275e6(new com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener() { // from class: rl3.u$$c
                        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener
                        /* renamed from: onStopAsyncComplete */
                        public final void mo83876x5a35e2d4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "setEvents, onStop");
                            b21.r j17 = kl3.t.g().j();
                            if (j17 == null) {
                                return;
                            }
                            if (j17.a(rVar)) {
                                uVar2.mo67222x66343656();
                            }
                            uVar2.r(uVar2.f478828m);
                        }
                    });
                    uVar.f478827l.mo100957x5dd7c812(new com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener() { // from class: rl3.u$$d
                        @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
                        /* renamed from: onPrepared */
                        public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "setEvents, onStart");
                            b21.r j17 = kl3.t.g().j();
                            if (j17 == null) {
                                return;
                            }
                            if (!uVar2.t(uVar2.f478828m) || uVar2.s()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "startPlay");
                                try {
                                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d2 = uVar2.f478827l;
                                    if (c26520x2c78c47d2 != null) {
                                        c26520x2c78c47d2.mo100975x68ac462();
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "startPlay", new java.lang.Object[0]);
                                }
                                uVar2.f478829n = true;
                                uVar2.f478830o = false;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.TPMusicPlayer", "request focus error");
                            }
                            uVar2.q(j17);
                            kl3.h hVar = uVar2.f478762d;
                            if (hVar != null) {
                                b21.r rVar2 = uVar2.f478828m;
                                ((pl3.e) hVar).f438237b.getClass();
                                java.lang.String c17 = gl3.h.c(rVar2.Q);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TpMusicPlayerReportImpl", "mineTypeStr:%s", c17);
                                if (android.text.TextUtils.isEmpty(c17)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.TpMusicPlayerReportImpl", "music is null or mineTypeStr is empty");
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14486, 2, java.lang.Integer.valueOf(rVar2.f98878d), java.lang.Integer.valueOf(pl3.a.a(c17)), c17);
                                }
                            }
                        }
                    });
                    uVar.f478827l.mo100955x40f8c003(new rl3.v(uVar));
                    try {
                        uVar.f478827l.mo100932x857611b5();
                    } catch (java.io.IOException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.TPMusicPlayer", "mediaPlayer prepareAsync error");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "startPlay src:%s,  playUrl:%s", rVar.f98885n, rVar.Q);
                uVar.k();
            }
        } else if (xl3.d.b(rVar.f98878d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "use qqMusicPlayer");
            e();
            if (!rVar.M && ((kl3.t) this).f390377e.x(rVar.f98878d)) {
                rVar.M = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "support useNetworkDataPlay, MusicType:%d", java.lang.Integer.valueOf(rVar.f98878d));
            }
            rl3.t tVar = this.f390373b;
            tVar.z();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = currentTimeMillis - tVar.f478820u;
            b21.r rVar2 = tVar.f478810k;
            if (rVar2 == null || !rVar2.a(rVar) || j17 > 20) {
                tVar.f478764f = 0L;
                tVar.f478765g = android.os.SystemClock.elapsedRealtime();
                tVar.f478766h = 0L;
                if (tVar.f478762d != null) {
                    pl3.c.a(rVar, false);
                }
                tVar.f478820u = currentTimeMillis;
                tVar.f478810k = rVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "startPlay, currentTime:%d, startTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(rVar.D));
                if (tVar.f478811l != null && tVar.i()) {
                    tVar.f478811l.mo93667x360802();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.a();
                tVar.f478818s = 0;
                tVar.f478819t = rVar.D;
                java.net.URL url = null;
                tVar.f478821v = null;
                tVar.f478822w = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "initPlayer");
                b21.r rVar3 = tVar.f478810k;
                java.lang.String str = rVar3.Q;
                tVar.f478816q = str;
                java.lang.String str2 = rVar3.f98890s;
                tVar.f478817r = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "mSrc:%s mSongLocalPath:%s", str, str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "field_songWifiUrl:%s", tVar.f478810k.f98885n);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f478816q) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f478817r)) {
                    gl3.h.f(tVar.f478816q);
                    java.lang.String str3 = tVar.f478816q;
                    if (str3 != null) {
                        gl3.h.f354366c.put(str3, 0);
                    }
                    gl3.h.e(tVar.f478816q, 0);
                    b21.r rVar4 = tVar.f478810k;
                    java.lang.String str4 = rVar4.Q;
                    boolean z17 = rVar4.M;
                    if (!android.text.TextUtils.isEmpty(str4)) {
                        gl3.h.f354370g.put(str4, java.lang.Boolean.valueOf(z17));
                    }
                }
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f478817r);
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a = tVar.f478825z;
                if (K0) {
                    try {
                        url = new java.net.URL(tVar.f478816q);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e17, "initPlayer", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "new URL exception:" + e17.getMessage());
                    }
                    if (url == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "initPlayer url is null");
                        tVar.m(tVar.f478810k, 500);
                        tVar.y(tVar.f478810k, 500);
                        tVar.k();
                    } else {
                        if (tVar.f478811l == null) {
                            tVar.f478811l = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc(interfaceC25343x8e10fe3a);
                        }
                        tVar.f478811l.mo93650x6761d4f();
                        if (tVar.f478815p == null) {
                            tVar.f478815p = new vl3.b();
                        }
                        b21.r rVar5 = tVar.f478810k;
                        java.lang.String str5 = rVar5 == null ? "invalidReferrer" : rVar5.S;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "initPlayer, referrer: " + str5);
                        tVar.f478815p.a(tVar.f478816q, str5);
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "QQMusicPlayer temp cache dir:%s", tVar.f478823x);
                            if (!android.text.TextUtils.isEmpty(tVar.f478823x)) {
                                tVar.f478811l.m93661x807b9af4(tVar.f478823x);
                            }
                            tVar.f478811l.mo93656x683d6267(tVar.f478815p, android.net.Uri.parse(url.toString()));
                            tVar.f478811l.mo93646xed060d07();
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + e18.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e18, "initPlayer", new java.lang.Object[0]);
                            tVar.m(tVar.f478810k, 501);
                            tVar.y(tVar.f478810k, 501);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "play with local file, filePath:%s", tVar.f478817r);
                    if (tVar.f478811l == null) {
                        tVar.f478811l = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc(interfaceC25343x8e10fe3a);
                    }
                    tVar.f478811l.mo93650x6761d4f();
                    if (tVar.f478817r.startsWith("file://")) {
                        tVar.f478817r = tVar.f478817r.substring(7);
                    }
                    try {
                        tVar.f478811l.mo93659x683d6267(tVar.f478817r);
                        tVar.f478811l.mo93646xed060d07();
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + e19.getMessage());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e19, "initPlayer", new java.lang.Object[0]);
                        tVar.m(tVar.f478810k, 501);
                        tVar.y(tVar.f478810k, 501);
                    }
                }
                tVar.B((float) tVar.f478810k.K);
                float f17 = tVar.f478810k.L;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = tVar.f478811l;
                if (c25323xb43a8cc != null && f17 >= 0.0f) {
                    c25323xb43a8cc.mo93664x27f73e1c(f17, f17);
                }
                tVar.k();
            } else {
                tVar.f478810k = rVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", tVar.f478816q, java.lang.Long.valueOf(j17));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "use musicPlayer");
            e();
            rl3.p pVar = this.f390372a;
            pVar.z();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "init and start download");
            pVar.mo67222x66343656();
            jl3.d dVar = new jl3.d(rVar, gl3.e.b(rVar.f98879e));
            pVar.f478800m = dVar;
            dVar.f381754q = pVar.f478804q;
            if (pVar.f478762d != null) {
                pl3.c.a(rVar, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "initIdKeyStatData");
                ((pl3.e) pVar.f478762d).z();
                ((pl3.e) pVar.f478762d).f438238c.f438230j = pVar.f478800m;
            }
            pVar.f478798k = rVar;
            pVar.y(rVar, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "startPlay src:%s,  playUrl:%s", rVar.f98885n, rVar.Q);
            jl3.d dVar2 = pVar.f478800m;
            if (dVar2.f381750m) {
                dVar2.f381750m = false;
                s75.d.b(dVar2, "music_download_thread");
            }
            pVar.k();
        }
        if (rVar.f98878d != 11) {
            c();
        }
    }

    public void e() {
        rl3.p pVar = this.f390372a;
        if (pVar.i()) {
            pVar.mo67222x66343656();
        }
        rl3.t tVar = this.f390373b;
        if (tVar.i()) {
            tVar.mo67222x66343656();
        }
        rl3.u uVar = this.f390374c;
        if (uVar.i()) {
            uVar.mo67222x66343656();
        }
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k kVar) {
        ((rl3.b) a()).u(kVar);
        rl3.p pVar = this.f390372a;
        if (pVar.f478768j.size() > 0) {
            pVar.u(kVar);
        }
        rl3.t tVar = this.f390373b;
        if (tVar.f478768j.size() > 0) {
            tVar.u(kVar);
        }
        rl3.u uVar = this.f390374c;
        if (uVar.f478768j.size() > 0) {
            uVar.u(kVar);
        }
    }
}
