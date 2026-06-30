package ye1;

/* loaded from: classes15.dex */
public class e0 extends ye1.a {

    /* renamed from: q, reason: collision with root package name */
    public android.media.MediaPlayer f542731q;

    /* renamed from: r, reason: collision with root package name */
    public final android.media.MediaPlayer.OnErrorListener f542732r;

    public e0() {
        ye1.x xVar = new ye1.x(this);
        ye1.y yVar = new ye1.y(this);
        ye1.z zVar = new ye1.z(this);
        ye1.a0 a0Var = new ye1.a0(this);
        ye1.b0 b0Var = new ye1.b0(this);
        ye1.c0 c0Var = new ye1.c0(this);
        this.f542732r = c0Var;
        ye1.d0 d0Var = new ye1.d0(this);
        to.g gVar = new to.g();
        this.f542731q = gVar;
        gVar.setScreenOnWhilePlaying(true);
        this.f542731q.setAudioStreamType(3);
        this.f542731q.setOnInfoListener(a0Var);
        this.f542731q.setOnErrorListener(c0Var);
        this.f542731q.setOnPreparedListener(xVar);
        this.f542731q.setOnCompletionListener(zVar);
        this.f542731q.setOnSeekCompleteListener(b0Var);
        this.f542731q.setOnVideoSizeChangedListener(yVar);
        this.f542731q.setOnBufferingUpdateListener(d0Var);
    }

    public final boolean M() {
        return this.f542731q != null;
    }

    public final void N(int i17) {
        android.media.MediaPlayer.OnErrorListener onErrorListener = this.f542732r;
        if (onErrorListener != null) {
            ((ye1.c0) onErrorListener).onError(this.f542731q, -1024, i17);
        }
    }

    @Override // ye1.e
    public void b(boolean z17) {
        try {
            if (M()) {
                this.f542731q.setLooping(z17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setLooping fail", java.lang.Integer.valueOf(hashCode()));
            N(-10);
        }
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        try {
            if (M()) {
                this.f542731q.setVolume(f17, f18);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setVolume fail", java.lang.Integer.valueOf(hashCode()));
            N(-13);
        }
    }

    @Override // ye1.e
    public boolean f(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setSpeed fail", java.lang.Integer.valueOf(hashCode()));
            N(-14);
        }
        if (!M()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SameLayer.SystemMediaPlayer", "%s setSpeed, current system(%d) not support play speed setting", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return false;
        }
        android.media.PlaybackParams playbackParams = this.f542731q.getPlaybackParams();
        playbackParams.setSpeed(f17);
        if (this.f542731q.isPlaying()) {
            this.f542731q.setPlaybackParams(playbackParams);
        } else {
            this.f542731q.setPlaybackParams(playbackParams);
            this.f542731q.pause();
        }
        return true;
    }

    @Override // ye1.e
    /* renamed from: getCurrentPosition */
    public int mo1851x9746038c() {
        try {
            if (!M()) {
                return 0;
            }
            int i17 = this.f542695a;
            if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6) {
                return this.f542731q.getCurrentPosition();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getCurrentPosition fail", java.lang.Integer.valueOf(hashCode()));
            N(-15);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: getDuration */
    public int mo1852x51e8b0a() {
        int i17;
        try {
            if (!M() || (i17 = this.f542695a) == -1 || i17 == 1 || i17 == 0) {
                return 0;
            }
            return this.f542731q.getDuration();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getDuration fail", java.lang.Integer.valueOf(hashCode()));
            N(-16);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: getPlayerType */
    public int mo1853x6b2cfdb1() {
        return 1;
    }

    @Override // ye1.e
    /* renamed from: getVideoHeight */
    public int mo1854x463504c() {
        try {
            if (M()) {
                return this.f542731q.getVideoHeight();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getVideoHeight fail", java.lang.Integer.valueOf(hashCode()));
            N(-18);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: getVideoWidth */
    public int mo1855x8d5c7601() {
        try {
            if (M()) {
                return this.f542731q.getVideoWidth();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getVideoWidth fail", java.lang.Integer.valueOf(hashCode()));
            N(-17);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: isPlaying */
    public boolean mo1856xc00617a4() {
        int i17;
        try {
            if (!M() || (i17 = this.f542695a) == -1 || i17 == -2 || i17 == 0 || i17 == 1) {
                return false;
            }
            return this.f542731q.isPlaying();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s isPlaying fail", java.lang.Integer.valueOf(hashCode()));
            N(-9);
            return false;
        }
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class cls) {
        if (ye1.e0.class.isAssignableFrom(cls)) {
            return this;
        }
        return null;
    }

    @Override // ye1.e
    public void m(java.lang.String str, java.lang.String str2) {
        try {
            if (M()) {
                if (str2 == null) {
                    this.f542731q.setDataSource(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.SystemMediaPlayer", "setDataSource, referrer: ".concat(str2));
                    this.f542731q.setDataSource(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.net.Uri.parse(str), java.util.Collections.singletonMap("Referer", str2));
                }
                this.f542695a = 1;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setDataSource fail", java.lang.Integer.valueOf(hashCode()));
            N(-11);
        }
    }

    @Override // ye1.e
    /* renamed from: pause */
    public void mo1857x65825f6() {
        try {
            if (M()) {
                int i17 = this.f542695a;
                if (i17 == 2 || i17 == 3 || i17 == 6) {
                    this.f542731q.pause();
                    this.f542695a = 4;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s pause fail", java.lang.Integer.valueOf(hashCode()));
            N(-2);
        }
    }

    @Override // ye1.e
    /* renamed from: prepareAsync */
    public void mo1858x857611b5() {
        try {
            if (M()) {
                this.f542731q.prepareAsync();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s prepareAsync fail", java.lang.Integer.valueOf(hashCode()));
            N(-6);
        }
    }

    @Override // ye1.e
    /* renamed from: release */
    public void mo1859x41012807() {
        try {
            if (M()) {
                android.media.MediaPlayer mediaPlayer = this.f542731q;
                if (mediaPlayer != null) {
                    mediaPlayer.setOnInfoListener(null);
                    this.f542731q.setOnErrorListener(null);
                    this.f542731q.setOnPreparedListener(null);
                    this.f542731q.setOnCompletionListener(null);
                    this.f542731q.setOnSeekCompleteListener(null);
                    this.f542731q.setOnBufferingUpdateListener(null);
                    this.f542731q.setOnVideoSizeChangedListener(null);
                }
                this.f542731q.release();
                this.f542695a = -2;
                this.f542696b = true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s release fail", java.lang.Integer.valueOf(hashCode()));
            N(-8);
        }
    }

    @Override // ye1.e
    /* renamed from: reset */
    public void mo1860x6761d4f() {
        try {
            if (M()) {
                this.f542731q.reset();
                this.f542695a = 0;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s reset fail", java.lang.Integer.valueOf(hashCode()));
            N(-7);
        }
    }

    @Override // ye1.e
    /* renamed from: seekTo */
    public void mo1861xc9fc1b13(long j17) {
        try {
            if (M()) {
                int i17 = this.f542695a;
                if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6) {
                    this.f542731q.seekTo((int) j17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s seekTo fail", java.lang.Integer.valueOf(hashCode()));
            N(-3);
        }
    }

    @Override // ye1.e
    /* renamed from: setDataSource */
    public void mo1862x683d6267(java.lang.String str) {
        m(str, null);
    }

    @Override // ye1.e
    /* renamed from: setMute */
    public void mo1863x764d819b(boolean z17) {
        if (M()) {
            if (z17) {
                c(0.0f, 0.0f);
            } else {
                c(1.0f, 1.0f);
            }
        }
    }

    @Override // ye1.e
    /* renamed from: setSurface */
    public void mo1864x42c875eb(android.view.Surface surface) {
        try {
            if (M()) {
                this.f542731q.setSurface(surface);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setSurface fail", java.lang.Integer.valueOf(hashCode()));
            N(-12);
        }
    }

    @Override // ye1.e
    /* renamed from: start */
    public void mo1865x68ac462() {
        try {
            if (M()) {
                int i17 = this.f542695a;
                if (i17 == 2 || i17 == 4 || i17 == 6) {
                    this.f542731q.start();
                    this.f542695a = 3;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s start fail", java.lang.Integer.valueOf(hashCode()));
            N(-1);
        }
    }

    @Override // ye1.e
    /* renamed from: stop */
    public void mo1866x360802() {
        try {
            if (M()) {
                int i17 = this.f542695a;
                if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6) {
                    this.f542731q.stop();
                    this.f542695a = 5;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s stop fail", java.lang.Integer.valueOf(hashCode()));
            N(-4);
        }
    }

    @Override // ye1.e
    public void y(java.lang.String str, int i17) {
        m(str, null);
    }
}
