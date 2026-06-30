package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.ExportConfig */
/* loaded from: classes10.dex */
public class C25679xbb204036 implements java.lang.Cloneable {
    private static final java.lang.String TAG = "ExportConfig";

    /* renamed from: UNKNOWN_PARAM_VALUE */
    private static final int f47452x8a94fe6a = 0;

    /* renamed from: audioAacProfile */
    private int f47453xda248c5c;

    /* renamed from: audioBitRate */
    private int f47454x9b4b0ed7;

    /* renamed from: audioChannelCount */
    private int f47455xd3ed6cc2;

    /* renamed from: audioEncodeNeedCodecSpecificData */
    private boolean f47456xbe6bff10;

    /* renamed from: audioFormat */
    private android.media.MediaFormat f47457x3e7c76d;

    /* renamed from: audioSampleRateHz */
    private int f47458xde497752;

    /* renamed from: colorRange */
    private int f47459x4c1f3f9a;

    /* renamed from: colorStandard */
    private int f47460xa7969f40;

    /* renamed from: colorTransfer */
    private int f47461xa5b2386e;

    /* renamed from: correctSizeByCodecCapabilities */
    private boolean f47462x95fda5ca;

    /* renamed from: hdrStaticInfo */
    private java.nio.ByteBuffer f47463xa4b073d2;

    /* renamed from: highProfile */
    private boolean f47464xdad209a7;

    /* renamed from: limitProfileLevel */
    private boolean f47465xd7eca2b6;

    /* renamed from: loggerConfig */
    public com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 f47466xc231f8f2;

    /* renamed from: minMuxDuration */
    private int f47467xc90ec3d2;

    /* renamed from: minMuxFrameCount */
    private int f47468x65597260;

    /* renamed from: outputFilePath */
    private java.lang.String f47469x3e2d9be2;

    /* renamed from: outputHeight */
    private int f47470xe49e1188;

    /* renamed from: outputWidth */
    private int f47471xce669d45;

    /* renamed from: renderHeight */
    private int f47472x189ab65d;

    /* renamed from: renderWidth */
    private int f47473x9e8789d0;

    /* renamed from: suggestParallelCount */
    private int f47474x9808f624;

    /* renamed from: videoBitRate */
    private int f47475xf1138292;

    /* renamed from: videoFormat */
    private android.media.MediaFormat f47476x27b47052;

    /* renamed from: videoFrameRate */
    private int f47477x335ed1b2;

    /* renamed from: videoIFrameInterval */
    private int f47478x35e04c4;

    /* renamed from: videoMimeType */
    private java.lang.String f47479x9d1dbb29;

    public C25679xbb204036(int i17, int i18) {
        this.f47475xf1138292 = 8000000;
        this.f47477x335ed1b2 = 30;
        this.f47478x35e04c4 = 1;
        this.f47479x9d1dbb29 = "video/avc";
        this.f47464xdad209a7 = false;
        this.f47465xd7eca2b6 = false;
        this.f47467xc90ec3d2 = -1;
        this.f47468x65597260 = -1;
        this.f47454x9b4b0ed7 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259;
        this.f47453xda248c5c = 2;
        this.f47455xd3ed6cc2 = 1;
        this.f47458xde497752 = 44100;
        this.f47459x4c1f3f9a = 0;
        this.f47460xa7969f40 = 0;
        this.f47461xa5b2386e = 0;
        this.f47463xa4b073d2 = null;
        this.f47456xbe6bff10 = true;
        this.f47462x95fda5ca = true;
        this.f47474x9808f624 = -1;
        this.f47466xc231f8f2 = com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25801x67b50bf9.f48380x4fbc8495.m97834x1e74d0e3();
        this.f47471xce669d45 = i17;
        this.f47470xe49e1188 = i18;
        this.f47473x9e8789d0 = i17;
        this.f47472x189ab65d = i18;
    }

    /* renamed from: findFormatValue */
    private int m96714xa8e82041(java.lang.String str, int i17, android.media.MediaFormat mediaFormat) {
        return (mediaFormat == null || !mediaFormat.containsKey(str)) ? i17 : mediaFormat.getInteger(str);
    }

    /* renamed from: findVideoFormatValue */
    private int m96715xa4943c18(java.lang.String str, int i17) {
        return m96714xa8e82041(str, i17, this.f47476x27b47052);
    }

    /* renamed from: initAudioChannelCount */
    private void m96716xddf50992() {
        m96725x20ed38b0("channel-count", this.f47455xd3ed6cc2);
    }

    /* renamed from: initAudioSampleRate */
    private void m96717x89f706f0() {
        m96725x20ed38b0("sample-rate", this.f47458xde497752);
    }

    /* renamed from: initColorSpace */
    private void m96718x82c82493() {
        int i17 = this.f47459x4c1f3f9a;
        if (i17 != 0) {
            m96728x44b9e195("color-range", i17);
        }
        int i18 = this.f47461xa5b2386e;
        if (i18 != 0) {
            m96728x44b9e195("color-transfer", i18);
        }
        int i19 = this.f47460xa7969f40;
        if (i19 != 0) {
            m96728x44b9e195("color-standard", i19);
        }
        java.nio.ByteBuffer byteBuffer = this.f47463xa4b073d2;
        if (byteBuffer != null) {
            m96729x44b9e195("hdr-static-info", byteBuffer);
        }
    }

    /* renamed from: initFrameRate */
    private void m96719x7d1658bd() {
        m96728x44b9e195("frame-rate", this.f47477x335ed1b2);
    }

    /* renamed from: initHdrInfo */
    private void m96720x7d446194() {
        java.nio.ByteBuffer byteBuffer = this.f47463xa4b073d2;
        if (byteBuffer != null) {
            m96729x44b9e195("hdr-static-info", byteBuffer);
        }
    }

    /* renamed from: initHighProfile */
    private void m96721x76c38277() {
        if (this.f47464xdad209a7 && this.f47479x9d1dbb29.equalsIgnoreCase("video/avc")) {
            com.p314xaae8f345.tav.p2959x5befac44.C25759xbfeccb44.m97449x539b601a(this.f47476x27b47052, this.f47465xd7eca2b6);
        }
    }

    /* renamed from: initIFrameInterval */
    private void m96722xa5082c99() {
        m96728x44b9e195("i-frame-interval", this.f47478x35e04c4);
    }

    /* renamed from: initOutputSize */
    private void m96723xeaa631d2() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "initOutputSize, correctSizeByCodecCapabilities:" + this.f47462x95fda5ca);
        if (!this.f47462x95fda5ca) {
            m96728x44b9e195("width", (int) m96740xa252bc98().f47833x6be2dc6);
            m96728x44b9e195("height", (int) m96740xa252bc98().f47832xb7389127);
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "initOutputSize, width:" + m96740xa252bc98().f47833x6be2dc6 + " height:" + m96740xa252bc98().f47832xb7389127);
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97439x3f77cda6 = com.p314xaae8f345.tav.p2959x5befac44.C25759xbfeccb44.m97439x3f77cda6(m96740xa252bc98(), "video/avc");
        m96728x44b9e195("width", (int) m97439x3f77cda6.f47833x6be2dc6);
        m96728x44b9e195("height", (int) m97439x3f77cda6.f47832xb7389127);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "initOutputSize, width:" + m97439x3f77cda6.f47833x6be2dc6 + " height:" + m97439x3f77cda6.f47832xb7389127);
    }

    /* renamed from: initVideoBitrate */
    private void m96724xd35fafa2() {
        m96728x44b9e195(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f47475xf1138292);
    }

    /* renamed from: setToAudioFormat */
    private void m96725x20ed38b0(java.lang.String str, int i17) {
        if (this.f47457x3e7c76d == null) {
            m96734xddbe0e37();
        }
        m96726xf63388d4(str, i17, this.f47457x3e7c76d);
    }

    /* renamed from: setToFormat */
    private void m96726xf63388d4(java.lang.String str, int i17, android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return;
        }
        mediaFormat.setInteger(str, i17);
    }

    /* renamed from: setToVideoFormat */
    private void m96728x44b9e195(java.lang.String str, int i17) {
        if (this.f47476x27b47052 == null) {
            m96746x18ab71c();
        }
        m96726xf63388d4(str, i17, this.f47476x27b47052);
    }

    /* renamed from: available */
    public boolean m96730xd4418ac9() {
        return m96741xa83ce40f() > 0 && m96739x4590a3fe() > 0;
    }

    /* renamed from: getAudioChannelCount */
    public int m96733x2721f40c() {
        return m96714xa8e82041("channel-count", this.f47455xd3ed6cc2, this.f47457x3e7c76d);
    }

    /* renamed from: getAudioFormat */
    public android.media.MediaFormat m96734xddbe0e37() {
        if (this.f47457x3e7c76d == null) {
            android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
            this.f47457x3e7c76d = mediaFormat;
            mediaFormat.setString("mime", "audio/mp4a-latm");
            this.f47457x3e7c76d.setInteger("sample-rate", this.f47458xde497752);
            m96716xddf50992();
            this.f47457x3e7c76d.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f47454x9b4b0ed7);
            this.f47457x3e7c76d.setInteger("aac-profile", this.f47453xda248c5c);
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "getAudioFormat:" + this.f47457x3e7c76d);
        return this.f47457x3e7c76d;
    }

    /* renamed from: getAudioSampleRateHz */
    public int m96735x317dfe9c() {
        return m96714xa8e82041("sample-rate", this.f47458xde497752, this.f47457x3e7c76d);
    }

    /* renamed from: getMinMuxDuration */
    public int m96736xb7a690c8() {
        return this.f47467xc90ec3d2;
    }

    /* renamed from: getMinMuxFrameCount */
    public int m96737xd31d9d6() {
        return this.f47468x65597260;
    }

    /* renamed from: getOutputFilePath */
    public java.lang.String m96738x2cc568d8() {
        return this.f47469x3e2d9be2;
    }

    /* renamed from: getOutputHeight */
    public int m96739x4590a3fe() {
        return m96715xa4943c18("height", this.f47470xe49e1188);
    }

    /* renamed from: getOutputSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m96740xa252bc98() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(m96741xa83ce40f(), m96739x4590a3fe());
    }

    /* renamed from: getOutputWidth */
    public int m96741xa83ce40f() {
        return m96715xa4943c18("width", this.f47471xce669d45);
    }

    /* renamed from: getRenderHeight */
    public int m96742x798d48d3() {
        return this.f47472x189ab65d;
    }

    /* renamed from: getRenderWidth */
    public int m96743x785dd09a() {
        return this.f47473x9e8789d0;
    }

    /* renamed from: getSuggestParallelCount */
    public int m96744x45d4b29a() {
        return this.f47474x9808f624;
    }

    /* renamed from: getVideoBitRate */
    public int m96745x52061508() {
        return m96715xa4943c18(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, this.f47475xf1138292);
    }

    /* renamed from: getVideoFormat */
    public android.media.MediaFormat m96746x18ab71c() {
        if (this.f47476x27b47052 == null) {
            android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
            this.f47476x27b47052 = mediaFormat;
            mediaFormat.setString("mime", this.f47479x9d1dbb29);
            this.f47476x27b47052.setInteger("color-format", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48031x5e80f9d5);
            m96723xeaa631d2();
            m96724xd35fafa2();
            m96719x7d1658bd();
            m96722xa5082c99();
            m96721x76c38277();
            m96718x82c82493();
            m96720x7d446194();
        }
        return this.f47476x27b47052;
    }

    /* renamed from: getVideoFrameRate */
    public int m96747x21f69ea8() {
        return m96715xa4943c18("frame-rate", this.f47477x335ed1b2);
    }

    /* renamed from: isAudioEncodeNeedCodecSpecificData */
    public boolean m96748x5254e85a() {
        return this.f47456xbe6bff10;
    }

    /* renamed from: setAudioBitRate */
    public void m96749x32869c59(int i17) {
        this.f47454x9b4b0ed7 = i17;
    }

    /* renamed from: setAudioChannelCount */
    public void m96750x2b80080(int i17) {
        this.f47455xd3ed6cc2 = i17;
        m96716xddf50992();
    }

    /* renamed from: setAudioEncodeNeedCodecSpecificData */
    public void m96751xf0bb792(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "setAudioEncodeNeedCodecSpecificData:" + z17);
        this.f47456xbe6bff10 = z17;
    }

    /* renamed from: setAudioSampleRateHz */
    public void m96752xd140b10(int i17) {
        this.f47458xde497752 = i17;
        m96717x89f706f0();
    }

    /* renamed from: setColorSpace */
    public void m96753x6898fd65(int i17, int i18, int i19) {
        this.f47459x4c1f3f9a = i17;
        this.f47460xa7969f40 = i18;
        this.f47461xa5b2386e = i19;
        m96718x82c82493();
    }

    /* renamed from: setEncodeHevc */
    public void m96754xff048da2(boolean z17) {
        if (z17) {
            this.f47479x9d1dbb29 = "video/hevc";
        } else {
            this.f47479x9d1dbb29 = "video/avc";
        }
    }

    /* renamed from: setHdrStaticInfo */
    public void m96755xf4e69690(java.nio.ByteBuffer byteBuffer) {
        this.f47463xa4b073d2 = byteBuffer;
        m96720x7d446194();
    }

    /* renamed from: setHighProfile */
    public void m96756x4b0dc3e5(boolean z17) {
        this.f47464xdad209a7 = z17;
        m96721x76c38277();
    }

    /* renamed from: setLimitProfileLevel */
    public void m96757x6b73674(boolean z17) {
        this.f47465xd7eca2b6 = z17;
    }

    /* renamed from: setMinMuxDuration */
    public void m96758x7f9cf8d4(int i17) {
        this.f47467xc90ec3d2 = i17;
    }

    /* renamed from: setMinMuxFrameCount */
    public void m96759xb12e6ee2(int i17) {
        this.f47468x65597260 = i17;
    }

    /* renamed from: setNeedCorrectSizeByCodecCapabilities */
    public void m96760xf7b6b002(boolean z17) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "setNeedCorrectSizeByCodecCapabilities:" + z17);
        this.f47462x95fda5ca = z17;
    }

    /* renamed from: setOutputFilePath */
    public void m96761xf4bbd0e4(java.lang.String str) {
        this.f47469x3e2d9be2 = str;
    }

    /* renamed from: setOutputSize */
    public void m96762xd0770aa4(int i17, int i18) {
        this.f47471xce669d45 = i17;
        this.f47470xe49e1188 = i18;
        m96723xeaa631d2();
    }

    /* renamed from: setSuggestParallelCount */
    public void m96763xc027e1a6(int i17) {
        this.f47474x9808f624 = i17;
    }

    /* renamed from: setVideoBitRate */
    public void m96764x884f1014(int i17) {
        this.f47475xf1138292 = i17;
        m96724xd35fafa2();
    }

    /* renamed from: setVideoFrameRate */
    public void m96765xe9ed06b4(int i17) {
        this.f47477x335ed1b2 = i17;
        m96719x7d1658bd();
    }

    /* renamed from: setVideoIFrameInterval */
    public void m96766xa9d2a102(int i17) {
        this.f47478x35e04c4 = i17;
        m96722xa5082c99();
    }

    /* renamed from: setToFormat */
    private void m96727xf63388d4(java.lang.String str, java.nio.ByteBuffer byteBuffer, android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return;
        }
        mediaFormat.setByteBuffer(str, byteBuffer);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 m96732x5a5dd5d() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036(this.f47471xce669d45, this.f47470xe49e1188);
        c25679xbb204036.f47475xf1138292 = this.f47475xf1138292;
        c25679xbb204036.f47477x335ed1b2 = this.f47477x335ed1b2;
        c25679xbb204036.f47478x35e04c4 = this.f47478x35e04c4;
        c25679xbb204036.f47471xce669d45 = this.f47471xce669d45;
        c25679xbb204036.f47470xe49e1188 = this.f47470xe49e1188;
        c25679xbb204036.f47473x9e8789d0 = this.f47473x9e8789d0;
        c25679xbb204036.f47472x189ab65d = this.f47472x189ab65d;
        c25679xbb204036.f47464xdad209a7 = this.f47464xdad209a7;
        c25679xbb204036.f47479x9d1dbb29 = this.f47479x9d1dbb29;
        c25679xbb204036.f47454x9b4b0ed7 = this.f47454x9b4b0ed7;
        c25679xbb204036.f47453xda248c5c = this.f47453xda248c5c;
        c25679xbb204036.f47455xd3ed6cc2 = this.f47455xd3ed6cc2;
        c25679xbb204036.f47458xde497752 = this.f47458xde497752;
        c25679xbb204036.f47456xbe6bff10 = this.f47456xbe6bff10;
        c25679xbb204036.f47459x4c1f3f9a = this.f47459x4c1f3f9a;
        c25679xbb204036.f47460xa7969f40 = this.f47460xa7969f40;
        c25679xbb204036.f47461xa5b2386e = this.f47461xa5b2386e;
        c25679xbb204036.f47463xa4b073d2 = this.f47463xa4b073d2;
        c25679xbb204036.f47462x95fda5ca = this.f47462x95fda5ca;
        c25679xbb204036.f47474x9808f624 = this.f47474x9808f624;
        c25679xbb204036.f47466xc231f8f2 = this.f47466xc231f8f2.m97824xae0cf317();
        return c25679xbb204036;
    }

    /* renamed from: setToVideoFormat */
    private void m96729x44b9e195(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        if (this.f47476x27b47052 == null) {
            m96746x18ab71c();
        }
        m96727xf63388d4(str, byteBuffer, this.f47476x27b47052);
    }

    public C25679xbb204036(int i17, int i18, int i19, int i27) {
        this.f47475xf1138292 = 8000000;
        this.f47477x335ed1b2 = 30;
        this.f47478x35e04c4 = 1;
        this.f47479x9d1dbb29 = "video/avc";
        this.f47464xdad209a7 = false;
        this.f47465xd7eca2b6 = false;
        this.f47467xc90ec3d2 = -1;
        this.f47468x65597260 = -1;
        this.f47454x9b4b0ed7 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259;
        this.f47453xda248c5c = 2;
        this.f47455xd3ed6cc2 = 1;
        this.f47458xde497752 = 44100;
        this.f47459x4c1f3f9a = 0;
        this.f47460xa7969f40 = 0;
        this.f47461xa5b2386e = 0;
        this.f47463xa4b073d2 = null;
        this.f47456xbe6bff10 = true;
        this.f47462x95fda5ca = true;
        this.f47474x9808f624 = -1;
        this.f47466xc231f8f2 = com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25801x67b50bf9.f48380x4fbc8495.m97834x1e74d0e3();
        this.f47471xce669d45 = i17;
        this.f47470xe49e1188 = i18;
        this.f47473x9e8789d0 = i19;
        this.f47472x189ab65d = i27;
    }

    @java.lang.Deprecated
    public C25679xbb204036(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.OutputConfig outputConfig) {
        this.f47475xf1138292 = 8000000;
        this.f47477x335ed1b2 = 30;
        this.f47478x35e04c4 = 1;
        this.f47479x9d1dbb29 = "video/avc";
        this.f47464xdad209a7 = false;
        this.f47465xd7eca2b6 = false;
        this.f47467xc90ec3d2 = -1;
        this.f47468x65597260 = -1;
        this.f47454x9b4b0ed7 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259;
        this.f47453xda248c5c = 2;
        this.f47455xd3ed6cc2 = 1;
        this.f47458xde497752 = 44100;
        this.f47459x4c1f3f9a = 0;
        this.f47460xa7969f40 = 0;
        this.f47461xa5b2386e = 0;
        this.f47463xa4b073d2 = null;
        this.f47456xbe6bff10 = true;
        this.f47462x95fda5ca = true;
        this.f47474x9808f624 = -1;
        this.f47466xc231f8f2 = com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25801x67b50bf9.f48380x4fbc8495.m97834x1e74d0e3();
        this.f47471xce669d45 = outputConfig.f48072x178746dc;
        this.f47470xe49e1188 = outputConfig.f48071xbf929ab1;
        this.f47478x35e04c4 = outputConfig.f48070x3193241c;
        this.f47475xf1138292 = outputConfig.f48068xeb2e5456;
        this.f47477x335ed1b2 = outputConfig.f48069x5e0896f6;
        this.f47464xdad209a7 = outputConfig.f48067xb7b4cfec;
        this.f47455xd3ed6cc2 = outputConfig.f48064x21f70dca;
        this.f47454x9b4b0ed7 = outputConfig.f48063xe5b3e35b;
        this.f47453xda248c5c = outputConfig.f48062x63fc0664;
    }
}
