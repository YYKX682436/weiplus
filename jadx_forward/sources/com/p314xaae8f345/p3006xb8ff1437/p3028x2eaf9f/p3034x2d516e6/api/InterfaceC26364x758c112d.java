package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener */
/* loaded from: classes16.dex */
public interface InterfaceC26364x758c112d {

    /* renamed from: MESSAGE_FLV_PRELOAD_STATUS */
    public static final int f52709x40a97e2f = 5;

    /* renamed from: MESSAGE_HTTP_HEADER */
    public static final int f52710xffdaf1cc = 3;

    /* renamed from: MESSAGE_MULTI_NETWORK_LOW_SPEED */
    public static final int f52711x2324a06d = 10;

    /* renamed from: MESSAGE_MULTI_NETWORK_STATUS */
    public static final int f52712x7630081 = 11;

    /* renamed from: MESSAGE_NOTIFY_M3U8_CONTENT */
    public static final int f52713xfa7ff581 = 4;

    /* renamed from: MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION */
    public static final int f52714x4846653e = 2;

    /* renamed from: MESSAGE_PLAY_VIDEO_NO_MORE_CACHE */
    public static final int f52715xb3cd9e1f = 1;

    /* renamed from: MESSAGE_QUIC_DOWNLOAD_STATUS */
    public static final int f52716x48b4e8e0 = 6;

    /* renamed from: MESSAGE_TAB_TESTID */
    public static final int f52717xbfc0688f = 8;

    /* renamed from: MSG_M3U8_REFRESH */
    public static final int f52718x9f8c7b23 = 9;

    /* renamed from: getAdvRemainTime */
    long mo102271x7dd980b6();

    /* renamed from: getContentType */
    java.lang.String mo102272xc2a49a1d(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: getCurrentPlayClipNo */
    int mo102273xce1eb728();

    /* renamed from: getCurrentPlayOffset */
    long mo102274xe243028a();

    /* renamed from: getCurrentPosition */
    long mo102275x9746038c();

    /* renamed from: getDataFilePath */
    java.lang.String mo102276x84354c01(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: getDataTotalSize */
    long mo102277x2f5bd925(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: getM3U8Content */
    java.lang.String mo102278x79c2649a(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: getPlayInfo */
    java.lang.Object mo102279xebd0e778(long j17);

    /* renamed from: getPlayInfo */
    java.lang.Object mo102280xebd0e778(java.lang.String str);

    /* renamed from: getPlayerBufferLength */
    long mo102281xe15692bd();

    /* renamed from: onDownloadCdnUrlExpired */
    void mo102282x61548e7c(java.util.Map<java.lang.String, java.lang.String> map);

    /* renamed from: onDownloadCdnUrlInfoUpdate */
    void mo102283x73241460(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: onDownloadCdnUrlUpdate */
    void mo102284xe42c8a92(java.lang.String str);

    /* renamed from: onDownloadError */
    void mo102285x338612c1(int i17, int i18, java.lang.String str);

    /* renamed from: onDownloadFinish */
    void mo102286x3e7062fa();

    /* renamed from: onDownloadProgressUpdate */
    void mo102287x32d250bd(int i17, int i18, long j17, long j18, java.lang.String str);

    /* renamed from: onDownloadProtocolUpdate */
    void mo102288xab39e0e8(java.lang.String str, java.lang.String str2);

    /* renamed from: onDownloadStatusUpdate */
    void mo102289xe40fe482(int i17);

    /* renamed from: onPlayCallback */
    java.lang.Object mo102290x41392718(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4);

    /* renamed from: onReadData */
    int mo102291x715d255f(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    /* renamed from: onStartReadData */
    int mo102292x6e58d43(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    /* renamed from: onStopReadData */
    int mo102293xfb96d801(int i17, java.lang.String str, java.lang.String str2, int i18);
}
