package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.ExportErrorStatus */
/* loaded from: classes16.dex */
public class C25680x8a5723a6 {

    /* renamed from: APPEND_BUFFER */
    public static final int f47480x3193f105 = -110;

    /* renamed from: APPEND_VIDEO_SAMPLE_MAKE_CURRENT */
    public static final int f47481xdbfe21b4 = -111;

    /* renamed from: APPEND_VIDEO_SAMPLE_SWAP_BUFFERS */
    public static final int f47482x744cef13 = -113;

    /* renamed from: AUDIO_CONFIGURE */
    public static final int f47483x6bc9657d = -104;

    /* renamed from: AUDIO_DECODER */
    public static final int f47484x275a6c9b = -202;

    /* renamed from: AUDIO_DECODE_FRAME */
    public static final int f47485xcef7eda5 = -212;

    /* renamed from: AUDIO_ENCODER_NOT_READY_TIME_OUT */
    public static final int f47486x43cba350 = -131;

    /* renamed from: AUDIO_FRAME_HANDLE_TIMEOUT */
    public static final int f47487xc509845 = -204;

    /* renamed from: AUDIO_FRAME_HANDLE_TIMEOUT_INTERRUPT */
    public static final int f47488x3f6afec9 = -207;

    /* renamed from: END_WRITE_AUDIO_SAMPLE */
    public static final int f47489x982f74d7 = -124;

    /* renamed from: END_WRITE_VIDEO_SAMPLE */
    public static final int f47490xedf7e892 = -123;

    /* renamed from: ERROR_CODE_AUDIO_EXPORTING */
    public static final int f47491xadf5fdea = -15;

    /* renamed from: ERROR_CODE_VIDEO_EXPORTING */
    public static final int f47492x57c9ac4f = -14;

    /* renamed from: ERROR_FINISHING */
    public static final int f47493x78d200b8 = -10;

    /* renamed from: EXPORT_CANCEL */
    public static final int f47494x83cec565 = -11;

    /* renamed from: EXPORT_SUCCESS */
    public static final int f47495x65f38658 = 0;

    /* renamed from: RELEASE_ERROR */
    public static final int f47496xc0092790 = -209;

    /* renamed from: RENDER_SAMPLE_BUFFER */
    public static final int f47497xdb6f518c = -112;

    /* renamed from: START_AUDIO_ENCODER */
    public static final int f47498xa2df4836 = -102;

    /* renamed from: START_VIDEO_ENCODER */
    public static final int f47499x6254bdb = -101;

    /* renamed from: VIDEO_CONFIGURE */
    public static final int f47500x159d13e2 = -103;

    /* renamed from: VIDEO_DECODER */
    public static final int f47501x8aa07040 = -201;

    /* renamed from: VIDEO_DECODE_FRAME */
    public static final int f47502xbf8b6920 = -211;

    /* renamed from: VIDEO_ENCODER_NOT_READY_TIME_OUT */
    public static final int f47503xcf97eb8b = -130;

    /* renamed from: VIDEO_FRAME_HANDLE_TIMEOUT */
    public static final int f47504xd81a68c0 = -203;

    /* renamed from: VIDEO_FRAME_HANDLE_TIMEOUT_INTERRUPT */
    public static final int f47505xff12b184 = -206;

    /* renamed from: VIDEO_MUXER_ERROR */
    public static final int f47506x144595a2 = -205;

    /* renamed from: WRITE_AUDIO_SAMPLE */
    public static final int f47507xa65222d3 = -122;

    /* renamed from: WRITE_AUDIO_SAMPLE_TIMEOUT */
    public static final int f47508xe8821fd5 = -208;

    /* renamed from: WRITE_VIDEO_SAMPLE */
    public static final int f47509xfc1a968e = -121;

    /* renamed from: code */
    public int f47510x2eaded;

    /* renamed from: indicatorInfo */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb f47511xec76f75d;
    public java.lang.String msg;

    /* renamed from: throwable */
    public java.lang.Throwable f47512xb5275940;

    public C25680x8a5723a6(int i17) {
        this(i17, null);
    }

    /* renamed from: getErrCode */
    private static int m96767xe591acbc(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d) {
        int m97204xfab0f3b7 = c25735x289c723d.m97204xfab0f3b7();
        return m97204xfab0f3b7 == 0 ? (int) c25735x289c723d.m97206x8311a768() : m97204xfab0f3b7;
    }

    /* renamed from: hardwareError */
    public static boolean m96768x11156d00(int i17) {
        return i17 == -101 || i17 == -102 || i17 == -103 || i17 == -104;
    }

    /* renamed from: toString */
    public java.lang.String m96769x9616526c() {
        return "ExportErrorStatus{code=" + this.f47510x2eaded + ", throwable=" + this.f47512xb5275940 + ", msg='" + this.msg + "', indicatorInfo=" + this.f47511xec76f75d + '}';
    }

    public C25680x8a5723a6(int i17, java.lang.Throwable th6, java.lang.String str, com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb) {
        this(i17, th6, str);
        this.f47511xec76f75d = c25719xdaa2a3bb;
    }

    public C25680x8a5723a6(int i17, java.lang.Throwable th6) {
        this(i17, th6, null);
    }

    public C25680x8a5723a6(int i17, java.lang.Throwable th6, java.lang.String str) {
        this.f47510x2eaded = i17;
        this.f47512xb5275940 = th6;
        this.msg = str;
    }

    public C25680x8a5723a6(com.p314xaae8f345.tav.p2957xa228aba5.C25735x289c723d c25735x289c723d) {
        this(m96767xe591acbc(c25735x289c723d), c25735x289c723d.m97207xb494ca8a(), c25735x289c723d.m97205xb588584b());
    }
}
