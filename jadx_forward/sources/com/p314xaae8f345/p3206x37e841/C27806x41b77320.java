package com.p314xaae8f345.p3206x37e841;

/* renamed from: com.tencent.wxmm.v2encoder */
/* loaded from: classes13.dex */
public class C27806x41b77320 {

    /* renamed from: EMethodGetRemoteHW */
    public static final int f60781xe362a7e5 = 26;

    /* renamed from: ENUM_AVCEncCfgERROR */
    public static final int f60782x30eeda6e = 2003;

    /* renamed from: ENUM_AVCEncCreateERROR */
    public static final int f60783x319a83c2 = 2002;

    /* renamed from: ENUM_AVCEncERROR */
    public static final int f60784xd84c0fde = 2004;

    /* renamed from: ENUM_AVCEncNotFound */
    public static final int f60785x99feaad9 = 2001;

    /* renamed from: ENUM_AVCEncOK */
    public static final int f60786x2cb587a6 = 2000;

    /* renamed from: SAVEVIDEOSTREAM */
    public static final boolean f60787xa371d5fe = true;
    private static final java.lang.String TAG = "v2encoder";

    /* renamed from: VFMT_420SP */
    public static final int f60789xdab8ed67 = 7;

    /* renamed from: VFMT_HEVC_HW */
    public static final int f60790x54ac5d1c = 19;

    /* renamed from: VFMT_ROTATE */
    public static final int f60791xb13ee643 = 32;

    /* renamed from: VFMT_i264 */
    public static final int f60792xb491ac4f = 18;

    /* renamed from: enumCODEC_Vcodec2_hw */
    public static final byte f60793xf227ca6 = 4;

    /* renamed from: enumCODEC_f264 */
    public static final byte f60794x845152b4 = 1;

    /* renamed from: enumCODEC_i264 */
    public static final byte f60795x8452afd1 = 8;

    /* renamed from: enumCODEC_vcodec2 */
    public static final byte f60796x98e30028 = 16;

    /* renamed from: frameID */
    public static int f60797xdbce0b48 = 0;

    /* renamed from: streamqueuesize */
    private static int f60799xfbcc2912 = 100;

    /* renamed from: mGeneratedIdx */
    public long f60806xfe09ffbb;

    /* renamed from: mProfileCfg */
    int f60808x9a78aa48;

    /* renamed from: mProtocol */
    public com.p314xaae8f345.p3206x37e841.C27809x17c9b4b9 f60809xea083625;

    /* renamed from: m_CapH */
    int f60810xbf5ae368;

    /* renamed from: m_CapW */
    int f60811xbf5ae377;

    /* renamed from: m_br_kbps */
    int f60812xb5caea57;

    /* renamed from: m_framerate */
    int f60813x2d2c8e7b;

    /* renamed from: m_height */
    int f60814x9388a939;

    /* renamed from: m_width */
    int f60815x2ee1cb74;

    /* renamed from: mediaFormat */
    protected android.media.MediaFormat f60817xd571d8fb;

    /* renamed from: outputStream */
    private java.io.BufferedOutputStream f60818xf83acfe1;

    /* renamed from: stQoS */
    com.p314xaae8f345.p3206x37e841.C27810xbdfc9f18 f60819x68a87d4;

    /* renamed from: path */
    private static java.lang.String f60798x346425 = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();

    /* renamed from: SizeFormat2WH */
    public static short[] f60788xb5ba980b = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480};

    /* renamed from: supportedH264HwCodecPrefixes */
    private static final java.lang.String[] f60800x6ae81a71 = {"OMX.qcom.", "OMX.Exynos.", "OMX.hisi"};

    /* renamed from: EMethodGetQosPara */
    public static int f60780x99739985 = 25;

    /* renamed from: ENCODING */
    public java.lang.String f60801x94a51d53 = "hevc";

    /* renamed from: TIMEOUT_USEC */
    private int f60802x9fb263fa = 12000;

    /* renamed from: mediaCodec */
    private android.media.MediaCodec f60816x7212fe92 = null;

    /* renamed from: configbyte */
    public byte[] f60803x3196734a = null;

    /* renamed from: isRuning */
    public boolean f60805xf159bf41 = false;

    /* renamed from: encLen */
    public int f60804xb295badb = 0;

    /* renamed from: mPrevResolution */
    int f60807xd0081d0c = 8;

    /* renamed from: com.tencent.wxmm.v2encoder$Frame */
    /* loaded from: classes6.dex */
    public static class Frame {

        /* renamed from: id, reason: collision with root package name */
        public int f301720id;

        /* renamed from: frameData */
        public byte[] f60820x20768eb7 = null;

        /* renamed from: type */
        public int f60821x368f3a = 0;

        public Frame(int i17) {
            this.f301720id = i17;
        }
    }

    public C27806x41b77320(int i17, int i18, int i19, int i27, int i28, com.p314xaae8f345.p3206x37e841.C27809x17c9b4b9 c27809x17c9b4b9) {
        this.f60815x2ee1cb74 = i17;
        this.f60814x9388a939 = i18;
        this.f60811xbf5ae377 = i17;
        this.f60810xbf5ae368 = i18;
        this.f60809xea083625 = c27809x17c9b4b9;
        this.f60813x2d2c8e7b = i19;
        this.f60812xb5caea57 = i27;
        this.f60808x9a78aa48 = i28;
        f60797xdbce0b48 = 0;
        this.f60806xfe09ffbb = 0L;
        this.f60819x68a87d4 = new com.p314xaae8f345.p3206x37e841.C27810xbdfc9f18();
    }

    /* renamed from: NV21ToNV12 */
    private void m120024x3d01dfcb(byte[] bArr, byte[] bArr2, int i17, int i18, int i19) {
        if (bArr == null || bArr2 == null) {
            return;
        }
        int i27 = i17 * i18;
        int i28 = 0;
        if (i19 == 0) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i27);
            while (i28 < i27 / 2) {
                int i29 = i27 + i28;
                int i37 = i29 + 1;
                bArr2[i29] = bArr[i37];
                bArr2[i37] = bArr[i29];
                i28 += 2;
            }
            return;
        }
        for (int i38 = 0; i38 < i27; i38++) {
            bArr2[i38] = bArr[(i27 - 1) - i38];
        }
        while (true) {
            if (i28 >= i27 / 2) {
                return;
            }
            bArr2[i27 + i28] = bArr[((r7 + i27) - 1) - i28];
            i28++;
        }
    }

    /* renamed from: StopEncoder */
    private void m120025xb707169a() {
        try {
            android.media.MediaCodec mediaCodec = this.f60816x7212fe92;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.f60816x7212fe92.release();
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    /* renamed from: SupportAvcCodec */
    private boolean m120026x98b92b7(java.lang.String str, int i17) {
        boolean z17 = false;
        for (int codecCount = android.media.MediaCodecList.getCodecCount() - 1; codecCount >= 0; codecCount--) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(codecCount);
            codecInfoAt.getName();
            if (codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                java.lang.String name = codecInfoAt.getName();
                for (java.lang.String str2 : supportedTypes) {
                    if (str2.equalsIgnoreCase(str)) {
                        for (java.lang.String str3 : f60800x6ae81a71) {
                            if (name.startsWith(str3)) {
                                try {
                                    for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecInfoAt.getCapabilitiesForType(str).profileLevels) {
                                        if (codecProfileLevel.profile == i17) {
                                            z17 = true;
                                        }
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return z17;
    }

    /* renamed from: computePresentationTime */
    private long m120027xca64275e(long j17) {
        return ((j17 * 1000000) / 15) + 132;
    }

    /* renamed from: createfile */
    private void m120028x51a4b878(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            this.f60818xf83acfe1 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    /* renamed from: isRecognizedProfile */
    private boolean m120029x51fb2f29(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 8;
    }

    /* renamed from: selectCodec */
    private android.media.MediaCodecInfo m120030xb4aa87a(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        codecInfoAt.getName();
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: trySetBitRateMode */
    private void m120031x2ad633a9(android.media.MediaCodecInfo mediaCodecInfo) {
        android.media.MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.f60801x94a51d53);
            if (capabilitiesForType != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    this.f60817xd571d8fb.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(1)) {
                    this.f60817xd571d8fb.setInteger("bitrate-mode", 1);
                }
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    /* renamed from: trySetProfile */
    private void m120032xf6320302(android.media.MediaCodecInfo mediaCodecInfo) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.f60801x94a51d53);
            if (capabilitiesForType == null || (codecProfileLevelArr = capabilitiesForType.profileLevels) == null) {
                return;
            }
            android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.level = 0;
            codecProfileLevel.profile = 0;
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                int i17 = codecProfileLevel2.profile;
                int i18 = codecProfileLevel2.level;
                if (m120029x51fb2f29(i17) && i17 >= codecProfileLevel.profile && i18 >= codecProfileLevel.level) {
                    codecProfileLevel.profile = i17;
                    codecProfileLevel.level = i18;
                }
            }
            int i19 = codecProfileLevel.profile;
            int i27 = codecProfileLevel.level;
            if (i19 <= 0 || i27 < 256) {
                return;
            }
            this.f60817xd571d8fb.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, i19);
            this.f60817xd571d8fb.setInteger(ya.b.f77487x44fa364, 256);
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
    }

    /* renamed from: DoMediacodecEnc */
    public int m120033xe99f21dd(byte[] bArr, int i17) {
        byte[] bArr2;
        int i18 = this.f60811xbf5ae377;
        int i19 = this.f60810xbf5ae368;
        int i27 = this.f60815x2ee1cb74;
        int i28 = this.f60814x9388a939;
        if (this.f60819x68a87d4.f61103xda2bd30e == 0) {
            bArr2 = new byte[((i18 * i19) * 3) / 2];
            m120024x3d01dfcb(bArr, bArr2, i27, i28, i17 & 32);
            this.f60804xb295badb = ((this.f60815x2ee1cb74 * this.f60814x9388a939) * 3) >> 1;
        } else {
            bArr2 = null;
        }
        if (bArr2 == null) {
            return 0;
        }
        try {
            java.lang.System.currentTimeMillis();
            java.nio.ByteBuffer[] inputBuffers = this.f60816x7212fe92.getInputBuffers();
            java.nio.ByteBuffer[] outputBuffers = this.f60816x7212fe92.getOutputBuffers();
            int dequeueInputBuffer = this.f60816x7212fe92.dequeueInputBuffer(-1L);
            if (dequeueInputBuffer >= 0) {
                long m120027xca64275e = m120027xca64275e(this.f60806xfe09ffbb);
                java.nio.ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                byteBuffer.put(bArr2, 0, this.f60804xb295badb);
                this.f60816x7212fe92.queueInputBuffer(dequeueInputBuffer, 0, this.f60804xb295badb, m120027xca64275e, 0);
                this.f60806xfe09ffbb++;
            }
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.f60816x7212fe92.dequeueOutputBuffer(bufferInfo, this.f60802x9fb263fa);
            int i29 = 0;
            while (dequeueOutputBuffer >= 0) {
                int i37 = bufferInfo.size;
                byte[] bArr3 = new byte[i37];
                outputBuffers[dequeueOutputBuffer].get(bArr3);
                java.io.BufferedOutputStream bufferedOutputStream = this.f60818xf83acfe1;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.write(bArr3, 0, i37);
                }
                m120040x9d170b28(bArr3, bufferInfo.flags, i37);
                i29 = bufferInfo.flags;
                f60797xdbce0b48++;
                this.f60816x7212fe92.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.f60816x7212fe92.dequeueOutputBuffer(bufferInfo, this.f60802x9fb263fa);
            }
            return i29;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return -2004;
        }
    }

    /* renamed from: DoQosSvrCtrl */
    public void m120034xcfd140b0() {
        com.p314xaae8f345.p3206x37e841.C27809x17c9b4b9 c27809x17c9b4b9 = this.f60809xea083625;
        if (c27809x17c9b4b9 != null) {
            int i17 = f60780x99739985;
            byte[] bArr = this.f60819x68a87d4.s2p;
            if (c27809x17c9b4b9.m120075x430a65b(i17, bArr, bArr.length) >= 0) {
                this.f60819x68a87d4.m120078xa8284728();
                this.f60819x68a87d4.m120079xba7af024();
            }
            short s17 = this.f60819x68a87d4.f61105x5eb39a3;
            int i18 = this.f60812xb5caea57;
            if (s17 != i18) {
                m120037x21e954eb(i18);
                this.f60812xb5caea57 = this.f60819x68a87d4.f61105x5eb39a3;
            }
            if (1 == this.f60819x68a87d4.f61096x9a1efe04) {
                m120036x7299b632();
            }
            byte b17 = this.f60819x68a87d4.f61093x2e1586;
            if (b17 != this.f60813x2d2c8e7b) {
                this.f60813x2d2c8e7b = b17;
            }
        }
    }

    /* renamed from: InitHWEncoder */
    public int m120035x18f611dd(boolean z17) {
        int i17;
        this.f60801x94a51d53 = z17 ? "video/avc" : "video/hevc";
        byte[] bArr = new byte[4];
        bArr[0] = 0;
        this.f60809xea083625.m120075x430a65b(26, bArr, 4);
        byte b17 = bArr[0];
        if (z17) {
            if ((b17 & 1) == 0 && (b17 & 8) == 0) {
                return -2;
            }
        } else if ((b17 & f60796x98e30028) == 0 && (b17 & 4) == 0) {
            return -3;
        }
        try {
            i17 = m120038xa1f95a7a();
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            i17 = -2003;
        }
        if (i17 < 0) {
            return i17;
        }
        m120028x51a4b878(f60798x346425 + "/AVLog/mediacodec.h264");
        return i17;
    }

    /* renamed from: MakeIFrame */
    public void m120036x7299b632() {
        if (this.f60816x7212fe92 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("request-sync", 0);
            this.f60816x7212fe92.setParameters(bundle);
        }
    }

    /* renamed from: SetBitRate */
    public boolean m120037x21e954eb(int i17) {
        try {
            if (this.f60816x7212fe92 == null) {
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", i17 * 1000);
            this.f60816x7212fe92.setParameters(bundle);
            return true;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return false;
        }
    }

    /* renamed from: StartEncoder */
    public int m120038xa1f95a7a() {
        if (this.f60816x7212fe92 != null) {
            m120025xb707169a();
        }
        android.media.MediaCodecInfo m120030xb4aa87a = m120030xb4aa87a(this.f60801x94a51d53);
        if (m120030xb4aa87a == null) {
            return -2001;
        }
        m120030xb4aa87a.getName();
        android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(this.f60801x94a51d53, this.f60815x2ee1cb74, this.f60814x9388a939);
        this.f60817xd571d8fb = createVideoFormat;
        createVideoFormat.setInteger("color-format", 21);
        this.f60817xd571d8fb.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f60812xb5caea57 * 1000);
        this.f60817xd571d8fb.setInteger("frame-rate", this.f60813x2d2c8e7b);
        this.f60817xd571d8fb.setInteger("i-frame-interval", 1);
        java.lang.String string = this.f60817xd571d8fb.getString("mime");
        if (this.f60801x94a51d53.equalsIgnoreCase("video/avc")) {
            if (!((this.f60808x9a78aa48 & 4) != 0)) {
                m120032xf6320302(m120030xb4aa87a);
            } else if (m120026x98b92b7(string, 8)) {
                this.f60817xd571d8fb.setInteger(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, 8);
            }
        }
        this.f60817xd571d8fb.setInteger("bitrate-mode", 2);
        try {
            this.f60816x7212fe92 = android.media.MediaCodec.createEncoderByType(string);
            java.util.Objects.toString(this.f60817xd571d8fb);
            this.f60816x7212fe92.configure(this.f60817xd571d8fb, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
            this.f60816x7212fe92.start();
            return 2000;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return -2002;
        }
    }

    /* renamed from: UninitHWEncoder */
    public void m120039xcc7dcbe4() {
        this.f60805xf159bf41 = false;
        try {
            m120025xb707169a();
            java.io.BufferedOutputStream bufferedOutputStream = this.f60818xf83acfe1;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.flush();
                this.f60818xf83acfe1.close();
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }

    /* renamed from: putH2645Data */
    public void m120040x9d170b28(byte[] bArr, int i17, int i18) {
        if (bArr == null || this.f60809xea083625 == null) {
            return;
        }
        this.f60809xea083625.m120077x2bc4e674(bArr, i18, this.f60815x2ee1cb74, i17, this.f60801x94a51d53.equalsIgnoreCase("video/hevc") ? 19 : 18);
    }
}
