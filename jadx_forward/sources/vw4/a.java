package vw4;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final vw4.a f522744a = new vw4.a();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0198 A[Catch: all -> 0x0192, TryCatch #2 {all -> 0x0192, blocks: (B:69:0x0189, B:38:0x0198, B:41:0x0201, B:49:0x022d, B:51:0x0235, B:53:0x0241, B:55:0x0249, B:57:0x0251, B:61:0x0262, B:65:0x01f8, B:66:0x0267), top: B:68:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0267 A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #2 {all -> 0x0192, blocks: (B:69:0x0189, B:38:0x0198, B:41:0x0201, B:49:0x022d, B:51:0x0235, B:53:0x0241, B:55:0x0249, B:57:0x0251, B:61:0x0262, B:65:0x01f8, B:66:0x0267), top: B:68:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p3210x3857dc.y0 a(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vw4.a.a(java.lang.String):com.tencent.xweb.y0");
    }

    public final java.net.HttpURLConnection b(java.lang.String str) {
        try {
            java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH5ContentFetcher", "getConnection, exp=" + th6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010 A[Catch: all -> 0x000b, TRY_LEAVE, TryCatch #0 {all -> 0x000b, blocks: (B:14:0x0002, B:4:0x0010), top: B:13:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p3210x3857dc.y0 c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Ld
            int r0 = r6.length()     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L9
            goto Ld
        L9:
            r0 = 0
            goto Le
        Lb:
            r6 = move-exception
            goto L2c
        Ld:
            r0 = 1
        Le:
            if (r0 != 0) goto L3f
            com.tencent.xweb.y0 r0 = new com.tencent.xweb.y0     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "utf-8"
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lb
            java.nio.charset.Charset r4 = r26.c.f450398a     // Catch: java.lang.Throwable -> Lb
            byte[] r6 = r6.getBytes(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r4 = "getBytes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r4)     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r6)     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb
            return r0
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getResponse, exp="
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "AdH5ContentFetcher"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)
        L3f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vw4.a.c(java.lang.String):com.tencent.xweb.y0");
    }

    public final java.lang.String d(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(byteArrayOutputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
            } catch (java.lang.Throwable th6) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH5ContentFetcher", "readStringFromStream, exp=" + th6);
                    try {
                        bufferedOutputStream.close();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH5ContentFetcher", "readStringFromStream, bufferOs.close exp=" + e17);
                    }
                    try {
                        inputStream.close();
                        return "";
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH5ContentFetcher", "readStringFromStream, is.close exp=" + e18);
                        return "";
                    }
                } finally {
                }
            }
        }
        bufferedOutputStream.flush();
        java.lang.String byteArrayOutputStream2 = byteArrayOutputStream.toString(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArrayOutputStream2, "toString(...)");
        try {
            bufferedOutputStream.close();
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH5ContentFetcher", "readStringFromStream, bufferOs.close exp=" + e19);
        }
        try {
            inputStream.close();
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdH5ContentFetcher", "readStringFromStream, is.close exp=" + e27);
        }
        return byteArrayOutputStream2;
    }
}
