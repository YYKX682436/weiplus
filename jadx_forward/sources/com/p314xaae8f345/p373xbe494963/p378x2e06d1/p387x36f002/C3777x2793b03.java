package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::dns")
/* renamed from: com.tencent.liteav.base.util.HttpDnsUtil */
/* loaded from: classes13.dex */
public class C3777x2793b03 {
    private static final java.lang.String TAG = "HttpDnsUtil";

    /* renamed from: WHITE_LIST_HOST */
    private static final java.util.List<java.lang.String> f14747xc15dc7f3;

    /* renamed from: mCustomHttpDNSCallback */
    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.a f14748x89c8c8 = null;

    /* renamed from: mEnableCustomHttpDNS */
    private static boolean f14749x2b1db460 = false;

    /* renamed from: mLock */
    private static final java.lang.Object f14750x6243b38 = new java.lang.Object();

    /* renamed from: sIPV4Regular */
    private static final java.lang.String f14751xcdacbb84 = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

    /* renamed from: sValidIPV4Pattern */
    private static java.util.regex.Pattern f14752x171c16e2;

    /* renamed from: com.tencent.liteav.base.util.HttpDnsUtil$a */
    /* loaded from: classes13.dex */
    public interface a {
        void a(java.lang.String str, java.util.List<java.lang.String> list);
    }

    /* renamed from: com.tencent.liteav.base.util.HttpDnsUtil$b */
    /* loaded from: classes13.dex */
    public static class b extends javax.net.ssl.SSLSocketFactory {

        /* renamed from: a, reason: collision with root package name */
        private javax.net.ssl.HttpsURLConnection f127952a;

        public b(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
            this.f127952a = httpsURLConnection;
        }

        @Override // javax.net.SocketFactory
        public final java.net.Socket createSocket() {
            return null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final java.lang.String[] getDefaultCipherSuites() {
            return new java.lang.String[0];
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final java.lang.String[] getSupportedCipherSuites() {
            return new java.lang.String[0];
        }

        @Override // javax.net.SocketFactory
        public final java.net.Socket createSocket(java.lang.String str, int i17) {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final java.net.Socket createSocket(java.lang.String str, int i17, java.net.InetAddress inetAddress, int i18) {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i17) {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i17, java.net.InetAddress inetAddress2, int i18) {
            return null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i17, boolean z17) {
            java.lang.String requestProperty = this.f127952a.getRequestProperty("Host");
            if (requestProperty != null) {
                str = requestProperty;
            }
            java.net.InetAddress inetAddress = socket.getInetAddress();
            if (z17) {
                socket.close();
            }
            android.net.SSLCertificateSocketFactory sSLCertificateSocketFactory = (android.net.SSLCertificateSocketFactory) android.net.SSLCertificateSocketFactory.getDefault(0);
            javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i17);
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.TAG, "Setting SNI hostname");
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            javax.net.ssl.SSLSession session = sSLSocket.getSession();
            if (javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.TAG, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
                return sSLSocket;
            }
            throw new javax.net.ssl.SSLPeerUnverifiedException("Cannot verify hostname: ".concat(java.lang.String.valueOf(str)));
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f14747xc15dc7f3 = arrayList;
        arrayList.add("intl-sdklog.trtc.tencent-cloud.com");
        arrayList.add("trtc-client-log-overseas-1258344699.cos.ap-singapore.myqcloud.com");
        arrayList.add("inland-sdklog.trtc.tencent-cloud.com");
        arrayList.add("trtc-sdk-log-1258344699.cos.ap-guangzhou.myqcloud.com");
        arrayList.add("trtc-sdk-config-1258344699.file.myqcloud.com");
        arrayList.add("liteav.sdk.qcloud.com");
        arrayList.add("yun.tim.qq.com");
        arrayList.add("videoapi-sgp.im.qcloud.com");
        arrayList.add("sdkdc.live.qcloud.com");
        arrayList.add("mlvbdc.live.qcloud.com");
        arrayList.add("conf.sdk.qcloud.com");
        arrayList.add("speedtestint.trtc.tencent-cloud.com");
        arrayList.add("speedtest.trtc.tencent-cloud.com");
        arrayList.add("webrtc-signal-scheduler.tlivesource.com");
        arrayList.add("cloud.tim.qq.com");
        arrayList.add("livepull.myqcloud.com");
        arrayList.add("livepullipv6.myqcloud.com");
        arrayList.add("tcdns.myqcloud.com");
        arrayList.add("tcdnsipv6.myqcloud.com");
        arrayList.add("liteavapp.qcloud.com");
        arrayList.add("license-test.vod2.myqcloud.com");
        arrayList.add("sdkconfig.tlivesource.com");
        arrayList.add("mlvbdc.live.tlivesource.com");
    }

    /* renamed from: applySniForHttpsConnection */
    public static void m29532xa6d7160(java.net.HttpURLConnection httpURLConnection, final java.lang.String str) {
        if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.b(httpsURLConnection));
            httpsURLConnection.setHostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: com.tencent.liteav.base.util.HttpDnsUtil.1
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(java.lang.String str2, javax.net.ssl.SSLSession sSLSession) {
                    return javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                }
            });
        }
    }

    /* renamed from: convertHttpDNSURL */
    public static java.lang.String m29533x49c8f041(java.lang.String str, java.lang.String str2) {
        java.lang.String m29538xeccc0c6a = m29538xeccc0c6a(str2);
        if (android.text.TextUtils.isEmpty(m29538xeccc0c6a)) {
            return null;
        }
        java.net.InetAddress byName = java.net.InetAddress.getByName(m29538xeccc0c6a);
        if (byName instanceof java.net.Inet4Address) {
            return str.replaceFirst(str2, m29538xeccc0c6a);
        }
        if (!(byName instanceof java.net.Inet6Address)) {
            return null;
        }
        return str.replaceFirst(str2, "[" + m29538xeccc0c6a + "]");
    }

    /* renamed from: createConnectionUseCustomHttpDNS */
    public static java.net.HttpURLConnection m29534xd46b2da3(java.lang.String str, java.lang.String str2) {
        java.lang.String m29533x49c8f041 = m29533x49c8f041(str, str2);
        if (android.text.TextUtils.isEmpty(m29533x49c8f041)) {
            return (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(m29533x49c8f041).openConnection();
        httpURLConnection.setRequestProperty("Host", str2);
        m29532xa6d7160(httpURLConnection, str2);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "create http conn use httpDns, original url: " + str + " , new url: " + m29533x49c8f041);
        return httpURLConnection;
    }

    /* renamed from: enableCustomHttpDNS */
    public static void m29535x4081a60d(boolean z17, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3777x2793b03.a aVar) {
        synchronized (f14750x6243b38) {
            f14749x2b1db460 = z17;
            f14748x89c8c8 = aVar;
        }
    }

    /* renamed from: isHostInWhiteList */
    public static boolean m29536xc2034b70(java.lang.String str) {
        return f14747xc15dc7f3.contains(str);
    }

    /* renamed from: isIpAddress */
    public static boolean m29537xa7a29ec3(java.lang.String str) {
        if (str != null && !"".equals(str)) {
            if (f14752x171c16e2 == null) {
                try {
                    f14752x171c16e2 = java.util.regex.Pattern.compile(f14751xcdacbb84, 2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Pattern.compile fail " + com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.m29257x2d915d84(e17));
                    return false;
                }
            }
            if (f14752x171c16e2.matcher(str).matches() || str.contains(":")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: parseAddressUseCustomHttpDns */
    public static java.lang.String m29538xeccc0c6a(java.lang.String str) {
        if (!m29539x102542d7(str)) {
            return "";
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (f14750x6243b38) {
            f14748x89c8c8.a(str, arrayList);
        }
        if (arrayList.size() <= 0) {
            return "";
        }
        java.lang.String str2 = (java.lang.String) arrayList.get(0);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "parse host: " + str + " and return ipAddress: " + str2 + " ,costTime: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return str2;
    }

    /* renamed from: verifyCustomHttpDNS */
    public static boolean m29539x102542d7(java.lang.String str) {
        synchronized (f14750x6243b38) {
            if (f14749x2b1db460 && f14748x89c8c8 != null) {
                if (m29536xc2034b70(str) || m29537xa7a29ec3(str)) {
                    return false;
                }
                java.lang.String property = java.lang.System.getProperty("http.proxyHost");
                java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
                if (property == null || property2 == null) {
                    return true;
                }
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "local proxy is on, don't use httpdns. proxyHost=" + property + " ,proxyPort=" + property2);
                return false;
            }
            return false;
        }
    }
}
