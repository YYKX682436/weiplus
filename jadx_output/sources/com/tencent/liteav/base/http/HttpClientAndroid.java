package com.tencent.liteav.base.http;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes13.dex */
public class HttpClientAndroid {
    private static final int ERROR_CODE_INVALID_REQUEST = 0;
    private static final java.lang.String HTTPS_PREFIX = "https://";
    private static final java.lang.String HTTP_PREFIX = "http://";
    private static final java.lang.String METHOD_GET = "GET";
    private static final java.lang.String METHOD_POST = "POST";
    private static final java.lang.String METHOD_PUT = "PUT";
    private static final int READ_STREAM_SIZE = 1388;
    private static final int REDIRECT_REQUEST_MAX = 3;
    private static final java.lang.String TAG = "HttpClientAndroid";
    private static final java.lang.Object mLock = new java.lang.Object();
    private java.net.HttpURLConnection mConnection;
    private com.tencent.liteav.base.http.HttpClientAndroid.b mHttpConfig;
    private final android.os.Handler mHttpHandler;
    private java.lang.String mLastRequestURL;
    private long mNativeHttpClientAndroidJni;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid.e> mRunningRequestMap = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.lang.Object mLocker = new java.lang.Object();
    private volatile com.tencent.liteav.base.http.HttpClientAndroid.c mInternalState = com.tencent.liteav.base.http.HttpClientAndroid.c.NONE;
    private long mTotalReadBytes = 0;
    private long mStartReadTime = 0;
    byte[] mReadDataBytes = new byte[READ_STREAM_SIZE];
    private boolean mPausedRepeatDownloading = false;
    private com.tencent.liteav.base.http.HttpClientAndroid.d mReallyNetworkChannel = com.tencent.liteav.base.http.HttpClientAndroid.d.DEFAULT;
    private android.net.ConnectivityManager.NetworkCallback mNetworkCallback = null;
    private com.tencent.liteav.base.http.HttpClientAndroid.h mRepeatDownloadingStatusCode = com.tencent.liteav.base.http.HttpClientAndroid.h.kUnknownError;

    /* loaded from: classes13.dex */
    public static class a extends java.net.Authenticator {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f46308a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f46309b;

        public a(java.lang.String str, java.lang.String str2) {
            this.f46308a = str;
            this.f46309b = str2;
        }

        @Override // java.net.Authenticator
        public final java.net.PasswordAuthentication getPasswordAuthentication() {
            return new java.net.PasswordAuthentication(this.f46308a, this.f46309b.toCharArray());
        }
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f46310a;

        /* renamed from: b, reason: collision with root package name */
        int f46311b;

        /* renamed from: c, reason: collision with root package name */
        int f46312c;

        /* renamed from: d, reason: collision with root package name */
        boolean f46313d;

        /* renamed from: e, reason: collision with root package name */
        int f46314e;

        /* renamed from: f, reason: collision with root package name */
        int f46315f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f46316g;

        /* renamed from: h, reason: collision with root package name */
        java.lang.String f46317h;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f46318i;

        /* renamed from: j, reason: collision with root package name */
        com.tencent.liteav.base.http.HttpClientAndroid.d f46319j;

        public b(int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.liteav.base.http.HttpClientAndroid.d dVar) {
            this.f46310a = i17;
            this.f46311b = i18;
            this.f46312c = i19;
            this.f46313d = z17;
            this.f46314e = i27;
            this.f46315f = i28;
            this.f46316g = str;
            this.f46317h = str2;
            this.f46318i = str3;
            this.f46319j = dVar;
        }
    }

    /* loaded from: classes6.dex */
    public enum c {
        NONE,
        RUNNING_REPEAT,
        RUNNING_ONCE
    }

    /* loaded from: classes13.dex */
    public enum d {
        DEFAULT(0),
        WIFI(1),
        CELLULAR(2);

        int nativeValue;

        d(int i17) {
            this.nativeValue = i17;
        }

        public static com.tencent.liteav.base.http.HttpClientAndroid.d a(int i17) {
            for (com.tencent.liteav.base.http.HttpClientAndroid.d dVar : values()) {
                if (dVar.nativeValue == i17) {
                    return dVar;
                }
            }
            com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.base.http.HttpClientAndroid.TAG, "Invalid value:".concat(java.lang.String.valueOf(i17)));
            return DEFAULT;
        }
    }

    /* loaded from: classes13.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        long f46328a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f46329b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f46330c;

        /* renamed from: d, reason: collision with root package name */
        byte[] f46331d;

        /* renamed from: e, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f46332e;

        /* renamed from: f, reason: collision with root package name */
        int f46333f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f46334g;

        /* renamed from: h, reason: collision with root package name */
        boolean f46335h;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f46336i;

        /* renamed from: j, reason: collision with root package name */
        byte[] f46337j;

        /* renamed from: k, reason: collision with root package name */
        byte[] f46338k;

        public e(java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17) {
            this(str, str2, bArr, map, z17, "", null, null);
        }

        public final boolean a() {
            if (android.text.TextUtils.isEmpty(this.f46329b)) {
                return false;
            }
            return this.f46329b.startsWith(com.tencent.liteav.base.http.HttpClientAndroid.HTTP_PREFIX) || this.f46329b.startsWith(com.tencent.liteav.base.http.HttpClientAndroid.HTTPS_PREFIX);
        }

        public final boolean b() {
            byte[] bArr = this.f46331d;
            return bArr != null && bArr.length > 0;
        }

        public final boolean c() {
            return com.tencent.liteav.base.http.HttpClientAndroid.METHOD_POST.equals(d()) || com.tencent.liteav.base.http.HttpClientAndroid.METHOD_PUT.equals(d());
        }

        public final java.lang.String d() {
            return android.text.TextUtils.isEmpty(this.f46330c) ? "" : com.tencent.liteav.base.http.HttpClientAndroid.METHOD_POST.equalsIgnoreCase(this.f46330c) ? com.tencent.liteav.base.http.HttpClientAndroid.METHOD_POST : com.tencent.liteav.base.http.HttpClientAndroid.METHOD_GET.equalsIgnoreCase(this.f46330c) ? com.tencent.liteav.base.http.HttpClientAndroid.METHOD_GET : com.tencent.liteav.base.http.HttpClientAndroid.METHOD_PUT.equalsIgnoreCase(this.f46330c) ? com.tencent.liteav.base.http.HttpClientAndroid.METHOD_PUT : "";
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request{requestId=");
            sb6.append(this.f46328a);
            sb6.append(", url='");
            sb6.append(this.f46329b);
            sb6.append("', method='");
            sb6.append(this.f46330c);
            sb6.append("', body.size=");
            sb6.append(b() ? this.f46331d.length : 0);
            sb6.append(", headers=");
            sb6.append(this.f46332e);
            sb6.append(", autoRedirect=");
            sb6.append(this.f46335h);
            sb6.append('}');
            return sb6.toString();
        }

        public e(java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, java.lang.String str3, byte[] bArr2, byte[] bArr3) {
            this.f46329b = str;
            this.f46330c = str2;
            this.f46331d = bArr;
            this.f46332e = map;
            this.f46333f = 0;
            this.f46334g = "";
            this.f46335h = z17;
            this.f46336i = str3;
            this.f46337j = bArr2;
            this.f46338k = bArr3;
        }
    }

    /* loaded from: classes13.dex */
    public static class f {

        /* renamed from: c, reason: collision with root package name */
        java.nio.ByteBuffer f46341c;

        /* renamed from: a, reason: collision with root package name */
        com.tencent.liteav.base.http.HttpClientAndroid.h f46339a = com.tencent.liteav.base.http.HttpClientAndroid.h.kUnknownError;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f46340b = "";

        /* renamed from: d, reason: collision with root package name */
        int f46342d = 0;

        /* renamed from: e, reason: collision with root package name */
        java.lang.String f46343e = "";

        /* renamed from: f, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f46344f = null;

        /* renamed from: g, reason: collision with root package name */
        int f46345g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f46346h = 0;

        /* renamed from: i, reason: collision with root package name */
        java.lang.String f46347i = "";
    }

    /* loaded from: classes6.dex */
    public enum g {
        CONNECTED(0),
        DISCONNECTED(1),
        FINISHED(2);

        int nativeValue;

        g(int i17) {
            this.nativeValue = i17;
        }
    }

    /* loaded from: classes13.dex */
    public enum h {
        kHTTP200OK(200),
        kHTTP204NoContent(204),
        kHTTP206PartialContent(206),
        kHTTP301MovedPermanently(301),
        kHTTP302Found(302),
        kHTTP303SeeOther(303),
        kHTTP304NotModified(304),
        kHTTP307TemporaryRedirect(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE),
        kHTTP308PermanentRedirect(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR),
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
        kUnknownError(com.tencent.ilink.auth.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE);

        final int nativeValue;

        h(int i17) {
            this.nativeValue = i17;
        }
    }

    public HttpClientAndroid(int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.String str, java.lang.String str2, java.lang.String str3, int i29, long j17) {
        this.mHttpConfig = new com.tencent.liteav.base.http.HttpClientAndroid.b(i17, i18, i19, z17, i27, i28, str, str2, str3, com.tencent.liteav.base.http.HttpClientAndroid.d.a(i29));
        this.mNativeHttpClientAndroidJni = j17;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("HttpClient_" + hashCode());
        handlerThread.start();
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Create http client(" + hashCode() + "). [ThreadName:" + handlerThread.getName() + "][ThreadId:" + handlerThread.getId() + "]");
        this.mHttpHandler = new android.os.Handler(handlerThread.getLooper());
    }

    private boolean checkNativeValid() {
        boolean z17;
        synchronized (this.mLocker) {
            z17 = this.mNativeHttpClientAndroidJni != -1;
        }
        return z17;
    }

    private boolean checkRequestValid(long j17) {
        return this.mRunningRequestMap.containsKey(java.lang.Long.valueOf(j17));
    }

    private void closeConnectionSafely(java.net.HttpURLConnection httpURLConnection) {
        if (this.mNetworkCallback != null && com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            try {
                try {
                    ((android.net.ConnectivityManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("connectivity")).unregisterNetworkCallback(this.mNetworkCallback);
                } finally {
                    this.mNetworkCallback = null;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")" + com.tencent.liteav.base.Log.getStackTraceString(e17));
            }
        }
        if (httpURLConnection != null) {
            try {
                try {
                    closeIO(httpURLConnection.getInputStream());
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

    private void closeIO(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private java.net.HttpURLConnection createConnection(com.tencent.liteav.base.http.HttpClientAndroid.e eVar) {
        java.net.Proxy proxy;
        java.net.HttpURLConnection createConnection;
        java.lang.String replace = eVar.f46329b.replace(" ", "%20");
        java.net.URL url = new java.net.URL(replace);
        if (!android.text.TextUtils.isEmpty(this.mHttpConfig.f46316g) && this.mHttpConfig.f46315f > 0) {
            java.net.Proxy.Type type = java.net.Proxy.Type.SOCKS;
            com.tencent.liteav.base.http.HttpClientAndroid.b bVar = this.mHttpConfig;
            proxy = new java.net.Proxy(type, new java.net.InetSocketAddress(bVar.f46316g, bVar.f46315f));
            com.tencent.liteav.base.http.HttpClientAndroid.b bVar2 = this.mHttpConfig;
            java.net.Authenticator.setDefault(new com.tencent.liteav.base.http.HttpClientAndroid.a(bVar2.f46317h, bVar2.f46318i));
        } else {
            proxy = ("127.0.0.1".equals(url.getHost()) || "localhost".equals(url.getHost())) ? java.net.Proxy.NO_PROXY : null;
        }
        if (proxy != null) {
            createConnection = createConnection(url, proxy);
        } else {
            if (com.tencent.liteav.base.util.HttpDnsUtil.verifyCustomHttpDNS(url.getHost())) {
                try {
                    java.lang.String convertHttpDNSURL = com.tencent.liteav.base.util.HttpDnsUtil.convertHttpDNSURL(replace, url.getHost());
                    if (!android.text.TextUtils.isEmpty(convertHttpDNSURL)) {
                        createConnection = createConnection(new java.net.URL(convertHttpDNSURL), null);
                        createConnection.setRequestProperty("Host", url.getHost());
                        com.tencent.liteav.base.util.HttpDnsUtil.applySniForHttpsConnection(createConnection, url.getHost());
                    } else {
                        createConnection = createConnection(new java.net.URL(replace), null);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")createConnectionUseCustomHttpDNS failed. error: " + com.tencent.liteav.base.Log.getStackTraceString(e17));
                }
            }
            createConnection = createConnection(url, null);
        }
        createConnection.setInstanceFollowRedirects(false);
        createConnection.setConnectTimeout(this.mHttpConfig.f46310a);
        createConnection.setReadTimeout(this.mHttpConfig.f46311b);
        createConnection.setRequestProperty("Accept-Encoding", "identity");
        createConnection.setRequestMethod(eVar.d());
        if (eVar.c()) {
            createConnection.setDoOutput(true);
        }
        if (this.mHttpConfig.f46313d) {
            createConnection.setRequestProperty("Connection", "Keep-Alive");
        } else {
            createConnection.setRequestProperty("Connection", "close");
        }
        java.util.Map<java.lang.String, java.lang.String> map = eVar.f46332e;
        if (map != null && !map.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : eVar.f46332e.entrySet()) {
                createConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return createConnection;
    }

    private java.net.HttpURLConnection createConnectionByNetworkType(final java.net.URL url, final java.net.Proxy proxy) {
        int i17;
        com.tencent.liteav.base.http.HttpClientAndroid.d dVar = this.mHttpConfig.f46319j;
        if (dVar == com.tencent.liteav.base.http.HttpClientAndroid.d.WIFI) {
            i17 = 1;
        } else {
            if (dVar != com.tencent.liteav.base.http.HttpClientAndroid.d.CELLULAR) {
                return null;
            }
            i17 = 0;
        }
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.net.HttpURLConnection[] httpURLConnectionArr = {null};
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(i17).build();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("connectivity");
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(android.net.Network network) {
                com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid = com.tencent.liteav.base.http.HttpClientAndroid.this;
                httpClientAndroid.mReallyNetworkChannel = httpClientAndroid.mHttpConfig.f46319j;
                com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.base.http.HttpClientAndroid.TAG, "(" + com.tencent.liteav.base.http.HttpClientAndroid.this.hashCode() + ")createConnectionSpecifyNetwork onAvailable.");
                try {
                    try {
                        java.net.Proxy proxy2 = proxy;
                        if (proxy2 == null) {
                            httpURLConnectionArr[0] = (java.net.HttpURLConnection) network.openConnection(url);
                        } else {
                            httpURLConnectionArr[0] = (java.net.HttpURLConnection) network.openConnection(url, proxy2);
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.liteav.base.util.LiteavLog.w(com.tencent.liteav.base.http.HttpClientAndroid.TAG, "(" + com.tencent.liteav.base.http.HttpClientAndroid.this.hashCode() + ")createConnectionSpecifyNetwork failed. error: " + com.tencent.liteav.base.Log.getStackTraceString(e17));
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(android.net.Network network) {
                com.tencent.liteav.base.util.LiteavLog.w(com.tencent.liteav.base.http.HttpClientAndroid.TAG, "(" + com.tencent.liteav.base.http.HttpClientAndroid.this.hashCode() + ")createConnectionSpecifyNetwork onLost.");
                countDownLatch.countDown();
            }
        };
        this.mNetworkCallback = networkCallback;
        connectivityManager.requestNetwork(build, networkCallback);
        try {
            countDownLatch.await(2L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork timeout.");
        }
        if (httpURLConnectionArr[0] != null) {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork success.");
        } else {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork lost or timeout.");
        }
        return httpURLConnectionArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x001e, B:13:0x0027, B:15:0x0038, B:17:0x003e, B:18:0x006d), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x001e, B:13:0x0027, B:15:0x0038, B:17:0x003e, B:18:0x006d), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g r23, long r24, com.tencent.liteav.base.http.HttpClientAndroid.f r26, boolean r27) {
        /*
            r22 = this;
            r1 = r22
            r0 = r26
            java.lang.Object r2 = r1.mLocker
            monitor-enter(r2)
            boolean r3 = r22.checkNativeValid()     // Catch: java.lang.Throwable -> L79
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L1b
            r10 = r24
            boolean r3 = r1.checkRequestValid(r10)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L1d
            if (r0 == 0) goto L1d
            r3 = r4
            goto L1e
        L1b:
            r10 = r24
        L1d:
            r3 = r5
        L1e:
            com.tencent.liteav.base.http.HttpClientAndroid$c r6 = com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_REPEAT     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$c r7 = r1.mInternalState     // Catch: java.lang.Throwable -> L79
            if (r6 != r7) goto L26
            r8 = r4
            goto L27
        L26:
            r8 = r5
        L27:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$e> r4 = r1.mRunningRequestMap     // Catch: java.lang.Throwable -> L79
            java.lang.Long r5 = java.lang.Long.valueOf(r24)     // Catch: java.lang.Throwable -> L79
            r4.remove(r5)     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.liteav.base.http.HttpClientAndroid$e> r4 = r1.mRunningRequestMap     // Catch: java.lang.Throwable -> L79
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L3c
            com.tencent.liteav.base.http.HttpClientAndroid$c r4 = com.tencent.liteav.base.http.HttpClientAndroid.c.NONE     // Catch: java.lang.Throwable -> L79
            r1.mInternalState = r4     // Catch: java.lang.Throwable -> L79
        L3c:
            if (r3 == 0) goto L6d
            long r6 = r1.mNativeHttpClientAndroidJni     // Catch: java.lang.Throwable -> L79
            r3 = r23
            int r9 = r3.nativeValue     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$h r3 = r0.f46339a     // Catch: java.lang.Throwable -> L79
            int r12 = r3.nativeValue     // Catch: java.lang.Throwable -> L79
            java.lang.String r13 = r0.f46340b     // Catch: java.lang.Throwable -> L79
            int r14 = r0.f46345g     // Catch: java.lang.Throwable -> L79
            java.nio.ByteBuffer r15 = r0.f46341c     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.f46343e     // Catch: java.lang.Throwable -> L79
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f46344f     // Catch: java.lang.Throwable -> L79
            int r5 = r0.f46342d     // Catch: java.lang.Throwable -> L79
            r18 = r5
            int r5 = r0.f46346h     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.f46347i     // Catch: java.lang.Throwable -> L79
            com.tencent.liteav.base.http.HttpClientAndroid$d r10 = r1.mReallyNetworkChannel     // Catch: java.lang.Throwable -> L79
            int r10 = r10.nativeValue     // Catch: java.lang.Throwable -> L79
            r21 = r10
            r10 = r24
            r16 = r3
            r17 = r4
            r19 = r5
            r20 = r0
            nativeOnCallback(r6, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L79
        L6d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            if (r27 == 0) goto L78
            java.net.HttpURLConnection r0 = r1.mConnection
            r1.closeConnectionSafely(r0)
            r0 = 0
            r1.mConnection = r0
        L78:
            return
        L79:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.http.HttpClientAndroid.doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid$g, long, com.tencent.liteav.base.http.HttpClientAndroid$f, boolean):void");
    }

    private boolean doOnCallback(com.tencent.liteav.base.http.HttpClientAndroid.g gVar, long j17, com.tencent.liteav.base.http.HttpClientAndroid.f fVar) {
        synchronized (this.mLocker) {
            if (!checkNativeValid() || !checkRequestValid(j17) || fVar == null) {
                return false;
            }
            return nativeOnCallback(this.mNativeHttpClientAndroidJni, com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_REPEAT == this.mInternalState, gVar.nativeValue, j17, fVar.f46339a.nativeValue, fVar.f46340b, fVar.f46345g, fVar.f46341c, fVar.f46343e, fVar.f46344f, fVar.f46342d, fVar.f46346h, fVar.f46347i, this.mReallyNetworkChannel.nativeValue);
        }
    }

    private void doReadData(long j17, com.tencent.liteav.base.http.HttpClientAndroid.f fVar) {
        boolean z17;
        int read;
        long j18;
        if (!checkRequestValid(j17)) {
            closeConnectionSafely(this.mConnection);
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")Do read data failed. Invalid request id. id:" + j17);
            return;
        }
        try {
            java.io.InputStream inputStream = this.mConnection.getInputStream();
            synchronized (this.mLocker) {
                z17 = this.mInternalState == com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_ONCE;
            }
            long j19 = 0;
            if (z17) {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    do {
                        read = inputStream.read(this.mReadDataBytes);
                        if (read > 0) {
                            byteArrayOutputStream.write(this.mReadDataBytes, 0, read);
                        }
                    } while (read > 0 && checkRequestValid(j17));
                    int size = byteArrayOutputStream.size();
                    if (size > 0) {
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(size);
                        fVar.f46341c = allocateDirect;
                        allocateDirect.put(byteArrayOutputStream.toByteArray(), 0, size);
                        fVar.f46342d = size;
                    }
                    j18 = 0;
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    fVar.f46339a = getStatusCode(th6);
                    fVar.f46340b = th6.toString();
                    doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.DISCONNECTED, j17, fVar, true);
                    return;
                }
            } else {
                try {
                    int read2 = inputStream.read(this.mReadDataBytes);
                    this.mTotalReadBytes += read2;
                    j18 = android.os.SystemClock.elapsedRealtime();
                    if (read2 > 0) {
                        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(read2);
                        fVar.f46341c = allocateDirect2;
                        allocateDirect2.put(this.mReadDataBytes, 0, read2);
                        fVar.f46342d = read2;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    fVar.f46339a = getStatusCode(e17);
                    fVar.f46340b = e17.toString();
                    doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.DISCONNECTED, j17, fVar, true);
                    return;
                }
            }
            if (fVar.f46342d == 0 && !z17) {
                com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")Do read data failed. Rsp size is 0.");
                doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.FINISHED, j17, fVar, this.mHttpConfig.f46313d ^ true);
                return;
            }
            if (z17) {
                doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.FINISHED, j17, fVar, !this.mHttpConfig.f46313d);
                return;
            }
            boolean doOnCallback = doOnCallback(com.tencent.liteav.base.http.HttpClientAndroid.g.CONNECTED, j17, fVar);
            this.mPausedRepeatDownloading = doOnCallback;
            this.mRepeatDownloadingStatusCode = fVar.f46339a;
            if (doOnCallback) {
                return;
            }
            int i17 = this.mHttpConfig.f46314e;
            if (i17 > 0) {
                long j27 = this.mStartReadTime;
                long j28 = j18 - j27 == 0 ? 1L : j18 - j27;
                long j29 = this.mTotalReadBytes;
                if (j29 / j28 > i17 / 1000) {
                    j19 = ((j29 * 1000) / i17) - j28;
                }
            }
            this.mHttpHandler.postDelayed(com.tencent.liteav.base.http.f.a(this, fVar, j17), j19);
        } catch (java.lang.Exception e18) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Do read data failed. Fail to get InputStream.");
            fVar.f46339a = getStatusCode(e18);
            fVar.f46340b = e18.toString();
            doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.DISCONNECTED, j17, fVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequest(com.tencent.liteav.base.http.HttpClientAndroid.e eVar) {
        com.tencent.liteav.base.http.HttpClientAndroid.h hVar;
        com.tencent.liteav.base.http.HttpClientAndroid.f fVar = null;
        for (int i17 = 0; i17 < 4; i17++) {
            fVar = internalRequest(eVar);
            if (fVar == null) {
                return;
            }
            if (!eVar.f46335h || ((hVar = fVar.f46339a) != com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP301MovedPermanently && hVar != com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP302Found)) {
                break;
            }
            java.lang.String headerField = this.mConnection.getHeaderField("Location");
            eVar.f46329b = headerField;
            eVar.f46333f++;
            eVar.f46334g = headerField;
        }
        this.mTotalReadBytes = 0L;
        this.mStartReadTime = android.os.SystemClock.elapsedRealtime();
        doReadData(eVar.f46328a, fVar);
    }

    public static java.util.HashMap getJavaHashMap(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return new java.util.HashMap();
        }
        if (strArr.length != strArr2.length) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "Invalid parameter, keys and values do not match.");
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            hashMap.put(strArr[i17], strArr2[i17]);
        }
        return hashMap;
    }

    public static java.lang.String[] getMapKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.isEmpty()) {
            return new java.lang.String[0];
        }
        java.util.Set<java.lang.String> keySet = map.keySet();
        return (java.lang.String[]) keySet.toArray(new java.lang.String[keySet.size()]);
    }

    public static java.lang.String[] getMapValue(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String[] strArr) {
        if (map == null || map.isEmpty() || strArr == null || strArr.length == 0) {
            return new java.lang.String[0];
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            strArr2[i17] = map.get(strArr[i17]);
        }
        return strArr2;
    }

    private java.util.Map<java.lang.String, java.lang.String> getResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (!android.text.TextUtils.isEmpty(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return hashMap;
    }

    private com.tencent.liteav.base.http.HttpClientAndroid.h getStatusCode(int i17) {
        com.tencent.liteav.base.http.HttpClientAndroid.h hVar = com.tencent.liteav.base.http.HttpClientAndroid.h.kUnknownError;
        if (i17 == 200) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP200OK;
        }
        if (i17 == 204) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP204NoContent;
        }
        if (i17 == 206) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP206PartialContent;
        }
        if (i17 == 301) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP301MovedPermanently;
        }
        if (i17 == 302) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP302Found;
        }
        if (i17 == 303) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP303SeeOther;
        }
        if (i17 == 304) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP304NotModified;
        }
        if (i17 == 307) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP307TemporaryRedirect;
        }
        if (i17 == 308) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP308PermanentRedirect;
        }
        if (i17 == 403) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP403Forbidden;
        }
        if (i17 == 404) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP404NotFound;
        }
        if (i17 == 405) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP405MethodNotAllowed;
        }
        if (i17 == 503) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kHTTP503ServiceUnavailable;
        }
        com.tencent.liteav.base.Log.w(TAG, "(" + hashCode() + ")Failed to convert status code：" + i17, new java.lang.Object[0]);
        return hVar;
    }

    private com.tencent.liteav.base.http.HttpClientAndroid.f internalRequest(com.tencent.liteav.base.http.HttpClientAndroid.e eVar) {
        boolean z17;
        if (!eVar.a()) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Send request failed. Invalid request url(" + eVar.f46329b + ").");
            return null;
        }
        if (!checkRequestValid(eVar.f46328a)) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")Do send failed. ignore request when cancelled. request:" + eVar);
            return null;
        }
        com.tencent.liteav.base.http.HttpClientAndroid.f fVar = new com.tencent.liteav.base.http.HttpClientAndroid.f();
        fVar.f46346h = eVar.f46333f;
        fVar.f46347i = eVar.f46334g;
        synchronized (this.mLocker) {
            z17 = this.mInternalState == com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_ONCE;
        }
        if (z17 && this.mConnection != null && !eVar.f46329b.equals(this.mLastRequestURL)) {
            closeConnectionSafely(this.mConnection);
            this.mConnection = null;
        }
        this.mLastRequestURL = eVar.f46329b;
        try {
            this.mConnection = createConnection(eVar);
            writeRequestBody(eVar);
            try {
                fVar.f46339a = getStatusCode(this.mConnection.getResponseCode());
                fVar.f46340b = this.mConnection.getResponseMessage();
                fVar.f46343e = parseHostAddress(this.mConnection.getURL().getHost());
                fVar.f46345g = this.mConnection.getURL().getPort();
                fVar.f46344f = getResponseHeaders(this.mConnection.getHeaderFields());
                if (checkRequestValid(eVar.f46328a)) {
                    return fVar;
                }
                closeConnectionSafely(this.mConnection);
                com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")Do send failed. Invalid request, abort request.");
                return null;
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Do send failed. Catch error. ex= " + com.tencent.liteav.base.Log.getStackTraceString(e17));
                fVar.f46339a = getStatusCode(e17);
                fVar.f46340b = e17.toString();
                doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.DISCONNECTED, eVar.f46328a, fVar, true);
                return null;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Do send failed. Fail to create http connection. ex= " + com.tencent.liteav.base.Log.getStackTraceString(e18));
            fVar.f46339a = getStatusCode(e18);
            fVar.f46340b = e18.toString();
            doCallbackAndResetState(com.tencent.liteav.base.http.HttpClientAndroid.g.DISCONNECTED, eVar.f46328a, fVar, true);
            return null;
        }
    }

    public static /* synthetic */ void lambda$cancelAll$1(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
    }

    public static /* synthetic */ void lambda$destroy$4(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            httpClientAndroid.mHttpHandler.getLooper().quitSafely();
        } else {
            httpClientAndroid.mHttpHandler.getLooper().quit();
        }
    }

    public static /* synthetic */ void lambda$doReadData$5(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, com.tencent.liteav.base.http.HttpClientAndroid.f fVar, long j17) {
        com.tencent.liteav.base.http.HttpClientAndroid.f fVar2 = new com.tencent.liteav.base.http.HttpClientAndroid.f();
        fVar2.f46339a = fVar.f46339a;
        httpClientAndroid.doReadData(j17, fVar2);
    }

    public static /* synthetic */ void lambda$resumeRepeatDownload$2(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, java.lang.Long l17) {
        com.tencent.liteav.base.http.HttpClientAndroid.f fVar = new com.tencent.liteav.base.http.HttpClientAndroid.f();
        fVar.f46339a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(l17.longValue(), fVar);
    }

    public static /* synthetic */ void lambda$resumeRepeatDownload$3(com.tencent.liteav.base.http.HttpClientAndroid httpClientAndroid, long j17) {
        com.tencent.liteav.base.http.HttpClientAndroid.f fVar = new com.tencent.liteav.base.http.HttpClientAndroid.f();
        fVar.f46339a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(j17, fVar);
    }

    private static native boolean nativeOnCallback(long j17, boolean z17, int i17, long j18, int i18, java.lang.String str, int i19, java.nio.ByteBuffer byteBuffer, java.lang.String str2, java.util.Map map, int i27, int i28, java.lang.String str3, int i29);

    private static native void nativeOnUploadProgress(long j17, long j18, long j19, long j27);

    private java.net.HttpURLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return proxy != null ? (java.net.HttpURLConnection) url.openConnection(proxy) : (java.net.HttpURLConnection) url.openConnection();
    }

    private java.lang.String parseHostAddress(java.lang.String str) {
        try {
            return java.net.InetAddress.getByName(str).getHostAddress();
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")Parse host error. host:" + str);
            return "";
        }
    }

    private long sendInternal(long j17, com.tencent.liteav.base.http.HttpClientAndroid.e eVar, boolean z17) {
        if (eVar == null || !eVar.a()) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Invalid request url(" + eVar.f46329b + ").");
            return 0L;
        }
        boolean z18 = true;
        if (!(!android.text.TextUtils.isEmpty(eVar.d()))) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Request method(" + eVar.f46330c + ") is not supported.");
            return 0L;
        }
        synchronized (this.mLocker) {
            if (this.mInternalState == com.tencent.liteav.base.http.HttpClientAndroid.c.NONE) {
                this.mInternalState = z17 ? com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_REPEAT : com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_ONCE;
            } else if (this.mInternalState != com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_ONCE) {
                z18 = false;
            }
            if (z18) {
                eVar.f46328a = j17;
                this.mRunningRequestMap.put(java.lang.Long.valueOf(j17), eVar);
                this.mHttpHandler.post(com.tencent.liteav.base.http.a.a(this, eVar));
                return eVar.f46328a;
            }
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Send request failed. Invalid state:" + this.mInternalState);
            return 0L;
        }
    }

    private void uploadFileByPath(com.tencent.liteav.base.http.HttpClientAndroid.e eVar, java.io.OutputStream outputStream) {
        if (android.text.TextUtils.isEmpty(eVar.f46336i)) {
            return;
        }
        java.io.Closeable closeable = null;
        try {
            java.io.File file = new java.io.File(eVar.f46336i);
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[524288];
                long length = file.length();
                long j17 = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        closeIO(fileInputStream);
                        return;
                    }
                    long j18 = j17 + read;
                    outputStream.write(bArr, 0, read);
                    nativeOnUploadProgress(this.mNativeHttpClientAndroidJni, eVar.f46328a, j18, length);
                    j17 = j18;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                closeable = fileInputStream;
                closeIO(closeable);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    private void writeRequestBody(com.tencent.liteav.base.http.HttpClientAndroid.e eVar) {
        java.io.OutputStream outputStream = null;
        try {
            if (eVar.c() && eVar.b()) {
                outputStream = this.mConnection.getOutputStream();
                outputStream.write(eVar.f46331d);
                outputStream.flush();
            } else if (eVar.c() && (!android.text.TextUtils.isEmpty(eVar.f46336i))) {
                outputStream = this.mConnection.getOutputStream();
                byte[] bArr = eVar.f46337j;
                if (bArr != null && bArr.length > 0) {
                    outputStream.write(bArr);
                }
                uploadFileByPath(eVar, outputStream);
                byte[] bArr2 = eVar.f46338k;
                if (bArr2 != null && bArr2.length > 0) {
                    outputStream.write(bArr2);
                }
                outputStream.flush();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "(" + hashCode() + ")Do write request body failed.");
        } finally {
            closeIO(null);
        }
    }

    public void cancel(long j17) {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                return;
            }
            if (this.mRunningRequestMap.size() == 0) {
                return;
            }
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "(" + hashCode() + ")Cancel request. request:" + this.mRunningRequestMap.remove(java.lang.Long.valueOf(j17)));
            if (this.mRunningRequestMap.size() == 0) {
                this.mInternalState = com.tencent.liteav.base.http.HttpClientAndroid.c.NONE;
            }
        }
    }

    public void cancelAll() {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Cancel all request failed. Invalid native handle.");
                return;
            }
            com.tencent.liteav.base.http.HttpClientAndroid.c cVar = this.mInternalState;
            com.tencent.liteav.base.http.HttpClientAndroid.c cVar2 = com.tencent.liteav.base.http.HttpClientAndroid.c.NONE;
            if (cVar == cVar2) {
                return;
            }
            this.mInternalState = cVar2;
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "(" + hashCode() + ")Cancel all. size:" + this.mRunningRequestMap.size());
            this.mRunningRequestMap.clear();
            this.mHttpHandler.post(com.tencent.liteav.base.http.b.a(this));
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mRunningRequestMap.clear();
            this.mNativeHttpClientAndroidJni = -1L;
            this.mHttpHandler.post(com.tencent.liteav.base.http.e.a(this));
        }
    }

    public void resumeRepeatDownload(long j17) {
        synchronized (this.mLocker) {
            if (!checkNativeValid()) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                return;
            }
            if (this.mRunningRequestMap.size() == 0) {
                return;
            }
            if (this.mInternalState == com.tencent.liteav.base.http.HttpClientAndroid.c.RUNNING_REPEAT && this.mPausedRepeatDownloading) {
                this.mPausedRepeatDownloading = false;
                if (j17 == 0) {
                    java.util.Iterator<java.lang.Long> it = this.mRunningRequestMap.keySet().iterator();
                    while (it.hasNext()) {
                        this.mHttpHandler.post(com.tencent.liteav.base.http.c.a(this, it.next()));
                    }
                } else if (checkRequestValid(j17)) {
                    if (this.mRunningRequestMap.get(java.lang.Long.valueOf(j17)) == null) {
                    } else {
                        this.mHttpHandler.post(com.tencent.liteav.base.http.d.a(this, j17));
                    }
                }
            }
        }
    }

    public long send(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, boolean z18) {
        if (checkNativeValid()) {
            return sendInternal(j17, new com.tencent.liteav.base.http.HttpClientAndroid.e(str, str2, bArr, map, z18), z17);
        }
        com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")Send request failed. Invalid native handle.");
        return 0L;
    }

    public void updateConfig(final int i17, final int i18, final int i19, final boolean z17, final int i27, final int i28, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i29, long j17) {
        this.mHttpHandler.post(new java.lang.Runnable() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.liteav.base.http.HttpClientAndroid.this.mHttpConfig = new com.tencent.liteav.base.http.HttpClientAndroid.b(i17, i18, i19, z17, i27, i28, str, str2, str3, com.tencent.liteav.base.http.HttpClientAndroid.d.a(i29));
                com.tencent.liteav.base.http.HttpClientAndroid.this.mReallyNetworkChannel = com.tencent.liteav.base.http.HttpClientAndroid.d.DEFAULT;
                if (i27 > 0) {
                    com.tencent.liteav.base.http.HttpClientAndroid.this.mTotalReadBytes = 0L;
                    com.tencent.liteav.base.http.HttpClientAndroid.this.mStartReadTime = android.os.SystemClock.elapsedRealtime();
                }
            }
        });
    }

    public long uploadFile(long j17, java.lang.String str, java.lang.String str2, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, boolean z18, java.lang.String str3, byte[] bArr2, byte[] bArr3) {
        if (!checkNativeValid()) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Invalid native handle.");
            return 0L;
        }
        if (!str3.isEmpty()) {
            return sendInternal(j17, new com.tencent.liteav.base.http.HttpClientAndroid.e(str, str2, bArr, map, z18, str3, bArr2, bArr3), z17);
        }
        com.tencent.liteav.base.util.LiteavLog.e(TAG, "(" + hashCode() + ")upload file failed. Invalid file path(" + str3 + ").");
        return 0L;
    }

    private com.tencent.liteav.base.http.HttpClientAndroid.h getStatusCode(java.lang.Throwable th6) {
        com.tencent.liteav.base.http.HttpClientAndroid.h hVar = com.tencent.liteav.base.http.HttpClientAndroid.h.kUnknownError;
        if (th6 instanceof java.io.FileNotFoundException) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemFileOpenFailed;
        }
        if (th6 instanceof java.io.EOFException) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemFileWriteFailed;
        }
        if (th6 instanceof java.net.UnknownHostException) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemUnknownHost;
        }
        if (th6 instanceof java.net.NoRouteToHostException) {
            return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemConnectHostFailed;
        }
        if (!(th6 instanceof java.net.SocketException) && !(th6 instanceof java.net.MalformedURLException)) {
            if (th6 instanceof java.net.SocketTimeoutException) {
                return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemConnectTimeout;
            }
            if (th6 instanceof java.net.ConnectException) {
                return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemConnectRefused;
            }
            if (th6 instanceof java.net.ProtocolException) {
                return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemProtocolError;
            }
            if (th6 instanceof javax.net.ssl.SSLException) {
                return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemSSLError;
            }
            com.tencent.liteav.base.Log.w(TAG, "(" + hashCode() + ")Failed to convert status code, exception：", th6.toString());
            return hVar;
        }
        return com.tencent.liteav.base.http.HttpClientAndroid.h.kSystemCreateSocketFailed;
    }

    private java.net.HttpURLConnection createConnection(java.net.URL url, java.net.Proxy proxy) {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return openConnection(url, proxy);
        }
        if (this.mHttpConfig.f46319j == com.tencent.liteav.base.http.HttpClientAndroid.d.DEFAULT) {
            return openConnection(url, proxy);
        }
        java.net.HttpURLConnection createConnectionByNetworkType = createConnectionByNetworkType(url, proxy);
        return createConnectionByNetworkType != null ? createConnectionByNetworkType : openConnection(url, proxy);
    }
}
