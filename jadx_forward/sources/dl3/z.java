package dl3;

/* loaded from: classes13.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f316885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.a0 f316886e;

    public z(dl3.a0 a0Var, int i17) {
        this.f316886e = a0Var;
        this.f316885d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc;
        dl3.a0 a0Var = this.f316886e;
        java.lang.String str = a0Var.f316806e.f316813c;
        int i17 = this.f316885d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged state %d, %s", java.lang.Integer.valueOf(i17), str);
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARING!");
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onPreparing");
            dl3.d0 d0Var = a0Var.f316806e;
            n01.b bVar = d0Var.f316814d;
            a0Var.f316805d = bVar;
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "cbMusic is null");
            } else if (d0Var.f316819i || d0Var.f316818h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onPreparintEvent");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
                am.g0 g0Var = c5175x3ee93aa3.f135523g;
                g0Var.f88249a = 9;
                g0Var.f88252d = "waiting";
                g0Var.f88251c = d0Var.f316813c;
                g0Var.f88253e = d0Var.k();
                c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            }
            a0Var.f316806e.f316831u = java.lang.System.currentTimeMillis();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARED!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "preparing cost time :%d!", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - a0Var.f316806e.f316831u));
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onPrepared");
            dl3.d0 d0Var2 = a0Var.f316806e;
            a0Var.f316805d = d0Var2.f316814d;
            if (d0Var2.f316819i || d0Var2.f316818h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                if (d0Var2.f316819i && (c25323xb43a8cc = d0Var2.f316815e) != null) {
                    c25323xb43a8cc.mo93667x360802();
                }
                if (d0Var2.f316818h) {
                    d0Var2.m();
                    return;
                }
                return;
            }
            int i18 = d0Var2.f316825o;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "seek to startTime:%d", java.lang.Integer.valueOf(i18));
                d0Var2.c(d0Var2.f316825o);
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc2 = d0Var2.f316815e;
            if (c25323xb43a8cc2 != null && c25323xb43a8cc2.mo93634x7ad436d9() != null && d0Var2.f316815e.mo93634x7ad436d9().m93536xaa5357a() != null) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93536xaa5357a = d0Var2.f316815e.mo93634x7ad436d9().m93536xaa5357a();
                d0Var2.f316828r = m93536xaa5357a;
                if (m93536xaa5357a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "getAudioType:%d", java.lang.Integer.valueOf(m93536xaa5357a.m93533x754a37bb()));
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = d0Var2.f316828r;
                if (audioType != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "idKeyReportAudioMimeType audioType:%d, isStatMineType:%b", java.lang.Integer.valueOf(audioType.m93533x754a37bb()), java.lang.Boolean.valueOf(d0Var2.f316829s));
                    if (!d0Var2.f316829s) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "idKeyReportAudioMimeType OK");
                        d0Var2.f316829s = true;
                        if (d0Var2.f316833w != null) {
                            int m93533x754a37bb = d0Var2.f316828r.m93533x754a37bb();
                            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                            c4582x424c344.m40330x4c144dd(na1.e.f72905x366c91de);
                            c4582x424c344.m40331x936762bd(m93533x754a37bb == 2 ? 42 : m93533x754a37bb == 3 ? 43 : m93533x754a37bb == 4 ? 44 : m93533x754a37bb == 5 ? 45 : m93533x754a37bb == 6 ? 46 : m93533x754a37bb == 7 ? 47 : m93533x754a37bb == 8 ? 48 : m93533x754a37bb == 9 ? 49 : 50);
                            c4582x424c344.m40332x57b2b64f(1L);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(c4582x424c344);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
                        }
                    }
                }
            }
            d0Var2.n();
            if (!d0Var2.f316826p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "autoplay is false, don't start auto play!");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "start to play");
            try {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc3 = d0Var2.f316815e;
                if (c25323xb43a8cc3 != null) {
                    float f17 = (float) d0Var2.f316814d.f415380l;
                    c25323xb43a8cc3.mo93664x27f73e1c(f17, f17);
                    d0Var2.r();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e17, "_onPrepared", new java.lang.Object[0]);
                d0Var2.l(502);
                d0Var2.t(502);
            }
            d0Var2.f316817g = true;
            return;
        }
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STARTED!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "start cost time :%d!", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - a0Var.f316806e.f316831u));
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onStart");
            dl3.d0 d0Var3 = a0Var.f316806e;
            el3.i iVar = d0Var3.f316833w;
            if (iVar != null) {
                n01.b bVar2 = d0Var3.f316814d;
                java.lang.String str2 = bVar2.f415369a;
                java.lang.String str3 = bVar2.f415370b;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                n01.b bVar3 = d0Var3.f316814d;
                ((el3.h) iVar).E(str2, str3, currentTimeMillis - bVar3.f415383o, bVar3.f415384p, bVar3.f415385q, true, "", 0L, 0L, 0L);
            }
            a0Var.f316805d = d0Var3.f316814d;
            if (d0Var3.f316819i || d0Var3.f316818h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc4 = d0Var3.f316815e;
                if (c25323xb43a8cc4 == null || !d0Var3.f316817g) {
                    return;
                }
                d0Var3.f316817g = false;
                c25323xb43a8cc4.mo93667x360802();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onStartEvent %b", java.lang.Boolean.valueOf(d0Var3.i()));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
            am.g0 g0Var2 = c5175x3ee93aa32.f135523g;
            g0Var2.f88249a = 0;
            g0Var2.f88252d = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27;
            g0Var2.f88251c = d0Var3.f316813c;
            g0Var2.f88253e = d0Var3.k();
            c5175x3ee93aa32.b(android.os.Looper.getMainLooper());
            dl3.f fVar = d0Var3.f316881b;
            if (fVar != null) {
                ((dl3.l) fVar).a(d0Var3.f316813c);
            }
            dl3.c0 c0Var = d0Var3.f316820j;
            if (c0Var != null) {
                c0Var.f316811d = true;
            }
            dl3.c0 c0Var2 = new dl3.c0(d0Var3, null);
            d0Var3.f316820j = c0Var2;
            c0Var2.f316811d = false;
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PAUSED!");
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onPause");
            a0Var.f316806e.m();
            return;
        }
        if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STOPPED!");
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onStop");
            if (a0Var.f316805d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "currentMusic is null");
                return;
            }
            dl3.d0 d0Var4 = a0Var.f316806e;
            d0Var4.f316817g = false;
            d0Var4.f316832v = java.lang.System.currentTimeMillis();
            if (d0Var4.f316813c.equalsIgnoreCase(a0Var.f316805d.f415369a)) {
                if (!d0Var4.f316819i) {
                    d0Var4.p();
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "stop play, but send pause state event");
                    d0Var4.m();
                    return;
                }
            }
            return;
        }
        if (i17 != 7) {
            if (i17 == 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged END!");
                a0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onEnd");
                return;
            } else {
                if (i17 == 9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged ERROR!");
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PLAYBACKCOMPLETED!");
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onCompletion");
        dl3.d0 d0Var5 = a0Var.f316806e;
        if (!d0Var5.f316814d.f415376h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onCompleteEvent");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa33 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
            am.g0 g0Var3 = c5175x3ee93aa33.f135523g;
            g0Var3.f88249a = 5;
            g0Var3.f88252d = "ended";
            g0Var3.f88251c = d0Var5.f316813c;
            g0Var3.f88253e = d0Var5.k();
            c5175x3ee93aa33.b(android.os.Looper.getMainLooper());
            dl3.f fVar2 = d0Var5.f316881b;
            if (fVar2 != null) {
                java.lang.String str4 = d0Var5.f316813c;
                dl3.i iVar2 = ((dl3.l) fVar2).f316869a;
                dl3.d0 o17 = iVar2.o(str4);
                if (o17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onComplete player is null");
                } else {
                    iVar2.O(str4, o17);
                    iVar2.w(str4, o17);
                    dl3.i.c(iVar2);
                    iVar2.F(1800000);
                    iVar2.T(str4);
                    iVar2.A(str4);
                }
            }
        }
        dl3.c0 c0Var3 = d0Var5.f316820j;
        if (c0Var3 != null) {
            c0Var3.f316811d = true;
            d0Var5.f316820j = null;
        }
        d0Var5.f316832v = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play end, isPausedOnBackground:%b, playParam.loop:%b, isStartPlaying:%b, ", java.lang.Boolean.valueOf(d0Var5.f316819i), java.lang.Boolean.valueOf(d0Var5.f316814d.f415376h), java.lang.Boolean.valueOf(d0Var5.f316817g));
        if (d0Var5.f316819i) {
            d0Var5.f316817g = false;
            d0Var5.f316825o = 0;
            d0Var5.f316826p = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground is true, do stop player and don't play again");
            return;
        }
        if (d0Var5.f316818h) {
            d0Var5.f316817g = false;
            d0Var5.f316825o = 0;
            d0Var5.f316826p = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "isForcePause is true, do stop player and don't play again");
            return;
        }
        if (!d0Var5.f316814d.f415376h || !d0Var5.f316817g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play end, but not loop play");
            d0Var5.f316817g = false;
            d0Var5.f316825o = 0;
            d0Var5.f316826p = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play end normally and loop play again");
        d0Var5.f316817g = false;
        d0Var5.f316825o = 0;
        d0Var5.f316826p = true;
        d0Var5.u();
    }
}
