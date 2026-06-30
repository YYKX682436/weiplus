package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44;

/* renamed from: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder */
/* loaded from: classes14.dex */
public abstract class AbstractC26343x1f759d65 implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d {

    /* renamed from: DUMP_BYTE_BUFFER_BYTES */
    private static final int f52507x3e2487d8 = 100;

    /* renamed from: DUMP_ONE_LINE_BYTES */
    private static final int f52508xdcbbd84 = 20;

    /* renamed from: MEDIA_CODEC_ERROR_INDEX */
    private static final int f52509x677a0d17 = -1000;

    /* renamed from: MEDIA_CODEC_INPUT_TIMEOUT_US */
    private static long f52510xc2cf4a15 = 2000;

    /* renamed from: MEDIA_CODEC_OUTPUT_TIMEOUT_US */
    private static long f52511xf5ccf0d6 = 2000;

    /* renamed from: MSG_FLUSH */
    private static final int f52512x988c0486 = 1002;

    /* renamed from: MSG_RELEASE */
    private static final int f52513x13f09509 = 1003;

    /* renamed from: MSG_RELEASE_OUTPUT_BUFFER */
    private static final int f52514xe0af6888 = 1000;

    /* renamed from: MSG_RELEASE_OUTPUT_BUFFER_INDEX_KEY */
    private static final java.lang.String f52515x3157323b = "index";

    /* renamed from: MSG_RELEASE_OUTPUT_BUFFER_RENDER_KEY */
    private static final java.lang.String f52516x1287942d = "render";

    /* renamed from: MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY */
    private static final java.lang.String f52517x80aef665 = "renderTimestampNs";

    /* renamed from: MSG_SET_OUTPUT_SURFACE */
    private static final int f52518xefbc728a = 1001;

    /* renamed from: sTMediaCodecInited */
    private static boolean f52519xcc855342;

    /* renamed from: mCodecId */
    protected int f52521xd63c1ea4;

    /* renamed from: mCodec */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 f52520xbde45ba9 = null;

    /* renamed from: mSurface */
    protected android.view.Surface f52543x2fa29f80 = null;

    /* renamed from: mStarted */
    protected boolean f52542x2d03f354 = false;

    /* renamed from: mFrameInfo */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f f52534x9b304dce = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f();

    /* renamed from: mEnableSetOutputSurfaceApi */
    private boolean f52533x1e899820 = false;

    /* renamed from: mEnableReleaseOutputBufferWithTimestamp */
    private boolean f52531xc2690df8 = false;

    /* renamed from: mCryptoInfo */
    private android.media.MediaCodec.CryptoInfo f52522x656b795c = null;

    /* renamed from: mMediaCrypto */
    protected android.media.MediaCrypto f52538x7a8de318 = null;

    /* renamed from: mEnableAsyncMode */
    protected boolean f52526xe54dbfcf = false;

    /* renamed from: mDecodeThread */
    private android.os.HandlerThread f52523x2157faa5 = null;

    /* renamed from: mDecoderHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.AsyncDecodeHandler f52524x9e5db833 = null;

    /* renamed from: mInputQueue */
    private java.util.concurrent.BlockingQueue<java.lang.Integer> f52536x2e1417b4 = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: mOutputQueue */
    private java.util.concurrent.BlockingQueue<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f> f52539x782499e3 = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: mEnableRendererSharpen */
    protected int f52532xefaad160 = 0;

    /* renamed from: mEnableHdrCustomRender */
    protected boolean f52529x3c62080d = false;

    /* renamed from: mSharpenShaderPath */
    protected java.lang.String f52541xa2ab0730 = "assets/shaders";

    /* renamed from: mSwitchEnableRendererSharpen */
    protected boolean f52544x630ef84c = true;

    /* renamed from: mEnableDefaultCodecForDolby */
    protected boolean f52528xf795dff4 = false;

    /* renamed from: mIsDolbyCodecFallback */
    protected boolean f52537x23e64d77 = false;

    /* renamed from: mRestartCodecOnException */
    private boolean f52540xcc146c3c = false;

    /* renamed from: mDrmType */
    protected int f52525x10b8544c = -1;

    /* renamed from: mEnableAudioPassThrough */
    private boolean f52527xae65942e = false;

    /* renamed from: mEnableMediaCodecReuse */
    protected boolean f52530xa1d7c492 = false;

    /* renamed from: mThreadLock */
    private final java.lang.Object f52545x958d2aa2 = new java.lang.Object();

    /* renamed from: mHandlerResult */
    private int f52535x3a7bf49a = 0;

    /* renamed from: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder$AsyncDecodeHandler */
    /* loaded from: classes14.dex */
    public class AsyncDecodeHandler extends android.os.Handler {
        public AsyncDecodeHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int m102079xf3b715e9;
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.f52545x958d2aa2) {
                switch (message.what) {
                    case 1000:
                        m102079xf3b715e9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102079xf3b715e9(message.getData());
                        break;
                    case 1001:
                        m102079xf3b715e9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102080x130d4f29((android.view.Surface) message.obj);
                        break;
                    case 1002:
                        m102079xf3b715e9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102076xaf961065();
                        break;
                    case 1003:
                        m102079xf3b715e9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102078x90a72928();
                        break;
                    default:
                        m102079xf3b715e9 = 0;
                        break;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102069xe15ad318(m102079xf3b715e9);
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder$BufferCallback */
    /* loaded from: classes14.dex */
    public class BufferCallback extends com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback {
        private BufferCallback() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback
        /* renamed from: onError */
        public void mo102101xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, android.media.MediaCodec.CodecException codecException) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.mo102091x23aed0ac(), "onError: " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102093x67074b93(codecException));
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102070x636e94bf();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback
        /* renamed from: onInputBufferAvailable */
        public void mo102102x8e2d0dbe(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.f52536x2e1417b4.put(java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.mo102091x23aed0ac(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102093x67074b93(e17));
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback
        /* renamed from: onOutputBufferAvailable */
        public void mo102103x4e722e89(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f();
                c26344xc9e9249f.f52556xa7c470f2 = 0;
                c26344xc9e9249f.f52549xc1af4c72 = i17;
                c26344xc9e9249f.f52560x660bded = bufferInfo.presentationTimeUs;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.mo102096xacac58b0(c26485xc3ef8206, i17, bufferInfo, c26344xc9e9249f);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.f52539x782499e3.put(c26344xc9e9249f);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.mo102091x23aed0ac(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.m102093x67074b93(e17));
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.Callback
        /* renamed from: onOutputFormatChanged */
        public void mo102104xa0df46dd(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, android.media.MediaFormat mediaFormat) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.mo102098xea0cc4d(mediaFormat);
        }
    }

    public AbstractC26343x1f759d65(int i17) {
        this.f52521xd63c1ea4 = i17;
        m102075xfc7752f6();
    }

    /* renamed from: bufferSizeCheck */
    private void m102062xd3c54127(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() < bArr.length) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "decodeAsync, not enough space, byteBuffer.remaining:" + byteBuffer.remaining() + ", buffer size:" + bArr.length);
            try {
                m102065xf0695e9d(bArr, 0, 100, 20);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), e17.toString());
            }
        }
    }

    /* renamed from: decodeAsync */
    private int m102063x457b852e(byte[] bArr, boolean z17, long j17, boolean z18) {
        java.lang.Integer poll = this.f52536x2e1417b4.poll();
        if (poll == null) {
            return 1;
        }
        try {
            java.nio.ByteBuffer m103335xaa9f9f74 = this.f52520xbde45ba9.m103335xaa9f9f74(poll.intValue());
            if (m103335xaa9f9f74 != null) {
                m102062xd3c54127(m103335xaa9f9f74, bArr);
                m103335xaa9f9f74.put(bArr);
            }
            if (!z18 || this.f52522x656b795c == null) {
                this.f52520xbde45ba9.m103344xfe5642d9(poll.intValue(), 0, bArr.length, j17, z17 ? 1 : 0);
            } else {
                this.f52520xbde45ba9.m103345xa5aeefa2(poll.intValue(), 0, this.f52522x656b795c, j17, z17 ? 1 : 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            return m102077xa9f8d7e(e17);
        }
    }

    /* renamed from: dequeueOutputBufferAsync */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f m102064xeff94b0b() {
        this.f52534x9b304dce.f52556xa7c470f2 = 1;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f poll = this.f52539x782499e3.poll();
        return poll == null ? this.f52534x9b304dce : poll;
    }

    /* renamed from: dumpByteArray */
    private void m102065xf0695e9d(byte[] bArr, int i17, int i18, int i19) {
        if (bArr == null || i17 < 0 || i18 <= 0 || i17 >= bArr.length || i17 >= i18 || i19 <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (bArr.length <= i18) {
            i18 = bArr.length;
        }
        int min = java.lang.Math.min(i18 - i17, 100) + i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "dumpByteArray begin:");
        int i27 = 0;
        while (i17 < min) {
            java.lang.String hexString = java.lang.Integer.toHexString(bArr[i17] & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb6.append(hexString.toUpperCase());
            i27++;
            if (i27 % i19 == 0) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), sb6.toString());
                sb6.setLength(0);
            } else {
                sb6.append(" ");
            }
            i17++;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "dumpByteArray end.");
    }

    /* renamed from: exitDecodeThread */
    private void m102066x684b31d6() {
        android.os.HandlerThread handlerThread = this.f52523x2157faa5;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.f52523x2157faa5.join();
            } catch (java.lang.InterruptedException unused) {
            }
            this.f52523x2157faa5 = null;
        }
    }

    /* renamed from: flushAsync */
    private int m102067xd4ba19d8() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "flushAsync: ");
        android.os.Message obtainMessage = this.f52524x9e5db833.obtainMessage();
        obtainMessage.what = 1002;
        return m102088x9f767ee3(obtainMessage);
    }

    /* renamed from: handleFlush */
    private int m102068x57a175bc() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "handleFlush: ");
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206 = this.f52520xbde45ba9;
        if (c26485xc3ef8206 == null) {
            return 104;
        }
        try {
            c26485xc3ef8206.m103331x5d03b04();
            return 0;
        } catch (java.lang.Exception e17) {
            return m102077xa9f8d7e(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleMessageComplete */
    public void m102069xe15ad318(int i17) {
        this.f52535x3a7bf49a = i17;
        this.f52545x958d2aa2.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleRelease */
    public int m102070x636e94bf() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206 = this.f52520xbde45ba9;
        if (c26485xc3ef8206 == null) {
            return 101;
        }
        this.f52542x2d03f354 = false;
        try {
            try {
                c26485xc3ef8206.mo103290x360802();
                return 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "stop: failed!" + m102093x67074b93(e17));
                this.f52520xbde45ba9.mo103284x41012807();
                this.f52520xbde45ba9 = null;
                return 3;
            }
        } finally {
            this.f52520xbde45ba9.mo103284x41012807();
            this.f52520xbde45ba9 = null;
        }
    }

    /* renamed from: handleReleaseOutputBuffer */
    private int m102071x46fed700(int i17, boolean z17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206 = this.f52520xbde45ba9;
        if (c26485xc3ef8206 == null || i17 < 0) {
            return 3;
        }
        try {
            if (this.f52531xc2690df8 && z17) {
                c26485xc3ef8206.mo103285xab26be48(i17, j17);
                return 0;
            }
            c26485xc3ef8206.mo103286xab26be48(i17, z17);
            return 0;
        } catch (java.lang.Exception e17) {
            return m102077xa9f8d7e(e17);
        }
    }

    /* renamed from: handleSetOutputSurface */
    private int m102072x39bffd72(android.view.Surface surface) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "setOutputSurface: " + surface);
        android.view.Surface surface2 = this.f52543x2fa29f80;
        int i17 = 3;
        if (surface2 == surface) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "setOutputSurface: set the same surface.");
            return 0;
        }
        this.f52543x2fa29f80 = surface;
        if (this.f52520xbde45ba9 == null) {
            return 0;
        }
        if (surface2 != null && surface != null) {
            try {
                if (surface.isValid() && this.f52533x1e899820) {
                    this.f52520xbde45ba9.m103349x610a9b2a(surface);
                    i17 = 0;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "setOutputSurface onMediaCodecException:\n" + m102093x67074b93(e17));
                return 3;
            }
        }
        return i17;
    }

    /* renamed from: handleSignalEndOfStream */
    private int m102073x8ca61522(int i17) {
        try {
            this.f52520xbde45ba9.m103344xfe5642d9(i17, 0, 0, 0L, 4);
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "handleSignalEndOfStream: failed!" + m102093x67074b93(e17));
            return 3;
        }
    }

    /* renamed from: initMediaCodecInternal */
    private boolean m102074x1202749f() {
        java.lang.String str = "video/hevc";
        try {
            java.util.List<java.lang.String> mo102092x1555379a = mo102092x1555379a();
            boolean z17 = false;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            for (int i17 = 0; i17 < mo102092x1555379a.size() && str2 == null; i17++) {
                str3 = mo102092x1555379a.get(i17);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "initMediaCodec with mime:" + str3 + " mDrmType:" + this.f52525x10b8544c);
                android.media.MediaCrypto mediaCrypto = this.f52538x7a8de318;
                boolean requiresSecureDecoderComponent = mediaCrypto != null ? mediaCrypto.requiresSecureDecoderComponent(str3) : false;
                if (requiresSecureDecoderComponent && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101735x44848d20(this.f52525x10b8544c)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "Device " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7() + " DrmType " + this.f52525x10b8544c + " fallback to L3.");
                    z17 = false;
                } else {
                    z17 = requiresSecureDecoderComponent;
                }
                str2 = mo102090xbc67750b(str3, z17);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "initMediaCodec got codecName:" + str2 + " secureComponent " + z17);
            }
            if (str2 == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "initMediaCodec failed, codecName is null.");
                if (this.f52528xf795dff4 && "video/dolby-vision".equalsIgnoreCase(str3)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "initMediaCodec failed, try use mime type:video/hevc");
                    str2 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101712x21f31fb9("video/hevc", z17);
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "retry initMediaCodec codecName:" + str2);
                    if (str2 == null) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "retry initMediaCodec failed codecName is null");
                        return false;
                    }
                    this.f52537x23e64d77 = true;
                }
                return false;
            }
            str = str3;
            if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba.equals(str)) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "initMediaCodec current mime type:" + str + " is audio dts, need set input timeout to 0!");
                f52510xc2cf4a15 = 0L;
                f52511xf5ccf0d6 = 0L;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 m103323xd7cdda8e = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206.m103323xd7cdda8e(str2);
            this.f52520xbde45ba9 = m103323xd7cdda8e;
            m103323xd7cdda8e.m103350xe74a4b55(this.f52530xa1d7c492 && !this.f52526xe54dbfcf);
            this.f52520xbde45ba9.m103348xbd454139(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.C26487xf7f7b5c9() { // from class: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.2
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.C26487xf7f7b5c9, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b
                /* renamed from: onReuseCodecAPIException */
                public void mo102099x55167336(java.lang.String str4, java.lang.Throwable th6) {
                    super.mo102099x55167336(str4, th6);
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102117xa9f8d7e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.f52521xd63c1ea4, str4);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.C26487xf7f7b5c9, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b
                /* renamed from: onStarted */
                public void mo102100xde9141a2(java.lang.Boolean bool, java.lang.String str4) {
                    super.mo102100xde9141a2(bool, str4);
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102118x20d98652(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.this.f52521xd63c1ea4, str4);
                }
            });
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "initMediaCodec codec name: " + str2);
            if (this.f52526xe54dbfcf) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "MediaCodec EnableAsyncMode！");
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("MediaCodecThread");
                this.f52523x2157faa5 = handlerThread;
                handlerThread.start();
                this.f52524x9e5db833 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.AsyncDecodeHandler(this.f52523x2157faa5.getLooper());
                this.f52520xbde45ba9.m103347x6c4ebec7(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.BufferCallback(), this.f52524x9e5db833);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102119x4d357b35(this.f52521xd63c1ea4, 1);
            mo102089xff7e55f4(this.f52520xbde45ba9, str);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102119x4d357b35(this.f52521xd63c1ea4, 2);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102119x4d357b35(this.f52521xd63c1ea4, 3);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "initMediaCodec, start codec start");
            this.f52520xbde45ba9.mo103289x68ac462();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "initMediaCodec, start codec finished");
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102119x4d357b35(this.f52521xd63c1ea4, 4);
            this.f52542x2d03f354 = true;
            if (this.f52525x10b8544c != -1) {
                boolean z18 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101712x21f31fb9(str, true) != null;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26349x23483b05 c26349x23483b05 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26349x23483b05();
                c26349x23483b05.f52614xda357d3e = z18;
                c26349x23483b05.f52615xda372a87 = z17;
                c26349x23483b05.f52612x65b34528 = str2;
                c26349x23483b05.f52613x729fa179 = this.f52525x10b8544c;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "DRM Info: supportSecureDecoder: " + c26349x23483b05.f52614xda357d3e + " supportSecureDecrypt:" + c26349x23483b05.f52615xda372a87 + " componentName: " + c26349x23483b05.f52612x65b34528 + " drmType: " + c26349x23483b05.f52613x729fa179);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102120xe90741e8(this.f52521xd63c1ea4, c26349x23483b05);
            }
            return true;
        } catch (java.lang.Exception e17) {
            mo102094x9fba1707();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26346x87e37d9f.m102119x4d357b35(this.f52521xd63c1ea4, 4);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), m102093x67074b93(e17));
            return false;
        }
    }

    /* renamed from: initTMediaCodec */
    private static synchronized void m102075xfc7752f6() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65.class) {
            if (f52519xcc855342) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103297x316510();
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103316xb7de63a5(true);
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103318xedc5400c(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3() { // from class: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.1
                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
                public void d(java.lang.String str, java.lang.String str2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(1, str, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
                public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, str, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
                public void i(java.lang.String str, java.lang.String str2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, str, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
                public void v(java.lang.String str, java.lang.String str2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(0, str, str2);
                }

                @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
                public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, str, str2);
                }
            });
            f52519xcc855342 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFlush */
    public int m102076xaf961065() {
        this.f52536x2e1417b4.clear();
        this.f52539x782499e3.clear();
        int m102068x57a175bc = m102068x57a175bc();
        this.f52520xbde45ba9.mo103289x68ac462();
        return m102068x57a175bc;
    }

    /* renamed from: onMediaCodecException */
    private int m102077xa9f8d7e(java.lang.Exception exc) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "onMediaCodecException!\n" + m102093x67074b93(exc));
        m102084x2aaf8f2c();
        mo102095x786112ee(exc);
        if (this.f52540xcc146c3c) {
            m102074x1202749f();
            return 4;
        }
        m102070x636e94bf();
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRelease */
    public int m102078x90a72928() {
        this.f52536x2e1417b4.clear();
        this.f52539x782499e3.clear();
        return m102070x636e94bf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onReleaseOutputBuffer */
    public int m102079xf3b715e9(android.os.Bundle bundle) {
        if (bundle == null) {
            return 3;
        }
        return m102071x46fed700(bundle.getInt("index"), bundle.getBoolean(f52516x1287942d), bundle.getLong(f52517x80aef665));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSetOutputSurface */
    public int m102080x130d4f29(android.view.Surface surface) {
        return m102072x39bffd72(surface);
    }

    /* renamed from: queueInputBuffer */
    private int m102081xfe5642d9(byte[] bArr, long j17, boolean z17) {
        android.media.MediaCodec.CryptoInfo cryptoInfo;
        try {
            java.nio.ByteBuffer[] m103336xa9544f7f = this.f52520xbde45ba9.m103336xa9544f7f();
            int m103329x9a572d5a = this.f52520xbde45ba9.m103329x9a572d5a(f52510xc2cf4a15);
            if (m103329x9a572d5a < 0) {
                return m103329x9a572d5a == -1 ? 1 : 103;
            }
            java.nio.ByteBuffer byteBuffer = m103336xa9544f7f[m103329x9a572d5a];
            m102062xd3c54127(byteBuffer, bArr);
            byteBuffer.put(bArr);
            if (!z17 || (cryptoInfo = this.f52522x656b795c) == null) {
                this.f52520xbde45ba9.m103344xfe5642d9(m103329x9a572d5a, 0, bArr.length, j17, 0);
            } else {
                this.f52520xbde45ba9.m103345xa5aeefa2(m103329x9a572d5a, 0, cryptoInfo, j17, 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            return m102077xa9f8d7e(e17);
        }
    }

    /* renamed from: releaseAsync */
    private int m102082x8933d6b5() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "releaseAsync: ");
        android.os.Message obtainMessage = this.f52524x9e5db833.obtainMessage();
        obtainMessage.what = 1003;
        int m102088x9f767ee3 = m102088x9f767ee3(obtainMessage);
        m102066x684b31d6();
        return m102088x9f767ee3;
    }

    /* renamed from: releaseOutputBufferAsync */
    private int m102083x14070114(int i17, boolean z17, long j17) {
        android.os.Message obtainMessage = this.f52524x9e5db833.obtainMessage();
        obtainMessage.what = 1000;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("index", i17);
        bundle.putBoolean(f52516x1287942d, z17);
        bundle.putLong(f52517x80aef665, j17);
        obtainMessage.setData(bundle);
        return m102088x9f767ee3(obtainMessage);
    }

    /* renamed from: resetFrameInfo */
    private void m102084x2aaf8f2c() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f = this.f52534x9b304dce;
        c26344xc9e9249f.f52549xc1af4c72 = -1000;
        c26344xc9e9249f.f52560x660bded = -1L;
        c26344xc9e9249f.f52561xf5f205 = -1L;
        c26344xc9e9249f.f52555x2eefaa = null;
        c26344xc9e9249f.f52556xa7c470f2 = 103;
    }

    /* renamed from: selectCodec */
    private android.media.MediaCodecInfo m102085xb4aa87a(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (!codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: setOutputSurfaceAsync */
    private int m102086x7fd3e172(android.view.Surface surface) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "setOutputSurfaceAsync: " + surface);
        android.os.Message obtainMessage = this.f52524x9e5db833.obtainMessage();
        obtainMessage.what = 1001;
        obtainMessage.obj = surface;
        return m102088x9f767ee3(obtainMessage);
    }

    /* renamed from: signalEndOfStreamAsync */
    private int m102087xbe495632() {
        java.lang.Integer poll = this.f52536x2e1417b4.poll();
        if (poll == null) {
            return 1;
        }
        return m102073x8ca61522(poll.intValue());
    }

    /* renamed from: waitingForHandleMessage */
    private int m102088x9f767ee3(android.os.Message message) {
        synchronized (this.f52545x958d2aa2) {
            message.sendToTarget();
            try {
                this.f52545x958d2aa2.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return this.f52535x3a7bf49a;
    }

    /* renamed from: configCodec */
    public abstract void mo102089xff7e55f4(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, java.lang.String str);

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: decode */
    public int mo102033xb06291ee(byte[] bArr, boolean z17, long j17, boolean z18) {
        if (!this.f52542x2d03f354 || this.f52520xbde45ba9 == null) {
            return 101;
        }
        return this.f52526xe54dbfcf ? m102063x457b852e(bArr, z17, j17, z18) : m102081xfe5642d9(bArr, j17, z18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: dequeueOutputBuffer */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f mo102034x436dd5f1() {
        if (this.f52520xbde45ba9 == null) {
            return this.f52534x9b304dce;
        }
        m102084x2aaf8f2c();
        if (this.f52526xe54dbfcf) {
            return m102064xeff94b0b();
        }
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        try {
            int m103330x436dd5f1 = this.f52520xbde45ba9.m103330x436dd5f1(bufferInfo, f52511xf5ccf0d6);
            if (m103330x436dd5f1 >= 0) {
                int i17 = bufferInfo.flags;
                if (i17 == 4) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM");
                    this.f52534x9b304dce.f52556xa7c470f2 = 2;
                } else if (i17 == 2 && this.f52527xae65942e) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "dequeueOutputBuffer: BUFFER_FLAG_CODEC_CONFIG, AudioPassThrough");
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f = this.f52534x9b304dce;
                    c26344xc9e9249f.f52549xc1af4c72 = m103330x436dd5f1;
                    c26344xc9e9249f.f52560x660bded = bufferInfo.presentationTimeUs;
                    mo102097x1881827c(this.f52520xbde45ba9, m103330x436dd5f1, bufferInfo, c26344xc9e9249f);
                } else {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f2 = this.f52534x9b304dce;
                    c26344xc9e9249f2.f52549xc1af4c72 = m103330x436dd5f1;
                    c26344xc9e9249f2.f52560x660bded = bufferInfo.presentationTimeUs;
                    c26344xc9e9249f2.f52561xf5f205 = java.lang.System.nanoTime();
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f3 = this.f52534x9b304dce;
                    c26344xc9e9249f3.f52556xa7c470f2 = 0;
                    mo102096xacac58b0(this.f52520xbde45ba9, m103330x436dd5f1, bufferInfo, c26344xc9e9249f3);
                }
            } else if (m103330x436dd5f1 == -2) {
                mo102098xea0cc4d(this.f52520xbde45ba9.m103340x42b80ace());
                this.f52534x9b304dce.f52556xa7c470f2 = 1;
            } else if (m103330x436dd5f1 == -1) {
                this.f52534x9b304dce.f52556xa7c470f2 = 1;
            } else if (m103330x436dd5f1 == -3) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "dequeueOutputBuffer: INFO_OUTPUT_BUFFERS_CHANGED!");
                this.f52534x9b304dce.f52556xa7c470f2 = 1;
            } else if (bufferInfo.flags == 4) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM!");
                this.f52534x9b304dce.f52556xa7c470f2 = 2;
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, mo102091x23aed0ac(), "dequeueOutputBuffer: TP_ERROR_DECODE_FAILED! index = " + m103330x436dd5f1);
                this.f52534x9b304dce.f52556xa7c470f2 = 103;
            }
            return this.f52534x9b304dce;
        } catch (java.lang.Exception e17) {
            this.f52534x9b304dce.f52556xa7c470f2 = m102077xa9f8d7e(e17);
            return this.f52534x9b304dce;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: flush */
    public int mo102035x5d03b04() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "flush: ");
        if (this.f52520xbde45ba9 == null) {
            return 104;
        }
        return this.f52526xe54dbfcf ? m102067xd4ba19d8() : m102068x57a175bc();
    }

    /* renamed from: getCodecName */
    public abstract java.lang.String mo102090xbc67750b(java.lang.String str, boolean z17);

    /* renamed from: getLogTag */
    public abstract java.lang.String mo102091x23aed0ac();

    /* renamed from: getMimeCandidates */
    public abstract java.util.List<java.lang.String> mo102092x1555379a();

    /* renamed from: getStackTrace */
    public java.lang.String m102093x67074b93(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: onInitMediaCodecError */
    public void mo102094x9fba1707() {
        mo102038x41012807();
    }

    /* renamed from: processMediaCodecException */
    public abstract void mo102095x786112ee(java.lang.Exception exc);

    /* renamed from: processOutputBuffer */
    public abstract void mo102096xacac58b0(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f);

    /* renamed from: processOutputConfigData */
    public abstract void mo102097x1881827c(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f);

    /* renamed from: processOutputFormatChanged */
    public abstract void mo102098xea0cc4d(android.media.MediaFormat mediaFormat);

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: release */
    public int mo102038x41012807() {
        return this.f52526xe54dbfcf ? m102082x8933d6b5() : m102070x636e94bf();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: releaseOutputBuffer */
    public int mo102039xab26be48(int i17, boolean z17, long j17) {
        if (this.f52520xbde45ba9 == null || i17 < 0) {
            return 3;
        }
        return this.f52526xe54dbfcf ? m102083x14070114(i17, z17, j17) : m102071x46fed700(i17, z17, j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setCryptoInfo */
    public void mo102040xa59e8711(int i17, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i18, int i19, int i27) {
        if (this.f52522x656b795c == null) {
            this.f52522x656b795c = new android.media.MediaCodec.CryptoInfo();
        }
        this.f52522x656b795c.set(i17, iArr, iArr2, bArr, bArr2, i18);
        this.f52522x656b795c.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(i19, i27));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setOperateRate */
    public int mo102041x77b122c2(float f17) {
        if (this.f52520xbde45ba9 != null) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "setOperateRate: " + f17);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putShort(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4, (short) 0);
                bundle.putFloat("operating-rate", f17);
                this.f52520xbde45ba9.mo103288x37bcc7ec(bundle);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "setOperateRate: " + f17 + " failed.");
            }
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setOutputSurface */
    public int mo102042x610a9b2a(android.view.Surface surface) {
        return this.f52526xe54dbfcf ? m102086x7fd3e172(surface) : m102072x39bffd72(surface);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamBool */
    public boolean mo102043xd02fead5(int i17, boolean z17) {
        if (i17 == 0) {
            this.f52533x1e899820 = z17;
        } else if (i17 != 1) {
            if (i17 == 3) {
                this.f52527xae65942e = z17;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "BOOL_SET_IS_AUDIO_PASSTHROUGH mEnableAudioPassThrough:" + this.f52527xae65942e);
            } else if (i17 == 4) {
                this.f52530xa1d7c492 = z17;
            } else if (i17 == 7) {
                this.f52531xc2690df8 = z17;
            } else if (i17 == 99) {
                this.f52529x3c62080d = z17;
            } else {
                if (i17 != 299) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "Unknown paramKey: " + i17);
                    return false;
                }
                this.f52528xf795dff4 = z17;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "BOOL_SET mEnableDefaultCodecForDolby:" + this.f52528xf795dff4);
            }
        } else if (this.f52542x2d03f354) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "BOOL_ENABLE_ASYNC_MODE must setup before started!");
        } else {
            this.f52526xe54dbfcf = z17;
        }
        return true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamBytes */
    public boolean mo102044x35d20de0(int i17, byte[] bArr) {
        return false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamInt */
    public boolean mo102045xbc64bea4(int i17, int i18) {
        if (i17 == 100) {
            this.f52532xefaad160 = i18;
            return true;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "Unknown paramKey: " + i17);
        return false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamLong */
    public boolean mo102046xd0347667(int i17, long j17) {
        return false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamObject */
    public boolean mo102047x9956046a(int i17, java.lang.Object obj) {
        if (i17 != 300) {
            return false;
        }
        this.f52538x7a8de318 = (android.media.MediaCrypto) obj;
        return true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamString */
    public boolean mo102048xa12ac13c(int i17, java.lang.String str) {
        if (i17 == 101) {
            this.f52541xa2ab0730 = str;
            return true;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "Unknown paramKey: " + i17);
        return false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setSharpenSwitch */
    public int mo102049xf1aeb5e5() {
        this.f52544x630ef84c = !this.f52544x630ef84c;
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: signalEndOfStream */
    public int mo102050x4eaf2e6a() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "signalEndOfStream: ");
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206 = this.f52520xbde45ba9;
        if (c26485xc3ef8206 == null) {
            return 3;
        }
        if (this.f52526xe54dbfcf) {
            return m102087xbe495632();
        }
        int m103329x9a572d5a = c26485xc3ef8206.m103329x9a572d5a(f52510xc2cf4a15);
        return m103329x9a572d5a >= 0 ? m102073x8ca61522(m103329x9a572d5a) : m103329x9a572d5a == -1 ? 1 : 3;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: startDecoder */
    public boolean mo102051x53ec2d82() {
        return m102074x1202749f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: switchHdrModeWithSurface */
    public int mo102052x40944be2(android.view.Surface surface, int i17) {
        return 0;
    }
}
