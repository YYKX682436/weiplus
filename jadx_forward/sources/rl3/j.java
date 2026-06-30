package rl3;

/* loaded from: classes14.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i {

    /* renamed from: d, reason: collision with root package name */
    public gp.c f478780d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f478781e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.AudioTrack f478782f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f478783g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f478784h = true;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f478785i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f478786j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f478787k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f478788l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f478789m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f478790n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f478791o = new rl3.i(this);

    public static boolean l(rl3.j jVar) {
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", "createAudioTrack");
        int i17 = jVar.f478787k == 1 ? 4 : 12;
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(jVar.f478786j, i17, 2);
        if (((kl3.f) sl3.b.b(kl3.f.class)) != null) {
            jVar.f478782f = new to.e(3, jVar.f478786j, i17, 2, minBufferSize, 1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMPlayer", "mediaResService null");
        }
        if (jVar.f478782f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMPlayer", "audioTrack is null, new AudioTrack");
            jVar.f478782f = new android.media.AudioTrack(3, jVar.f478786j, i17, 2, minBufferSize, 1);
        }
        android.media.AudioTrack audioTrack = jVar.f478782f;
        if (audioTrack != null && audioTrack.getState() == 1) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMPlayer", "audio track not initialized");
        android.media.AudioTrack audioTrack2 = jVar.f478782f;
        if (audioTrack2 != null) {
            try {
                audioTrack2.release();
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static void m(rl3.j jVar) {
        jVar.getClass();
        try {
            android.media.AudioTrack audioTrack = jVar.f478782f;
            if (audioTrack != null) {
                audioTrack.flush();
                jVar.f478782f.release();
                jVar.f478782f = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMPlayer", e17, "releaseAudioTrack", new java.lang.Object[0]);
        }
    }

    public static void n(rl3.j jVar) {
        jVar.getClass();
        try {
            gp.c cVar = jVar.f478780d;
            if (cVar != null) {
                cVar.g();
                jVar.f478780d = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMPlayer", e17, "releaseMediaExtractor", new java.lang.Object[0]);
        }
    }

    public static void o(rl3.j jVar) {
        jVar.getClass();
        try {
            wo.i1 i1Var = jVar.f478781e;
            if (i1Var != null) {
                i1Var.y();
                jVar.f478781e.q();
                jVar.f478781e = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMPlayer", e17, "releaseMediaCodec", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public int a() {
        return (int) (this.f478788l / 1000);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public int b() {
        return (int) (this.f478789m / 1000);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public java.lang.String c() {
        return this.f478785i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public boolean d() {
        return !this.f478784h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public boolean e() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.o oVar = this.f232198c;
        synchronized (oVar) {
            z17 = oVar.f232199a == 3;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void f(boolean z17) {
        this.f232198c.f232199a = 4;
        this.f478784h = true;
        super.f(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", "pause");
        if (!this.f478784h) {
            this.f232198c.f232199a = 2;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void h() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        boolean z18 = !this.f478784h;
        if (!z18) {
            this.f478784h = false;
            s75.d.b(this.f478791o, "music_player");
            return;
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.o oVar = this.f232198c;
            synchronized (oVar) {
                z17 = oVar.f232199a == 2;
            }
            if (z17) {
                oVar.f232199a = 3;
                synchronized (this) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", "sync notify");
                    try {
                        notify();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMPlayer", e17, "syncNotify", new java.lang.Object[0]);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void i(long j17) {
        this.f478780d.h(j17 * 1000, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void j(java.lang.String str) {
        this.f478783g = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void k() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", "stop");
        this.f478784h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.o oVar = this.f232198c;
        synchronized (oVar) {
            z17 = oVar.f232199a == 2;
        }
        if (z17) {
            synchronized (this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", "sync notify");
                try {
                    notify();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMPlayer", e17, "syncNotify", new java.lang.Object[0]);
                }
            }
        }
    }

    public void p(boolean z17) {
        this.f232198c.f232199a = 4;
        this.f478784h = true;
        if (this.f232196a != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.e(this, z17));
        }
    }

    public synchronized void q() {
        boolean z17;
        while (true) {
            try {
                if (!(!this.f478784h)) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.o oVar = this.f232198c;
                synchronized (oVar) {
                    z17 = oVar.f232199a == 2;
                }
                if (!z17) {
                    break;
                }
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMPlayer", "wait play");
                    wait();
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMPlayer", e17, "waitPlay", new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
