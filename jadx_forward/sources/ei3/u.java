package ei3;

/* loaded from: classes14.dex */
public abstract class u implements ei3.j {
    public final int A;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 F;

    /* renamed from: a, reason: collision with root package name */
    public wo.i1 f334657a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.MediaFormat f334658b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.MediaCodec.BufferInfo f334659c;

    /* renamed from: e, reason: collision with root package name */
    public int f334661e;

    /* renamed from: f, reason: collision with root package name */
    public int f334662f;

    /* renamed from: g, reason: collision with root package name */
    public long f334663g;

    /* renamed from: h, reason: collision with root package name */
    public long f334664h;

    /* renamed from: i, reason: collision with root package name */
    public int f334665i;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f334673q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f334674r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f334677u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f334678v;

    /* renamed from: x, reason: collision with root package name */
    public ei3.i f334680x;

    /* renamed from: y, reason: collision with root package name */
    public final int f334681y;

    /* renamed from: z, reason: collision with root package name */
    public final int f334682z;

    /* renamed from: d, reason: collision with root package name */
    public long f334660d = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f334666j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f334667k = false;

    /* renamed from: l, reason: collision with root package name */
    public ei3.h f334668l = null;

    /* renamed from: m, reason: collision with root package name */
    public long f334669m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f334670n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f334671o = false;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f334672p = false;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f334675s = new ei3.q(this, android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public volatile tl.w f334676t = null;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f334679w = new byte[0];
    public volatile boolean B = false;
    public long C = 0;
    public long D = -1;
    public boolean E = false;
    public final java.lang.Runnable G = new ei3.r(this);
    public long H = 0;
    public final tl.v I = new ei3.s(this);

    public u(int i17, int i18, int i19, ei3.x0 x0Var, boolean z17) {
        this.f334673q = true;
        this.f334674r = false;
        this.f334682z = i18;
        this.f334681y = i17;
        this.A = i19;
        if (i19 <= 0) {
            this.A = 1;
        }
        this.f334673q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ignore_mediacodec_lock, false);
        this.f334674r = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "create MMSightAACMediaCodecRecorder, audioBitrate: %s, audioSampleRate: %s, audioChannelCount:%s, isUseFFmpegMuxer:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.A), java.lang.Boolean.valueOf(z17));
    }

    @Override // ei3.j
    public void a(boolean z17) {
        this.f334667k = z17;
    }

    @Override // ei3.j
    public int b(ei3.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, onPcmReady: %s", hVar);
        this.f334668l = hVar;
        int i17 = 0;
        if (this.f334667k) {
            this.f334675s.mo50305x3d8a09a2(0);
        } else {
            if (this.f334676t == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, pcmrecorder is null");
                return -1;
            }
            if (!this.f334676t.k()) {
                i17 = -1;
            }
        }
        this.C = 0L;
        this.D = -1L;
        return i17;
    }

    @Override // ei3.j
    public int c(int i17, java.lang.String str) {
        if (!this.f334667k && this.f334676t != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f334680x == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before pcmRecorder stop, stopCallback null ? %B", objArr);
            this.f334676t.l();
        }
        if (this.f334657a != null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(this.f334680x == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before audioEncoder stop, stopCallback null ? %B", objArr2);
            h();
            ei3.i iVar = this.f334680x;
            if (iVar != null) {
                iVar.a();
                this.f334680x = null;
            }
        }
        this.f334677u = false;
        synchronized (this.f334679w) {
            this.f334678v = false;
            this.E = false;
            this.f334680x = null;
        }
        if (!this.f334667k) {
            this.f334676t = new tl.w(this.f334681y, this.A, 5);
            this.f334676t.e(1);
            this.f334676t.g(128);
            this.f334676t.i(true);
            this.f334676t.f501705y = this.I;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.F;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "create pcm control handler");
            this.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        } else if (n3Var.mo50280x23b2dd47() != android.os.Looper.myLooper()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightAACMediaCodecRecorder", "error pcm control handler looper[%s, %s], recreate handler", this.F.mo50280x23b2dd47(), android.os.Looper.myLooper());
            this.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "sample rate %d, audio rate %d", java.lang.Integer.valueOf(this.f334681y), java.lang.Integer.valueOf(this.f334682z));
        try {
            this.f334659c = new android.media.MediaCodec.BufferInfo();
            android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
            this.f334658b = mediaFormat;
            mediaFormat.setString("mime", "audio/mp4a-latm");
            this.f334658b.setInteger("aac-profile", 2);
            this.f334658b.setInteger("sample-rate", this.f334681y);
            this.f334658b.setInteger("channel-count", this.A);
            this.f334658b.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f334682z);
            this.f334658b.setInteger("max-input-size", this.A * 16384);
            wo.i1 d17 = wo.i1.d("audio/mp4a-latm", false);
            this.f334657a = d17;
            d17.a(this.f334658b, null, null, 1);
            this.f334657a.x();
            if (this.f334673q) {
                this.f334671o = false;
                this.f334669m = java.lang.System.currentTimeMillis();
            } else {
                synchronized (this.f334670n) {
                    this.f334671o = false;
                    this.f334669m = java.lang.System.currentTimeMillis();
                }
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightAACMediaCodecRecorder", th6, "start aac encoder error: %s", th6.getMessage());
                h();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecAACInitError");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 15L, 1L, false);
                this.f334666j = false;
                return -1;
            } finally {
                this.f334666j = false;
            }
        }
    }

    @Override // ei3.j
    /* renamed from: clear */
    public void mo127741x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "clear");
        h();
        m();
    }

    @Override // ei3.j
    public void d() {
        this.f334666j = true;
    }

    @Override // ei3.j
    public tl.v e() {
        return this.I;
    }

    @Override // ei3.j
    public int f(ei3.i iVar) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(this.f334676t == null);
        objArr[1] = java.lang.Boolean.valueOf(this.f334680x == null);
        objArr[2] = java.lang.Boolean.valueOf(iVar == null);
        objArr[3] = java.lang.Boolean.valueOf(this.f334677u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "call stop, pcmRecorder null[%B], old stopCallback null[%B]new stopCallback null[%B], pcmMarkStop[%B]", objArr);
        if (this.f334676t == null && !this.f334667k) {
            return -1;
        }
        this.f334677u = true;
        synchronized (this.f334679w) {
            this.f334680x = iVar;
            if (this.f334678v && iVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "has stop, directly call stop callback");
                iVar.a();
                this.f334680x = null;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new ei3.t(this), 500L);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ei3.u.g(boolean):void");
    }

    public void h() {
        if (this.f334673q) {
            i();
            return;
        }
        synchronized (this.f334670n) {
            i();
        }
    }

    public final void i() {
        if (this.f334671o || 0 == this.f334669m) {
            return;
        }
        while (this.f334672p) {
            java.lang.Thread.yield();
        }
        this.f334671o = true;
        try {
            try {
                if (this.f334657a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop encoder");
                    this.f334657a.y();
                    this.f334657a.q();
                    this.f334657a = null;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "clear error: %s", e17.getMessage());
            }
        } finally {
            this.f334657a = null;
        }
    }

    public abstract boolean j();

    public abstract void k(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo);

    public abstract void l(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo, int i17, int i18, int i19);

    public final synchronized void m() {
        if (this.f334676t != null && !this.f334667k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop pcm recorder");
            this.f334676t.l();
            this.f334676t = null;
        }
    }
}
