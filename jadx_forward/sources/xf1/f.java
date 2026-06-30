package xf1;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentMap f535766a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f535767b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f535768c;

    static {
        java.lang.String D = lp0.b.D();
        if (!D.endsWith("/")) {
            D = D.concat("/");
        }
        java.lang.String str = D + "wxacache/";
        f535768c = str;
        com.p314xaae8f345.mm.vfs.w6.u(str);
    }

    public static void a(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.io.OutputStream outputStream;
        java.io.Closeable closeable;
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Exception e17;
        java.net.HttpURLConnection httpURLConnection;
        java.io.InputStream inputStream;
        java.net.HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                try {
                    inputStream = httpURLConnection.getInputStream();
                    outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    outputStream = null;
                    bufferedInputStream = null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    outputStream = null;
                    closeable = null;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            try {
                bufferedInputStream = new java.io.BufferedInputStream(inputStream);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 16384);
                        if (read == -1) {
                            break;
                        } else {
                            outputStream.write(bArr, 0, read);
                        }
                    }
                    outputStream.flush();
                } catch (java.lang.Exception e19) {
                    e17 = e19;
                    r6Var.l();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandLiveFileLoadHelper", e17, "download file url %s ", str);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (java.lang.Exception e27) {
                        e = e27;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLiveFileLoadHelper", e.getMessage());
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                        httpURLConnection.disconnect();
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                    httpURLConnection.disconnect();
                }
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.lang.Exception e28) {
                    e = e28;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLiveFileLoadHelper", e.getMessage());
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                    httpURLConnection.disconnect();
                }
            } catch (java.lang.Exception e29) {
                e = e29;
                bufferedInputStream = null;
                e17 = e;
                r6Var.l();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandLiveFileLoadHelper", e17, "download file url %s ", str);
                httpURLConnection.getInputStream().close();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                httpURLConnection.disconnect();
            } catch (java.lang.Throwable th8) {
                th = th8;
                closeable = null;
                httpURLConnection2 = httpURLConnection;
                try {
                    httpURLConnection2.getInputStream().close();
                } catch (java.lang.Exception e37) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLiveFileLoadHelper", e37.getMessage());
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
                httpURLConnection2.disconnect();
                throw th;
            }
        } catch (java.lang.Exception e38) {
            outputStream = null;
            bufferedInputStream = null;
            e17 = e38;
            httpURLConnection = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            outputStream = null;
            closeable = null;
            httpURLConnection2.getInputStream().close();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
            httpURLConnection2.disconnect();
            throw th;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
        httpURLConnection.disconnect();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "getRuntime, component is null");
            return null;
        }
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "getRuntime, can not get runtime from component");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar).t3();
        if (t37 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "getRuntime, runtime is null");
        }
        return t37;
    }

    public static boolean c(java.lang.String str, java.io.InputStream inputStream) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid target nil, no check");
            return true;
        }
        java.lang.String c17 = kk.k.c(inputStream, 4096);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid file:%s target:%s", c17, str);
        return str.equals(c17);
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid target nil, no check");
            return true;
        }
        java.lang.String e17 = kk.k.e(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLiveFileLoadHelper", "isMd5Valid file:%s target:%s", e17, str);
        return str.equals(e17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0271, code lost:
    
        if (r7 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0286, code lost:
    
        if (r7 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r12 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (r12 == 0) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.zip.ZipInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [xf1.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r19, java.lang.String r20, boolean r21, java.lang.String r22, xf1.e r23) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xf1.f.e(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String, boolean, java.lang.String, xf1.e):void");
    }

    public static java.lang.String f(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return kk.k.g(str.getBytes());
    }
}
