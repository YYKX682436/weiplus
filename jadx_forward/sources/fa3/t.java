package fa3;

/* loaded from: classes10.dex */
public abstract class t {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r3 = r5.getInteger("frame-rate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float a(java.lang.String r8) {
        /*
            java.lang.String r0 = "frame-rate"
            java.lang.String r1 = "MicroMsg.LiteAppRemuxHelper"
            gp.c r2 = new gp.c
            r2.<init>()
            r3 = 0
            r2.k(r8)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            int r8 = r2.d()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r4 = r3
        L12:
            if (r4 >= r8) goto L36
            android.media.MediaFormat r5 = r2.e(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r6 = "mime"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r7 = "video/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            if (r6 == 0) goto L33
            boolean r6 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            if (r6 == 0) goto L33
            int r8 = r5.getInteger(r0)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r3 = r8
            goto L36
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            r2.g()
            goto L45
        L3a:
            r8 = move-exception
            goto L57
        L3c:
            r8 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r4)     // Catch: java.lang.Throwable -> L3a
            goto L36
        L45:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "getVideoFrameRate fps: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r8)
            float r8 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r0
            return r8
        L57:
            r2.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.t.a(java.lang.String):float");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.t.b(java.lang.String):java.lang.String");
    }
}
