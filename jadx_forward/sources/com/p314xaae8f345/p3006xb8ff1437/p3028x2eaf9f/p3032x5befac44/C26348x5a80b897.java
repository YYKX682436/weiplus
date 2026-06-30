package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44;

/* renamed from: com.tencent.thumbplayer.core.decoder.TPMediaCodecVideoDecoder */
/* loaded from: classes14.dex */
public class C26348x5a80b897 extends com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65 {

    /* renamed from: CODEC_HISI_NAME */
    private static final java.lang.String f52578x3fb441aa = "hisi";

    /* renamed from: DEVICE_NAME_VIVO_X5L */
    private static final java.lang.String f52579xea8e0007 = "vivo X5L";

    /* renamed from: KEY_CROP_BOTTOM */
    private static final java.lang.String f52580x7ff6f0ba = "crop-bottom";

    /* renamed from: KEY_CROP_LEFT */
    private static final java.lang.String f52581x52ff5256 = "crop-left";

    /* renamed from: KEY_CROP_RIGHT */
    private static final java.lang.String f52582xd41598d = "crop-right";

    /* renamed from: KEY_CROP_TOP */
    private static final java.lang.String f52583x2ad8506 = "crop-top";

    /* renamed from: PIXEL_STRIDE_CONTINUOUS */
    private static final int f52584x8d13e69c = 1;

    /* renamed from: PLAY_MODE_HLG_HDR_2_HDR */
    public static final int f52585x56213273 = 5;

    /* renamed from: PLAY_MODE_HLG_HDR_2_SDR */
    public static final int f52586x56215bbe = 3;

    /* renamed from: PLAY_MODE_PQ_HDR_2_HDR */
    public static final int f52587x376c56b3 = 4;

    /* renamed from: PLAY_MODE_PQ_HDR_2_SDR */
    public static final int f52588x376c7ffe = 2;

    /* renamed from: PLAY_MODE_SDR_2_SDR */
    public static final int f52589x7ed3a5c5 = 1;

    /* renamed from: PLAY_MODE_UNKNOWN */
    public static final int f52590xc92a78b9 = 0;
    private static final java.lang.String TAG = "TPMediaCodecVideoDecode";

    /* renamed from: YUV420P_PLANAR_COUNT */
    private static final int f52591x2ae1d91 = 3;

    /* renamed from: hasRenderFirstFrame */
    private boolean f52592xf45b118d;

    /* renamed from: mCropBottom */
    private int f52593x1610d28;

    /* renamed from: mCropLeft */
    private int f52594xa350ae44;

    /* renamed from: mCropRight */
    private int f52595xc71b7b7f;

    /* renamed from: mCropTop */
    private int f52596xdbfa7778;

    /* renamed from: mCsd0Data */
    private byte[] f52597xc1e80a13;

    /* renamed from: mCsd1Data */
    private byte[] f52598xc1f62194;

    /* renamed from: mCsd2Data */
    private byte[] f52599xc2043915;

    /* renamed from: mDisableDolbyVisionComponent */
    private boolean f52600x6e36bbd8;

    /* renamed from: mDisplaySurface */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26423xb69d39ab f52601xf9097758;

    /* renamed from: mDolbyVisionLevel */
    private int f52602x90da6691;

    /* renamed from: mDolbyVisionProfile */
    private int f52603xad40c576;

    /* renamed from: mEnableMediaCodecOutputData */
    private boolean f52604xde2d98ed;

    /* renamed from: mMimeCandidates */
    private java.util.ArrayList<java.lang.String> f52605x2d707471;

    /* renamed from: mProcessSurface */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e f52606x932d250b;

    /* renamed from: mRotation */
    private int f52607x2296b70b;

    /* renamed from: mVideoHeight */
    private int f52608xd49a1ad5;

    /* renamed from: mVideoWidth */
    private int f52609x7b4db658;

    /* renamed from: playMode */
    private int f52610x6ff87ef7;

    /* renamed from: type */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType f52611x368f3a;

    public C26348x5a80b897(int i17) {
        super(i17);
        this.f52604xde2d98ed = false;
        this.f52605x2d707471 = new java.util.ArrayList<>();
        this.f52609x7b4db658 = 0;
        this.f52608xd49a1ad5 = 0;
        this.f52594xa350ae44 = 0;
        this.f52595xc71b7b7f = 0;
        this.f52596xdbfa7778 = 0;
        this.f52593x1610d28 = 0;
        this.f52607x2296b70b = 0;
        this.f52603xad40c576 = 0;
        this.f52602x90da6691 = 0;
        this.f52597xc1e80a13 = null;
        this.f52598xc1f62194 = null;
        this.f52599xc2043915 = null;
        this.f52611x368f3a = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_UNKNOWN;
        this.f52600x6e36bbd8 = false;
        this.f52606x932d250b = null;
        this.f52601xf9097758 = null;
        this.f52610x6ff87ef7 = 0;
        this.f52592xf45b118d = false;
    }

    /* renamed from: copyVideoDataFromImage */
    private void m102138x6e5ddee1(android.media.Image image, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        if (image.getFormat() != 35) {
            c26344xc9e9249f.f52557xb45ff7f7 = -1;
            c26344xc9e9249f.f52556xa7c470f2 = 3;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "copyVideoDataFromImage: image format not support!");
            return;
        }
        c26344xc9e9249f.f52557xb45ff7f7 = 0;
        int width = image.getWidth();
        int height = image.getHeight();
        android.media.Image.Plane[] planes = image.getPlanes();
        int[] iArr = c26344xc9e9249f.f52559x46d8ea15;
        if (iArr == null || iArr.length < 3) {
            c26344xc9e9249f.f52559x46d8ea15 = new int[3];
        }
        byte[][] bArr = c26344xc9e9249f.f52563x4f6bc2c5;
        if (bArr == null || bArr.length < 3) {
            c26344xc9e9249f.f52563x4f6bc2c5 = new byte[3];
        }
        int i17 = 0;
        while (i17 < 3) {
            int i18 = i17 == 0 ? 0 : 1;
            m102139x6ec00fe2(planes[i17], width >> i18, height >> i18, i17, c26344xc9e9249f);
            i17++;
        }
    }

    /* renamed from: copyVideoDataFromPlane */
    private void m102139x6ec00fe2(android.media.Image.Plane plane, int i17, int i18, int i19, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        java.nio.ByteBuffer buffer = plane.getBuffer();
        c26344xc9e9249f.f52559x46d8ea15[i19] = i17;
        int i27 = i17 * i18;
        byte[][] bArr = c26344xc9e9249f.f52563x4f6bc2c5;
        byte[] bArr2 = bArr[i19];
        if (bArr2 == null || bArr2.length < i27) {
            bArr[i19] = new byte[i27];
        }
        if (plane.getPixelStride() == 1) {
            buffer.get(c26344xc9e9249f.f52563x4f6bc2c5[i19], 0, i27);
            return;
        }
        for (int i28 = 0; i28 < i27; i28++) {
            c26344xc9e9249f.f52563x4f6bc2c5[i19][i28] = buffer.get(plane.getPixelStride() * i28);
        }
    }

    /* renamed from: enableSurfaceRender */
    private boolean m102140xd07b7be0() {
        return this.f52529x3c62080d || this.f52532xefaad160 > 0;
    }

    /* renamed from: getExtBool */
    private boolean m102141xefea7c75() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType tPProcessType = this.f52611x368f3a;
        if (tPProcessType == com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_SHARPEN) {
            return this.f52544x630ef84c;
        }
        if (tPProcessType != com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_HDR2SDR) {
            return false;
        }
        int i17 = this.f52610x6ff87ef7;
        return i17 == 2 || i17 == 3;
    }

    /* renamed from: getExtInt */
    private int m102142x18417904() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType tPProcessType = this.f52611x368f3a;
        if (tPProcessType == com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_SHARPEN) {
            return this.f52532xefaad160;
        }
        if (tPProcessType == com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_HDR2SDR) {
            return this.f52610x6ff87ef7;
        }
        return 0;
    }

    /* renamed from: processOutputData */
    private void m102143xa846101a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            c26344xc9e9249f.f52557xb45ff7f7 = -1;
            c26344xc9e9249f.f52556xa7c470f2 = 2;
            c26485xc3ef8206.mo103286xab26be48(i17, false);
            return;
        }
        android.media.Image m103341xa7795fa4 = c26485xc3ef8206.m103341xa7795fa4(i17);
        if (m103341xa7795fa4 != null) {
            m102138x6e5ddee1(m103341xa7795fa4, c26344xc9e9249f);
            c26485xc3ef8206.mo103286xab26be48(i17, false);
        } else {
            c26344xc9e9249f.f52557xb45ff7f7 = -1;
            c26344xc9e9249f.f52556xa7c470f2 = 3;
            c26485xc3ef8206.mo103286xab26be48(i17, false);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "processOutputBuffer: getOutputImage return null");
        }
    }

    /* renamed from: releaseOpenGlResource */
    private void m102144xf5bd89e4() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "releaseOpenGlResource");
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26423xb69d39ab c26423xb69d39ab = this.f52601xf9097758;
            if (c26423xb69d39ab != null) {
                c26423xb69d39ab.m102751x900967ab();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e c26424x50c0e75e = this.f52606x932d250b;
                if (c26424x50c0e75e != null) {
                    c26424x50c0e75e.m102760x41012807();
                }
                this.f52601xf9097758.m102753x41012807();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "custom render release failed!" + e17.getMessage());
        }
        this.f52606x932d250b = null;
        this.f52601xf9097758 = null;
    }

    /* renamed from: renderImpl */
    private void m102145x47275cd6() {
        this.f52592xf45b118d = true;
        this.f52601xf9097758.m102751x900967ab();
        this.f52601xf9097758.m102752xe7937ac5();
        this.f52606x932d250b.m102758x7863677(this.f52609x7b4db658, this.f52608xd49a1ad5, this.f52601xf9097758.m102750x5aadb02f(), this.f52601xf9097758.m102749xe1395bde(), m102141xefea7c75(), m102142x18417904());
        this.f52601xf9097758.m102754x82211f20();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: configCodec */
    public void mo102089xff7e55f4(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, java.lang.String str) {
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(str, this.f52609x7b4db658, this.f52608xd49a1ad5);
        createVideoFormat.setInteger("rotation-degrees", this.f52607x2296b70b);
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7().equalsIgnoreCase(f52579xea8e0007)) {
            createVideoFormat.setInteger("max-input-size", this.f52609x7b4db658 * this.f52608xd49a1ad5);
        }
        byte[] bArr = this.f52597xc1e80a13;
        if (bArr != null) {
            createVideoFormat.setByteBuffer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54292x3d6ec85, java.nio.ByteBuffer.wrap(bArr));
        }
        byte[] bArr2 = this.f52598xc1f62194;
        if (bArr2 != null) {
            createVideoFormat.setByteBuffer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54293x3d6ec86, java.nio.ByteBuffer.wrap(bArr2));
        }
        byte[] bArr3 = this.f52599xc2043915;
        if (bArr3 != null) {
            createVideoFormat.setByteBuffer(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54294x3d6ec87, java.nio.ByteBuffer.wrap(bArr3));
        }
        if ("video/dolby-vision".equals(str)) {
            createVideoFormat.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101704x6afa3717(this.f52603xad40c576));
            createVideoFormat.setInteger(ya.b.f77487x44fa364, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101703x1fd5cc72(this.f52602x90da6691));
        }
        if (this.f52604xde2d98ed) {
            createVideoFormat.setInteger("color-format", 2135033992);
            c26485xc3ef8206.mo103283xd00d62e6(createVideoFormat, (android.view.Surface) null, this.f52538x7a8de318, 0);
        } else {
            c26485xc3ef8206.mo103283xd00d62e6(createVideoFormat, this.f52543x2fa29f80, this.f52538x7a8de318, 0);
        }
        c26485xc3ef8206.m103351xfdd812d1(1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: getCodecName */
    public java.lang.String mo102090xbc67750b(java.lang.String str, boolean z17) {
        java.lang.String m101712x21f31fb9;
        int i17 = this.f52603xad40c576;
        if (i17 <= 0 || this.f52600x6e36bbd8) {
            m101712x21f31fb9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101712x21f31fb9(str, z17);
        } else {
            m101712x21f31fb9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101715xcce9f065(str, i17, this.f52602x90da6691, z17);
            if (m101712x21f31fb9 == null) {
                m101712x21f31fb9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101712x21f31fb9(str, z17);
            }
        }
        int m101942x42e863db = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101942x42e863db(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101943x709d7b26());
        if (m101712x21f31fb9 == null || !m101712x21f31fb9.contains(f52578x3fb441aa) || m101942x42e863db == 2 || (m101712x21f31fb9 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101713xa5d8a1f3(str, z17)) != null) {
            return m101712x21f31fb9;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, mo102091x23aed0ac(), "hisi fall back initMediaCodec failed codecName is null");
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: getLogTag */
    public java.lang.String mo102091x23aed0ac() {
        return TAG;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: initDecoder */
    public boolean mo102036xaa9e0d14(java.lang.String str, int i17, int i18, int i19, int i27) {
        return false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: onInitMediaCodecError */
    public void mo102094x9fba1707() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "onInitMediaCodecError!");
        m102144xf5bd89e4();
        super.mo102094x9fba1707();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processMediaCodecException */
    public void mo102095x786112ee(java.lang.Exception exc) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processOutputBuffer */
    public void mo102096xacac58b0(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        c26344xc9e9249f.f52564x6be2dc6 = this.f52609x7b4db658;
        c26344xc9e9249f.f52558xb7389127 = this.f52608xd49a1ad5;
        c26344xc9e9249f.f52552x7e5306b7 = this.f52594xa350ae44;
        c26344xc9e9249f.f52553x4c64316c = this.f52595xc71b7b7f;
        c26344xc9e9249f.f52554x3de1c4a5 = this.f52596xdbfa7778;
        c26344xc9e9249f.f52551x252f14db = this.f52593x1610d28;
        c26344xc9e9249f.f52557xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727;
        if (this.f52604xde2d98ed) {
            m102143xa846101a(c26485xc3ef8206, i17, bufferInfo, c26344xc9e9249f);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processOutputConfigData */
    public void mo102097x1881827c(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26485xc3ef8206 c26485xc3ef8206, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f c26344xc9e9249f) {
        c26344xc9e9249f.f52556xa7c470f2 = 0;
        mo102096xacac58b0(c26485xc3ef8206, i17, bufferInfo, c26344xc9e9249f);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: processOutputFormatChanged */
    public void mo102098xea0cc4d(android.media.MediaFormat mediaFormat) {
        boolean z17 = mediaFormat.containsKey(f52582xd41598d) && mediaFormat.containsKey(f52581x52ff5256) && mediaFormat.containsKey(f52580x7ff6f0ba) && mediaFormat.containsKey(f52583x2ad8506);
        this.f52609x7b4db658 = mediaFormat.getInteger("width");
        this.f52608xd49a1ad5 = mediaFormat.getInteger("height");
        if (z17) {
            this.f52594xa350ae44 = mediaFormat.getInteger(f52581x52ff5256);
            this.f52595xc71b7b7f = mediaFormat.getInteger(f52582xd41598d);
            this.f52596xdbfa7778 = mediaFormat.getInteger(f52583x2ad8506);
            this.f52593x1610d28 = mediaFormat.getInteger(f52580x7ff6f0ba);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "processOutputFormatChanged: mVideoWidth: " + this.f52609x7b4db658 + ", mVideoHeight: " + this.f52608xd49a1ad5 + ", mCropLeft: " + this.f52594xa350ae44 + ", mCropRight: " + this.f52595xc71b7b7f + ", mCropTop: " + this.f52596xdbfa7778 + ", mCropBottom: " + this.f52593x1610d28);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: release */
    public int mo102038x41012807() {
        int mo102038x41012807 = super.mo102038x41012807();
        m102144xf5bd89e4();
        return mo102038x41012807;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: releaseOutputBuffer */
    public int mo102039xab26be48(int i17, boolean z17, long j17) {
        int mo102039xab26be48 = super.mo102039xab26be48(i17, z17, j17);
        if (mo102039xab26be48 == 0 && z17 && m102140xd07b7be0() && this.f52543x2fa29f80 == this.f52606x932d250b.m102759xcf572877()) {
            try {
                if (this.f52606x932d250b.m102757x13bc3b11() && this.f52601xf9097758.m102748xcf572877().isValid()) {
                    m102145x47275cd6();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "sifeng sharpen render pass failed!" + e17.getMessage());
            }
        }
        return mo102039xab26be48;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setOperateRate */
    public int mo102041x77b122c2(float f17) {
        return super.mo102041x77b122c2(f17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setOutputSurface */
    public int mo102042x610a9b2a(android.view.Surface surface) {
        if (this.f52604xde2d98ed) {
            return 3;
        }
        return super.mo102042x610a9b2a(surface);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamBool */
    public boolean mo102043xd02fead5(int i17, boolean z17) {
        if (5 == i17) {
            if (this.f52542x2d03f354) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA failed. need set before start, mStart=" + this.f52542x2d03f354 + ", api level is " + android.os.Build.VERSION.SDK_INT + ", support api level = 21");
            } else {
                this.f52604xde2d98ed = z17;
            }
        } else if (6 == i17) {
            if (this.f52542x2d03f354) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, mo102091x23aed0ac(), "BOOL_FORCE_DOLBY_VISION_USE_HEVC_CODEC failed. need set before start, mStart=" + this.f52542x2d03f354);
            } else {
                this.f52600x6e36bbd8 = z17;
            }
        }
        return super.mo102043xd02fead5(i17, z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamBytes */
    public boolean mo102044x35d20de0(int i17, byte[] bArr) {
        if (i17 == 200) {
            this.f52597xc1e80a13 = bArr;
        } else if (i17 == 201) {
            this.f52598xc1f62194 = bArr;
        } else if (i17 == 202) {
            this.f52599xc2043915 = bArr;
        }
        return super.mo102044x35d20de0(i17, bArr);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: setParamObject */
    public boolean mo102047x9956046a(int i17, java.lang.Object obj) {
        return super.mo102047x9956046a(i17, obj);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: switchHdrModeWithSurface */
    public int mo102052x40944be2(android.view.Surface surface, int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "switchHdrModeWithSurface");
        if (!m102140xd07b7be0()) {
            return 0;
        }
        this.f52610x6ff87ef7 = i17;
        this.f52601xf9097758.m102755x1d0e264b(i17, surface);
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.AbstractC26343x1f759d65
    /* renamed from: getMimeCandidates */
    public java.util.ArrayList<java.lang.String> mo102092x1555379a() {
        return this.f52605x2d707471;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.InterfaceC26342xbf303b4d
    /* renamed from: initDecoder */
    public boolean mo102037xaa9e0d14(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface, int i27, int i28, int i29) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "initDecoder, mimeType:" + str + " width:" + i17 + " height:" + i18 + " rotation:" + i19 + " dvProfile:" + i28 + " dvLevel:" + i29);
        this.f52609x7b4db658 = i17;
        this.f52608xd49a1ad5 = i18;
        this.f52607x2296b70b = i19;
        boolean z17 = false;
        if (surface != null && !surface.isValid()) {
            return false;
        }
        if (this.f52532xefaad160 > 0) {
            this.f52611x368f3a = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_SHARPEN;
        } else if (this.f52529x3c62080d) {
            this.f52611x368f3a = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_HDR2SDR;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType tPProcessType = this.f52611x368f3a;
        if (tPProcessType != com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e.TPProcessType.TP_PROCESS_UNKNOWN && !this.f52526xe54dbfcf) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26423xb69d39ab c26423xb69d39ab = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26423xb69d39ab(surface, tPProcessType);
                this.f52601xf9097758 = c26423xb69d39ab;
                c26423xb69d39ab.m102747x1853893();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "DisplaySurface eglSetup success!");
                this.f52601xf9097758.m102751x900967ab();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "makeCurrent success!");
                this.f52606x932d250b = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26424x50c0e75e(this.f52609x7b4db658, this.f52608xd49a1ad5, this.f52541xa2ab0730, this.f52611x368f3a);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "ProcessSurface create success!");
                this.f52543x2fa29f80 = this.f52606x932d250b.m102759xcf572877();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "sifeng create render surface success!");
            } catch (java.lang.Exception e17) {
                this.f52532xefaad160 = 0;
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                e17.printStackTrace(new java.io.PrintWriter(stringWriter));
                java.lang.String stringWriter2 = stringWriter.toString();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "sifeng create sharpen surface failed! " + e17.getMessage());
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "stackTraceString: " + stringWriter2);
                m102144xf5bd89e4();
            }
        }
        if (!m102140xd07b7be0() || this.f52526xe54dbfcf || this.f52543x2fa29f80 == null) {
            this.f52543x2fa29f80 = surface;
        }
        this.f52525x10b8544c = i27;
        this.f52603xad40c576 = i28;
        this.f52602x90da6691 = i29;
        this.f52605x2d707471.clear();
        if ("video/dolby-vision".equals(str)) {
            int m101704x6afa3717 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101704x6afa3717(this.f52603xad40c576);
            if (m101704x6afa3717 >= 4 && m101704x6afa3717 <= 256) {
                z17 = true;
            }
            if (this.f52600x6e36bbd8 && z17) {
                this.f52605x2d707471.add("video/hevc");
            } else {
                this.f52605x2d707471.add(str);
                if (z17) {
                    this.f52605x2d707471.add("video/hevc");
                }
            }
        } else {
            this.f52605x2d707471.add(str);
        }
        return true;
    }
}
