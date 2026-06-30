package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NetworkChangeDetector */
/* loaded from: classes13.dex */
public interface InterfaceC29826xb786ed44 {

    /* renamed from: org.webrtc.NetworkChangeDetector$ConnectionType */
    /* loaded from: classes13.dex */
    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_5G,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    /* renamed from: org.webrtc.NetworkChangeDetector$IPAddress */
    /* loaded from: classes13.dex */
    public static class IPAddress {

        /* renamed from: address */
        public final byte[] f75602xbb979bf4;

        public IPAddress(byte[] bArr) {
            this.f75602xbb979bf4 = bArr;
        }

        /* renamed from: getAddress */
        private byte[] m155812xf964d7be() {
            return this.f75602xbb979bf4;
        }
    }

    /* renamed from: org.webrtc.NetworkChangeDetector$NetworkInformation */
    /* loaded from: classes13.dex */
    public static class NetworkInformation {

        /* renamed from: handle */
        public final long f75603xb7026e28;

        /* renamed from: ipAddresses */
        public final org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[] f75604x9d816a3b;

        /* renamed from: name */
        public final java.lang.String f75605x337a8b;

        /* renamed from: type */
        public final org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType f75606x368f3a;

        /* renamed from: underlyingTypeForVpn */
        public final org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType f75607xb2d9e82;

        public NetworkInformation(java.lang.String str, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType2, long j17, org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[] iPAddressArr) {
            this.f75605x337a8b = str;
            this.f75606x368f3a = connectionType;
            this.f75607xb2d9e82 = connectionType2;
            this.f75603xb7026e28 = j17;
            this.f75604x9d816a3b = iPAddressArr;
        }

        /* renamed from: getConnectionType */
        private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155813x3a4db02e() {
            return this.f75606x368f3a;
        }

        /* renamed from: getHandle */
        private long m155814x1c19911e() {
            return this.f75603xb7026e28;
        }

        /* renamed from: getIpAddresses */
        private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.IPAddress[] m155815x7757b105() {
            return this.f75604x9d816a3b;
        }

        /* renamed from: getName */
        private java.lang.String m155816xfb82e301() {
            return this.f75605x337a8b;
        }

        /* renamed from: getUnderlyingConnectionTypeForVpn */
        private org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType m155817xb23f74b6() {
            return this.f75607xb2d9e82;
        }
    }

    /* renamed from: org.webrtc.NetworkChangeDetector$Observer */
    /* loaded from: classes13.dex */
    public interface Observer {
        /* renamed from: onConnectionTypeChanged */
        void mo155818x67d37bbd(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType connectionType);

        /* renamed from: onNetworkConnect */
        void mo155819x1f62e9b(org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation networkInformation);

        /* renamed from: onNetworkDisconnect */
        void mo155820x9553f94b(long j17);

        /* renamed from: onNetworkPreference */
        void mo155821x1eb35d8a(java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType> list, int i17);
    }

    /* renamed from: destroy */
    void mo155805x5cd39ffa();

    /* renamed from: getActiveNetworkList */
    java.util.List<org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.NetworkInformation> mo155806x6393e850();

    /* renamed from: getCurrentConnectionType */
    org.p3371xd0ce3e8d.InterfaceC29826xb786ed44.ConnectionType mo155807x6dbab75b();

    /* renamed from: supportNetworkCallback */
    boolean mo155808x4cae90c4();
}
