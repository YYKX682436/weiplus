package com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f128671a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f128672b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f128673c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaCodec f128674d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.liteav.videoproducer.encoder.e.a f128675e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 f128676f;

    /* renamed from: l, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.c f128682l;

    /* renamed from: y, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.C3848xea956a6c f128695y;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f128684n = null;

    /* renamed from: o, reason: collision with root package name */
    private boolean f128685o = true;

    /* renamed from: g, reason: collision with root package name */
    public long f128677g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.t f128678h = null;

    /* renamed from: p, reason: collision with root package name */
    private long f128686p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f128687q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f128688r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f128689s = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Deque<java.lang.Long> f128679i = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    private long f128690t = 0;

    /* renamed from: u, reason: collision with root package name */
    private long f128691u = 0;

    /* renamed from: v, reason: collision with root package name */
    private long f128692v = 0;

    /* renamed from: w, reason: collision with root package name */
    private long f128693w = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f128694x = false;

    /* renamed from: z, reason: collision with root package name */
    private double f128696z = 0.0d;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;
    private final java.util.Deque<java.lang.Long> F = new java.util.LinkedList();
    private int G = 0;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f128680j = new java.util.concurrent.atomic.AtomicLong(0);
    private final java.util.List<java.lang.Long> H = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicLong I = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f128681k = com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.c.a(this);

    /* renamed from: m, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.a.EnumC30884a f128683m = com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.a.EnumC30884a.STREAM_TYPE_BIG_VIDEO;

    public b(android.os.Bundle bundle, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.c cVar, java.lang.String str) {
        this.f128682l = cVar;
        this.f128672b = bundle;
        this.f128671a = str + "SurfaceInputVideoEncoder_" + hashCode();
    }

    private void e() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= this.A + java.util.concurrent.TimeUnit.SECONDS.toMillis(2L)) {
            this.B++;
            return;
        }
        this.f128696z = (this.B * 1000.0d) / (elapsedRealtime - this.A);
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

    public final void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.C3848xea956a6c c3848xea956a6c) {
        this.f128695y = c3848xea956a6c;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "Set serverConfig: " + this.f128695y);
    }

    public final void b() {
        if (this.f128678h != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "stopEosTimer");
            this.f128678h.a();
            this.f128678h = null;
        }
    }

    public final void c() {
        int i17;
        byte[] a17;
        byte[] bArr;
        boolean z17;
        java.lang.Long peekFirst;
        if (this.f128674d == null) {
            return;
        }
        while (true) {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            try {
                int dequeueOutputBuffer = this.f128674d.dequeueOutputBuffer(bufferInfo, 0L);
                if (dequeueOutputBuffer == -1) {
                    break;
                }
                if (dequeueOutputBuffer == -3) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "encoder output buffers changed");
                } else if (dequeueOutputBuffer == -2) {
                    try {
                        android.media.MediaFormat outputFormat = this.f128674d.getOutputFormat();
                        com.tencent.liteav.videoproducer.encoder.e.a aVar = this.f128675e;
                        if (aVar != null) {
                            aVar.m31508xa0df46dd(outputFormat);
                        }
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "encoder output format changed: %s", outputFormat);
                    } catch (java.lang.Throwable th6) {
                        a("getOutputFormat failed." + th6.getMessage());
                    }
                } else {
                    if (dequeueOutputBuffer < 0) {
                        a("dequeueOutputBuffer return ".concat(java.lang.String.valueOf(dequeueOutputBuffer)));
                        break;
                    }
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    this.H.add(java.lang.Long.valueOf(elapsedRealtime - this.f128680j.getAndSet(elapsedRealtime)));
                    try {
                        java.nio.ByteBuffer outputBuffer = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21 ? this.f128674d.getOutputBuffer(dequeueOutputBuffer) : this.f128674d.getOutputBuffers()[dequeueOutputBuffer];
                        if (outputBuffer == null || ((i17 = bufferInfo.size) == 0 && (bufferInfo.flags & 4) == 0)) {
                            a("size is zero, but it isn't end of stream");
                        } else {
                            byte[] a18 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(i17);
                            if (a18 == null) {
                                a17 = null;
                            } else {
                                outputBuffer.position(bufferInfo.offset);
                                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                outputBuffer.get(a18);
                                a17 = a(a18);
                                com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe8337 = this.f128676f;
                                if (c3846xefe8337 != null && !c3846xefe8337.f15048xabc7b88e) {
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
                                    com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe83372 = this.f128676f;
                                    this.f128684n = com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364.m31273x1617357c(a17, c3846xefe83372 == null || c3846xefe83372.f15053xbcfd1870 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.H264, c3846xefe83372 == null || c3846xefe83372.f15048xabc7b88e);
                                } else if (z19) {
                                    this.f128684n = (byte[]) a17.clone();
                                } else if (this.f128685o && z27) {
                                    byte[] bArr2 = this.f128684n;
                                    if (bArr2 != null) {
                                        byte[] a19 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(bArr2.length + a17.length);
                                        if (a19 != null) {
                                            byte[] bArr3 = this.f128684n;
                                            java.lang.System.arraycopy(bArr3, 0, a19, 0, bArr3.length);
                                            java.lang.System.arraycopy(a17, 0, a19, this.f128684n.length, a17.length);
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
                                    this.f128689s = -1;
                                }
                                com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe83373 = this.f128676f;
                                if (c3846xefe83373 != null && !c3846xefe83373.f15059xbd4b39f3) {
                                    int i19 = this.f128689s + 1;
                                    this.f128689s = i19;
                                    if (i19 == c3846xefe83373.fps * c3846xefe83373.gop) {
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
                                            int i27 = this.f128676f.fps;
                                            if (((float) (i27 - this.f128696z)) <= java.lang.Math.max(i27 / 2.0f, 5.0f) && (peekFirst = this.F.peekFirst()) != null && android.os.SystemClock.elapsedRealtime() > peekFirst.longValue()) {
                                                this.F.removeFirst();
                                                if (this.G - this.C > java.lang.Math.max(this.f128676f.f15051xf9e77b6d / 2, 100)) {
                                                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f128671a, "restart hardware encoder because real bitrate is too low.expectBitrate: " + this.G + ", realBitrate=" + this.C);
                                                    this.f128672b.putBoolean("need_restart_when_down_bitrate", true);
                                                    this.f128681k.run();
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
                                    this.f128687q++;
                                    this.f128688r = 0L;
                                } else {
                                    this.f128688r++;
                                }
                                this.f128686p++;
                                java.lang.Long pollFirst = this.f128679i.pollFirst();
                                long longValue = pollFirst == null ? 0L : pollFirst.longValue();
                                long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                                if (this.f128690t == 0) {
                                    this.f128690t = longValue;
                                }
                                if (this.f128691u == 0) {
                                    this.f128691u = millis;
                                }
                                long j17 = millis + (this.f128690t - this.f128691u);
                                long j18 = this.f128692v;
                                if (longValue <= j18) {
                                    longValue = j18 + 1;
                                }
                                if (longValue > j17) {
                                    longValue = j17;
                                }
                                this.f128692v = longValue;
                                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140();
                                com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe83374 = this.f128676f;
                                if (c3846xefe83374 == null || !c3846xefe83374.m31460x527935cd()) {
                                    c3811xcc176140.f14897x668d77f3 = z17 ? com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.IDR : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.P;
                                } else {
                                    c3811xcc176140.f14897x668d77f3 = z17 ? com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.IDR : com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.c.P_MULTI_REF;
                                }
                                byte[] bArr4 = bArr;
                                java.nio.ByteBuffer b17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.b(bArr4.length);
                                c3811xcc176140.f14889x2eefaa = b17;
                                if (b17 == null) {
                                    a("allocate direct buffer for nal failed");
                                } else {
                                    b17.put(bArr4);
                                    c3811xcc176140.f14889x2eefaa.rewind();
                                    c3811xcc176140.dts = longValue;
                                    c3811xcc176140.pts = j17;
                                    c3811xcc176140.f14895x3164ae = bufferInfo;
                                    c3811xcc176140.f14892x7ec3bd2a = this.f128687q;
                                    long j19 = this.f128688r;
                                    c3811xcc176140.f14890xeea76b65 = j19;
                                    c3811xcc176140.f14891xd645ce0d = j19;
                                    if (!z17) {
                                        j19--;
                                    }
                                    c3811xcc176140.f14901xf807a458 = j19;
                                    c3811xcc176140.f14900xa979083 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.d.BASELINE;
                                    com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 c3846xefe83375 = this.f128676f;
                                    c3811xcc176140.f14887xbcfd1870 = c3846xefe83375.f15053xbcfd1870;
                                    c3811xcc176140.f14905x6be2dc6 = c3846xefe83375.f15064x6be2dc6;
                                    c3811xcc176140.f14894xb7389127 = c3846xefe83375.f15060xb7389127;
                                    if ((bufferInfo.flags & 4) > 0) {
                                        b();
                                    } else {
                                        boolean z29 = c3846xefe83375.f15055x7be5498e;
                                        if (!z29 && !this.f128694x && j17 < this.f128693w) {
                                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "has B frame,isEnablesBframe=%b,mLastPresentationTimestamp=%d,packet.pts=%d", java.lang.Boolean.valueOf(z29), java.lang.Long.valueOf(this.f128693w), java.lang.Long.valueOf(c3811xcc176140.pts));
                                            this.f128694x = true;
                                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p385x8fb0427b.C3772xd0a6f627 c3772xd0a6f627 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p385x8fb0427b.C3772xd0a6f627(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p385x8fb0427b.C3772xd0a6f627.f14696xf2c680e0);
                                            c3772xd0a6f627.put("Liteav.Video.android.local.rtc.enable.high.profile", 0);
                                            c3772xd0a6f627.m29434xaf3f2937();
                                            com.tencent.liteav.videoproducer.encoder.e.a aVar2 = this.f128675e;
                                            if (aVar2 != null) {
                                                aVar2.a();
                                            }
                                        }
                                        this.f128693w = c3811xcc176140.pts;
                                        z18 = false;
                                    }
                                    com.tencent.liteav.videoproducer.encoder.e.a aVar3 = this.f128675e;
                                    if (aVar3 != null) {
                                        aVar3.mo31432xa9c9446a(c3811xcc176140, z18);
                                    }
                                }
                            }
                        }
                        android.media.MediaCodec mediaCodec = this.f128674d;
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
        if (this.f128679i.isEmpty()) {
            return;
        }
        int i28 = this.f128676f.fps;
        int i29 = i28 != 0 ? 500 / i28 : 10;
        if (this.f128673c.hasMessages(10)) {
            return;
        }
        this.f128673c.sendEmptyMessageDelayed(10, i29);
    }

    public final void d() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 19 || this.f128674d == null) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("request-sync", 0);
            this.f128674d.setParameters(bundle);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "requestSyncFrame failed.", th6);
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
        byte[] a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(i18 + (arrayList.size() * 4));
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
        if (mediaCodec == null || com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 19) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", i17 * 1024);
            mediaCodec.setParameters(bundle);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "updateBitrateToMediaCodec failed.", th6);
        }
    }

    private void a(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "notifyEncodeError message = ".concat(java.lang.String.valueOf(str)));
        com.tencent.liteav.videoproducer.encoder.e.a aVar = this.f128675e;
        if (aVar != null) {
            aVar.mo31431x8f5c21ed(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_ENCODE_FAIL);
        }
    }

    public final void a() {
        this.f128673c.removeMessages(10);
        a(this.f128674d);
        this.f128674d = null;
    }

    private android.media.MediaCodec b(java.lang.String str) {
        java.lang.String str2;
        android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType(str);
        try {
            str2 = createEncoderByType.getName();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "mediaCodec getName failed.", th6);
            str2 = null;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "codecName=".concat(java.lang.String.valueOf(str2)));
        if (str2 == null || !str2.equals("OMX.google.h264.encoder")) {
            return createEncoderByType;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f128671a, "will be destroyed codecName=".concat(str2));
        a(createEncoderByType);
        throw new java.io.IOException("this is a Google H264 soft encoder. cancel use MediaCodec.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #0 {all -> 0x0163, blocks: (B:20:0x00a0, B:22:0x00ba, B:26:0x00cc, B:69:0x015b, B:70:0x0162), top: B:19:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #0 {all -> 0x0163, blocks: (B:20:0x00a0, B:22:0x00ba, B:26:0x00cc, B:69:0x015b, B:70:0x0162), top: B:19:0x00a0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.C3846xefe8337 r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.b.a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams):android.view.Surface");
    }

    private boolean a(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "configure format: %s", mediaFormat);
            mediaCodec.configure(mediaFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "configure failed.", th6);
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
            if (i17 == 0 || (a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(bArr.length - i17)) == null) {
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
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "destroy mediaCodec stop failed.", th6);
        }
        try {
            mediaCodec.release();
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f128671a, "destroy mediaCodec release failed.", th7);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f128671a, "destroy mediaCodec");
    }
}
