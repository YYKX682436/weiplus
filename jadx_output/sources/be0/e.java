package be0;

@j95.b
/* loaded from: classes10.dex */
public class e extends i95.w implements com.tencent.mm.feature.sight.api.o, com.tencent.mm.feature.sight.api.ISightJNIService, com.tencent.mm.feature.sight.api.n {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19449d;

    public com.tencent.mm.plugin.sight.base.b Ai(java.lang.String str) {
        return com.tencent.mm.plugin.sight.base.f.f162410a.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[Catch: all -> 0x0113, TryCatch #1 {, blocks: (B:4:0x0020, B:6:0x0026, B:12:0x0034, B:31:0x0069, B:32:0x0080, B:34:0x0086, B:36:0x0092), top: B:3:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[Catch: all -> 0x0113, TryCatch #1 {, blocks: (B:4:0x0020, B:6:0x0026, B:12:0x0034, B:31:0x0069, B:32:0x0080, B:34:0x0086, B:36:0x0092), top: B:3:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be0.e.Bi(java.lang.String):boolean");
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public void addReportMetadata(java.lang.String str, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams, int i17, int i18) {
        com.tencent.mm.plugin.sight.base.SightVideoJNI.addReportMetadata(str, aBAPrams, i17, i18);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public java.lang.String calcVideoRangeTs(java.lang.String str, double d17, long j17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.nativeCalcAllVideoRangeTs(str, d17, j17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int drawFrame(int i17, android.graphics.Bitmap bitmap, int i18, android.graphics.Bitmap bitmap2, boolean z17, boolean z18) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.drawFrame(i17, bitmap, i18, bitmap2, z17, z18);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int drawScaledFrame(int i17, android.graphics.Bitmap bitmap, int i18, int i19) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.drawScaledFrame(i17, bitmap, i18, i19);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int drawSurfaceColor(android.view.Surface surface, int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.drawSurfaceColor(surface, i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int drawSurfaceFrame(int i17, android.view.Surface surface, int i18, android.graphics.Bitmap bitmap, boolean z17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.drawSurfaceFrame(i17, surface, i18, bitmap, z17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int drawSurfaceThumb(android.view.Surface surface, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.drawSurfaceThumb(surface, bitmap, bitmap2);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int freeAll() {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.freeAll();
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int freeObj(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.freeObj(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int getMp4RotateVFS(java.lang.String str) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(str);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public java.lang.String getSimpleMp4InfoVFS(java.lang.String str) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(str);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public double getVideoDuration(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoDuration(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int getVideoHeight(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoHeight(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public java.lang.String getVideoInfo(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoInfo(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public double getVideoPlayTime(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoPlayTime(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public double getVideoRate(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoRate(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public double getVideoStartTime(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoStartTime(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int getVideoWidth(int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.getVideoWidth(i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int handleThumb(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.handleThumb(bitmap, bitmap2, bitmap3);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public boolean isH265VideoVFS(java.lang.String str) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.isH265VideoVFS(str);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public void mirrorCameraData(byte[] bArr, int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(bArr, i17, i18, z17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int openFileVFS(java.lang.String str, int i17, int i18, boolean z17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.openFileVFS(str, i17, i18, z17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public boolean optimizeMP4VFS(java.lang.String str) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(str);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public void removeVideoMetadata(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sight.base.SightVideoJNI.removeVideoMetadata(str, z17, z18);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int remuxingVFS(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, byte[] bArr, int i37, boolean z17, int i38, int i39) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.remuxingVFS(str, str2, i17, i18, i19, i27, i28, i29, f17, f18, bArr, i37, z17, i38, i39);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int seekStream(double d17, int i17) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.seekStream(d17, i17);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int seekStreamWithFlag(double d17, int i17, int i18) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.seekStreamWithFlag(d17, i17, i18);
    }

    @Override // com.tencent.mm.feature.sight.api.ISightJNIService
    public int shouldRemuxingVFS(java.lang.String str, int i17, int i18, int i19, double d17, int i27) {
        return com.tencent.mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(str, i17, i18, i19, d17, i27);
    }

    public void wi() {
        synchronized (mq1.w0.class) {
            if (!f19449d) {
                i95.n0.c(mq1.w0.class);
                f19449d = true;
            }
        }
    }
}
