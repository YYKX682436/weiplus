package rl3;

/* loaded from: classes15.dex */
public class p extends rl3.b {

    /* renamed from: k, reason: collision with root package name */
    public b21.r f478798k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i f478799l;

    /* renamed from: m, reason: collision with root package name */
    public jl3.d f478800m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f478801n;

    /* renamed from: o, reason: collision with root package name */
    public b21.o f478802o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f478803p;

    /* renamed from: q, reason: collision with root package name */
    public final jl3.c f478804q = new rl3.o(this);

    /* renamed from: r, reason: collision with root package name */
    public boolean f478805r = false;

    public static void w(rl3.p pVar, b21.r rVar, int i17) {
        pVar.getClass();
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayer", "currentMusic is null, don't idKeyReportMusicError");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicError, action:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = pVar.f478799l;
        int i18 = (iVar == null || !(iVar instanceof rl3.j)) ? 0 : ((rl3.j) iVar).f478790n;
        kl3.h hVar = pVar.f478762d;
        if (hVar != null) {
            ((pl3.e) hVar).y(pVar.f478798k, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
        if (iVar != null) {
            return iVar.a();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void b() {
        this.f478805r = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "passivePause");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
            if (iVar == null || !iVar.e()) {
                return;
            }
            this.f478799l.g();
            n(this.f478798k);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicPlayer", e17, "passivePause", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean c(int i17) {
        int mo67219x51e8b0a;
        int x17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "seekToMusic pos:%d", java.lang.Integer.valueOf(i17));
        try {
            mo67219x51e8b0a = mo67219x51e8b0a();
            x17 = x();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicPlayer", e17, "seekTo", new java.lang.Object[0]);
        }
        if (mo67219x51e8b0a >= 0 && i17 <= mo67219x51e8b0a) {
            int i18 = (int) ((x17 / 100.0d) * mo67219x51e8b0a);
            if (x17 != 100 && i17 > i18) {
                i17 = i18 - 2000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "on completed seekto, position is %d =", java.lang.Integer.valueOf(i17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
            if (iVar != null && i17 >= 0) {
                iVar.i(i17);
                p(this.f478798k);
                return true;
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayer", "duration or position is illegal, stop");
        mo67222x66343656();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "pauseAndAbandonFocus");
        mo67220x65825f6();
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean e() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public b21.o f() {
        int mo67219x51e8b0a = mo67219x51e8b0a();
        int a17 = a();
        int i17 = 1;
        if (!i()) {
            if (!this.f478803p || (!this.f478801n && !this.f478759a)) {
                i17 = 0;
            }
            i17 = i17 != 0 ? 0 : 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "get music status = %d", java.lang.Integer.valueOf(i17));
        int x17 = mo67219x51e8b0a > 0 ? x() : 0;
        b21.o oVar = this.f478802o;
        if (oVar != null) {
            oVar.f98870a = mo67219x51e8b0a;
            oVar.f98871b = a17;
            oVar.f98872c = i17;
            oVar.f98873d = x17;
        } else {
            this.f478802o = new b21.o(mo67219x51e8b0a, a17, i17, x17);
        }
        this.f478802o.getClass();
        b21.o oVar2 = this.f478802o;
        oVar2.f98874e = this.f478760b;
        return oVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean g() {
        return this.f478803p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: getDuration */
    public int mo67219x51e8b0a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
        if (iVar != null) {
            return iVar.b();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean h() {
        return this.f478803p && this.f478805r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
        if (iVar != null) {
            try {
                return iVar.e();
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void j(boolean z17) {
        v(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: pause */
    public void mo67220x65825f6() {
        this.f478805r = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "pause");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
            if (iVar == null || !iVar.e()) {
                return;
            }
            this.f478799l.g();
            this.f478801n = true;
            n(this.f478798k);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicPlayer", e17, "pause", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: resume */
    public void mo67221xc84dc82d() {
        v(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: stopPlay */
    public void mo67222x66343656() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "stopPlay");
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
        if (iVar != null && (iVar instanceof rl3.j)) {
            java.lang.String c17 = iVar.c();
            kl3.h hVar = this.f478762d;
            if (hVar != null) {
                b21.r rVar = this.f478798k;
                pl3.b bVar = ((pl3.e) hVar).f438238c;
                bVar.getClass();
                if (android.text.TextUtils.isEmpty(c17) && bVar.f438230j != null) {
                    c17 = bVar.a();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType mineType:%s, hasStatForMimeType:%b", c17, java.lang.Boolean.valueOf(bVar.f438229i));
                if (!android.text.TextUtils.isEmpty(c17) && !bVar.f438229i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType OK");
                    bVar.f438229i = true;
                    com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                    c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                    c4582x424c344.m40331x936762bd(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54248xb24ba796.equalsIgnoreCase(c17) ? 70 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54249xb24ba8ad.equalsIgnoreCase(c17) ? 71 : (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e.equalsIgnoreCase(c17) || c17.equalsIgnoreCase("audio/mp3")) ? 72 : ("audio/mp4a-latm".equalsIgnoreCase(c17) || c17.startsWith(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54257xb16332e8)) ? 73 : "audio/qcelp".equalsIgnoreCase(c17) ? 74 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54266xd63d2e3c.equalsIgnoreCase(c17) ? 75 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54262x7b041728.equalsIgnoreCase(c17) ? 76 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54247x7afda88a.equalsIgnoreCase(c17) ? 77 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54256x7b031cfe.equalsIgnoreCase(c17) ? 78 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff.equalsIgnoreCase(c17) ? 79 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51.equalsIgnoreCase(c17) ? 80 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54261xe563c7b2.equalsIgnoreCase(c17) ? 81 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448.equalsIgnoreCase(c17) ? 82 : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e.equalsIgnoreCase(c17) ? 83 : "audio/x-ms-wma".equalsIgnoreCase(c17) ? 84 : "audio/x-wav".equalsIgnoreCase(c17) ? 85 : ("audio/x-ape".equalsIgnoreCase(c17) || "application/x-ape".equalsIgnoreCase(c17)) ? 86 : 87);
                    c4582x424c344.m40332x57b2b64f(1L);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(c4582x424c344);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.j(arrayList, true, false);
                    if (rVar != null) {
                        g0Var.d(14486, 0, java.lang.Integer.valueOf(rVar.f98878d), java.lang.Integer.valueOf(pl3.a.a(c17)), c17);
                    }
                }
            }
        }
        try {
            jl3.d dVar = this.f478800m;
            if (dVar != null) {
                dVar.f381750m = true;
                this.f478800m = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar2 = this.f478799l;
            if (iVar2 != null) {
                iVar2.k();
                this.f478799l = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicPlayer", e17, "stopPlay", new java.lang.Object[0]);
        }
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.a();
        }
        this.f478803p = false;
        this.f478805r = false;
    }

    public final void v(boolean z17) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
            if (iVar == null || iVar.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "music is playing");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "resume requestFocus:%b", java.lang.Boolean.valueOf(z17));
                if (z17 && t(this.f478798k) && !s()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicPlayer", "request focus error");
                }
                this.f478799l.h();
                o(this.f478798k);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MusicPlayer", e17, "resume", new java.lang.Object[0]);
        }
    }

    public int x() {
        long j17;
        int i17;
        jl3.d dVar = this.f478800m;
        if (dVar == null) {
            return 0;
        }
        boolean z17 = dVar.f381749i;
        jl3.a aVar = dVar.f381746f;
        if (z17) {
            long j18 = aVar.f381740f;
            long j19 = aVar.f381738d;
            if (j18 != 0) {
                j17 = (j19 * 100) / j18;
                i17 = (int) j17;
            }
            i17 = 0;
        } else {
            long j27 = aVar.f381736b;
            long j28 = aVar.f381735a;
            if (j27 != 0) {
                j17 = (j28 * 100) / j27;
                i17 = (int) j17;
            }
            i17 = 0;
        }
        if (i17 >= 1) {
            return i17;
        }
        return 0;
    }

    public final void y(b21.r rVar, boolean z17) {
        if (this.f478799l == null) {
            if (z17 || !fp.h.b(15)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "use MMMediaPlayer");
                this.f478799l = new rl3.h();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayer", "use MMPlayer");
                this.f478799l = new rl3.j();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i iVar = this.f478799l;
            iVar.f232197b = rVar;
            iVar.f232196a = new rl3.l(this);
        }
    }

    public void z() {
        this.f478762d = (kl3.h) sl3.b.b(kl3.h.class);
        this.f478763e = kl3.t.l();
    }
}
