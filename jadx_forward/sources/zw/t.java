package zw;

/* loaded from: classes10.dex */
public abstract class t {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3 = r5.getInteger("frame-rate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float a(java.lang.String r8) {
        /*
            java.lang.String r0 = "frame-rate"
            java.lang.String r1 = "MicroMsg.BizRemuxHelper"
            gp.c r2 = new gp.c
            r2.<init>()
            r3 = 0
            r2.k(r8)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r8 = r2.d()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4 = r3
        L12:
            if (r4 >= r8) goto L37
            android.media.MediaFormat r5 = r2.e(r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.String r6 = "mime"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.String r7 = "video/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r6 == 0) goto L34
            boolean r6 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r6 == 0) goto L34
            int r8 = r5.getInteger(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3 = r8
            goto L37
        L34:
            int r4 = r4 + 1
            goto L12
        L37:
            r2.g()
            goto L46
        L3b:
            r8 = move-exception
            goto L58
        L3d:
            r8 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r4)     // Catch: java.lang.Throwable -> L3b
            goto L37
        L46:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "getVideoFrameRate fps: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r8)
            float r8 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r0
            return r8
        L58:
            r2.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.t.a(java.lang.String):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.t.b(java.lang.String):java.lang.String");
    }
}
