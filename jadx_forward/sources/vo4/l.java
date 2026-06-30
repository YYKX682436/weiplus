package vo4;

/* loaded from: classes10.dex */
public final class l extends vo4.b {
    public long A;

    /* renamed from: p, reason: collision with root package name */
    public android.view.Surface f520184p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.SurfaceTexture f520185q;

    /* renamed from: r, reason: collision with root package name */
    public android.media.MediaExtractor f520186r;

    /* renamed from: s, reason: collision with root package name */
    public android.media.MediaCodec f520187s;

    /* renamed from: t, reason: collision with root package name */
    public android.media.MediaFormat f520188t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f520189u;

    /* renamed from: v, reason: collision with root package name */
    public int f520190v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f520191w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f520192x;

    /* renamed from: y, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f520193y;

    /* renamed from: z, reason: collision with root package name */
    public int f520194z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 material) {
        super(i17, i18, i19, material, false, 16, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(material, "material");
        this.f520189u = "";
        this.f520190v = -1;
        this.f520193y = new android.media.MediaCodec.BufferInfo();
        this.f520194z = -1;
        this.A = -1L;
    }

    @Override // vo4.b
    public void a(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[EDGE_INSN: B:46:0x0109->B:47:0x0109 BREAK  A[LOOP:0: B:2:0x0007->B:35:0x0007], SYNTHETIC] */
    @Override // vo4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo4.l.b(long, boolean):void");
    }

    @Override // vo4.b
    public void c() {
        this.f520149o = true;
        this.f520185q = new android.graphics.SurfaceTexture(this.f520135a);
        this.f520184p = new android.view.Surface(this.f520185q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = this.f520138d;
        int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(p0Var.f257243c);
        this.f520146l = m69179x9787f6ed;
        if (m69179x9787f6ed == 90) {
            this.f520146l = 1;
        } else if (m69179x9787f6ed == 180) {
            this.f520146l = 2;
        } else if (m69179x9787f6ed == 270) {
            this.f520146l = 3;
        }
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        mediaExtractor.setDataSource(p0Var.f257243c);
        int trackCount = mediaExtractor.getTrackCount();
        int i17 = 0;
        while (true) {
            if (i17 >= trackCount) {
                break;
            }
            android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(trackFormat, "getTrackFormat(...)");
            java.lang.String string = trackFormat.getString("mime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (r26.i0.y(string, "video", false)) {
                this.f520140f = trackFormat.getInteger("width");
                this.f520141g = trackFormat.getInteger("height");
                java.lang.String string2 = trackFormat.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                this.f520189u = string2;
                this.f520188t = trackFormat;
                this.f520190v = i17;
                break;
            }
            i17++;
        }
        mediaExtractor.release();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepare video, rotate = ");
        sb6.append(this.f520146l);
        sb6.append(", width = ");
        sb6.append(this.f520140f);
        sb6.append(", height = ");
        sb6.append(this.f520141g);
        sb6.append(", startTime = ");
        sb6.append(p0Var.f257241a);
        sb6.append(", endTime = ");
        sb6.append(p0Var.f257242b);
        sb6.append(", videoStartTime = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
        sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257244d);
        sb6.append(", videoEndTime = ");
        sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257245e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
    }

    @Override // vo4.b
    public void d(long j17) {
        if (this.f520148n) {
            return;
        }
        this.f520148n = true;
        java.lang.System.currentTimeMillis();
        android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
        this.f520186r = mediaExtractor;
        mediaExtractor.setDataSource(this.f520138d.f257243c);
        android.media.MediaExtractor mediaExtractor2 = this.f520186r;
        if (mediaExtractor2 != null) {
            mediaExtractor2.selectTrack(this.f520190v);
        }
        android.media.MediaExtractor mediaExtractor3 = this.f520186r;
        if (mediaExtractor3 != null) {
            mediaExtractor3.seekTo(g(j17) * 1000, 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[debug video] play seekTime :");
        sb6.append(g(j17));
        sb6.append(", real seekTime: ");
        android.media.MediaExtractor mediaExtractor4 = this.f520186r;
        sb6.append(mediaExtractor4 != null ? java.lang.Long.valueOf(mediaExtractor4.getSampleTime()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
        if (this.f520188t != null) {
            android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(this.f520189u);
            this.f520187s = createDecoderByType;
            if (createDecoderByType != null) {
                createDecoderByType.configure(this.f520188t, this.f520184p, (android.media.MediaCrypto) null, 0);
            }
            android.media.MediaCodec mediaCodec = this.f520187s;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
        }
        this.A = -1L;
        this.f520194z = -1;
        this.f520191w = false;
        this.f520192x = false;
        java.lang.System.currentTimeMillis();
    }

    @Override // vo4.b
    public void e() {
        this.f520148n = false;
        try {
            android.media.MediaExtractor mediaExtractor = this.f520186r;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            android.media.MediaCodec mediaCodec = this.f520187s;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            android.media.MediaCodec mediaCodec2 = this.f520187s;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            android.view.Surface surface = this.f520184p;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f520185q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, "release error", new java.lang.Object[0]);
        }
        this.f520184p = null;
        this.f520185q = null;
        this.f520186r = null;
        this.f520187s = null;
        this.f520188t = null;
        this.f520149o = false;
    }

    @Override // vo4.b
    public void f() {
        this.f520148n = false;
        try {
            android.media.MediaCodec mediaCodec = this.f520187s;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            android.media.MediaCodec mediaCodec2 = this.f520187s;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            this.f520187s = null;
            android.media.MediaExtractor mediaExtractor = this.f520186r;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.f520186r = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VLogVideoPlayer", e17, "stop error", new java.lang.Object[0]);
        }
    }

    public final long g(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = this.f520138d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var).f257244d + j17;
    }
}
