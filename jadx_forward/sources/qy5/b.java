package qy5;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f449325a = new qy5.c();

    public static int a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Integer.parseInt(str);
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r0.equals(r9) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r9) {
        /*
            java.lang.String r0 = "sePayConf"
            java.lang.String r1 = "configs"
            java.lang.String r2 = com.p3263xee53b379.p3269x6a710b1.C28079x1dd97ed6.b(r9, r1)
            java.lang.String r3 = "mode"
            java.lang.String r3 = com.p3263xee53b379.p3269x6a710b1.C28079x1dd97ed6.b(r9, r3)
            java.lang.String r4 = "or"
            java.lang.String r9 = com.p3263xee53b379.p3269x6a710b1.C28079x1dd97ed6.b(r9, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r5 = 0
            r6 = 2
            java.lang.String r7 = ""
            if (r4 != 0) goto L8f
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L8f
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L8f
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8f
            r4.<init>(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.String r2 = "sign"
            java.lang.String r2 = qy5.g.b(r4, r2)     // Catch: java.lang.Exception -> L8f
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L3a
            goto L3b
        L3a:
            r3 = r5
        L3b:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = r4.getString(r1)     // Catch: java.lang.Exception -> L8f
            byte[] r1 = android.util.Base64.decode(r1, r6)     // Catch: java.lang.Exception -> L8f
            r8.<init>(r1)     // Catch: java.lang.Exception -> L8f
            boolean r1 = r4.has(r0)     // Catch: java.lang.Exception -> L8f
            if (r1 == 0) goto L5c
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L8f
            byte[] r0 = android.util.Base64.decode(r0, r6)     // Catch: java.lang.Exception -> L8f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L8f
            goto L5d
        L5c:
            r1 = r7
        L5d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L64
            r1 = r7
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f
            r0.<init>()     // Catch: java.lang.Exception -> L8f
            r0.append(r8)     // Catch: java.lang.Exception -> L8f
            r0.append(r1)     // Catch: java.lang.Exception -> L8f
            r0.append(r9)     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = com.p3263xee53b379.p3269x6a710b1.C28079x1dd97ed6.c(r9)     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = g(r9)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = com.p3263xee53b379.p3269x6a710b1.C28079x1dd97ed6.a(r3, r2)     // Catch: java.lang.Exception -> L8f
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8f
            if (r1 != 0) goto L8f
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Exception -> L8f
            if (r9 == 0) goto L8f
            goto L90
        L8f:
            r8 = r7
        L90:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lc4
            r9.<init>(r8)     // Catch: java.lang.Exception -> Lc4
            int r0 = r9.length()
        L99:
            if (r5 >= r0) goto Lc4
            java.lang.Object r1 = qy5.g.a(r9, r5)
            if (r1 == 0) goto Lc1
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r2 = "type"
            java.lang.String r2 = qy5.g.b(r1, r2)
            java.lang.String r3 = "app"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc1
            java.lang.String r9 = "ca"
            java.lang.String r9 = qy5.g.b(r1, r9)
            java.lang.String r0 = new java.lang.String
            byte[] r9 = android.util.Base64.decode(r9, r6)
            r0.<init>(r9)
            return r0
        Lc1:
            int r5 = r5 + 1
            goto L99
        Lc4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy5.b.b(android.content.Context):java.lang.String");
    }

    public static java.lang.String c(java.io.InputStream inputStream, java.lang.String str) {
        if (inputStream == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }
    }

    public static boolean d(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo = null;
        if (context != null) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && !android.text.TextUtils.isEmpty(str)) {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return packageInfo != null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:40|(4:45|(8:51|(3:64|65|(6:67|54|55|56|(1:58)(1:61)|(1:60)))|53|54|55|56|(0)(0)|(0))|49|50)|71|(1:47)|51|(0)|53|54|55|56|(0)(0)|(0)|49|50) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c4, code lost:
    
        r10 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075 A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:6:0x001d, B:8:0x0023, B:10:0x0029, B:14:0x0033, B:16:0x003a, B:19:0x0047, B:24:0x0053, B:29:0x005b, B:31:0x0061, B:33:0x0067, B:38:0x0075, B:40:0x008d, B:42:0x0093, B:47:0x009f, B:51:0x00a5, B:72:0x0081), top: B:5:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.content.Context r9, org.json.JSONObject r10) {
        /*
            r0 = 0
            if (r9 == 0) goto Lcf
            if (r10 == 0) goto Lcf
            java.lang.String r1 = "schema"
            java.lang.String r1 = qy5.g.b(r10, r1)
            java.lang.String r2 = "sign"
            java.lang.String r2 = qy5.g.b(r10, r2)
            java.lang.String r3 = "version"
            java.lang.String r3 = qy5.g.b(r10, r3)
            java.lang.String r4 = "checkMode"
            java.lang.String r10 = qy5.g.b(r10, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lcf
            if (r4 != 0) goto Lcf
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lcf
            if (r4 != 0) goto Lcf
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lcf
            if (r4 != 0) goto Lcf
            java.lang.String r4 = "11"
            if (r10 == 0) goto L39
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> Lcf
            if (r5 == 0) goto L3a
        L39:
            r10 = r4
        L3a:
            java.lang.String r5 = h(r9, r1)     // Catch: java.lang.Exception -> Lcf
            boolean r6 = r4.equals(r10)     // Catch: java.lang.Exception -> Lcf
            java.lang.String r7 = "01"
            r8 = 1
            if (r6 != 0) goto L50
            boolean r6 = r7.equals(r10)     // Catch: java.lang.Exception -> Lcf
            if (r6 == 0) goto L4e
            goto L50
        L4e:
            r6 = r0
            goto L51
        L50:
            r6 = r8
        L51:
            if (r6 == 0) goto L5b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lcf
            if (r6 == 0) goto L5b
            goto Lcf
        L5b:
            boolean r6 = d(r9, r1)     // Catch: java.lang.Exception -> Lcf
            if (r6 == 0) goto Lcf
            boolean r6 = r4.equals(r10)     // Catch: java.lang.Exception -> Lcf
            if (r6 != 0) goto L72
            java.lang.String r6 = "10"
            boolean r6 = r6.equals(r10)     // Catch: java.lang.Exception -> Lcf
            if (r6 == 0) goto L70
            goto L72
        L70:
            r6 = r0
            goto L73
        L72:
            r6 = r8
        L73:
            if (r6 == 0) goto L81
            java.lang.String r6 = "SHA1"
            java.lang.String r6 = f(r9, r1, r6)     // Catch: java.lang.Exception -> Lcf
            boolean r6 = r2.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> Lcf
            if (r6 != 0) goto L8d
        L81:
            java.lang.String r6 = "SHA256"
            java.lang.String r6 = f(r9, r1, r6)     // Catch: java.lang.Exception -> Lcf
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch: java.lang.Exception -> Lcf
            if (r2 == 0) goto Lcf
        L8d:
            boolean r2 = r4.equals(r10)     // Catch: java.lang.Exception -> Lcf
            if (r2 != 0) goto L9c
            boolean r10 = r7.equals(r10)     // Catch: java.lang.Exception -> Lcf
            if (r10 == 0) goto L9a
            goto L9c
        L9a:
            r10 = r0
            goto L9d
        L9c:
            r10 = r8
        L9d:
            if (r10 == 0) goto La5
            boolean r10 = r5.matches(r3)     // Catch: java.lang.Exception -> Lcf
            if (r10 != 0) goto Lce
        La5:
            boolean r10 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> Lcf
            if (r10 != 0) goto Lb8
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch: java.lang.Exception -> Lb8
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r1, r0)     // Catch: java.lang.Exception -> Lb8
            if (r9 == 0) goto Lb8
            int r9 = r9.versionCode     // Catch: java.lang.Exception -> Lb8
            goto Lb9
        Lb8:
            r9 = r0
        Lb9:
            r10 = 10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3, r10)     // Catch: java.lang.Exception -> Lc4
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> Lc4
            goto Lc7
        Lc4:
            r10 = 2147483647(0x7fffffff, float:NaN)
        Lc7:
            if (r9 < r10) goto Lcb
            r9 = r8
            goto Lcc
        Lcb:
            r9 = r0
        Lcc:
            if (r9 == 0) goto Lcf
        Lce:
            r0 = r8
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qy5.b.e(android.content.Context, org.json.JSONObject):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:15|(2:16|17)|(6:47|48|20|21|(4:23|(7:26|(1:28)|(1:30)|31|(2:33|34)(1:36)|35|24)|37|38)|(2:41|42))|19|20|21|(0)|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #4 {Exception -> 0x0092, blocks: (B:58:0x0005, B:7:0x000f, B:9:0x0017, B:11:0x001b, B:13:0x001e, B:15:0x0023, B:17:0x002c, B:48:0x0036, B:21:0x003e, B:23:0x0044, B:24:0x0054, B:26:0x0057, B:28:0x0064, B:30:0x006c, B:31:0x0072, B:33:0x007d, B:35:0x0082, B:38:0x0085, B:41:0x008b), top: B:57:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: NoSuchAlgorithmException | CertificateEncodingException -> 0x0089, Exception -> 0x0092, TryCatch #2 {NoSuchAlgorithmException | CertificateEncodingException -> 0x0089, blocks: (B:21:0x003e, B:23:0x0044, B:24:0x0054, B:26:0x0057, B:28:0x0064, B:30:0x006c, B:31:0x0072, B:33:0x007d, B:35:0x0082, B:38:0x0085), top: B:20:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b A[Catch: Exception -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0092, blocks: (B:58:0x0005, B:7:0x000f, B:9:0x0017, B:11:0x001b, B:13:0x001e, B:15:0x0023, B:17:0x002c, B:48:0x0036, B:21:0x003e, B:23:0x0044, B:24:0x0054, B:26:0x0057, B:28:0x0064, B:30:0x006c, B:31:0x0072, B:33:0x007d, B:35:0x0082, B:38:0x0085, B:41:0x008b), top: B:57:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            if (r7 == 0) goto La
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Exception -> L92
            goto Lb
        La:
            r7 = r1
        Lb:
            if (r7 == 0) goto L14
            r2 = 64
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14 java.lang.Exception -> L92
            goto L15
        L14:
            r7 = r1
        L15:
            if (r7 == 0) goto L92
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: java.lang.Exception -> L92
            if (r7 == 0) goto L92
            int r8 = r7.length     // Catch: java.lang.Exception -> L92
            if (r8 <= 0) goto L92
            r8 = 0
            r7 = r7[r8]     // Catch: java.lang.Exception -> L92
            if (r7 == 0) goto L92
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Exception -> L92
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L92
            r2.<init>(r7)     // Catch: java.lang.Exception -> L92
            java.lang.String r7 = "X509"
            java.security.cert.CertificateFactory r7 = java.security.cert.CertificateFactory.getInstance(r7)     // Catch: java.security.cert.CertificateException -> L33 java.lang.Exception -> L92
            goto L34
        L33:
            r7 = r1
        L34:
            if (r7 == 0) goto L3d
            java.security.cert.Certificate r7 = r7.generateCertificate(r2)     // Catch: java.security.cert.CertificateException -> L3d java.lang.Exception -> L92
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch: java.security.cert.CertificateException -> L3d java.lang.Exception -> L92
            goto L3e
        L3d:
            r7 = r1
        L3e:
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            if (r7 == 0) goto L89
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            byte[] r7 = r9.digest(r7)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            int r2 = r7.length     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            r3 = 2
            int r2 = r2 * r3
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
        L54:
            int r2 = r7.length     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            if (r8 >= r2) goto L85
            r2 = r7[r8]     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            r5 = 1
            if (r4 != r5) goto L6a
            java.lang.String r6 = "0"
            java.lang.String r2 = r6.concat(r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
        L6a:
            if (r4 <= r3) goto L72
            int r6 = r4 + (-2)
            java.lang.String r2 = r2.substring(r6, r4)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
        L72:
            java.lang.String r2 = r2.toUpperCase()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            r9.append(r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            int r2 = r7.length     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
            int r2 = r2 - r5
            if (r8 >= r2) goto L82
            r2 = 58
            r9.append(r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
        L82:
            int r8 = r8 + 1
            goto L54
        L85:
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L92
        L89:
            if (r1 == 0) goto L92
            java.lang.String r7 = ":"
            java.lang.String r7 = r1.replaceAll(r7, r0)     // Catch: java.lang.Exception -> L92
            return r7
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qy5.b.f(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static java.lang.String g(java.lang.String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (byte b17 : str.getBytes()) {
            sb6.append(charArray[(b17 & 240) >> 4]);
            sb6.append(charArray[b17 & 15]);
        }
        return sb6.toString().trim();
    }

    public static java.lang.String h(android.content.Context context, java.lang.String str) {
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
