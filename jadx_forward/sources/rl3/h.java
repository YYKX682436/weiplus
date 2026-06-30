package rl3;

/* loaded from: classes14.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i {

    /* renamed from: d, reason: collision with root package name */
    public rl3.g f478775d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.MediaPlayer f478776e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f478777f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f478778g = false;

    public h() {
        if (((kl3.f) sl3.b.b(kl3.f.class)) != null) {
            this.f478776e = new to.g();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMediaPlayer", "mediaResService is null");
        }
        if (this.f478776e == null) {
            this.f478776e = new android.media.MediaPlayer();
        }
        this.f478776e.setAudioStreamType(3);
        this.f478776e.setOnCompletionListener(new rl3.c(this));
        this.f478776e.setOnSeekCompleteListener(new rl3.d(this));
        this.f478776e.setOnPreparedListener(new rl3.e(this));
        this.f478776e.setOnErrorListener(new rl3.f(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public int a() {
        try {
            return this.f478776e.getCurrentPosition();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "getCurrentPos", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public int b() {
        try {
            return this.f478776e.getDuration();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "getDuration", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public java.lang.String c() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public boolean d() {
        return !this.f478777f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public boolean e() {
        try {
            return this.f478776e.isPlaying();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "setSourcePath", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "pause");
        if (!this.f478777f) {
            this.f478776e.pause();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        boolean z17 = !this.f478777f;
        android.media.MediaPlayer mediaPlayer = this.f478776e;
        if (!z17) {
            try {
                mediaPlayer.prepareAsync();
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "prepareAsync", new java.lang.Object[0]);
                return;
            }
        }
        try {
            if (mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.start();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e18, "start", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void i(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "seek %d", java.lang.Long.valueOf(j17));
        this.f478776e.seekTo((int) j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void j(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "setSourcePath, sourcePath:%s", str);
        try {
            this.f478776e.setDataSource(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "setSourcePath", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.i
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "stop");
        this.f478777f = true;
        android.media.MediaPlayer mediaPlayer = this.f478776e;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "stop", new java.lang.Object[0]);
            }
        }
        rl3.g gVar = this.f478775d;
        if (gVar != null) {
            gVar.f478773d = true;
            this.f478775d = null;
        }
        f(false);
    }
}
