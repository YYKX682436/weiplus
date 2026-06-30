package mn2;

/* loaded from: classes13.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mn2.a1 f411440a = new mn2.a1();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hp0.d a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "reDirector error [httpURLConnectionGet "
            java.lang.String r1 = "url"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r1)
            java.net.HttpURLConnection r9 = r8.b(r9)
            int r1 = r9.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 < r2) goto L88
            r9.disconnect()
            java.lang.String r3 = "Finder.ImageDownloader"
            r4 = 0
            if (r1 == r2) goto L2e
            r5 = 301(0x12d, float:4.22E-43)
            if (r1 == r5) goto L2e
            r5 = 302(0x12e, float:4.23E-43)
            if (r1 == r5) goto L2e
            r5 = 303(0x12f, float:4.25E-43)
            if (r1 != r5) goto L28
            goto L2e
        L28:
            java.lang.String r9 = "dz[httpURLConnectionGet 300]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r9)
            return r4
        L2e:
            java.lang.String r5 = "location"
            java.lang.String r5 = r9.getHeaderField(r5)     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L6e
            int r6 = r5.length()     // Catch: java.lang.Exception -> L72
            r7 = 1
            if (r6 != 0) goto L3f
            r6 = r7
            goto L40
        L3f:
            r6 = 0
        L40:
            r6 = r6 ^ r7
            if (r6 == 0) goto L44
            goto L45
        L44:
            r5 = r4
        L45:
            if (r5 == 0) goto L6e
            mn2.a1 r9 = mn2.a1.f411440a     // Catch: java.lang.Exception -> L72
            java.net.HttpURLConnection r9 = r9.b(r5)     // Catch: java.lang.Exception -> L72
            int r1 = r9.getResponseCode()     // Catch: java.lang.Exception -> L72
            if (r1 < r2) goto L6b
            r9.disconnect()     // Catch: java.lang.Exception -> L72
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r9.<init>(r0)     // Catch: java.lang.Exception -> L72
            r9.append(r1)     // Catch: java.lang.Exception -> L72
            r2 = 33
            r9.append(r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L72
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r9)     // Catch: java.lang.Exception -> L72
            return r4
        L6b:
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Exception -> L72
            goto L6f
        L6e:
            r0 = r4
        L6f:
            if (r0 != 0) goto L88
            return r4
        L72:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r1)
            r0 = 93
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            hc2.c.a(r9, r0)
            return r4
        L88:
            java.io.InputStream r0 = r9.getInputStream()
            java.lang.String r1 = r9.getContentType()
            byte[] r0 = ap0.h.a(r0)
            r9.disconnect()
            hp0.d r9 = new hp0.d
            hp0.c r2 = new hp0.c
            r2.<init>(r0)
            r9.<init>(r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.a1.a(java.lang.String):hp0.d");
    }

    public final java.net.HttpURLConnection b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ImageDownloader", "[openConnection] url:".concat(url));
        java.net.URLConnection openConnection = new java.net.URL(url).openConnection();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ImageDownloader", "[openConnection] contentLength=" + httpURLConnection.getContentLength() + " responseCode=" + httpURLConnection.getResponseCode() + " responseMessage=" + httpURLConnection.getResponseMessage() + " url:" + url + ' ');
        return httpURLConnection;
    }
}
