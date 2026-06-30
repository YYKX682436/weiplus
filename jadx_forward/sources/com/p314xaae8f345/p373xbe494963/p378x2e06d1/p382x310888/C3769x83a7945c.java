package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.http.HttpClientAndroid */
/* loaded from: classes13.dex */
public class C3769x83a7945c {

    /* renamed from: ERROR_CODE_INVALID_REQUEST */
    private static final int f14653xb5fe5fac = 0;

    /* renamed from: HTTPS_PREFIX */
    private static final java.lang.String f14654x5f162886 = "https://";

    /* renamed from: HTTP_PREFIX */
    private static final java.lang.String f14655x53d57a29 = "http://";

    /* renamed from: METHOD_GET */
    private static final java.lang.String f14656xf1e5aed8 = "GET";

    /* renamed from: METHOD_POST */
    private static final java.lang.String f14657x4ad4693e = "POST";

    /* renamed from: METHOD_PUT */
    private static final java.lang.String f14658xf1e5d291 = "PUT";

    /* renamed from: READ_STREAM_SIZE */
    private static final int f14659xeafe7c37 = 1388;

    /* renamed from: REDIRECT_REQUEST_MAX */
    private static final int f14660x50ba6391 = 3;
    private static final java.lang.String TAG = "HttpClientAndroid";

    /* renamed from: mLock */
    private static final java.lang.Object f14661x6243b38 = new java.lang.Object();

    /* renamed from: mConnection */
    private java.net.HttpURLConnection f14662xadf6772b;

    /* renamed from: mHttpConfig */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.b f14663xf870ea37;

    /* renamed from: mHttpHandler */
    private final android.os.Handler f14664x646cef5;

    /* renamed from: mLastRequestURL */
    private java.lang.String f14666x155fcd63;

    /* renamed from: mNativeHttpClientAndroidJni */
    private long f14668x717cfe8d;

    /* renamed from: mRunningRequestMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e> f14674xcce3927f = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: mLocker */
    private final java.lang.Object f14667xe0259e5 = new java.lang.Object();

    /* renamed from: mInternalState */
    private volatile com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c f14665xc745c467 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.NONE;

    /* renamed from: mTotalReadBytes */
    private long f14676xf3a2bf5e = 0;

    /* renamed from: mStartReadTime */
    private long f14675x2eec1498 = 0;

    /* renamed from: mReadDataBytes */
    byte[] f14671xd208527e = new byte[f14659xeafe7c37];

    /* renamed from: mPausedRepeatDownloading */
    private boolean f14670x6a783304 = false;

    /* renamed from: mReallyNetworkChannel */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d f14672x6325438d = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.DEFAULT;

    /* renamed from: mNetworkCallback */
    private android.net.ConnectivityManager.NetworkCallback f14669x79780066 = null;

    /* renamed from: mRepeatDownloadingStatusCode */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h f14673x77dfcb71 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kUnknownError;

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$a */
    /* loaded from: classes13.dex */
    public static class a extends java.net.Authenticator {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f127841a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f127842b;

        public a(java.lang.String str, java.lang.String str2) {
            this.f127841a = str;
            this.f127842b = str2;
        }

        @Override // java.net.Authenticator
        public final java.net.PasswordAuthentication getPasswordAuthentication() {
            return new java.net.PasswordAuthentication(this.f127841a, this.f127842b.toCharArray());
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$b */
    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f127843a;

        /* renamed from: b, reason: collision with root package name */
        int f127844b;

        /* renamed from: c, reason: collision with root package name */
        int f127845c;

        /* renamed from: d, reason: collision with root package name */
        boolean f127846d;

        /* renamed from: e, reason: collision with root package name */
        int f127847e;

        /* renamed from: f, reason: collision with root package name */
        int f127848f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f127849g;

        /* renamed from: h, reason: collision with root package name */
        java.lang.String f127850h;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f127851i;

        /* renamed from: j, reason: collision with root package name */
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d f127852j;

        public b(int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d dVar) {
            this.f127843a = i17;
            this.f127844b = i18;
            this.f127845c = i19;
            this.f127846d = z17;
            this.f127847e = i27;
            this.f127848f = i28;
            this.f127849g = str;
            this.f127850h = str2;
            this.f127851i = str3;
            this.f127852j = dVar;
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$c */
    /* loaded from: classes6.dex */
    public enum c {
        NONE,
        RUNNING_REPEAT,
        RUNNING_ONCE
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$d */
    /* loaded from: classes13.dex */
    public enum d {
        DEFAULT(0),
        WIFI(1),
        CELLULAR(2);


        /* renamed from: nativeValue */
        int f14677x67d8c79a;

        d(int i17) {
            this.f14677x67d8c79a = i17;
        }

        public static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d a(int i17) {
            for (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d dVar : m29389xcee59d22()) {
                if (dVar.f14677x67d8c79a == i17) {
                    return dVar;
                }
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.TAG, "Invalid value:".concat(java.lang.String.valueOf(i17)));
            return DEFAULT;
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$e */
    /* loaded from: classes13.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        long f127861a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f127862b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f127863c;

        /* renamed from: d, reason: collision with root package name */
        byte[] f127864d;

        /* renamed from: e, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f127865e;

        /* renamed from: f, reason: collision with root package name */
        int f127866f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f127867g;

        /* renamed from: h, reason: collision with root package name */
        boolean f127868h;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f127869i;

        /* renamed from: j, reason: collision with root package name */
        byte[] f127870j;

        /* renamed from: k, reason: collision with root package name */
        byte[] f127871k;

        public e(java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17) {
            this(str, str2, bArr, map, z17, "", null, null);
        }

        public final boolean a() {
            if (android.text.TextUtils.isEmpty(this.f127862b)) {
                return false;
            }
            return this.f127862b.startsWith(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14655x53d57a29) || this.f127862b.startsWith(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14654x5f162886);
        }

        public final boolean b() {
            byte[] bArr = this.f127864d;
            return bArr != null && bArr.length > 0;
        }

        public final boolean c() {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14657x4ad4693e.equals(d()) || com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14658xf1e5d291.equals(d());
        }

        public final java.lang.String d() {
            return android.text.TextUtils.isEmpty(this.f127863c) ? "" : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14657x4ad4693e.equalsIgnoreCase(this.f127863c) ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14657x4ad4693e : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14656xf1e5aed8.equalsIgnoreCase(this.f127863c) ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14656xf1e5aed8 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14658xf1e5d291.equalsIgnoreCase(this.f127863c) ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f14658xf1e5d291 : "";
        }

        /* renamed from: toString */
        public final java.lang.String m29390x9616526c() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request{requestId=");
            sb6.append(this.f127861a);
            sb6.append(", url='");
            sb6.append(this.f127862b);
            sb6.append("', method='");
            sb6.append(this.f127863c);
            sb6.append("', body.size=");
            sb6.append(b() ? this.f127864d.length : 0);
            sb6.append(", headers=");
            sb6.append(this.f127865e);
            sb6.append(", autoRedirect=");
            sb6.append(this.f127868h);
            sb6.append('}');
            return sb6.toString();
        }

        public e(java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, java.lang.String str3, byte[] bArr2, byte[] bArr3) {
            this.f127862b = str;
            this.f127863c = str2;
            this.f127864d = bArr;
            this.f127865e = map;
            this.f127866f = 0;
            this.f127867g = "";
            this.f127868h = z17;
            this.f127869i = str3;
            this.f127870j = bArr2;
            this.f127871k = bArr3;
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$f */
    /* loaded from: classes13.dex */
    public static class f {

        /* renamed from: c, reason: collision with root package name */
        java.nio.ByteBuffer f127874c;

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h f127872a = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kUnknownError;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f127873b = "";

        /* renamed from: d, reason: collision with root package name */
        int f127875d = 0;

        /* renamed from: e, reason: collision with root package name */
        java.lang.String f127876e = "";

        /* renamed from: f, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f127877f = null;

        /* renamed from: g, reason: collision with root package name */
        int f127878g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f127879h = 0;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f127880i = "";
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$g */
    /* loaded from: classes6.dex */
    public enum g {
        CONNECTED(0),
        DISCONNECTED(1),
        FINISHED(2);


        /* renamed from: nativeValue */
        int f14678x67d8c79a;

        g(int i17) {
            this.f14678x67d8c79a = i17;
        }
    }

    /* renamed from: com.tencent.liteav.base.http.HttpClientAndroid$h */
    /* loaded from: classes13.dex */
    public enum h {
        kHTTP200OK(200),
        kHTTP204NoContent(204),
        kHTTP206PartialContent(206),
        kHTTP301MovedPermanently(301),
        kHTTP302Found(302),
        kHTTP303SeeOther(303),
        kHTTP304NotModified(304),
        kHTTP307TemporaryRedirect(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8),
        kHTTP308PermanentRedirect(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7),
        kHTTP403Forbidden(403),
        kHTTP404NotFound(404),
        kHTTP405MethodNotAllowed(405),
        kHTTP503ServiceUnavailable(503),
        kSystemFileOpenFailed(1001),
        kSystemFileWriteFailed(1002),
        kSystemUnknownHost(1003),
        kSystemConnectHostFailed(1004),
        kSystemCreateSocketFailed(1005),
        kSystemNetworkDisabled(1006),
        kSystemConnectTimeout(1007),
        kSystemConnectRefused(1008),
        kSystemProtocolError(1009),
        kSystemSSLError(1010),
        kUnknownError(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.f10219x6e770e02);


        /* renamed from: nativeValue */
        final int f14679x67d8c79a;

        h(int i17) {
            this.f14679x67d8c79a = i17;
        }
    }

    public C3769x83a7945c(int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.String str, java.lang.String str2, java.lang.String str3, int i29, long j17) {
        this.f14663xf870ea37 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.b(i17, i18, i19, z17, i27, i28, str, str2, str3, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.a(i29));
        this.f14668x717cfe8d = j17;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("HttpClient_" + hashCode());
        handlerThread.start();
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "Create http client(" + hashCode() + "). [ThreadName:" + handlerThread.getName() + "][ThreadId:" + handlerThread.getId() + "]");
        this.f14664x646cef5 = new android.os.Handler(handlerThread.getLooper());
    }

    /* renamed from: checkNativeValid */
    private boolean m29346x183a93fd() {
        boolean z17;
        synchronized (this.f14667xe0259e5) {
            z17 = this.f14668x717cfe8d != -1;
        }
        return z17;
    }

    /* renamed from: checkRequestValid */
    private boolean m29347xa8fedbd5(long j17) {
        return this.f14674xcce3927f.containsKey(java.lang.Long.valueOf(j17));
    }

    /* renamed from: closeConnectionSafely */
    private void m29348xe55d9c70(java.net.HttpURLConnection httpURLConnection) {
        if (this.f14669x79780066 != null && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 23) {
            try {
                try {
                    ((android.net.ConnectivityManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("connectivity")).unregisterNetworkCallback(this.f14669x79780066);
                } finally {
                    this.f14669x79780066 = null;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")" + com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.m29257x2d915d84(e17));
            }
        }
        if (httpURLConnection != null) {
            try {
                try {
                    m29349x33a6491e(httpURLConnection.getInputStream());
                    try {
                        httpURLConnection.disconnect();
                    } catch (java.lang.Exception unused) {
                    }
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Exception unused3) {
                httpURLConnection.disconnect();
            } catch (java.lang.Throwable th6) {
                try {
                    httpURLConnection.disconnect();
                } catch (java.lang.Exception unused4) {
                }
                throw th6;
            }
        }
    }

    /* renamed from: closeIO */
    private void m29349x33a6491e(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: createConnection */
    private java.net.HttpURLConnection m29350x3e93f0fa(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e eVar) {
        java.net.Proxy proxy;
        java.net.HttpURLConnection m29351x3e93f0fa;
        java.lang.String replace = eVar.f127862b.replace(" ", "%20");
        java.net.URL url = new java.net.URL(replace);
        if (!android.text.TextUtils.isEmpty(this.f14663xf870ea37.f127849g) && this.f14663xf870ea37.f127848f > 0) {
            java.net.Proxy.Type type = java.net.Proxy.Type.SOCKS;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.b bVar = this.f14663xf870ea37;
            proxy = new java.net.Proxy(type, new java.net.InetSocketAddress(bVar.f127849g, bVar.f127848f));
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.b bVar2 = this.f14663xf870ea37;
            java.net.Authenticator.setDefault(new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.a(bVar2.f127850h, bVar2.f127851i));
        } else {
            proxy = ("127.0.0.1".equals(url.getHost()) || "localhost".equals(url.getHost())) ? java.net.Proxy.NO_PROXY : null;
        }
        if (proxy != null) {
            m29351x3e93f0fa = m29351x3e93f0fa(url, proxy);
        } else {
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.m29539x102542d7(url.getHost())) {
                try {
                    java.lang.String m29533x49c8f041 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.m29533x49c8f041(replace, url.getHost());
                    if (!android.text.TextUtils.isEmpty(m29533x49c8f041)) {
                        m29351x3e93f0fa = m29351x3e93f0fa(new java.net.URL(m29533x49c8f041), null);
                        m29351x3e93f0fa.setRequestProperty("Host", url.getHost());
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.m29532xa6d7160(m29351x3e93f0fa, url.getHost());
                    } else {
                        m29351x3e93f0fa = m29351x3e93f0fa(new java.net.URL(replace), null);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")createConnectionUseCustomHttpDNS failed. error: " + com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.m29257x2d915d84(e17));
                }
            }
            m29351x3e93f0fa = m29351x3e93f0fa(url, null);
        }
        m29351x3e93f0fa.setInstanceFollowRedirects(false);
        m29351x3e93f0fa.setConnectTimeout(this.f14663xf870ea37.f127843a);
        m29351x3e93f0fa.setReadTimeout(this.f14663xf870ea37.f127844b);
        m29351x3e93f0fa.setRequestProperty("Accept-Encoding", "identity");
        m29351x3e93f0fa.setRequestMethod(eVar.d());
        if (eVar.c()) {
            m29351x3e93f0fa.setDoOutput(true);
        }
        if (this.f14663xf870ea37.f127846d) {
            m29351x3e93f0fa.setRequestProperty("Connection", "Keep-Alive");
        } else {
            m29351x3e93f0fa.setRequestProperty("Connection", "close");
        }
        java.util.Map<java.lang.String, java.lang.String> map = eVar.f127865e;
        if (map != null && !map.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : eVar.f127865e.entrySet()) {
                m29351x3e93f0fa.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return m29351x3e93f0fa;
    }

    /* renamed from: createConnectionByNetworkType */
    private java.net.HttpURLConnection m29352xd8660ad7(final java.net.URL url, final java.net.Proxy proxy) {
        int i17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d dVar = this.f14663xf870ea37.f127852j;
        if (dVar == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.WIFI) {
            i17 = 1;
        } else {
            if (dVar != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.CELLULAR) {
                return null;
            }
            i17 = 0;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.net.HttpURLConnection[] httpURLConnectionArr = {null};
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(i17).build();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("connectivity");
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(android.net.Network network) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c c3769x83a7945c = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this;
                c3769x83a7945c.f14672x6325438d = c3769x83a7945c.f14663xf870ea37.f127852j;
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.TAG, "(" + com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.hashCode() + ")createConnectionSpecifyNetwork onAvailable.");
                try {
                    try {
                        java.net.Proxy proxy2 = proxy;
                        if (proxy2 == null) {
                            httpURLConnectionArr[0] = (java.net.HttpURLConnection) network.openConnection(url);
                        } else {
                            httpURLConnectionArr[0] = (java.net.HttpURLConnection) network.openConnection(url, proxy2);
                        }
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.TAG, "(" + com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.hashCode() + ")createConnectionSpecifyNetwork failed. error: " + com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.m29257x2d915d84(e17));
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(android.net.Network network) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.TAG, "(" + com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.hashCode() + ")createConnectionSpecifyNetwork onLost.");
                countDownLatch.countDown();
            }
        };
        this.f14669x79780066 = networkCallback;
        connectivityManager.requestNetwork(build, networkCallback);
        try {
            countDownLatch.await(2L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork timeout.");
        }
        if (httpURLConnectionArr[0] != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork success.");
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork lost or timeout.");
        }
        return httpURLConnectionArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x001e, B:13:0x0027, B:15:0x0038, B:17:0x003e, B:18:0x006d), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x001e, B:13:0x0027, B:15:0x0038, B:17:0x003e, B:18:0x006d), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0026  */
    /* renamed from: doCallbackAndResetState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g r23, long r24, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f r26, boolean r27) {
        /*
            r22 = this;
            r1 = r22
            r0 = r26
            java.lang.Object r2 = r1.f14667xe0259e5
            monitor-enter(r2)
            boolean r3 = r22.m29346x183a93fd()     // Catch: java.lang.Throwable -> L79
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1b
            r10 = r24
            boolean r3 = r1.m29347xa8fedbd5(r10)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L1d
            if (r0 == 0) goto L1d
            r3 = r4
            goto L1e
        L1b:
            r10 = r24
        L1d:
            r3 = r5
        L1e:
            com.tencent.liteav.base.http.HttpClientAndroid$c r6 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_REPEAT     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$c r7 = r1.f14665xc745c467     // Catch: java.lang.Throwable -> L79
            if (r6 != r7) goto L26
            r8 = r4
            goto L27
        L26:
            r8 = r5
        L27:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$e> r4 = r1.f14674xcce3927f     // Catch: java.lang.Throwable -> L79
            java.lang.Long r5 = java.lang.Long.valueOf(r24)     // Catch: java.lang.Throwable -> L79
            r4.remove(r5)     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$e> r4 = r1.f14674xcce3927f     // Catch: java.lang.Throwable -> L79
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L3c
            com.tencent.liteav.base.http.HttpClientAndroid$c r4 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.NONE     // Catch: java.lang.Throwable -> L79
            r1.f14665xc745c467 = r4     // Catch: java.lang.Throwable -> L79
        L3c:
            if (r3 == 0) goto L6d
            long r6 = r1.f14668x717cfe8d     // Catch: java.lang.Throwable -> L79
            r3 = r23
            int r9 = r3.f14678x67d8c79a     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$h r3 = r0.f127872a     // Catch: java.lang.Throwable -> L79
            int r12 = r3.f14679x67d8c79a     // Catch: java.lang.Throwable -> L79
            java.lang.String r13 = r0.f127873b     // Catch: java.lang.Throwable -> L79
            int r14 = r0.f127878g     // Catch: java.lang.Throwable -> L79
            java.nio.ByteBuffer r15 = r0.f127874c     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.f127876e     // Catch: java.lang.Throwable -> L79
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f127877f     // Catch: java.lang.Throwable -> L79
            int r5 = r0.f127875d     // Catch: java.lang.Throwable -> L79
            r18 = r5
            int r5 = r0.f127879h     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.f127880i     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$d r10 = r1.f14672x6325438d     // Catch: java.lang.Throwable -> L79
            int r10 = r10.f14677x67d8c79a     // Catch: java.lang.Throwable -> L79
            r21 = r10
            r10 = r24
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r0
            m29370x80d27ebb(r6, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L79
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            if (r27 == 0) goto L78
            java.net.HttpURLConnection r0 = r1.f14662xadf6772b
            r1.m29348xe55d9c70(r0)
            r0 = 0
            r1.f14662xadf6772b = r0
        L78:
            return
        L79:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.m29353xab2865a9(com.tencent.liteav.base.http.HttpClientAndroid$g, long, com.tencent.liteav.base.http.HttpClientAndroid$f, boolean):void");
    }

    /* renamed from: doOnCallback */
    private boolean m29354xa2363a2f(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g gVar, long j17, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar) {
        synchronized (this.f14667xe0259e5) {
            if (!m29346x183a93fd() || !m29347xa8fedbd5(j17) || fVar == null) {
                return false;
            }
            return m29370x80d27ebb(this.f14668x717cfe8d, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_REPEAT == this.f14665xc745c467, gVar.f14678x67d8c79a, j17, fVar.f127872a.f14679x67d8c79a, fVar.f127873b, fVar.f127878g, fVar.f127874c, fVar.f127876e, fVar.f127877f, fVar.f127875d, fVar.f127879h, fVar.f127880i, this.f14672x6325438d.f14677x67d8c79a);
        }
    }

    /* renamed from: doReadData */
    private void m29355x8679b80b(long j17, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar) {
        boolean z17;
        int read;
        long j18;
        if (!m29347xa8fedbd5(j17)) {
            m29348xe55d9c70(this.f14662xadf6772b);
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")Do read data failed. Invalid request id. id:" + j17);
            return;
        }
        try {
            java.io.InputStream inputStream = this.f14662xadf6772b.getInputStream();
            synchronized (this.f14667xe0259e5) {
                z17 = this.f14665xc745c467 == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_ONCE;
            }
            long j19 = 0;
            if (z17) {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    do {
                        read = inputStream.read(this.f14671xd208527e);
                        if (read > 0) {
                            byteArrayOutputStream.write(this.f14671xd208527e, 0, read);
                        }
                    } while (read > 0 && m29347xa8fedbd5(j17));
                    int size = byteArrayOutputStream.size();
                    if (size > 0) {
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(size);
                        fVar.f127874c = allocateDirect;
                        allocateDirect.put(byteArrayOutputStream.toByteArray(), 0, size);
                        fVar.f127875d = size;
                    }
                    j18 = 0;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    fVar.f127872a = m29362xfd0160f5(th6);
                    fVar.f127873b = th6.toString();
                    m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.DISCONNECTED, j17, fVar, true);
                    return;
                }
            } else {
                try {
                    int read2 = inputStream.read(this.f14671xd208527e);
                    this.f14676xf3a2bf5e += read2;
                    j18 = android.os.SystemClock.elapsedRealtime();
                    if (read2 > 0) {
                        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(read2);
                        fVar.f127874c = allocateDirect2;
                        allocateDirect2.put(this.f14671xd208527e, 0, read2);
                        fVar.f127875d = read2;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    fVar.f127872a = m29362xfd0160f5(e17);
                    fVar.f127873b = e17.toString();
                    m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.DISCONNECTED, j17, fVar, true);
                    return;
                }
            }
            if (fVar.f127875d == 0 && !z17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")Do read data failed. Rsp size is 0.");
                m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.FINISHED, j17, fVar, this.f14663xf870ea37.f127846d ^ true);
                return;
            }
            if (z17) {
                m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.FINISHED, j17, fVar, !this.f14663xf870ea37.f127846d);
                return;
            }
            boolean m29354xa2363a2f = m29354xa2363a2f(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.CONNECTED, j17, fVar);
            this.f14670x6a783304 = m29354xa2363a2f;
            this.f14673x77dfcb71 = fVar.f127872a;
            if (m29354xa2363a2f) {
                return;
            }
            int i17 = this.f14663xf870ea37.f127847e;
            if (i17 > 0) {
                long j27 = this.f14675x2eec1498;
                long j28 = j18 - j27 == 0 ? 1L : j18 - j27;
                long j29 = this.f14676xf3a2bf5e;
                if (j29 / j28 > i17 / 1000) {
                    j19 = ((j29 * 1000) / i17) - j28;
                }
            }
            this.f14664x646cef5.postDelayed(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.f.a(this, fVar, j17), j19);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Do read data failed. Fail to get InputStream.");
            fVar.f127872a = m29362xfd0160f5(e18);
            fVar.f127873b = e18.toString();
            m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.DISCONNECTED, j17, fVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRequest */
    public void m29356x99e55b84(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e eVar) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h hVar;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar = null;
        for (int i17 = 0; i17 < 4; i17++) {
            fVar = m29363xef9b2512(eVar);
            if (fVar == null) {
                return;
            }
            if (!eVar.f127868h || ((hVar = fVar.f127872a) != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP301MovedPermanently && hVar != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP302Found)) {
                break;
            }
            java.lang.String headerField = this.f14662xadf6772b.getHeaderField("Location");
            eVar.f127862b = headerField;
            eVar.f127866f++;
            eVar.f127867g = headerField;
        }
        this.f14676xf3a2bf5e = 0L;
        this.f14675x2eec1498 = android.os.SystemClock.elapsedRealtime();
        m29355x8679b80b(eVar.f127861a, fVar);
    }

    /* renamed from: getJavaHashMap */
    public static java.util.HashMap m29357x510513b6(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return new java.util.HashMap();
        }
        if (strArr.length != strArr2.length) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "Invalid parameter, keys and values do not match.");
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            hashMap.put(strArr[i17], strArr2[i17]);
        }
        return hashMap;
    }

    /* renamed from: getMapKeys */
    public static java.lang.String[] m29358x6fa8753a(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.isEmpty()) {
            return new java.lang.String[0];
        }
        java.util.Set<java.lang.String> keySet = map.keySet();
        return (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
    }

    /* renamed from: getMapValue */
    public static java.lang.String[] m29359x85ff32eb(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String[] strArr) {
        if (map == null || map.isEmpty() || strArr == null || strArr.length == 0) {
            return new java.lang.String[0];
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            strArr2[i17] = map.get(strArr[i17]);
        }
        return strArr2;
    }

    /* renamed from: getResponseHeaders */
    private java.util.Map<java.lang.String, java.lang.String> m29360x3718a9cf(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (!android.text.TextUtils.isEmpty(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return hashMap;
    }

    /* renamed from: getStatusCode */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h m29361xfd0160f5(int i17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h hVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kUnknownError;
        if (i17 == 200) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP200OK;
        }
        if (i17 == 204) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP204NoContent;
        }
        if (i17 == 206) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP206PartialContent;
        }
        if (i17 == 301) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP301MovedPermanently;
        }
        if (i17 == 302) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP302Found;
        }
        if (i17 == 303) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP303SeeOther;
        }
        if (i17 == 304) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP304NotModified;
        }
        if (i17 == 307) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP307TemporaryRedirect;
        }
        if (i17 == 308) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP308PermanentRedirect;
        }
        if (i17 == 403) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP403Forbidden;
        }
        if (i17 == 404) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP404NotFound;
        }
        if (i17 == 405) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP405MethodNotAllowed;
        }
        if (i17 == 503) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kHTTP503ServiceUnavailable;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "(" + hashCode() + ")Failed to convert status code：" + i17, new java.lang.Object[0]);
        return hVar;
    }

    /* renamed from: internalRequest */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f m29363xef9b2512(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e eVar) {
        boolean z17;
        if (!eVar.a()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Send request failed. Invalid request url(" + eVar.f127862b + ").");
            return null;
        }
        if (!m29347xa8fedbd5(eVar.f127861a)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")Do send failed. ignore request when cancelled. request:" + eVar);
            return null;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f();
        fVar.f127879h = eVar.f127866f;
        fVar.f127880i = eVar.f127867g;
        synchronized (this.f14667xe0259e5) {
            z17 = this.f14665xc745c467 == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_ONCE;
        }
        if (z17 && this.f14662xadf6772b != null && !eVar.f127862b.equals(this.f14666x155fcd63)) {
            m29348xe55d9c70(this.f14662xadf6772b);
            this.f14662xadf6772b = null;
        }
        this.f14666x155fcd63 = eVar.f127862b;
        try {
            this.f14662xadf6772b = m29350x3e93f0fa(eVar);
            m29376x46debf72(eVar);
            try {
                fVar.f127872a = m29361xfd0160f5(this.f14662xadf6772b.getResponseCode());
                fVar.f127873b = this.f14662xadf6772b.getResponseMessage();
                fVar.f127876e = m29373x166b0079(this.f14662xadf6772b.getURL().getHost());
                fVar.f127878g = this.f14662xadf6772b.getURL().getPort();
                fVar.f127877f = m29360x3718a9cf(this.f14662xadf6772b.getHeaderFields());
                if (m29347xa8fedbd5(eVar.f127861a)) {
                    return fVar;
                }
                m29348xe55d9c70(this.f14662xadf6772b);
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")Do send failed. Invalid request, abort request.");
                return null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Do send failed. Catch error. ex= " + com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.m29257x2d915d84(e17));
                fVar.f127872a = m29362xfd0160f5(e17);
                fVar.f127873b = e17.toString();
                m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.DISCONNECTED, eVar.f127861a, fVar, true);
                return null;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Do send failed. Fail to create http connection. ex= " + com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.m29257x2d915d84(e18));
            fVar.f127872a = m29362xfd0160f5(e18);
            fVar.f127873b = e18.toString();
            m29353xab2865a9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.g.DISCONNECTED, eVar.f127861a, fVar, true);
            return null;
        }
    }

    /* renamed from: lambda$cancelAll$1 */
    public static /* synthetic */ void m29364x3eee9a37(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c c3769x83a7945c) {
        c3769x83a7945c.m29348xe55d9c70(c3769x83a7945c.f14662xadf6772b);
        c3769x83a7945c.f14662xadf6772b = null;
    }

    /* renamed from: lambda$destroy$4 */
    public static /* synthetic */ void m29365xec0ffd6d(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c c3769x83a7945c) {
        c3769x83a7945c.m29348xe55d9c70(c3769x83a7945c.f14662xadf6772b);
        c3769x83a7945c.f14662xadf6772b = null;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 18) {
            c3769x83a7945c.f14664x646cef5.getLooper().quitSafely();
        } else {
            c3769x83a7945c.f14664x646cef5.getLooper().quit();
        }
    }

    /* renamed from: lambda$doReadData$5 */
    public static /* synthetic */ void m29366xf96a1799(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c c3769x83a7945c, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar, long j17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar2 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f();
        fVar2.f127872a = fVar.f127872a;
        c3769x83a7945c.m29355x8679b80b(j17, fVar2);
    }

    /* renamed from: lambda$resumeRepeatDownload$2 */
    public static /* synthetic */ void m29367xbaf7cadb(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c c3769x83a7945c, java.lang.Long l17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f();
        fVar.f127872a = c3769x83a7945c.f14673x77dfcb71;
        c3769x83a7945c.m29355x8679b80b(l17.longValue(), fVar);
    }

    /* renamed from: lambda$resumeRepeatDownload$3 */
    public static /* synthetic */ void m29368xbaf7cadc(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c c3769x83a7945c, long j17) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f fVar = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.f();
        fVar.f127872a = c3769x83a7945c.f14673x77dfcb71;
        c3769x83a7945c.m29355x8679b80b(j17, fVar);
    }

    /* renamed from: nativeOnCallback */
    private static native boolean m29370x80d27ebb(long j17, boolean z17, int i17, long j18, int i18, java.lang.String str, int i19, java.nio.ByteBuffer byteBuffer, java.lang.String str2, java.util.Map map, int i27, int i28, java.lang.String str3, int i29);

    /* renamed from: nativeOnUploadProgress */
    private static native void m29371xf300d144(long j17, long j18, long j19, long j27);

    /* renamed from: openConnection */
    private java.net.HttpURLConnection m29372x946eacc8(java.net.URL url, java.net.Proxy proxy) {
        return proxy != null ? (java.net.HttpURLConnection) url.openConnection(proxy) : (java.net.HttpURLConnection) url.openConnection();
    }

    /* renamed from: parseHostAddress */
    private java.lang.String m29373x166b0079(java.lang.String str) {
        try {
            return java.net.InetAddress.getByName(str).getHostAddress();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")Parse host error. host:" + str);
            return "";
        }
    }

    /* renamed from: sendInternal */
    private long m29374x3b2bf265(long j17, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e eVar, boolean z17) {
        if (eVar == null || !eVar.a()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")upload file failed. Invalid request url(" + eVar.f127862b + ").");
            return 0L;
        }
        boolean z18 = true;
        if (!(!android.text.TextUtils.isEmpty(eVar.d()))) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")upload file failed. Request method(" + eVar.f127863c + ") is not supported.");
            return 0L;
        }
        synchronized (this.f14667xe0259e5) {
            if (this.f14665xc745c467 == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.NONE) {
                this.f14665xc745c467 = z17 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_REPEAT : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_ONCE;
            } else if (this.f14665xc745c467 != com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_ONCE) {
                z18 = false;
            }
            if (z18) {
                eVar.f127861a = j17;
                this.f14674xcce3927f.put(java.lang.Long.valueOf(j17), eVar);
                this.f14664x646cef5.post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.a.a(this, eVar));
                return eVar.f127861a;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Send request failed. Invalid state:" + this.f14665xc745c467);
            return 0L;
        }
    }

    /* renamed from: uploadFileByPath */
    private void m29375xf518d299(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e eVar, java.io.OutputStream outputStream) {
        if (android.text.TextUtils.isEmpty(eVar.f127869i)) {
            return;
        }
        java.io.Closeable closeable = null;
        try {
            java.io.File file = new java.io.File(eVar.f127869i);
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[524288];
                long length = file.length();
                long j17 = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        m29349x33a6491e(fileInputStream);
                        return;
                    }
                    long j18 = j17 + read;
                    outputStream.write(bArr, 0, read);
                    m29371xf300d144(this.f14668x717cfe8d, eVar.f127861a, j18, length);
                    j17 = j18;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                closeable = fileInputStream;
                m29349x33a6491e(closeable);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: writeRequestBody */
    private void m29376x46debf72(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e eVar) {
        java.io.OutputStream outputStream = null;
        try {
            if (eVar.c() && eVar.b()) {
                outputStream = this.f14662xadf6772b.getOutputStream();
                outputStream.write(eVar.f127864d);
                outputStream.flush();
            } else if (eVar.c() && (!android.text.TextUtils.isEmpty(eVar.f127869i))) {
                outputStream = this.f14662xadf6772b.getOutputStream();
                byte[] bArr = eVar.f127870j;
                if (bArr != null && bArr.length > 0) {
                    outputStream.write(bArr);
                }
                m29375xf518d299(eVar, outputStream);
                byte[] bArr2 = eVar.f127871k;
                if (bArr2 != null && bArr2.length > 0) {
                    outputStream.write(bArr2);
                }
                outputStream.flush();
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "(" + hashCode() + ")Do write request body failed.");
        } finally {
            m29349x33a6491e(null);
        }
    }

    /* renamed from: cancel */
    public void m29377xae7a2e7a(long j17) {
        synchronized (this.f14667xe0259e5) {
            if (!m29346x183a93fd()) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                return;
            }
            if (this.f14674xcce3927f.size() == 0) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "(" + hashCode() + ")Cancel request. request:" + this.f14674xcce3927f.remove(java.lang.Long.valueOf(j17)));
            if (this.f14674xcce3927f.size() == 0) {
                this.f14665xc745c467 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.NONE;
            }
        }
    }

    /* renamed from: cancelAll */
    public void m29378x1c6788c7() {
        synchronized (this.f14667xe0259e5) {
            if (!m29346x183a93fd()) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Cancel all request failed. Invalid native handle.");
                return;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c cVar = this.f14665xc745c467;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c cVar2 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.NONE;
            if (cVar == cVar2) {
                return;
            }
            this.f14665xc745c467 = cVar2;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "(" + hashCode() + ")Cancel all. size:" + this.f14674xcce3927f.size());
            this.f14674xcce3927f.clear();
            this.f14664x646cef5.post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.b.a(this));
        }
    }

    /* renamed from: destroy */
    public void m29379x5cd39ffa() {
        synchronized (this.f14667xe0259e5) {
            this.f14674xcce3927f.clear();
            this.f14668x717cfe8d = -1L;
            this.f14664x646cef5.post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.e.a(this));
        }
    }

    /* renamed from: resumeRepeatDownload */
    public void m29380x9a9bd0d0(long j17) {
        synchronized (this.f14667xe0259e5) {
            if (!m29346x183a93fd()) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                return;
            }
            if (this.f14674xcce3927f.size() == 0) {
                return;
            }
            if (this.f14665xc745c467 == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.c.RUNNING_REPEAT && this.f14670x6a783304) {
                this.f14670x6a783304 = false;
                if (j17 == 0) {
                    java.util.Iterator<java.lang.Long> it = this.f14674xcce3927f.keySet().iterator();
                    while (it.hasNext()) {
                        this.f14664x646cef5.post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.c.a(this, it.next()));
                    }
                } else if (m29347xa8fedbd5(j17)) {
                    if (this.f14674xcce3927f.get(java.lang.Long.valueOf(j17)) == null) {
                    } else {
                        this.f14664x646cef5.post(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.d.a(this, j17));
                    }
                }
            }
        }
    }

    /* renamed from: send */
    public long m29381x35cf88(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, boolean z18) {
        if (m29346x183a93fd()) {
            return m29374x3b2bf265(j17, new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e(str, str2, bArr, map, z18), z17);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")Send request failed. Invalid native handle.");
        return 0L;
    }

    /* renamed from: updateConfig */
    public void m29382xac5f2d6b(final int i17, final int i18, final int i19, final boolean z17, final int i27, final int i28, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i29, long j17) {
        this.f14664x646cef5.post(new java.lang.Runnable() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.1
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.f14663xf870ea37 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.b(i17, i18, i19, z17, i27, i28, str, str2, str3, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.a(i29));
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.f14672x6325438d = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.DEFAULT;
                if (i27 > 0) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.f14676xf3a2bf5e = 0L;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.this.f14675x2eec1498 = android.os.SystemClock.elapsedRealtime();
                }
            }
        });
    }

    /* renamed from: uploadFile */
    public long m29383xf17c8f1d(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, boolean z18, java.lang.String str3, byte[] bArr2, byte[] bArr3) {
        if (!m29346x183a93fd()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")upload file failed. Invalid native handle.");
            return 0L;
        }
        if (!str3.isEmpty()) {
            return m29374x3b2bf265(j17, new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.e(str, str2, bArr, map, z18, str3, bArr2, bArr3), z17);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "(" + hashCode() + ")upload file failed. Invalid file path(" + str3 + ").");
        return 0L;
    }

    /* renamed from: getStatusCode */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h m29362xfd0160f5(java.lang.Throwable th6) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h hVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kUnknownError;
        if (th6 instanceof java.io.FileNotFoundException) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemFileOpenFailed;
        }
        if (th6 instanceof java.io.EOFException) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemFileWriteFailed;
        }
        if (th6 instanceof java.net.UnknownHostException) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemUnknownHost;
        }
        if (th6 instanceof java.net.NoRouteToHostException) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemConnectHostFailed;
        }
        if (!(th6 instanceof java.net.SocketException) && !(th6 instanceof java.net.MalformedURLException)) {
            if (th6 instanceof java.net.SocketTimeoutException) {
                return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemConnectTimeout;
            }
            if (th6 instanceof java.net.ConnectException) {
                return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemConnectRefused;
            }
            if (th6 instanceof java.net.ProtocolException) {
                return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemProtocolError;
            }
            if (th6 instanceof javax.net.ssl.SSLException) {
                return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemSSLError;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "(" + hashCode() + ")Failed to convert status code, exception：", th6.toString());
            return hVar;
        }
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.h.kSystemCreateSocketFailed;
    }

    /* renamed from: createConnection */
    private java.net.HttpURLConnection m29351x3e93f0fa(java.net.URL url, java.net.Proxy proxy) {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 23) {
            return m29372x946eacc8(url, proxy);
        }
        if (this.f14663xf870ea37.f127852j == com.p314xaae8f345.p373xbe494963.p378x2e06d1.p382x310888.C3769x83a7945c.d.DEFAULT) {
            return m29372x946eacc8(url, proxy);
        }
        java.net.HttpURLConnection m29352xd8660ad7 = m29352xd8660ad7(url, proxy);
        return m29352xd8660ad7 != null ? m29352xd8660ad7 : m29372x946eacc8(url, proxy);
    }
}
