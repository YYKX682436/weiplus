package com.tencent.mm.feature.sight.api;

/* loaded from: classes10.dex */
public interface ISightJNIService extends i95.m {
    public static final int MMSIGHT_YUV420P = 2;
    public static final int MMSIGHT_YUV420SP = 1;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_SURFACE = 0;

    void addReportMetadata(java.lang.String str, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams, int i17, int i18);

    java.lang.String calcVideoRangeTs(java.lang.String str, double d17, long j17);

    int drawFrame(int i17, android.graphics.Bitmap bitmap, int i18, android.graphics.Bitmap bitmap2, boolean z17, boolean z18);

    int drawScaledFrame(int i17, android.graphics.Bitmap bitmap, int i18, int i19);

    int drawSurfaceColor(android.view.Surface surface, int i17);

    int drawSurfaceFrame(int i17, android.view.Surface surface, int i18, android.graphics.Bitmap bitmap, boolean z17);

    int drawSurfaceThumb(android.view.Surface surface, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2);

    int freeAll();

    int freeObj(int i17);

    int getMp4RotateVFS(java.lang.String str);

    java.lang.String getSimpleMp4InfoVFS(java.lang.String str);

    double getVideoDuration(int i17);

    int getVideoHeight(int i17);

    java.lang.String getVideoInfo(int i17);

    double getVideoPlayTime(int i17);

    double getVideoRate(int i17);

    double getVideoStartTime(int i17);

    int getVideoWidth(int i17);

    int handleThumb(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3);

    boolean isH265VideoVFS(java.lang.String str);

    void mirrorCameraData(byte[] bArr, int i17, int i18, boolean z17);

    int openFileVFS(java.lang.String str, int i17, int i18, boolean z17);

    boolean optimizeMP4VFS(java.lang.String str);

    void removeVideoMetadata(java.lang.String str, boolean z17, boolean z18);

    int remuxingVFS(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39);

    int seekStream(double d17, int i17);

    int seekStreamWithFlag(double d17, int i17, int i18);

    int shouldRemuxingVFS(java.lang.String str, int i17, int i18, int i19, double d17, int i27);
}
