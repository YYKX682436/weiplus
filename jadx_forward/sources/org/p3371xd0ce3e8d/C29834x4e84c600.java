package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.PeerConnection */
/* loaded from: classes15.dex */
public class C29834x4e84c600 {

    /* renamed from: localStreams */
    private final java.util.List<org.p3371xd0ce3e8d.C29815x4f50d864> f75645x3a7c3b08;

    /* renamed from: nativePeerConnection */
    private final long f75646x5831a1d7;

    /* renamed from: receivers */
    private java.util.List<org.p3371xd0ce3e8d.C29850x141f625d> f75647x29b15464;

    /* renamed from: senders */
    private java.util.List<org.p3371xd0ce3e8d.C29851x4812d623> f75648x76032cde;

    /* renamed from: transceivers */
    private java.util.List<org.p3371xd0ce3e8d.C29852xb0ad6b76> f75649xe11a724f;

    /* renamed from: org.webrtc.PeerConnection$AdapterType */
    /* loaded from: classes11.dex */
    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(256),
        CELLULAR_5G(512);


        /* renamed from: BY_BITMASK */
        private static final java.util.Map<java.lang.Integer, org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType> f75652x37fa2971 = new java.util.HashMap();

        /* renamed from: bitMask */
        public final java.lang.Integer f75662xf9d6a999;

        static {
            for (org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType adapterType : m155993xcee59d22()) {
                f75652x37fa2971.put(adapterType.f75662xf9d6a999, adapterType);
            }
        }

        AdapterType(java.lang.Integer num) {
            this.f75662xf9d6a999 = num;
        }

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType m155991xde3460f1(int i17) {
            return f75652x37fa2971.get(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: org.webrtc.PeerConnection$BundlePolicy */
    /* loaded from: classes6.dex */
    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    /* renamed from: org.webrtc.PeerConnection$CandidateNetworkPolicy */
    /* loaded from: classes6.dex */
    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    /* renamed from: org.webrtc.PeerConnection$ContinualGatheringPolicy */
    /* loaded from: classes6.dex */
    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    /* renamed from: org.webrtc.PeerConnection$IceConnectionState */
    /* loaded from: classes6.dex */
    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.IceConnectionState m156004xde3460f1(int i17) {
            return m156006xcee59d22()[i17];
        }
    }

    /* renamed from: org.webrtc.PeerConnection$IceGatheringState */
    /* loaded from: classes6.dex */
    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.IceGatheringState m156008xde3460f1(int i17) {
            return m156010xcee59d22()[i17];
        }
    }

    /* renamed from: org.webrtc.PeerConnection$IceServer */
    /* loaded from: classes15.dex */
    public static class IceServer {

        /* renamed from: hostname */
        public final java.lang.String f75682xee215c33;

        /* renamed from: password */
        public final java.lang.String f75683x4889ba9b;

        /* renamed from: tlsAlpnProtocols */
        public final java.util.List<java.lang.String> f75684xd2d78e37;

        /* renamed from: tlsCertPolicy */
        public final org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy f75685x6cb0cfd1;

        /* renamed from: tlsEllipticCurves */
        public final java.util.List<java.lang.String> f75686x7d633e61;

        @java.lang.Deprecated
        public final java.lang.String uri;

        /* renamed from: urls */
        public final java.util.List<java.lang.String> f75687x36e8e4;

        /* renamed from: username */
        public final java.lang.String f75688xf02988d6;

        /* renamed from: org.webrtc.PeerConnection$IceServer$Builder */
        /* loaded from: classes15.dex */
        public static class Builder {

            /* renamed from: hostname */
            private java.lang.String f75689xee215c33;

            /* renamed from: password */
            private java.lang.String f75690x4889ba9b;

            /* renamed from: tlsAlpnProtocols */
            private java.util.List<java.lang.String> f75691xd2d78e37;

            /* renamed from: tlsCertPolicy */
            private org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy f75692x6cb0cfd1;

            /* renamed from: tlsEllipticCurves */
            private java.util.List<java.lang.String> f75693x7d633e61;

            /* renamed from: urls */
            private final java.util.List<java.lang.String> f75694x36e8e4;

            /* renamed from: username */
            private java.lang.String f75695xf02988d6;

            /* renamed from: createIceServer */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer m156023x170e3812() {
                return new org.p3371xd0ce3e8d.C29834x4e84c600.IceServer(this.f75694x36e8e4.get(0), this.f75694x36e8e4, this.f75695xf02988d6, this.f75690x4889ba9b, this.f75692x6cb0cfd1, this.f75689xee215c33, this.f75691xd2d78e37, this.f75693x7d633e61);
            }

            /* renamed from: setHostname */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156024x64b3fab5(java.lang.String str) {
                this.f75689xee215c33 = str;
                return this;
            }

            /* renamed from: setPassword */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156025xbf1c591d(java.lang.String str) {
                this.f75690x4889ba9b = str;
                return this;
            }

            /* renamed from: setTlsAlpnProtocols */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156026x1eac8ab9(java.util.List<java.lang.String> list) {
                this.f75691xd2d78e37 = list;
                return this;
            }

            /* renamed from: setTlsCertPolicy */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156027xbce6f28f(org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy tlsCertPolicy) {
                this.f75692x6cb0cfd1 = tlsCertPolicy;
                return this;
            }

            /* renamed from: setTlsEllipticCurves */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156028xac2dd21f(java.util.List<java.lang.String> list) {
                this.f75693x7d633e61 = list;
                return this;
            }

            /* renamed from: setUsername */
            public org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156029x66bc2758(java.lang.String str) {
                this.f75695xf02988d6 = str;
                return this;
            }

            private Builder(java.util.List<java.lang.String> list) {
                this.f75695xf02988d6 = "";
                this.f75690x4889ba9b = "";
                this.f75692x6cb0cfd1 = org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.f75689xee215c33 = "";
                if (list != null && !list.isEmpty()) {
                    this.f75694x36e8e4 = list;
                } else {
                    throw new java.lang.IllegalArgumentException("urls == null || urls.isEmpty(): " + list);
                }
            }
        }

        /* renamed from: builder */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156011xdc3ef9b(java.lang.String str) {
            return new org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder(java.util.Collections.singletonList(str));
        }

        /* renamed from: equals */
        public boolean m156013xb2c87fbf(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof org.p3371xd0ce3e8d.C29834x4e84c600.IceServer)) {
                return false;
            }
            org.p3371xd0ce3e8d.C29834x4e84c600.IceServer iceServer = (org.p3371xd0ce3e8d.C29834x4e84c600.IceServer) obj;
            return this.uri.equals(iceServer.uri) && this.f75687x36e8e4.equals(iceServer.f75687x36e8e4) && this.f75688xf02988d6.equals(iceServer.f75688xf02988d6) && this.f75683x4889ba9b.equals(iceServer.f75683x4889ba9b) && this.f75685x6cb0cfd1.equals(iceServer.f75685x6cb0cfd1) && this.f75682xee215c33.equals(iceServer.f75682xee215c33) && this.f75684xd2d78e37.equals(iceServer.f75684xd2d78e37) && this.f75686x7d633e61.equals(iceServer.f75686x7d633e61);
        }

        /* renamed from: getHostname */
        public java.lang.String m156014x69fb99a9() {
            return this.f75682xee215c33;
        }

        /* renamed from: getPassword */
        public java.lang.String m156015xc463f811() {
            return this.f75683x4889ba9b;
        }

        /* renamed from: getTlsAlpnProtocols */
        public java.util.List<java.lang.String> m156016x7aaff5ad() {
            return this.f75684xd2d78e37;
        }

        /* renamed from: getTlsCertPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy m156017x2a108c1b() {
            return this.f75685x6cb0cfd1;
        }

        /* renamed from: getTlsEllipticCurves */
        public java.util.List<java.lang.String> m156018xd097c5ab() {
            return this.f75686x7d633e61;
        }

        /* renamed from: getUrls */
        public java.util.List<java.lang.String> m156019xfb86515a() {
            return this.f75687x36e8e4;
        }

        /* renamed from: getUsername */
        public java.lang.String m156020x6c03c64c() {
            return this.f75688xf02988d6;
        }

        /* renamed from: hashCode */
        public int m156021x8cdac1b() {
            return java.util.Arrays.hashCode(new java.lang.Object[]{this.uri, this.f75687x36e8e4, this.f75688xf02988d6, this.f75683x4889ba9b, this.f75685x6cb0cfd1, this.f75682xee215c33, this.f75684xd2d78e37, this.f75686x7d633e61});
        }

        /* renamed from: toString */
        public java.lang.String m156022x9616526c() {
            return this.f75687x36e8e4 + " [" + this.f75688xf02988d6 + ":" + this.f75683x4889ba9b + "] [" + this.f75685x6cb0cfd1 + "] [" + this.f75682xee215c33 + "] [" + this.f75684xd2d78e37 + "] [" + this.f75686x7d633e61 + "]";
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str) {
            this(str, "", "");
        }

        /* renamed from: builder */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder m156012xdc3ef9b(java.util.List<java.lang.String> list) {
            return new org.p3371xd0ce3e8d.C29834x4e84c600.IceServer.Builder(list);
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this(str, str2, str3, org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str, java.lang.String str2, java.lang.String str3, org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy tlsCertPolicy) {
            this(str, str2, str3, tlsCertPolicy, "");
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str, java.lang.String str2, java.lang.String str3, org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy tlsCertPolicy, java.lang.String str4) {
            this(str, java.util.Collections.singletonList(str), str2, str3, tlsCertPolicy, str4, null, null);
        }

        private IceServer(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.lang.String str3, org.p3371xd0ce3e8d.C29834x4e84c600.TlsCertPolicy tlsCertPolicy, java.lang.String str4, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3) {
            if (str != null && list != null && !list.isEmpty()) {
                java.util.Iterator<java.lang.String> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        throw new java.lang.IllegalArgumentException("urls element is null: " + list);
                    }
                }
                if (str2 == null) {
                    throw new java.lang.IllegalArgumentException("username == null");
                }
                if (str3 == null) {
                    throw new java.lang.IllegalArgumentException("password == null");
                }
                if (str4 != null) {
                    this.uri = str;
                    this.f75687x36e8e4 = list;
                    this.f75688xf02988d6 = str2;
                    this.f75683x4889ba9b = str3;
                    this.f75685x6cb0cfd1 = tlsCertPolicy;
                    this.f75682xee215c33 = str4;
                    this.f75684xd2d78e37 = list2;
                    this.f75686x7d633e61 = list3;
                    return;
                }
                throw new java.lang.IllegalArgumentException("hostname == null");
            }
            throw new java.lang.IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
        }
    }

    /* renamed from: org.webrtc.PeerConnection$IceTransportsType */
    /* loaded from: classes6.dex */
    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    /* renamed from: org.webrtc.PeerConnection$KeyType */
    /* loaded from: classes6.dex */
    public enum KeyType {
        RSA,
        ECDSA
    }

    /* renamed from: org.webrtc.PeerConnection$Observer */
    /* loaded from: classes6.dex */
    public interface Observer {
        /* renamed from: onAddStream */
        void m156036xfe373462(org.p3371xd0ce3e8d.C29815x4f50d864 c29815x4f50d864);

        /* renamed from: onAddTrack */
        default void m156037x5ad4e829(org.p3371xd0ce3e8d.C29850x141f625d c29850x141f625d, org.p3371xd0ce3e8d.C29815x4f50d864[] c29815x4f50d864Arr) {
        }

        /* renamed from: onConnectionChange */
        default void m156038xc9d4142d(org.p3371xd0ce3e8d.C29834x4e84c600.PeerConnectionState peerConnectionState) {
        }

        /* renamed from: onDataChannel */
        void m156039xf0509a9a(org.p3371xd0ce3e8d.C29754x372bb9d9 c29754x372bb9d9);

        /* renamed from: onIceCandidate */
        void m156040x284dd6b7(org.p3371xd0ce3e8d.C29792xbcd69f58 c29792xbcd69f58);

        /* renamed from: onIceCandidatesRemoved */
        void m156041xb770824(org.p3371xd0ce3e8d.C29792xbcd69f58[] c29792xbcd69f58Arr);

        /* renamed from: onIceConnectionChange */
        void m156042x60771c7a(org.p3371xd0ce3e8d.C29834x4e84c600.IceConnectionState iceConnectionState);

        /* renamed from: onIceConnectionReceivingChange */
        void m156043x752bf526(boolean z17);

        /* renamed from: onIceGatheringChange */
        void m156044x7b465ccb(org.p3371xd0ce3e8d.C29834x4e84c600.IceGatheringState iceGatheringState);

        /* renamed from: onRemoveStream */
        void m156045x42644ca3(org.p3371xd0ce3e8d.C29815x4f50d864 c29815x4f50d864);

        /* renamed from: onRemoveTrack */
        default void m156046xa7343c8(org.p3371xd0ce3e8d.C29850x141f625d c29850x141f625d) {
        }

        /* renamed from: onRenegotiationNeeded */
        void m156047xa19f18c4();

        /* renamed from: onSelectedCandidatePairChanged */
        default void m156048x4b2a99b1(org.p3371xd0ce3e8d.C29750x12f745ad c29750x12f745ad) {
        }

        /* renamed from: onSignalingChange */
        void m156049x9ed084ab(org.p3371xd0ce3e8d.C29834x4e84c600.SignalingState signalingState);

        /* renamed from: onStandardizedIceConnectionChange */
        default void m156050x11727bed(org.p3371xd0ce3e8d.C29834x4e84c600.IceConnectionState iceConnectionState) {
        }

        /* renamed from: onTrack */
        default void m156051xb05dc6ac(org.p3371xd0ce3e8d.C29852xb0ad6b76 c29852xb0ad6b76) {
        }
    }

    /* renamed from: org.webrtc.PeerConnection$PeerConnectionState */
    /* loaded from: classes6.dex */
    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.PeerConnectionState m156053xde3460f1(int i17) {
            return m156055xcee59d22()[i17];
        }
    }

    /* renamed from: org.webrtc.PeerConnection$PortPrunePolicy */
    /* loaded from: classes6.dex */
    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    /* renamed from: org.webrtc.PeerConnection$RTCConfiguration */
    /* loaded from: classes6.dex */
    public static class RTCConfiguration {

        /* renamed from: certificate */
        public org.p3371xd0ce3e8d.C29848xe9b584a2 f75718x745f4197;

        /* renamed from: iceServers */
        public java.util.List<org.p3371xd0ce3e8d.C29834x4e84c600.IceServer> f75734x5de95885;

        /* renamed from: turnCustomizer */
        public org.p3371xd0ce3e8d.C29884x9e9d6d0c f75752xda56a0ec;

        /* renamed from: iceTransportsType */
        public org.p3371xd0ce3e8d.C29834x4e84c600.IceTransportsType f75735xfcdf402f = org.p3371xd0ce3e8d.C29834x4e84c600.IceTransportsType.ALL;

        /* renamed from: bundlePolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.BundlePolicy f75716x2177d854 = org.p3371xd0ce3e8d.C29834x4e84c600.BundlePolicy.BALANCED;

        /* renamed from: rtcpMuxPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.RtcpMuxPolicy f75744x94a7afb3 = org.p3371xd0ce3e8d.C29834x4e84c600.RtcpMuxPolicy.REQUIRE;

        /* renamed from: tcpCandidatePolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.TcpCandidatePolicy f75751xb6dfd274 = org.p3371xd0ce3e8d.C29834x4e84c600.TcpCandidatePolicy.ENABLED;

        /* renamed from: candidateNetworkPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.CandidateNetworkPolicy f75717x9ecf83d = org.p3371xd0ce3e8d.C29834x4e84c600.CandidateNetworkPolicy.ALL;

        /* renamed from: audioJitterBufferMaxPackets */
        public int f75715x8b421fc9 = 50;

        /* renamed from: audioJitterBufferFastAccelerate */
        public boolean f75714xa05d2c3b = false;

        /* renamed from: iceConnectionReceivingTimeout */
        public int f75733x84d2984a = -1;

        /* renamed from: iceBackupCandidatePairPingInterval */
        public int f75728x5d09c447 = -1;

        /* renamed from: keyType */
        public org.p3371xd0ce3e8d.C29834x4e84c600.KeyType f75738xcf655a39 = org.p3371xd0ce3e8d.C29834x4e84c600.KeyType.ECDSA;

        /* renamed from: continualGatheringPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.ContinualGatheringPolicy f75720x99af3cb0 = org.p3371xd0ce3e8d.C29834x4e84c600.ContinualGatheringPolicy.GATHER_ONCE;

        /* renamed from: iceCandidatePoolSize */
        public int f75729x1d3d7595 = 0;

        /* renamed from: pruneTurnPorts */
        @java.lang.Deprecated
        public boolean f75743x56050d0b = false;

        /* renamed from: turnPortPrunePolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.PortPrunePolicy f75754xbaa27bfe = org.p3371xd0ce3e8d.C29834x4e84c600.PortPrunePolicy.NO_PRUNE;

        /* renamed from: presumeWritableWhenFullyRelayed */
        public boolean f75742x23ca019d = false;

        /* renamed from: surfaceIceCandidatesOnIceTransportTypeChanged */
        public boolean f75749x71f5948f = false;

        /* renamed from: iceCheckIntervalStrongConnectivityMs */
        public java.lang.Integer f75730x970b1876 = null;

        /* renamed from: iceCheckIntervalWeakConnectivityMs */
        public java.lang.Integer f75731x6458cc17 = null;

        /* renamed from: iceCheckMinInterval */
        public java.lang.Integer f75732x2338afba = null;

        /* renamed from: iceUnwritableTimeMs */
        public java.lang.Integer f75737x21235897 = null;

        /* renamed from: iceUnwritableMinChecks */
        public java.lang.Integer f75736x3ebc5799 = null;

        /* renamed from: stunCandidateKeepaliveIntervalMs */
        public java.lang.Integer f75748x29330b2a = null;

        /* renamed from: stableWritableConnectionPingIntervalMs */
        public java.lang.Integer f75747xbd9df1f6 = null;

        /* renamed from: disableIPv6OnWifi */
        public boolean f75722xdad2d743 = false;

        /* renamed from: maxIPv6Networks */
        public int f75739x906e9270 = 5;

        /* renamed from: disableIpv6 */
        public boolean f75723x50a550ef = false;

        /* renamed from: enableDscp */
        public boolean f75725x70d1515f = false;

        /* renamed from: enableCpuOveruseDetection */
        public boolean f75724x9a64b6d7 = true;

        /* renamed from: suspendBelowMinBitrate */
        public boolean f75750x4877c3f0 = false;

        /* renamed from: screencastMinBitrate */
        public java.lang.Integer f75745x7c4934c6 = null;

        /* renamed from: combinedAudioVideoBwe */
        public java.lang.Boolean f75719xd1557b26 = null;

        /* renamed from: enableDtlsSrtp */
        public java.lang.Boolean f75726x5f8f1e75 = null;

        /* renamed from: networkPreference */
        public org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType f75740x905f91a9 = org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType.UNKNOWN;

        /* renamed from: sdpSemantics */
        public org.p3371xd0ce3e8d.C29834x4e84c600.SdpSemantics f75746xbe1d05ee = org.p3371xd0ce3e8d.C29834x4e84c600.SdpSemantics.PLAN_B;

        /* renamed from: activeResetSrtpParams */
        public boolean f75712xe0e4d54a = false;

        /* renamed from: cryptoOptions */
        public org.p3371xd0ce3e8d.C29753x6c04327d f75721x3c65029d = null;

        /* renamed from: turnLoggingId */
        public java.lang.String f75753xea4954dd = null;

        /* renamed from: allowCodecSwitching */
        public java.lang.Boolean f75713xfc36861 = null;

        /* renamed from: enableImplicitRollback */
        public boolean f75727xd3ba3f8c = false;

        /* renamed from: offerExtmapAllowMixed */
        public boolean f75741x318bf6a9 = true;

        public RTCConfiguration(java.util.List<org.p3371xd0ce3e8d.C29834x4e84c600.IceServer> list) {
            this.f75734x5de95885 = list;
        }

        /* renamed from: getActiveResetSrtpParams */
        public boolean m156059xec90a794() {
            return this.f75712xe0e4d54a;
        }

        /* renamed from: getAllowCodecSwitching */
        public java.lang.Boolean m156060x67f3452b() {
            return this.f75713xfc36861;
        }

        /* renamed from: getAudioJitterBufferFastAccelerate */
        public boolean m156061xf7062a05() {
            return this.f75714xa05d2c3b;
        }

        /* renamed from: getAudioJitterBufferMaxPackets */
        public int m156062x11d59293() {
            return this.f75715x8b421fc9;
        }

        /* renamed from: getBundlePolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.BundlePolicy m156063x826a6aca() {
            return this.f75716x2177d854;
        }

        /* renamed from: getCandidateNetworkPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.CandidateNetworkPolicy m156064x73bb6f33() {
            return this.f75717x9ecf83d;
        }

        /* renamed from: getCertificate */
        public org.p3371xd0ce3e8d.C29848xe9b584a2 m156065x4e358861() {
            return this.f75718x745f4197;
        }

        /* renamed from: getCombinedAudioVideoBwe */
        public java.lang.Boolean m156066xdd014d70() {
            return this.f75719xd1557b26;
        }

        /* renamed from: getContinualGatheringPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.ContinualGatheringPolicy m156067xc9bbce26() {
            return this.f75720x99af3cb0;
        }

        /* renamed from: getCryptoOptions */
        public org.p3371xd0ce3e8d.C29753x6c04327d m156068xf9c4bee7() {
            return this.f75721x3c65029d;
        }

        /* renamed from: getDisableIPv6OnWifi */
        public boolean m156069x2e075e8d() {
            return this.f75722xdad2d743;
        }

        /* renamed from: getDisableIpv6 */
        public boolean m156070x2a7b97b9() {
            return this.f75723x50a550ef;
        }

        /* renamed from: getEnableCpuOveruseDetection */
        public boolean m156071x6bea5421() {
            return this.f75724x9a64b6d7;
        }

        /* renamed from: getEnableDscp */
        public boolean m156072x5f120955() {
            return this.f75725x70d1515f;
        }

        /* renamed from: getEnableDtlsSrtp */
        public java.lang.Boolean m156073x4e26eb6b() {
            return this.f75726x5f8f1e75;
        }

        /* renamed from: getEnableImplicitRollback */
        public boolean m156074x3d88b682() {
            return this.f75727xd3ba3f8c;
        }

        /* renamed from: getIceBackupCandidatePairPingInterval */
        public int m156075x18bf7a3d() {
            return this.f75728x5d09c447;
        }

        /* renamed from: getIceCandidatePoolSize */
        public int m156076xcb09320b() {
            return this.f75729x1d3d7595;
        }

        /* renamed from: getIceCheckIntervalStrongConnectivity */
        public java.lang.Integer m156077x8e94b0a6() {
            return this.f75730x970b1876;
        }

        /* renamed from: getIceCheckIntervalWeakConnectivity */
        public java.lang.Integer m156078xec0dde07() {
            return this.f75731x6458cc17;
        }

        /* renamed from: getIceCheckMinInterval */
        public java.lang.Integer m156079x7b688c84() {
            return this.f75732x2338afba;
        }

        /* renamed from: getIceConnectionReceivingTimeout */
        public int m156080xb4548094() {
            return this.f75733x84d2984a;
        }

        /* renamed from: getIceServers */
        public java.util.List<org.p3371xd0ce3e8d.C29834x4e84c600.IceServer> m156081x4c2a107b() {
            return this.f75734x5de95885;
        }

        /* renamed from: getIceTransportsType */
        public org.p3371xd0ce3e8d.C29834x4e84c600.IceTransportsType m156082x5013c779() {
            return this.f75735xfcdf402f;
        }

        /* renamed from: getIceUnwritableMinChecks */
        public java.lang.Integer m156083xa88ace8f() {
            return this.f75736x3ebc5799;
        }

        /* renamed from: getIceUnwritableTimeout */
        public java.lang.Integer m156084xb113f713() {
            return this.f75737x21235897;
        }

        /* renamed from: getKeyType */
        public org.p3371xd0ce3e8d.C29834x4e84c600.KeyType m156085xd329603() {
            return this.f75738xcf655a39;
        }

        /* renamed from: getMaxIPv6Networks */
        public int m156086x74d0643a() {
            return this.f75739x906e9270;
        }

        /* renamed from: getNetworkPreference */
        public org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType m156087xe39418f3() {
            return this.f75740x905f91a9;
        }

        /* renamed from: getOfferExtmapAllowMixed */
        public boolean m156088x3d37c8f3() {
            return this.f75741x318bf6a9;
        }

        /* renamed from: getPresumeWritableWhenFullyRelayed */
        public boolean m156089x7a72ff67() {
            return this.f75742x23ca019d;
        }

        /* renamed from: getPruneTurnPorts */
        public boolean m156090x449cda01() {
            return this.f75743x56050d0b;
        }

        /* renamed from: getRtcpMuxPolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.RtcpMuxPolicy m156091x52076bfd() {
            return this.f75744x94a7afb3;
        }

        /* renamed from: getScreencastMinBitrate */
        public java.lang.Integer m156092x2a14f13c() {
            return this.f75745x7c4934c6;
        }

        /* renamed from: getSdpSemantics */
        public org.p3371xd0ce3e8d.C29834x4e84c600.SdpSemantics m156093x1f0f9864() {
            return this.f75746xbe1d05ee;
        }

        /* renamed from: getStableWritableConnectionPingIntervalMs */
        public java.lang.Integer m156094x9afbbcec() {
            return this.f75747xbd9df1f6;
        }

        /* renamed from: getStunCandidateKeepaliveInterval */
        public java.lang.Integer m156095xbcc72b5a() {
            return this.f75748x29330b2a;
        }

        /* renamed from: getSurfaceIceCandidatesOnIceTransportTypeChanged */
        public boolean m156096xc1c1a8d9() {
            return this.f75749x71f5948f;
        }

        /* renamed from: getSuspendBelowMinBitrate */
        public boolean m156097xb2463ae6() {
            return this.f75750x4877c3f0;
        }

        /* renamed from: getTcpCandidatePolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.TcpCandidatePolicy m156098xca3c346a() {
            return this.f75751xb6dfd274;
        }

        /* renamed from: getTurnCustomizer */
        public org.p3371xd0ce3e8d.C29884x9e9d6d0c m156099xc8ee6de2() {
            return this.f75752xda56a0ec;
        }

        /* renamed from: getTurnLoggingId */
        public java.lang.String m156100xa7a91127() {
            return this.f75753xea4954dd;
        }

        /* renamed from: getTurnPortPrunePolicy */
        public org.p3371xd0ce3e8d.C29834x4e84c600.PortPrunePolicy m156101x12d258c8() {
            return this.f75754xbaa27bfe;
        }
    }

    /* renamed from: org.webrtc.PeerConnection$RtcpMuxPolicy */
    /* loaded from: classes6.dex */
    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    /* renamed from: org.webrtc.PeerConnection$SdpSemantics */
    /* loaded from: classes6.dex */
    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    /* renamed from: org.webrtc.PeerConnection$SignalingState */
    /* loaded from: classes6.dex */
    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        /* renamed from: fromNativeIndex */
        public static org.p3371xd0ce3e8d.C29834x4e84c600.SignalingState m156109xde3460f1(int i17) {
            return m156111xcee59d22()[i17];
        }
    }

    /* renamed from: org.webrtc.PeerConnection$TcpCandidatePolicy */
    /* loaded from: classes6.dex */
    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    /* renamed from: org.webrtc.PeerConnection$TlsCertPolicy */
    /* loaded from: classes6.dex */
    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public C29834x4e84c600(org.p3371xd0ce3e8d.InterfaceC29824x12059f13 interfaceC29824x12059f13) {
        this(interfaceC29824x12059f13.m155803x6ede20f3());
    }

    /* renamed from: createNativePeerConnectionObserver */
    public static long m155908x145534e9(org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
        return m155920x3cf7e4a9(observer);
    }

    /* renamed from: nativeAddIceCandidate */
    private native boolean m155909x1f4c8562(java.lang.String str, int i17, java.lang.String str2);

    /* renamed from: nativeAddIceCandidateWithObserver */
    private native void m155910xa2b8183e(java.lang.String str, int i17, java.lang.String str2, org.p3371xd0ce3e8d.InterfaceC29721xb228f40 interfaceC29721xb228f40);

    /* renamed from: nativeAddLocalStream */
    private native boolean m155911x47717761(long j17);

    /* renamed from: nativeAddTrack */
    private native org.p3371xd0ce3e8d.C29851x4812d623 m155912xcdad7261(long j17, java.util.List<java.lang.String> list);

    /* renamed from: nativeAddTransceiverOfType */
    private native org.p3371xd0ce3e8d.C29852xb0ad6b76 m155913xebe1218b(org.p3371xd0ce3e8d.C29816x8efc747.MediaType mediaType, org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit rtpTransceiverInit);

    /* renamed from: nativeAddTransceiverWithTrack */
    private native org.p3371xd0ce3e8d.C29852xb0ad6b76 m155914xe3c7420b(long j17, org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit rtpTransceiverInit);

    /* renamed from: nativeClose */
    private native void m155915x66d21421();

    /* renamed from: nativeConnectionState */
    private native org.p3371xd0ce3e8d.C29834x4e84c600.PeerConnectionState m155916x1b77473c();

    /* renamed from: nativeCreateAnswer */
    private native void m155917x945a5991(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2);

    /* renamed from: nativeCreateDataChannel */
    private native org.p3371xd0ce3e8d.C29754x372bb9d9 m155918xd6682406(java.lang.String str, org.p3371xd0ce3e8d.C29754x372bb9d9.Init init);

    /* renamed from: nativeCreateOffer */
    private native void m155919xbb37fa29(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2);

    /* renamed from: nativeCreatePeerConnectionObserver */
    private static native long m155920x3cf7e4a9(org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer);

    /* renamed from: nativeCreateSender */
    private native org.p3371xd0ce3e8d.C29851x4812d623 m155921xb2903408(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeFreeOwnedPeerConnection */
    private static native void m155922x88bf73c2(long j17);

    /* renamed from: nativeGetCertificate */
    private native org.p3371xd0ce3e8d.C29848xe9b584a2 m155923x1c293058();

    /* renamed from: nativeGetLocalDescription */
    private native org.p3371xd0ce3e8d.C29856x9a240ba6 m155924x4c3a2d70();

    /* renamed from: nativeGetNativePeerConnection */
    private native long m155925xd511bc36();

    /* renamed from: nativeGetReceivers */
    private native java.util.List<org.p3371xd0ce3e8d.C29850x141f625d> m155926x80f9ff65();

    /* renamed from: nativeGetRemoteDescription */
    private native org.p3371xd0ce3e8d.C29856x9a240ba6 m155927xe8e85d7();

    /* renamed from: nativeGetSenders */
    private native java.util.List<org.p3371xd0ce3e8d.C29851x4812d623> m155928x99cca41f();

    /* renamed from: nativeGetTransceivers */
    private native java.util.List<org.p3371xd0ce3e8d.C29852xb0ad6b76> m155929x328e5bae();

    /* renamed from: nativeIceConnectionState */
    private native org.p3371xd0ce3e8d.C29834x4e84c600.IceConnectionState m155930x9afc9ebf();

    /* renamed from: nativeIceGatheringState */
    private native org.p3371xd0ce3e8d.C29834x4e84c600.IceGatheringState m155931xa03e0de();

    /* renamed from: nativeNewGetStats */
    private native void m155932x999c0c12(org.p3371xd0ce3e8d.InterfaceC29843x9c7434b4 interfaceC29843x9c7434b4);

    /* renamed from: nativeOldGetStats */
    private native boolean m155933xdb6e9999(org.p3371xd0ce3e8d.InterfaceC29860xa0489c75 interfaceC29860xa0489c75, long j17);

    /* renamed from: nativeRemoveIceCandidates */
    private native boolean m155934x405b0480(org.p3371xd0ce3e8d.C29792xbcd69f58[] c29792xbcd69f58Arr);

    /* renamed from: nativeRemoveLocalStream */
    private native void m155935xa2abd450(long j17);

    /* renamed from: nativeRemoveTrack */
    private native boolean m155936xc76fee90(long j17);

    /* renamed from: nativeRestartIce */
    private native void m155937x7c2ccd73();

    /* renamed from: nativeSetAudioPlayout */
    private native void m155938xbc3eb4f(boolean z17);

    /* renamed from: nativeSetAudioRecording */
    private native void m155939xd4b56866(boolean z17);

    /* renamed from: nativeSetBitrate */
    private native boolean m155940x91224022(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3);

    /* renamed from: nativeSetConfiguration */
    private native boolean m155941xe3131deb(org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration);

    /* renamed from: nativeSetLocalDescription */
    private native void m155942xf036c27c(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29856x9a240ba6 c29856x9a240ba6);

    /* renamed from: nativeSetLocalDescriptionAutomatically */
    private native void m155943xb7463687(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15);

    /* renamed from: nativeSetRemoteDescription */
    private native void m155944xea24924b(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29856x9a240ba6 c29856x9a240ba6);

    /* renamed from: nativeSignalingState */
    private native org.p3371xd0ce3e8d.C29834x4e84c600.SignalingState m155945x5297c86e();

    /* renamed from: nativeStartRtcEventLog */
    private native boolean m155946x40eae040(int i17, int i18);

    /* renamed from: nativeStopRtcEventLog */
    private native void m155947x3c86e952();

    /* renamed from: addIceCandidate */
    public boolean m155949x2ecb2e79(org.p3371xd0ce3e8d.C29792xbcd69f58 c29792xbcd69f58) {
        return m155909x1f4c8562(c29792xbcd69f58.f75493xc9f29589, c29792xbcd69f58.f75492xcf9140f0, c29792xbcd69f58.sdp);
    }

    /* renamed from: addStream */
    public boolean m155950xcf781(org.p3371xd0ce3e8d.C29815x4f50d864 c29815x4f50d864) {
        if (!m155911x47717761(c29815x4f50d864.m155752x18a6eb37())) {
            return false;
        }
        this.f75645x3a7c3b08.add(c29815x4f50d864);
        return true;
    }

    /* renamed from: addTrack */
    public org.p3371xd0ce3e8d.C29851x4812d623 m155951xb5bac52a(org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747) {
        return m155952xb5bac52a(c29816x8efc747, java.util.Collections.emptyList());
    }

    /* renamed from: addTransceiver */
    public org.p3371xd0ce3e8d.C29852xb0ad6b76 m155955xa8281343(org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747) {
        return m155956xa8281343(c29816x8efc747, new org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit());
    }

    /* renamed from: close */
    public void m155957x5a5ddf8() {
        m155915x66d21421();
    }

    /* renamed from: connectionState */
    public org.p3371xd0ce3e8d.C29834x4e84c600.PeerConnectionState m155958x2af5f053() {
        return m155916x1b77473c();
    }

    /* renamed from: createAnswer */
    public void m155959x3c7f1fda(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2) {
        m155917x945a5991(interfaceC29855xa9686c15, c29812x48c60bd2);
    }

    /* renamed from: createDataChannel */
    public org.p3371xd0ce3e8d.C29754x372bb9d9 m155960xe0e35d(java.lang.String str, org.p3371xd0ce3e8d.C29754x372bb9d9.Init init) {
        return m155918xd6682406(str, init);
    }

    /* renamed from: createOffer */
    public void m155961xe1acc6c0(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2) {
        m155919xbb37fa29(interfaceC29855xa9686c15, c29812x48c60bd2);
    }

    /* renamed from: createSender */
    public org.p3371xd0ce3e8d.C29851x4812d623 m155962x5ab4fa51(java.lang.String str, java.lang.String str2) {
        org.p3371xd0ce3e8d.C29851x4812d623 m155921xb2903408 = m155921xb2903408(str, str2);
        if (m155921xb2903408 != null) {
            this.f75648x76032cde.add(m155921xb2903408);
        }
        return m155921xb2903408;
    }

    /* renamed from: dispose */
    public void m155963x63a5261f() {
        m155957x5a5ddf8();
        for (org.p3371xd0ce3e8d.C29815x4f50d864 c29815x4f50d864 : this.f75645x3a7c3b08) {
            m155935xa2abd450(c29815x4f50d864.m155752x18a6eb37());
            c29815x4f50d864.m155750x63a5261f();
        }
        this.f75645x3a7c3b08.clear();
        java.util.Iterator<org.p3371xd0ce3e8d.C29851x4812d623> it = this.f75648x76032cde.iterator();
        while (it.hasNext()) {
            it.next().m156304x63a5261f();
        }
        this.f75648x76032cde.clear();
        java.util.Iterator<org.p3371xd0ce3e8d.C29850x141f625d> it6 = this.f75647x29b15464.iterator();
        while (it6.hasNext()) {
            it6.next().m156289x63a5261f();
        }
        java.util.Iterator<org.p3371xd0ce3e8d.C29852xb0ad6b76> it7 = this.f75649xe11a724f.iterator();
        while (it7.hasNext()) {
            it7.next().m156325x63a5261f();
        }
        this.f75649xe11a724f.clear();
        this.f75647x29b15464.clear();
        m155922x88bf73c2(this.f75646x5831a1d7);
    }

    /* renamed from: getCertificate */
    public org.p3371xd0ce3e8d.C29848xe9b584a2 m155964x4e358861() {
        return m155923x1c293058();
    }

    /* renamed from: getLocalDescription */
    public org.p3371xd0ce3e8d.C29856x9a240ba6 m155965xbb807307() {
        return m155924x4c3a2d70();
    }

    /* renamed from: getNativeOwnedPeerConnection */
    public long m155966xfeb40b98() {
        return this.f75646x5831a1d7;
    }

    /* renamed from: getNativePeerConnection */
    public long m155967x5fd5e4d() {
        return m155925xd511bc36();
    }

    /* renamed from: getReceivers */
    public java.util.List<org.p3371xd0ce3e8d.C29850x141f625d> m155968x291ec5ae() {
        java.util.Iterator<org.p3371xd0ce3e8d.C29850x141f625d> it = this.f75647x29b15464.iterator();
        while (it.hasNext()) {
            it.next().m156289x63a5261f();
        }
        java.util.List<org.p3371xd0ce3e8d.C29850x141f625d> m155926x80f9ff65 = m155926x80f9ff65();
        this.f75647x29b15464 = m155926x80f9ff65;
        return java.util.Collections.unmodifiableList(m155926x80f9ff65);
    }

    /* renamed from: getRemoteDescription */
    public org.p3371xd0ce3e8d.C29856x9a240ba6 m155969x8810f320() {
        return m155927xe8e85d7();
    }

    /* renamed from: getSenders */
    public java.util.List<org.p3371xd0ce3e8d.C29851x4812d623> m155970xb3d068a8() {
        java.util.Iterator<org.p3371xd0ce3e8d.C29851x4812d623> it = this.f75648x76032cde.iterator();
        while (it.hasNext()) {
            it.next().m156304x63a5261f();
        }
        java.util.List<org.p3371xd0ce3e8d.C29851x4812d623> m155928x99cca41f = m155928x99cca41f();
        this.f75648x76032cde = m155928x99cca41f;
        return java.util.Collections.unmodifiableList(m155928x99cca41f);
    }

    @java.lang.Deprecated
    /* renamed from: getStats */
    public boolean m155972x75286ae9(org.p3371xd0ce3e8d.InterfaceC29860xa0489c75 interfaceC29860xa0489c75, org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747) {
        return m155933xdb6e9999(interfaceC29860xa0489c75, c29816x8efc747 == null ? 0L : c29816x8efc747.m155767xc4a38054());
    }

    /* renamed from: getTransceivers */
    public java.util.List<org.p3371xd0ce3e8d.C29852xb0ad6b76> m155973x420d04c5() {
        java.util.Iterator<org.p3371xd0ce3e8d.C29852xb0ad6b76> it = this.f75649xe11a724f.iterator();
        while (it.hasNext()) {
            it.next().m156325x63a5261f();
        }
        java.util.List<org.p3371xd0ce3e8d.C29852xb0ad6b76> m155929x328e5bae = m155929x328e5bae();
        this.f75649xe11a724f = m155929x328e5bae;
        return java.util.Collections.unmodifiableList(m155929x328e5bae);
    }

    /* renamed from: iceConnectionState */
    public org.p3371xd0ce3e8d.C29834x4e84c600.IceConnectionState m155974xbf9bca48() {
        return m155930x9afc9ebf();
    }

    /* renamed from: iceGatheringState */
    public org.p3371xd0ce3e8d.C29834x4e84c600.IceGatheringState m155975x347ca035() {
        return m155931xa03e0de();
    }

    /* renamed from: removeIceCandidates */
    public boolean m155976xafa14a17(org.p3371xd0ce3e8d.C29792xbcd69f58[] c29792xbcd69f58Arr) {
        return m155934x405b0480(c29792xbcd69f58Arr);
    }

    /* renamed from: removeStream */
    public void m155977xcd21c124(org.p3371xd0ce3e8d.C29815x4f50d864 c29815x4f50d864) {
        m155935xa2abd450(c29815x4f50d864.m155752x18a6eb37());
        this.f75645x3a7c3b08.remove(c29815x4f50d864);
    }

    /* renamed from: removeTrack */
    public boolean m155978xede4bb27(org.p3371xd0ce3e8d.C29851x4812d623 c29851x4812d623) {
        if (c29851x4812d623 != null) {
            return m155936xc76fee90(c29851x4812d623.m156306x9b6581b6());
        }
        throw new java.lang.NullPointerException("No RtpSender specified for removeTrack.");
    }

    /* renamed from: restartIce */
    public void m155979x963091fc() {
        m155937x7c2ccd73();
    }

    /* renamed from: setAudioPlayout */
    public void m155980x1b429466(boolean z17) {
        m155938xbc3eb4f(z17);
    }

    /* renamed from: setAudioRecording */
    public void m155981xff2e27bd(boolean z17) {
        m155939xd4b56866(z17);
    }

    /* renamed from: setBitrate */
    public boolean m155982xab2604ab(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        return m155940x91224022(num, num2, num3);
    }

    /* renamed from: setConfiguration */
    public boolean m155983xc36997b4(org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration) {
        return m155941xe3131deb(rTCConfiguration);
    }

    /* renamed from: setLocalDescription */
    public void m155984x5f7d0813(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15) {
        m155943xb7463687(interfaceC29855xa9686c15);
    }

    /* renamed from: setRemoteDescription */
    public void m155986x63a6ff94(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29856x9a240ba6 c29856x9a240ba6) {
        m155944xea24924b(interfaceC29855xa9686c15, c29856x9a240ba6);
    }

    /* renamed from: signalingState */
    public org.p3371xd0ce3e8d.C29834x4e84c600.SignalingState m155987x84a42077() {
        return m155945x5297c86e();
    }

    /* renamed from: startRtcEventLog */
    public boolean m155988x21415a09(int i17, int i18) {
        return m155946x40eae040(i17, i18);
    }

    /* renamed from: stopRtcEventLog */
    public void m155989x4c059269() {
        m155947x3c86e952();
    }

    public C29834x4e84c600(long j17) {
        this.f75645x3a7c3b08 = new java.util.ArrayList();
        this.f75648x76032cde = new java.util.ArrayList();
        this.f75647x29b15464 = new java.util.ArrayList();
        this.f75649xe11a724f = new java.util.ArrayList();
        this.f75646x5831a1d7 = j17;
    }

    /* renamed from: addIceCandidate */
    public void m155948x2ecb2e79(org.p3371xd0ce3e8d.C29792xbcd69f58 c29792xbcd69f58, org.p3371xd0ce3e8d.InterfaceC29721xb228f40 interfaceC29721xb228f40) {
        m155910xa2b8183e(c29792xbcd69f58.f75493xc9f29589, c29792xbcd69f58.f75492xcf9140f0, c29792xbcd69f58.sdp, interfaceC29721xb228f40);
    }

    /* renamed from: addTrack */
    public org.p3371xd0ce3e8d.C29851x4812d623 m155952xb5bac52a(org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747, java.util.List<java.lang.String> list) {
        if (c29816x8efc747 != null && list != null) {
            org.p3371xd0ce3e8d.C29851x4812d623 m155912xcdad7261 = m155912xcdad7261(c29816x8efc747.m155767xc4a38054(), list);
            if (m155912xcdad7261 != null) {
                this.f75648x76032cde.add(m155912xcdad7261);
                return m155912xcdad7261;
            }
            throw new java.lang.IllegalStateException("C++ addTrack failed.");
        }
        throw new java.lang.NullPointerException("No MediaStreamTrack specified in addTrack.");
    }

    /* renamed from: addTransceiver */
    public org.p3371xd0ce3e8d.C29852xb0ad6b76 m155956xa8281343(org.p3371xd0ce3e8d.C29816x8efc747 c29816x8efc747, org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit rtpTransceiverInit) {
        if (c29816x8efc747 != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit();
            }
            org.p3371xd0ce3e8d.C29852xb0ad6b76 m155914xe3c7420b = m155914xe3c7420b(c29816x8efc747.m155767xc4a38054(), rtpTransceiverInit);
            if (m155914xe3c7420b != null) {
                this.f75649xe11a724f.add(m155914xe3c7420b);
                return m155914xe3c7420b;
            }
            throw new java.lang.IllegalStateException("C++ addTransceiver failed.");
        }
        throw new java.lang.NullPointerException("No MediaStreamTrack specified for addTransceiver.");
    }

    /* renamed from: getStats */
    public void m155971x75286ae9(org.p3371xd0ce3e8d.InterfaceC29843x9c7434b4 interfaceC29843x9c7434b4) {
        m155932x999c0c12(interfaceC29843x9c7434b4);
    }

    /* renamed from: setLocalDescription */
    public void m155985x5f7d0813(org.p3371xd0ce3e8d.InterfaceC29855xa9686c15 interfaceC29855xa9686c15, org.p3371xd0ce3e8d.C29856x9a240ba6 c29856x9a240ba6) {
        m155942xf036c27c(interfaceC29855xa9686c15, c29856x9a240ba6);
    }

    /* renamed from: addTransceiver */
    public org.p3371xd0ce3e8d.C29852xb0ad6b76 m155953xa8281343(org.p3371xd0ce3e8d.C29816x8efc747.MediaType mediaType) {
        return m155954xa8281343(mediaType, new org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit());
    }

    /* renamed from: addTransceiver */
    public org.p3371xd0ce3e8d.C29852xb0ad6b76 m155954xa8281343(org.p3371xd0ce3e8d.C29816x8efc747.MediaType mediaType, org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new org.p3371xd0ce3e8d.C29852xb0ad6b76.RtpTransceiverInit();
            }
            org.p3371xd0ce3e8d.C29852xb0ad6b76 m155913xebe1218b = m155913xebe1218b(mediaType, rtpTransceiverInit);
            if (m155913xebe1218b != null) {
                this.f75649xe11a724f.add(m155913xebe1218b);
                return m155913xebe1218b;
            }
            throw new java.lang.IllegalStateException("C++ addTransceiver failed.");
        }
        throw new java.lang.NullPointerException("No MediaType specified for addTransceiver.");
    }
}
