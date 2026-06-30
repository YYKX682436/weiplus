package fi3;

/* loaded from: classes10.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public fi3.k f344557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344558c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344559d;

    /* renamed from: e, reason: collision with root package name */
    public int f344560e;

    /* renamed from: f, reason: collision with root package name */
    public int f344561f;

    /* renamed from: g, reason: collision with root package name */
    public int f344562g;

    /* renamed from: h, reason: collision with root package name */
    public wo.i1 f344563h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f344564i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.ByteBuffer[] f344565j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer[] f344566k;

    /* renamed from: n, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f344569n;

    /* renamed from: o, reason: collision with root package name */
    public final int f344570o;

    /* renamed from: s, reason: collision with root package name */
    public final int f344574s;

    /* renamed from: t, reason: collision with root package name */
    public final int f344575t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f344576u;

    /* renamed from: v, reason: collision with root package name */
    public int f344577v;

    /* renamed from: a, reason: collision with root package name */
    public int f344556a = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f344567l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f344568m = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f344571p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f344572q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f344573r = false;

    public l(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f344570o = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, init targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f344558c = i19;
        this.f344559d = i27;
        this.f344575t = i37;
        this.f344574s = i29;
        this.f344569n = new android.media.MediaCodec.BufferInfo();
        this.f344570o = i28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
    }

    public final void a() {
        wo.i1 i1Var = this.f344563h;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f344569n;
        this.f344568m = i1Var.g(bufferInfo, 600L);
        while (true) {
            int i17 = this.f344568m;
            if (i17 == -1) {
                if (!this.f344573r) {
                    return;
                }
            } else if (i17 == -3) {
                this.f344566k = this.f344563h.n();
            } else if (i17 == -2) {
                java.util.Objects.toString(this.f344563h.o());
            } else if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f344568m);
            } else {
                java.nio.ByteBuffer byteBuffer = this.f344566k[i17];
                if (byteBuffer == null) {
                    throw new java.lang.RuntimeException("encoderOutputBuffer " + this.f344568m + " was null");
                }
                this.f344561f++;
                if ((bufferInfo.flags & 2) != 0) {
                    int i18 = bufferInfo.size;
                }
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (bufferInfo != null && this.f344557b != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66906x9199fe9c(this.f344556a, byteBuffer, bufferInfo.size);
                    }
                }
                this.f344563h.s(this.f344568m, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (!this.f344572q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "reached end of stream unexpectedly");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", java.lang.Integer.valueOf(this.f344561f), java.lang.Integer.valueOf(this.f344562g));
                    try {
                        this.f344563h.y();
                        this.f344563h.q();
                        this.f344563h = null;
                        this.f344571p = false;
                        return;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder error: %s", e17.getMessage());
                        return;
                    }
                }
            }
            this.f344568m = this.f344563h.g(bufferInfo, 600L);
            if (this.f344568m < 0 && !this.f344573r) {
                return;
            }
        }
    }

    public final int b() {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "Unable to find an appropriate codec for video/avc");
            di3.x.f();
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found codec: %s, used %sms", mediaCodecInfo.getName(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType2.colorFormats.length));
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = capabilitiesForType2.colorFormats;
            if (i18 >= iArr.length) {
                break;
            }
            int i27 = iArr[i18];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i27));
            if ((i27 == 19 || i27 == 21 || i27 == 2130706688) && i27 > i19) {
                i19 = i27;
                if (i27 == 19) {
                    break;
                }
            }
            i18++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i19));
        this.f344560e = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found colorFormat: %s, used %sms", java.lang.Integer.valueOf(this.f344560e), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        if (this.f344560e == 19) {
            this.f344577v = 2;
        } else {
            this.f344577v = 1;
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
        this.f344564i = android.media.MediaFormat.createVideoFormat("video/avc", this.f344558c, this.f344559d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "createVideoFormat used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
        if (fp.h.c(23)) {
            try {
                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType3 = mediaCodecInfo.getCapabilitiesForType("video/avc");
                if (capabilitiesForType3 != null && (codecProfileLevelArr = capabilitiesForType3.profileLevels) != null) {
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i28 = codecProfileLevel2.profile;
                        int i29 = codecProfileLevel2.level;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "profile: %s, level: %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        if ((i28 == 1 || i28 == 2 || i28 == 8) && i28 >= codecProfileLevel.profile && i29 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i28;
                            codecProfileLevel.level = i29;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "best profile: %s, level: %s", java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                    int i37 = codecProfileLevel.profile;
                    if (i37 > 0 && codecProfileLevel.level >= 256) {
                        this.f344564i.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i37);
                        this.f344564i.setInteger(ya.b.f77487x44fa364, 256);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetProfile error: %s", e17.getMessage());
            }
        }
        try {
            if (fp.h.c(21) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc")) != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cbr bitrate mode");
                    this.f344564i.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cq bitrate mode");
                    this.f344564i.setInteger("bitrate-mode", 0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "both cbr and cq bitrate mode not support!");
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetBitRateMode error: %s", e18.getMessage());
        }
        this.f344564i.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f344570o);
        this.f344564i.setInteger("frame-rate", this.f344575t);
        this.f344564i.setInteger("color-format", this.f344560e);
        this.f344564i.setInteger("i-frame-interval", this.f344574s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "mediaFormat: %s", this.f344564i);
        wo.i1 b17 = wo.i1.b(mediaCodecInfo.getName());
        this.f344563h = b17;
        b17.a(this.f344564i, null, null, 1);
        this.f344563h.x();
        return 0;
    }

    public void c(byte[] bArr, boolean z17, long j17) {
        try {
            if (!this.f344571p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, not start!");
                return;
            }
            if (this.f344563h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
                return;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            this.f344565j = this.f344563h.k();
            this.f344566k = this.f344563h.n();
            int i17 = 0;
            while (true) {
                wo.i1 i1Var = this.f344563h;
                if (i1Var == null) {
                    break;
                }
                int f17 = i1Var.f(600L);
                this.f344567l = f17;
                if (f17 >= 0 || i17 >= 10) {
                    break;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecEncoder", "video no input available, drain first");
                a();
                i17++;
            }
            if (this.f344563h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            int i18 = this.f344567l;
            if (i18 >= 0) {
                if (!this.f344571p || z17 || bArr == null) {
                    this.f344573r = true;
                    this.f344563h.p(i18, 0, 0, j17, 4);
                    this.f344572q = true;
                } else {
                    java.nio.ByteBuffer byteBuffer = this.f344565j[i18];
                    byteBuffer.clear();
                    byteBuffer.put(bArr);
                    byteBuffer.position(0);
                    this.f344563h.p(this.f344567l, 0, bArr.length, j17, 0);
                }
            }
            a();
            android.os.SystemClock.elapsedRealtime();
            android.os.SystemClock.elapsedRealtime();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecWriteYUVError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 21L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData error: %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightRemuxMediaCodecEncoder", e17, "", new java.lang.Object[0]);
        }
    }
}
