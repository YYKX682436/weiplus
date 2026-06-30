package rl3;

/* loaded from: classes15.dex */
public class r implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a {

    /* renamed from: d, reason: collision with root package name */
    public b21.r f478806d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.t f478807e;

    public r(rl3.t tVar) {
        this.f478807e = tVar;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onBufferingUpdate */
    public void mo93843x3e084f2c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onCompletion */
    public void mo93844xa6db431b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onCompletion");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onError */
    public void mo93845xaf8aa769(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "onError what:%d, extra:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        rl3.t tVar = this.f478807e;
        if (tVar.D()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "onError, currentMusic is null");
            return;
        }
        b21.r rVar = tVar.f478810k;
        this.f478806d = rVar;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "onError, cbMusic is null");
            return;
        }
        boolean m40088x550b09c5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (i18 == 80 && m40088x550b09c5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "connect success, but download is fail!");
        }
        int i27 = tVar.f478818s;
        if (i27 >= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "errorCount %d", java.lang.Integer.valueOf(i27));
            return;
        }
        tVar.f478818s = i27 + 1;
        tVar.C();
        tVar.y(this.f478806d, i18);
        if (tVar.A(this.f478806d)) {
            tVar.mo67222x66343656();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new rl3.q(this));
        }
        tVar.r(this.f478806d);
        tVar.m(this.f478806d, i18);
        rl3.s sVar = tVar.f478814o;
        if (sVar != null) {
            sVar.f478808d = true;
            tVar.f478814o = null;
        }
        if (i17 == 91 && i18 == 55) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "unknow format ,delete file");
            java.lang.String str = tVar.f478816q;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gl3.h.f354364a;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
            gl3.i.a(xl3.c.d(str));
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onPrepared */
    public void mo93846x58d5b73c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onPrepared");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onSeekComplete */
    public void mo93847xe1fdf750(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onSeekComplete seekPosition:%d", java.lang.Integer.valueOf(i17));
        rl3.t tVar = this.f478807e;
        int i18 = tVar.f478819t;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "seek complete to startTime :%d", java.lang.Integer.valueOf(i18));
            tVar.f478819t = 0;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onSeekComplete");
        b21.r rVar = this.f478806d;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
            return;
        }
        tVar.p(rVar);
        if (tVar.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "seek end, send play event!");
            tVar.o(this.f478806d);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStarted */
    public void mo93848xde9141a2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStarted");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStateChanged */
    public void mo93849xaba1ac62(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged state %d", java.lang.Integer.valueOf(i17));
        rl3.t tVar = this.f478807e;
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARING!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onPreparing");
            b21.r rVar = tVar.f478810k;
            this.f478806d = rVar;
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onPreparingEvent %b", java.lang.Boolean.valueOf(tVar.i()));
            tVar.f478760b = "waiting";
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
            am.jk jkVar = c5722xb16ab0f4.f136045g;
            jkVar.f88569b = 11;
            jkVar.f88570c = rVar;
            jkVar.f88573f = "waiting";
            jkVar.f88572e = tVar.mo67219x51e8b0a();
            jkVar.f88574g = true;
            c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
            kl3.e eVar = tVar.f478763e;
            if (eVar != null) {
                eVar.k(rVar);
                return;
            }
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARED!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onPrepared");
            int i18 = tVar.f478819t;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "seek to startTime:%d", java.lang.Integer.valueOf(i18));
                tVar.c(tVar.f478819t);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "start to play");
            if (!tVar.s()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
                return;
            }
            b21.r rVar2 = tVar.f478810k;
            if (rVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onPrepareEvent %b", java.lang.Boolean.valueOf(tVar.i()));
            tVar.f478760b = "canplay";
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
            am.jk jkVar2 = c5722xb16ab0f42.f136045g;
            jkVar2.f88569b = 9;
            jkVar2.f88570c = rVar2;
            jkVar2.f88573f = "canplay";
            jkVar2.f88572e = tVar.mo67219x51e8b0a();
            jkVar2.f88574g = true;
            c5722xb16ab0f42.b(android.os.Looper.getMainLooper());
            kl3.e eVar2 = tVar.f478763e;
            if (eVar2 != null) {
                eVar2.b(rVar2);
            }
            try {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = tVar.f478811l;
                if (c25323xb43a8cc != null) {
                    c25323xb43a8cc.mo93666x68ac462();
                    if (tVar.f478811l.mo93634x7ad436d9() != null && tVar.f478811l.mo93634x7ad436d9().m93536xaa5357a() != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "getAudioType:%d", java.lang.Integer.valueOf(tVar.f478811l.mo93634x7ad436d9().m93536xaa5357a().m93533x754a37bb()));
                        tVar.f478821v = tVar.f478811l.mo93634x7ad436d9().m93536xaa5357a();
                        rl3.t.x(tVar);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e17, "_onPrepared", new java.lang.Object[0]);
                tVar.m(tVar.f478810k, 502);
                tVar.y(tVar.f478810k, 502);
            }
            tVar.f478813n = true;
            return;
        }
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STARTED!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onStart");
            b21.r rVar3 = tVar.f478810k;
            this.f478806d = rVar3;
            if (rVar3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            tVar.f478765g = android.os.SystemClock.elapsedRealtime();
            if ("pause".equals(tVar.f478760b)) {
                tVar.o(this.f478806d);
            } else {
                tVar.q(this.f478806d);
            }
            rl3.s sVar = tVar.f478814o;
            if (sVar != null) {
                sVar.f478808d = true;
            }
            rl3.s sVar2 = new rl3.s(tVar, null);
            tVar.f478814o = sVar2;
            sVar2.f478808d = false;
            s75.d.b(sVar2, "music_play_progress_runnable");
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PAUSED!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onPause");
            if (this.f478806d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            } else {
                tVar.f478766h += android.os.SystemClock.elapsedRealtime() - tVar.f478765g;
                tVar.n(this.f478806d);
                return;
            }
        }
        if (i17 != 6) {
            if (i17 != 7) {
                if (i17 == 8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged END!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onEnd");
                    return;
                } else {
                    if (i17 == 9) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged ERROR!");
                        return;
                    }
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PLAYBACKCOMPLETED!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onCompletion");
            if (this.f478806d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            tVar.C();
            tVar.f478813n = false;
            tVar.l(tVar.f478810k);
            rl3.s sVar3 = tVar.f478814o;
            if (sVar3 != null) {
                sVar3.f478808d = true;
                tVar.f478814o = null;
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STOPPED!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "_onStop");
        if (this.f478806d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
            return;
        }
        if (tVar.D()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "currentMusic is null");
            return;
        }
        if (tVar.A(this.f478806d)) {
            tVar.r(this.f478806d);
            return;
        }
        b21.r rVar4 = this.f478806d;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar4 == null || (str = rVar4.f98879e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onStopForReportEvent: %s", objArr);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f43 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar3 = c5722xb16ab0f43.f136045g;
        jkVar3.f88569b = 18;
        jkVar3.f88570c = rVar4;
        c5722xb16ab0f43.b(android.os.Looper.getMainLooper());
    }
}
