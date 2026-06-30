package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelvideoh265toh264.d f71656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71658d;

    /* renamed from: e, reason: collision with root package name */
    public int f71659e;

    /* renamed from: f, reason: collision with root package name */
    public int f71660f;

    /* renamed from: g, reason: collision with root package name */
    public int f71661g;

    /* renamed from: h, reason: collision with root package name */
    public wo.i1 f71662h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f71663i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.ByteBuffer[] f71664j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer[] f71665k;

    /* renamed from: n, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f71668n;

    /* renamed from: o, reason: collision with root package name */
    public final int f71669o;

    /* renamed from: s, reason: collision with root package name */
    public final int f71673s;

    /* renamed from: t, reason: collision with root package name */
    public final int f71674t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f71675u;

    /* renamed from: v, reason: collision with root package name */
    public int f71676v;

    /* renamed from: a, reason: collision with root package name */
    public int f71655a = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f71666l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f71667m = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f71670p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f71671q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f71672r = false;

    public e(int i17, int i18, int i19, int i27, int i28) {
        this.f71669o = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "create MediaCodecTransCodeEncoder, init targetWidth: %d, targetHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f71657c = i17;
        this.f71658d = i18;
        this.f71674t = i28;
        this.f71673s = i27;
        this.f71668n = new android.media.MediaCodec.BufferInfo();
        this.f71669o = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "create MMSightRemuxMediaCodecEncoder, targetWidth: %s, targetHeight: %s, bitrate: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public final void a() {
        wo.i1 i1Var = this.f71662h;
        android.media.MediaCodec.BufferInfo bufferInfo = this.f71668n;
        this.f71667m = i1Var.g(bufferInfo, 600L);
        while (true) {
            int i17 = this.f71667m;
            if (i17 == -1) {
                if (!this.f71672r) {
                    return;
                }
            } else if (i17 == -3) {
                this.f71665k = this.f71662h.n();
            } else if (i17 == -2) {
                java.util.Objects.toString(this.f71662h.o());
            } else if (i17 < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MediaCodecTransCodeEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f71667m);
            } else {
                java.nio.ByteBuffer byteBuffer = this.f71665k[i17];
                if (byteBuffer == null) {
                    throw new java.lang.RuntimeException("encoderOutputBuffer " + this.f71667m + " was null");
                }
                this.f71660f++;
                if ((bufferInfo.flags & 2) != 0) {
                    int i18 = bufferInfo.size;
                }
                if (bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (bufferInfo != null && this.f71656b != null) {
                        com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.writeH264DataLock(this.f71655a, byteBuffer, bufferInfo.size);
                    }
                }
                this.f71662h.s(this.f71667m, false);
                if ((bufferInfo.flags & 4) != 0) {
                    if (!this.f71671q) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "reached end of stream unexpectedly");
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", java.lang.Integer.valueOf(this.f71660f), java.lang.Integer.valueOf(this.f71661g));
                    try {
                        this.f71662h.y();
                        this.f71662h.q();
                        this.f71662h = null;
                        this.f71670p = false;
                        return;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder error: %s", e17.getMessage());
                        return;
                    }
                }
            }
            this.f71667m = this.f71662h.g(bufferInfo, 600L);
            if (this.f71667m < 0 && !this.f71672r) {
                return;
            }
        }
    }

    public final int b() {
        android.media.MediaCodecInfo mediaCodecInfo;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "Unable to find an appropriate codec for video/avc");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "found codec: %s, used %sms", mediaCodecInfo.getName(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType2.colorFormats.length));
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = capabilitiesForType2.colorFormats;
            if (i18 >= iArr.length) {
                break;
            }
            int i27 = iArr[i18];
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i27));
            if ((i27 == 19 || i27 == 21 || i27 == 2130706688) && i27 > i19) {
                i19 = i27;
                if (i27 == 21) {
                    break;
                }
            }
            i18++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i19));
        this.f71659e = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "found colorFormat: %s, used %sms", java.lang.Integer.valueOf(this.f71659e), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        if (this.f71659e == 19) {
            this.f71676v = 2;
        } else {
            this.f71676v = 1;
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
        this.f71663i = android.media.MediaFormat.createVideoFormat("video/avc", this.f71657c, this.f71658d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "createVideoFormat used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "profile: %s, level: %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                        if ((i28 == 1 || i28 == 2 || i28 == 8) && i28 >= codecProfileLevel.profile && i29 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i28;
                            codecProfileLevel.level = i29;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "best profile: %s, level: %s", java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                    int i37 = codecProfileLevel.profile;
                    if (i37 > 0 && codecProfileLevel.level >= 256) {
                        this.f71663i.setInteger(com.google.android.gms.common.Scopes.PROFILE, i37);
                        this.f71663i.setInteger(ya.b.LEVEL, 256);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "trySetProfile error: %s", e17.getMessage());
            }
        }
        try {
            if (fp.h.c(21) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc")) != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "support cbr bitrate mode");
                    this.f71663i.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "support cq bitrate mode");
                    this.f71663i.setInteger("bitrate-mode", 0);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "both cbr and cq bitrate mode not support!");
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "trySetBitRateMode error: %s", e18.getMessage());
        }
        this.f71663i.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f71669o);
        this.f71663i.setInteger("frame-rate", this.f71674t);
        this.f71663i.setInteger("color-format", this.f71659e);
        this.f71663i.setInteger("i-frame-interval", this.f71673s);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "mediaFormat: %s", this.f71663i);
        wo.i1 b17 = wo.i1.b(mediaCodecInfo.getName());
        this.f71662h = b17;
        b17.a(this.f71663i, null, null, 1);
        this.f71662h.x();
        return 0;
    }

    public void c(byte[] bArr, boolean z17, long j17) {
        try {
            if (!this.f71670p) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "writeData, not start!");
                return;
            }
            if (this.f71662h == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
                return;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            this.f71664j = this.f71662h.k();
            this.f71665k = this.f71662h.n();
            int i17 = 0;
            while (true) {
                wo.i1 i1Var = this.f71662h;
                if (i1Var == null) {
                    break;
                }
                int f17 = i1Var.f(600L);
                this.f71666l = f17;
                if (f17 >= 0 || i17 >= 10) {
                    break;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransCodeEncoder", "video no input available, drain first");
                a();
                i17++;
            }
            if (this.f71662h == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            int i18 = this.f71666l;
            if (i18 >= 0) {
                if (!this.f71670p || z17 || bArr == null) {
                    this.f71672r = true;
                    this.f71662h.p(i18, 0, 0, j17, 4);
                    this.f71671q = true;
                } else {
                    java.nio.ByteBuffer byteBuffer = this.f71664j[i18];
                    byteBuffer.clear();
                    byteBuffer.put(bArr);
                    byteBuffer.position(0);
                    this.f71662h.p(this.f71666l, 0, bArr.length, j17, 0);
                }
            }
            a();
            android.os.SystemClock.elapsedRealtime();
            android.os.SystemClock.elapsedRealtime();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecTransCodeEncoder", "writeData error: %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecTransCodeEncoder", e17, "", new java.lang.Object[0]);
        }
    }
}
