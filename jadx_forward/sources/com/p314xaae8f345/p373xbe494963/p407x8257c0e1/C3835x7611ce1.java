package com.p314xaae8f345.p373xbe494963.p407x8257c0e1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2 */
/* loaded from: classes14.dex */
public class C3835x7611ce1 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: DRAIN_ERROR */
    private static final int f15007xd510fcc1 = -1;

    /* renamed from: DRAIN_SUCCESS */
    private static final int f15008xbda19c7c = 0;

    /* renamed from: DRAIN_SUCCESS_MEET_END_OF_STREAM */
    private static final int f15009x4140b70f = 1;

    /* renamed from: INVALID_COLOR_FORMAT */
    private static final int f15010xf41bf1db = 0;

    /* renamed from: mExternalSurface */
    private android.view.Surface f15012x7ac08635;

    /* renamed from: mHeight */
    private int f15013x6a4b7f4;

    /* renamed from: mIsHevc */
    private boolean f15015x90fd381;

    /* renamed from: mIsRealTime */
    private boolean f15016x79a4c122;

    /* renamed from: mIsStarted */
    private boolean f15017xe713d20a;

    /* renamed from: mNativeVideoDecoderImplAndroid */
    private long f15020x1fd9d9a2;

    /* renamed from: mOutputSurface */
    private android.view.Surface f15022x6be280ff;

    /* renamed from: mSurfaceTexture */
    private android.graphics.SurfaceTexture f15024x30495d7b;

    /* renamed from: mTAG */
    private final java.lang.String f15025x32cfed;

    /* renamed from: mUseAsyncMode */
    private boolean f15027x7121cd85;

    /* renamed from: mUseByteBuffer */
    private boolean f15028x75da8e2;

    /* renamed from: mUseSoftwareDecoder */
    private boolean f15029x2e73b763;

    /* renamed from: mWidth */
    private int f15030xbefb7959;

    /* renamed from: mThrottlers */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b f15026xc7e76f38 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();

    /* renamed from: mMediaCodec */
    private android.media.MediaCodec f15019x4e44f6df = null;

    /* renamed from: mInputBufferQueue */
    private final java.util.Queue<java.lang.Integer> f15014xbc297514 = new java.util.LinkedList();

    /* renamed from: mOutputBufferQueue */
    private final java.util.Queue<android.util.Pair<java.lang.Integer, android.media.MediaCodec.BufferInfo>> f15021xda955803 = new java.util.LinkedList();

    /* renamed from: mEnableLimitMaxDecFrameBufferingInH264Sps */
    private boolean f15011xd9237a0b = true;

    /* renamed from: mSPSModifier */
    private final com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a f15023xd5171c00 = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a();

    /* renamed from: mLastPresentationTimeUs */
    private long f15018x9d359008 = 0;

    public C3835x7611ce1(java.lang.String str, boolean z17, boolean z18, int i17, int i18, boolean z19, boolean z27, boolean z28, long j17) {
        this.f15029x2e73b763 = false;
        this.f15028x75da8e2 = false;
        this.f15027x7121cd85 = false;
        this.f15030xbefb7959 = 0;
        this.f15013x6a4b7f4 = 0;
        this.f15015x90fd381 = false;
        this.f15025x32cfed = str + "HardwareVideoDecoder2";
        this.f15016x79a4c122 = z17;
        this.f15029x2e73b763 = z19;
        this.f15028x75da8e2 = z27;
        this.f15027x7121cd85 = z28;
        this.f15020x1fd9d9a2 = j17;
        this.f15030xbefb7959 = i17;
        this.f15013x6a4b7f4 = i18;
        this.f15015x90fd381 = z18;
    }

    /* renamed from: configureDecoder */
    private boolean m31313xbdf6f27e(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat, android.view.Surface surface) {
        try {
            mediaCodec.configure(mediaFormat, surface, (android.media.MediaCrypto) null, 0);
            mediaCodec.setVideoScalingMode(1);
            mediaCodec.start();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Start MediaCodec(%s) success.", mediaCodec.getName());
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Configure MediaCodec failed: ", th6);
            return false;
        }
    }

    /* renamed from: destroyMediaCodec */
    private void m31314xc544a2c(android.media.MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                try {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "mediaCodec stop");
                    mediaCodec.stop();
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "mediaCodec release");
                    mediaCodec.release();
                } catch (java.lang.Throwable th6) {
                    try {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Stop MediaCodec failed." + th6.getMessage());
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "mediaCodec release");
                        mediaCodec.release();
                    } catch (java.lang.Throwable th7) {
                        try {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "mediaCodec release");
                            mediaCodec.release();
                        } catch (java.lang.Throwable th8) {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "release MediaCodec failed.", th8);
                        }
                        throw th7;
                    }
                }
            } catch (java.lang.Throwable th9) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "release MediaCodec failed.", th9);
            }
        }
    }

    /* renamed from: drainDecodedFrameAsyncMode */
    private int m31315x2455f610() {
        if (this.f15021xda955803.isEmpty()) {
            return -1;
        }
        android.util.Pair<java.lang.Integer, android.media.MediaCodec.BufferInfo> poll = this.f15021xda955803.poll();
        int intValue = ((java.lang.Integer) poll.first).intValue();
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) poll.second;
        this.f15018x9d359008 = bufferInfo.presentationTimeUs;
        if ((bufferInfo.flags & 4) != 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "meet end of stream.");
            this.f15019x4e44f6df.releaseOutputBuffer(intValue, true);
            return 1;
        }
        int m31321xba52dae9 = this.f15028x75da8e2 ? m31321xba52dae9(intValue, bufferInfo) : 0;
        this.f15019x4e44f6df.releaseOutputBuffer(intValue, true);
        if (this.f15012x7ac08635 != null) {
            long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            long j17 = this.f15020x1fd9d9a2;
            if (j17 != 0) {
                m31328x72633c7a(j17, millis);
            }
        }
        return m31321xba52dae9;
    }

    /* renamed from: drainDecodedFrameSyncMode */
    private int m31316x55fe0ed() {
        android.media.MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBuffer;
        int i17 = 0;
        while (true) {
            if (i17 >= 3 || (dequeueOutputBuffer = this.f15019x4e44f6df.dequeueOutputBuffer((bufferInfo = new android.media.MediaCodec.BufferInfo()), java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(10L))) == -1) {
                return -1;
            }
            if (dequeueOutputBuffer == -3) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "on output buffers changed");
            } else if (dequeueOutputBuffer == -2) {
                m31337x4d2bd628();
            } else {
                if (dequeueOutputBuffer >= 0) {
                    this.f15018x9d359008 = bufferInfo.presentationTimeUs;
                    if ((bufferInfo.flags & 4) != 0) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "meet end of stream.");
                        this.f15019x4e44f6df.releaseOutputBuffer(dequeueOutputBuffer, true);
                        return 1;
                    }
                    int m31321xba52dae9 = this.f15028x75da8e2 ? m31321xba52dae9(dequeueOutputBuffer, bufferInfo) : 0;
                    this.f15019x4e44f6df.releaseOutputBuffer(dequeueOutputBuffer, true);
                    if (this.f15012x7ac08635 != null) {
                        long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                        long j17 = this.f15020x1fd9d9a2;
                        if (j17 != 0) {
                            m31328x72633c7a(j17, millis);
                        }
                    }
                    return m31321xba52dae9;
                }
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(this.f15025x32cfed, "dequeueOutputBuffer get invalid index: %d", java.lang.Integer.valueOf(dequeueOutputBuffer));
            }
            i17++;
        }
    }

    /* renamed from: feedDataToMediaCodec */
    private boolean m31317x2bfc8df5(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140) {
        java.nio.ByteBuffer byteBuffer;
        int i17;
        java.nio.ByteBuffer byteBuffer2;
        if (this.f15019x4e44f6df == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "MediaCodec is stopped.");
            return false;
        }
        if (c3811xcc176140 == null || (!c3811xcc176140.f14896x84af152e && ((byteBuffer2 = c3811xcc176140.f14889x2eefaa) == null || byteBuffer2.remaining() == 0))) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "receive empty buffer.");
            return true;
        }
        if (!this.f15027x7121cd85) {
            java.nio.ByteBuffer[] inputBuffers = this.f15019x4e44f6df.getInputBuffers();
            if (inputBuffers == null || inputBuffers.length == 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "get invalid input buffers.");
                return false;
            }
            int dequeueInputBuffer = this.f15019x4e44f6df.dequeueInputBuffer(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            if (dequeueInputBuffer < 0) {
                return false;
            }
            byteBuffer = inputBuffers[dequeueInputBuffer];
            i17 = dequeueInputBuffer;
        } else {
            if (this.f15014xbc297514.isEmpty()) {
                return false;
            }
            int intValue = this.f15014xbc297514.poll().intValue();
            byteBuffer = this.f15019x4e44f6df.getInputBuffer(intValue);
            i17 = intValue;
        }
        if (c3811xcc176140.f14896x84af152e) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "feedDataToMediaCodec BUFFER_FLAG_END_OF_STREAM");
            this.f15019x4e44f6df.queueInputBuffer(i17, 0, 0, 0L, 4);
        } else {
            m31325xbeb1c59b(c3811xcc176140);
            int remaining = c3811xcc176140.f14889x2eefaa.remaining();
            byteBuffer.put(c3811xcc176140.f14889x2eefaa);
            this.f15019x4e44f6df.queueInputBuffer(i17, 0, remaining, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(c3811xcc176140.pts), 0);
        }
        return true;
    }

    /* renamed from: getSpsData */
    private byte[] m31318xc6cd924a(byte[] bArr, int[] iArr) {
        int i17 = 0;
        while (true) {
            if (i17 + 4 >= bArr.length || (i17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140.m30967x1226c977(i17, java.nio.ByteBuffer.wrap(bArr))) < 0) {
                break;
            }
            if ((bArr[i17] & 31) == 7) {
                iArr[0] = i17;
                break;
            }
        }
        int i18 = iArr[0];
        if (i18 < 0) {
            return null;
        }
        int length = bArr.length - i18;
        while (true) {
            int i19 = i18 + 3;
            if (i19 >= bArr.length) {
                break;
            }
            byte b17 = bArr[i18];
            if ((b17 != 0 || bArr[i18 + 1] != 0 || bArr[i18 + 2] != 1) && (b17 != 0 || bArr[i18 + 1] != 0 || bArr[i18 + 2] != 0 || bArr[i19] != 1)) {
                i18++;
            }
        }
        length = i18 - iArr[0];
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, iArr[0], bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: getSupportedByteBufferColorFormat */
    private int m31319x4337ad9a(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 : codecCapabilities.colorFormats) {
            if (i17 == 19) {
                z17 = true;
            } else if (i17 == 21) {
                z18 = true;
            }
        }
        if (z17) {
            return 19;
        }
        if (z18) {
            return 21;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "I420/NV12 not found, formats: " + java.util.Arrays.toString(codecCapabilities.colorFormats));
        return 0;
    }

    /* renamed from: handleDecoderError */
    private void m31320x9a19066c(int i17) {
        long j17 = this.f15020x1fd9d9a2;
        if (j17 != 0) {
            m31327x29c544ea(j17, i17);
        }
    }

    /* renamed from: handleOutputBuffer */
    private int m31321xba52dae9(int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        int m30955x754a37bb;
        synchronized (this) {
            java.nio.ByteBuffer outputBuffer = this.f15019x4e44f6df.getOutputBuffer(i17);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            outputBuffer.rewind();
            android.media.MediaFormat outputFormat = this.f15019x4e44f6df.getOutputFormat();
            int integer = outputFormat.getInteger("color-format");
            if (integer == 19) {
                m30955x754a37bb = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.I420.m30955x754a37bb();
            } else {
                if (integer != 21) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Unsupported color format:".concat(java.lang.String.valueOf(integer)));
                    m31320x9a19066c(6);
                    return -1;
                }
                m30955x754a37bb = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.NV12.m30955x754a37bb();
            }
            int i18 = m30955x754a37bb;
            int integer2 = outputFormat.getInteger("width");
            int integer3 = outputFormat.getInteger("height");
            int abs = (outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-left")) ? java.lang.Math.abs(outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1 : integer2;
            int abs2 = (outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) ? java.lang.Math.abs(outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1 : integer3;
            if (outputFormat.containsKey("stride")) {
                integer2 = outputFormat.getInteger("stride");
            }
            int i19 = integer2;
            int integer4 = outputFormat.containsKey("slice-height") ? outputFormat.getInteger("slice-height") : integer3;
            long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            long j17 = this.f15020x1fd9d9a2;
            if (j17 != 0) {
                m31326x1f8c945e(j17, i18, outputBuffer, bufferInfo.size, abs, abs2, i19, integer4, millis);
            }
            return 0;
        }
    }

    /* renamed from: initializeSurface */
    private boolean m31322x8fb596fd(int i17) {
        synchronized (this) {
            try {
                this.f15024x30495d7b = new android.graphics.SurfaceTexture(i17);
                this.f15022x6be280ff = new android.view.Surface(this.f15024x30495d7b);
                this.f15024x30495d7b.setOnFrameAvailableListener(this);
            } catch (android.view.Surface.OutOfResourcesException e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Initialize surface failed: ", e17);
                return false;
            }
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Initialize surface ok.");
        return true;
    }

    /* renamed from: isResolutionSupported */
    private boolean m31323xc4543d8(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, int i17, int i18) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 21 || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return true;
        }
        android.util.Range<java.lang.Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        android.util.Range<java.lang.Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return true;
        }
        if (i17 < supportedWidths.getLower().intValue() || i18 < supportedHeights.getLower().intValue()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Resolution %dx%d below range: %sx%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), supportedWidths.toString(), supportedHeights.toString());
            return false;
        }
        if (i17 > supportedWidths.getUpper().intValue() || i18 > supportedHeights.getUpper().intValue()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "Resolution %dx%d above range: %sx%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), supportedWidths.toString(), supportedHeights.toString());
        }
        return true;
    }

    /* renamed from: lambda$limitMaxDecFrameBufferingInH264Sps$0 */
    public static /* synthetic */ boolean m31324xc03ada24(com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1 c3835x7611ce1, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(c3835x7611ce1.f15025x32cfed, "frame cropping flag exist, crop[l:" + i17 + ",r:" + i18 + ",t:" + i19 + ",b:" + i27 + "]");
        c3835x7611ce1.f15011xd9237a0b = false;
        long j17 = c3835x7611ce1.f15020x1fd9d9a2;
        if (j17 != 0) {
            c3835x7611ce1.m31330xc5b9d6c4(j17, i17, i18, i19, i27);
        }
        return false;
    }

    /* renamed from: limitMaxDecFrameBufferingInH264Sps */
    private void m31325xbeb1c59b(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140) {
        byte[] a17;
        byte[] bArr;
        java.nio.ByteBuffer b17;
        byte[] bArr2;
        boolean z17;
        byte b18;
        if (c3811xcc176140.m30973x937e840() && c3811xcc176140.f14887xbcfd1870 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.EnumC3810x346f3850.H264 && this.f15011xd9237a0b && this.f15016x79a4c122 && (a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(c3811xcc176140.f14889x2eefaa.remaining())) != null) {
            c3811xcc176140.f14889x2eefaa.get(a17);
            c3811xcc176140.f14889x2eefaa.rewind();
            int[] iArr = {-1};
            byte[] m31318xc6cd924a = m31318xc6cd924a(a17, iArr);
            if (m31318xc6cd924a == null || iArr[0] < 0) {
                return;
            }
            try {
                com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a aVar = this.f15023xd5171c00;
                com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a.InterfaceC30882a interfaceC30882a = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a.InterfaceC30882a(this) { // from class: com.tencent.liteav.videoconsumer2.a

                    /* renamed from: a, reason: collision with root package name */
                    private final com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1 f128522a;

                    {
                        this.f128522a = this;
                    }

                    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a.InterfaceC30882a
                    public final boolean a(int i17, int i18, int i19, int i27) {
                        return com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1.m31324xc03ada24(this.f128522a, i17, i18, i19, i27);
                    }
                };
                byte[] bArr3 = new byte[m31318xc6cd924a.length];
                int i17 = 0;
                int i18 = 0;
                while (i17 < m31318xc6cd924a.length) {
                    if (i17 < m31318xc6cd924a.length - 3 && (b18 = m31318xc6cd924a[i17]) == 0) {
                        int i19 = i17 + 1;
                        if (m31318xc6cd924a[i19] == 0 && m31318xc6cd924a[i17 + 2] == 3) {
                            int i27 = i17 + 3;
                            if (m31318xc6cd924a[i27] <= 3) {
                                int i28 = i18 + 1;
                                bArr3[i18] = b18;
                                i18 = i28 + 1;
                                bArr3[i28] = m31318xc6cd924a[i19];
                                i17 = i27;
                            }
                        }
                    }
                    bArr3[i18] = m31318xc6cd924a[i17];
                    i17++;
                    i18++;
                }
                if (i18 != m31318xc6cd924a.length) {
                    bArr2 = new byte[i18];
                    java.lang.System.arraycopy(bArr3, 0, bArr2, 0, i18);
                } else {
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    z17 = true;
                } else {
                    bArr2 = m31318xc6cd924a;
                    z17 = false;
                }
                byte[] a18 = aVar.a(new java.io.ByteArrayInputStream(bArr2), interfaceC30882a);
                if (a18 != null && z17) {
                    a18 = com.p314xaae8f345.p373xbe494963.p403xca65ed71.a.a.a(a18);
                }
                bArr = a18;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "modify dec buffer error ", th6);
                bArr = null;
            }
            if (bArr == null || (b17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.b((a17.length - m31318xc6cd924a.length) + bArr.length)) == null) {
                return;
            }
            c3811xcc176140.f14889x2eefaa = b17;
            int i29 = iArr[0];
            if (i29 > 0) {
                b17.put(a17, 0, i29);
            }
            c3811xcc176140.f14889x2eefaa.put(bArr);
            java.nio.ByteBuffer byteBuffer = c3811xcc176140.f14889x2eefaa;
            int i37 = iArr[0];
            byteBuffer.put(a17, m31318xc6cd924a.length + i37, (a17.length - i37) - m31318xc6cd924a.length);
            c3811xcc176140.f14889x2eefaa.rewind();
        }
    }

    /* renamed from: nativeOnByteBuffer */
    private native void m31326x1f8c945e(long j17, int i17, java.nio.ByteBuffer byteBuffer, int i18, int i19, int i27, int i28, int i29, long j18);

    /* renamed from: nativeOnDecodedFrameFailed */
    private native void m31327x29c544ea(long j17, int i17);

    /* renamed from: nativeOnDecodedFrameWithSurface */
    private native void m31328x72633c7a(long j17, long j18);

    /* renamed from: nativeOnFrameAvailable */
    private native void m31329x7f8b79d2(long j17, long j18);

    /* renamed from: nativeOnFrameFlagCropExist */
    private native void m31330xc5b9d6c4(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeOnInputBufferAvailable */
    private native void m31331x6b90ceb5(long j17);

    /* renamed from: nativeOnOutputBufferAvailable */
    private native void m31332x1d868c72(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMediaCodecError */
    public void m31333x20287eb7(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        if (mediaCodec != this.f15019x4e44f6df) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "onMediaCodecOutputBufferAvailable: MediaCodec changed.");
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "onMediaCodecError: " + codecException.toString());
        m31320x9a19066c(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMediaCodecInputBufferAvailable */
    public void m31334x6bb7f0b0(android.media.MediaCodec mediaCodec, int i17) {
        if (mediaCodec != this.f15019x4e44f6df) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "onMediaCodecInputBufferAvailable: MediaCodec changed.");
            return;
        }
        this.f15014xbc297514.offer(java.lang.Integer.valueOf(i17));
        long j17 = this.f15020x1fd9d9a2;
        if (j17 != 0) {
            m31331x6b90ceb5(j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMediaCodecOutputBufferAvailable */
    public void m31335x2243a9d7(android.media.MediaCodec mediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != this.f15019x4e44f6df) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "onMediaCodecOutputBufferAvailable: MediaCodec changed.");
            return;
        }
        this.f15021xda955803.offer(new android.util.Pair<>(java.lang.Integer.valueOf(i17), bufferInfo));
        long j17 = this.f15020x1fd9d9a2;
        if (j17 != 0) {
            m31332x1d868c72(j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMediaCodecOutputFormatChanged */
    public void m31336xe1d33dab(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        if (mediaCodec != this.f15019x4e44f6df) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "onMediaCodecOutputFormatChanged: MediaCodec changed.");
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "onMediaCodecOutputFormatChanged: ".concat(java.lang.String.valueOf(mediaFormat)));
        }
    }

    /* renamed from: outputFormatChange */
    private void m31337x4d2bd628() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "decode output format changed: ".concat(java.lang.String.valueOf(this.f15019x4e44f6df.getOutputFormat())));
    }

    /* renamed from: setCallback */
    private void m31338x6c4ebec7(android.media.MediaCodec mediaCodec) {
        android.media.MediaCodec.Callback callback = new android.media.MediaCodec.Callback() { // from class: com.tencent.liteav.videoconsumer2.HardwareVideoDecoder2.1
            @Override // android.media.MediaCodec.Callback
            public final void onError(android.media.MediaCodec mediaCodec2, android.media.MediaCodec.CodecException codecException) {
                com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1.this.m31333x20287eb7(mediaCodec2, codecException);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec2, int i17) {
                com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1.this.m31334x6bb7f0b0(mediaCodec2, i17);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec2, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
                com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1.this.m31335x2243a9d7(mediaCodec2, i17, bufferInfo);
            }

            @Override // android.media.MediaCodec.Callback
            public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec2, android.media.MediaFormat mediaFormat) {
                com.p314xaae8f345.p373xbe494963.p407x8257c0e1.C3835x7611ce1.this.m31336xe1d33dab(mediaCodec2, mediaFormat);
            }
        };
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 23) {
            mediaCodec.setCallback(callback);
        } else {
            mediaCodec.setCallback(callback, new android.os.Handler(android.os.Looper.myLooper()));
        }
    }

    /* renamed from: startInternal */
    private int m31340x29936d3f() {
        android.view.Surface surface;
        int i17;
        try {
            java.lang.String str = this.f15015x90fd381 ? "video/hevc" : "video/avc";
            android.media.MediaCodec m31342xb9d00d8b = m31342xb9d00d8b(this.f15029x2e73b763, str);
            this.f15019x4e44f6df = m31342xb9d00d8b;
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = m31342xb9d00d8b.getCodecInfo().getCapabilitiesForType(str);
            int i18 = this.f15030xbefb7959;
            if (i18 > 0 && (i17 = this.f15013x6a4b7f4) > 0 && !m31323xc4543d8(capabilitiesForType, i18, i17)) {
                return 18;
            }
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.b bVar = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.b();
            bVar.f128327c = str;
            bVar.f128325a = this.f15030xbefb7959;
            bVar.f128326b = this.f15013x6a4b7f4;
            bVar.f128329e = capabilitiesForType;
            bVar.f128328d = this.f15016x79a4c122;
            android.media.MediaFormat a17 = bVar.a();
            if (this.f15028x75da8e2) {
                int m31319x4337ad9a = m31319x4337ad9a(capabilitiesForType);
                if (m31319x4337ad9a == 0) {
                    return 6;
                }
                a17.setInteger("color-format", m31319x4337ad9a);
            }
            if (this.f15027x7121cd85) {
                m31338x6c4ebec7(this.f15019x4e44f6df);
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Start with media format: ".concat(java.lang.String.valueOf(a17)));
            if (this.f15028x75da8e2) {
                surface = null;
            } else {
                surface = this.f15012x7ac08635;
                if (surface == null) {
                    surface = this.f15022x6be280ff;
                }
            }
            if (!m31313xbdf6f27e(this.f15019x4e44f6df, a17, surface)) {
                return 1;
            }
            this.f15017xe713d20a = true;
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Start MediaCodec failed: ", th6);
            return 1;
        }
    }

    /* renamed from: uninitializeSurface */
    private void m31341x5436d84() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Uninitialize surface");
        synchronized (this) {
            android.view.Surface surface = this.f15022x6be280ff;
            if (surface != null) {
                surface.release();
                this.f15022x6be280ff = null;
            }
            android.graphics.SurfaceTexture surfaceTexture = this.f15024x30495d7b;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.f15024x30495d7b = null;
            }
        }
    }

    /* renamed from: createMediaCodecInternal */
    public android.media.MediaCodec m31342xb9d00d8b(boolean z17, java.lang.String str) {
        if (!z17) {
            return android.media.MediaCodec.createDecoderByType(str);
        }
        for (android.media.MediaCodecInfo mediaCodecInfo : new android.media.MediaCodecList(0).getCodecInfos()) {
            java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!mediaCodecInfo.isEncoder()) {
                for (java.lang.String str2 : supportedTypes) {
                    if (str2.contains(str) && com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3813x250d6618.m30991x4fcb31e4(mediaCodecInfo)) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Use soft only decoder:%s", mediaCodecInfo.getName());
                        return android.media.MediaCodec.createByCodecName(mediaCodecInfo.getName());
                    }
                }
            }
        }
        return android.media.MediaCodec.createDecoderByType(str);
    }

    /* renamed from: decodeFrame */
    public boolean m31343x45c12c1f(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140) {
        if (this.f15019x4e44f6df == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15025x32cfed, "MediaCodec is stopped.");
            return false;
        }
        if (c3811xcc176140 == null) {
            return true;
        }
        try {
            if (!m31317x2bfc8df5(c3811xcc176140)) {
                c3811xcc176140.m30977x41012807();
                return false;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Feed data failed: ", th6);
            m31320x9a19066c(4);
        }
        c3811xcc176140.m30977x41012807();
        return true;
    }

    /* renamed from: drainDecodedFrame */
    public int m31344xceb3d8ef() {
        try {
            return this.f15027x7121cd85 ? m31315x2455f610() : m31316x55fe0ed();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15025x32cfed, "Drain frame failed: ", th6);
            m31320x9a19066c(4);
            return -1;
        }
    }

    /* renamed from: getValidInputBufferCount */
    public int m31345xe79f10eb() {
        return this.f15014xbc297514.size();
    }

    /* renamed from: getValidOutputBufferCount */
    public int m31346x353ca748() {
        return this.f15021xda955803.size();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this) {
            android.graphics.SurfaceTexture surfaceTexture2 = this.f15024x30495d7b;
            if (surfaceTexture2 != null && surfaceTexture2 == surfaceTexture) {
                long millis = java.util.concurrent.TimeUnit.MICROSECONDS.toMillis(this.f15018x9d359008);
                long j17 = this.f15020x1fd9d9a2;
                if (j17 != 0) {
                    m31329x7f8b79d2(j17, millis);
                }
            }
        }
    }

    /* renamed from: resetNativeHandle */
    public void m31347xfcc9f00e() {
        this.f15020x1fd9d9a2 = 0L;
    }

    /* renamed from: setEnableVui */
    public void m31348x361acac5(boolean z17) {
        this.f15011xd9237a0b = z17;
    }

    /* renamed from: start */
    public int m31349x68ac462(int i17) {
        if (this.f15017xe713d20a) {
            return 0;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Start: texture_id = %d", java.lang.Integer.valueOf(i17));
        if (!this.f15028x75da8e2 && !m31322x8fb596fd(i17)) {
            return 16;
        }
        int m31339x68ac462 = m31339x68ac462();
        if (m31339x68ac462 != 0) {
            m31341x5436d84();
        }
        return m31339x68ac462;
    }

    /* renamed from: stop */
    public void m31351x360802() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "stop");
        if (this.f15017xe713d20a) {
            m31314xc544a2c(this.f15019x4e44f6df);
            this.f15019x4e44f6df = null;
            m31341x5436d84();
            this.f15017xe713d20a = false;
            this.f15012x7ac08635 = null;
        }
    }

    /* renamed from: updateTexImage */
    public float[] m31352xf5b8bd5d() {
        android.graphics.SurfaceTexture surfaceTexture = this.f15024x30495d7b;
        if (surfaceTexture == null) {
            return null;
        }
        try {
            float[] fArr = new float[16];
            surfaceTexture.updateTexImage();
            this.f15024x30495d7b.getTransformMatrix(fArr);
            return fArr;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15026xc7e76f38.a("updateImage"), this.f15025x32cfed, "updateTexImage exception: ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: start */
    public int m31350x68ac462(android.view.Surface surface) {
        if (this.f15017xe713d20a) {
            return 0;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15025x32cfed, "Start with surface ".concat(java.lang.String.valueOf(surface)));
        if (surface == null) {
            return 17;
        }
        this.f15012x7ac08635 = surface;
        return m31339x68ac462();
    }

    /* renamed from: start */
    private int m31339x68ac462() {
        int m31340x29936d3f = m31340x29936d3f();
        if (m31340x29936d3f != 0 && this.f15016x79a4c122) {
            m31314xc544a2c(this.f15019x4e44f6df);
            this.f15019x4e44f6df = null;
            this.f15016x79a4c122 = false;
            m31340x29936d3f = m31340x29936d3f();
        }
        if (m31340x29936d3f != 0) {
            m31314xc544a2c(this.f15019x4e44f6df);
            this.f15019x4e44f6df = null;
        }
        return m31340x29936d3f;
    }
}
