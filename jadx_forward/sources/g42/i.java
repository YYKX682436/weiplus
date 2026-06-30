package g42;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f350268a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f350269b;

    public static void a(java.lang.String str, java.lang.String str2) {
        if (g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r7 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r7) {
        /*
            java.lang.String r0 = "[EdgeComputingUtils] downloadAsString throw Exception : "
            java.lang.String r1 = "EdgeComputingUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f java.net.MalformedURLException -> L6c
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f java.net.MalformedURLException -> L6c
            java.net.URLConnection r7 = r4.openConnection()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f java.net.MalformedURLException -> L6c
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f java.net.MalformedURLException -> L6c
            if (r7 == 0) goto L47
            r7.connect()     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            int r3 = r7.getResponseCode()     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L47
            java.io.InputStream r3 = r7.getInputStream()     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            if (r3 == 0) goto L47
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            r5.<init>(r3)     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            r4.<init>(r5)     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
        L32:
            java.lang.String r5 = r4.readLine()     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            if (r5 == 0) goto L3c
            r2.append(r5)     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            goto L32
        L3c:
            r4.close()     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            r3.close()     // Catch: java.io.IOException -> L43 java.net.MalformedURLException -> L45 java.lang.Throwable -> L8e
            goto L47
        L43:
            r3 = move-exception
            goto L53
        L45:
            r3 = move-exception
            goto L70
        L47:
            if (r7 == 0) goto L89
        L49:
            r7.disconnect()
            goto L89
        L4d:
            r0 = move-exception
            goto L90
        L4f:
            r7 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L8e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L89
            goto L49
        L6c:
            r7 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
        L70:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L8e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto L89
            goto L49
        L89:
            java.lang.String r7 = r2.toString()
            return r7
        L8e:
            r0 = move-exception
            r3 = r7
        L90:
            if (r3 == 0) goto L95
            r3.disconnect()
        L95:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g42.i.c(java.lang.String):java.lang.String");
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 d() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_config_" + j62.e.g().n());
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_default_" + j62.e.g().n());
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_name_edge_computing_realtime_report_" + j62.e.g().n());
    }

    public static boolean g() {
        if (f350269b == null) {
            f350269b = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_edge_computing_debug_mode, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingUtils", "[EdgeComputingUtils] isDebugMode : " + f350269b);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            f350269b = java.lang.Boolean.TRUE;
        }
        return f350269b.booleanValue();
    }

    public static boolean h() {
        if (f350268a == null) {
            f350268a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_edge_computing_cloud_switch, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingUtils", "[EdgeComputingUtils] isOpenEdgeComputing cloudSwitch : " + f350268a);
        }
        return f350268a.booleanValue();
    }
}
