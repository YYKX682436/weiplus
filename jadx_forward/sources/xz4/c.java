package xz4;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final xz4.k f539786d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.Future f539787e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.HttpURLConnection f539788f;

    /* renamed from: g, reason: collision with root package name */
    public int f539789g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f539791i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f539792m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f539793n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f539794o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f539795p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f539796q;

    /* renamed from: h, reason: collision with root package name */
    public int f539790h = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f539797r = false;

    public c(xz4.k kVar) {
        this.f539786d = kVar;
    }

    public static long e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return java.lang.Long.valueOf(str).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public final void a(int i17, javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        javax.net.ssl.SSLContext sSLContext;
        try {
            sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.2");
        } catch (java.lang.Exception unused) {
            sSLContext = null;
        }
        if (sSLContext == null) {
            try {
                sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1");
            } catch (java.lang.Exception unused2) {
                sSLContext = null;
            }
            if (sSLContext == null) {
                try {
                    sSLContext = javax.net.ssl.SSLContext.getDefault();
                } catch (java.lang.Exception unused3) {
                }
            }
        }
        if (sSLContext != null) {
            try {
                sSLContext.init(null, null, new java.security.SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                return;
            } catch (java.lang.Exception unused4) {
            }
        }
        httpsURLConnection.setSSLSocketFactory(android.net.SSLCertificateSocketFactory.getDefault(i17, new android.net.SSLSessionCache(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }

    public final boolean b() {
        xz4.k kVar = this.f539786d;
        long g17 = o35.a.g(kVar.f539816g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgDownloadTask", "%s: RangeOffset = %d", kVar.f539810a, java.lang.Long.valueOf(g17));
        if (g17 == 0) {
            return false;
        }
        this.f539788f.addRequestProperty("Range", "bytes=" + g17 + "-");
        return true;
    }

    public final java.io.OutputStream c(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            throw new java.io.FileNotFoundException(java.lang.String.format("%s filePath is null or nil", str2));
        }
        return new java.io.BufferedOutputStream(com.p314xaae8f345.mm.vfs.w6.K(str, z17));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b1 A[Catch: all -> 0x01b4, Exception -> 0x01ba, TRY_ENTER, TryCatch #6 {Exception -> 0x01ba, all -> 0x01b4, blocks: (B:3:0x000a, B:7:0x002e, B:12:0x0032, B:16:0x0073, B:19:0x007c, B:20:0x00ce, B:22:0x00f5, B:23:0x00fe, B:25:0x0129, B:27:0x0133, B:90:0x013e, B:91:0x008d, B:93:0x0095, B:95:0x009d, B:98:0x00a0, B:101:0x00b1, B:106:0x00c2, B:107:0x0066, B:109:0x006a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c2 A[Catch: all -> 0x01b4, Exception -> 0x01ba, TryCatch #6 {Exception -> 0x01ba, all -> 0x01b4, blocks: (B:3:0x000a, B:7:0x002e, B:12:0x0032, B:16:0x0073, B:19:0x007c, B:20:0x00ce, B:22:0x00f5, B:23:0x00fe, B:25:0x0129, B:27:0x0133, B:90:0x013e, B:91:0x008d, B:93:0x0095, B:95:0x009d, B:98:0x00a0, B:101:0x00b1, B:106:0x00c2, B:107:0x0066, B:109:0x006a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[Catch: all -> 0x01b4, Exception -> 0x01ba, TryCatch #6 {Exception -> 0x01ba, all -> 0x01b4, blocks: (B:3:0x000a, B:7:0x002e, B:12:0x0032, B:16:0x0073, B:19:0x007c, B:20:0x00ce, B:22:0x00f5, B:23:0x00fe, B:25:0x0129, B:27:0x0133, B:90:0x013e, B:91:0x008d, B:93:0x0095, B:95:0x009d, B:98:0x00a0, B:101:0x00b1, B:106:0x00c2, B:107:0x0066, B:109:0x006a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe A[Catch: all -> 0x01b4, Exception -> 0x01ba, TryCatch #6 {Exception -> 0x01ba, all -> 0x01b4, blocks: (B:3:0x000a, B:7:0x002e, B:12:0x0032, B:16:0x0073, B:19:0x007c, B:20:0x00ce, B:22:0x00f5, B:23:0x00fe, B:25:0x0129, B:27:0x0133, B:90:0x013e, B:91:0x008d, B:93:0x0095, B:95:0x009d, B:98:0x00a0, B:101:0x00b1, B:106:0x00c2, B:107:0x0066, B:109:0x006a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c2 A[Catch: all -> 0x021f, TryCatch #7 {all -> 0x021f, blocks: (B:46:0x01be, B:48:0x01c2, B:49:0x020b, B:51:0x01c7, B:53:0x01d1, B:54:0x01d6, B:57:0x0209, B:58:0x01dd, B:61:0x01e4, B:64:0x01eb, B:67:0x01f2, B:70:0x01f9, B:73:0x0200), top: B:45:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7 A[Catch: all -> 0x021f, TryCatch #7 {all -> 0x021f, blocks: (B:46:0x01be, B:48:0x01c2, B:49:0x020b, B:51:0x01c7, B:53:0x01d1, B:54:0x01d6, B:57:0x0209, B:58:0x01dd, B:61:0x01e4, B:64:0x01eb, B:67:0x01f2, B:70:0x01f9, B:73:0x0200), top: B:45:0x01be }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz4.c.d():void");
    }

    public final void f() {
        this.f539788f.setRequestProperty("Accept-Encoding", "gzip, deflate");
        java.lang.String property = java.lang.System.getProperty("http.agent");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property)) {
            return;
        }
        this.f539788f.setRequestProperty("User-agent", property);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x018d, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        r8 = r19.f539786d;
        r0 = r8.f539820k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0192, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0194, code lost:
    
        ((xz4.f) r0).a(new xz4.l(r8, 2, r19.f539790h, r19.f539797r ? 1 : 0, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0140, code lost:
    
        if (r6.f539815f.startsWith("https") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0144, code lost:
    
        if (r19.f539790h != 1013) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0146, code lost:
    
        if (r14 < 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0148, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgDownloadTask", "change https to http request");
        r6.f539815f = r6.f539815f.replaceFirst("https", "http");
        r19.f539790h = 0;
        r19.f539797r = false;
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5 A[LOOP:0: B:9:0x0019->B:52:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[EDGE_INSN: B:53:0x018d->B:54:0x018d BREAK  A[LOOP:0: B:9:0x0019->B:52:0x01a5], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz4.c.run():void");
    }
}
