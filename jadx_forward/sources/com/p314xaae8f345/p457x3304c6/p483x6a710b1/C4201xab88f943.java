package com.p314xaae8f345.p457x3304c6.p483x6a710b1;

/* renamed from: com.tencent.maas.utils.MJAudioPCMExtractor */
/* loaded from: classes5.dex */
public class C4201xab88f943 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f130100a = {3, 2, 4};

    /* renamed from: com.tencent.maas.utils.MJAudioPCMExtractor$OnComplete */
    /* loaded from: classes5.dex */
    public interface OnComplete {
        /* renamed from: onComplete */
        boolean mo34696x815f5438(java.nio.ByteBuffer byteBuffer, boolean z17);
    }

    /* renamed from: com.tencent.maas.utils.MJAudioPCMExtractor$OnProgress */
    /* loaded from: classes5.dex */
    public interface OnProgress {
        /* renamed from: onProgress */
        void mo34697x696ee52c(float f17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r7 != 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer a(java.io.File r6, int r7, int r8, int r9, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 r10) {
        /*
            int[] r0 = com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.f130100a
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
            java.nio.ByteBuffer r6 = m34694x149987ae(r1, r8, r9, r10, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.a(java.io.File, int, int, int, com.tencent.maas.model.time.MJTimeRange):java.nio.ByteBuffer");
    }

    public static boolean b(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, int i17, int i18, int i19, com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.OnProgress onProgress, com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.OnComplete onComplete) {
        return m34695x7e976e44(str, c4129xdee64553, i17, i18, i19, onProgress, onComplete);
    }

    /* renamed from: nativeExtractAudioPCM */
    private static native java.nio.ByteBuffer m34694x149987ae(int i17, int i18, int i19, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, java.lang.String str);

    /* renamed from: nativeExtractAudioPCM2 */
    private static native boolean m34695x7e976e44(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, int i17, int i18, int i19, com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.OnProgress onProgress, com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.OnComplete onComplete);
}
