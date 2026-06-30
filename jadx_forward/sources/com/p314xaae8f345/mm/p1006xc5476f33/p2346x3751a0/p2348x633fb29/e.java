package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class e {
    public vl.a Q;

    /* renamed from: v, reason: collision with root package name */
    public wu5.b f257992v;

    /* renamed from: a, reason: collision with root package name */
    public boolean f257971a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f257972b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f257973c = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f257974d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f257975e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f257976f = null;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f257977g = null;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f257978h = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f257979i = null;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f257980j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f257981k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f257982l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f257983m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f257984n = 20;

    /* renamed from: o, reason: collision with root package name */
    public android.media.AudioTrack f257985o = null;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f257986p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b f257987q = null;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f257988r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f257989s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f257990t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f257991u = false;

    /* renamed from: w, reason: collision with root package name */
    public int f257993w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f257994x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f257995y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f257996z = 0;
    public int A = 1;
    public int B = 0;
    public long C = 0;
    public int D = 1;
    public int E = 0;
    public int F = -1;
    public int G = 0;
    public final int H = 1;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.Object f257970J = new java.lang.Object();
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public boolean R = false;

    public int a() {
        int i17 = this.f257981k;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "nSamplerate is no init now  ");
            return 0;
        }
        android.media.AudioTrack audioTrack = this.f257985o;
        if (audioTrack == null) {
            return (this.f257996z * 1000) / i17;
        }
        if (!this.f257971a || audioTrack.getState() == 0) {
            return (this.f257996z * 1000) / this.f257981k;
        }
        try {
            return ((this.f257993w - this.f257985o.getPlaybackHeadPosition()) * 1000) / this.f257981k;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack getPlaybackHeadPosition error:%s", e17.getMessage());
            return (this.f257996z * 1000) / this.f257981k;
        }
    }

    public int b(android.content.Context context, boolean z17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f257986p;
        if (this.f257982l == 2) {
            this.f257973c = 3;
        } else {
            this.f257973c = 2;
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f257981k, this.f257973c, 2);
        this.f257974d = minBufferSize;
        if (minBufferSize == -2 || minBufferSize == -1) {
            this.K = 1;
            return -1;
        }
        this.f257996z = minBufferSize;
        this.E = this.D * minBufferSize;
        this.f257974d = this.H * minBufferSize;
        float f17 = (minBufferSize >> 1) / this.f257981k;
        int a17 = wo.r.a();
        int i17 = wo.v1.f529356c.f529147m0;
        if ((a17 & 1024) != 0) {
            if (i17 <= 0) {
                i17 = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "CPU ARMv7, ablePlayTimer: " + i17);
        }
        this.f257972b = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "playBufSize:" + this.f257974d + "  MinBufSizeInMs:" + f17 + ",bPlayTimer:" + this.f257972b);
        int h17 = h(z17);
        try {
            if (this.f257985o != null) {
                try {
                    atomicBoolean.compareAndSet(false, true);
                    this.f257985o.release();
                } catch (java.lang.Exception unused) {
                }
            }
            this.f257985o = new to.e(h17, this.f257981k, this.f257973c, 2, this.f257974d, 1);
            atomicBoolean.compareAndSet(true, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Voip.AudioPlayer", "new AudioTrack:", e17);
            this.K = 6;
        }
        android.media.AudioTrack audioTrack = this.f257985o;
        if (audioTrack == null || audioTrack.getState() == 0) {
            this.K = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer audioTrack.getState() == AudioTrack.STATE_UNINITIALIZED");
            if (this.f257985o != null) {
                atomicBoolean.compareAndSet(false, true);
                this.f257985o.release();
            }
            if (h17 == 0) {
                this.f257985o = new to.e(3, this.f257981k, this.f257973c, 2, this.f257974d, 1);
            } else {
                this.f257985o = new to.e(0, this.f257981k, this.f257973c, 2, this.f257974d, 1);
            }
            atomicBoolean.compareAndSet(true, false);
        }
        android.media.AudioTrack audioTrack2 = this.f257985o;
        if (audioTrack2 == null) {
            this.K = 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "null == audioTrack return");
            return -1;
        }
        if (audioTrack2.getState() == 0) {
            this.K = 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer STATE_UNINITIALIZED call AudioTrack.release() and return");
            atomicBoolean.compareAndSet(false, true);
            this.f257985o.release();
            this.f257985o = null;
            return -1;
        }
        int i18 = this.f257974d;
        this.f257976f = new byte[i18];
        int i19 = this.f257984n;
        this.f257979i = new byte[i19];
        if (this.f257972b) {
            this.f257975e = i18;
            this.f257977g = new byte[i18];
            this.f257978h = new byte[i18];
            this.f257980j = new byte[i19];
        }
        this.f257971a = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "dkbt AudioTrack init ok, mode:%d issp:%b m:%d size %d,nSamplerate:%d", java.lang.Integer.valueOf(ym1.f.Bi()), java.lang.Boolean.valueOf(ym1.f.f544667h.k()), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(this.f257974d), java.lang.Integer.valueOf(this.f257981k));
        return (this.f257974d * 1000) / (this.f257981k * 2);
    }

    public int c(int i17, int i18, int i19, int i27) {
        if (true == this.f257971a) {
            return 0;
        }
        this.f257981k = i17;
        this.f257982l = i18;
        this.f257983m = i19;
        this.N = i27;
        this.f257984n = (i17 / 1000) * i18 * i19 * 2;
        this.G = (i17 * 60) / 1000;
        return 1;
    }

    public int d() {
        int i17;
        if (true == this.f257971a) {
            return 1;
        }
        android.media.AudioTrack audioTrack = this.f257985o;
        if (audioTrack == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: audioTrack is null!!");
            return 0;
        }
        this.f257971a = true;
        try {
            audioTrack.play();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack.play Exception:%s", e17.getMessage());
        }
        android.media.AudioTrack audioTrack2 = this.f257985o;
        if (audioTrack2 != null && audioTrack2.getPlayState() != 3) {
            this.K = 4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack play error: AudioTrack.PLAYSTATE_PLAYING, play do not start !");
            return 0;
        }
        android.media.AudioTrack audioTrack3 = this.f257985o;
        if (audioTrack3 != null && audioTrack3.getState() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: AudioTrack.STATE_UNINITIALIZED, no more AudioTrack resource!!");
            return 0;
        }
        if (this.f257972b) {
            if (this.f257988r != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Voip.AudioPlayer", "Task has been created. " + this.f257988r);
                i17 = -1;
            } else {
                i17 = 0;
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "InitAudioRecTimer failed, error code = " + i17);
                return 0;
            }
            this.f257988r = ((ku5.t0) ku5.t0.f394148d).e(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d(this), 0L, 20L);
        }
        this.Q = new vl.a();
        this.f257992v = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c(this);
        ((ku5.t0) ku5.t0.f394148d).A("AudioPlayer_play");
        ((ku5.t0) ku5.t0.f394148d).h(this.f257992v, "AudioPlayer_play");
        return 1;
    }

    public int e() {
        wu5.c cVar = this.f257988r;
        if (cVar != null) {
            cVar.cancel(false);
            this.f257988r = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call stop play");
        if (!this.f257971a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call stop play failed cause current is not playing ");
            return 1;
        }
        this.f257971a = false;
        this.I = 0;
        try {
            i();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.AudioPlayer", e17, "", new java.lang.Object[0]);
        }
        try {
            if (this.f257985o != null) {
                this.f257986p.compareAndSet(false, true);
                this.f257992v.b();
                ((ku5.t0) ku5.t0.f394148d).A("AudioPlayer_play");
                this.f257985o.stop();
                this.f257985o.release();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "StopPlay stop audioTrack");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "StopPlay audioTrack.stop Exception:%s", e18.getMessage());
        }
        return 1;
    }

    public int f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call uninit");
        if (this.f257985o != null) {
            this.f257986p.compareAndSet(false, true);
            this.f257985o.release();
            this.f257985o = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call uninit failed cause audio track is null");
        }
        this.f257971a = false;
        return 1;
    }

    public int g() {
        android.media.AudioTrack audioTrack = this.f257985o;
        return audioTrack != null ? audioTrack.getStreamType() : h(true);
    }

    public final int h(boolean z17) {
        int i17;
        int i18;
        int i19;
        int i27;
        wo.c cVar = wo.v1.f529356c;
        if (cVar.f529124b > 0) {
            i17 = ym1.f.f544667h.g(z17);
        } else {
            i17 = cVar.D;
            if (i17 <= -1) {
                i17 = 0;
            }
        }
        if ((z17 && (i18 = cVar.E) > -1) || (!z17 && (i18 = cVar.F) > -1)) {
            i17 = i18;
        }
        if (1 != this.N) {
            return i17;
        }
        int i28 = cVar.f529165v0;
        if (i28 > -1) {
            i17 = i28;
        }
        return (!z17 || (i27 = cVar.f529167w0) <= -1) ? (z17 || (i19 = cVar.f529169x0) <= -1) ? i17 : i19 : i27;
    }

    public final void i() {
        wu5.b bVar = this.f257992v;
        if (bVar != null) {
            try {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                java.util.concurrent.Future future = bVar.f531374d;
                if (future == null || future.isCancelled()) {
                    return;
                }
                bVar.f531374d.get(3L, timeUnit);
            } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.AudioPlayer", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public boolean j(boolean z17) {
        int h17 = ym1.f.Ni() ? 0 : h(z17);
        android.media.AudioTrack audioTrack = this.f257985o;
        if (audioTrack != null && h17 == audioTrack.getStreamType()) {
            return false;
        }
        e();
        this.f257991u = true;
        if (this.f257982l == 2) {
            this.f257973c = 3;
        } else {
            this.f257973c = 2;
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f257981k, this.f257973c, 2);
        this.f257974d = minBufferSize;
        if (minBufferSize == -2 || minBufferSize == -1) {
            this.f257991u = false;
            return false;
        }
        this.f257993w = 0;
        this.f257995y = 0;
        this.A = 1;
        this.B = 0;
        this.C = 0L;
        this.D = 1;
        this.F = -1;
        this.G = 0;
        this.f257996z = minBufferSize;
        this.E = minBufferSize * 1;
        this.f257974d = minBufferSize * this.H;
        if (this.f257985o != null) {
            try {
                this.f257986p.compareAndSet(false, true);
                this.f257992v.b();
                ((ku5.t0) ku5.t0.f394148d).A("AudioPlayer_play");
                this.f257985o.stop();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone audioTrack.stop Exception:%s", e17.getMessage());
            }
            this.f257985o.release();
            this.f257985o = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.AudioPlayer", "AudioPlayer dkbt switchSpeakerPhone mode:%d issp:%b m:%d size %d,nSamplerate:%d", java.lang.Integer.valueOf(ym1.f.Bi()), java.lang.Boolean.valueOf(ym1.f.f544667h.k()), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(this.f257974d), java.lang.Integer.valueOf(this.f257981k));
        to.e eVar = new to.e(h17, this.f257981k, this.f257973c, 2, this.f257974d, 1);
        this.f257985o = eVar;
        if (eVar.getState() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone STATE_UNINITIALIZED call AudioTrack.release() and return");
            this.f257986p.compareAndSet(false, true);
            this.f257985o.release();
            this.f257985o = null;
            return false;
        }
        if (this.f257985o == null) {
            this.f257991u = false;
            return false;
        }
        this.f257991u = false;
        d();
        return true;
    }
}
