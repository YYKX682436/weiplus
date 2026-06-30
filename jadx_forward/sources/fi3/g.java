package fi3;

/* loaded from: classes10.dex */
public class g extends bi3.b {

    /* renamed from: b, reason: collision with root package name */
    public fi3.a f344513b;

    /* renamed from: c, reason: collision with root package name */
    public fi3.o f344514c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f344515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f344516e;

    /* renamed from: f, reason: collision with root package name */
    public final int f344517f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344518g;

    /* renamed from: h, reason: collision with root package name */
    public final int f344519h;

    /* renamed from: i, reason: collision with root package name */
    public final int f344520i;

    /* renamed from: j, reason: collision with root package name */
    public final int f344521j;

    /* renamed from: k, reason: collision with root package name */
    public final int f344522k;

    /* renamed from: l, reason: collision with root package name */
    public final int f344523l;

    /* renamed from: m, reason: collision with root package name */
    public final int f344524m;

    /* renamed from: n, reason: collision with root package name */
    public final long f344525n;

    /* renamed from: o, reason: collision with root package name */
    public final long f344526o;

    /* renamed from: p, reason: collision with root package name */
    public final int f344527p;

    /* renamed from: q, reason: collision with root package name */
    public int f344528q;

    /* renamed from: r, reason: collision with root package name */
    public int f344529r;

    /* renamed from: s, reason: collision with root package name */
    public final int f344530s;

    /* renamed from: t, reason: collision with root package name */
    public final int f344531t;

    /* renamed from: u, reason: collision with root package name */
    public gp.c f344532u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Point f344533v;

    /* renamed from: w, reason: collision with root package name */
    public int f344534w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f344535x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f344536y;

    public g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f344523l = -1;
        this.f344525n = -1L;
        this.f344526o = -1L;
        this.f344527p = -1;
        this.f344533v = null;
        this.f344536y = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f344515d = str;
            this.f344516e = str2;
            this.f344519h = i17;
            this.f344520i = i18;
            this.f344521j = i19;
            this.f344527p = i27;
            this.f344530s = i28;
            this.f344531t = i29;
            int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str);
            this.f344522k = m69179x9787f6ed;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
            if (d17 != null) {
                this.f344517f = d17.f243917c;
                this.f344518g = d17.f243918d;
                this.f344523l = d17.f243915a;
                this.f344524m = d17.f243919e;
            }
            this.f344525n = 0L;
            this.f344526o = this.f344523l;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", str, str2, java.lang.Integer.valueOf(this.f344517f), java.lang.Integer.valueOf(this.f344518g), java.lang.Integer.valueOf(m69179x9787f6ed), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }

    @Override // bi3.b
    public int a() {
        return 3;
    }

    @Override // bi3.b
    public int b() {
        int f17;
        int i17;
        int round = java.lang.Math.round(this.f344523l / 1000.0f);
        long j17 = this.f344525n;
        if (j17 >= 0) {
            long j18 = this.f344526o;
            if (j18 >= 0) {
                round = java.lang.Math.round(((float) (j18 - j17)) / 1000.0f) + 1;
            }
        }
        this.f344534w = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66890x51335404(round);
        if (com.p314xaae8f345.mm.p962x4177e4be.j.h(this.f344515d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "ish265, create mediacodec decoder");
            this.f344513b = new fi3.j();
        } else {
            this.f344513b = new fi3.h();
        }
        int i18 = this.f344523l;
        if (i18 <= 0) {
            long j19 = this.f344525n;
            if (j19 >= 0) {
                long j27 = this.f344526o;
                if (j27 >= 0) {
                    f17 = this.f344513b.f(this.f344515d, j19, j27, this.f344524m);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "remux time error, videoDuration: %s, remuxStartTime: %s, remuxEndTime: %s", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f344525n), java.lang.Long.valueOf(this.f344526o));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(this.f344534w);
            return -1;
        }
        f17 = this.f344513b.f(this.f344515d, 0L, i18, this.f344524m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "decoder init ret: %s", java.lang.Integer.valueOf(f17));
        if (f17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(this.f344534w);
            return -1;
        }
        int i19 = this.f344527p;
        if (i19 > 0 && i19 < (i17 = this.f344524m)) {
            this.f344513b.c((int) java.lang.Math.ceil(i17 / i19));
        }
        int i27 = this.f344527p;
        int min = i27 > 0 ? java.lang.Math.min(i27, this.f344524m) : this.f344524m;
        this.f344513b.b(new fi3.f(this));
        int i28 = this.f344517f;
        int i29 = this.f344518g;
        int i37 = this.f344519h;
        int i38 = this.f344520i;
        int i39 = this.f344521j;
        int i47 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243940b;
        int i48 = this.f344530s;
        int i49 = this.f344531t;
        fi3.o oVar = new fi3.o(i28, i29, i37, i38, i39, min, 2, i47, i48, i49);
        this.f344514c = oVar;
        oVar.f344587f = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66892x37158b0f(i37, i38, min, i39, i47, 8, 2, 23.0f, i48, i49);
        oVar.f344582a = new fi3.n(oVar, null);
        ku5.u0 u0Var = ku5.t0.f394148d;
        fi3.n nVar = new fi3.n(oVar, null);
        oVar.f344582a = nVar;
        ((ku5.t0) u0Var).q(nVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxX264Encoder", "initAndStartEncoder");
        try {
            this.f344513b.d();
            fi3.n nVar2 = this.f344514c.f344582a;
            if (nVar2 != null) {
                nVar2.f344580g = true;
                try {
                    java.util.concurrent.Future future = nVar2.f531374d;
                    if (future != null && !future.isCancelled()) {
                        nVar2.f531374d.get();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightRemuxX264Encoder", e17, "waitEncoderFinish, join error: %s", e17.getMessage());
                }
            }
            d();
            java.lang.String str = this.f344516e;
            if (this.f344522k > 0) {
                str = str + "tempRotate.mp4";
            }
            long j28 = this.f344523l;
            if (j28 <= 0) {
                j28 = this.f344526o - this.f344525n;
            }
            int m66895xd9f5ceba = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66895xd9f5ceba(this.f344528q, 1024, 2, this.f344529r, str, (this.f344514c.f344587f * 1000.0f) / ((float) j28), (int) j28, null, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "muxing ret: %s", java.lang.Integer.valueOf(m66895xd9f5ceba));
            int i57 = this.f344522k;
            if (i57 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69252x50488dfd(str, this.f344516e, i57);
                com.p314xaae8f345.mm.vfs.w6.h(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(this.f344534w);
            ei3.x.f334720d.c();
            return m66895xd9f5ceba;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightFFMpegX264Remuxer", e18, "decode error: %s", e18.getMessage());
            return -1;
        }
    }

    @Override // bi3.b
    public void c(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.f344535x = bitmap;
        }
    }

    public final void d() {
        gp.c cVar = new gp.c();
        this.f344532u = cVar;
        try {
            cVar.k(this.f344515d);
            android.media.MediaFormat mediaFormat = null;
            java.lang.String str = null;
            int i17 = 0;
            while (true) {
                if (i17 >= this.f344532u.d()) {
                    i17 = -1;
                    break;
                }
                android.media.MediaFormat e17 = this.f344532u.e(i17);
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
            this.f344529r = mediaFormat.getInteger("channel-count");
            this.f344528q = mediaFormat.getInteger("sample-rate");
            this.f344532u.i(i17);
            long j17 = this.f344525n;
            if (j17 > 0) {
                this.f344532u.h(j17 * 1000, 0);
            }
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
            while (true) {
                allocateDirect.clear();
                int f17 = this.f344532u.f(allocateDirect, 0);
                if (f17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "muxAudio size = %d. Saw eos.", java.lang.Integer.valueOf(f17));
                    return;
                }
                if (this.f344532u.b() >= this.f344526o * 1000) {
                    return;
                }
                if (this.f344532u.c() != i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "track index not match! break");
                    return;
                } else {
                    allocateDirect.position(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66904xb00a27f9(this.f344534w, allocateDirect, f17);
                    this.f344532u.a();
                }
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightFFMpegX264Remuxer", e18, "muxAudio create extractor failed: %s", e18.getMessage());
        }
    }

    public g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, long j17, long j18, int i28, int i29) {
        this.f344523l = -1;
        this.f344525n = -1L;
        this.f344526o = -1L;
        this.f344527p = -1;
        this.f344533v = null;
        this.f344536y = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && i17 > 0 && i18 > 0) {
            this.f344515d = str;
            this.f344516e = str2;
            this.f344519h = i17;
            this.f344520i = i18;
            this.f344521j = i19;
            this.f344527p = i27;
            this.f344530s = i28;
            this.f344531t = i29;
            int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str);
            this.f344522k = m69179x9787f6ed;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
            if (d17 != null) {
                this.f344517f = d17.f243917c;
                this.f344518g = d17.f243918d;
                this.f344524m = d17.f243919e;
            }
            this.f344525n = j17;
            this.f344526o = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", str, str2, java.lang.Integer.valueOf(this.f344517f), java.lang.Integer.valueOf(this.f344518g), java.lang.Integer.valueOf(m69179x9787f6ed), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27));
    }
}
