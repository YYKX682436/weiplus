package com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api;

/* renamed from: com.tencent.mm.feature.sight.api.ISightJNIService */
/* loaded from: classes10.dex */
public interface InterfaceC10689xe9fde544 extends i95.m {

    /* renamed from: MMSIGHT_YUV420P */
    public static final int f28932xa9dc2676 = 2;

    /* renamed from: MMSIGHT_YUV420SP */
    public static final int f28933x91a8a8f7 = 1;

    /* renamed from: TYPE_BITMAP */
    public static final int f28934x33e2a5d4 = 1;

    /* renamed from: TYPE_SURFACE */
    public static final int f28935xe016cc88 = 0;

    /* renamed from: addReportMetadata */
    void mo10209x769d784(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025, int i17, int i18);

    /* renamed from: calcVideoRangeTs */
    java.lang.String mo10210x9197296(java.lang.String str, double d17, long j17);

    /* renamed from: drawFrame */
    int mo10211x75e3689(int i17, android.graphics.Bitmap bitmap, int i18, android.graphics.Bitmap bitmap2, boolean z17, boolean z18);

    /* renamed from: drawScaledFrame */
    int mo10212xeeb6094f(int i17, android.graphics.Bitmap bitmap, int i18, int i19);

    /* renamed from: drawSurfaceColor */
    int mo10213x7d50f21a(android.view.Surface surface, int i17);

    /* renamed from: drawSurfaceFrame */
    int mo10214x7d7c6c24(int i17, android.view.Surface surface, int i18, android.graphics.Bitmap bitmap, boolean z17);

    /* renamed from: drawSurfaceThumb */
    int mo10215x7e3d748d(android.view.Surface surface, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2);

    /* renamed from: freeAll */
    int mo10216xdc024395();

    /* renamed from: freeObj */
    int mo10217xdc0276eb(int i17);

    /* renamed from: getMp4RotateVFS */
    int mo10218x9787f6ed(java.lang.String str);

    /* renamed from: getSimpleMp4InfoVFS */
    java.lang.String mo10219xa23d6ecc(java.lang.String str);

    /* renamed from: getVideoDuration */
    double mo10220x36bbd779(int i17);

    /* renamed from: getVideoHeight */
    int mo10221x463504c(int i17);

    /* renamed from: getVideoInfo */
    java.lang.String mo10222x4edba913(int i17);

    /* renamed from: getVideoPlayTime */
    double mo10223x1d732206(int i17);

    /* renamed from: getVideoRate */
    double mo10224x4edf9145(int i17);

    /* renamed from: getVideoStartTime */
    double mo10225x828f3d0a(int i17);

    /* renamed from: getVideoWidth */
    int mo10226x8d5c7601(int i17);

    /* renamed from: handleThumb */
    int mo10227x5864ec8e(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3);

    /* renamed from: isH265VideoVFS */
    boolean mo10228x8998e7bb(java.lang.String str);

    /* renamed from: mirrorCameraData */
    void mo10229x53f0f18e(byte[] bArr, int i17, int i18, boolean z17);

    /* renamed from: openFileVFS */
    int mo10230xc14e3efd(java.lang.String str, int i17, int i18, boolean z17);

    /* renamed from: optimizeMP4VFS */
    boolean mo10231x922a682f(java.lang.String str);

    /* renamed from: removeVideoMetadata */
    void mo10232xd68876a6(java.lang.String str, boolean z17, boolean z18);

    /* renamed from: remuxingVFS */
    int mo10233xcf34d77e(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39);

    /* renamed from: seekStream */
    int mo10234xe8495018(double d17, int i17);

    /* renamed from: seekStreamWithFlag */
    int mo10235xa4256d8a(double d17, int i17, int i18);

    /* renamed from: shouldRemuxingVFS */
    int mo10236xe35aebcb(java.lang.String str, int i17, int i18, int i19, double d17, int i27);
}
