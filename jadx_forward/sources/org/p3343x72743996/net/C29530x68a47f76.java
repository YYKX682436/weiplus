package org.p3343x72743996.net;

/* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect */
/* loaded from: classes13.dex */
public class C29530x68a47f76 extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "NetworkChangeNotifierAutoDetect";

    /* renamed from: UNKNOWN_LINK_SPEED */
    private static final int f74132x43f2eed7 = -1;

    /* renamed from: mConnectivityManagerDelegate */
    private org.p3343x72743996.net.C29530x68a47f76.ConnectivityManagerDelegate f74133x8bed28ee;

    /* renamed from: mDefaultNetworkCallback */
    private android.net.ConnectivityManager.NetworkCallback f74134x5d234df;

    /* renamed from: mHandler */
    private final android.os.Handler f74135xc7640a1d;

    /* renamed from: mIgnoreNextBroadcast */
    private boolean f74136x3c13e4af;

    /* renamed from: mIntentFilter */
    private final org.p3343x72743996.net.C29530x68a47f76.NetworkConnectivityIntentFilter f74137x27fa241;

    /* renamed from: mLooper */
    private final android.os.Looper f74138xe07e11e;

    /* renamed from: mNetworkCallback */
    private org.p3343x72743996.net.C29530x68a47f76.MyNetworkCallback f74139x79780066;

    /* renamed from: mNetworkRequest */
    private android.net.NetworkRequest f74140xe2760a4e;

    /* renamed from: mNetworkState */
    private org.p3343x72743996.net.C29530x68a47f76.NetworkState f74141x95c2c010;

    /* renamed from: mObserver */
    private final org.p3343x72743996.net.C29530x68a47f76.Observer f74142x39c4fa63;

    /* renamed from: mRegisterNetworkCallbackFailed */
    private boolean f74143xe2198e60;

    /* renamed from: mRegistered */
    private boolean f74144x6cbd16cf;

    /* renamed from: mRegistrationPolicy */
    private final org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy f74145x2f78a698;

    /* renamed from: mShouldSignalObserver */
    private boolean f74146xb6ac263e;

    /* renamed from: mWifiManagerDelegate */
    private org.p3343x72743996.net.C29530x68a47f76.WifiManagerDelegate f74147x53f3bed0;

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$AndroidRDefaultNetworkCallback */
    /* loaded from: classes13.dex */
    public class AndroidRDefaultNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {

        /* renamed from: mLinkProperties */
        android.net.LinkProperties f74149xed8cf29a;

        /* renamed from: mNetworkCapabilities */
        android.net.NetworkCapabilities f74150x2bf1f757;

        /* renamed from: getNetworkState */
        private org.p3343x72743996.net.C29530x68a47f76.NetworkState m153397x5f203979(android.net.Network network) {
            int i17;
            int i18;
            int type;
            if (!this.f74150x2bf1f757.hasTransport(1) && !this.f74150x2bf1f757.hasTransport(5)) {
                if (this.f74150x2bf1f757.hasTransport(0)) {
                    android.net.NetworkInfo m153405x664dffaa = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153405x664dffaa(network);
                    i18 = m153405x664dffaa != null ? m153405x664dffaa.getSubtype() : -1;
                    i17 = 0;
                } else {
                    if (this.f74150x2bf1f757.hasTransport(3)) {
                        type = 9;
                    } else if (this.f74150x2bf1f757.hasTransport(2)) {
                        type = 7;
                    } else if (this.f74150x2bf1f757.hasTransport(4)) {
                        android.net.NetworkInfo m153403x6625b2c6 = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153403x6625b2c6(network);
                        type = m153403x6625b2c6 != null ? m153403x6625b2c6.getType() : 17;
                    } else {
                        i17 = -1;
                        i18 = -1;
                    }
                    i17 = type;
                }
                return new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, i17, i18, !this.f74150x2bf1f757.hasCapability(11), java.lang.String.valueOf(org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(network)), org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152841xf1a5e896(this.f74149xed8cf29a), org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152837x4aa59a2a(this.f74149xed8cf29a));
            }
            i17 = 1;
            i18 = -1;
            return new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, i17, i18, !this.f74150x2bf1f757.hasCapability(11), java.lang.String.valueOf(org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(network)), org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152841xf1a5e896(this.f74149xed8cf29a), org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29394xdcec370f.m152837x4aa59a2a(this.f74149xed8cf29a));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            this.f74149xed8cf29a = null;
            this.f74150x2bf1f757 = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            this.f74150x2bf1f757 = networkCapabilities;
            if (!org.p3343x72743996.net.C29530x68a47f76.this.f74144x6cbd16cf || this.f74149xed8cf29a == null || this.f74150x2bf1f757 == null) {
                return;
            }
            org.p3343x72743996.net.C29530x68a47f76.this.m153375x6d79ebf7(m153397x5f203979(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            this.f74149xed8cf29a = linkProperties;
            if (!org.p3343x72743996.net.C29530x68a47f76.this.f74144x6cbd16cf || this.f74149xed8cf29a == null || this.f74150x2bf1f757 == null) {
                return;
            }
            org.p3343x72743996.net.C29530x68a47f76.this.m153375x6d79ebf7(m153397x5f203979(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            this.f74149xed8cf29a = null;
            this.f74150x2bf1f757 = null;
            if (org.p3343x72743996.net.C29530x68a47f76.this.f74144x6cbd16cf) {
                org.p3343x72743996.net.C29530x68a47f76.this.m153375x6d79ebf7(new org.p3343x72743996.net.C29530x68a47f76.NetworkState(false, -1, -1, false, null, false, ""));
            }
        }

        private AndroidRDefaultNetworkCallback() {
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$DefaultNetworkCallback */
    /* loaded from: classes13.dex */
    public class DefaultNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            if (org.p3343x72743996.net.C29530x68a47f76.this.f74144x6cbd16cf) {
                org.p3343x72743996.net.C29530x68a47f76.this.m153374x1fa885c();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            onAvailable(null);
        }

        private DefaultNetworkCallback() {
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$MyNetworkCallback */
    /* loaded from: classes13.dex */
    public class MyNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f74155x7118e671 = false;

        /* renamed from: mVpnInPlace */
        private android.net.Network f74156xccb3d79b;

        /* renamed from: ignoreConnectedInaccessibleVpn */
        private boolean m153410x19054602(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                networkCapabilities = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153402x9985c5ce(network);
            }
            return networkCapabilities == null || (networkCapabilities.hasTransport(4) && !org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153409x7b2b9fca(network));
        }

        /* renamed from: ignoreConnectedNetwork */
        private boolean m153411xa9190d7(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            return m153412xcc7e5b01(network) || m153410x19054602(network, networkCapabilities);
        }

        /* renamed from: ignoreNetworkDueToVpn */
        private boolean m153412xcc7e5b01(android.net.Network network) {
            android.net.Network network2 = this.f74156xccb3d79b;
            return (network2 == null || network2.equals(network)) ? false : true;
        }

        /* renamed from: initializeVpnInPlace */
        public void m153413xbe252fe() {
            android.net.NetworkCapabilities m153402x9985c5ce;
            android.net.Network[] m153377xd28a8dc7 = org.p3343x72743996.net.C29530x68a47f76.m153377xd28a8dc7(org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee, null);
            this.f74156xccb3d79b = null;
            if (m153377xd28a8dc7.length == 1 && (m153402x9985c5ce = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153402x9985c5ce(m153377xd28a8dc7[0])) != null && m153402x9985c5ce.hasTransport(4)) {
                this.f74156xccb3d79b = m153377xd28a8dc7[0];
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            android.net.Network network2;
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("NetworkChangeNotifierCallback::onAvailable");
            try {
                android.net.NetworkCapabilities m153402x9985c5ce = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153402x9985c5ce(network);
                if (m153411xa9190d7(network, m153402x9985c5ce)) {
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                        return;
                    }
                    return;
                }
                final boolean z17 = m153402x9985c5ce.hasTransport(4) && ((network2 = this.f74156xccb3d79b) == null || !network.equals(network2));
                if (z17) {
                    this.f74156xccb3d79b = network;
                }
                final long m153381x54aba3cf = org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(network);
                final int m153400x3a4db02e = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153400x3a4db02e(network);
                org.p3343x72743996.net.C29530x68a47f76.this.m153383x7804874(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153361x1f62e9b(m153381x54aba3cf, m153400x3a4db02e);
                        if (z17) {
                            org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153360x67d37bbd(m153400x3a4db02e);
                            org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153364xaba7b9b(new long[]{m153381x54aba3cf});
                        }
                    }
                });
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("NetworkChangeNotifierCallback::onCapabilitiesChanged");
            try {
                if (m153411xa9190d7(network, networkCapabilities)) {
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                    }
                } else {
                    final long m153381x54aba3cf = org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(network);
                    final int m153400x3a4db02e = org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee.m153400x3a4db02e(network);
                    org.p3343x72743996.net.C29530x68a47f76.this.m153383x7804874(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.2
                        @Override // java.lang.Runnable
                        public void run() {
                            org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153361x1f62e9b(m153381x54aba3cf, m153400x3a4db02e);
                        }
                    });
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(android.net.Network network, int i17) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("NetworkChangeNotifierCallback::onLosing");
            try {
                if (m153411xa9190d7(network, null)) {
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                    }
                } else {
                    final long m153381x54aba3cf = org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(network);
                    org.p3343x72743996.net.C29530x68a47f76.this.m153383x7804874(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.3
                        @Override // java.lang.Runnable
                        public void run() {
                            org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153363x45a50fc1(m153381x54aba3cf);
                        }
                    });
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(final android.net.Network network) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("NetworkChangeNotifierCallback::onLost");
            try {
                if (m153412xcc7e5b01(network)) {
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                        return;
                    }
                    return;
                }
                org.p3343x72743996.net.C29530x68a47f76.this.m153383x7804874(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.4
                    @Override // java.lang.Runnable
                    public void run() {
                        org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153362x9553f94b(org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(network));
                    }
                });
                if (this.f74156xccb3d79b != null) {
                    this.f74156xccb3d79b = null;
                    for (android.net.Network network2 : org.p3343x72743996.net.C29530x68a47f76.m153377xd28a8dc7(org.p3343x72743996.net.C29530x68a47f76.this.f74133x8bed28ee, network)) {
                        onAvailable(network2);
                    }
                    final int m153416x3a4db02e = org.p3343x72743996.net.C29530x68a47f76.this.m153385xb28f27e6().m153416x3a4db02e();
                    org.p3343x72743996.net.C29530x68a47f76.this.m153383x7804874(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.5
                        @Override // java.lang.Runnable
                        public void run() {
                            org.p3343x72743996.net.C29530x68a47f76.this.f74142x39c4fa63.mo153360x67d37bbd(m153416x3a4db02e);
                        }
                    });
                }
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        private MyNetworkCallback() {
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkConnectivityIntentFilter */
    /* loaded from: classes13.dex */
    public static class NetworkConnectivityIntentFilter extends android.content.IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState */
    /* loaded from: classes13.dex */
    public static class NetworkState {

        /* renamed from: mConnected */
        private final boolean f74171x58313d1c;

        /* renamed from: mIsMetered */
        private final boolean f74172x911b8b71;

        /* renamed from: mIsPrivateDnsActive */
        private final boolean f74173xf0f543e3;

        /* renamed from: mNetworkIdentifier */
        private final java.lang.String f74174x23cd088a;

        /* renamed from: mPrivateDnsServerName */
        private final java.lang.String f74175x5bf99c1;

        /* renamed from: mSubtype */
        private final int f74176x2ec7e04d;

        /* renamed from: mType */
        private final int f74177x6280547;

        public NetworkState(boolean z17, int i17, int i18, boolean z18, java.lang.String str, boolean z19, java.lang.String str2) {
            this.f74171x58313d1c = z17;
            this.f74177x6280547 = i17;
            this.f74176x2ec7e04d = i18;
            this.f74172x911b8b71 = z18;
            this.f74174x23cd088a = str == null ? "" : str;
            this.f74173xf0f543e3 = z19;
            this.f74175x5bf99c1 = str2 == null ? "" : str2;
        }

        /* renamed from: getConnectionCost */
        public int m153414x3a45d0c1() {
            return m153422x1664415e() ? 2 : 1;
        }

        /* renamed from: getConnectionSubtype */
        public int m153415x9a32f806() {
            if (!m153421x23b734ff()) {
                return 1;
            }
            int m153419x662add52 = m153419x662add52();
            if (m153419x662add52 != 0 && m153419x662add52 != 4 && m153419x662add52 != 5) {
                return 0;
            }
            switch (m153418x19ac7c82()) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        /* renamed from: getConnectionType */
        public int m153416x3a4db02e() {
            if (m153421x23b734ff()) {
                return org.p3343x72743996.net.C29530x68a47f76.m153376x77a0e666(m153419x662add52(), m153418x19ac7c82());
            }
            return 6;
        }

        /* renamed from: getNetworkIdentifier */
        public java.lang.String m153417xda2008c1() {
            return this.f74174x23cd088a;
        }

        /* renamed from: getNetworkSubType */
        public int m153418x19ac7c82() {
            return this.f74176x2ec7e04d;
        }

        /* renamed from: getNetworkType */
        public int m153419x662add52() {
            return this.f74177x6280547;
        }

        /* renamed from: getPrivateDnsServerName */
        public java.lang.String m153420x4aa59a2a() {
            return this.f74175x5bf99c1;
        }

        /* renamed from: isConnected */
        public boolean m153421x23b734ff() {
            return this.f74171x58313d1c;
        }

        /* renamed from: isMetered */
        public boolean m153422x1664415e() {
            return this.f74172x911b8b71;
        }

        /* renamed from: isPrivateDnsActive */
        public boolean m153423xf1a5e896() {
            return this.f74173xf0f543e3;
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$Observer */
    /* loaded from: classes13.dex */
    public interface Observer {
        /* renamed from: onConnectionCostChanged */
        void mo153358xccc41fca(int i17);

        /* renamed from: onConnectionSubtypeChanged */
        void mo153359xf54ec357(int i17);

        /* renamed from: onConnectionTypeChanged */
        void mo153360x67d37bbd(int i17);

        /* renamed from: onNetworkConnect */
        void mo153361x1f62e9b(long j17, int i17);

        /* renamed from: onNetworkDisconnect */
        void mo153362x9553f94b(long j17);

        /* renamed from: onNetworkSoonToDisconnect */
        void mo153363x45a50fc1(long j17);

        /* renamed from: purgeActiveNetworkList */
        void mo153364xaba7b9b(long[] jArr);
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$RegistrationPolicy */
    /* loaded from: classes13.dex */
    public static abstract class RegistrationPolicy {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f74178x7118e671 = false;

        /* renamed from: mNotifier */
        private org.p3343x72743996.net.C29530x68a47f76 f74179x837c6133;

        /* renamed from: destroy */
        public abstract void mo153424x5cd39ffa();

        /* renamed from: init */
        public void mo153425x316510(org.p3343x72743996.net.C29530x68a47f76 c29530x68a47f76) {
            this.f74179x837c6133 = c29530x68a47f76;
        }

        /* renamed from: register */
        public final void m153426xd6dc2ea3() {
            this.f74179x837c6133.m153392xd6dc2ea3();
        }

        /* renamed from: unregister */
        public final void m153427x31d4943c() {
            this.f74179x837c6133.m153396x31d4943c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29530x68a47f76(org.p3343x72743996.net.C29530x68a47f76.Observer observer, org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy registrationPolicy) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.f74138xe07e11e = myLooper;
        this.f74135xc7640a1d = new android.os.Handler(myLooper);
        this.f74142x39c4fa63 = observer;
        this.f74133x8bed28ee = new org.p3343x72743996.net.C29530x68a47f76.ConnectivityManagerDelegate(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035());
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        this.f74139x79780066 = new org.p3343x72743996.net.C29530x68a47f76.MyNetworkCallback();
        this.f74140xe2760a4e = new android.net.NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i17 >= 30) {
            this.f74134x5d234df = new org.p3343x72743996.net.C29530x68a47f76.AndroidRDefaultNetworkCallback();
        } else {
            this.f74134x5d234df = i17 >= 28 ? new org.p3343x72743996.net.C29530x68a47f76.DefaultNetworkCallback() : null;
        }
        this.f74141x95c2c010 = m153385xb28f27e6();
        this.f74137x27fa241 = new org.p3343x72743996.net.C29530x68a47f76.NetworkConnectivityIntentFilter();
        this.f74136x3c13e4af = false;
        this.f74146xb6ac263e = false;
        this.f74145x2f78a698 = registrationPolicy;
        registrationPolicy.mo153425x316510(this);
        this.f74146xb6ac263e = true;
    }

    /* renamed from: assertOnThread */
    private void m153373x4354162f() {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11 && !m153382x5ad5e4c9()) {
            throw new java.lang.IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: connectionTypeChanged */
    public void m153374x1fa885c() {
        m153375x6d79ebf7(m153385xb28f27e6());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: connectionTypeChangedTo */
    public void m153375x6d79ebf7(org.p3343x72743996.net.C29530x68a47f76.NetworkState networkState) {
        if (networkState.m153416x3a4db02e() != this.f74141x95c2c010.m153416x3a4db02e() || !networkState.m153417xda2008c1().equals(this.f74141x95c2c010.m153417xda2008c1()) || networkState.m153423xf1a5e896() != this.f74141x95c2c010.m153423xf1a5e896() || !networkState.m153420x4aa59a2a().equals(this.f74141x95c2c010.m153420x4aa59a2a())) {
            this.f74142x39c4fa63.mo153360x67d37bbd(networkState.m153416x3a4db02e());
        }
        if (networkState.m153416x3a4db02e() != this.f74141x95c2c010.m153416x3a4db02e() || networkState.m153415x9a32f806() != this.f74141x95c2c010.m153415x9a32f806()) {
            this.f74142x39c4fa63.mo153359xf54ec357(networkState.m153415x9a32f806());
        }
        if (networkState.m153414x3a45d0c1() != this.f74141x95c2c010.m153414x3a45d0c1()) {
            this.f74142x39c4fa63.mo153358xccc41fca(networkState.m153414x3a45d0c1());
        }
        this.f74141x95c2c010 = networkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToConnectionType */
    public static int m153376x77a0e666(int i17, int i18) {
        if (i17 != 0) {
            if (i17 == 1) {
                return 2;
            }
            if (i17 != 4 && i17 != 5) {
                if (i17 == 6) {
                    return 5;
                }
                if (i17 != 7) {
                    return i17 != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i18 == 20) {
            return 8;
        }
        switch (i18) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAllNetworksFiltered */
    public static android.net.Network[] m153377xd28a8dc7(org.p3343x72743996.net.C29530x68a47f76.ConnectivityManagerDelegate connectivityManagerDelegate, android.net.Network network) {
        android.net.NetworkCapabilities m153402x9985c5ce;
        android.net.Network[] m153399xe6a4c760 = connectivityManagerDelegate.m153399xe6a4c760();
        int i17 = 0;
        for (android.net.Network network2 : m153399xe6a4c760) {
            if (!network2.equals(network) && (m153402x9985c5ce = connectivityManagerDelegate.m153402x9985c5ce(network2)) != null && m153402x9985c5ce.hasCapability(12)) {
                if (!m153402x9985c5ce.hasTransport(4)) {
                    m153399xe6a4c760[i17] = network2;
                    i17++;
                } else if (connectivityManagerDelegate.m153409x7b2b9fca(network2)) {
                    return new android.net.Network[]{network2};
                }
            }
        }
        return (android.net.Network[]) java.util.Arrays.copyOf(m153399xe6a4c760, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$runOnThread$0 */
    public /* synthetic */ void m153378x4dd805e3(java.lang.Runnable runnable) {
        if (this.f74144x6cbd16cf) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setConnectivityManagerDelegateForTests$1 */
    public /* synthetic */ void m153379x5bfdb65b(org.p3343x72743996.net.C29530x68a47f76.ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.f74133x8bed28ee = connectivityManagerDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setWifiManagerDelegateForTests$2 */
    public /* synthetic */ void m153380x62cbc1be(org.p3343x72743996.net.C29530x68a47f76.WifiManagerDelegate wifiManagerDelegate) {
        this.f74147x53f3bed0 = wifiManagerDelegate;
    }

    /* renamed from: networkToNetId */
    public static long m153381x54aba3cf(android.net.Network network) {
        return org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152794x711b9640(network);
    }

    /* renamed from: onThread */
    private boolean m153382x5ad5e4c9() {
        return this.f74138xe07e11e == android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnThread */
    public void m153383x7804874(final java.lang.Runnable runnable) {
        if (m153382x5ad5e4c9()) {
            runnable.run();
        } else {
            this.f74135xc7640a1d.post(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.net.C29530x68a47f76.this.m153378x4dd805e3(runnable);
                }
            });
        }
    }

    /* renamed from: destroy */
    public void m153384x5cd39ffa() {
        m153373x4354162f();
        this.f74145x2f78a698.mo153424x5cd39ffa();
        m153396x31d4943c();
    }

    /* renamed from: getCurrentNetworkState */
    public org.p3343x72743996.net.C29530x68a47f76.NetworkState m153385xb28f27e6() {
        return this.f74133x8bed28ee.m153404x5f203979(this.f74147x53f3bed0);
    }

    /* renamed from: getDefaultNetId */
    public long m153386x393a4c4d() {
        android.net.Network m153387xd3ed8da3 = m153387xd3ed8da3();
        if (m153387xd3ed8da3 == null) {
            return -1L;
        }
        return m153381x54aba3cf(m153387xd3ed8da3);
    }

    /* renamed from: getDefaultNetwork */
    public android.net.Network m153387xd3ed8da3() {
        return this.f74133x8bed28ee.m153401xd3ed8da3();
    }

    /* renamed from: getNetworksAndTypes */
    public long[] m153388x63635f7d() {
        android.net.Network[] m153377xd28a8dc7 = m153377xd28a8dc7(this.f74133x8bed28ee, null);
        long[] jArr = new long[m153377xd28a8dc7.length * 2];
        int i17 = 0;
        for (android.net.Network network : m153377xd28a8dc7) {
            int i18 = i17 + 1;
            jArr[i17] = m153381x54aba3cf(network);
            i17 = i18 + 1;
            jArr[i18] = this.f74133x8bed28ee.m153400x3a4db02e(r5);
        }
        return jArr;
    }

    /* renamed from: getNetworksForTesting */
    public android.net.Network[] m153389xfe1da0e2() {
        return m153377xd28a8dc7(this.f74133x8bed28ee, null);
    }

    /* renamed from: getRegistrationPolicy */
    public org.p3343x72743996.net.C29530x68a47f76.RegistrationPolicy m153390x4385ad41() {
        return this.f74145x2f78a698;
    }

    /* renamed from: isReceiverRegisteredForTesting */
    public boolean m153391x2c3c2802() {
        return this.f74144x6cbd16cf;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        m153383x7804874(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.1
            @Override // java.lang.Runnable
            public void run() {
                if (org.p3343x72743996.net.C29530x68a47f76.this.f74136x3c13e4af) {
                    org.p3343x72743996.net.C29530x68a47f76.this.f74136x3c13e4af = false;
                } else {
                    org.p3343x72743996.net.C29530x68a47f76.this.m153374x1fa885c();
                }
            }
        });
    }

    /* renamed from: register */
    public void m153392xd6dc2ea3() {
        m153373x4354162f();
        if (this.f74144x6cbd16cf) {
            m153374x1fa885c();
            return;
        }
        if (this.f74146xb6ac263e) {
            m153374x1fa885c();
        }
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f74134x5d234df;
        if (networkCallback != null) {
            try {
                this.f74133x8bed28ee.m153406x9fae3695(networkCallback, this.f74135xc7640a1d);
            } catch (java.lang.RuntimeException unused) {
                this.f74134x5d234df = null;
            }
        }
        if (this.f74134x5d234df == null) {
            this.f74136x3c13e4af = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), this, this.f74137x27fa241) != null;
        }
        this.f74144x6cbd16cf = true;
        org.p3343x72743996.net.C29530x68a47f76.MyNetworkCallback myNetworkCallback = this.f74139x79780066;
        if (myNetworkCallback != null) {
            myNetworkCallback.m153413xbe252fe();
            try {
                this.f74133x8bed28ee.m153407x59bedf70(this.f74140xe2760a4e, this.f74139x79780066, this.f74135xc7640a1d);
            } catch (java.lang.RuntimeException unused2) {
                this.f74143xe2198e60 = true;
                this.f74139x79780066 = null;
            }
            if (this.f74143xe2198e60 || !this.f74146xb6ac263e) {
                return;
            }
            android.net.Network[] m153377xd28a8dc7 = m153377xd28a8dc7(this.f74133x8bed28ee, null);
            long[] jArr = new long[m153377xd28a8dc7.length];
            for (int i17 = 0; i17 < m153377xd28a8dc7.length; i17++) {
                jArr[i17] = m153381x54aba3cf(m153377xd28a8dc7[i17]);
            }
            this.f74142x39c4fa63.mo153364xaba7b9b(jArr);
        }
    }

    /* renamed from: registerNetworkCallbackFailed */
    public boolean m153393xc2910bcd() {
        return this.f74143xe2198e60;
    }

    /* renamed from: setConnectivityManagerDelegateForTests */
    public void m153394x9daf7dd1(org.p3343x72743996.net.C29530x68a47f76.ConnectivityManagerDelegate connectivityManagerDelegate) {
        final org.p3343x72743996.net.C29530x68a47f76.ConnectivityManagerDelegate connectivityManagerDelegate2 = this.f74133x8bed28ee;
        this.f74133x8bed28ee = connectivityManagerDelegate;
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$c
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.net.C29530x68a47f76.this.m153379x5bfdb65b(connectivityManagerDelegate2);
            }
        });
    }

    /* renamed from: setWifiManagerDelegateForTests */
    public void m153395x417b2cb3(org.p3343x72743996.net.C29530x68a47f76.WifiManagerDelegate wifiManagerDelegate) {
        final org.p3343x72743996.net.C29530x68a47f76.WifiManagerDelegate wifiManagerDelegate2 = this.f74147x53f3bed0;
        this.f74147x53f3bed0 = wifiManagerDelegate;
        org.p3343x72743996.p3344x2e06d1.C29364x88e8a208.m152639xd6dc2ea3(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.net.C29530x68a47f76.this.m153380x62cbc1be(wifiManagerDelegate2);
            }
        });
    }

    /* renamed from: unregister */
    public void m153396x31d4943c() {
        m153373x4354162f();
        if (this.f74144x6cbd16cf) {
            this.f74144x6cbd16cf = false;
            org.p3343x72743996.net.C29530x68a47f76.MyNetworkCallback myNetworkCallback = this.f74139x79780066;
            if (myNetworkCallback != null) {
                this.f74133x8bed28ee.m153408xc7d74b7(myNetworkCallback);
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.f74134x5d234df;
            if (networkCallback != null) {
                this.f74133x8bed28ee.m153408xc7d74b7(networkCallback);
            } else {
                org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().unregisterReceiver(this);
            }
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$ConnectivityManagerDelegate */
    /* loaded from: classes13.dex */
    public static class ConnectivityManagerDelegate {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f74152x7118e671 = false;

        /* renamed from: mConnectivityManager */
        private final android.net.ConnectivityManager f74153xfcf94049;

        public ConnectivityManagerDelegate(android.content.Context context) {
            this.f74153xfcf94049 = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        }

        /* renamed from: processActiveNetworkInfo */
        private android.net.NetworkInfo m153398x8cf60267(android.net.NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (networkInfo.getDetailedState() == android.net.NetworkInfo.DetailedState.BLOCKED && org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152194x62791482() == 1) {
                return networkInfo;
            }
            return null;
        }

        /* renamed from: getAllNetworksUnfiltered */
        public android.net.Network[] m153399xe6a4c760() {
            android.net.Network[] allNetworks = this.f74153xfcf94049.getAllNetworks();
            return allNetworks == null ? new android.net.Network[0] : allNetworks;
        }

        /* renamed from: getConnectionType */
        public int m153400x3a4db02e(android.net.Network network) {
            android.net.NetworkInfo m153403x6625b2c6 = m153403x6625b2c6(network);
            if (m153403x6625b2c6 == null || !m153403x6625b2c6.isConnected()) {
                return 6;
            }
            return org.p3343x72743996.net.C29530x68a47f76.m153376x77a0e666(m153403x6625b2c6.getType(), m153403x6625b2c6.getSubtype());
        }

        /* renamed from: getDefaultNetwork */
        public android.net.Network m153401xd3ed8da3() {
            android.net.NetworkInfo networkInfo;
            android.net.Network m152789xe4f45c92 = org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152789xe4f45c92(this.f74153xfcf94049);
            if (m152789xe4f45c92 != null) {
                return m152789xe4f45c92;
            }
            try {
                networkInfo = this.f74153xfcf94049.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
                networkInfo = null;
            }
            if (networkInfo == null) {
                return null;
            }
            for (android.net.Network network : org.p3343x72743996.net.C29530x68a47f76.m153377xd28a8dc7(this, null)) {
                android.net.NetworkInfo m153405x664dffaa = m153405x664dffaa(network);
                if (m153405x664dffaa != null && (m153405x664dffaa.getType() == networkInfo.getType() || m153405x664dffaa.getType() == 17)) {
                    if (m152789xe4f45c92 != null && android.os.Build.VERSION.SDK_INT >= 29) {
                        if (m153405x664dffaa.getDetailedState() != android.net.NetworkInfo.DetailedState.CONNECTING) {
                            android.net.NetworkInfo m153405x664dffaa2 = m153405x664dffaa(m152789xe4f45c92);
                            if (m153405x664dffaa2 != null) {
                                m153405x664dffaa2.getDetailedState();
                                android.net.NetworkInfo.DetailedState detailedState = android.net.NetworkInfo.DetailedState.CONNECTING;
                            }
                        }
                    }
                    m152789xe4f45c92 = network;
                }
            }
            return m152789xe4f45c92;
        }

        /* renamed from: getNetworkCapabilities */
        public android.net.NetworkCapabilities m153402x9985c5ce(android.net.Network network) {
            for (int i17 = 0; i17 < 2; i17++) {
                try {
                    return this.f74153xfcf94049.getNetworkCapabilities(network);
                } catch (java.lang.SecurityException unused) {
                }
            }
            return null;
        }

        /* renamed from: getNetworkInfo */
        public android.net.NetworkInfo m153403x6625b2c6(android.net.Network network) {
            android.net.NetworkInfo m153405x664dffaa = m153405x664dffaa(network);
            return (m153405x664dffaa == null || m153405x664dffaa.getType() != 17) ? m153405x664dffaa : this.f74153xfcf94049.getActiveNetworkInfo();
        }

        /* renamed from: getNetworkState */
        public org.p3343x72743996.net.C29530x68a47f76.NetworkState m153404x5f203979(org.p3343x72743996.net.C29530x68a47f76.WifiManagerDelegate wifiManagerDelegate) {
            android.net.Network m153401xd3ed8da3 = m153401xd3ed8da3();
            android.net.NetworkInfo m153398x8cf60267 = m153398x8cf60267(m153403x6625b2c6(m153401xd3ed8da3));
            if (m153398x8cf60267 == null) {
                return new org.p3343x72743996.net.C29530x68a47f76.NetworkState(false, -1, -1, false, null, false, "");
            }
            if (m153401xd3ed8da3 == null) {
                return m153398x8cf60267.getType() == 1 ? (m153398x8cf60267.getExtraInfo() == null || "".equals(m153398x8cf60267.getExtraInfo())) ? new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, m153398x8cf60267.getType(), m153398x8cf60267.getSubtype(), false, wifiManagerDelegate.m153430x2bf1d1a6(), false, "") : new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, m153398x8cf60267.getType(), m153398x8cf60267.getSubtype(), false, m153398x8cf60267.getExtraInfo(), false, "") : new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, m153398x8cf60267.getType(), m153398x8cf60267.getSubtype(), false, null, false, "");
            }
            android.net.NetworkCapabilities m153402x9985c5ce = m153402x9985c5ce(m153401xd3ed8da3);
            boolean z17 = (m153402x9985c5ce == null || m153402x9985c5ce.hasCapability(11)) ? false : true;
            org.p3343x72743996.net.C29504x5c8e1e5b m153060xe4896fc5 = org.p3343x72743996.net.C29487x9ab916dc.m153060xe4896fc5(m153401xd3ed8da3);
            return m153060xe4896fc5 == null ? new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, m153398x8cf60267.getType(), m153398x8cf60267.getSubtype(), z17, java.lang.String.valueOf(org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(m153401xd3ed8da3)), false, "") : new org.p3343x72743996.net.C29530x68a47f76.NetworkState(true, m153398x8cf60267.getType(), m153398x8cf60267.getSubtype(), z17, java.lang.String.valueOf(org.p3343x72743996.net.C29530x68a47f76.m153381x54aba3cf(m153401xd3ed8da3)), m153060xe4896fc5.m153232xef9592c2(), m153060xe4896fc5.m153233x4aa59a2a());
        }

        /* renamed from: getRawNetworkInfo */
        public android.net.NetworkInfo m153405x664dffaa(android.net.Network network) {
            try {
                try {
                    return this.f74153xfcf94049.getNetworkInfo(network);
                } catch (java.lang.NullPointerException unused) {
                    return null;
                }
            } catch (java.lang.NullPointerException unused2) {
                return this.f74153xfcf94049.getNetworkInfo(network);
            }
        }

        /* renamed from: registerDefaultNetworkCallback */
        public void m153406x9fae3695(android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) {
            org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29392xdcec370e.m152827x9fae3695(this.f74153xfcf94049, networkCallback, handler);
        }

        /* renamed from: registerNetworkCallback */
        public void m153407x59bedf70(android.net.NetworkRequest networkRequest, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                this.f74153xfcf94049.registerNetworkCallback(networkRequest, networkCallback);
                return;
            }
            org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152645xccdf4b7 = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152645xccdf4b7();
            try {
                this.f74153xfcf94049.registerNetworkCallback(networkRequest, networkCallback, handler);
                if (m152645xccdf4b7 != null) {
                    m152645xccdf4b7.close();
                }
            } catch (java.lang.Throwable th6) {
                if (m152645xccdf4b7 != null) {
                    try {
                        m152645xccdf4b7.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        /* renamed from: unregisterNetworkCallback */
        public void m153408xc7d74b7(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            this.f74153xfcf94049.unregisterNetworkCallback(networkCallback);
        }

        /* renamed from: vpnAccessible */
        public boolean m153409x7b2b9fca(android.net.Network network) {
            java.net.Socket socket = new java.net.Socket();
            try {
                try {
                    org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152644x95aa28df = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152644x95aa28df();
                    try {
                        network.bindSocket(socket);
                        if (m152644x95aa28df != null) {
                            m152644x95aa28df.close();
                        }
                        try {
                            socket.close();
                            return true;
                        } catch (java.io.IOException unused) {
                            return true;
                        }
                    } catch (java.lang.Throwable th6) {
                        if (m152644x95aa28df != null) {
                            try {
                                m152644x95aa28df.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (java.io.IOException unused2) {
                    return false;
                }
            } catch (java.io.IOException unused3) {
                socket.close();
                return false;
            } catch (java.lang.Throwable th8) {
                try {
                    socket.close();
                } catch (java.io.IOException unused4) {
                }
                throw th8;
            }
        }

        public ConnectivityManagerDelegate() {
            this.f74153xfcf94049 = null;
        }
    }

    /* renamed from: org.chromium.net.NetworkChangeNotifierAutoDetect$WifiManagerDelegate */
    /* loaded from: classes13.dex */
    public static class WifiManagerDelegate {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f74180x7118e671 = false;

        /* renamed from: mContext */
        private final android.content.Context f74181xd6cfe882;

        /* renamed from: mHasWifiPermission */
        private boolean f74182x48638b11;

        /* renamed from: mHasWifiPermissionComputed */
        private boolean f74183x1657cd3e;

        /* renamed from: mLock */
        private final java.lang.Object f74184x6243b38;

        /* renamed from: mWifiManager */
        private android.net.wifi.WifiManager f74185x561cd82b;

        public WifiManagerDelegate(android.content.Context context) {
            this.f74184x6243b38 = new java.lang.Object();
            this.f74181xd6cfe882 = context;
        }

        /* renamed from: getWifiInfoLocked */
        private android.net.wifi.WifiInfo m153428x1ce30b43() {
            try {
                try {
                    return (android.net.wifi.WifiInfo) yj0.a.j(this.f74185x561cd82b, "org/chromium/net/NetworkChangeNotifierAutoDetect$WifiManagerDelegate", "getWifiInfoLocked", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                } catch (java.lang.NullPointerException unused) {
                    return (android.net.wifi.WifiInfo) yj0.a.j(this.f74185x561cd82b, "org/chromium/net/NetworkChangeNotifierAutoDetect$WifiManagerDelegate", "getWifiInfoLocked", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                }
            } catch (java.lang.NullPointerException unused2) {
                return null;
            }
        }

        /* renamed from: hasPermissionLocked */
        private boolean m153429x3db47073() {
            if (this.f74183x1657cd3e) {
                return this.f74182x48638b11;
            }
            boolean z17 = this.f74181xd6cfe882.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.f74181xd6cfe882.getPackageName()) == 0;
            this.f74182x48638b11 = z17;
            this.f74185x561cd82b = z17 ? (android.net.wifi.WifiManager) this.f74181xd6cfe882.getSystemService("wifi") : null;
            this.f74183x1657cd3e = true;
            return this.f74182x48638b11;
        }

        /* renamed from: getWifiSsid */
        public java.lang.String m153430x2bf1d1a6() {
            synchronized (this.f74184x6243b38) {
                if (!m153429x3db47073()) {
                    return org.p3343x72743996.net.C29487x9ab916dc.m153068x2bf15586();
                }
                android.net.wifi.WifiInfo m153428x1ce30b43 = m153428x1ce30b43();
                if (m153428x1ce30b43 == null) {
                    return "";
                }
                return m153428x1ce30b43.getSSID();
            }
        }

        public WifiManagerDelegate() {
            this.f74184x6243b38 = new java.lang.Object();
            this.f74181xd6cfe882 = null;
        }
    }
}
