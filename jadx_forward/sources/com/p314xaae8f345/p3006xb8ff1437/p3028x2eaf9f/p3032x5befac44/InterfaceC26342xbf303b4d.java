package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44;

/* renamed from: com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder */
/* loaded from: classes14.dex */
public interface InterfaceC26342xbf303b4d {

    /* renamed from: BOOL_DISABLE_MEDIA_CODEC_DOLBY_VISION_COMPONENT */
    public static final int f52481x41eeebbd = 6;

    /* renamed from: BOOL_ENABLE_ASYNC_MODE */
    public static final int f52482x80132bcd = 1;

    /* renamed from: BOOL_ENABLE_DEFAULT_CODEC_FOR_DOLBY */
    public static final int f52483x4a6d1034 = 299;

    /* renamed from: BOOL_ENABLE_HDR_CUSTOM_RENDER */
    public static final int f52484x235e4074 = 99;

    /* renamed from: BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA */
    public static final int f52485x519179c2 = 5;

    /* renamed from: BOOL_ENABLE_MEDIACODEC_RELEASE_OUTPUTBUFFER_WITH_TIMESTAMP */
    public static final int f52486x8da3a77d = 7;

    /* renamed from: BOOL_ENABLE_MEDIACODEC_REUSE */
    public static final int f52487x3d4ad76e = 4;

    /* renamed from: BOOL_ENABLE_SET_OUTPUT_SURFACE_API */
    public static final int f52488x79f103ce = 0;

    /* renamed from: BOOL_SET_IS_ADTS */
    public static final int f52489x392c7705 = 2;

    /* renamed from: BOOL_SET_IS_AUDIO_PASSTHROUGH */
    public static final int f52490xb96ca628 = 3;

    /* renamed from: BYTES_SET_CSD0_DATA */
    public static final int f52491x5e21a07c = 200;

    /* renamed from: BYTES_SET_CSD1_DATA */
    public static final int f52492x5fd6791b = 201;

    /* renamed from: BYTES_SET_CSD2_DATA */
    public static final int f52493x618b51ba = 202;

    /* renamed from: INT_ENABLE_RENDERER_SHARPEN */
    public static final int f52494x9d437d43 = 100;

    /* renamed from: OBJECT_SET_MEDIA_CRYPTO */
    public static final int f52495xf8a85b79 = 300;

    /* renamed from: STRING_SHARPEN_SHADER_PATH */
    public static final int f52496x84d71ec5 = 101;

    /* renamed from: TP_CODEC_RETURN_CODE_EOS */
    public static final int f52497x9ad441fa = 2;

    /* renamed from: TP_CODEC_RETURN_CODE_ERROR */
    public static final int f52498x36cd0eb9 = 3;

    /* renamed from: TP_CODEC_RETURN_CODE_INTERNAL_RESET */
    public static final int f52499xa115237c = 4;

    /* renamed from: TP_CODEC_RETURN_CODE_OK */
    public static final int f52500x70596eab = 0;

    /* renamed from: TP_CODEC_RETURN_CODE_TRY_AGAIN */
    public static final int f52501x149267ed = 1;

    /* renamed from: TP_ERROR_DECODE_FAILED */
    public static final int f52502xc111cf54 = 103;

    /* renamed from: TP_ERROR_FLUSH_FAILED */
    public static final int f52503x50cab592 = 104;

    /* renamed from: TP_ERROR_INVALID_CODECPAR */
    public static final int f52504x47fb44cd = 100;

    /* renamed from: TP_ERROR_NO_CODEC */
    public static final int f52505xe27d0892 = 101;

    /* renamed from: TP_ERROR_OPEN_FAILED */
    public static final int f52506xf6c908f8 = 102;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder$MediaCodecReturnCode */
    /* loaded from: classes6.dex */
    public @interface MediaCodecReturnCode {
    }

    /* renamed from: decode */
    int mo102033xb06291ee(byte[] bArr, boolean z17, long j17, boolean z18);

    /* renamed from: dequeueOutputBuffer */
    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3032x5befac44.C26344xc9e9249f mo102034x436dd5f1();

    /* renamed from: flush */
    int mo102035x5d03b04();

    /* renamed from: initDecoder */
    boolean mo102036xaa9e0d14(java.lang.String str, int i17, int i18, int i19, int i27);

    /* renamed from: initDecoder */
    boolean mo102037xaa9e0d14(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface, int i27, int i28, int i29);

    /* renamed from: release */
    int mo102038x41012807();

    /* renamed from: releaseOutputBuffer */
    int mo102039xab26be48(int i17, boolean z17, long j17);

    /* renamed from: setCryptoInfo */
    void mo102040xa59e8711(int i17, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i18, int i19, int i27);

    /* renamed from: setOperateRate */
    int mo102041x77b122c2(float f17);

    /* renamed from: setOutputSurface */
    int mo102042x610a9b2a(android.view.Surface surface);

    /* renamed from: setParamBool */
    boolean mo102043xd02fead5(int i17, boolean z17);

    /* renamed from: setParamBytes */
    boolean mo102044x35d20de0(int i17, byte[] bArr);

    /* renamed from: setParamInt */
    boolean mo102045xbc64bea4(int i17, int i18);

    /* renamed from: setParamLong */
    boolean mo102046xd0347667(int i17, long j17);

    /* renamed from: setParamObject */
    boolean mo102047x9956046a(int i17, java.lang.Object obj);

    /* renamed from: setParamString */
    boolean mo102048xa12ac13c(int i17, java.lang.String str);

    /* renamed from: setSharpenSwitch */
    int mo102049xf1aeb5e5();

    /* renamed from: signalEndOfStream */
    int mo102050x4eaf2e6a();

    /* renamed from: startDecoder */
    boolean mo102051x53ec2d82();

    /* renamed from: switchHdrModeWithSurface */
    int mo102052x40944be2(android.view.Surface surface, int i17);
}
