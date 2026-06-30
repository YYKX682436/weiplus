package fi3;

/* loaded from: classes10.dex */
public class e extends bi3.b {

    /* renamed from: b, reason: collision with root package name */
    public fi3.a f344488b;

    /* renamed from: c, reason: collision with root package name */
    public fi3.l f344489c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f344490d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f344491e;

    /* renamed from: f, reason: collision with root package name */
    public final int f344492f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344493g;

    /* renamed from: h, reason: collision with root package name */
    public final int f344494h;

    /* renamed from: i, reason: collision with root package name */
    public final int f344495i;

    /* renamed from: j, reason: collision with root package name */
    public final int f344496j;

    /* renamed from: k, reason: collision with root package name */
    public final int f344497k;

    /* renamed from: l, reason: collision with root package name */
    public final int f344498l;

    /* renamed from: m, reason: collision with root package name */
    public final int f344499m;

    /* renamed from: n, reason: collision with root package name */
    public final long f344500n;

    /* renamed from: o, reason: collision with root package name */
    public final long f344501o;

    /* renamed from: p, reason: collision with root package name */
    public final int f344502p;

    /* renamed from: q, reason: collision with root package name */
    public int f344503q;

    /* renamed from: r, reason: collision with root package name */
    public int f344504r;

    /* renamed from: s, reason: collision with root package name */
    public gp.c f344505s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Point f344506t;

    /* renamed from: u, reason: collision with root package name */
    public int f344507u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.HandlerThread f344508v;

    /* renamed from: w, reason: collision with root package name */
    public fi3.d f344509w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f344510x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f344511y;

    public e(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27) {
        this.f344498l = -1;
        this.f344500n = -1L;
        this.f344501o = -1L;
        this.f344502p = -1;
        this.f344506t = null;
        this.f344511y = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f344490d = str;
            this.f344491e = str2;
            this.f344494h = i17;
            this.f344495i = i18;
            this.f344496j = i19;
            this.f344502p = i27;
            int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str);
            this.f344497k = m69179x9787f6ed;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
            if (d17 != null) {
                this.f344492f = d17.f243917c;
                this.f344493g = d17.f243918d;
                this.f344498l = d17.f243915a;
                this.f344499m = d17.f243919e;
            }
            this.f344500n = 0L;
            this.f344501o = this.f344498l;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", str, str2, java.lang.Integer.valueOf(this.f344492f), java.lang.Integer.valueOf(this.f344493g), java.lang.Integer.valueOf(m69179x9787f6ed), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }

    @Override // bi3.b
    public int a() {
        return 1;
    }

    @Override // bi3.b
    public int b() {
        long j17;
        int f17;
        java.lang.String str;
        int i17 = this.f344498l;
        int round = java.lang.Math.round(i17 / 1000.0f);
        long j18 = this.f344500n;
        long j19 = this.f344501o;
        if (j18 >= 0 && j19 >= 0) {
            round = java.lang.Math.round(((float) (j19 - j18)) / 1000.0f) + 1;
        }
        this.f344507u = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66890x51335404(round);
        if (com.p314xaae8f345.mm.p962x4177e4be.j.h(this.f344490d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "ish265, create mediacodec decoder");
            this.f344488b = new fi3.j();
        } else {
            this.f344488b = new fi3.h();
        }
        if (i17 <= 0) {
            j17 = j18;
            long j27 = this.f344500n;
            if (j27 >= 0) {
                long j28 = this.f344501o;
                if (j28 >= 0) {
                    f17 = this.f344488b.f(this.f344490d, j27, j28, this.f344499m);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(this.f344507u);
            return -1;
        }
        j17 = j18;
        f17 = this.f344488b.f(this.f344490d, 0L, i17, this.f344499m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "decoder init ret: %s", java.lang.Integer.valueOf(f17));
        if (f17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(this.f344507u);
            return -1;
        }
        int i18 = this.f344502p;
        int i19 = this.f344499m;
        if (i18 > 0 && i18 < i19) {
            this.f344488b.c((int) java.lang.Math.ceil(i19 / i18));
        }
        if (i18 > 0) {
            i19 = java.lang.Math.min(i18, i19);
        }
        this.f344489c = new fi3.l(this.f344492f, this.f344493g, this.f344494h, this.f344495i, this.f344496j, 1, i19);
        this.f344488b.b(new fi3.b(this));
        fi3.l lVar = this.f344489c;
        lVar.f344557b = new fi3.c(this);
        try {
            int i27 = this.f344507u;
            lVar.getClass();
            try {
                lVar.f344556a = i27;
                lVar.b();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "init error: %s, try to re-init again", e17.getMessage());
                try {
                    lVar.b();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "re-init again error: %s", e18.getMessage());
                    di3.x.f();
                }
            }
            fi3.l lVar2 = this.f344489c;
            lVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "Start");
            lVar2.f344571p = true;
            this.f344488b.d();
            this.f344508v.quitSafely();
            this.f344508v.join();
            this.f344509w = null;
            d();
            int i28 = this.f344497k;
            java.lang.String str2 = this.f344491e;
            if (i28 > 0) {
                str = str2 + "tempRotate.mp4";
            } else {
                str = str2;
            }
            long j29 = i17;
            if (j29 <= 0) {
                j29 = j19 - j17;
            }
            int m66897xec0bfe5d = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66897xec0bfe5d(this.f344507u, this.f344503q, 1024, 2, this.f344504r, str, (this.f344489c.f344561f * 1000.0f) / ((float) j29), null, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxing ret: %s", java.lang.Integer.valueOf(m66897xec0bfe5d));
            if (i28 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69252x50488dfd(str, str2, i28);
                com.p314xaae8f345.mm.vfs.w6.h(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(this.f344507u);
            ei3.x.f334720d.c();
            return m66897xec0bfe5d;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightFFMpegMediaCodecRemuxer", e19, "decode error: %s", e19.getMessage());
            return -1;
        }
    }

    @Override // bi3.b
    public void c(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.f344510x = bitmap;
        }
    }

    public final void d() {
        gp.c cVar = new gp.c();
        this.f344505s = cVar;
        try {
            cVar.k(this.f344490d);
            android.media.MediaFormat mediaFormat = null;
            java.lang.String str = null;
            int i17 = 0;
            while (true) {
                if (i17 >= this.f344505s.d()) {
                    i17 = -1;
                    break;
                }
                android.media.MediaFormat e17 = this.f344505s.e(i17);
                java.lang.String string = e17.getString("mime");
                if (string.startsWith("audio/")) {
                    mediaFormat = e17;
                    str = string;
                    break;
                } else {
                    i17++;
                    str = string;
                }
            }
            if (i17 < 0 || mediaFormat == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            this.f344504r = mediaFormat.getInteger("channel-count");
            this.f344503q = mediaFormat.getInteger("sample-rate");
            this.f344505s.i(i17);
            long j17 = this.f344500n;
            if (j17 > 0) {
                this.f344505s.h(j17 * 1000, 0);
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
            while (true) {
                allocateDirect.clear();
                int f17 = this.f344505s.f(allocateDirect, 0);
                if (f17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "muxAudio size = %d. Saw eos.", java.lang.Integer.valueOf(f17));
                    return;
                }
                if (this.f344505s.b() >= this.f344501o * 1000) {
                    return;
                }
                if (this.f344505s.c() != i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "track index not match! break");
                    return;
                } else {
                    allocateDirect.position(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66904xb00a27f9(this.f344507u, allocateDirect, f17);
                    this.f344505s.a();
                }
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightFFMpegMediaCodecRemuxer", e18, "muxAudio create extractor failed: %s", e18.getMessage());
        }
    }

    public e(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long j17, long j18) {
        this.f344498l = -1;
        this.f344500n = -1L;
        this.f344501o = -1L;
        this.f344502p = -1;
        this.f344506t = null;
        this.f344511y = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f344490d = str;
            this.f344491e = str2;
            this.f344494h = i17;
            this.f344495i = i18;
            this.f344496j = i19;
            this.f344502p = i27;
            int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str);
            this.f344497k = m69179x9787f6ed;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
            if (d17 != null) {
                this.f344492f = d17.f243917c;
                this.f344493g = d17.f243918d;
                this.f344499m = d17.f243919e;
            }
            this.f344500n = j17;
            this.f344501o = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", str, str2, java.lang.Integer.valueOf(this.f344492f), java.lang.Integer.valueOf(this.f344493g), java.lang.Integer.valueOf(m69179x9787f6ed), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegMediaCodecRemuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }
}
