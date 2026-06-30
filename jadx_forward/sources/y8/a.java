package y8;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f541323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f541324b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f541325c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f541326d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f541327e;

    /* renamed from: f, reason: collision with root package name */
    public final android.media.MediaCodecInfo.CodecCapabilities f541328f;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if ((t9.d0.f498031a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            r2.getClass()
            r1.f541323a = r2
            r1.f541327e = r3
            r1.f541328f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L27
            if (r4 == 0) goto L27
            int r5 = t9.d0.f498031a
            r0 = 19
            if (r5 < r0) goto L22
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r3
        L23:
            if (r5 == 0) goto L27
            r5 = r2
            goto L28
        L27:
            r5 = r3
        L28:
            r1.f541324b = r5
            r5 = 21
            if (r4 == 0) goto L41
            int r0 = t9.d0.f498031a
            if (r0 < r5) goto L3c
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L3c
            r0 = r2
            goto L3d
        L3c:
            r0 = r3
        L3d:
            if (r0 == 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r3
        L42:
            r1.f541325c = r0
            if (r6 != 0) goto L5b
            if (r4 == 0) goto L5a
            int r6 = t9.d0.f498031a
            if (r6 < r5) goto L56
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L56
            r4 = r2
            goto L57
        L56:
            r4 = r3
        L57:
            if (r4 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            r1.f541326d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.a.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public boolean a(int i17, int i18, double d17) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.f541328f;
        if (codecCapabilities == null) {
            int i19 = t9.d0.f498031a;
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            int i27 = t9.d0.f498031a;
            return false;
        }
        if ((d17 == -1.0d || d17 <= 0.0d) ? videoCapabilities.isSizeSupported(i17, i18) : videoCapabilities.areSizeAndRateSupported(i17, i18, d17)) {
            return true;
        }
        if (i17 < i18) {
            if ((d17 == -1.0d || d17 <= 0.0d) ? videoCapabilities.isSizeSupported(i18, i17) : videoCapabilities.areSizeAndRateSupported(i18, i17, d17)) {
                int i28 = t9.d0.f498031a;
                return true;
            }
        }
        int i29 = t9.d0.f498031a;
        return false;
    }
}
