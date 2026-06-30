package ei3;

/* loaded from: classes10.dex */
public abstract class c1 {
    public final boolean B;

    /* renamed from: b, reason: collision with root package name */
    public final int f334533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334534c;

    /* renamed from: d, reason: collision with root package name */
    public int f334535d;

    /* renamed from: e, reason: collision with root package name */
    public int f334536e;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f334537f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f334538g;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.ByteBuffer[] f334540i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.ByteBuffer[] f334541j;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f334544m;

    /* renamed from: n, reason: collision with root package name */
    public final int f334545n;

    /* renamed from: v, reason: collision with root package name */
    public final int f334553v;

    /* renamed from: w, reason: collision with root package name */
    public final int f334554w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f334555x;

    /* renamed from: y, reason: collision with root package name */
    public ei3.o f334556y;

    /* renamed from: h, reason: collision with root package name */
    public long f334539h = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f334542k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f334543l = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f334546o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f334547p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f334548q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f334549r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f334550s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f334551t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f334552u = -1;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Object f334557z = new java.lang.Object();
    public boolean A = false;
    public long C = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ei3.d f334532a = new ei3.d(new ei3.a1(this));

    public c1(int i17, int i18, int i19, int i27, int i28, int i29, int i37, boolean z17, ei3.x0 x0Var) {
        this.f334545n = 0;
        this.f334555x = false;
        this.B = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, init targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create MMSightYUVMediaCodecRecorder, after align 16, targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f334533b = i19;
        this.f334534c = i27;
        this.f334554w = i37;
        this.f334553v = i29;
        this.f334544m = new android.media.MediaCodec.BufferInfo();
        this.f334545n = i28;
        this.f334555x = z17;
        this.B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ignore_mediacodec_lock, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "create BigSightMediaCodecYUVRecorder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s, needRotateEachFrame: %s, muxer: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Boolean.valueOf(z17), x0Var);
    }

    public final void a() {
        wo.i1 i1Var = this.f334537f;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f334544m;
        this.f334543l = i1Var.g(bufferInfo, 100L);
        while (true) {
            int i17 = this.f334543l;
            if (i17 == -1) {
                if (!this.f334548q) {
                    return;
                }
            } else if (i17 == -3) {
                this.f334541j = this.f334537f.n();
            } else if (i17 == -2) {
                java.util.Objects.toString(this.f334537f.o());
            } else if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f334543l);
            } else {
                java.nio.ByteBuffer byteBuffer = this.f334541j[i17];
                if (byteBuffer == null) {
                    throw new java.lang.RuntimeException("encoderOutputBuffer " + this.f334543l + " was null");
                }
                this.f334536e++;
                int i18 = bufferInfo.flags;
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    ei3.z0 z0Var = (ei3.z0) this;
                    if (z0Var.D >= 0 && bufferInfo.size == byteBuffer.limit() - byteBuffer.position()) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69260x9199fe9c(z0Var.D, byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeH264Data used %sms, size: %s %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(bufferInfo.size), java.lang.Integer.valueOf(byteBuffer.capacity()));
                    }
                }
                this.f334537f.s(this.f334543l, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (!this.f334547p) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "reached end of stream unexpectedly");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightYUVMediaCodecRecorder", "do stop encoder");
                    b();
                    ei3.o oVar = this.f334556y;
                    if (oVar != null) {
                        ei3.w0 w0Var = ((ei3.p0) oVar).f334649a;
                        w0Var.getClass();
                        s75.d.b(new ei3.s0(w0Var), "MMSightMediaCodecMP4MuxRecorder_stop");
                        this.f334556y = null;
                        return;
                    }
                    return;
                }
            }
            int g17 = this.f334537f.g(bufferInfo, 100L);
            this.f334543l = g17;
            if (g17 < 0 && !this.f334548q) {
                return;
            }
        }
    }

    public final void b() {
        if (this.B) {
            c();
            return;
        }
        synchronized (this.f334557z) {
            if (!this.A && 0 != this.f334539h) {
                this.A = true;
                c();
            }
        }
    }

    public final void c() {
        try {
            ei3.d dVar = this.f334532a;
            if (dVar != null) {
                dVar.b();
            }
            if (this.f334537f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "stop encoder");
                this.f334537f.y();
                this.f334537f.q();
                this.f334546o = false;
                this.f334537f = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "clear error: %s", e17.getMessage());
        }
    }

    public final int d() {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int codecCount = android.media.MediaCodecList.getCodecCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (mediaCodecInfo.isEncoder()) {
                for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        break loop0;
                    }
                }
            }
            i17++;
        }
        if (mediaCodecInfo == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "Unable to find an appropriate codec for video/avc");
            di3.x.f();
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "found codec: %s, used %sms", mediaCodecInfo.getName(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        int m66817xb58848b9 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, -1) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "saveColorFormat: %s", java.lang.Integer.valueOf(m66817xb58848b9));
        if (m66817xb58848b9 <= 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType.colorFormats.length));
            int i18 = 0;
            int i19 = 0;
            while (true) {
                int[] iArr = capabilitiesForType.colorFormats;
                if (i19 >= iArr.length) {
                    break;
                }
                int i27 = iArr[i19];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i27));
                if ((i27 == 19 || i27 == 21 || i27 == 2130706688) && (i27 > i18 || i27 == 21)) {
                    i18 = i27;
                }
                i19++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i18));
            m66817xb58848b9 = i18;
        }
        this.f334535d = m66817xb58848b9;
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        if (this.f334535d > 0 && elapsedRealtime4 > 200 && com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().set(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MMSIGHT_MEDIACODEC_COLORFORMAT_INT, java.lang.Integer.valueOf(this.f334535d));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "found colorFormat: %s, used %sms", java.lang.Integer.valueOf(this.f334535d), java.lang.Long.valueOf(elapsedRealtime4));
        long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "initRotate: %s", java.lang.Integer.valueOf(this.f334549r));
        if (this.f334555x) {
            int i28 = this.f334549r;
            this.f334538g = android.media.MediaFormat.createVideoFormat("video/avc", (i28 == 180 || i28 == 0) ? this.f334533b : this.f334534c, (i28 == 180 || i28 == 0) ? this.f334534c : this.f334533b);
        } else {
            int i29 = this.f334549r;
            this.f334538g = android.media.MediaFormat.createVideoFormat("video/avc", (i29 == 180 || i29 == 0) ? this.f334534c : this.f334533b, (i29 == 180 || i29 == 0) ? this.f334533b : this.f334534c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "createVideoFormat used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime5));
        if (fp.h.c(23)) {
            try {
                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
                if (capabilitiesForType2 != null && (codecProfileLevelArr = capabilitiesForType2.profileLevels) != null) {
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i37 = codecProfileLevel2.profile;
                        int i38 = codecProfileLevel2.level;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "profile: %s, level: %s", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
                        if ((i37 == 1 || i37 == 2 || i37 == 8) && i37 >= codecProfileLevel.profile && i38 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i37;
                            codecProfileLevel.level = i38;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "best profile: %s, level: %s", java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                    int i39 = codecProfileLevel.profile;
                    if (i39 > 0 && codecProfileLevel.level >= 256) {
                        this.f334538g.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i39);
                        this.f334538g.setInteger(ya.b.f77487x44fa364, 256);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetProfile error: %s", e17.getMessage());
            }
        }
        try {
            if (fp.h.c(21)) {
                this.f334538g.setInteger("bitrate-mode", 1);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "trySetBitRateMode error: %s", e18.getMessage());
        }
        this.f334538g.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f334545n);
        this.f334538g.setInteger("frame-rate", this.f334554w);
        this.f334538g.setInteger("color-format", this.f334535d);
        this.f334538g.setInteger("i-frame-interval", this.f334553v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "mediaFormat: %s", this.f334538g);
        wo.i1 b17 = wo.i1.b(mediaCodecInfo.getName());
        this.f334537f = b17;
        b17.a(this.f334538g, null, null, 1);
        this.f334537f.x();
        if (this.B) {
            return 0;
        }
        synchronized (this.f334557z) {
            this.A = false;
        }
        return 0;
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start");
        this.f334546o = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "Start：isStart：" + this.f334546o);
        this.f334539h = java.lang.System.nanoTime();
    }

    public void f(ei3.o oVar) {
        this.f334556y = oVar;
        this.f334547p = true;
        ei3.d dVar = this.f334532a;
        boolean z17 = dVar.f334561c == dVar.f334560b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "!!!stop, isStart!!: %s %s isEnd %s", java.lang.Boolean.valueOf(this.f334546o), this.f334556y, java.lang.Boolean.valueOf(z17));
        if (z17) {
            g();
        }
    }

    public final void g() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightYUVMediaCodecRecorder", "stopImp %s  isStart:%b", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), java.lang.Boolean.valueOf(this.f334546o));
        try {
            if (this.f334546o) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new ei3.b1(this), 500L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightYUVMediaCodecRecorder", "stop error: %s", e17.getMessage());
        }
    }

    public void h(byte[] bArr, int i17, int i18, int i19) {
        int i27;
        boolean z17;
        int i28;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int i29 = this.f334549r;
        boolean z19 = this.f334555x;
        if (z19) {
            int i37 = this.f334550s;
            if (i37 != -1) {
                i29 = i37;
            }
            i27 = i29;
            z17 = z19;
        } else {
            int i38 = this.f334550s;
            if (i38 == -1 || i38 == i29) {
                i27 = i29;
                z17 = false;
            } else {
                int max = java.lang.Math.max(0, i29 <= 180 ? i38 - i29 : i38 + (360 - i29));
                if (max >= 360) {
                    z17 = true;
                    i27 = 0;
                } else {
                    i27 = max;
                    z17 = true;
                }
            }
        }
        int i39 = this.f334549r;
        int i47 = this.f334550s;
        if (i47 != -1 && i47 != i39) {
            i39 = i47;
        }
        int i48 = (i39 == 0 || i39 == 180) ? i18 : i19;
        int i49 = (i39 == 0 || i39 == 180) ? i19 : i18;
        int i57 = this.f334534c;
        int i58 = this.f334533b;
        boolean z27 = (i48 == i58 && i49 == i57) ? false : true;
        int i59 = this.f334551t;
        ei3.g gVar = new ei3.g(i48, i49, this.f334535d, i58, i57, (i59 == -1 || (i28 = this.f334552u) == -1 || (i59 == i58 && i28 == i57)) ? z27 : true, z17, i27, bArr);
        ei3.d dVar = this.f334532a;
        if (dVar.f334565g) {
            return;
        }
        if (dVar.f334563e == null) {
            dVar.f334563e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());
        }
        int i66 = dVar.f334560b;
        int i67 = i66 % ei3.d.f334558i;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = dVar.f334559a[i67];
        if (n3Var == null) {
            return;
        }
        xu5.b mo50283x2f1920ea = n3Var.mo50283x2f1920ea();
        ei3.f fVar = dVar.f334566h;
        gVar.f334579c = i66;
        gVar.f334585i = i67;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameBufProcessor", "create framebuf %d %d", java.lang.Integer.valueOf(gVar.f334577a.length), java.lang.Integer.valueOf(gVar.f334579c));
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(mo50283x2f1920ea).mo50293x3498a0(new ei3.e(gVar, fVar));
        dVar.f334560b++;
    }
}
