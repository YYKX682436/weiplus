package org.p3363xbe4143f1;

/* loaded from: classes12.dex */
abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:56:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r7) {
        /*
            byte[] r0 = org.p3363xbe4143f1.C29689x715d3c0f.m154710xd01e6c52(r7)
            if (r0 == 0) goto La
            int r1 = r0.length
            if (r1 <= 0) goto La
            return r0
        La:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L62
            java.lang.String r3 = "GET"
            r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r2.connect()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            int r3 = r3 / 100
            r4 = 2
            if (r3 == r4) goto L33
            r0.close()     // Catch: java.lang.Exception -> L2f
        L2f:
            r2.disconnect()
            return r1
        L33:
            java.io.InputStream r3 = r2.getInputStream()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L76
        L3b:
            int r5 = r3.read(r4)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L76
            r6 = -1
            if (r5 == r6) goto L47
            r6 = 0
            r0.write(r4, r6, r5)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L76
            goto L3b
        L47:
            byte[] r4 = r0.toByteArray()     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L76
            org.p3363xbe4143f1.C29689x715d3c0f.m154713x2398d9db(r7, r4)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L76
            r3.close()     // Catch: java.lang.Exception -> L51
        L51:
            r0.close()     // Catch: java.lang.Exception -> L54
        L54:
            r2.disconnect()
            return r4
        L58:
            r7 = move-exception
            goto L65
        L5a:
            r7 = move-exception
            goto L78
        L5c:
            r7 = move-exception
            r3 = r1
            goto L65
        L5f:
            r7 = move-exception
            r2 = r1
            goto L78
        L62:
            r7 = move-exception
            r2 = r1
            r3 = r2
        L65:
            r7.getMessage()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.lang.Exception -> L6d
        L6d:
            r0.close()     // Catch: java.lang.Exception -> L70
        L70:
            if (r2 == 0) goto L75
            r2.disconnect()
        L75:
            return r1
        L76:
            r7 = move-exception
            r1 = r3
        L78:
            if (r1 == 0) goto L7d
            r1.close()     // Catch: java.lang.Exception -> L7d
        L7d:
            r0.close()     // Catch: java.lang.Exception -> L80
        L80:
            if (r2 == 0) goto L85
            r2.disconnect()
        L85:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3363xbe4143f1.b.a(java.lang.String):byte[]");
    }
}
