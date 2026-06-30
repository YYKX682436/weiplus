package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.EncoderWriter */
/* loaded from: classes16.dex */
public class C25764x27f5008f {

    /* renamed from: HANDLE_FRAME_OPERATE_TIMEOUT */
    public static final long f48024x857b539d = 10000;

    /* renamed from: OUTPUT_AUDIO_AAC_PROFILE */
    public static final int f48025x35641ea6 = 2;

    /* renamed from: OUTPUT_AUDIO_BIT_RATE */
    public static final int f48026xbfd28259 = 128000;

    /* renamed from: OUTPUT_AUDIO_CHANNEL_COUNT */
    public static final int f48027x39ba1d8c = 1;

    /* renamed from: OUTPUT_AUDIO_MIME_TYPE */
    public static final java.lang.String f48028xfb84d7de = "audio/mp4a-latm";

    /* renamed from: OUTPUT_AUDIO_SAMPLE_RATE_HZ */
    public static final int f48029x36365363 = 44100;

    /* renamed from: OUTPUT_VIDEO_BIT_RATE */
    public static final int f48030xc54cf354 = 8000000;

    /* renamed from: OUTPUT_VIDEO_COLOR_FORMAT */
    public static final int f48031x5e80f9d5 = 2130708361;

    /* renamed from: OUTPUT_VIDEO_FRAME_RATE */
    public static final int f48032x2afb6e74 = 30;

    /* renamed from: OUTPUT_VIDEO_IFRAME_INTERVAL */
    public static final int f48033x64d14b5e = 1;

    /* renamed from: OUTPUT_VIDEO_MIME_TYPE */
    public static final java.lang.String f48034xa5588643 = "video/avc";

    /* renamed from: WAIT_TRANSIENT_MS */
    private static final long f48035x979f5225 = 20;

    /* renamed from: WRITER_FINISH */
    public static final long f48036x7c5d0ddf = -1;

    /* renamed from: SCENE */
    private final java.lang.String f48037x4b1206c;
    private final java.lang.String TAG;

    /* renamed from: _inputSurface */
    private android.view.Surface f48038x4ef41f62;

    /* renamed from: audioEncodeFormat */
    private volatile android.media.MediaFormat f48039x904d98a3;

    /* renamed from: audioEncoder */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 f48040x41a3a466;

    /* renamed from: audioEncoderLock */
    private final java.util.concurrent.locks.Lock f48041xc4f33ab1;

    /* renamed from: audioEncoderStarted */
    private boolean f48042xc797953b;

    /* renamed from: enOfAudioInputStream */
    private boolean f48043x9ba792b4;

    /* renamed from: enOfVideoInputStream */
    private boolean f48044x2c49b0ef;

    /* renamed from: encodeOption */
    private com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f48045xc5684a2b;

    /* renamed from: encodeReporter */
    private final com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b f48046xf7c01117;

    /* renamed from: hasAudioTrack */
    private boolean f48047x84d5d14f;

    /* renamed from: hasVideoTrack */
    private boolean f48048xc80df7ca;

    /* renamed from: isCancel */
    private boolean f48049xd6a72044;

    /* renamed from: lock */
    private java.util.concurrent.locks.ReadWriteLock f48050x32c52b;

    /* renamed from: logger */
    private final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f48051xbe97f590;

    /* renamed from: muxer */
    private com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 f48052x637007d;

    /* renamed from: muxerStarted */
    private volatile boolean f48053x88ffc144;

    /* renamed from: outputAudioTrack */
    private volatile int f48054x5fb9c2f6;

    /* renamed from: outputPath */
    private java.lang.String f48055xb41088c6;

    /* renamed from: outputVideoTrack */
    private volatile int f48056xa2f1e971;

    /* renamed from: released */
    private volatile boolean f48057xdf23d93d;

    /* renamed from: videoEncodeFormat */
    private volatile android.media.MediaFormat f48058x13ef41c8;

    /* renamed from: videoEncoder */
    private com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 f48059x976c1821;

    /* renamed from: videoEncoderLock */
    private final java.util.concurrent.locks.Lock f48060x559558ec;

    /* renamed from: videoEncoderStarted */
    private boolean f48061xe9738920;

    @java.lang.Deprecated
    /* renamed from: com.tencent.tav.decoder.EncoderWriter$OutputConfig */
    /* loaded from: classes10.dex */
    public static final class OutputConfig {

        /* renamed from: VIDEO_BIT_RATE */
        public int f48068xeb2e5456 = 8000000;

        /* renamed from: VIDEO_FRAME_RATE */
        public int f48069x5e0896f6 = 30;

        /* renamed from: VIDEO_IFRAME_INTERVAL */
        public int f48070x3193241c = 1;

        /* renamed from: VIDEO_TARGET_WIDTH */
        public int f48072x178746dc = 0;

        /* renamed from: VIDEO_TARGET_HEIGHT */
        public int f48071xbf929ab1 = 0;

        /* renamed from: HIGH_PROFILE */
        public boolean f48067xb7b4cfec = false;

        /* renamed from: AUDIO_MIME_TYPE */
        public java.lang.String f48065x91cf971c = "audio/mp4a-latm";

        /* renamed from: AUDIO_BIT_RATE */
        public int f48063xe5b3e35b = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259;

        /* renamed from: AUDIO_AAC_PROFILE */
        public int f48062x63fc0664 = 2;

        /* renamed from: AUDIO_CHANNEL_COUNT */
        public int f48064x21f70dca = 1;

        /* renamed from: AUDIO_SAMPLE_RATE_HZ */
        public int f48066x55976ae5 = 44100;
    }

    public C25764x27f5008f(java.lang.String str, com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 interfaceC25768xd59ba4f7) {
        this.TAG = "EncoderWriter" + hashCode();
        this.f48037x4b1206c = "tav-encoder-writer";
        this.f48046xf7c01117 = new com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b();
        this.f48051xbe97f590 = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();
        this.f48048xc80df7ca = false;
        this.f48047x84d5d14f = false;
        this.f48044x2c49b0ef = false;
        this.f48043x9ba792b4 = false;
        this.f48060x559558ec = new java.util.concurrent.locks.ReentrantLock();
        this.f48041xc4f33ab1 = new java.util.concurrent.locks.ReentrantLock();
        this.f48050x32c52b = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f48038x4ef41f62 = null;
        this.f48058x13ef41c8 = null;
        this.f48039x904d98a3 = null;
        this.f48056xa2f1e971 = -1;
        this.f48054x5fb9c2f6 = -1;
        this.f48053x88ffc144 = false;
        this.f48061xe9738920 = false;
        this.f48042xc797953b = false;
        this.f48057xdf23d93d = false;
        this.f48049xd6a72044 = false;
        this.f48055xb41088c6 = str;
        this.f48052x637007d = com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.m97836xdf726115(str, 0);
        interfaceC25768xd59ba4f7 = interfaceC25768xd59ba4f7 == null ? new com.p314xaae8f345.tav.p2959x5befac44.C25763x1d46f8cf() : interfaceC25768xd59ba4f7;
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 mo96243xa29636dc = interfaceC25768xd59ba4f7.mo96243xa29636dc();
        this.f48040x41a3a466 = mo96243xa29636dc;
        mo96243xa29636dc.mo97326x8f07f4fb(this.f48052x637007d);
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 mo96246xf85eaa97 = interfaceC25768xd59ba4f7.mo96246xf85eaa97();
        this.f48059x976c1821 = mo96246xf85eaa97;
        mo96246xf85eaa97.mo72507x8f07f4fb(this.f48052x637007d);
    }

    /* renamed from: checkStartMuxer */
    private void m97474xe8ffd063(java.lang.String str) {
        if (!m97493x582bdba8()) {
            if (this.f48053x88ffc144) {
                return;
            }
            this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "notStartMuxer1: " + str + " status: " + m97484x3295d278());
            return;
        }
        this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "checkStartMuxer: " + str);
        synchronized (this) {
            if (m97493x582bdba8()) {
                if (this.f48048xc80df7ca) {
                    this.f48056xa2f1e971 = this.f48052x637007d.mo72369xb5bac52a(this.f48058x13ef41c8);
                }
                if (this.f48047x84d5d14f) {
                    this.f48054x5fb9c2f6 = this.f48052x637007d.mo72369xb5bac52a(this.f48039x904d98a3);
                }
                this.f48052x637007d.mo72397x68ac462();
                this.f48053x88ffc144 = true;
                this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "checkStartMuxer finish: " + str + " ,hasAudioTrack:" + this.f48047x84d5d14f + " ,hasVideoTrack:" + this.f48048xc80df7ca);
            } else {
                this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "notStartMuxer2: " + str + " status: " + m97484x3295d278());
            }
        }
    }

    /* renamed from: dequeueInputBuffer */
    private int m97475x9a572d5a(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61) {
        try {
            return c25653x39170d61.mo96250x9a572d5a(1000L);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.f48051xbe97f590.e(this.TAG, "dequeueInputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48051xbe97f590;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                c25799x4a77fd1.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97495xe9f95e2(20L);
                    return m97475x9a572d5a(c25653x39170d61);
                }
            }
            throw e17;
        }
    }

    /* renamed from: dequeueOutputBuffer */
    private int m97476x436dd5f1(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, android.media.MediaCodec.BufferInfo bufferInfo) {
        try {
            return c25653x39170d61.mo96251x436dd5f1(bufferInfo, 1000L);
        } catch (java.lang.Exception e17) {
            this.f48051xbe97f590.e(this.TAG, "dequeueOutputBuffer e = ", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48051xbe97f590;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                c25799x4a77fd1.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97495xe9f95e2(20L);
                    return m97476x436dd5f1(c25653x39170d61, bufferInfo);
                }
            }
            throw e17;
        }
    }

    /* renamed from: drainAudioEncoder */
    private void m97477x6d263e7e(boolean z17, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        boolean z18 = z17 ? this.f48047x84d5d14f : false;
        boolean z19 = !this.f48047x84d5d14f;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (!z19 && this.f48047x84d5d14f) {
            if (z18) {
                m97491x794c024c();
                z18 = false;
            }
            if (!z19) {
                z19 = m97496x3a033c76(z17);
                if (java.lang.System.currentTimeMillis() - currentTimeMillis > f48024x857b539d) {
                    this.f48047x84d5d14f = !z17;
                    this.f48051xbe97f590.e(this.TAG, "drainEncoder: 音频写入处理时间超时，提前结束写入");
                    z19 = true;
                }
                m97474xe8ffd063("audio-drain");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /* renamed from: drainVideoEncoder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m97478xc2eeb239(boolean r11, com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L23
            boolean r2 = r10.f48048xc80df7ca
            if (r2 == 0) goto L23
            android.view.Surface r2 = r10.f48038x4ef41f62
            if (r2 != 0) goto L17
            com.tencent.tav.decoder.logger.WXLogger r2 = r10.f48051xbe97f590
            java.lang.String r3 = r10.TAG
            java.lang.String r4 = "drainEncoder error, _inputSurface is null"
            r2.e(r3, r4)
            r2 = r0
            goto L24
        L17:
            r10.m97492x9d18ab31()
            com.tencent.tav.decoder.logger.WXLogger r2 = r10.f48051xbe97f590
            java.lang.String r3 = r10.TAG
            java.lang.String r4 = "drainEncoder endOfStream"
            r2.i(r3, r4)
        L23:
            r2 = r1
        L24:
            boolean r3 = r10.f48048xc80df7ca
            r3 = r3 ^ r0
            com.tencent.tav.decoder.logger.WXLogger r4 = r10.f48051xbe97f590
            java.lang.String r5 = r10.TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "drainEncoder videoDone: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r7 = " endOfStream: "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r4.m97814x5d2a96d(r5, r6)
            long r4 = java.lang.System.currentTimeMillis()
        L48:
            if (r3 != 0) goto L79
            boolean r6 = r10.f48048xc80df7ca
            if (r6 == 0) goto L79
            if (r2 == 0) goto L54
            r10.m97492x9d18ab31()
            r2 = r1
        L54:
            if (r3 != 0) goto L48
            boolean r3 = r10.m97497x7d3b62f1(r12, r11)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r8 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L73
            r3 = r11 ^ 1
            r10.f48048xc80df7ca = r3
            com.tencent.tav.decoder.logger.WXLogger r3 = r10.f48051xbe97f590
            java.lang.String r6 = r10.TAG
            java.lang.String r7 = "drainEncoder: 视频写入处理时间超时，提前结束写入"
            r3.e(r6, r7)
            r3 = r0
        L73:
            java.lang.String r6 = "video-drain"
            r10.m97474xe8ffd063(r6)
            goto L48
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.m97478xc2eeb239(boolean, com.tencent.tav.coremedia.CMSampleBuffer):void");
    }

    /* renamed from: fixAudioFormat */
    private void m97479xd4b2f418(android.media.MediaFormat mediaFormat) {
        m97481x112bdbf9(mediaFormat, "mime", "audio/mp4a-latm");
        m97480x34636(mediaFormat, "sample-rate", 44100);
        m97480x34636(mediaFormat, "channel-count", 1);
        m97480x34636(mediaFormat, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, f48026xbfd28259);
        m97480x34636(mediaFormat, "aac-profile", 2);
        this.f48051xbe97f590.d(this.TAG, "fixAudioFormat() called with: format = [" + mediaFormat + "]");
    }

    /* renamed from: fixIntegerKey */
    private void m97480x34636(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        if (!mediaFormat.containsKey(str) || mediaFormat.getInteger(str) <= 0) {
            this.f48051xbe97f590.w(this.TAG, "fixIntegerKey: 缺少关键配置：" + str + ", 使用默认值：" + i17);
            mediaFormat.setInteger(str, i17);
        }
    }

    /* renamed from: fixStringKey */
    private void m97481x112bdbf9(android.media.MediaFormat mediaFormat, java.lang.String str, java.lang.String str2) {
        if (!mediaFormat.containsKey(str) || android.text.TextUtils.isEmpty(mediaFormat.getString(str))) {
            this.f48051xbe97f590.w(this.TAG, "fixStringKey: 缺少关键配置：" + str + ", 使用默认值：" + str2);
            mediaFormat.setString(str, str2);
        }
    }

    /* renamed from: fixVideoFormat */
    private void m97482xf87f9cfd(android.media.MediaFormat mediaFormat) {
        mediaFormat.setInteger("color-format", f48031x5e80f9d5);
        m97481x112bdbf9(mediaFormat, "mime", "video/avc");
        m97480x34636(mediaFormat, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, 8000000);
        m97480x34636(mediaFormat, "frame-rate", 30);
        m97480x34636(mediaFormat, "i-frame-interval", 1);
        this.f48051xbe97f590.d(this.TAG, "fixVideoFormat() called with: format = [" + mediaFormat + "]");
    }

    /* renamed from: getInputBuffer */
    private java.nio.ByteBuffer m97483xaa9f9f74(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97465xaa9f9f74(c25653x39170d61, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.f48051xbe97f590.e(this.TAG, "getInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48051xbe97f590;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                c25799x4a77fd1.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97495xe9f95e2(20L);
                    return m97483xaa9f9f74(c25653x39170d61, i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: getMuxStatusLog */
    private java.lang.String m97484x3295d278() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("muxerStarted:");
        sb6.append(this.f48053x88ffc144);
        sb6.append(", videoEncodeFormat:");
        sb6.append(this.f48058x13ef41c8 != null);
        sb6.append(", audioEncodeFormat:");
        sb6.append(this.f48039x904d98a3 != null);
        sb6.append(", hasVideoTrack:");
        sb6.append(this.f48048xc80df7ca);
        sb6.append(", hasAudioTrack:");
        sb6.append(this.f48047x84d5d14f);
        return sb6.toString();
    }

    /* renamed from: getOutputBuffer */
    private java.nio.ByteBuffer m97485x3c33a717(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17) {
        try {
            return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97467x3c33a717(c25653x39170d61, i17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.f48051xbe97f590.e(this.TAG, "getOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48051xbe97f590;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                c25799x4a77fd1.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97495xe9f95e2(20L);
                    return m97485x3c33a717(c25653x39170d61, i17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: prepareAudioEncoder */
    private void m97486xc5eb30d(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        this.f48051xbe97f590.d(this.TAG, "AssetWriter prepareAudioEncoder " + this);
        android.media.MediaFormat m96734xddbe0e37 = c25679xbb204036.m96734xddbe0e37();
        m97479xd4b2f418(m96734xddbe0e37);
        this.f48051xbe97f590.i(this.TAG, "prepareAudioEncoder, input mediaFormat:" + m96734xddbe0e37 + ", isAudioEncodeNeedCodecSpecificData:" + c25679xbb204036.m96748x5254e85a());
        if (c25679xbb204036.m96748x5254e85a()) {
            int integer = m96734xddbe0e37.getInteger("aac-profile");
            int integer2 = m96734xddbe0e37.getInteger("sample-rate");
            int integer3 = m96734xddbe0e37.getInteger("channel-count");
            this.f48051xbe97f590.i(this.TAG, "try set adts csd-0 data, profile:" + integer + ", sampleRate:" + integer2 + ", " + integer3);
            m96734xddbe0e37.setByteBuffer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54292x3d6ec85, com.p314xaae8f345.tav.p2959x5befac44.C25751x2b41e7ef.m97318xaf56c3da(integer, integer2, integer3));
        }
        this.f48040x41a3a466.mo97324xed060d07(c25679xbb204036, m96734xddbe0e37);
    }

    /* renamed from: prepareVideoEncoder */
    private void m97487x622726c8(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        android.media.MediaFormat m96746x18ab71c = c25679xbb204036.m96746x18ab71c();
        m97482xf87f9cfd(m96746x18ab71c);
        this.f48059x976c1821.mo72503xed060d07(c25679xbb204036, m96746x18ab71c);
    }

    /* renamed from: queueInputBuffer */
    private void m97488xfe5642d9(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17, int i18, int i19, long j17, int i27) {
        try {
            c25653x39170d61.mo96258xfe5642d9(i17, i18, i19, j17, i27);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.f48051xbe97f590.e(this.TAG, "queueInputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48051xbe97f590;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                c25799x4a77fd1.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97495xe9f95e2(20L);
                    m97488xfe5642d9(c25653x39170d61, i17, i18, i19, j17, i27);
                }
            }
            throw e17;
        }
    }

    /* renamed from: release */
    private boolean m97489x41012807() {
        this.f48057xdf23d93d = true;
        this.f48051xbe97f590.i(this.TAG, "AssetWriter release: " + this);
        try {
            this.f48060x559558ec.lock();
            this.f48041xc4f33ab1.lock();
            this.f48051xbe97f590.d(this.TAG, "AssetWriter release " + this);
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 interfaceC25753x6af89f24 = this.f48059x976c1821;
            if (interfaceC25753x6af89f24 != null) {
                try {
                    interfaceC25753x6af89f24.mo72511x360802();
                } catch (java.lang.Exception e17) {
                    this.f48051xbe97f590.e(this.TAG, "release: videoEncoder.stop()", e17);
                }
                try {
                    this.f48059x976c1821.mo72505x41012807();
                } catch (java.lang.Exception e18) {
                    this.f48051xbe97f590.e(this.TAG, "release: videoEncoder.release()", e18);
                }
                this.f48059x976c1821 = null;
            }
            com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 interfaceC25752x15302b69 = this.f48040x41a3a466;
            if (interfaceC25752x15302b69 != null) {
                try {
                    interfaceC25752x15302b69.mo97328x360802();
                } catch (java.lang.Exception e19) {
                    this.f48051xbe97f590.e(this.TAG, "release: audioEncoder.stop()", e19);
                }
                try {
                    this.f48040x41a3a466.mo97325x41012807();
                } catch (java.lang.Exception e27) {
                    this.f48051xbe97f590.e(this.TAG, "release: audioEncoder.release()", e27);
                }
                this.f48040x41a3a466 = null;
            }
            boolean z17 = false;
            if (this.f48052x637007d != null) {
                if (this.f48053x88ffc144) {
                    this.f48053x88ffc144 = false;
                    try {
                        z17 = this.f48052x637007d.mo72398x360802(this.f48049xd6a72044);
                    } catch (java.lang.Exception e28) {
                        this.f48051xbe97f590.e(this.TAG, "release: muxer.stop()", e28);
                    }
                }
                try {
                    this.f48052x637007d.mo72388x41012807();
                } catch (java.lang.Exception e29) {
                    this.f48051xbe97f590.e(this.TAG, "release: muxer.release()", e29);
                }
            }
            this.f48058x13ef41c8 = null;
            this.f48039x904d98a3 = null;
            this.f48060x559558ec.unlock();
            this.f48041xc4f33ab1.unlock();
            this.f48051xbe97f590.i(this.TAG, "encode performance: " + this.f48046xf7c01117);
            return z17;
        } catch (java.lang.Throwable th6) {
            this.f48060x559558ec.unlock();
            this.f48041xc4f33ab1.unlock();
            throw th6;
        }
    }

    /* renamed from: releaseOutputBuffer */
    private void m97490xab26be48(com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61 c25653x39170d61, int i17, boolean z17) {
        try {
            c25653x39170d61.mo96260xab26be48(i17, z17);
        } catch (java.lang.Error | java.lang.Exception e17) {
            this.f48051xbe97f590.e(this.TAG, "releaseOutputBuffer", e17);
            if (e17 instanceof android.media.MediaCodec.CodecException) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f48051xbe97f590;
                java.lang.String str = this.TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CodecException - isTransient = ");
                android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) e17;
                sb6.append(codecException.isTransient());
                sb6.append(" , isRecoverable = ");
                sb6.append(codecException.isRecoverable());
                sb6.append(" , errorCode = ");
                sb6.append(codecException.getErrorCode());
                c25799x4a77fd1.e(str, sb6.toString());
                if (((android.media.MediaCodec.CodecException) e17).isTransient()) {
                    m97495xe9f95e2(20L);
                    m97490xab26be48(c25653x39170d61, i17, z17);
                }
            }
            throw e17;
        }
    }

    /* renamed from: signalEndOfAudioStream */
    private void m97491x794c024c() {
        try {
            if (this.f48043x9ba792b4) {
                return;
            }
            this.f48051xbe97f590.d(this.TAG, "signalEndOfAudioStream: ");
            this.f48043x9ba792b4 = this.f48040x41a3a466.mo97320x6affabc();
        } catch (java.lang.Throwable th6) {
            this.f48051xbe97f590.e(this.TAG, "signalEndOfAudioStream failed", th6);
        }
    }

    /* renamed from: signalEndOfVideoStream */
    private void m97492x9d18ab31() {
        this.f48051xbe97f590.d(this.TAG, "signalEndOfVideoStream: ");
        if (this.f48038x4ef41f62 == null || this.f48044x2c49b0ef) {
            return;
        }
        try {
            this.f48059x976c1821.mo72509x4cb1f740();
            this.f48044x2c49b0ef = true;
        } catch (java.lang.Throwable th6) {
            this.f48051xbe97f590.e(this.TAG, "signalEndOfVideoStream failed", th6);
        }
    }

    /* renamed from: unStarted */
    private boolean m97493x582bdba8() {
        if (this.f48053x88ffc144) {
            return false;
        }
        if (this.f48048xc80df7ca && this.f48058x13ef41c8 == null) {
            return false;
        }
        return (this.f48047x84d5d14f && this.f48039x904d98a3 == null) ? false : true;
    }

    /* renamed from: validAndCorrectBufferInfo */
    private boolean m97494xbf49921d(android.media.MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && (bufferInfo.flags & 4) == 0;
    }

    /* renamed from: waitTime */
    private void m97495xe9f95e2(long j17) {
        try {
            wait(j17);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    /* renamed from: writeAudioFrame */
    private boolean m97496x3a033c76(boolean z17) {
        java.lang.System.currentTimeMillis();
        try {
            this.f48041xc4f33ab1.lock();
            boolean mo97329x3a033c76 = this.f48040x41a3a466.mo97329x3a033c76(z17);
            android.media.MediaFormat mo97321x16f04c23 = this.f48040x41a3a466.mo97321x16f04c23();
            if (this.f48039x904d98a3 == null && mo97321x16f04c23 != null) {
                this.f48051xbe97f590.e(this.TAG, "writeAudioFrame set audioEncodeFormat = " + mo97321x16f04c23);
            }
            this.f48039x904d98a3 = mo97321x16f04c23;
            if (this.f48040x41a3a466.mo97323xa79748b7()) {
                this.f48047x84d5d14f = false;
            }
            return mo97329x3a033c76;
        } finally {
            this.f48041xc4f33ab1.unlock();
        }
    }

    /* renamed from: writeVideoFrame */
    private boolean m97497x7d3b62f1(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14, boolean z17) {
        try {
            this.f48060x559558ec.lock();
            boolean mo72512x3f75eca6 = this.f48059x976c1821.mo72512x3f75eca6(c25734xcdff9c14, z17);
            android.media.MediaFormat mo72498x16f04c23 = this.f48059x976c1821.mo72498x16f04c23();
            if (this.f48058x13ef41c8 == null && mo72498x16f04c23 != null) {
                this.f48051xbe97f590.e(this.TAG, "writeVideoFrame set videoEncodeFormat = " + mo72498x16f04c23);
            }
            this.f48058x13ef41c8 = mo72498x16f04c23;
            if (this.f48059x976c1821.mo72501xa79748b7()) {
                this.f48048xc80df7ca = false;
            }
            return mo72512x3f75eca6;
        } finally {
        }
    }

    /* renamed from: audioTrackWritable */
    public boolean m97498x61992dd5() {
        boolean z17 = true;
        if (this.f48047x84d5d14f && (this.f48053x88ffc144 || this.f48039x904d98a3 == null)) {
            return true;
        }
        synchronized (this) {
            if (!this.f48047x84d5d14f || (!this.f48053x88ffc144 && this.f48039x904d98a3 != null)) {
                z17 = false;
            }
        }
        return z17;
    }

    /* renamed from: createInputSurface */
    public synchronized android.view.Surface m97499x4310109f() {
        if (this.f48038x4ef41f62 == null && this.f48048xc80df7ca) {
            this.f48038x4ef41f62 = this.f48059x976c1821.mo72496x4310109f();
        }
        this.f48051xbe97f590.i(this.TAG, "createInputSurface _inputSurface = " + this.f48038x4ef41f62 + " hasVideoTrack = " + this.f48048xc80df7ca);
        return this.f48038x4ef41f62;
    }

    /* renamed from: endWriteAudioSample */
    public void m97500x6affabc() {
        this.f48051xbe97f590.d(this.TAG, "endWriteAudioSample:" + this);
        try {
            this.f48041xc4f33ab1.lock();
            if (!this.f48057xdf23d93d && !this.f48043x9ba792b4) {
                this.f48051xbe97f590.d(this.TAG, "endWriteAudioSample: ");
                this.f48043x9ba792b4 = this.f48040x41a3a466.mo97320x6affabc();
                m97477x6d263e7e(false, null);
            }
        } finally {
            this.f48041xc4f33ab1.unlock();
        }
    }

    /* renamed from: endWriteVideoSample */
    public void m97501x2a7ca3a1(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        int i17;
        this.f48051xbe97f590.i(this.TAG, "endWriteVideoSample: ");
        if (this.f48057xdf23d93d || this.f48038x4ef41f62 == null || this.f48044x2c49b0ef) {
            return;
        }
        try {
            this.f48060x559558ec.lock();
            this.f48059x976c1821.mo72509x4cb1f740();
            this.f48044x2c49b0ef = true;
        } finally {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                i17 = 0;
                while (!this.f48059x976c1821.mo72501xa79748b7()) {
                    i17++;
                    m97478xc2eeb239(false, c25734xcdff9c14);
                }
                this.f48051xbe97f590.i(this.TAG, "make sure eos received,loop:%d  cost:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            } finally {
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        i17 = 0;
        while (!this.f48059x976c1821.mo72501xa79748b7() && java.lang.System.currentTimeMillis() - currentTimeMillis2 < 3000) {
            i17++;
            m97478xc2eeb239(false, c25734xcdff9c14);
        }
        this.f48051xbe97f590.i(this.TAG, "make sure eos received,loop:%d  cost:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
    }

    /* renamed from: getAudioPresentationTimeUs */
    public long m97502x93724445() {
        return this.f48040x41a3a466.mo97322xaafb0031();
    }

    /* renamed from: getMuxer */
    public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 m97503x74d4a6c7() {
        return this.f48052x637007d;
    }

    /* renamed from: getOutHeight */
    public int m97504x3bf36b5f() {
        return (int) this.f48059x976c1821.mo72500xd0e54f2d().f47832xb7389127;
    }

    /* renamed from: getOutWidth */
    public int m97505x7ea32c8e() {
        return (int) this.f48059x976c1821.mo72500xd0e54f2d().f47833x6be2dc6;
    }

    /* renamed from: getPerformance */
    public com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b m97506x819956fa() {
        return this.f48046xf7c01117;
    }

    /* renamed from: getVideoPresentationTimeUs */
    public long m97507xbcb7bdaa() {
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 interfaceC25753x6af89f24 = this.f48059x976c1821;
        if (interfaceC25753x6af89f24 == null) {
            return -1L;
        }
        return interfaceC25753x6af89f24.mo72499xaafb0031();
    }

    /* renamed from: isReleased */
    public boolean m97508xafdb8087() {
        return this.f48057xdf23d93d;
    }

    /* renamed from: isVideoEncodeNeedVideoRenderOutputTexture */
    public boolean m97509x3764a7a6() {
        return this.f48059x976c1821.mo72502x5836851f();
    }

    /* renamed from: prepareParallelSegmentInfo */
    public void m97510x60565d73(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        this.f48052x637007d.mo72387x60565d73(i17, c25738xead39d26, c25738xead39d262);
    }

    /* renamed from: processVideoTexture */
    public void m97511x7423ac2f(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f48059x976c1821.mo72504x7423ac2f(c25745xc3945049, c25736x76b98a57);
    }

    /* renamed from: reset */
    public void m97512x6761d4f() {
        this.f48053x88ffc144 = false;
        this.f48048xc80df7ca = true;
        this.f48038x4ef41f62 = null;
        this.f48044x2c49b0ef = false;
        com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 m97836xdf726115 = com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.C25804x21c1ffb1.m97836xdf726115(this.f48055xb41088c6, 0);
        this.f48052x637007d = m97836xdf726115;
        m97836xdf726115.mo72392x48907998(this.f48045xc5684a2b);
        this.f48059x976c1821.mo72506x6761d4f();
        this.f48059x976c1821.mo72507x8f07f4fb(this.f48052x637007d);
        this.f48051xbe97f590.i(this.TAG, "resetEncoderWriter");
    }

    /* renamed from: setEncodeOption */
    public void m97513x5ca3d7ad(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
        if (c25679xbb204036.m96741xa83ce40f() <= 0 || c25679xbb204036.m96739x4590a3fe() <= 0) {
            throw new java.lang.IllegalArgumentException("width and height must > 0");
        }
        this.f48045xc5684a2b = c25679xbb204036.m96732x5a5dd5d();
        this.f48052x637007d.mo72392x48907998(c25679xbb204036);
    }

    /* renamed from: setLoggerConfig */
    public void m97514x596d8674(com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73) {
        this.f48051xbe97f590.m97816x78bda44(c25800x8b670e73);
    }

    /* renamed from: setVideoSampleRenderContext */
    public void m97515xd49e03b6(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        this.f48059x976c1821.mo72508xd49e03b6(c25779x3338e719);
    }

    /* renamed from: startAudioEncoder */
    public synchronized void m97516x721c39e8() {
        try {
            this.f48041xc4f33ab1.lock();
            this.f48051xbe97f590.d(this.TAG, "AssetWriter startAudioEncoder " + this);
            m97486xc5eb30d(this.f48045xc5684a2b);
            this.f48047x84d5d14f = true;
            this.f48040x41a3a466.mo97327x68ac462();
            this.f48042xc797953b = true;
        } finally {
            this.f48041xc4f33ab1.unlock();
        }
    }

    /* renamed from: startVideoEncoder */
    public synchronized void m97517xc7e4ada3() {
        try {
            this.f48060x559558ec.lock();
            this.f48051xbe97f590.d(this.TAG, "AssetWriter startVideoEncoder " + this);
            m97487x622726c8(this.f48045xc5684a2b);
            this.f48048xc80df7ca = true;
            m97499x4310109f();
            this.f48059x976c1821.mo72510x68ac462();
            this.f48061xe9738920 = true;
        } finally {
            this.f48060x559558ec.unlock();
        }
    }

    /* renamed from: stop */
    public boolean m97518x360802() {
        this.f48051xbe97f590.i(this.TAG, "AssetWriter stop " + this);
        if (this.f48057xdf23d93d) {
            return false;
        }
        if (!this.f48061xe9738920 && !this.f48042xc797953b) {
            return false;
        }
        this.f48061xe9738920 = false;
        this.f48042xc797953b = false;
        m97478xc2eeb239(true, null);
        m97477x6d263e7e(true, null);
        return m97489x41012807();
    }

    /* renamed from: videoTrackWritable */
    public boolean m97520x522ca950() {
        boolean z17 = true;
        if (this.f48048xc80df7ca && (this.f48053x88ffc144 || this.f48058x13ef41c8 == null)) {
            return true;
        }
        synchronized (this) {
            if (!this.f48048xc80df7ca || (!this.f48053x88ffc144 && this.f48058x13ef41c8 != null)) {
                z17 = false;
            }
        }
        return z17;
    }

    /* renamed from: writeAudioSample */
    public void m97521x1ba943c1(long j17, java.nio.ByteBuffer byteBuffer) {
        long j18;
        this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "writeAudioSample: " + j17 + "  " + byteBuffer.limit());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (this.f48057xdf23d93d) {
                this.f48051xbe97f590.e(this.TAG, "writeAudioSample error, audioWriter released");
                this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "writeAudioSample finish cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int position2 = byteBuffer.position();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() + f48024x857b539d;
            long j19 = 0;
            while (position2 < limit) {
                try {
                    this.f48041xc4f33ab1.lock();
                    j18 = currentTimeMillis;
                    try {
                        j19 += this.f48040x41a3a466.mo97330x1ba943c1(j17 + j19, byteBuffer);
                        int position3 = byteBuffer.position();
                        if (position3 == position2) {
                            if (java.lang.System.currentTimeMillis() >= currentTimeMillis2) {
                                this.f48051xbe97f590.w(this.TAG, "attach retry limit, break it");
                                throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(-208, "Write audio sample timeout");
                            }
                            this.f48051xbe97f590.w(this.TAG, "write audio sample not forward");
                        }
                        byteBuffer.limit(limit);
                        try {
                            this.f48041xc4f33ab1.unlock();
                            m97477x6d263e7e(false, null);
                            m97474xe8ffd063("audio");
                            position2 = position3;
                            currentTimeMillis = j18;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            try {
                                if (!(th instanceof com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b)) {
                                    throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(-122, th);
                                }
                                throw th;
                            } catch (java.lang.Throwable th7) {
                                this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "writeAudioSample finish cost " + (java.lang.System.currentTimeMillis() - j18));
                                throw th7;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        this.f48041xc4f33ab1.unlock();
                        throw th;
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                }
            }
            long j27 = currentTimeMillis;
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "writeAudioSample finish cost " + (java.lang.System.currentTimeMillis() - j27));
        } catch (java.lang.Throwable th10) {
            th = th10;
            j18 = currentTimeMillis;
        }
    }

    /* renamed from: writeVideoSample */
    public void m97522x3f75eca6(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (this.f48038x4ef41f62 == null) {
                this.f48051xbe97f590.e(this.TAG, "writeVideoSample error, _inputSurface is null");
                return;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            m97478xc2eeb239(false, c25734xcdff9c14);
            m97474xe8ffd063("video");
            this.f48046xf7c01117.add(java.lang.System.currentTimeMillis() - currentTimeMillis2);
            if (c25734xcdff9c14.m97193x75286adb().m97210x5241396d()) {
                this.f48051xbe97f590.e(this.TAG, "sampleBuffer time isInvalid");
            } else {
                this.f48052x637007d.mo72401xe437d320(true, c25734xcdff9c14.m97195xfb85bb43());
            }
        } finally {
            this.f48051xbe97f590.m97814x5d2a96d(this.TAG, "writeVideoSample finish cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: stop */
    public boolean m97519x360802(boolean z17) {
        this.f48049xd6a72044 = z17;
        this.f48051xbe97f590.i(this.TAG, "AssetWriter stop " + this + " isCancel = " + z17);
        return m97518x360802();
    }

    public C25764x27f5008f(java.lang.String str) {
        this(str, null);
    }
}
