package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::dns")
/* loaded from: classes13.dex */
public class HttpDnsUtil {
    private static final java.lang.String TAG = "HttpDnsUtil";
    private static final java.util.List<java.lang.String> WHITE_LIST_HOST;
    private static com.tencent.liteav.base.util.HttpDnsUtil.a mCustomHttpDNSCallback = null;
    private static boolean mEnableCustomHttpDNS = false;
    private static final java.lang.Object mLock = new java.lang.Object();
    private static final java.lang.String sIPV4Regular = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
    private static java.util.regex.Pattern sValidIPV4Pattern;

    /* loaded from: classes13.dex */
    public interface a {
        void a(java.lang.String str, java.util.List<java.lang.String> list);
    }

    /* loaded from: classes13.dex */
    public static class b extends javax.net.ssl.SSLSocketFactory {

        /* renamed from: a, reason: collision with root package name */
        private javax.net.ssl.HttpsURLConnection f46419a;

        public b(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
            this.f46419a = httpsURLConnection;
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
            java.lang.String requestProperty = this.f46419a.getRequestProperty("Host");
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
            com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.base.util.HttpDnsUtil.TAG, "Setting SNI hostname");
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            javax.net.ssl.SSLSession session = sSLSocket.getSession();
            if (javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.base.util.HttpDnsUtil.TAG, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
                return sSLSocket;
            }
            throw new javax.net.ssl.SSLPeerUnverifiedException("Cannot verify hostname: ".concat(java.lang.String.valueOf(str)));
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        WHITE_LIST_HOST = arrayList;
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

    public static void applySniForHttpsConnection(java.net.HttpURLConnection httpURLConnection, final java.lang.String str) {
        if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(new com.tencent.liteav.base.util.HttpDnsUtil.b(httpsURLConnection));
            httpsURLConnection.setHostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: com.tencent.liteav.base.util.HttpDnsUtil.1
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(java.lang.String str2, javax.net.ssl.SSLSession sSLSession) {
                    return javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                }
            });
        }
    }

    public static java.lang.String convertHttpDNSURL(java.lang.String str, java.lang.String str2) {
        java.lang.String parseAddressUseCustomHttpDns = parseAddressUseCustomHttpDns(str2);
        if (android.text.TextUtils.isEmpty(parseAddressUseCustomHttpDns)) {
            return null;
        }
        java.net.InetAddress byName = java.net.InetAddress.getByName(parseAddressUseCustomHttpDns);
        if (byName instanceof java.net.Inet4Address) {
            return str.replaceFirst(str2, parseAddressUseCustomHttpDns);
        }
        if (!(byName instanceof java.net.Inet6Address)) {
            return null;
        }
        return str.replaceFirst(str2, "[" + parseAddressUseCustomHttpDns + "]");
    }

    public static java.net.HttpURLConnection createConnectionUseCustomHttpDNS(java.lang.String str, java.lang.String str2) {
        java.lang.String convertHttpDNSURL = convertHttpDNSURL(str, str2);
        if (android.text.TextUtils.isEmpty(convertHttpDNSURL)) {
            return (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(convertHttpDNSURL).openConnection();
        httpURLConnection.setRequestProperty("Host", str2);
        applySniForHttpsConnection(httpURLConnection, str2);
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "create http conn use httpDns, original url: " + str + " , new url: " + convertHttpDNSURL);
        return httpURLConnection;
    }

    public static void enableCustomHttpDNS(boolean z17, com.tencent.liteav.base.util.HttpDnsUtil.a aVar) {
        synchronized (mLock) {
            mEnableCustomHttpDNS = z17;
            mCustomHttpDNSCallback = aVar;
        }
    }

    public static boolean isHostInWhiteList(java.lang.String str) {
        return WHITE_LIST_HOST.contains(str);
    }

    public static boolean isIpAddress(java.lang.String str) {
        if (str != null && !"".equals(str)) {
            if (sValidIPV4Pattern == null) {
                try {
                    sValidIPV4Pattern = java.util.regex.Pattern.compile(sIPV4Regular, 2);
                } catch (java.lang.Exception e17) {
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "Pattern.compile fail " + com.tencent.liteav.base.Log.getStackTraceString(e17));
                    return false;
                }
            }
            if (sValidIPV4Pattern.matcher(str).matches() || str.contains(":")) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String parseAddressUseCustomHttpDns(java.lang.String str) {
        if (!verifyCustomHttpDNS(str)) {
            return "";
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (mLock) {
            mCustomHttpDNSCallback.a(str, arrayList);
        }
        if (arrayList.size() <= 0) {
            return "";
        }
        java.lang.String str2 = (java.lang.String) arrayList.get(0);
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "parse host: " + str + " and return ipAddress: " + str2 + " ,costTime: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return str2;
    }

    public static boolean verifyCustomHttpDNS(java.lang.String str) {
        synchronized (mLock) {
            if (mEnableCustomHttpDNS && mCustomHttpDNSCallback != null) {
                if (isHostInWhiteList(str) || isIpAddress(str)) {
                    return false;
                }
                java.lang.String property = java.lang.System.getProperty("http.proxyHost");
                java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
                if (property == null || property2 == null) {
                    return true;
                }
                com.tencent.liteav.base.util.LiteavLog.w(TAG, "local proxy is on, don't use httpdns. proxyHost=" + property + " ,proxyPort=" + property2);
                return false;
            }
            return false;
        }
    }
}
