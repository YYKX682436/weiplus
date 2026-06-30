package gt5;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f357120a;

    /* renamed from: b, reason: collision with root package name */
    public final gt5.b f357121b;

    public a(android.content.Context context) {
        this.f357120a = null;
        this.f357120a = context;
        this.f357121b = new gt5.b(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static it5.b a(android.content.Context r7, ft5.a r8, int r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            it5.b r8 = new it5.b
            r8.<init>()
            r8.f376141d = r9
            r8.f376142e = r0
            r8.f376143f = r0
            byte[] r9 = ot5.e.c(r0)
            r8.f376144g = r9
            java.lang.String r9 = "AppUtil"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L87
            r3 = 64
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r0, r3)     // Catch: java.lang.Throwable -> L87
            if (r7 == 0) goto L99
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: java.lang.Throwable -> L87
            if (r7 == 0) goto L99
            int r3 = r7.length     // Catch: java.lang.Throwable -> L87
            if (r3 <= 0) goto L99
            r3 = r2
        L31:
            int r4 = r7.length     // Catch: java.lang.Throwable -> L87
            if (r3 >= r4) goto L99
            r4 = 5
            if (r3 >= r4) goto L99
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: java.lang.Throwable -> L87
            r5 = r7[r3]     // Catch: java.lang.Throwable -> L87
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L87
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> L87
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L87
            java.security.cert.Certificate r4 = r4.generateCertificate(r6)     // Catch: java.lang.Throwable -> L52
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: java.lang.Throwable -> L52
            r6.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L87
            goto L56
        L52:
            r6.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L87
        L55:
            r4 = r0
        L56:
            if (r4 == 0) goto L84
            byte[] r4 = r4.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L6f java.lang.Throwable -> L87
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> L87
            r5.update(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> L87
            byte[] r4 = r5.digest()     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> L87
            goto L6b
        L6a:
            r4 = r0
        L6b:
            r1.add(r4)     // Catch: java.security.cert.CertificateEncodingException -> L6f java.lang.Throwable -> L87
            goto L84
        L6f:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r5.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = "extractPkgCertMd5s(), CertificateEncodingException: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L87
            r5.append(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L87
            ot5.g.a(r9, r4)     // Catch: java.lang.Throwable -> L87
        L84:
            int r3 = r3 + 1
            goto L31
        L87:
            r7 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "extractPkgCertMd5s(), Exception: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            ot5.g.a(r9, r7)
        L99:
            int r7 = r1.size()
            r9 = 1
            if (r7 <= r9) goto Lbd
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8.f376159y = r7
            java.util.Iterator r7 = r1.iterator()
        Lab:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r7.next()
            byte[] r9 = (byte[]) r9
            java.util.ArrayList r1 = r8.f376159y
            r1.add(r9)
            goto Lab
        Lbd:
            r3 = 0
            r8.f376145h = r3
            r8.f376146i = r0
            r8.f376147m = r2
            r8.f376148n = r0
            r7 = 2
            r8.f376149o = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gt5.a.a(android.content.Context, ft5.a, int):it5.b");
    }

    public final it5.d b() {
        it5.d dVar = new it5.d();
        try {
            dVar.f376174d = android.os.Build.FINGERPRINT;
            dVar.f376175e = ot5.d.b(false);
            dVar.f376176f = android.os.Build.BRAND;
            dVar.f376177g = wo.w0.m();
            dVar.f376178h = android.os.Build.VERSION.SDK_INT;
            dVar.f376179i = android.os.Build.CPU_ABI;
            dVar.f376180m = ot5.d.a("ro.board.platform");
            dVar.f376181n = jt5.e.a();
        } catch (java.lang.Exception unused) {
        }
        return dVar;
    }
}
