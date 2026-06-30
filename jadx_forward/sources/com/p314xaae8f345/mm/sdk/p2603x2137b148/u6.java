package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class u6 {
    public static java.io.OutputStream a(android.content.Context context, java.lang.String str) {
        android.net.Uri uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScopedStorageUtil", "#getFileOutputStream: " + str);
        java.io.OutputStream outputStream = null;
        if (uri != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.d7.a(context)) {
            try {
                java.io.OutputStream[] outputStreamArr = {null};
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b7.d(context, str, uri, new com.p314xaae8f345.mm.sdk.p2603x2137b148.w6(outputStreamArr));
                outputStream = outputStreamArr[0];
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "getMediaStoreOutputStream fail: " + e17.getMessage());
            }
        }
        if (outputStream != null) {
            return outputStream;
        }
        try {
            return com.p314xaae8f345.mm.vfs.w6.K(str, false);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScopedStorageUtil", "getFileOutputStream fail: " + e18.getMessage());
            return outputStream;
        }
    }

    public static void b(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b7.d(context, str, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new com.p314xaae8f345.mm.sdk.p2603x2137b148.s6(y6Var, str, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r6, java.lang.String r7, java.lang.String r8, android.net.Uri r9, com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#saveImage: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " >> "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ScopedStorageUtil"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r7)
            java.lang.String r2 = "src file not exist!"
            r3 = 0
            if (r0 != 0) goto L29
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2)
            return r3
        L29:
            r0 = 1
            if (r9 == 0) goto L67
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d7.a(r6)
            if (r4 == 0) goto L67
            java.lang.String r4 = "Try save with MediaStore"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)     // Catch: java.lang.Exception -> L50
            boolean[] r4 = new boolean[r0]     // Catch: java.lang.Exception -> L50
            r4[r3] = r3     // Catch: java.lang.Exception -> L50
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.j(r7)     // Catch: java.lang.Exception -> L50
            if (r5 != 0) goto L45
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2)     // Catch: java.lang.Exception -> L50
            goto L67
        L45:
            com.tencent.mm.sdk.platformtools.x6 r2 = new com.tencent.mm.sdk.platformtools.x6     // Catch: java.lang.Exception -> L50
            r2.<init>(r7, r4, r10)     // Catch: java.lang.Exception -> L50
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b7.d(r6, r8, r9, r2)     // Catch: java.lang.Exception -> L50
            boolean r6 = r4[r3]     // Catch: java.lang.Exception -> L50
            goto L68
        L50:
            r6 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "saveWithMediaStore fail: "
            r9.<init>(r10)
            java.lang.String r6 = r6.getMessage()
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r6)
        L67:
            r6 = r3
        L68:
            if (r6 != 0) goto L94
            java.lang.String r9 = "Try save with BIO"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)     // Catch: java.lang.Exception -> L7d
            long r7 = com.p314xaae8f345.mm.vfs.w6.d(r7, r8, r3)     // Catch: java.lang.Exception -> L7d
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L7a
            goto L7b
        L7a:
            r0 = r6
        L7b:
            r6 = r0
            goto L94
        L7d:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "saveWithBio fail: "
            r8.<init>(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r7)
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.u6.c(android.content.Context, java.lang.String, java.lang.String, android.net.Uri, com.tencent.mm.sdk.platformtools.y6):boolean");
    }
}
