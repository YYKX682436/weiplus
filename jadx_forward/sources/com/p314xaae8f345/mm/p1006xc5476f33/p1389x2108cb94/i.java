package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes12.dex */
public abstract class i {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "MicroMsg.exp.Expansions"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            r5 = 0
            long r7 = r2.size()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            r3 = r1
            r4 = r2
            r3.transferFrom(r4, r5, r7)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            long r10 = r2.size()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L30
            r2.close()     // Catch: java.io.IOException -> L27
        L27:
            r1.close()     // Catch: java.io.IOException -> L2a
        L2a:
            return r10
        L2b:
            r10 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L6f
        L30:
            r3 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L3a
        L35:
            r10 = move-exception
            r2 = r1
            goto L6f
        L38:
            r3 = move-exception
            r2 = r1
        L3a:
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r3, r4, r6)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "file op copyFile e type:%s, e msg:%s, src:%s, dest:%s"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6e
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = r7.getSimpleName()     // Catch: java.lang.Throwable -> L6e
            r6[r5] = r7     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L6e
            r5 = 1
            r6[r5] = r3     // Catch: java.lang.Throwable -> L6e
            r3 = 2
            r6[r3] = r10     // Catch: java.lang.Throwable -> L6e
            r10 = 3
            r6[r10] = r11     // Catch: java.lang.Throwable -> L6e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r4, r6)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.io.IOException -> L66
        L66:
            if (r2 == 0) goto L6b
            r2.close()     // Catch: java.io.IOException -> L6b
        L6b:
            r10 = -1
            return r10
        L6e:
            r10 = move-exception
        L6f:
            if (r1 == 0) goto L74
            r1.close()     // Catch: java.io.IOException -> L74
        L74:
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.io.IOException -> L79
        L79:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i.a(java.lang.String, java.lang.String):long");
    }
}
