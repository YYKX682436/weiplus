package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.AndroidVideoDecoder */
/* loaded from: classes16.dex */
public class C29722xc6806338 implements org.p3371xd0ce3e8d.InterfaceC29889x5cf59369, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e {

    /* renamed from: DEQUEUE_INPUT_TIMEOUT_US */
    private static final int f75088xee34d60 = 500000;

    /* renamed from: DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US */
    private static final int f75089x8fdf644c = 100000;

    /* renamed from: MEDIA_CODEC_RELEASE_TIMEOUT_MS */
    private static final int f75090x79cbebc0 = 5000;

    /* renamed from: MEDIA_FORMAT_KEY_CROP_BOTTOM */
    private static final java.lang.String f75091xe5c04f4d = "crop-bottom";

    /* renamed from: MEDIA_FORMAT_KEY_CROP_LEFT */
    private static final java.lang.String f75092xaa539a9 = "crop-left";

    /* renamed from: MEDIA_FORMAT_KEY_CROP_RIGHT */
    private static final java.lang.String f75093x4a585c9a = "crop-right";

    /* renamed from: MEDIA_FORMAT_KEY_CROP_TOP */
    private static final java.lang.String f75094xefd3e753 = "crop-top";

    /* renamed from: MEDIA_FORMAT_KEY_SLICE_HEIGHT */
    private static final java.lang.String f75095xf3413261 = "slice-height";

    /* renamed from: MEDIA_FORMAT_KEY_STRIDE */
    private static final java.lang.String f75096xb51b8a66 = "stride";
    private static final java.lang.String TAG = "AndroidVideoDecoder";

    /* renamed from: callback */
    private org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Callback f75097xf5bc2045;

    /* renamed from: codec */
    private org.p3371xd0ce3e8d.InterfaceC29809xcbb53581 f75098x5a71016;

    /* renamed from: codecName */
    private final java.lang.String f75099xbcfa03c1;

    /* renamed from: codecType */
    private final org.p3371xd0ce3e8d.EnumC29887xf25c2329 f75100xbcfd1870;

    /* renamed from: colorFormat */
    private int f75101x2415bd3a;

    /* renamed from: decoderThreadChecker */
    private org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f75102x2626ec67;

    /* renamed from: frameInfos */
    private final java.util.concurrent.BlockingDeque<org.p3371xd0ce3e8d.C29722xc6806338.FrameInfo> f75104xeea77418;

    /* renamed from: hasDecodedFirstFrame */
    private boolean f75105x38fc45f9;

    /* renamed from: height */
    private int f75106xb7389127;

    /* renamed from: keyFrameRequired */
    private boolean f75107xfba4a00d;

    /* renamed from: mediaCodecWrapperFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29810xa7909049 f75108x27c26c29;

    /* renamed from: outputThread */
    private java.lang.Thread f75109xf9468e6b;

    /* renamed from: outputThreadChecker */
    private org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker f75110xd72daca;

    /* renamed from: renderedTextureMetadata */
    private org.p3371xd0ce3e8d.C29722xc6806338.DecodedTextureMetadata f75111xbea3bff5;

    /* renamed from: running */
    private volatile boolean f75113x5c6f15bf;

    /* renamed from: sharedContext */
    private final org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context f75114x2748558a;

    /* renamed from: shutdownException */
    private volatile java.lang.Exception f75115xc82caa99;

    /* renamed from: sliceHeight */
    private int f75116x4d50c559;

    /* renamed from: stride */
    private int f75117xcad55ed9;

    /* renamed from: surface */
    private android.view.Surface f75118x9189ecad;

    /* renamed from: surfaceTextureHelper */
    private org.p3371xd0ce3e8d.C29864x472c891c f75119x3b6754fc;

    /* renamed from: width */
    private int f75120x6be2dc6;

    /* renamed from: dimensionLock */
    private final java.lang.Object f75103xeefe83b1 = new java.lang.Object();

    /* renamed from: renderedTextureMetadataLock */
    private final java.lang.Object f75112x464cf6c0 = new java.lang.Object();

    /* renamed from: org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata */
    /* loaded from: classes16.dex */
    public static class DecodedTextureMetadata {

        /* renamed from: decodeTimeMs */
        final java.lang.Integer f75122x89ceb0e1;

        /* renamed from: presentationTimestampUs */
        final long f75123xd1075ada;

        public DecodedTextureMetadata(long j17, java.lang.Integer num) {
            this.f75123xd1075ada = j17;
            this.f75122x89ceb0e1 = num;
        }
    }

    /* renamed from: org.webrtc.AndroidVideoDecoder$FrameInfo */
    /* loaded from: classes16.dex */
    public static class FrameInfo {

        /* renamed from: decodeStartTimeMs */
        final long f75124x59767187;

        /* renamed from: rotation */
        final int f75125xfd990f7e;

        public FrameInfo(long j17, int i17) {
            this.f75124x59767187 = j17;
            this.f75125xfd990f7e = i17;
        }
    }

    public C29722xc6806338(org.p3371xd0ce3e8d.InterfaceC29810xa7909049 interfaceC29810xa7909049, java.lang.String str, org.p3371xd0ce3e8d.EnumC29887xf25c2329 enumC29887xf25c2329, int i17, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context) {
        if (!m155115x5147ff6(i17)) {
            throw new java.lang.IllegalArgumentException("Unsupported color format: " + i17);
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "ctor name: " + str + " type: " + enumC29887xf25c2329 + " color format: " + i17 + " context: " + context);
        this.f75108x27c26c29 = interfaceC29810xa7909049;
        this.f75099xbcfa03c1 = str;
        this.f75100xbcfd1870 = enumC29887xf25c2329;
        this.f75101x2415bd3a = i17;
        this.f75114x2748558a = context;
        this.f75104xeea77418 = new java.util.concurrent.LinkedBlockingDeque();
    }

    /* renamed from: copyI420Buffer */
    private org.p3371xd0ce3e8d.C29904x150215d2.Buffer m155109xf4a3cf5e(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27) {
        if (i17 % 2 != 0) {
            throw new java.lang.AssertionError("Stride is not divisible by two: " + i17);
        }
        int i28 = (i19 + 1) / 2;
        int i29 = i18 % 2;
        int i37 = i29 == 0 ? (i27 + 1) / 2 : i27 / 2;
        int i38 = i17 / 2;
        int i39 = (i17 * i18) + 0;
        int i47 = i38 * i37;
        int i48 = i39 + ((i38 * i18) / 2);
        int i49 = i48 + i47;
        org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m155121x8ff1526 = m155121x8ff1526(i19, i27);
        byteBuffer.limit((i17 * i27) + 0);
        byteBuffer.position(0);
        m155122x58e79be7(byteBuffer.slice(), i17, m155121x8ff1526.mo155640x744cac39(), m155121x8ff1526.mo155644xcda3b86a(), i19, i27);
        byteBuffer.limit(i39 + i47);
        byteBuffer.position(i39);
        m155122x58e79be7(byteBuffer.slice(), i38, m155121x8ff1526.mo155638x744cac35(), m155121x8ff1526.mo155642xcda3b866(), i28, i37);
        if (i29 == 1) {
            byteBuffer.position(i39 + ((i37 - 1) * i38));
            java.nio.ByteBuffer mo155638x744cac35 = m155121x8ff1526.mo155638x744cac35();
            mo155638x744cac35.position(m155121x8ff1526.mo155642xcda3b866() * i37);
            mo155638x744cac35.put(byteBuffer);
        }
        byteBuffer.limit(i49);
        byteBuffer.position(i48);
        m155122x58e79be7(byteBuffer.slice(), i38, m155121x8ff1526.mo155639x744cac36(), m155121x8ff1526.mo155643xcda3b867(), i28, i37);
        if (i29 == 1) {
            byteBuffer.position(i48 + (i38 * (i37 - 1)));
            java.nio.ByteBuffer mo155639x744cac36 = m155121x8ff1526.mo155639x744cac36();
            mo155639x744cac36.position(m155121x8ff1526.mo155643xcda3b867() * i37);
            mo155639x744cac36.put(byteBuffer);
        }
        return m155121x8ff1526;
    }

    /* renamed from: copyNV12ToI420Buffer */
    private org.p3371xd0ce3e8d.C29904x150215d2.Buffer m155110x247740e2(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27) {
        return new org.p3371xd0ce3e8d.C29818xebaf6b89(i19, i27, i17, i18, byteBuffer, null).mo155646xcc305184();
    }

    /* renamed from: createOutputThread */
    private java.lang.Thread m155111x7001e987() {
        return new java.lang.Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                org.p3371xd0ce3e8d.C29722xc6806338.this.f75110xd72daca = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
                while (org.p3371xd0ce3e8d.C29722xc6806338.this.f75113x5c6f15bf) {
                    org.p3371xd0ce3e8d.C29722xc6806338.this.m155125xdb930c9c();
                }
                org.p3371xd0ce3e8d.C29722xc6806338.this.m155118x16b49419();
            }
        };
    }

    /* renamed from: deliverByteFrame */
    private void m155112xbc7a4da0(int i17, android.media.MediaCodec.BufferInfo bufferInfo, int i18, java.lang.Integer num) {
        int i19;
        int i27;
        int i28;
        int i29;
        synchronized (this.f75103xeefe83b1) {
            i19 = this.f75120x6be2dc6;
            i27 = this.f75106xb7389127;
            i28 = this.f75117xcad55ed9;
            i29 = this.f75116x4d50c559;
        }
        int i37 = bufferInfo.size;
        if (i37 < ((i19 * i27) * 3) / 2) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        int i38 = (i37 >= ((i28 * i27) * 3) / 2 || i29 != i27 || i28 <= i19) ? i28 : (i37 * 2) / (i27 * 3);
        java.nio.ByteBuffer byteBuffer = this.f75098x5a71016.mo155709x4a413c3c()[i17];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        java.nio.ByteBuffer slice = byteBuffer.slice();
        org.p3371xd0ce3e8d.C29904x150215d2.Buffer m155109xf4a3cf5e = this.f75101x2415bd3a == 19 ? m155109xf4a3cf5e(slice, i38, i29, i19, i27) : m155110x247740e2(slice, i38, i29, i19, i27);
        this.f75098x5a71016.mo155713xab26be48(i17, false);
        org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2 = new org.p3371xd0ce3e8d.C29904x150215d2(m155109xf4a3cf5e, i18, bufferInfo.presentationTimeUs * 1000);
        this.f75097xf5bc2045.mo156509x1873ca56(c29904x150215d2, num, null);
        c29904x150215d2.mo155513x41012807();
    }

    /* renamed from: deliverTextureFrame */
    private void m155113xdd63aad7(int i17, android.media.MediaCodec.BufferInfo bufferInfo, int i18, java.lang.Integer num) {
        int i19;
        int i27;
        synchronized (this.f75103xeefe83b1) {
            i19 = this.f75120x6be2dc6;
            i27 = this.f75106xb7389127;
        }
        synchronized (this.f75112x464cf6c0) {
            if (this.f75111xbea3bff5 != null) {
                this.f75098x5a71016.mo155713xab26be48(i17, false);
                return;
            }
            this.f75119x3b6754fc.m156410xd06addfa(i19, i27);
            this.f75119x3b6754fc.m156409xb3e682c9(i18);
            this.f75111xbea3bff5 = new org.p3371xd0ce3e8d.C29722xc6806338.DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
            this.f75098x5a71016.mo155713xab26be48(i17, true);
        }
    }

    /* renamed from: initDecodeInternal */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155114x381503fb(int i17, int i18) {
        this.f75102x2626ec67.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initDecodeInternal name: " + this.f75099xbcfa03c1 + " type: " + this.f75100xbcfd1870 + " width: " + i17 + " height: " + i18);
        if (this.f75109xf9468e6b != null) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "initDecodeInternal called while the codec is already running");
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.FALLBACK_SOFTWARE;
        }
        this.f75120x6be2dc6 = i17;
        this.f75106xb7389127 = i18;
        this.f75117xcad55ed9 = i17;
        this.f75116x4d50c559 = i18;
        this.f75105x38fc45f9 = false;
        this.f75107xfba4a00d = true;
        try {
            this.f75098x5a71016 = this.f75108x27c26c29.mo155717xd7cdda8e(this.f75099xbcfa03c1);
            try {
                android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(this.f75100xbcfd1870.m156503xad05ed8e(), i17, i18);
                if (this.f75114x2748558a == null) {
                    createVideoFormat.setInteger("color-format", this.f75101x2415bd3a);
                }
                this.f75098x5a71016.mo155703xd00d62e6(createVideoFormat, this.f75118x9189ecad, null, 0);
                this.f75098x5a71016.mo155715x68ac462();
                this.f75113x5c6f15bf = true;
                java.lang.Thread m155111x7001e987 = m155111x7001e987();
                this.f75109xf9468e6b = m155111x7001e987;
                m155111x7001e987.start();
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "initDecodeInternal done");
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
            } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "initDecode failed", e17);
                mo155129x41012807();
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.FALLBACK_SOFTWARE;
            }
        } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Cannot create media decoder " + this.f75099xbcfa03c1);
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.FALLBACK_SOFTWARE;
        }
    }

    /* renamed from: isSupportedColorFormat */
    private boolean m155115x5147ff6(int i17) {
        for (int i18 : org.p3371xd0ce3e8d.C29807x3ab6251f.f75537x86737965) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: reformat */
    private void m155116xd57b53ea(android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.f75110xd72daca.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Decoder format changed: " + mediaFormat.toString());
        if (mediaFormat.containsKey(f75092xaa539a9) && mediaFormat.containsKey(f75093x4a585c9a) && mediaFormat.containsKey(f75091xe5c04f4d) && mediaFormat.containsKey(f75094xefd3e753)) {
            integer = (mediaFormat.getInteger(f75093x4a585c9a) + 1) - mediaFormat.getInteger(f75092xaa539a9);
            integer2 = (mediaFormat.getInteger(f75091xe5c04f4d) + 1) - mediaFormat.getInteger(f75094xefd3e753);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.f75103xeefe83b1) {
            if (integer != this.f75120x6be2dc6 || integer2 != this.f75106xb7389127) {
                if (this.f75105x38fc45f9) {
                    m155120x2b8ec28c(new java.lang.RuntimeException("Unexpected size change. Configured " + this.f75120x6be2dc6 + "*" + this.f75106xb7389127 + ". New " + integer + "*" + integer2));
                    return;
                }
                if (integer > 0 && integer2 > 0) {
                    this.f75120x6be2dc6 = integer;
                    this.f75106xb7389127 = integer2;
                }
                org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Unexpected format dimensions. Configured " + this.f75120x6be2dc6 + "*" + this.f75106xb7389127 + ". New " + integer + "*" + integer2 + ". Skip it");
                return;
            }
            if (this.f75119x3b6754fc == null && mediaFormat.containsKey("color-format")) {
                this.f75101x2415bd3a = mediaFormat.getInteger("color-format");
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Color: 0x" + java.lang.Integer.toHexString(this.f75101x2415bd3a));
                if (!m155115x5147ff6(this.f75101x2415bd3a)) {
                    m155120x2b8ec28c(new java.lang.IllegalStateException("Unsupported color format: " + this.f75101x2415bd3a));
                    return;
                }
            }
            synchronized (this.f75103xeefe83b1) {
                if (mediaFormat.containsKey(f75096xb51b8a66)) {
                    this.f75117xcad55ed9 = mediaFormat.getInteger(f75096xb51b8a66);
                }
                if (mediaFormat.containsKey(f75095xf3413261)) {
                    this.f75116x4d50c559 = mediaFormat.getInteger(f75095xf3413261);
                }
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Frame stride and slice height: " + this.f75117xcad55ed9 + " x " + this.f75116x4d50c559);
                this.f75117xcad55ed9 = java.lang.Math.max(this.f75120x6be2dc6, this.f75117xcad55ed9);
                this.f75116x4d50c559 = java.lang.Math.max(this.f75106xb7389127, this.f75116x4d50c559);
            }
        }
    }

    /* renamed from: reinitDecode */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155117x20530191(int i17, int i18) {
        this.f75102x2626ec67.m156480x23129e95();
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155119x95125be4 = m155119x95125be4();
        return m155119x95125be4 != org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK ? m155119x95125be4 : m155114x381503fb(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: releaseCodecOnOutputThread */
    public void m155118x16b49419() {
        this.f75110xd72daca.m156480x23129e95();
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.f75098x5a71016.mo155716x360802();
        } catch (java.lang.Exception e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media decoder stop failed", e17);
        }
        try {
            this.f75098x5a71016.mo155712x41012807();
        } catch (java.lang.Exception e18) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media decoder release failed", e18);
            this.f75115xc82caa99 = e18;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: releaseInternal */
    private org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155119x95125be4() {
        if (!this.f75113x5c6f15bf) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "release: Decoder is not running.");
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
        }
        try {
            this.f75113x5c6f15bf = false;
            if (!org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156479x7fa650c6(this.f75109xf9468e6b, 5000L)) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media decoder release timeout", new java.lang.RuntimeException());
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.TIMEOUT;
            }
            if (this.f75115xc82caa99 != null) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Media decoder release error", new java.lang.RuntimeException(this.f75115xc82caa99));
                this.f75115xc82caa99 = null;
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
            }
            this.f75098x5a71016 = null;
            this.f75109xf9468e6b = null;
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
        } finally {
            this.f75098x5a71016 = null;
            this.f75109xf9468e6b = null;
        }
    }

    /* renamed from: stopOnOutputThread */
    private void m155120x2b8ec28c(java.lang.Exception exc) {
        this.f75110xd72daca.m156480x23129e95();
        this.f75113x5c6f15bf = false;
        this.f75115xc82caa99 = exc;
    }

    /* renamed from: allocateI420Buffer */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer m155121x8ff1526(int i17, int i18) {
        return org.p3371xd0ce3e8d.C29794x1389e1eb.m155631x6c090f3d(i17, i18);
    }

    /* renamed from: copyPlane */
    public void m155122x58e79be7(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27) {
        org.p3371xd0ce3e8d.C29919xe8726508.m156608x58e79be7(byteBuffer, i17, byteBuffer2, i18, i19, i27);
    }

    /* renamed from: createSurfaceTextureHelper */
    public org.p3371xd0ce3e8d.C29864x472c891c m155123x5213d418() {
        return org.p3371xd0ce3e8d.C29864x472c891c.m156388xaf65a0fc("decoder-texture-thread", this.f75114x2748558a);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29889x5cf59369
    /* renamed from: decode */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155124xb06291ee(org.p3371xd0ce3e8d.C29774xf0e0810d c29774xf0e0810d, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.DecodeInfo decodeInfo) {
        int i17;
        int i18;
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155117x20530191;
        this.f75102x2626ec67.m156480x23129e95();
        if (this.f75098x5a71016 == null || this.f75097xf5bc2045 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decode uninitalized, codec: ");
            sb6.append(this.f75098x5a71016 != null);
            sb6.append(", callback: ");
            sb6.append(this.f75097xf5bc2045);
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, sb6.toString());
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.UNINITIALIZED;
        }
        java.nio.ByteBuffer byteBuffer = c29774xf0e0810d.f75368xaddb9440;
        if (byteBuffer == null) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "decode() - no input data");
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "decode() - input buffer empty");
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERR_PARAMETER;
        }
        synchronized (this.f75103xeefe83b1) {
            i17 = this.f75120x6be2dc6;
            i18 = this.f75106xb7389127;
        }
        int i19 = c29774xf0e0810d.f75372xe7d8b158;
        int i27 = c29774xf0e0810d.f75371xf96e7fd5;
        if (i19 * i27 > 0 && ((i19 != i17 || i27 != i18) && (m155117x20530191 = m155117x20530191(i19, i27)) != org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK)) {
            return m155117x20530191;
        }
        if (this.f75107xfba4a00d && c29774xf0e0810d.f75373x207e2e47 != org.p3371xd0ce3e8d.C29774xf0e0810d.FrameType.VideoFrameKey) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "decode() - key frame required first");
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.NO_OUTPUT;
        }
        try {
            int mo155705x9a572d5a = this.f75098x5a71016.mo155705x9a572d5a(500000L);
            if (mo155705x9a572d5a < 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
            }
            try {
                java.nio.ByteBuffer byteBuffer2 = this.f75098x5a71016.mo155708xa9544f7f()[mo155705x9a572d5a];
                if (byteBuffer2.capacity() < remaining) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "decode() - HW buffer too small");
                    return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
                }
                byteBuffer2.put(c29774xf0e0810d.f75368xaddb9440);
                this.f75104xeea77418.offer(new org.p3371xd0ce3e8d.C29722xc6806338.FrameInfo(android.os.SystemClock.elapsedRealtime(), c29774xf0e0810d.f75375xfd990f7e));
                try {
                    this.f75098x5a71016.mo155711xfe5642d9(mo155705x9a572d5a, 0, remaining, java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(c29774xf0e0810d.f75370x76048458), 0);
                    if (this.f75107xfba4a00d) {
                        this.f75107xfba4a00d = false;
                    }
                    return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.OK;
                } catch (java.lang.IllegalStateException e17) {
                    org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "queueInputBuffer failed", e17);
                    this.f75104xeea77418.pollLast();
                    return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
                }
            } catch (java.lang.IllegalStateException e18) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "getInputBuffers failed", e18);
                return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
            }
        } catch (java.lang.IllegalStateException e19) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "dequeueInputBuffer failed", e19);
            return org.p3371xd0ce3e8d.EnumC29888x1fdab04d.ERROR;
        }
    }

    /* renamed from: deliverDecodedFrame */
    public void m155125xdb930c9c() {
        java.lang.Integer num;
        int i17;
        this.f75110xd72daca.m156480x23129e95();
        try {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int mo155706x436dd5f1 = this.f75098x5a71016.mo155706x436dd5f1(bufferInfo, 100000L);
            if (mo155706x436dd5f1 == -2) {
                m155116xd57b53ea(this.f75098x5a71016.mo155710x42b80ace());
                return;
            }
            if (mo155706x436dd5f1 < 0) {
                org.p3371xd0ce3e8d.C29806x779f633f.v(TAG, "dequeueOutputBuffer returned " + mo155706x436dd5f1);
                return;
            }
            org.p3371xd0ce3e8d.C29722xc6806338.FrameInfo poll = this.f75104xeea77418.poll();
            if (poll != null) {
                num = java.lang.Integer.valueOf((int) (android.os.SystemClock.elapsedRealtime() - poll.f75124x59767187));
                i17 = poll.f75125xfd990f7e;
            } else {
                num = null;
                i17 = 0;
            }
            this.f75105x38fc45f9 = true;
            if (this.f75119x3b6754fc != null) {
                m155113xdd63aad7(mo155706x436dd5f1, bufferInfo, i17, num);
            } else {
                m155112xbc7a4da0(mo155706x436dd5f1, bufferInfo, i17, num);
            }
        } catch (java.lang.IllegalStateException e17) {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "deliverDecodedFrame failed", e17);
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29889x5cf59369
    /* renamed from: getImplementationName */
    public java.lang.String mo155126xb8d5d353() {
        return this.f75099xbcfa03c1;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29889x5cf59369
    /* renamed from: initDecode */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155127xf4fcd71e(org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Settings settings, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369.Callback callback) {
        this.f75102x2626ec67 = new org.p3371xd0ce3e8d.C29882xd5f5f0a7.ThreadChecker();
        this.f75097xf5bc2045 = callback;
        if (this.f75114x2748558a != null) {
            this.f75119x3b6754fc = m155123x5213d418();
            this.f75118x9189ecad = new android.view.Surface(this.f75119x3b6754fc.m156407x182e20a4());
            this.f75119x3b6754fc.m156411xa23d0a79(this);
        }
        return m155114x381503fb(settings.f76070x6be2dc6, settings.f76068xb7389127);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        long j17;
        java.lang.Integer num;
        synchronized (this.f75112x464cf6c0) {
            org.p3371xd0ce3e8d.C29722xc6806338.DecodedTextureMetadata decodedTextureMetadata = this.f75111xbea3bff5;
            if (decodedTextureMetadata == null) {
                throw new java.lang.IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j17 = decodedTextureMetadata.f75123xd1075ada * 1000;
            num = decodedTextureMetadata.f75122x89ceb0e1;
            this.f75111xbea3bff5 = null;
        }
        this.f75097xf5bc2045.mo156509x1873ca56(new org.p3371xd0ce3e8d.C29904x150215d2(c29904x150215d2.m156544x12f2b736(), c29904x150215d2.m156547x79734cf4(), j17), num, null);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29889x5cf59369
    /* renamed from: release */
    public org.p3371xd0ce3e8d.EnumC29888x1fdab04d mo155129x41012807() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "release");
        org.p3371xd0ce3e8d.EnumC29888x1fdab04d m155119x95125be4 = m155119x95125be4();
        if (this.f75118x9189ecad != null) {
            m155130xc6cc96a6();
            this.f75118x9189ecad = null;
            this.f75119x3b6754fc.m156412x3f73dad9();
            this.f75119x3b6754fc.m156404x63a5261f();
            this.f75119x3b6754fc = null;
        }
        synchronized (this.f75112x464cf6c0) {
            this.f75111xbea3bff5 = null;
        }
        this.f75097xf5bc2045 = null;
        this.f75104xeea77418.clear();
        return m155119x95125be4;
    }

    /* renamed from: releaseSurface */
    public void m155130xc6cc96a6() {
        this.f75118x9189ecad.release();
    }
}
