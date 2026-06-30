package dl3;

/* loaded from: classes13.dex */
public class d0 extends dl3.v {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f316813c;

    /* renamed from: d, reason: collision with root package name */
    public n01.b f316814d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc f316815e;

    /* renamed from: f, reason: collision with root package name */
    public n01.d f316816f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f316817g;

    /* renamed from: j, reason: collision with root package name */
    public dl3.c0 f316820j;

    /* renamed from: k, reason: collision with root package name */
    public vl3.b f316821k;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f316830t;

    /* renamed from: w, reason: collision with root package name */
    public el3.i f316833w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f316835y;

    /* renamed from: h, reason: collision with root package name */
    public boolean f316818h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f316819i = false;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f316822l = "";

    /* renamed from: m, reason: collision with root package name */
    public int f316823m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f316824n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f316825o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f316826p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f316827q = 0;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType f316828r = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;

    /* renamed from: s, reason: collision with root package name */
    public boolean f316829s = false;

    /* renamed from: u, reason: collision with root package name */
    public long f316831u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f316832v = 0;

    /* renamed from: x, reason: collision with root package name */
    public dl3.b f316834x = null;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a f316836z = new dl3.a0(this);
    public final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 A = new dl3.b0(this);

    public d0() {
        java.lang.String str;
        this.f316813c = "";
        this.f316835y = "";
        this.f316813c = dl3.h.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.b();
        dl3.i s17 = dl3.i.s();
        synchronized (s17.f316865y) {
            if (!s17.f316865y.contains(this)) {
                s17.f316865y.add(this);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "create QQAudioPlayer instance");
        this.f316830t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            str = com.p314xaae8f345.mm.vfs.w6.i("wcf://QQMusicCache/", true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            str = "";
        }
        this.f316835y = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "playCacheTempDir:%s", str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public int a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        if (c25323xb43a8cc != null) {
            return (int) c25323xb43a8cc.mo93635x9746038c();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean c(int i17) {
        int mo67219x51e8b0a = mo67219x51e8b0a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "seekToMusic pos:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo67219x51e8b0a));
        if (mo67219x51e8b0a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo67219x51e8b0a));
            mo67222x66343656();
            return false;
        }
        if (i17 > mo67219x51e8b0a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo67219x51e8b0a));
            return false;
        }
        if (this.f316815e == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekingEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 10;
        g0Var.f88252d = "seeking";
        g0Var.f88251c = this.f316813c;
        g0Var.f88253e = k();
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
        this.f316815e.mo93651xc9fc1b13(i17);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "pauseAndAbandonFocus");
        mo67220x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean g() {
        return this.f316817g && !x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: getDuration */
    public int mo67219x51e8b0a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        if (c25323xb43a8cc != null) {
            return c25323xb43a8cc.mo93638x51e8b0a();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean i() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        return c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 4;
    }

    @Override // dl3.v
    public java.lang.String k() {
        n01.b bVar = this.f316814d;
        return bVar != null ? bVar.f415382n : "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: pause */
    public void mo67220x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "pause, audioId:%s", this.f316813c);
        this.f316818h = true;
        if (this.f316815e == null || !i()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
            if (c25323xb43a8cc != null) {
                if (c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "pause fail, play complete, set isStartPlaying false");
                    this.f316817g = false;
                    return;
                }
                return;
            }
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "pause success");
            this.f316815e.mo93644x65825f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e17, "pause", new java.lang.Object[0]);
            l(503);
            t(503);
        }
    }

    public final void q() {
        try {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
            if (c25323xb43a8cc != null) {
                c25323xb43a8cc.mo93664x27f73e1c(0.0f, 0.0f);
                if (!w() && !v() && !i()) {
                    if (this.f316819i) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "stop play, but send pause state event");
                        this.f316815e.mo93650x6761d4f();
                        m();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "reset and send stop event");
                        this.f316815e.mo93650x6761d4f();
                        p();
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "stop");
                this.f316815e.mo93667x360802();
            }
            dl3.c0 c0Var = this.f316820j;
            if (c0Var != null) {
                c0Var.f316811d = true;
                this.f316820j = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e17, "stopPlay", new java.lang.Object[0]);
            l(504);
            t(504);
        }
        this.f316817g = false;
        this.f316818h = true;
        this.f316832v = java.lang.System.currentTimeMillis();
    }

    public final void r() {
        if (w() || v()) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
            dl3.i s17 = dl3.i.s();
            c25323xb43a8cc.mo93652x7389228e((s17.C || s17.f316862v.f415366a || s17.D) ? 3 : 0);
        }
        this.f316815e.mo93666x68ac462();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc2 = this.f316815e;
        double d17 = this.f316814d.f415380l;
        c25323xb43a8cc2.mo93664x27f73e1c((float) d17, (float) d17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: resume */
    public void mo67221xc84dc82d() {
        this.f316823m = 0;
        boolean x17 = x();
        boolean i17 = i();
        this.f316818h = false;
        this.f316819i = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, isStartPlaying:%b, audioId:%s", java.lang.Boolean.valueOf(x17), java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(this.f316817g), this.f316813c);
        if (this.f316815e != null && !w() && !x17 && !i17 && !this.f316817g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "audio play is complete, need initPlayer again");
            this.f316825o = 0;
            this.f316826p = true;
            u();
            el3.i iVar = this.f316833w;
            if (iVar != null) {
                ((el3.h) iVar).D(this.f316814d.f415377i);
                return;
            }
            return;
        }
        if (this.f316815e != null) {
            if ((v() || w()) && !i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "audio play is paused, need start to play");
                try {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
                    double d17 = this.f316814d.f415380l;
                    c25323xb43a8cc.mo93664x27f73e1c((float) d17, (float) d17);
                    r();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e17, "resume", new java.lang.Object[0]);
                    l(502);
                    t(502);
                }
                this.f316817g = true;
            }
        }
    }

    public n01.d s() {
        if (this.f316816f == null) {
            this.f316816f = new n01.d();
        }
        int mo67219x51e8b0a = mo67219x51e8b0a();
        int a17 = a();
        boolean i17 = i();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        int m93691xa38776cf = c25323xb43a8cc != null ? c25323xb43a8cc.m93691xa38776cf() : 0;
        if (m93691xa38776cf < 0 || m93691xa38776cf > 100) {
            m93691xa38776cf = 0;
        }
        int i18 = m93691xa38776cf >= 0 ? m93691xa38776cf : 0;
        n01.d dVar = this.f316816f;
        dVar.f415396b = a17;
        dVar.f415395a = mo67219x51e8b0a;
        dVar.f415397c = !i17;
        dVar.f415398d = this.f316819i;
        dVar.f415399e = (i18 * mo67219x51e8b0a) / 100;
        n01.b bVar = this.f316814d;
        if (bVar == null) {
            return null;
        }
        dVar.f415401g = bVar.f415373e;
        dVar.f415400f = bVar.f415370b;
        dVar.f415402h = bVar.f415390v;
        return dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: stopPlay */
    public void mo67222x66343656() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "stopPlay");
        this.f316819i = false;
        q();
    }

    public final void t(int i17) {
        int i18;
        el3.i iVar = this.f316833w;
        if (iVar != null) {
            int i19 = this.f316814d.f415377i;
            ((el3.h) iVar).getClass();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(na1.e.f72905x366c91de);
            c4582x424c344.m40331x936762bd(1);
            c4582x424c344.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(na1.e.f72905x366c91de);
            c4582x424c3442.m40331x936762bd(9);
            c4582x424c3442.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3443.m40330x4c144dd(na1.e.f72905x366c91de);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:" + i17);
            if (i17 == 66) {
                i18 = 23;
            } else if (i17 == 67) {
                i18 = 24;
            } else if (i17 == 69) {
                i18 = 25;
            } else if (i17 == 70) {
                i18 = 36;
            } else if (i17 == 74) {
                i18 = 26;
            } else if (i17 == 80) {
                i18 = 27;
            } else if (i17 == 105) {
                i18 = 37;
            } else if (i17 == 101) {
                i18 = 28;
            } else if (i17 != 102) {
                switch (i17) {
                    case 53:
                        i18 = 17;
                        break;
                    case 54:
                        i18 = 18;
                        break;
                    case 55:
                        i18 = 19;
                        break;
                    default:
                        switch (i17) {
                            case 62:
                                i18 = 20;
                                break;
                            case 63:
                                i18 = 21;
                                break;
                            case 64:
                                i18 = 22;
                                break;
                            default:
                                switch (i17) {
                                    case 500:
                                        i18 = 31;
                                        break;
                                    case 501:
                                        i18 = 32;
                                        break;
                                    case 502:
                                        i18 = 33;
                                        break;
                                    case 503:
                                        i18 = 34;
                                        break;
                                    case 504:
                                        i18 = 35;
                                        break;
                                    default:
                                        i18 = 30;
                                        break;
                                }
                        }
                }
            } else {
                i18 = 29;
            }
            c4582x424c3443.m40331x936762bd(i18);
            c4582x424c3443.m40332x57b2b64f(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            arrayList.add(c4582x424c3443);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
        }
    }

    public final void u() {
        java.net.URL url;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "initPlayer");
        n01.b bVar = this.f316814d;
        boolean z17 = true;
        boolean z18 = (bVar == null || !bVar.f415370b.startsWith("wxblob://") || bVar.B == null) ? false : true;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1 = this.A;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a = this.f316836z;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with pByteBuff");
            if (this.f316815e == null) {
                this.f316815e = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc(interfaceC25343x8e10fe3a);
            }
            this.f316815e.mo93650x6761d4f();
            n01.b bVar2 = this.f316814d;
            try {
                this.f316815e.mo93657x683d6267(new ul3.c(bVar2.B, bVar2.f415370b));
                this.f316815e.mo93630xd94b1389(interfaceC25354x74ec3ce1);
                this.f316815e.mo93646xed060d07();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e17, "initPlayer", new java.lang.Object[0]);
                l(501);
                t(501);
            }
        } else {
            if (!android.text.TextUtils.isEmpty(this.f316814d.f415371c)) {
                n01.b bVar3 = this.f316814d;
                if (bVar3.f415393y == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with local file, filePath:%s", bVar3.f415371c);
                    if (this.f316815e == null) {
                        this.f316815e = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc(interfaceC25343x8e10fe3a);
                    }
                    this.f316815e.mo93650x6761d4f();
                    try {
                        this.f316815e.mo93659x683d6267(this.f316814d.f415371c);
                        this.f316815e.mo93630xd94b1389(interfaceC25354x74ec3ce1);
                        this.f316815e.mo93646xed060d07();
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e18, "initPlayer exception", new java.lang.Object[0]);
                        l(501);
                        t(501);
                    }
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f316814d.f415371c)) {
                n01.b bVar4 = this.f316814d;
                if (bVar4.f415393y != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with inputStream, filePath:%s", bVar4.f415371c);
                    if (this.f316815e == null) {
                        this.f316815e = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc(interfaceC25343x8e10fe3a);
                    }
                    this.f316815e.mo93650x6761d4f();
                    try {
                        this.f316815e.mo93657x683d6267(new ul3.c(this.f316814d.f415393y));
                        this.f316815e.mo93630xd94b1389(interfaceC25354x74ec3ce1);
                        this.f316815e.mo93646xed060d07();
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e19.getMessage());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e19, "initPlayer", new java.lang.Object[0]);
                        l(501);
                        t(501);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with src url :%s", this.f316814d.f415370b);
            java.lang.String str = this.f316814d.f415370b;
            this.f316822l = str;
            if (xl3.f.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "can match shake music wifi url");
            } else {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "mSrc:%s", this.f316822l);
            gl3.h.f(this.f316822l);
            java.lang.String str2 = this.f316822l;
            if (!android.text.TextUtils.isEmpty(str2)) {
                gl3.h.f354365b.put(str2, java.lang.Boolean.valueOf(z17));
            }
            try {
                url = new java.net.URL(this.f316822l);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e27, "initPlayer", new java.lang.Object[0]);
                url = null;
            }
            if (url == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer url is null");
                l(500);
                t(500);
                return;
            }
            if (this.f316815e == null) {
                this.f316815e = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc(interfaceC25343x8e10fe3a);
            }
            this.f316815e.mo93650x6761d4f();
            if (this.f316821k == null) {
                this.f316821k = new vl3.b();
            }
            this.f316821k.a(this.f316822l, this.f316814d.f415391w);
            try {
                if (!android.text.TextUtils.isEmpty(this.f316835y)) {
                    this.f316815e.m93661x807b9af4(this.f316835y);
                }
                this.f316815e.mo93656x683d6267(this.f316821k, android.net.Uri.parse(url.toString()));
                this.f316815e.mo93630xd94b1389(interfaceC25354x74ec3ce1);
                this.f316815e.mo93646xed060d07();
            } catch (java.lang.Exception e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e28.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.QQAudioPlayer", e28, "initPlayer", new java.lang.Object[0]);
                l(501);
                t(501);
            }
        }
        n01.b bVar5 = this.f316814d;
        float f17 = bVar5 != null ? (float) bVar5.f415381m : 0.0f;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        if (c25323xb43a8cc != null) {
            if (f17 < 0.5f || f17 > 2.0f) {
                c25323xb43a8cc.m93696x53b4c105(1.0f);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "set speed :%f", java.lang.Float.valueOf(f17));
                this.f316815e.m93696x53b4c105(f17);
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc2 = this.f316815e;
            float f18 = (float) this.f316814d.f415380l;
            c25323xb43a8cc2.mo93664x27f73e1c(f18, f18);
        }
    }

    public boolean v() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        return c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 5;
    }

    public boolean w() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        return c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 2;
    }

    public boolean x() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        return c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 3;
    }

    public void y(n01.b bVar) {
        this.f316814d = bVar;
        this.f316825o = bVar.f415372d;
        this.f316826p = bVar.f415375g;
        if (this.f316815e == null || !i()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "audioId:%s, param.src:%s setVoume %f", this.f316813c, this.f316822l, java.lang.Double.valueOf(this.f316814d.f415380l));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f316815e;
        double d17 = this.f316814d.f415380l;
        c25323xb43a8cc.mo93664x27f73e1c((float) d17, (float) d17);
        double d18 = this.f316814d.f415381m;
        if (d18 <= 0.0d) {
            this.f316815e.m93696x53b4c105(1.0f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "set speed :%f", java.lang.Double.valueOf(d18));
            this.f316815e.m93696x53b4c105((float) this.f316814d.f415381m);
        }
    }

    public void z(n01.b bVar) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "startPlay fail, play param is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent");
            l(-1);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f316827q;
        n01.b bVar2 = this.f316814d;
        if (bVar2 != null && bVar2.a(bVar) && j17 <= 20) {
            this.f316814d = bVar;
            this.f316825o = bVar.f415372d;
            this.f316826p = bVar.f415375g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "startPlay, is playing for audio src:%s, don't play again in 3 second, interval:%d", this.f316822l, java.lang.Long.valueOf(j17));
            return;
        }
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f316833w = iVar;
        if (iVar != null) {
            ((el3.h) iVar).D(bVar.f415377i);
        }
        this.f316827q = currentTimeMillis;
        this.f316814d = bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "startPlay, fromScene:%d, audioId:%s", java.lang.Integer.valueOf(bVar.f415377i), this.f316813c);
        if (this.f316815e != null && i()) {
            this.f316815e.mo93667x360802();
        }
        this.f316823m = 0;
        this.f316825o = bVar.f415372d;
        this.f316826p = bVar.f415375g;
        this.f316828r = null;
        this.f316829s = false;
        this.f316819i = false;
        this.f316818h = false;
        u();
    }
}
