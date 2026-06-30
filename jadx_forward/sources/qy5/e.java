package qy5;

/* loaded from: classes13.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L8b
            r1 = 64
            r2 = 0
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le java.lang.Exception -> L8b
            goto Lf
        Le:
            r6 = r2
        Lf:
            if (r6 == 0) goto L8b
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Exception -> L8b
            r7 = 0
            r6 = r6[r7]     // Catch: java.lang.Exception -> L8b
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Exception -> L8b
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L8b
            r1.<init>(r6)     // Catch: java.lang.Exception -> L8b
            java.lang.String r6 = "X509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch: java.security.cert.CertificateException -> L26 java.lang.Exception -> L8b
            goto L27
        L26:
            r6 = r2
        L27:
            if (r6 == 0) goto L34
            java.security.cert.Certificate r6 = r6.generateCertificate(r1)     // Catch: java.security.cert.CertificateException -> L34 java.lang.Exception -> L8b
            boolean r1 = r6 instanceof java.security.cert.X509Certificate     // Catch: java.security.cert.CertificateException -> L34 java.lang.Exception -> L8b
            if (r1 == 0) goto L34
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch: java.security.cert.CertificateException -> L34 java.lang.Exception -> L8b
            r2 = r6
        L34:
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r8)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            if (r2 == 0) goto L80
            byte[] r8 = r2.getEncoded()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            byte[] r6 = r6.digest(r8)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            int r1 = r6.length     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            r2 = 2
            int r1 = r1 * r2
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
        L4a:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            if (r7 >= r1) goto L7b
            r1 = r6[r7]     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            r4 = 1
            if (r3 != r4) goto L60
            java.lang.String r5 = "0"
            java.lang.String r1 = r5.concat(r1)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
        L60:
            if (r3 <= r2) goto L68
            int r5 = r3 + (-2)
            java.lang.String r1 = r1.substring(r5, r3)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
        L68:
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            r8.append(r1)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            int r1 = r6.length     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            int r1 = r1 - r4
            if (r7 >= r1) goto L78
            r1 = 58
            r8.append(r1)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
        L78:
            int r7 = r7 + 1
            goto L4a
        L7b:
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L8b
            goto L81
        L80:
            r6 = r0
        L81:
            if (r6 == 0) goto L8a
            java.lang.String r7 = ":"
            java.lang.String r0 = r6.replaceAll(r7, r0)     // Catch: java.lang.Exception -> L8a
            goto L8b
        L8a:
            r0 = r6
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qy5.e.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }
}
