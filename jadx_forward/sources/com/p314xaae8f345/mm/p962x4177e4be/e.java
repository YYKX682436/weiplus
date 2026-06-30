package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.d f153189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f153190c;

    /* renamed from: d, reason: collision with root package name */
    public final int f153191d;

    /* renamed from: e, reason: collision with root package name */
    public int f153192e;

    /* renamed from: f, reason: collision with root package name */
    public int f153193f;

    /* renamed from: g, reason: collision with root package name */
    public int f153194g;

    /* renamed from: h, reason: collision with root package name */
    public wo.i1 f153195h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f153196i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.ByteBuffer[] f153197j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer[] f153198k;

    /* renamed from: n, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f153201n;

    /* renamed from: o, reason: collision with root package name */
    public final int f153202o;

    /* renamed from: s, reason: collision with root package name */
    public final int f153206s;

    /* renamed from: t, reason: collision with root package name */
    public final int f153207t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f153208u;

    /* renamed from: v, reason: collision with root package name */
    public int f153209v;

    /* renamed from: a, reason: collision with root package name */
    public int f153188a = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f153199l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f153200m = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153203p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f153204q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f153205r = false;

    public e(int i17, int i18, int i19, int i27, int i28) {
        this.f153202o = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "create MediaCodecTransCodeEncoder, init targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f153190c = i17;
        this.f153191d = i18;
        this.f153207t = i28;
        this.f153206s = i27;
        this.f153201n = new android.media.MediaCodec.BufferInfo();
        this.f153202o = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "create MMSightRemuxMediaCodecEncoder, targetWidth: %s, targetHeight: %s, bitrate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public final void a() {
        wo.i1 i1Var = this.f153195h;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f153201n;
        this.f153200m = i1Var.g(bufferInfo, 600L);
        while (true) {
            int i17 = this.f153200m;
            if (i17 == -1) {
                if (!this.f153205r) {
                    return;
                }
            } else if (i17 == -3) {
                this.f153198k = this.f153195h.n();
            } else if (i17 == -2) {
                java.util.Objects.toString(this.f153195h.o());
            } else if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCodecTransCodeEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f153200m);
            } else {
                java.nio.ByteBuffer byteBuffer = this.f153198k[i17];
                if (byteBuffer == null) {
                    throw new java.lang.RuntimeException("encoderOutputBuffer " + this.f153200m + " was null");
                }
                this.f153193f++;
                if ((bufferInfo.flags & 2) != 0) {
                    int i18 = bufferInfo.size;
                }
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (bufferInfo != null && this.f153189b != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66906x9199fe9c(this.f153188a, byteBuffer, bufferInfo.size);
                    }
                }
                this.f153195h.s(this.f153200m, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (!this.f153204q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "reached end of stream unexpectedly");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", java.lang.Integer.valueOf(this.f153193f), java.lang.Integer.valueOf(this.f153194g));
                    try {
                        this.f153195h.y();
                        this.f153195h.q();
                        this.f153195h = null;
                        this.f153203p = false;
                        return;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder error: %s", e17.getMessage());
                        return;
                    }
                }
            }
            this.f153200m = this.f153195h.g(bufferInfo, 600L);
            if (this.f153200m < 0 && !this.f153205r) {
                return;
            }
        }
    }

    public final int b() {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "Unable to find an appropriate codec for video/avc");
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "found codec: %s, used %sms", mediaCodecInfo.getName(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType2.colorFormats.length));
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = capabilitiesForType2.colorFormats;
            if (i18 >= iArr.length) {
                break;
            }
            int i27 = iArr[i18];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i27));
            if ((i27 == 19 || i27 == 21 || i27 == 2130706688) && i27 > i19) {
                i19 = i27;
                if (i27 == 21) {
                    break;
                }
            }
            i18++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i19));
        this.f153192e = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "found colorFormat: %s, used %sms", java.lang.Integer.valueOf(this.f153192e), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        if (this.f153192e == 19) {
            this.f153209v = 2;
        } else {
            this.f153209v = 1;
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
        this.f153196i = android.media.MediaFormat.createVideoFormat("video/avc", this.f153190c, this.f153191d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "createVideoFormat used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "profile: %s, level: %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        if ((i28 == 1 || i28 == 2 || i28 == 8) && i28 >= codecProfileLevel.profile && i29 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i28;
                            codecProfileLevel.level = i29;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "best profile: %s, level: %s", java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                    int i37 = codecProfileLevel.profile;
                    if (i37 > 0 && codecProfileLevel.level >= 256) {
                        this.f153196i.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i37);
                        this.f153196i.setInteger(ya.b.f77487x44fa364, 256);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "trySetProfile error: %s", e17.getMessage());
            }
        }
        try {
            if (fp.h.c(21) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc")) != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "support cbr bitrate mode");
                    this.f153196i.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "support cq bitrate mode");
                    this.f153196i.setInteger("bitrate-mode", 0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "both cbr and cq bitrate mode not support!");
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "trySetBitRateMode error: %s", e18.getMessage());
        }
        this.f153196i.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f153202o);
        this.f153196i.setInteger("frame-rate", this.f153207t);
        this.f153196i.setInteger("color-format", this.f153192e);
        this.f153196i.setInteger("i-frame-interval", this.f153206s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "mediaFormat: %s", this.f153196i);
        wo.i1 b17 = wo.i1.b(mediaCodecInfo.getName());
        this.f153195h = b17;
        b17.a(this.f153196i, null, null, 1);
        this.f153195h.x();
        return 0;
    }

    public void c(byte[] bArr, boolean z17, long j17) {
        try {
            if (!this.f153203p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "writeData, not start!");
                return;
            }
            if (this.f153195h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
                return;
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            this.f153197j = this.f153195h.k();
            this.f153198k = this.f153195h.n();
            int i17 = 0;
            while (true) {
                wo.i1 i1Var = this.f153195h;
                if (i1Var == null) {
                    break;
                }
                int f17 = i1Var.f(600L);
                this.f153199l = f17;
                if (f17 >= 0 || i17 >= 10) {
                    break;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "video no input available, drain first");
                a();
                i17++;
            }
            if (this.f153195h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            int i18 = this.f153199l;
            if (i18 >= 0) {
                if (!this.f153203p || z17 || bArr == null) {
                    this.f153205r = true;
                    this.f153195h.p(i18, 0, 0, j17, 4);
                    this.f153204q = true;
                } else {
                    java.nio.ByteBuffer byteBuffer = this.f153197j[i18];
                    byteBuffer.clear();
                    byteBuffer.put(bArr);
                    byteBuffer.position(0);
                    this.f153195h.p(this.f153199l, 0, bArr.length, j17, 0);
                }
            }
            a();
            android.os.SystemClock.elapsedRealtime();
            android.os.SystemClock.elapsedRealtime();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "writeData error: %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecTransCodeEncoder", e17, "", new java.lang.Object[0]);
        }
    }
}
