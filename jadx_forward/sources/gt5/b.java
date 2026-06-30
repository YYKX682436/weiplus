package gt5;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f357122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f357123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f357124c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f357125d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f357126e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f357127f;

    /* renamed from: g, reason: collision with root package name */
    public ht5.c f357128g = null;

    /* renamed from: h, reason: collision with root package name */
    public ht5.a f357129h = null;

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:7:0x002a, B:12:0x0043, B:14:0x004d, B:16:0x0051, B:17:0x005e, B:27:0x0047), top: B:6:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f357122a = r0
            r1 = -1
            r5.f357123b = r1
            r5.f357124c = r1
            r5.f357125d = r0
            r5.f357126e = r0
            r5.f357127f = r0
            r5.f357128g = r0
            r5.f357129h = r0
            r5.f357122a = r6
            java.lang.String r1 = r6.getPackageName()
            r2 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L65
            r3 = 64
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r6.versionName     // Catch: java.lang.Throwable -> L65
            int r3 = r6.versionCode     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: java.lang.Throwable -> L61
            android.content.pm.Signature[] r6 = r6.signatures     // Catch: java.lang.Throwable -> L61
            r6 = r6[r2]     // Catch: java.lang.Throwable -> L61
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L61
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L61
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L61
            java.security.cert.Certificate r6 = r4.generateCertificate(r2)     // Catch: java.lang.Throwable -> L47
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch: java.lang.Throwable -> L47
            r2.close()     // Catch: java.io.IOException -> L4b java.lang.Throwable -> L61
            goto L4b
        L47:
            r2.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L61
        L4a:
            r6 = r0
        L4b:
            if (r6 == 0) goto L61
            byte[] r6 = r6.getEncoded()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L61
            r2.update(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L61
            byte[] r0 = r2.digest()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L61
        L5e:
            ot5.e.a(r0)     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = r1
            r2 = r3
            goto L65
        L64:
            r0 = r1
        L65:
            r5.f357125d = r0
            r5.f357124c = r2
            r6 = 82
            r5.f357123b = r6
            java.lang.String r6 = "105901"
            r5.f357126e = r6
            java.lang.String r6 = "7AD75E27CD5842F6"
            r5.f357127f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gt5.b.<init>(android.content.Context):void");
    }

    public byte[] a(it5.a aVar) {
        byte[] bArr;
        try {
            ot5.k kVar = new ot5.k(true);
            com.qq.taf.C2853x7d14f3d7 c2853x7d14f3d7 = kVar.f430413b;
            c2853x7d14f3d7.f9737xd2ee19a1 = 3;
            c2853x7d14f3d7.f9742xd1aa19c9 = "viruscheck";
            c2853x7d14f3d7.f9741xf0d65102 = "RiskCheck";
            kVar.f430412a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
            if (this.f357129h == null) {
                ht5.a aVar2 = new ht5.a();
                this.f357129h = aVar2;
                aVar2.f366502d = 2;
                aVar2.f366503e = 201;
            }
            kVar.b("phonetype", this.f357129h);
            kVar.b("userinfo", b());
            kVar.b("req", aVar);
            byte[] a17 = ot5.a.a(kVar.a());
            if (a17 == null) {
                throw new java.lang.RuntimeException("compress data fail");
            }
            try {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                int[] iArr = {-36, -46, -45, -77, -22, -10, 47, -77, -72, -69, -32, 25, 21, -21, -6, -75, -71, 31, -39, -49, -49};
                for (int i17 = 0; i17 < 21; i17++) {
                    stringBuffer.append((char) ("http://pmir.3g.qq.com".charAt(i17) + iArr[i17]));
                }
                bArr = stringBuffer.toString().getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.io.UnsupportedEncodingException unused) {
                bArr = null;
            }
            return ot5.b.a(a17, bArr);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public final ht5.c b() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        int i19;
        int i27;
        ht5.c cVar = this.f357128g;
        android.content.Context context = this.f357122a;
        if (cVar == null) {
            ht5.c cVar2 = new ht5.c();
            this.f357128g = cVar2;
            cVar2.f366515o = this.f357123b;
            cVar2.f366522v = this.f357124c;
            cVar2.f366512i = this.f357126e;
            cVar2.f366511h = this.f357127f;
            try {
                java.lang.String[] split = this.f357125d.trim().split("[\\.]");
                if (split == null || split.length < 3) {
                    i18 = 0;
                    i19 = 0;
                    i27 = 0;
                } else {
                    i19 = java.lang.Integer.parseInt(split[0]);
                    i27 = java.lang.Integer.parseInt(split[1]);
                    i18 = java.lang.Integer.parseInt(split[2]);
                }
                this.f357128g.f366516p = new ht5.b();
                ht5.b bVar = this.f357128g.f366516p;
                bVar.f366504d = i19;
                bVar.f366505e = i27;
                bVar.f366506f = i18;
            } catch (java.lang.Exception unused) {
            }
            ht5.c cVar3 = this.f357128g;
            cVar3.f366519s = 0;
            try {
                i17 = java.lang.Integer.parseInt(android.os.Build.VERSION.SDK);
            } catch (java.lang.Throwable th6) {
                ot5.g.d("DeviceUtil", "getSDKVersion: " + th6);
                i17 = 0;
            }
            cVar3.f366521u = i17;
            ht5.c cVar4 = this.f357128g;
            try {
                android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                str = (java.lang.String) yj0.a.j(telephonyManager, "com/tencent/riskscanner/utils/DeviceUtil", "getIMEI", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;");
            } catch (java.lang.Throwable th7) {
                ot5.g.d("DeviceUtil", "getIMEI: " + th7);
                str = "";
            }
            if (str == null) {
                str = "";
            }
            cVar4.f366507d = str;
            ht5.c cVar5 = this.f357128g;
            try {
                android.telephony.TelephonyManager telephonyManager2 = (android.telephony.TelephonyManager) context.getSystemService("phone");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                str2 = (java.lang.String) yj0.a.j(telephonyManager2, "com/tencent/riskscanner/utils/DeviceUtil", "getIMSI", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
            } catch (java.lang.Throwable th8) {
                ot5.g.d("DeviceUtil", "getIMSI: " + th8);
                str2 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            cVar5.f366518r = str2;
            this.f357128g.f366513m = wo.w0.m();
            ht5.c cVar6 = this.f357128g;
            try {
                str3 = wo.w0.c();
            } catch (java.lang.Throwable th9) {
                ot5.g.d("DeviceUtil", "getAndroidId: " + th9);
                str3 = "";
            }
            cVar6.E = str3;
            ht5.c cVar7 = this.f357128g;
            java.lang.String c17 = ot5.d.c(true);
            if (c17 == null) {
                c17 = "";
            }
            cVar7.F = c17;
            ht5.c cVar8 = this.f357128g;
            java.lang.String c18 = ot5.d.c(false);
            cVar8.G = c18 != null ? c18 : "";
            ht5.c cVar9 = this.f357128g;
            cVar9.f366517q = null;
            cVar9.f366520t = 0;
        }
        ht5.c cVar10 = this.f357128g;
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo();
        ot5.c cVar11 = ot5.c.CONN_NONE;
        ot5.c cVar12 = ot5.c.CONN_WIFI;
        if (activeNetworkInfo != null && (activeNetworkInfo.getState() == android.net.NetworkInfo.State.CONNECTING || activeNetworkInfo.getState() == android.net.NetworkInfo.State.CONNECTED)) {
            if (activeNetworkInfo.getType() == 1) {
                cVar11 = cVar12;
            } else if (activeNetworkInfo.getType() == 0) {
                cVar11 = (android.net.Proxy.getDefaultHost() == null && android.net.Proxy.getHost(context) == null) ? ot5.c.CONN_CMNET : ot5.c.CONN_CMWAP;
            }
        }
        cVar10.f366514n = cVar11 != cVar12 ? 1 : 2;
        return this.f357128g;
    }
}
