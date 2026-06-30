package com.tencent.maas.utils;

/* loaded from: classes5.dex */
public class MJAudioPCMExtractor {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f48567a = {3, 2, 4};

    /* loaded from: classes5.dex */
    public interface OnComplete {
        boolean onComplete(java.nio.ByteBuffer byteBuffer, boolean z17);
    }

    /* loaded from: classes5.dex */
    public interface OnProgress {
        void onProgress(float f17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r7 != 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer a(java.io.File r6, int r7, int r8, int r9, com.tencent.maas.model.time.MJTimeRange r10) {
        /*
            int[] r0 = com.tencent.maas.utils.MJAudioPCMExtractor.f48567a
            r1 = 0
            r2 = r1
        L4:
            r3 = 1
            r4 = 3
            if (r2 >= r4) goto L11
            r5 = r0[r2]
            if (r5 != r7) goto Le
            r0 = r3
            goto L12
        Le:
            int r2 = r2 + 1
            goto L4
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L47
            if (r8 < r3) goto L3f
            r0 = 2
            if (r8 > r0) goto L3f
            boolean r2 = r6.exists()
            if (r2 == 0) goto L39
            boolean r2 = r6.isFile()
            if (r2 == 0) goto L39
            if (r7 == r0) goto L2f
            if (r7 == r4) goto L2d
            r0 = 4
            if (r7 == r0) goto L2f
            goto L30
        L2d:
            r1 = r3
            goto L30
        L2f:
            r1 = r0
        L30:
            java.lang.String r6 = r6.getAbsolutePath()
            java.nio.ByteBuffer r6 = nativeExtractAudioPCM(r1, r8, r9, r10, r6)
            return r6
        L39:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L3f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "channel count not support"
            r6.<init>(r7)
            throw r6
        L47:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "encoding not support"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.utils.MJAudioPCMExtractor.a(java.io.File, int, int, int, com.tencent.maas.model.time.MJTimeRange):java.nio.ByteBuffer");
    }

    public static boolean b(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17, int i18, int i19, com.tencent.maas.utils.MJAudioPCMExtractor.OnProgress onProgress, com.tencent.maas.utils.MJAudioPCMExtractor.OnComplete onComplete) {
        return nativeExtractAudioPCM2(str, mJTimeRange, i17, i18, i19, onProgress, onComplete);
    }

    private static native java.nio.ByteBuffer nativeExtractAudioPCM(int i17, int i18, int i19, com.tencent.maas.model.time.MJTimeRange mJTimeRange, java.lang.String str);

    private static native boolean nativeExtractAudioPCM2(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17, int i18, int i19, com.tencent.maas.utils.MJAudioPCMExtractor.OnProgress onProgress, com.tencent.maas.utils.MJAudioPCMExtractor.OnComplete onComplete);
}
