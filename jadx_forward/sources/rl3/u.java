package rl3;

/* loaded from: classes15.dex */
public class u extends rl3.b {

    /* renamed from: k, reason: collision with root package name */
    public b21.o f478826k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d f478827l;

    /* renamed from: m, reason: collision with root package name */
    public b21.r f478828m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f478829n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f478830o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f478831p = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public int a() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d = this.f478827l;
        if (c26520x2c78c47d != null) {
            return (int) c26520x2c78c47d.mo100915xddd35a52();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void b() {
        this.f478831p = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "passivePause");
        try {
            if (this.f478827l == null || !w()) {
                return;
            }
            this.f478827l.mo100930x65825f6();
            n(this.f478828m);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "passivePause", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean c(int i17) {
        int mo67219x51e8b0a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "seekToMusic pos:%d", java.lang.Integer.valueOf(i17));
        try {
            mo67219x51e8b0a = mo67219x51e8b0a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "seekTo", new java.lang.Object[0]);
        }
        if (mo67219x51e8b0a >= 0 && i17 <= mo67219x51e8b0a) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d = this.f478827l;
            if (c26520x2c78c47d != null && i17 >= 0) {
                c26520x2c78c47d.mo100936xc9fc1b13(i17);
                p(this.f478828m);
                return true;
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.TPMusicPlayer", "duration or position is illegal, stop");
        mo67222x66343656();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "pauseAndAbandonFocus");
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
            if (!this.f478829n || (!this.f478830o && !this.f478759a)) {
                i17 = 0;
            }
            i17 = i17 != 0 ? 0 : 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "get music status = %d", java.lang.Integer.valueOf(i17));
        b21.o oVar = this.f478826k;
        if (oVar != null) {
            oVar.f98870a = mo67219x51e8b0a;
            oVar.f98871b = a17;
            oVar.f98872c = i17;
            oVar.f98873d = 0;
        } else {
            this.f478826k = new b21.o(mo67219x51e8b0a, a17, i17, 0);
        }
        this.f478826k.getClass();
        b21.o oVar2 = this.f478826k;
        oVar2.f98874e = this.f478760b;
        return oVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean g() {
        return this.f478829n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: getDuration */
    public int mo67219x51e8b0a() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d = this.f478827l;
        if (c26520x2c78c47d != null) {
            return (int) c26520x2c78c47d.mo100917x37a7fa50();
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean h() {
        return this.f478829n && this.f478831p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean i() {
        if (this.f478827l != null) {
            try {
                return w();
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void j(boolean z17) {
        try {
            if (this.f478827l == null || w()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "music is playing");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "resume requestFocus:%b", java.lang.Boolean.valueOf(z17));
                if (z17 && t(this.f478828m) && !s()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.TPMusicPlayer", "request focus error");
                }
                this.f478827l.mo100975x68ac462();
                o(this.f478828m);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "resume", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: pause */
    public void mo67220x65825f6() {
        this.f478831p = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "pause");
        try {
            if (this.f478827l == null || !w()) {
                return;
            }
            this.f478827l.mo100930x65825f6();
            this.f478830o = true;
            n(this.f478828m);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "pause", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: resume */
    public void mo67221xc84dc82d() {
        j(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    /* renamed from: stopPlay */
    public void mo67222x66343656() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.TPMusicPlayer", "stopPlay");
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d = this.f478827l;
            if (c26520x2c78c47d != null) {
                c26520x2c78c47d.mo100976x360802();
                this.f478827l = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.TPMusicPlayer", e17, "stopPlay", new java.lang.Object[0]);
        }
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.a();
        }
        this.f478829n = false;
        this.f478831p = false;
    }

    public void v() {
        this.f478762d = (kl3.h) sl3.b.b(kl3.h.class);
        this.f478763e = kl3.t.l();
    }

    public final boolean w() {
        return this.f478827l.mo100916xb7d72d0e() == 5;
    }
}
