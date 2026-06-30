package w21;

/* loaded from: classes14.dex */
public class d0 implements tl.h {
    public static final java.lang.Object I = new java.lang.Object();

    /* renamed from: J, reason: collision with root package name */
    public static int f523841J = -1;
    public static int K;
    public final boolean A;
    public volatile boolean B;
    public volatile java.lang.Runnable C;
    public w21.e0 D;
    public final android.media.MediaPlayer.OnCompletionListener E;
    public final android.media.MediaPlayer.OnErrorListener F;
    public java.util.concurrent.Future G;
    public volatile int H;

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f523842a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f523843b;

    /* renamed from: c, reason: collision with root package name */
    public w21.a0 f523844c;

    /* renamed from: d, reason: collision with root package name */
    public final fp.e f523845d;

    /* renamed from: e, reason: collision with root package name */
    public tl.e f523846e;

    /* renamed from: f, reason: collision with root package name */
    public tl.f f523847f;

    /* renamed from: g, reason: collision with root package name */
    public int f523848g;

    /* renamed from: h, reason: collision with root package name */
    public int f523849h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f523850i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f523851j;

    /* renamed from: k, reason: collision with root package name */
    public int f523852k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f523853l;

    /* renamed from: m, reason: collision with root package name */
    public final int f523854m;

    /* renamed from: n, reason: collision with root package name */
    public int f523855n;

    /* renamed from: o, reason: collision with root package name */
    public yl.d f523856o;

    /* renamed from: p, reason: collision with root package name */
    public vl.a f523857p;

    /* renamed from: q, reason: collision with root package name */
    public int f523858q;

    /* renamed from: r, reason: collision with root package name */
    public final float f523859r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f523860s;

    /* renamed from: t, reason: collision with root package name */
    public w21.t0 f523861t;

    /* renamed from: u, reason: collision with root package name */
    public tl.g f523862u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Object f523863v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f523864w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f523865x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f523866y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f523867z;

    public d0(float f17) {
        this.f523843b = java.lang.Boolean.FALSE;
        this.f523846e = null;
        this.f523847f = null;
        this.f523848g = 2;
        this.f523849h = 16000;
        this.f523850i = "";
        this.f523851j = 0;
        this.f523852k = 0;
        this.f523853l = false;
        this.f523855n = 0;
        this.f523856o = null;
        this.f523858q = 8;
        this.f523859r = 1.0f;
        this.f523860s = true;
        this.f523862u = null;
        this.f523863v = new java.lang.Object();
        this.f523864w = 0L;
        this.f523865x = false;
        this.f523866y = false;
        this.f523867z = new java.util.ArrayList();
        this.A = true;
        this.B = false;
        this.C = null;
        this.E = new w21.y(this);
        this.F = new w21.z(this);
        this.G = null;
        this.H = 0;
        int i17 = f523841J + 1;
        f523841J = i17;
        this.f523854m = i17;
        this.f523859r = f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] new Instance", java.lang.Integer.valueOf(i17));
    }

    public static /* synthetic */ int k(w21.d0 d0Var) {
        int i17 = d0Var.f523852k;
        d0Var.f523852k = i17 + 1;
        return i17;
    }

    public static /* synthetic */ long l(w21.d0 d0Var) {
        long j17 = d0Var.f523864w;
        d0Var.f523864w = 1 + j17;
        return j17;
    }

    public static /* synthetic */ int m(w21.d0 d0Var) {
        int i17 = d0Var.f523855n;
        d0Var.f523855n = i17 + 1;
        return i17;
    }

    @Override // tl.h
    public void a(tl.f fVar) {
        this.f523847f = fVar;
    }

    @Override // tl.h
    public void b(tl.e eVar) {
        this.f523846e = eVar;
    }

    @Override // tl.h
    public double c() {
        return 0.0d;
    }

    @Override // tl.h
    public void d(tl.g gVar) {
        this.f523862u = gVar;
    }

    @Override // tl.h
    public boolean e(java.lang.String str, boolean z17, int i17) {
        java.lang.String str2 = this.f523850i;
        return (str2 == null || !str2.equals(str)) ? u(str, z17, i17, true) : u(str, z17, i17, false);
    }

    @Override // tl.h
    public boolean f(boolean z17) {
        if (this.f523851j != 1) {
            return false;
        }
        this.f523851j = 2;
        synchronized ("") {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "before mOk.wait");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                "".wait(1000L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "after mOk.wait time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                return false;
            }
        }
        fp.e eVar = this.f523845d;
        if (eVar != null && z17) {
            eVar.a();
        }
        return true;
    }

    @Override // tl.h
    public void g(boolean z17) {
        this.f523853l = true;
        this.f523848g = 2;
        n(z17);
        android.media.AudioTrack audioTrack = this.f523842a;
        if (audioTrack != null) {
            try {
                audioTrack.play();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(161L, 0L, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(161L, 3L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "audioTrack error:%s", e17.getMessage());
            }
        }
        this.f523853l = false;
    }

    @Override // tl.h
    /* renamed from: getStatus */
    public int mo166727x2fe4f2e8() {
        return this.f523851j;
    }

    @Override // tl.h
    public boolean h(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "setPlaySpeed() called with: speed = [" + f17 + "]");
        float f18 = this.f523859r;
        if (f17 > f18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkPlayer", "speed is too high, limited to %f", java.lang.Float.valueOf(f18));
            f17 = f18;
        }
        if (this.D == null) {
            this.D = new w21.e0(this.f523849h, 1);
        }
        this.D.f523880d = f17;
        return true;
    }

    @Override // tl.h
    public void i(boolean z17) {
        this.f523860s = z17;
    }

    @Override // tl.h
    /* renamed from: isPlaying */
    public boolean mo166728xc00617a4() {
        w21.a0 a0Var;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f523851j == 1);
        w21.a0 a0Var2 = this.f523844c;
        objArr[1] = a0Var2;
        objArr[2] = java.lang.Boolean.valueOf(a0Var2 == null || a0Var2.d());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "isPlaying %s and mPlayRunnable is %s && mPlayRunnable is done %s", objArr);
        return this.f523851j == 1 || this.f523851j == 4 || !(this.f523851j == 1 || (a0Var = this.f523844c) == null || a0Var.d());
    }

    @Override // tl.h
    public boolean j(java.lang.String str, boolean z17) {
        return u(str, z17, 0, true);
    }

    public final void n(boolean z17) {
        if (this.f523842a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            try {
                v();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", e17.getMessage());
            }
            this.f523842a = null;
        }
        this.f523842a = ul.a.a(z17, this.f523849h, this.f523848g, 2, this.f523858q);
        this.f523857p = new vl.a();
        android.media.AudioTrack audioTrack = this.f523842a;
        if (audioTrack == null || audioTrack.getState() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(161L, 0L, 1L, false);
            g0Var.mo68477x336bdfd8(161L, 2L, 1L, false);
            try {
                android.media.AudioTrack audioTrack2 = this.f523842a;
                if (audioTrack2 != null) {
                    audioTrack2.release();
                    this.f523842a = null;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        this.H = 0;
    }

    public final boolean o() {
        if (this.f523842a != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
                this.f523842a.play();
                this.f523844c = new w21.a0(this, null);
                ((ku5.t0) ku5.t0.f394148d).g(this.f523844c);
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "audioTrack error:%s", e17.getMessage());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(161L, 0L, 1L, false);
                g0Var.mo68477x336bdfd8(161L, 3L, 1L, false);
            }
        }
        return false;
    }

    public final boolean p(java.lang.String str) {
        boolean z17;
        if (str == null) {
            return false;
        }
        try {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkPlayer", "ensureFileFloder end == -1");
                return false;
            }
            java.lang.String substring = str.substring(0, lastIndexOf + 1);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(substring);
            if (!r6Var.m()) {
                if (!r6Var.J() && !r6Var.y()) {
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", substring, java.lang.Boolean.valueOf(z17));
                }
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", substring, java.lang.Boolean.valueOf(z17));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkPlayer", "ensureFileFloder Exception:", e17.getMessage());
            return false;
        }
    }

    @Override // tl.h
    /* renamed from: pause */
    public boolean mo166729x65825f6() {
        return f(true);
    }

    public final void q(java.lang.String str) {
        int b17;
        int i17 = this.f523854m;
        K = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit", java.lang.Integer.valueOf(i17));
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
            int available = E.available();
            long j17 = (available * 1000) / 23900;
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f523849h, 2, 2) * 2;
            if (!ym1.f.Ni() || available >= minBufferSize) {
                this.f523858q = 8;
            } else {
                this.f523858q = 1;
            }
            byte[] bArr = new byte[available];
            E.read(bArr, 0, available);
            this.f523849h = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48251x1fdab703(new byte[]{bArr[0]}, 0L);
            w21.t0 t0Var = this.f523861t;
            if (t0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "silkdec uninit success: %d" + t0Var.a());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] Using ThreadSafeSilkDecoder for thread safety", java.lang.Integer.valueOf(this.f523854m));
            this.f523861t = new w21.t0(this.f523849h, bArr, available);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_msg_voice_silk_agc, -1);
            if (1 == Ni || Ni == 0) {
                this.f523861t.d(100, new byte[]{(byte) Ni}, 1);
            }
            boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
            int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
            int Ni2 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "WaveHAid, flag:%s, type:%s, device:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni2));
            if (bj6) {
                byte[] bArr2 = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni2 & 255), (byte) ((Ni2 >> 8) & 255), (byte) ((Ni2 >> 16) & 255), (byte) ((Ni2 >> 24) & 255)};
                this.f523861t.d(300, bArr2, 8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "WaveHAid, params:%d,%d,%d,%d, len:%d", java.lang.Byte.valueOf(bArr2[0]), java.lang.Byte.valueOf(bArr2[1]), java.lang.Byte.valueOf(bArr2[2]), java.lang.Byte.valueOf(bArr2[3]), 8);
            }
            E.close();
            byte[] bArr3 = new byte[android.media.AudioTrack.getMinBufferSize(this.f523849h, 2, 2) * 2];
            short s17 = (short) ((this.f523849h * 20) / 1000);
            for (int i18 = 0; i18 < this.f523855n; i18++) {
                w21.t0 t0Var2 = this.f523861t;
                if (t0Var2 != null && (b17 = t0Var2.b(bArr3, s17)) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "[%d], skip frame failed: %d", java.lang.Integer.valueOf(this.f523854m), java.lang.Integer.valueOf(b17));
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(161L, 0L, 1L, false);
            g0Var.mo68477x336bdfd8(161L, 1L, 1L, false);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            android.media.MediaPlayer.OnErrorListener onErrorListener = this.F;
            if (onErrorListener != null) {
                ((w21.z) onErrorListener).onError(null, 0, 0);
            }
            this.f523851j = 0;
        }
    }

    public final boolean r(boolean z17, int i17) {
        fp.e eVar = this.f523845d;
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f523850i)) {
            return false;
        }
        try {
            n(z17);
            android.media.AudioTrack audioTrack = this.f523842a;
            if (audioTrack != null) {
                audioTrack.setVolume(this.f523843b.booleanValue() ? 0.0f : 1.0f);
                if (eVar != null && this.f523860s) {
                    eVar.b();
                }
                return o();
            }
        } catch (java.lang.Exception e17) {
            if (eVar != null && this.f523860s) {
                eVar.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "playImp : fail, exception = " + e17.getMessage());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        return false;
    }

    @Override // tl.h
    /* renamed from: resume */
    public boolean mo166730xc84dc82d() {
        if (this.f523851j != 2) {
            return false;
        }
        this.f523851j = 1;
        synchronized ("") {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "before mpause.notify");
                "".notifyAll();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "after mpause.notify");
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                return false;
            }
        }
        fp.e eVar = this.f523845d;
        if (eVar != null && this.f523860s) {
            eVar.b();
        }
        return true;
    }

    public java.lang.String s(java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        if (this.f523851j != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.f523851j);
            return null;
        }
        this.f523851j = 1;
        this.f523850i = str;
        try {
            inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
        } catch (java.lang.Exception e17) {
            e = e17;
            inputStream = null;
        }
        try {
            int available = inputStream.available();
            byte[] bArr = new byte[available];
            inputStream.read(bArr, 0, available);
            this.f523849h = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48251x1fdab703(new byte[]{bArr[0]}, 0L);
            w21.t0 t0Var = new w21.t0(this.f523849h, bArr, available);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit in silkToPcm", java.lang.Integer.valueOf(this.f523854m));
            inputStream.close();
            return t(str2, t0Var);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "silkToPcm, file[%s], exception: %s", this.f523850i, e.getMessage());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e));
            this.f523851j = -1;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SilkPlayer", e19, "", new java.lang.Object[0]);
                }
            }
            return null;
        }
    }

    @Override // tl.h
    /* renamed from: seek */
    public boolean mo166731x35ce78(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "seek: " + j17);
        if (this.f523851j == 0) {
            tl.g gVar = this.f523862u;
            if (gVar != null) {
                ((sl.b) gVar).a(this.f523864w * 20);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "now stop, can not seek");
            return false;
        }
        if (this.f523851j == 4) {
            java.util.concurrent.Future future = this.G;
            if (future == null || future.isDone() || !this.G.cancel(false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "cancel previous stopping error");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "cancel previous stopping");
            if (this.f523844c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "playing runnable is null");
                return false;
            }
            this.f523851j = 1;
            ((ku5.t0) ku5.t0.f394148d).g(this.f523844c);
        }
        if (this.f523851j != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "not playing, can not seek");
            return false;
        }
        synchronized (this.f523863v) {
            this.f523864w = j17 / 20;
            this.f523865x = true;
        }
        return true;
    }

    @Override // tl.h
    /* renamed from: setMute */
    public void mo166732x764d819b(boolean z17) {
        if (!j65.e.b() || !j65.e.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "is not mute mode, don't set mute!!");
            this.f523843b = java.lang.Boolean.FALSE;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "setMute:%s,mAudioTrack:%s", java.lang.Boolean.valueOf(z17), this.f523842a);
        this.f523843b = java.lang.Boolean.valueOf(z17);
        android.media.AudioTrack audioTrack = this.f523842a;
        if (audioTrack != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "setMute ret:%s", java.lang.Integer.valueOf(audioTrack.setVolume(z17 ? 0.0f : 1.0f)));
        }
    }

    @Override // tl.h
    /* renamed from: stop */
    public boolean mo166733x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "stop  status:" + this.f523851j);
        if (this.f523851j != 1 && this.f523851j != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "stop  error status:" + this.f523851j);
            return false;
        }
        this.f523851j = 3;
        synchronized ("") {
            try {
                try {
                    "".notifyAll();
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    fp.e eVar = this.f523845d;
                    if (eVar != null && this.f523860s) {
                        eVar.a();
                    }
                    return false;
                }
            } finally {
                fp.e eVar2 = this.f523845d;
                if (eVar2 != null && this.f523860s) {
                    eVar2.a();
                }
            }
        }
        return true;
    }

    public final java.lang.String t(java.lang.String str, w21.t0 t0Var) {
        java.io.OutputStream outputStream;
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f523850i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl(), file not exist, fileName = %s", this.f523850i);
            return null;
        }
        if (t0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "silkDecode is null.");
            return null;
        }
        try {
            try {
                android.os.Process.setThreadPriority(-16);
                byte[] bArr = new byte[android.media.AudioTrack.getMinBufferSize(this.f523849h, 2, 2) << 1];
                short s17 = (short) ((this.f523849h * 20) / 1000);
                p(str);
                outputStream = com.p314xaae8f345.mm.vfs.w6.K(str, false);
                while (true) {
                    try {
                        if (this.f523851j != 1 && this.f523851j != 2) {
                            break;
                        }
                        int b17 = t0Var.b(bArr, s17);
                        if (b17 < 0) {
                            this.f523851j = 0;
                        } else {
                            while (this.f523853l) {
                                java.lang.Thread.sleep(20L);
                            }
                            outputStream.write(bArr, 0, s17 * 2);
                            outputStream.flush();
                            if (b17 == 0) {
                                this.f523851j = 0;
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl thread exception: " + e.getMessage());
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e));
                        this.f523851j = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SilkPlayer", e18, "", new java.lang.Object[0]);
                            }
                        }
                        return null;
                    }
                }
                outputStream.close();
                int a17 = t0Var.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecUnInit in silkToPcmImpl", java.lang.Integer.valueOf(this.f523854m));
                if (a17 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl res: " + a17);
                }
                return str;
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl exception: " + e19.getMessage());
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                return null;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            outputStream = null;
        }
    }

    public final boolean u(java.lang.String str, boolean z17, int i17, boolean z18) {
        java.util.concurrent.Future future;
        if (this.f523851j != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.f523851j);
            return false;
        }
        if (this.f523851j == 4 && (future = this.G) != null && !future.isDone() && !this.G.cancel(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "cancel error");
            return false;
        }
        if (x51.o1.H) {
            s(str, tl.i0.f501586b);
        }
        if (z18) {
            ((java.util.ArrayList) this.f523867z).clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "startPlay");
        this.f523851j = 1;
        this.f523850i = str;
        synchronized (I) {
            q(str);
        }
        if (x51.o1.H) {
            this.f523856o = new yl.d(tl.i0.f501585a, this.f523848g == 2 ? 1 : 2, this.f523849h, 2);
        }
        try {
            return r(z17, i17);
        } catch (java.lang.Exception e17) {
            try {
                return r(true, i17);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "startPlay File[" + this.f523850i + "] failed");
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                this.f523851j = -1;
                return false;
            }
        }
    }

    public void v() {
        if (this.f523842a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            this.f523842a.stop();
            this.f523842a.release();
            this.f523842a = null;
            if (this.B) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "stopAudioTrack: needCheckComplete");
                this.B = false;
                java.lang.Runnable runnable = this.C;
                this.C = null;
                if (runnable != null) {
                    java.util.concurrent.Future future = this.G;
                    if (future != null && !future.isDone()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "stopAudioTrack has uncompleted task");
                    }
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                    t0Var.getClass();
                    this.G = t0Var.k(runnable, 0L);
                }
            }
        }
        vl.a aVar = this.f523857p;
        if (aVar != null) {
            java.lang.String str = this.f523850i;
            android.media.AudioTrack audioTrack = this.f523842a;
            aVar.b(1, 0, str, audioTrack != null ? audioTrack.getStreamType() : 0);
            this.f523857p.c(0);
            this.f523857p.e(0);
            this.f523857p.d(0);
        }
    }

    public d0(android.content.Context context, float f17) {
        this(f17);
        this.f523845d = new fp.e(context);
    }
}
