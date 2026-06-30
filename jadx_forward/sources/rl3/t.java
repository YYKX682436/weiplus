package rl3;

/* loaded from: classes15.dex */
public class t extends rl3.b {

    /* renamed from: k, reason: collision with root package name */
    public b21.r f478810k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc f478811l;

    /* renamed from: m, reason: collision with root package name */
    public b21.o f478812m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f478813n;

    /* renamed from: o, reason: collision with root package name */
    public rl3.s f478814o;

    /* renamed from: p, reason: collision with root package name */
    public vl3.b f478815p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f478817r;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f478816q = "";

    /* renamed from: s, reason: collision with root package name */
    public int f478818s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f478819t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f478820u = 0;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType f478821v = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;

    /* renamed from: w, reason: collision with root package name */
    public boolean f478822w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f478823x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f478824y = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a f478825z = new rl3.r(this);

    public t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.b();
    }

    public static void x(rl3.t tVar) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = tVar.f478821v;
        if (audioType == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "idKeyReportMusicMimeType audioType:%d, isStatMineType:%b", java.lang.Integer.valueOf(audioType.m93533x754a37bb()), java.lang.Boolean.valueOf(tVar.f478822w));
        if (tVar.f478822w) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "idKeyReportMusicMimeType OK");
        tVar.f478822w = true;
        kl3.h hVar = tVar.f478762d;
        if (hVar != null) {
            b21.r rVar = tVar.f478810k;
            int m93533x754a37bb = tVar.f478821v.m93533x754a37bb();
            ((pl3.e) hVar).f438236a.getClass();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
            c4582x424c344.m40331x936762bd(m93533x754a37bb == 2 ? 92 : m93533x754a37bb == 3 ? 93 : m93533x754a37bb == 4 ? 94 : m93533x754a37bb == 5 ? 95 : m93533x754a37bb == 6 ? 96 : m93533x754a37bb == 7 ? 97 : m93533x754a37bb == 8 ? 98 : m93533x754a37bb == 9 ? 99 : 100);
            c4582x424c344.m40332x57b2b64f(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c4582x424c344);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.j(arrayList, true, false);
            java.lang.String c17 = gl3.h.c(rVar.Q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayerReportImpl", "mineTypeStr:%s", c17);
            if (android.text.TextUtils.isEmpty(c17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayerReportImpl", "music is null or mineTypeStr is empty");
            } else {
                g0Var.d(14486, 1, java.lang.Integer.valueOf(rVar.f98878d), java.lang.Integer.valueOf(pl3.a.a(c17)), c17);
            }
        }
    }

    public final boolean A(b21.r rVar) {
        return rVar != null && rVar.a(kl3.t.g().j());
    }

    public void B(float f17) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        if (c25323xb43a8cc == null) {
            return;
        }
        if (f17 < 0.5f || f17 > 2.0f) {
            c25323xb43a8cc.m93696x53b4c105(1.0f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "set speed :%f", java.lang.Float.valueOf(f17));
            this.f478811l.m93696x53b4c105(f17);
        }
    }

    public final void C() {
        if (this.f478811l != null) {
            this.f478764f = a();
            this.f478766h += android.os.SystemClock.elapsedRealtime() - this.f478765g;
            long mo67219x51e8b0a = mo67219x51e8b0a();
            kl3.h hVar = this.f478762d;
            if (hVar != null) {
                b21.r rVar = this.f478810k;
                long j17 = this.f478764f;
                long j18 = this.f478766h;
                pl3.e eVar = (pl3.e) hVar;
                if (rVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatReportService", "scene:%d, endPosition:%d, totalPlayTime:%d, duration:%d", java.lang.Integer.valueOf(rVar.f98878d), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(mo67219x51e8b0a));
                    if (rVar.f98878d == 10) {
                        eVar.A(rVar, j17, j18, mo67219x51e8b0a);
                    }
                }
            }
        }
    }

    public final boolean D() {
        return kl3.t.g().j() == null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public int a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        if (c25323xb43a8cc != null) {
            return (int) c25323xb43a8cc.mo93635x9746038c();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void b() {
        this.f478824y = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "passivePause");
        if (this.f478811l == null || !i()) {
            return;
        }
        try {
            this.f478811l.mo93644x65825f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e17, "passivePause", new java.lang.Object[0]);
            m(this.f478810k, 503);
            y(this.f478810k, 503);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean c(int i17) {
        int mo67219x51e8b0a = mo67219x51e8b0a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "seekToMusic pos:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo67219x51e8b0a));
        if (mo67219x51e8b0a < 0 || i17 > mo67219x51e8b0a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "position is invalid, position:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mo67219x51e8b0a));
            mo67222x66343656();
            return false;
        }
        if (this.f478811l != null) {
            b21.r rVar = this.f478810k;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onSeekingEvent");
            this.f478760b = "seeking";
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
            am.jk jkVar = c5722xb16ab0f4.f136045g;
            jkVar.f88569b = 12;
            jkVar.f88570c = rVar;
            jkVar.f88573f = "seeking";
            jkVar.f88572e = mo67219x51e8b0a();
            jkVar.f88574g = true;
            c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
            kl3.e eVar = this.f478763e;
            if (eVar != null) {
                eVar.l(rVar);
            }
            this.f478811l.mo93651xc9fc1b13(i17);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "pauseAndAbandonFocus");
        mo67220x65825f6();
        w();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean e() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public b21.o f() {
        int mo67219x51e8b0a = mo67219x51e8b0a();
        int a17 = a();
        boolean i17 = i();
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        int m93691xa38776cf = c25323xb43a8cc != null ? c25323xb43a8cc.m93691xa38776cf() : 0;
        if (m93691xa38776cf < 0 || m93691xa38776cf > 100) {
            m93691xa38776cf = 0;
        }
        int i18 = m93691xa38776cf >= 0 ? m93691xa38776cf : 0;
        b21.o oVar = this.f478812m;
        if (oVar != null) {
            oVar.f98870a = mo67219x51e8b0a;
            oVar.f98871b = a17;
            oVar.f98872c = i17 ? 1 : 0;
            oVar.f98873d = i18;
        } else {
            this.f478812m = new b21.o(mo67219x51e8b0a, a17, i17 ? 1 : 0, i18);
        }
        this.f478812m.getClass();
        b21.o oVar2 = this.f478812m;
        oVar2.f98874e = this.f478760b;
        return oVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean g() {
        if (!this.f478813n) {
            return false;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        return !(c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: getDuration */
    public int mo67219x51e8b0a() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        if (c25323xb43a8cc != null) {
            return c25323xb43a8cc.mo93638x51e8b0a();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean h() {
        return this.f478813n && this.f478824y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean i() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        return c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void j(boolean z17) {
        v(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: pause */
    public void mo67220x65825f6() {
        this.f478824y = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "pause");
        if (this.f478811l == null || !i()) {
            return;
        }
        try {
            this.f478811l.mo93644x65825f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e17, "pause", new java.lang.Object[0]);
            m(this.f478810k, 503);
            y(this.f478810k, 503);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: resume */
    public void mo67221xc84dc82d() {
        v(true);
    }

    @Override // rl3.b
    public boolean s() {
        if (t(this.f478810k)) {
            return super.s();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: stopPlay */
    public void mo67222x66343656() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "stopPlay");
        try {
            C();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
            if (c25323xb43a8cc != null) {
                c25323xb43a8cc.mo93667x360802();
            }
            rl3.s sVar = this.f478814o;
            if (sVar != null) {
                sVar.f478808d = true;
                this.f478814o = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e17, "stopPlay", new java.lang.Object[0]);
            m(this.f478810k, 504);
            y(this.f478810k, 504);
        }
        w();
        this.f478813n = false;
        this.f478824y = false;
    }

    public final void v(boolean z17) {
        this.f478818s = 0;
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = this.f478811l;
        boolean z18 = c25323xb43a8cc != null && c25323xb43a8cc.mo93639xfa6224fa() == 3;
        boolean i17 = i();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(i17);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc2 = this.f478811l;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(c25323xb43a8cc2 != null && c25323xb43a8cc2.mo93639xfa6224fa() == 5);
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc3 = this.f478811l;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, paused:%b, isPrepared:%b", valueOf, valueOf2, valueOf3, java.lang.Boolean.valueOf(c25323xb43a8cc3 != null && c25323xb43a8cc3.mo93639xfa6224fa() == 2));
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc4 = this.f478811l;
        if (c25323xb43a8cc4 != null) {
            if (!(c25323xb43a8cc4 != null && c25323xb43a8cc4.mo93639xfa6224fa() == 5)) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc5 = this.f478811l;
                if (!(c25323xb43a8cc5 != null && c25323xb43a8cc5.mo93639xfa6224fa() == 2)) {
                    return;
                }
            }
            if (i17) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "requestFocus:%b", java.lang.Boolean.valueOf(z17));
            if (!z17 || s()) {
                try {
                    this.f478811l.mo93666x68ac462();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.QQMusicPlayer", e17, "resume", new java.lang.Object[0]);
                    m(this.f478810k, 502);
                    y(this.f478810k, 502);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
            }
            this.f478813n = true;
        }
    }

    public void w() {
        kl3.e eVar;
        if (!t(this.f478810k) || (eVar = this.f478763e) == null) {
            return;
        }
        eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(b21.r r23, int r24) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rl3.t.y(b21.r, int):void");
    }

    public void z() {
        this.f478762d = (kl3.h) sl3.b.b(kl3.h.class);
        kl3.e l17 = kl3.t.l();
        this.f478763e = l17;
        if (l17 != null) {
            this.f478823x = l17.h();
        }
    }
}
