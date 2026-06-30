package com.tencent.liteav.videoproducer.encoder;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f47138a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f47139b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.liteav.base.util.CustomHandler f47140c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaCodec f47141d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.liteav.videoproducer.encoder.e.a f47142e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.liteav.videoproducer.encoder.VideoEncodeParams f47143f;

    /* renamed from: l, reason: collision with root package name */
    private final com.tencent.liteav.videobase.videobase.c f47149l;

    /* renamed from: y, reason: collision with root package name */
    private com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig f47162y;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f47151n = null;

    /* renamed from: o, reason: collision with root package name */
    private boolean f47152o = true;

    /* renamed from: g, reason: collision with root package name */
    public long f47144g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.liteav.base.util.t f47145h = null;

    /* renamed from: p, reason: collision with root package name */
    private long f47153p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f47154q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f47155r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f47156s = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Deque<java.lang.Long> f47146i = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    private long f47157t = 0;

    /* renamed from: u, reason: collision with root package name */
    private long f47158u = 0;

    /* renamed from: v, reason: collision with root package name */
    private long f47159v = 0;

    /* renamed from: w, reason: collision with root package name */
    private long f47160w = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f47161x = false;

    /* renamed from: z, reason: collision with root package name */
    private double f47163z = 0.0d;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;
    private final java.util.Deque<java.lang.Long> F = new java.util.LinkedList();
    private int G = 0;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f47147j = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.List<java.lang.Long> H = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicLong I = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f47148k = com.tencent.liteav.videoproducer.encoder.c.a(this);

    /* renamed from: m, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.producer.a.EnumC0014a f47150m = com.tencent.liteav.videoproducer.producer.a.EnumC0014a.STREAM_TYPE_BIG_VIDEO;

    public b(android.os.Bundle bundle, com.tencent.liteav.videobase.videobase.c cVar, java.lang.String str) {
        this.f47149l = cVar;
        this.f47139b = bundle;
        this.f47138a = str + "SurfaceInputVideoEncoder_" + hashCode();
    }

    private void e() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= this.A + java.util.concurrent.TimeUnit.SECONDS.toMillis(2L)) {
            this.B++;
            return;
        }
        this.f47163z = (this.B * 1000.0d) / (elapsedRealtime - this.A);
        this.B = 1L;
        this.A = elapsedRealtime;
        java.util.Iterator<java.lang.Long> it = this.H.iterator();
        long j17 = -1;
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if (j17 < longValue) {
                j17 = longValue;
            }
        }
        this.I.set(j17);
        this.H.clear();
    }

    public final void a(com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f47162y = serverVideoProducerConfig;
        com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "Set serverConfig: " + this.f47162y);
    }

    public final void b() {
        if (this.f47145h != null) {
            com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "stopEosTimer");
            this.f47145h.a();
            this.f47145h = null;
        }
    }

    public final void c() {
        int i17;
        byte[] a17;
        byte[] bArr;
        boolean z17;
        java.lang.Long peekFirst;
        if (this.f47141d == null) {
            return;
        }
        while (true) {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            try {
                int dequeueOutputBuffer = this.f47141d.dequeueOutputBuffer(bufferInfo, 0L);
                if (dequeueOutputBuffer == -1) {
                    break;
                }
                if (dequeueOutputBuffer == -3) {
                    com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "encoder output buffers changed");
                } else if (dequeueOutputBuffer == -2) {
                    try {
                        android.media.MediaFormat outputFormat = this.f47141d.getOutputFormat();
                        com.tencent.liteav.videoproducer.encoder.e.a aVar = this.f47142e;
                        if (aVar != null) {
                            aVar.onOutputFormatChanged(outputFormat);
                        }
                        com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "encoder output format changed: %s", outputFormat);
                    } catch (java.lang.Throwable th6) {
                        a("getOutputFormat failed." + th6.getMessage());
                    }
                } else {
                    if (dequeueOutputBuffer < 0) {
                        a("dequeueOutputBuffer return ".concat(java.lang.String.valueOf(dequeueOutputBuffer)));
                        break;
                    }
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    this.H.add(java.lang.Long.valueOf(elapsedRealtime - this.f47147j.getAndSet(elapsedRealtime)));
                    try {
                        java.nio.ByteBuffer outputBuffer = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f47141d.getOutputBuffer(dequeueOutputBuffer) : this.f47141d.getOutputBuffers()[dequeueOutputBuffer];
                        if (outputBuffer == null || ((i17 = bufferInfo.size) == 0 && (bufferInfo.flags & 4) == 0)) {
                            a("size is zero, but it isn't end of stream");
                        } else {
                            byte[] a18 = com.tencent.liteav.videobase.utils.d.a(i17);
                            if (a18 == null) {
                                a17 = null;
                            } else {
                                outputBuffer.position(bufferInfo.offset);
                                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                outputBuffer.get(a18);
                                a17 = a(a18);
                                com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams = this.f47143f;
                                if (videoEncodeParams != null && !videoEncodeParams.annexb) {
                                    a17 = b(a17);
                                }
                            }
                            if (a17 == null) {
                                a("modifyEncodedData return null byte array");
                            } else {
                                int i18 = bufferInfo.flags;
                                boolean z18 = true;
                                boolean z19 = (i18 & 2) > 0;
                                boolean z27 = (i18 & 1) > 0;
                                if (z19 && z27) {
                                    com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams2 = this.f47143f;
                                    this.f47151n = com.tencent.liteav.videoconsumer.decoder.SpsInfo.nativeGetSpsPps(a17, videoEncodeParams2 == null || videoEncodeParams2.codecType == com.tencent.liteav.videobase.common.CodecType.H264, videoEncodeParams2 == null || videoEncodeParams2.annexb);
                                } else if (z19) {
                                    this.f47151n = (byte[]) a17.clone();
                                } else if (this.f47152o && z27) {
                                    byte[] bArr2 = this.f47151n;
                                    if (bArr2 != null) {
                                        byte[] a19 = com.tencent.liteav.videobase.utils.d.a(bArr2.length + a17.length);
                                        if (a19 != null) {
                                            byte[] bArr3 = this.f47151n;
                                            java.lang.System.arraycopy(bArr3, 0, a19, 0, bArr3.length);
                                            java.lang.System.arraycopy(a17, 0, a19, this.f47151n.length, a17.length);
                                            a17 = a19;
                                        } else {
                                            a("add spspps for I frame, allocate buffer failed.");
                                        }
                                    } else {
                                        a("mSpsPps is null.");
                                    }
                                }
                                boolean z28 = (bufferInfo.flags & 1) > 0;
                                if (z28) {
                                    this.f47156s = -1;
                                }
                                com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams3 = this.f47143f;
                                if (videoEncodeParams3 != null && !videoEncodeParams3.fullIFrame) {
                                    int i19 = this.f47156s + 1;
                                    this.f47156s = i19;
                                    if (i19 == videoEncodeParams3.fps * videoEncodeParams3.gop) {
                                        d();
                                    }
                                }
                                long length = a17.length;
                                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                if (z28) {
                                    z17 = z28;
                                    if (elapsedRealtime2 > 1000 + this.D) {
                                        bArr = a17;
                                        this.C = (long) (((this.E * 8000.0d) / (elapsedRealtime2 - r7)) / 1024.0d);
                                        this.E = 0L;
                                        this.D = elapsedRealtime2;
                                        if (!this.F.isEmpty()) {
                                            int i27 = this.f47143f.fps;
                                            if (((float) (i27 - this.f47163z)) <= java.lang.Math.max(i27 / 2.0f, 5.0f) && (peekFirst = this.F.peekFirst()) != null && android.os.SystemClock.elapsedRealtime() > peekFirst.longValue()) {
                                                this.F.removeFirst();
                                                if (this.G - this.C > java.lang.Math.max(this.f47143f.bitrate / 2, 100)) {
                                                    com.tencent.liteav.base.util.LiteavLog.w(this.f47138a, "restart hardware encoder because real bitrate is too low.expectBitrate: " + this.G + ", realBitrate=" + this.C);
                                                    this.f47139b.putBoolean("need_restart_when_down_bitrate", true);
                                                    this.f47148k.run();
                                                    this.F.clear();
                                                }
                                            }
                                        }
                                    } else {
                                        bArr = a17;
                                    }
                                } else {
                                    bArr = a17;
                                    z17 = z28;
                                }
                                this.E += length;
                                e();
                                if (z17) {
                                    this.f47154q++;
                                    this.f47155r = 0L;
                                } else {
                                    this.f47155r++;
                                }
                                this.f47153p++;
                                java.lang.Long pollFirst = this.f47146i.pollFirst();
                                long longValue = pollFirst == null ? 0L : pollFirst.longValue();
                                long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                                if (this.f47157t == 0) {
                                    this.f47157t = longValue;
                                }
                                if (this.f47158u == 0) {
                                    this.f47158u = millis;
                                }
                                long j17 = millis + (this.f47157t - this.f47158u);
                                long j18 = this.f47159v;
                                if (longValue <= j18) {
                                    longValue = j18 + 1;
                                }
                                if (longValue > j17) {
                                    longValue = j17;
                                }
                                this.f47159v = longValue;
                                com.tencent.liteav.videobase.common.EncodedVideoFrame encodedVideoFrame = new com.tencent.liteav.videobase.common.EncodedVideoFrame();
                                com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams4 = this.f47143f;
                                if (videoEncodeParams4 == null || !videoEncodeParams4.isEnablesUnlimitedGop()) {
                                    encodedVideoFrame.nalType = z17 ? com.tencent.liteav.videobase.common.c.IDR : com.tencent.liteav.videobase.common.c.P;
                                } else {
                                    encodedVideoFrame.nalType = z17 ? com.tencent.liteav.videobase.common.c.IDR : com.tencent.liteav.videobase.common.c.P_MULTI_REF;
                                }
                                byte[] bArr4 = bArr;
                                java.nio.ByteBuffer b17 = com.tencent.liteav.videobase.utils.d.b(bArr4.length);
                                encodedVideoFrame.data = b17;
                                if (b17 == null) {
                                    a("allocate direct buffer for nal failed");
                                } else {
                                    b17.put(bArr4);
                                    encodedVideoFrame.data.rewind();
                                    encodedVideoFrame.dts = longValue;
                                    encodedVideoFrame.pts = j17;
                                    encodedVideoFrame.info = bufferInfo;
                                    encodedVideoFrame.gopIndex = this.f47154q;
                                    long j19 = this.f47155r;
                                    encodedVideoFrame.frameIndex = j19;
                                    encodedVideoFrame.gopFrameIndex = j19;
                                    if (!z17) {
                                        j19--;
                                    }
                                    encodedVideoFrame.refFrameIndex = j19;
                                    encodedVideoFrame.profileType = com.tencent.liteav.videobase.common.d.BASELINE;
                                    com.tencent.liteav.videoproducer.encoder.VideoEncodeParams videoEncodeParams5 = this.f47143f;
                                    encodedVideoFrame.codecType = videoEncodeParams5.codecType;
                                    encodedVideoFrame.width = videoEncodeParams5.width;
                                    encodedVideoFrame.height = videoEncodeParams5.height;
                                    if ((bufferInfo.flags & 4) > 0) {
                                        b();
                                    } else {
                                        boolean z29 = videoEncodeParams5.enableBFrame;
                                        if (!z29 && !this.f47161x && j17 < this.f47160w) {
                                            com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "has B frame,isEnablesBframe=%b,mLastPresentationTimestamp=%d,packet.pts=%d", java.lang.Boolean.valueOf(z29), java.lang.Long.valueOf(this.f47160w), java.lang.Long.valueOf(encodedVideoFrame.pts));
                                            this.f47161x = true;
                                            com.tencent.liteav.base.storage.PersistStorage persistStorage = new com.tencent.liteav.base.storage.PersistStorage(com.tencent.liteav.base.storage.PersistStorage.GLOBAL_DOMAIN);
                                            persistStorage.put("Liteav.Video.android.local.rtc.enable.high.profile", 0);
                                            persistStorage.commit();
                                            com.tencent.liteav.videoproducer.encoder.e.a aVar2 = this.f47142e;
                                            if (aVar2 != null) {
                                                aVar2.a();
                                            }
                                        }
                                        this.f47160w = encodedVideoFrame.pts;
                                        z18 = false;
                                    }
                                    com.tencent.liteav.videoproducer.encoder.e.a aVar3 = this.f47142e;
                                    if (aVar3 != null) {
                                        aVar3.onEncodedNAL(encodedVideoFrame, z18);
                                    }
                                }
                            }
                        }
                        android.media.MediaCodec mediaCodec = this.f47141d;
                        if (mediaCodec == null) {
                            return;
                        }
                        try {
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                        } catch (java.lang.Throwable th7) {
                            a("releaseOutputBuffer failed." + th7.getMessage());
                        }
                    } catch (java.lang.Throwable th8) {
                        a("getOutputBuffer failed." + th8.getMessage());
                    }
                }
            } catch (java.lang.Throwable th9) {
                a("dequeueOutputBuffer failed." + th9.getMessage());
            }
        }
        if (this.f47146i.isEmpty()) {
            return;
        }
        int i28 = this.f47143f.fps;
        int i29 = i28 != 0 ? 500 / i28 : 10;
        if (this.f47140c.hasMessages(10)) {
            return;
        }
        this.f47140c.sendEmptyMessageDelayed(10, i29);
    }

    public final void d() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 19 || this.f47141d == null) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("request-sync", 0);
            this.f47141d.setParameters(bundle);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "requestSyncFrame failed.", th6);
        }
    }

    public final void a(int i17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (int i18 = 1; i18 <= 3; i18++) {
            this.F.addLast(java.lang.Long.valueOf((i18 * 2000) + elapsedRealtime));
        }
        this.G = i17;
    }

    private static byte[] b(byte[] bArr) {
        int length = bArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int i27 = 1;
            if (i17 > length) {
                break;
            }
            int i28 = i17 + 2;
            if (i28 < length && bArr[i17] == 0 && bArr[i17 + 1] == 0 && bArr[i28] == 1) {
                i27 = 3;
            } else {
                int i29 = i17 + 3;
                if (i29 < length && bArr[i17] == 0 && bArr[i17 + 1] == 0 && bArr[i28] == 0 && bArr[i29] == 1) {
                    i27 = 4;
                }
            }
            if (i27 == 3 || i27 == 4 || i17 == length) {
                if (i19 != i17) {
                    arrayList.add(new int[]{i19, i17});
                    i18 += i17 - i19;
                }
                i19 = i17 + i27;
            }
            i17 += i27;
        }
        byte[] a17 = com.tencent.liteav.videobase.utils.d.a(i18 + (arrayList.size() * 4));
        if (a17 == null) {
            return bArr;
        }
        java.util.Iterator it = arrayList.iterator();
        int i37 = 0;
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            int i38 = iArr[1] - iArr[0];
            java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(new byte[4]).order(java.nio.ByteOrder.BIG_ENDIAN);
            order.putInt(i38);
            java.lang.System.arraycopy(order.array(), 0, a17, i37, 4);
            int i39 = i37 + 4;
            java.lang.System.arraycopy(bArr, iArr[0], a17, i39, i38);
            i37 = i39 + i38;
        }
        return a17;
    }

    public final void a(android.media.MediaCodec mediaCodec, int i17) {
        if (mediaCodec == null || com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 19) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", i17 * 1024);
            mediaCodec.setParameters(bundle);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "updateBitrateToMediaCodec failed.", th6);
        }
    }

    private void a(java.lang.String str) {
        com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "notifyEncodeError message = ".concat(java.lang.String.valueOf(str)));
        com.tencent.liteav.videoproducer.encoder.e.a aVar = this.f47142e;
        if (aVar != null) {
            aVar.onEncodedFail(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_ENCODE_FAIL);
        }
    }

    public final void a() {
        this.f47140c.removeMessages(10);
        a(this.f47141d);
        this.f47141d = null;
    }

    private android.media.MediaCodec b(java.lang.String str) {
        java.lang.String str2;
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType(str);
        try {
            str2 = createEncoderByType.getName();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "mediaCodec getName failed.", th6);
            str2 = null;
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "codecName=".concat(java.lang.String.valueOf(str2)));
        if (str2 == null || !str2.equals("OMX.google.h264.encoder")) {
            return createEncoderByType;
        }
        com.tencent.liteav.base.util.LiteavLog.w(this.f47138a, "will be destroyed codecName=".concat(str2));
        a(createEncoderByType);
        throw new java.io.IOException("this is a Google H264 soft encoder. cancel use MediaCodec.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #0 {all -> 0x0163, blocks: (B:20:0x00a0, B:22:0x00ba, B:26:0x00cc, B:69:0x015b, B:70:0x0162), top: B:19:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #0 {all -> 0x0163, blocks: (B:20:0x00a0, B:22:0x00ba, B:26:0x00cc, B:69:0x015b, B:70:0x0162), top: B:19:0x00a0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.b.a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams):android.view.Surface");
    }

    private boolean a(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "configure format: %s", mediaFormat);
            mediaCodec.configure(mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "configure failed.", th6);
            return false;
        }
    }

    private static byte[] a(byte[] bArr) {
        byte[] a17;
        if (bArr.length > 5 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 3;
                if (i18 >= bArr.length) {
                    i17 = 0;
                    break;
                }
                byte b17 = bArr[i17];
                if ((b17 == 0 && bArr[i17 + 1] == 0 && bArr[i17 + 2] == 0 && bArr[i18] == 1) || (b17 == 0 && bArr[i17 + 1] == 0 && bArr[i17 + 2] == 1)) {
                    break;
                }
                i17++;
            }
            if (i17 == 0 || (a17 = com.tencent.liteav.videobase.utils.d.a(bArr.length - i17)) == null) {
                return bArr;
            }
            java.lang.System.arraycopy(bArr, i17, a17, 0, a17.length);
            return a17;
        }
        return bArr;
    }

    private void a(android.media.MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "destroy mediaCodec stop failed.", th6);
        }
        try {
            mediaCodec.release();
        } catch (java.lang.Throwable th7) {
            com.tencent.liteav.base.util.LiteavLog.e(this.f47138a, "destroy mediaCodec release failed.", th7);
        }
        com.tencent.liteav.base.util.LiteavLog.i(this.f47138a, "destroy mediaCodec");
    }
}
