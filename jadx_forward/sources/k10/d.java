package k10;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final k10.d f384703a = new k10.d();

    public static final com.p314xaae8f345.mm.vfs.r6 a(k10.d dVar, android.content.Context context, java.lang.String str, java.lang.String str2) {
        dVar.getClass();
        java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
        try {
            if (httpURLConnection.getResponseCode() != 200) {
                throw new java.lang.RuntimeException("HTTP " + httpURLConnection.getResponseCode());
            }
            long contentLength = httpURLConnection.getContentLength();
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(context.getCacheDir(), "nirvana_local_preview");
            com.p314xaae8f345.mm.vfs.w6.u(r6Var.o());
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str2 + ".wspkg");
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            try {
                com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(r6Var2);
                try {
                    byte[] bArr = new byte[8192];
                    long j17 = 0;
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            vz5.b.a(y6Var, null);
                            vz5.b.a(inputStream, null);
                            return r6Var2;
                        }
                        y6Var.write(bArr, 0, read);
                        j17 += read;
                        if (contentLength > 0 && j17 % 524288 < 8192) {
                            long j18 = (100 * j17) / contentLength;
                        }
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static final org.json.JSONObject b(k10.d dVar, java.lang.String str) {
        dVar.getClass();
        java.net.URLConnection openConnection = new java.net.URL(str).openConnection();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        try {
            if (httpURLConnection.getResponseCode() != 200) {
                throw new java.lang.RuntimeException("HTTP " + httpURLConnection.getResponseCode());
            }
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            try {
                java.lang.String c17 = vz5.v.c(bufferedReader);
                vz5.b.a(bufferedReader, null);
                return new org.json.JSONObject(c17);
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
