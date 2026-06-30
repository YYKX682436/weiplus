package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPMediaDecoderInfo */
/* loaded from: classes14.dex */
public final class C26307xa598bb2a implements java.io.Serializable {

    /* renamed from: DEFAULT_MAX_BITRATE */
    private static final int f52150x6ae4ea34 = 960000;

    /* renamed from: DEFAULT_MAX_CHANNELNUM */
    private static final int f52151x5128375c = 2;

    /* renamed from: DEFAULT_MAX_HEIGHT */
    private static final int f52152xfcee2960 = 720;

    /* renamed from: DEFAULT_MAX_SAMPLERATE */
    private static final int f52153xccd3a943 = 48000;

    /* renamed from: DEFAULT_MAX_WIDTH */
    private static final int f52154xf037a64d = 1280;

    /* renamed from: DEFAULT_MIN_BITRATE */
    private static final int f52155x42841d22 = 8000;
    private static final java.lang.String TAG = "TPCodecUtils";

    /* renamed from: mAudioDecoderWhiteList */
    private static final java.util.ArrayList<java.lang.String> f52156x5d0ee0c;

    /* renamed from: mVideoSoftwareDecoderWhiteList */
    private static final java.util.ArrayList<java.lang.String> f52157x42d8e678;

    /* renamed from: adaptiveDec */
    private boolean f52158x29f719ac;

    /* renamed from: colorFormats */
    private int[] f52159x5ea1ea79;

    /* renamed from: decMimeType */
    private java.lang.String f52160x91a6b3b0;

    /* renamed from: decName */
    private java.lang.String f52161x5be0a1ad;

    /* renamed from: maxBitRate */
    private int f52162x3fd1c989;

    /* renamed from: maxChannels */
    private int f52163xce868954;

    /* renamed from: maxFrameRate */
    private float f52164xcba736e9;

    /* renamed from: maxHeight */
    private int f52165xc9fe87ab;

    /* renamed from: maxLumaFrameRate */
    private float f52166xd76ec48c;

    /* renamed from: maxLumaHeight */
    private int f52167x531b94e8;

    /* renamed from: maxLumaWidth */
    private int f52168xe27b2de5;

    /* renamed from: maxSampleRate */
    private int f52169xc2a6662e;

    /* renamed from: maxSupportedInstances */
    private int f52170x6829fdf4;

    /* renamed from: maxWidth */
    private int f52171x17dd56c2;

    /* renamed from: profileLevels */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[] f52172xb437a878;

    /* renamed from: secureDec */
    private boolean f52173xd9b9e90b;

    /* renamed from: softwareAudioDec */
    private boolean f52174xe05c0713;

    /* renamed from: softwareVideoDec */
    private boolean f52175xead1904e;

    /* renamed from: tunnelingDec */
    private boolean f52176x3c5d7328;

    /* renamed from: com.tencent.thumbplayer.core.common.TPMediaDecoderInfo$DecoderProfileLevel */
    /* loaded from: classes14.dex */
    public final class DecoderProfileLevel implements java.io.Serializable {

        /* renamed from: level */
        public int f52177x6219b84;

        /* renamed from: profile */
        public int f52178xed8e89a9;

        public DecoderProfileLevel(int i17, int i18) {
            this.f52178xed8e89a9 = i17;
            this.f52177x6219b84 = i18;
        }
    }

    static {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        f52157x42d8e678 = arrayList;
        arrayList.add("c2.android.vp9.decoder");
        arrayList.add("OMX.google.vp9.decoder");
        arrayList.add("c2.android.vp8.decoder");
        arrayList.add("OMX.google.vp8.decoder");
        arrayList.add("c2.android.av1.decoder");
        f52156x5d0ee0c = new java.util.ArrayList<>();
    }

    public C26307xa598bb2a(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities;
        int[] iArr;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        m101819x6761d4f();
        this.f52161x5be0a1ad = str2;
        this.f52160x91a6b3b0 = str;
        this.f52175xead1904e = m101839x7b98c171() && m101818x96823e04(str2);
        this.f52174xe05c0713 = m101835x7a7648cc() && m101815x12e094df(str2);
        this.f52158x29f719ac = codecCapabilities != null && m101814x82df7dc0(codecCapabilities);
        this.f52176x3c5d7328 = codecCapabilities != null && m101817x6b8d9070(codecCapabilities);
        this.f52173xd9b9e90b = codecCapabilities != null && m101816xf2284d41(codecCapabilities);
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null || codecProfileLevelArr.length <= 0) {
            this.f52172xb437a878 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel(codecProfileLevel.profile, codecProfileLevel.level));
            }
            this.f52172xb437a878 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[]) arrayList.toArray(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[arrayList.size()]);
        }
        if (codecCapabilities == null || (iArr = codecCapabilities.colorFormats) == null || iArr.length <= 0) {
            this.f52159x5ea1ea79 = new int[0];
        } else {
            this.f52159x5ea1ea79 = java.util.Arrays.copyOf(iArr, iArr.length);
        }
        this.f52170x6829fdf4 = m101812x73d5d03e(codecCapabilities);
        if (!str.contains("video") || codecCapabilities == null) {
            if (!str.contains("audio") || codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) {
                return;
            }
            this.f52169xc2a6662e = m101810x80062278(audioCapabilities);
            this.f52162x3fd1c989 = m101807x2e12817f(audioCapabilities);
            this.f52163xce868954 = m101808xa85cd01e(audioCapabilities);
            return;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            this.f52171x17dd56c2 = m101813x93b79438(videoCapabilities);
            this.f52165xc9fe87ab = m101809xc96bf8f5(videoCapabilities);
            this.f52166xd76ec48c = m101811x9296bdad(videoCapabilities);
            this.f52164xcba736e9 = videoCapabilities.getSupportedFrameRates().getUpper().floatValue();
        }
    }

    /* renamed from: getMaxBitRate */
    private int m101807x2e12817f(android.media.MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return (audioCapabilities != null ? audioCapabilities.getBitrateRange() : new android.util.Range<>(8000, java.lang.Integer.valueOf(f52150x6ae4ea34))).getUpper().intValue();
    }

    /* renamed from: getMaxChannels */
    private int m101808xa85cd01e(android.media.MediaCodecInfo.AudioCapabilities audioCapabilities) {
        if (audioCapabilities != null) {
            return audioCapabilities.getMaxInputChannelCount();
        }
        return 2;
    }

    /* renamed from: getMaxHeight */
    private int m101809xc96bf8f5(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities) {
        return (videoCapabilities != null ? videoCapabilities.getSupportedHeights() : new android.util.Range<>(0, 720)).getUpper().intValue();
    }

    /* renamed from: getMaxSampleRate */
    private int m101810x80062278(android.media.MediaCodecInfo.AudioCapabilities audioCapabilities) {
        android.util.Range<java.lang.Integer>[] supportedSampleRateRanges = audioCapabilities != null ? audioCapabilities.getSupportedSampleRateRanges() : null;
        if (supportedSampleRateRanges == null || supportedSampleRateRanges.length < 1) {
            return 48000;
        }
        return supportedSampleRateRanges[supportedSampleRateRanges.length - 1].getUpper().intValue();
    }

    /* renamed from: getMaxSupportedFrameRate */
    private final float m101811x9296bdad(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities) {
        if (videoCapabilities == null) {
            return 30.0f;
        }
        this.f52168xe27b2de5 = videoCapabilities.getSupportedWidthsFor(this.f52165xc9fe87ab).getUpper().intValue();
        int intValue = videoCapabilities.getSupportedHeightsFor(this.f52171x17dd56c2).getUpper().intValue();
        this.f52167x531b94e8 = intValue;
        return videoCapabilities.getSupportedFrameRatesFor(this.f52171x17dd56c2, intValue).getUpper().floatValue();
    }

    /* renamed from: getMaxSupportedInstances */
    private int m101812x73d5d03e(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (codecCapabilities != null) {
            return codecCapabilities.getMaxSupportedInstances();
        }
        return 1;
    }

    /* renamed from: getMaxWidth */
    private int m101813x93b79438(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities) {
        return (videoCapabilities != null ? videoCapabilities.getSupportedWidths() : new android.util.Range<>(0, 1280)).getUpper().intValue();
    }

    /* renamed from: isAdaptive */
    private boolean m101814x82df7dc0(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: isAudioSoftwareOnly */
    private boolean m101815x12e094df(java.lang.String str) {
        java.lang.String lowerCase = str == null ? "" : str.toLowerCase();
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.");
    }

    /* renamed from: isSecure */
    private boolean m101816xf2284d41(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: isTunneling */
    private boolean m101817x6b8d9070(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: isVideoSoftwareOnly */
    private boolean m101818x96823e04(java.lang.String str) {
        java.lang.String lowerCase = str == null ? "" : str.toLowerCase();
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || ((lowerCase.startsWith("omx.qti.video.decoder") && lowerCase.contains("sw")) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google."));
    }

    /* renamed from: reset */
    private void m101819x6761d4f() {
        this.f52161x5be0a1ad = "";
        this.f52160x91a6b3b0 = "";
        this.f52175xead1904e = false;
        this.f52158x29f719ac = false;
        this.f52176x3c5d7328 = false;
        this.f52173xd9b9e90b = false;
        this.f52172xb437a878 = null;
        this.f52159x5ea1ea79 = null;
        this.f52170x6829fdf4 = 0;
        this.f52166xd76ec48c = 30.0f;
        this.f52164xcba736e9 = 30.0f;
        this.f52171x17dd56c2 = 1280;
        this.f52165xc9fe87ab = 720;
        this.f52168xe27b2de5 = 1280;
        this.f52167x531b94e8 = 720;
        this.f52169xc2a6662e = 48000;
        this.f52162x3fd1c989 = f52150x6ae4ea34;
        this.f52163xce868954 = 2;
    }

    /* renamed from: getColorFormats */
    public int[] m101820xbf947cef() {
        return this.f52159x5ea1ea79;
    }

    /* renamed from: getDecoderLumaHeight */
    public int m101821x150b0b12() {
        return this.f52167x531b94e8;
    }

    /* renamed from: getDecoderLumaWidth */
    public int m101822x330f4a7b() {
        return this.f52168xe27b2de5;
    }

    /* renamed from: getDecoderMaxFrameRate */
    public float m101823x7e3dce17() {
        return this.f52164xcba736e9;
    }

    /* renamed from: getDecoderMaxFrameRateForMaxLuma */
    public float m101824xebeca4cf() {
        return this.f52166xd76ec48c;
    }

    /* renamed from: getDecoderMaxHeight */
    public int m101825xc5bcef3d() {
        return this.f52165xc9fe87ab;
    }

    /* renamed from: getDecoderMaxWidth */
    public int m101826x59cab4f0() {
        return this.f52171x17dd56c2;
    }

    /* renamed from: getDecoderMimeType */
    public java.lang.String m101827xeef34bbc() {
        return this.f52160x91a6b3b0;
    }

    /* renamed from: getDecoderName */
    public java.lang.String m101828x21f31fb9() {
        return this.f52161x5be0a1ad;
    }

    /* renamed from: getMaxAudioBitRate */
    public int m101829x2e58e425() {
        return this.f52162x3fd1c989;
    }

    /* renamed from: getMaxAudioChannels */
    public int m101830xb0e2c238() {
        return this.f52163xce868954;
    }

    /* renamed from: getMaxAudioSampleRate */
    public int m101831x7ed7f612() {
        return this.f52169xc2a6662e;
    }

    /* renamed from: getMaxProfileLevel */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel m101832xdaee98a9() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel decoderProfileLevel = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel(0, 0);
        int i17 = 0;
        for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel decoderProfileLevel2 : this.f52172xb437a878) {
            int i18 = decoderProfileLevel2.f52177x6219b84;
            if (i18 >= i17) {
                decoderProfileLevel = decoderProfileLevel2;
                i17 = i18;
            }
        }
        return decoderProfileLevel;
    }

    /* renamed from: getProfileLevels */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26307xa598bb2a.DecoderProfileLevel[] m101834x719764c2() {
        return this.f52172xb437a878;
    }

    /* renamed from: isAudio */
    public boolean m101835x7a7648cc() {
        java.lang.String str = this.f52160x91a6b3b0;
        if (str == null) {
            return false;
        }
        return str.startsWith("audio/");
    }

    /* renamed from: isAudioSofwareDecoder */
    public boolean m101836x82cc6329() {
        return this.f52174xe05c0713;
    }

    /* renamed from: isSecureDecoder */
    public boolean m101837xaaabbbc3() {
        return this.f52173xd9b9e90b;
    }

    /* renamed from: isValidDecoder */
    public boolean m101838xfb53f2f2() {
        if (m101839x7b98c171()) {
            return !this.f52175xead1904e || f52157x42d8e678.contains(this.f52161x5be0a1ad);
        }
        if (m101835x7a7648cc()) {
            return this.f52174xe05c0713 || f52156x5d0ee0c.contains(this.f52161x5be0a1ad);
        }
        return false;
    }

    /* renamed from: isVideo */
    public boolean m101839x7b98c171() {
        java.lang.String str = this.f52160x91a6b3b0;
        if (str == null) {
            return false;
        }
        return str.startsWith("video/");
    }

    /* renamed from: isVideoSofwareDecoder */
    public boolean m101840xa4a8570e() {
        return this.f52175xead1904e;
    }

    /* renamed from: getMaxSupportedInstances */
    public int m101833x73d5d03e() {
        return this.f52170x6829fdf4;
    }
}
