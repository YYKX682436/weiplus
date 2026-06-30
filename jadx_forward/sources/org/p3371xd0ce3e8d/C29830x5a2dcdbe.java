package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NetworkMonitorAutoDetect */
/* loaded from: classes13.dex */
public class C29830x5a2dcdbe extends android.content.BroadcastReceiver implements org.p3371xd0ce3e8d.InterfaceC29826xb786ed44 {

    /* renamed from: INVALID_NET_ID */
    private static final long f75618x7888285 = -1;
    private static final java.lang.String TAG = "NetworkMonitorAutoDetect";

    /* renamed from: includeWifiDirect */
    private static boolean f75619x32795226;

    /* renamed from: allNetworkCallback */
    private final android.net.ConnectivityManager.NetworkCallback f75620x1ad678b2;

    /* renamed from: connectionType */
    private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType f75621x4bb5e338;

    /* renamed from: connectivityManagerDelegate */
    private org.p3371xd0ce3e8d.C29830x5a2dcdbe.ConnectivityManagerDelegate f75622x2d0f1d9b;

    /* renamed from: context */
    private final android.content.Context f75623x38b735af;

    /* renamed from: intentFilter */
    private final android.content.IntentFilter f75624x6aea8934;

    /* renamed from: isRegistered */
    private boolean f75625x11f61b4c;

    /* renamed from: mobileNetworkCallback */
    private final android.net.ConnectivityManager.NetworkCallback f75626x9bee5f91;

    /* renamed from: observer */
    private final org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer f75627x14c752d6;

    /* renamed from: wifiDirectManagerDelegate */
    private org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiDirectManagerDelegate f75628xf7b95114;

    /* renamed from: wifiManagerDelegate */
    private org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiManagerDelegate f75629x6957b07d;

    /* renamed from: wifiSSID */
    private java.lang.String f75630xb0171810;

    /* renamed from: org.webrtc.NetworkMonitorAutoDetect$NetworkState */
    /* loaded from: classes13.dex */
    public static class NetworkState {

        /* renamed from: connected */
        private final boolean f75632xdd79f309;

        /* renamed from: subtype */
        private final int f75633x90af2d7a;

        /* renamed from: type */
        private final int f75634x368f3a;

        /* renamed from: underlyingNetworkSubtypeForVpn */
        private final int f75635xae53b4f4;

        /* renamed from: underlyingNetworkTypeForVpn */
        private final int f75636xa9e41e36;

        public NetworkState(boolean z17, int i17, int i18, int i19, int i27) {
            this.f75632xdd79f309 = z17;
            this.f75634x368f3a = i17;
            this.f75633x90af2d7a = i18;
            this.f75636xa9e41e36 = i19;
            this.f75635xae53b4f4 = i27;
        }

        /* renamed from: getNetworkSubType */
        public int m155895x19ac7c82() {
            return this.f75633x90af2d7a;
        }

        /* renamed from: getNetworkType */
        public int m155896x662add52() {
            return this.f75634x368f3a;
        }

        /* renamed from: getUnderlyingNetworkSubtypeForVpn */
        public int m155897x6f0ed5ea() {
            return this.f75635xae53b4f4;
        }

        /* renamed from: getUnderlyingNetworkTypeForVpn */
        public int m155898x30779100() {
            return this.f75636xa9e41e36;
        }

        /* renamed from: isConnected */
        public boolean m155899x23b734ff() {
            return this.f75632xdd79f309;
        }
    }

    /* renamed from: org.webrtc.NetworkMonitorAutoDetect$SimpleNetworkCallback */
    /* loaded from: classes13.dex */
    public class SimpleNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private SimpleNetworkCallback() {
        }

        /* renamed from: onNetworkChanged */
        private void m155900xf54d1865(android.net.Network network) {
            org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation m155883xc8ea9d97 = org.p3371xd0ce3e8d.C29830x5a2dcdbe.this.f75622x2d0f1d9b.m155883xc8ea9d97(network);
            if (m155883xc8ea9d97 != null) {
                org.p3371xd0ce3e8d.C29830x5a2dcdbe.this.f75627x14c752d6.mo155819x1f62e9b(m155883xc8ea9d97);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Network becomes available: " + network.toString());
            m155900xf54d1865(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "capabilities changed: " + networkCapabilities.toString());
            m155900xf54d1865(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "link properties changed");
            m155900xf54d1865(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(android.net.Network network, int i17) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Network " + network.toString() + " is about to lose in " + i17 + "ms");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Network " + network.toString() + " is disconnected");
            org.p3371xd0ce3e8d.C29830x5a2dcdbe.this.f75627x14c752d6.mo155820x9553f94b(org.p3371xd0ce3e8d.C29830x5a2dcdbe.m155872x54aba3cf(network));
        }
    }

    /* renamed from: org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate */
    /* loaded from: classes13.dex */
    public static class WifiDirectManagerDelegate extends android.content.BroadcastReceiver {

        /* renamed from: WIFI_P2P_NETWORK_HANDLE */
        private static final int f75638x1370cc94 = 0;

        /* renamed from: context */
        private final android.content.Context f75639x38b735af;

        /* renamed from: observer */
        private final org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer f75640x14c752d6;

        /* renamed from: wifiP2pNetworkInfo */
        private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation f75641xa8f0daa3;

        public WifiDirectManagerDelegate(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer observer, android.content.Context context) {
            this.f75639x38b735af = context;
            this.f75640x14c752d6 = observer;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
            if (android.os.Build.VERSION.SDK_INT > 28) {
                android.net.wifi.p2p.WifiP2pManager wifiP2pManager = (android.net.wifi.p2p.WifiP2pManager) context.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new android.net.wifi.p2p.WifiP2pManager.GroupInfoListener() { // from class: org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$a
                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                    public final void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
                        org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiDirectManagerDelegate.this.m155901x51ef5f0f(wifiP2pGroup);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onWifiP2pGroupChange, reason: merged with bridge method [inline-methods] */
        public void m155901x51ef5f0f(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup == null || wifiP2pGroup.getInterface() == null) {
                return;
            }
            try {
                java.util.ArrayList list = java.util.Collections.list(java.net.NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[] iPAddressArr = new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[list.size()];
                for (int i17 = 0; i17 < list.size(); i17++) {
                    iPAddressArr[i17] = new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress(((java.net.InetAddress) list.get(i17)).getAddress());
                }
                org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation networkInformation = new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation(wifiP2pGroup.getInterface(), org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_WIFI, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_NONE, 0L, iPAddressArr);
                this.f75641xa8f0daa3 = networkInformation;
                this.f75640x14c752d6.mo155819x1f62e9b(networkInformation);
            } catch (java.net.SocketException e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Unable to get WifiP2p network interface", e17);
            }
        }

        /* renamed from: onWifiP2pStateChange */
        private void m155903x83d27287(int i17) {
            if (i17 == 1) {
                this.f75641xa8f0daa3 = null;
                this.f75640x14c752d6.mo155820x9553f94b(0L);
            }
        }

        /* renamed from: getActiveNetworkList */
        public java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation> m155904x6393e850() {
            org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation networkInformation = this.f75641xa8f0daa3;
            return networkInformation != null ? java.util.Collections.singletonList(networkInformation) : java.util.Collections.emptyList();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                m155901x51ef5f0f((android.net.wifi.p2p.WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                m155903x83d27287(intent.getIntExtra("wifi_p2p_state", 0));
            }
        }

        /* renamed from: release */
        public void m155905x41012807() {
            this.f75639x38b735af.unregisterReceiver(this);
        }
    }

    public C29830x5a2dcdbe(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.Observer observer, android.content.Context context) {
        this.f75627x14c752d6 = observer;
        this.f75623x38b735af = context;
        this.f75622x2d0f1d9b = new org.p3371xd0ce3e8d.C29830x5a2dcdbe.ConnectivityManagerDelegate(context);
        this.f75629x6957b07d = new org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiManagerDelegate(context);
        org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155888x5f203979 = this.f75622x2d0f1d9b.m155888x5f203979();
        this.f75621x4bb5e338 = m155868x3a4db02e(m155888x5f203979);
        this.f75630xb0171810 = m155871x2bf15586(m155888x5f203979);
        this.f75624x6aea8934 = new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        if (f75619x32795226) {
            this.f75628xf7b95114 = new org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiDirectManagerDelegate(observer, context);
        }
        m155873xc20729b2();
        if (!this.f75622x2d0f1d9b.m155894x4cae90c4()) {
            this.f75626x9bee5f91 = null;
            this.f75620x1ad678b2 = null;
            return;
        }
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback();
        try {
            this.f75622x2d0f1d9b.m155893x3fd8e4dd(networkCallback);
        } catch (java.lang.SecurityException unused) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "Unable to obtain permission to request a cellular network.");
            networkCallback = null;
        }
        this.f75626x9bee5f91 = networkCallback;
        org.p3371xd0ce3e8d.C29830x5a2dcdbe.SimpleNetworkCallback simpleNetworkCallback = new org.p3371xd0ce3e8d.C29830x5a2dcdbe.SimpleNetworkCallback();
        this.f75620x1ad678b2 = simpleNetworkCallback;
        this.f75622x2d0f1d9b.m155891x59bedf70(simpleNetworkCallback);
    }

    /* renamed from: connectionTypeChanged */
    private void m155867x1fa885c(org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState networkState) {
        org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155868x3a4db02e = m155868x3a4db02e(networkState);
        java.lang.String m155871x2bf15586 = m155871x2bf15586(networkState);
        if (m155868x3a4db02e == this.f75621x4bb5e338 && m155871x2bf15586.equals(this.f75630xb0171810)) {
            return;
        }
        this.f75621x4bb5e338 = m155868x3a4db02e;
        this.f75630xb0171810 = m155871x2bf15586;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Network connectivity changed, type is: " + this.f75621x4bb5e338);
        this.f75627x14c752d6.mo155818x67d37bbd(m155868x3a4db02e);
    }

    /* renamed from: getConnectionType */
    private static org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155869x3a4db02e(boolean z17, int i17, int i18) {
        if (!z17) {
            return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_NONE;
        }
        if (i17 == 0) {
            switch (i18) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_3G;
                case 13:
                case 18:
                    return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_4G;
                case 19:
                default:
                    return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_5G;
            }
        }
        if (i17 == 1) {
            return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_WIFI;
        }
        if (i17 == 6) {
            return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_4G;
        }
        if (i17 == 7) {
            return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_BLUETOOTH;
        }
        if (i17 == 9) {
            return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_ETHERNET;
        }
        if (i17 != 17) {
            return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_UNKNOWN;
        }
        return org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_VPN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUnderlyingConnectionTypeForVpn */
    public static org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155870xb23f74b6(org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState networkState) {
        return networkState.m155896x662add52() != 17 ? org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_NONE : m155869x3a4db02e(networkState.m155899x23b734ff(), networkState.m155898x30779100(), networkState.m155897x6f0ed5ea());
    }

    /* renamed from: getWifiSSID */
    private java.lang.String m155871x2bf15586(org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState networkState) {
        return m155868x3a4db02e(networkState) != org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_WIFI ? "" : this.f75629x6957b07d.m155906x2bf15586();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: networkToNetId */
    public static long m155872x54aba3cf(android.net.Network network) {
        return network.getNetworkHandle();
    }

    /* renamed from: registerReceiver */
    private void m155873xc20729b2() {
        if (this.f75625x11f61b4c) {
            return;
        }
        this.f75625x11f61b4c = true;
        this.f75623x38b735af.registerReceiver(this, this.f75624x6aea8934);
    }

    /* renamed from: setIncludeWifiDirect */
    public static void m155874x6143e5e4(boolean z17) {
        f75619x32795226 = z17;
    }

    /* renamed from: unregisterReceiver */
    private void m155875x41b0e64b() {
        if (this.f75625x11f61b4c) {
            this.f75625x11f61b4c = false;
            this.f75623x38b735af.unregisterReceiver(this);
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44
    /* renamed from: destroy */
    public void mo155805x5cd39ffa() {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f75620x1ad678b2;
        if (networkCallback != null) {
            this.f75622x2d0f1d9b.m155892x68ceb56c(networkCallback);
        }
        android.net.ConnectivityManager.NetworkCallback networkCallback2 = this.f75626x9bee5f91;
        if (networkCallback2 != null) {
            this.f75622x2d0f1d9b.m155892x68ceb56c(networkCallback2);
        }
        org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiDirectManagerDelegate wifiDirectManagerDelegate = this.f75628xf7b95114;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.m155905x41012807();
        }
        m155875x41b0e64b();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44
    /* renamed from: getActiveNetworkList */
    public java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation> mo155806x6393e850() {
        java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation> m155884x6393e850 = this.f75622x2d0f1d9b.m155884x6393e850();
        if (m155884x6393e850 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(m155884x6393e850);
        org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiDirectManagerDelegate wifiDirectManagerDelegate = this.f75628xf7b95114;
        if (wifiDirectManagerDelegate != null) {
            arrayList.addAll(wifiDirectManagerDelegate.m155904x6393e850());
        }
        return arrayList;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44
    /* renamed from: getCurrentConnectionType */
    public org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType mo155807x6dbab75b() {
        return m155868x3a4db02e(m155876xb28f27e6());
    }

    /* renamed from: getCurrentNetworkState */
    public org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155876xb28f27e6() {
        return this.f75622x2d0f1d9b.m155888x5f203979();
    }

    /* renamed from: getDefaultNetId */
    public long m155877x393a4c4d() {
        return this.f75622x2d0f1d9b.m155886x393a4c4d();
    }

    /* renamed from: isReceiverRegisteredForTesting */
    public boolean m155878x2c3c2802() {
        return this.f75625x11f61b4c;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155876xb28f27e6 = m155876xb28f27e6();
        if (io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be.equals(intent.getAction())) {
            m155867x1fa885c(m155876xb28f27e6);
        }
    }

    /* renamed from: setConnectivityManagerDelegateForTests */
    public void m155879x9daf7dd1(org.p3371xd0ce3e8d.C29830x5a2dcdbe.ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.f75622x2d0f1d9b = connectivityManagerDelegate;
    }

    /* renamed from: setWifiManagerDelegateForTests */
    public void m155880x417b2cb3(org.p3371xd0ce3e8d.C29830x5a2dcdbe.WifiManagerDelegate wifiManagerDelegate) {
        this.f75629x6957b07d = wifiManagerDelegate;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29826xb786ed44
    /* renamed from: supportNetworkCallback */
    public boolean mo155808x4cae90c4() {
        return this.f75622x2d0f1d9b.m155894x4cae90c4();
    }

    /* renamed from: org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate */
    /* loaded from: classes13.dex */
    public static class ConnectivityManagerDelegate {

        /* renamed from: connectivityManager */
        private final android.net.ConnectivityManager f75631x125d31f6;

        public ConnectivityManagerDelegate(android.content.Context context) {
            this.f75631x125d31f6 = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: networkToInfo */
        public org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation m155883xc8ea9d97(android.net.Network network) {
            android.net.ConnectivityManager connectivityManager;
            if (network == null || (connectivityManager = this.f75631x125d31f6) == null) {
                return null;
            }
            android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Detected unknown network: " + network.toString());
                return null;
            }
            if (linkProperties.getInterfaceName() == null) {
                org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Null interface name for network " + network.toString());
                return null;
            }
            org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155889x5f203979 = m155889x5f203979(network);
            org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155868x3a4db02e = org.p3371xd0ce3e8d.C29830x5a2dcdbe.m155868x3a4db02e(m155889x5f203979);
            if (m155868x3a4db02e == org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_NONE) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Network " + network.toString() + " is disconnected");
                return null;
            }
            if (m155868x3a4db02e == org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_UNKNOWN || m155868x3a4db02e == org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Network " + network.toString() + " connection type is " + m155868x3a4db02e + " because it has type " + m155889x5f203979.m155896x662add52() + " and subtype " + m155889x5f203979.m155895x19ac7c82());
            }
            return new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation(linkProperties.getInterfaceName(), m155868x3a4db02e, org.p3371xd0ce3e8d.C29830x5a2dcdbe.m155870xb23f74b6(m155889x5f203979), org.p3371xd0ce3e8d.C29830x5a2dcdbe.m155872x54aba3cf(network), m155887xee298d25(linkProperties));
        }

        /* renamed from: getActiveNetworkList */
        public java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation> m155884x6393e850() {
            if (!m155894x4cae90c4()) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.net.Network network : m155885x327cdf90()) {
                org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation m155883xc8ea9d97 = m155883xc8ea9d97(network);
                if (m155883xc8ea9d97 != null) {
                    arrayList.add(m155883xc8ea9d97);
                }
            }
            return arrayList;
        }

        /* renamed from: getAllNetworks */
        public android.net.Network[] m155885x327cdf90() {
            android.net.ConnectivityManager connectivityManager = this.f75631x125d31f6;
            return connectivityManager == null ? new android.net.Network[0] : connectivityManager.getAllNetworks();
        }

        /* renamed from: getDefaultNetId */
        public long m155886x393a4c4d() {
            android.net.NetworkInfo activeNetworkInfo;
            android.net.NetworkInfo networkInfo;
            if (!m155894x4cae90c4() || (activeNetworkInfo = this.f75631x125d31f6.getActiveNetworkInfo()) == null) {
                return -1L;
            }
            long j17 = -1;
            for (android.net.Network network : m155885x327cdf90()) {
                if (m155890x80240773(network) && (networkInfo = this.f75631x125d31f6.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    if (j17 != -1) {
                        throw new java.lang.RuntimeException("Multiple connected networks of same type are not supported.");
                    }
                    j17 = org.p3371xd0ce3e8d.C29830x5a2dcdbe.m155872x54aba3cf(network);
                }
            }
            return j17;
        }

        /* renamed from: getIPAddresses */
        public org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[] m155887xee298d25(android.net.LinkProperties linkProperties) {
            org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[] iPAddressArr = new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[linkProperties.getLinkAddresses().size()];
            java.util.Iterator<android.net.LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                iPAddressArr[i17] = new org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress(it.next().getAddress().getAddress());
                i17++;
            }
            return iPAddressArr;
        }

        /* renamed from: getNetworkState */
        public org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155888x5f203979() {
            android.net.ConnectivityManager connectivityManager = this.f75631x125d31f6;
            if (connectivityManager == null) {
                return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(false, -1, -1, -1, -1);
            }
            return m155882x5f203979(connectivityManager.getActiveNetworkInfo());
        }

        /* renamed from: hasInternetCapability */
        public boolean m155890x80240773(android.net.Network network) {
            android.net.NetworkCapabilities networkCapabilities;
            android.net.ConnectivityManager connectivityManager = this.f75631x125d31f6;
            return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null || !networkCapabilities.hasCapability(12)) ? false : true;
        }

        /* renamed from: registerNetworkCallback */
        public void m155891x59bedf70(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            this.f75631x125d31f6.registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), networkCallback);
        }

        /* renamed from: releaseCallback */
        public void m155892x68ceb56c(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            if (m155894x4cae90c4()) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Unregister network callback");
                this.f75631x125d31f6.unregisterNetworkCallback(networkCallback);
            }
        }

        /* renamed from: requestMobileNetwork */
        public void m155893x3fd8e4dd(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            this.f75631x125d31f6.requestNetwork(builder.build(), networkCallback);
        }

        /* renamed from: supportNetworkCallback */
        public boolean m155894x4cae90c4() {
            return this.f75631x125d31f6 != null;
        }

        public ConnectivityManagerDelegate() {
            this.f75631x125d31f6 = null;
        }

        /* renamed from: getNetworkState */
        public org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155889x5f203979(android.net.Network network) {
            android.net.ConnectivityManager connectivityManager;
            android.net.NetworkInfo activeNetworkInfo;
            if (network != null && (connectivityManager = this.f75631x125d31f6) != null) {
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo == null) {
                    org.p3371xd0ce3e8d.C29806x779f633f.w(org.p3371xd0ce3e8d.C29830x5a2dcdbe.TAG, "Couldn't retrieve information from network " + network.toString());
                    return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(false, -1, -1, -1, -1);
                }
                if (networkInfo.getType() != 17) {
                    android.net.NetworkCapabilities networkCapabilities = this.f75631x125d31f6.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                    }
                    return m155882x5f203979(networkInfo);
                }
                if (networkInfo.getType() == 17) {
                    if (network.equals(this.f75631x125d31f6.getActiveNetwork()) && (activeNetworkInfo = this.f75631x125d31f6.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 17) {
                        return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                    }
                    return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                }
                return m155882x5f203979(networkInfo);
            }
            return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(false, -1, -1, -1, -1);
        }

        /* renamed from: getNetworkState */
        private org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState m155882x5f203979(android.net.NetworkInfo networkInfo) {
            if (networkInfo != null && networkInfo.isConnected()) {
                return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
            }
            return new org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState(false, -1, -1, -1, -1);
        }
    }

    /* renamed from: org.webrtc.NetworkMonitorAutoDetect$WifiManagerDelegate */
    /* loaded from: classes13.dex */
    public static class WifiManagerDelegate {

        /* renamed from: context */
        private final android.content.Context f75642x38b735af;

        public WifiManagerDelegate(android.content.Context context) {
            this.f75642x38b735af = context;
        }

        /* renamed from: getWifiSSID */
        public java.lang.String m155906x2bf15586() {
            android.net.wifi.WifiInfo wifiInfo;
            java.lang.String ssid;
            android.content.Intent registerReceiver = this.f75642x38b735af.registerReceiver(null, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
            return (registerReceiver == null || (wifiInfo = (android.net.wifi.WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
        }

        public WifiManagerDelegate() {
            this.f75642x38b735af = null;
        }
    }

    /* renamed from: getConnectionType */
    public static org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155868x3a4db02e(org.p3371xd0ce3e8d.C29830x5a2dcdbe.NetworkState networkState) {
        return m155869x3a4db02e(networkState.m155899x23b734ff(), networkState.m155896x662add52(), networkState.m155895x19ac7c82());
    }
}
