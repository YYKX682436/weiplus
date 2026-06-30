package org.p3343x72743996.net;

/* JADX INFO: Access modifiers changed from: package-private */
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.net.AndroidNetworkLibrary */
/* loaded from: classes13.dex */
public class C29487x9ab916dc {
    private static final java.lang.String TAG = "AndroidNetworkLibrary";

    /* renamed from: sHaveAccessNetworkState */
    private static java.lang.Boolean f73681x45d63262;

    /* renamed from: sHaveAccessWifiState */
    private static java.lang.Boolean f73682x6702937d;

    /* renamed from: org.chromium.net.AndroidNetworkLibrary$NetworkSecurityPolicyProxy */
    /* loaded from: classes13.dex */
    public static class NetworkSecurityPolicyProxy {

        /* renamed from: sInstance */
        private static org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy f73683xbfaed628 = new org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy();

        /* renamed from: getInstance */
        public static org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy m153080x9cf0d20b() {
            return f73683xbfaed628;
        }

        /* renamed from: setInstanceForTesting */
        public static void m153082x2f08577e(org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            final org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy networkSecurityPolicyProxy2 = f73683xbfaed628;
            f73683xbfaed628 = networkSecurityPolicyProxy;
            org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new java.lang.Runnable() { // from class: org.chromium.net.AndroidNetworkLibrary$NetworkSecurityPolicyProxy$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy.f73683xbfaed628 = org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy.this;
                }
            });
        }

        /* renamed from: isCleartextTrafficPermitted */
        public boolean m153084xc4f99fab(java.lang.String str) {
            return org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29391xdcec370d.m152812xc4f99fab(str);
        }

        /* renamed from: isCleartextTrafficPermitted */
        public boolean m153083xc4f99fab() {
            return org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152800xc4f99fab();
        }
    }

    /* renamed from: org.chromium.net.AndroidNetworkLibrary$SetFileDescriptor */
    /* loaded from: classes7.dex */
    public static class SetFileDescriptor {

        /* renamed from: sFileDescriptorSetInt */
        private static final java.lang.reflect.Method f73684xe6a2df2b;

        static {
            try {
                f73684xe6a2df2b = java.io.FileDescriptor.class.getMethod("setInt$", java.lang.Integer.TYPE);
            } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e17) {
                throw new java.lang.RuntimeException("Unable to get FileDescriptor.setInt$", e17);
            }
        }

        private SetFileDescriptor() {
        }

        /* renamed from: createWithFd */
        public static java.io.FileDescriptor m153086x61c38040(int i17) {
            try {
                java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
                f73684xe6a2df2b.invoke(fileDescriptor, java.lang.Integer.valueOf(i17));
                return fileDescriptor;
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException("FileDescriptor.setInt$() failed", e17);
            } catch (java.lang.reflect.InvocationTargetException e18) {
                throw new java.lang.RuntimeException("FileDescriptor.setInt$() failed", e18);
            }
        }
    }

    /* renamed from: org.chromium.net.AndroidNetworkLibrary$SocketFd */
    /* loaded from: classes13.dex */
    public static class SocketFd extends java.net.Socket {

        /* renamed from: org.chromium.net.AndroidNetworkLibrary$SocketFd$SocketImplFd */
        /* loaded from: classes13.dex */
        public static class SocketImplFd extends java.net.SocketImpl {
            public SocketImplFd(java.io.FileDescriptor fileDescriptor) {
                ((java.net.SocketImpl) this).fd = fileDescriptor;
            }

            @Override // java.net.SocketImpl
            public void accept(java.net.SocketImpl socketImpl) {
                throw new java.lang.RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            public int available() {
                throw new java.lang.RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            public void bind(java.net.InetAddress inetAddress, int i17) {
                throw new java.lang.RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            public void close() {
            }

            @Override // java.net.SocketImpl
            public void connect(java.net.InetAddress inetAddress, int i17) {
                throw new java.lang.RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            public void create(boolean z17) {
            }

            @Override // java.net.SocketImpl
            public java.io.InputStream getInputStream() {
                throw new java.lang.RuntimeException("getInputStream not implemented");
            }

            @Override // java.net.SocketOptions
            public java.lang.Object getOption(int i17) {
                throw new java.lang.RuntimeException("getOption not implemented");
            }

            @Override // java.net.SocketImpl
            public java.io.OutputStream getOutputStream() {
                throw new java.lang.RuntimeException("getOutputStream not implemented");
            }

            @Override // java.net.SocketImpl
            public void listen(int i17) {
                throw new java.lang.RuntimeException("listen not implemented");
            }

            @Override // java.net.SocketImpl
            public void sendUrgentData(int i17) {
                throw new java.lang.RuntimeException("sendUrgentData not implemented");
            }

            @Override // java.net.SocketOptions
            public void setOption(int i17, java.lang.Object obj) {
                throw new java.lang.RuntimeException("setOption not implemented");
            }

            @Override // java.net.SocketImpl
            public void connect(java.net.SocketAddress socketAddress, int i17) {
                throw new java.lang.RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            public void connect(java.lang.String str, int i17) {
                throw new java.lang.RuntimeException("connect not implemented");
            }
        }

        public SocketFd(java.io.FileDescriptor fileDescriptor) {
            super(new org.p3343x72743996.net.C29487x9ab916dc.SocketFd.SocketImplFd(fileDescriptor));
        }
    }

    /* renamed from: addTestRootCertificate */
    public static void m153057x520b0602(byte[] bArr) {
        org.p3343x72743996.net.C29565xfe45eec8.m153693x520b0602(bArr);
    }

    /* renamed from: clearTestRootCertificates */
    public static void m153058xa43e6a5d() {
        org.p3343x72743996.net.C29565xfe45eec8.m153695xa43e6a5d();
    }

    /* renamed from: getCurrentDnsStatus */
    public static org.p3343x72743996.net.C29504x5c8e1e5b m153059xd0d5e078() {
        return m153060xe4896fc5(null);
    }

    /* renamed from: getDnsStatus */
    public static org.p3343x72743996.net.C29504x5c8e1e5b m153060xe4896fc5(android.net.Network network) {
        android.net.ConnectivityManager connectivityManager;
        if (!m153070xc245ae0f() || (connectivityManager = (android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152789xe4f45c92(connectivityManager);
        }
        if (network == null) {
            return null;
        }
        try {
            android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            java.util.List<java.net.InetAddress> dnsServers = linkProperties.getDnsServers();
            java.lang.String domains = linkProperties.getDomains();
            return android.os.Build.VERSION.SDK_INT >= 28 ? new org.p3343x72743996.net.C29504x5c8e1e5b(dnsServers, org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152841xf1a5e896(linkProperties), org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152837x4aa59a2a(linkProperties), domains) : new org.p3343x72743996.net.C29504x5c8e1e5b(dnsServers, false, "", domains);
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: getDnsStatusForNetwork */
    public static org.p3343x72743996.net.C29504x5c8e1e5b m153061x73e93aca(long j17) {
        try {
            return m153060xe4896fc5(android.net.Network.fromNetworkHandle(j17));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: getIsCaptivePortal */
    private static boolean m153062x8178d782() {
        android.net.Network m152789xe4f45c92;
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity");
        return (connectivityManager == null || (m152789xe4f45c92 = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152789xe4f45c92(connectivityManager)) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(m152789xe4f45c92)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    /* renamed from: getIsRoaming */
    private static boolean m153063x2e5914d9() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    /* renamed from: getMimeTypeFromExtension */
    public static java.lang.String m153064x95c22f11(java.lang.String str) {
        return java.net.URLConnection.guessContentTypeFromName("foo." + str);
    }

    /* renamed from: getNetworkOperator */
    private static java.lang.String m153065x7a99aabc() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    /* renamed from: getUserAddedRoots */
    public static byte[][] m153066xb846fdd2() {
        return org.p3343x72743996.net.C29565xfe45eec8.m153701xb846fdd2();
    }

    /* renamed from: getWifiInfo */
    private static android.net.wifi.WifiInfo m153067x2bed32d9() {
        android.net.TransportInfo m152852x6633cfc1;
        if (!m153071xe9b7ef0()) {
            android.content.Intent m152361xd9ec0c5 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), null, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (m152361xd9ec0c5 != null) {
                return (android.net.wifi.WifiInfo) m152361xd9ec0c5.getParcelableExtra("wifiInfo");
            }
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return (android.net.wifi.WifiInfo) yj0.a.j((android.net.wifi.WifiManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("wifi"), "org/chromium/net/AndroidNetworkLibrary", "getWifiInfo", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity");
        for (android.net.Network network : connectivityManager.getAllNetworks()) {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (m152852x6633cfc1 = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29395xdcec3710.m152852x6633cfc1(networkCapabilities)) != null && (m152852x6633cfc1 instanceof android.net.wifi.WifiInfo)) {
                return (android.net.wifi.WifiInfo) m152852x6633cfc1;
            }
        }
        return null;
    }

    /* renamed from: getWifiSSID */
    public static java.lang.String m153068x2bf15586() {
        java.lang.String ssid;
        android.net.wifi.WifiInfo m153067x2bed32d9 = m153067x2bed32d9();
        return (m153067x2bed32d9 == null || (ssid = m153067x2bed32d9.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    /* renamed from: getWifiSignalLevel */
    public static int m153069x7df2131(int i17) {
        int intExtra;
        int calculateSignalLevel;
        if (org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035() == null || org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getContentResolver() == null) {
            return -1;
        }
        if (m153071xe9b7ef0()) {
            android.net.wifi.WifiInfo m153067x2bed32d9 = m153067x2bed32d9();
            if (m153067x2bed32d9 == null) {
                return -1;
            }
            intExtra = m153067x2bed32d9.getRssi();
        } else {
            try {
                android.content.Intent m152361xd9ec0c5 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), null, new android.content.IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (m152361xd9ec0c5 == null) {
                    return -1;
                }
                intExtra = m152361xd9ec0c5.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = android.net.wifi.WifiManager.calculateSignalLevel(intExtra, i17)) >= 0 && calculateSignalLevel < i17) {
            return calculateSignalLevel;
        }
        return -1;
    }

    /* renamed from: haveAccessNetworkState */
    private static boolean m153070xc245ae0f() {
        if (f73681x45d63262 == null) {
            f73681x45d63262 = java.lang.Boolean.valueOf(org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.m152158x28e6dcf7(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return f73681x45d63262.booleanValue();
    }

    /* renamed from: haveAccessWifiState */
    private static boolean m153071xe9b7ef0() {
        if (f73682x6702937d == null) {
            f73682x6702937d = java.lang.Boolean.valueOf(org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.m152158x28e6dcf7(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "android.permission.ACCESS_WIFI_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return f73682x6702937d.booleanValue();
    }

    /* renamed from: haveOnlyLoopbackAddresses */
    public static boolean m153072xa86f3b83() {
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (java.net.SocketException unused) {
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return false;
        }
    }

    /* renamed from: isCleartextPermitted */
    private static boolean m153073xb6e4a108(java.lang.String str) {
        try {
            return org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy.m153080x9cf0d20b().m153084xc4f99fab(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return org.p3343x72743996.net.C29487x9ab916dc.NetworkSecurityPolicyProxy.m153080x9cf0d20b().m153083xc4f99fab();
        }
    }

    /* renamed from: reportBadDefaultNetwork */
    private static boolean m153075xbe4c953e() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152807xfc992131(connectivityManager, null, false);
        return true;
    }

    /* renamed from: setWifiEnabledForTesting */
    public static void m153076xaf9c8551(boolean z17) {
        final android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getSystemService("wifi");
        final boolean isWifiEnabled = wifiManager.isWifiEnabled();
        wifiManager.setWifiEnabled(z17);
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new java.lang.Runnable() { // from class: org.chromium.net.AndroidNetworkLibrary$$a
            @Override // java.lang.Runnable
            public final void run() {
                wifiManager.setWifiEnabled(isWifiEnabled);
            }
        });
    }

    /* renamed from: tagSocket */
    private static void m153077x67e32fad(int i17, int i18, int i19) {
        int threadStatsTag = android.net.TrafficStats.getThreadStatsTag();
        if (i19 != threadStatsTag) {
            android.net.TrafficStats.setThreadStatsTag(i19);
        }
        if (i18 != -1) {
            org.p3343x72743996.net.C29557xfa58e37b.set(i18);
        }
        android.os.ParcelFileDescriptor adoptFd = android.os.ParcelFileDescriptor.adoptFd(i17);
        org.p3343x72743996.net.C29487x9ab916dc.SocketFd socketFd = new org.p3343x72743996.net.C29487x9ab916dc.SocketFd(adoptFd.getFileDescriptor());
        android.net.TrafficStats.tagSocket(socketFd);
        socketFd.close();
        adoptFd.detachFd();
        if (i19 != threadStatsTag) {
            android.net.TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i18 != -1) {
            org.p3343x72743996.net.C29557xfa58e37b.m153653x5a5b64d();
        }
    }

    /* renamed from: verifyServerCertificates */
    public static org.p3343x72743996.net.C29485xcbb9aa9 m153078xe12d20f8(byte[][] bArr, java.lang.String str, java.lang.String str2, boolean z17) {
        try {
            return org.p3343x72743996.net.C29565xfe45eec8.m153708xe12d20f8(bArr, str, str2, z17);
        } catch (java.lang.IllegalArgumentException unused) {
            return new org.p3343x72743996.net.C29485xcbb9aa9(-1);
        } catch (java.security.KeyStoreException unused2) {
            return new org.p3343x72743996.net.C29485xcbb9aa9(-1);
        } catch (java.security.NoSuchAlgorithmException unused3) {
            return new org.p3343x72743996.net.C29485xcbb9aa9(-1);
        }
    }
}
