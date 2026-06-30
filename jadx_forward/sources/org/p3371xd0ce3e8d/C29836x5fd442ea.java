package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.PeerConnectionFactory */
/* loaded from: classes15.dex */
public class C29836x5fd442ea {
    private static final java.lang.String TAG = "PeerConnectionFactory";

    /* renamed from: TRIAL_ENABLED */
    public static final java.lang.String f75778x917d7ed8 = "Enabled";

    /* renamed from: VIDEO_CAPTURER_THREAD_NAME */
    private static final java.lang.String f75779xf218a331 = "VideoCapturerThread";

    /* renamed from: VIDEO_FRAME_EMIT_TRIAL */
    @java.lang.Deprecated
    public static final java.lang.String f75780x492a8120 = "VideoFrameEmit";

    /* renamed from: internalTracerInitialized */
    private static volatile boolean f75781xb3d74f8a;

    /* renamed from: staticNetworkThread */
    private static org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo f75782x68173e0a;

    /* renamed from: staticSignalingThread */
    private static org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo f75783xc44fae96;

    /* renamed from: staticWorkerThread */
    private static org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo f75784xf85024b6;

    /* renamed from: nativeFactory */
    private long f75785x85e280f3;

    /* renamed from: networkThread */
    private volatile org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo f75786xc89a79d8;

    /* renamed from: signalingThread */
    private volatile org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo f75787x10f32ee4;

    /* renamed from: workerThread */
    private volatile org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo f75788x3af3728;

    /* renamed from: org.webrtc.PeerConnectionFactory$Builder */
    /* loaded from: classes15.dex */
    public static class Builder {

        /* renamed from: audioDecoderFactoryFactory */
        private org.p3371xd0ce3e8d.InterfaceC29723xdaef1bee f75789x16197fce;

        /* renamed from: audioDeviceModule */
        private org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738 f75790x9874f758;

        /* renamed from: audioEncoderFactoryFactory */
        private org.p3371xd0ce3e8d.InterfaceC29724xc389ac6 f75791x4762fea6;

        /* renamed from: audioProcessingFactory */
        private org.p3371xd0ce3e8d.InterfaceC29725x38a8c561 f75792x9601941;

        /* renamed from: fecControllerFactoryFactory */
        private org.p3371xd0ce3e8d.InterfaceC29775x2f929639 f75793x5e524b00;

        /* renamed from: neteqFactoryFactory */
        private org.p3371xd0ce3e8d.InterfaceC29825xfc1d5009 f75794xe3a54409;

        /* renamed from: networkControllerFactoryFactory */
        private org.p3371xd0ce3e8d.InterfaceC29828xe822338a f75795x853b3baa;

        /* renamed from: networkStatePredictorFactoryFactory */
        private org.p3371xd0ce3e8d.InterfaceC29833x86ac7199 f75796x61c469b9;

        /* renamed from: options */
        private org.p3371xd0ce3e8d.C29836x5fd442ea.Options f75797xb586869e;

        /* renamed from: videoDecoderFactory */
        private org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 f75798xd4fa7581;

        /* renamed from: videoEncoderFactory */
        private org.p3371xd0ce3e8d.InterfaceC29895x64274189 f75799x197379a9;

        /* renamed from: createPeerConnectionFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea m156180xb1d6576e() {
            org.p3371xd0ce3e8d.C29836x5fd442ea.m156126x89b2852b();
            if (this.f75790x9874f758 == null) {
                this.f75790x9874f758 = org.p3371xd0ce3e8d.p3372x58d9bd6.C29921x33922536.m156618xdc3ef9b(org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035()).m156643x97622dbc();
            }
            android.content.Context m155345x6e669035 = org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035();
            org.p3371xd0ce3e8d.C29836x5fd442ea.Options options = this.f75797xb586869e;
            long mo156614xd448ebf2 = this.f75790x9874f758.mo156614xd448ebf2();
            long mo155132xa463d291 = this.f75791x4762fea6.mo155132xa463d291();
            long mo155131x5feace69 = this.f75789x16197fce.mo155131x5feace69();
            org.p3371xd0ce3e8d.InterfaceC29895x64274189 interfaceC29895x64274189 = this.f75799x197379a9;
            org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 interfaceC29890x1fae3d61 = this.f75798xd4fa7581;
            org.p3371xd0ce3e8d.InterfaceC29725x38a8c561 interfaceC29725x38a8c561 = this.f75792x9601941;
            long m155133x51f73033 = interfaceC29725x38a8c561 == null ? 0L : interfaceC29725x38a8c561.m155133x51f73033();
            org.p3371xd0ce3e8d.InterfaceC29775x2f929639 interfaceC29775x2f929639 = this.f75793x5e524b00;
            long m155529x51f73033 = interfaceC29775x2f929639 == null ? 0L : interfaceC29775x2f929639.m155529x51f73033();
            org.p3371xd0ce3e8d.InterfaceC29828xe822338a interfaceC29828xe822338a = this.f75795x853b3baa;
            long m155823x3b84d093 = interfaceC29828xe822338a == null ? 0L : interfaceC29828xe822338a.m155823x3b84d093();
            org.p3371xd0ce3e8d.InterfaceC29833x86ac7199 interfaceC29833x86ac7199 = this.f75796x61c469b9;
            long m155907xfbae3e4 = interfaceC29833x86ac7199 == null ? 0L : interfaceC29833x86ac7199.m155907xfbae3e4();
            org.p3371xd0ce3e8d.InterfaceC29825xfc1d5009 interfaceC29825xfc1d5009 = this.f75794xe3a54409;
            return org.p3371xd0ce3e8d.C29836x5fd442ea.m156136x24798d7(m155345x6e669035, options, mo156614xd448ebf2, mo155132xa463d291, mo155131x5feace69, interfaceC29895x64274189, interfaceC29890x1fae3d61, m155133x51f73033, m155529x51f73033, m155823x3b84d093, m155907xfbae3e4, interfaceC29825xfc1d5009 != null ? interfaceC29825xfc1d5009.m155804xe7662974() : 0L);
        }

        /* renamed from: setAudioDecoderFactoryFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156181x650641d0(org.p3371xd0ce3e8d.InterfaceC29723xdaef1bee interfaceC29723xdaef1bee) {
            if (interfaceC29723xdaef1bee == null) {
                throw new java.lang.IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
            }
            this.f75789x16197fce = interfaceC29723xdaef1bee;
            return this;
        }

        /* renamed from: setAudioDeviceModule */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156182xc73f8b16(org.p3371xd0ce3e8d.p3372x58d9bd6.InterfaceC29920x83393738 interfaceC29920x83393738) {
            this.f75790x9874f758 = interfaceC29920x83393738;
            return this;
        }

        /* renamed from: setAudioEncoderFactoryFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156183x964fc0a8(org.p3371xd0ce3e8d.InterfaceC29724xc389ac6 interfaceC29724xc389ac6) {
            if (interfaceC29724xc389ac6 == null) {
                throw new java.lang.IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
            }
            this.f75791x4762fea6 = interfaceC29724xc389ac6;
            return this;
        }

        /* renamed from: setAudioProcessingFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156184xa5722c43(org.p3371xd0ce3e8d.InterfaceC29725x38a8c561 interfaceC29725x38a8c561) {
            if (interfaceC29725x38a8c561 == null) {
                throw new java.lang.NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
            }
            this.f75792x9601941 = interfaceC29725x38a8c561;
            return this;
        }

        /* renamed from: setFecControllerFactoryFactoryInterface */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156185xc8a5499b(org.p3371xd0ce3e8d.InterfaceC29775x2f929639 interfaceC29775x2f929639) {
            this.f75793x5e524b00 = interfaceC29775x2f929639;
            return this;
        }

        /* renamed from: setNetEqFactoryFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156186x57de2467(org.p3371xd0ce3e8d.InterfaceC29825xfc1d5009 interfaceC29825xfc1d5009) {
            this.f75794xe3a54409 = interfaceC29825xfc1d5009;
            return this;
        }

        /* renamed from: setNetworkControllerFactoryFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156187xb9616ae8(org.p3371xd0ce3e8d.InterfaceC29828xe822338a interfaceC29828xe822338a) {
            this.f75795x853b3baa = interfaceC29828xe822338a;
            return this;
        }

        /* renamed from: setNetworkStatePredictorFactoryFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156188xaca4c9f7(org.p3371xd0ce3e8d.InterfaceC29833x86ac7199 interfaceC29833x86ac7199) {
            this.f75796x61c469b9 = interfaceC29833x86ac7199;
            return this;
        }

        /* renamed from: setOptions */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156189x66c50fdc(org.p3371xd0ce3e8d.C29836x5fd442ea.Options options) {
            this.f75797xb586869e = options;
            return this;
        }

        /* renamed from: setVideoDecoderFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156190x7b6f11bf(org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 interfaceC29890x1fae3d61) {
            this.f75798xd4fa7581 = interfaceC29890x1fae3d61;
            return this;
        }

        /* renamed from: setVideoEncoderFactory */
        public org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156191xbfe815e7(org.p3371xd0ce3e8d.InterfaceC29895x64274189 interfaceC29895x64274189) {
            this.f75799x197379a9 = interfaceC29895x64274189;
            return this;
        }

        private Builder() {
            this.f75791x4762fea6 = new org.p3371xd0ce3e8d.C29731xb6fb9109();
            this.f75789x16197fce = new org.p3371xd0ce3e8d.C29730x85b21231();
        }
    }

    /* renamed from: org.webrtc.PeerConnectionFactory$InitializationOptions */
    /* loaded from: classes15.dex */
    public static class InitializationOptions {

        /* renamed from: applicationContext */
        final android.content.Context f75800x5b0a2e3f;

        /* renamed from: enableInternalTracer */
        final boolean f75801x9c16b94d;

        /* renamed from: fieldTrials */
        final java.lang.String f75802x16fb3db7;

        /* renamed from: loggable */
        org.p3371xd0ce3e8d.InterfaceC29805x7c49359d f75803x786ed17d;

        /* renamed from: loggableSeverity */
        org.p3371xd0ce3e8d.C29806x779f633f.Severity f75804xca6f7b9a;

        /* renamed from: nativeLibraryLoader */
        final org.p3371xd0ce3e8d.InterfaceC29823x76a44db7 f75805x2bf085d7;

        /* renamed from: nativeLibraryName */
        final java.lang.String f75806xb531714f;

        /* renamed from: org.webrtc.PeerConnectionFactory$InitializationOptions$Builder */
        /* loaded from: classes15.dex */
        public static class Builder {

            /* renamed from: applicationContext */
            private final android.content.Context f75807x5b0a2e3f;

            /* renamed from: enableInternalTracer */
            private boolean f75808x9c16b94d;

            /* renamed from: loggable */
            private org.p3371xd0ce3e8d.InterfaceC29805x7c49359d f75810x786ed17d;

            /* renamed from: loggableSeverity */
            private org.p3371xd0ce3e8d.C29806x779f633f.Severity f75811xca6f7b9a;

            /* renamed from: fieldTrials */
            private java.lang.String f75809x16fb3db7 = "";

            /* renamed from: nativeLibraryLoader */
            private org.p3371xd0ce3e8d.InterfaceC29823x76a44db7 f75812x2bf085d7 = new org.p3371xd0ce3e8d.C29822x7ea484.DefaultLoader();

            /* renamed from: nativeLibraryName */
            private java.lang.String f75813xb531714f = "jingle_peerconnection_so";

            public Builder(android.content.Context context) {
                this.f75807x5b0a2e3f = context;
            }

            /* renamed from: createInitializationOptions */
            public org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions m156193x3c4e1642() {
                return new org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions(this.f75807x5b0a2e3f, this.f75809x16fb3db7, this.f75808x9c16b94d, this.f75812x2bf085d7, this.f75813xb531714f, this.f75810x786ed17d, this.f75811xca6f7b9a);
            }

            /* renamed from: setEnableInternalTracer */
            public org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder m156194xc435a4cf(boolean z17) {
                this.f75808x9c16b94d = z17;
                return this;
            }

            /* renamed from: setFieldTrials */
            public org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder m156195x8736f7f5(java.lang.String str) {
                this.f75809x16fb3db7 = str;
                return this;
            }

            /* renamed from: setInjectableLogger */
            public org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder m156196x9a3305d(org.p3371xd0ce3e8d.InterfaceC29805x7c49359d interfaceC29805x7c49359d, org.p3371xd0ce3e8d.C29806x779f633f.Severity severity) {
                this.f75810x786ed17d = interfaceC29805x7c49359d;
                this.f75811xca6f7b9a = severity;
                return this;
            }

            /* renamed from: setNativeLibraryLoader */
            public org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder m156197xd2652215(org.p3371xd0ce3e8d.InterfaceC29823x76a44db7 interfaceC29823x76a44db7) {
                this.f75812x2bf085d7 = interfaceC29823x76a44db7;
                return this;
            }

            /* renamed from: setNativeLibraryName */
            public org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder m156198xe3fc050d(java.lang.String str) {
                this.f75813xb531714f = str;
                return this;
            }
        }

        /* renamed from: builder */
        public static org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder m156192xdc3ef9b(android.content.Context context) {
            return new org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions.Builder(context);
        }

        private InitializationOptions(android.content.Context context, java.lang.String str, boolean z17, org.p3371xd0ce3e8d.InterfaceC29823x76a44db7 interfaceC29823x76a44db7, java.lang.String str2, org.p3371xd0ce3e8d.InterfaceC29805x7c49359d interfaceC29805x7c49359d, org.p3371xd0ce3e8d.C29806x779f633f.Severity severity) {
            this.f75800x5b0a2e3f = context;
            this.f75802x16fb3db7 = str;
            this.f75801x9c16b94d = z17;
            this.f75805x2bf085d7 = interfaceC29823x76a44db7;
            this.f75806xb531714f = str2;
            this.f75803x786ed17d = interfaceC29805x7c49359d;
            this.f75804xca6f7b9a = severity;
        }
    }

    /* renamed from: org.webrtc.PeerConnectionFactory$Options */
    /* loaded from: classes6.dex */
    public static class Options {

        /* renamed from: ADAPTER_TYPE_ANY */
        static final int f75814xf9d72e57 = 32;

        /* renamed from: ADAPTER_TYPE_CELLULAR */
        static final int f75815x89bd37bf = 4;

        /* renamed from: ADAPTER_TYPE_ETHERNET */
        static final int f75816x6bc5ae2c = 1;

        /* renamed from: ADAPTER_TYPE_LOOPBACK */
        static final int f75817x46f437e0 = 16;

        /* renamed from: ADAPTER_TYPE_UNKNOWN */
        static final int f75818xe4b62b35 = 0;

        /* renamed from: ADAPTER_TYPE_VPN */
        static final int f75819xf9d77d5f = 8;

        /* renamed from: ADAPTER_TYPE_WIFI */
        static final int f75820x411887ea = 2;

        /* renamed from: disableEncryption */
        public boolean f75821x61c68c8b;

        /* renamed from: disableNetworkMonitor */
        public boolean f75822xf27e8454;

        /* renamed from: networkIgnoreMask */
        public int f75823x1bdc14ac;

        /* renamed from: getDisableEncryption */
        public boolean m156199xb4fb13d5() {
            return this.f75821x61c68c8b;
        }

        /* renamed from: getDisableNetworkMonitor */
        public boolean m156200xfe2a569e() {
            return this.f75822xf27e8454;
        }

        /* renamed from: getNetworkIgnoreMask */
        public int m156201x6f109bf6() {
            return this.f75823x1bdc14ac;
        }
    }

    /* renamed from: org.webrtc.PeerConnectionFactory$ThreadInfo */
    /* loaded from: classes15.dex */
    public static class ThreadInfo {

        /* renamed from: thread */
        final java.lang.Thread f75824xcbe10e0a;
        final int tid;

        private ThreadInfo(java.lang.Thread thread, int i17) {
            this.f75824xcbe10e0a = thread;
            this.tid = i17;
        }

        /* renamed from: getCurrent */
        public static org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo m156202x80f8f943() {
            return new org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo(java.lang.Thread.currentThread(), android.os.Process.myTid());
        }
    }

    public C29836x5fd442ea(long j17) {
        m156126x89b2852b();
        if (j17 == 0) {
            throw new java.lang.RuntimeException("Failed to initialize PeerConnectionFactory!");
        }
        this.f75785x85e280f3 = j17;
    }

    /* renamed from: builder */
    public static org.p3371xd0ce3e8d.C29836x5fd442ea.Builder m156125xdc3ef9b() {
        return new org.p3371xd0ce3e8d.C29836x5fd442ea.Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkInitializeHasBeenCalled */
    public static void m156126x89b2852b() {
        if (!org.p3371xd0ce3e8d.C29822x7ea484.m155801xe6c221cf() || org.p3371xd0ce3e8d.C29752x4bd17462.m155345x6e669035() == null) {
            throw new java.lang.IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    /* renamed from: checkPeerConnectionFactoryExists */
    private void m156127x71b501de() {
        if (this.f75785x85e280f3 == 0) {
            throw new java.lang.IllegalStateException("PeerConnectionFactory has been disposed.");
        }
    }

    /* renamed from: fieldTrialsFindFullName */
    public static java.lang.String m156128x908979ea(java.lang.String str) {
        return org.p3371xd0ce3e8d.C29822x7ea484.m155801xe6c221cf() ? m156140x45dd2801(str) : "";
    }

    /* renamed from: initialize */
    public static void m156129x33ebcb90(org.p3371xd0ce3e8d.C29836x5fd442ea.InitializationOptions initializationOptions) {
        org.p3371xd0ce3e8d.C29752x4bd17462.m155346x33ebcb90(initializationOptions.f75800x5b0a2e3f);
        org.p3371xd0ce3e8d.C29822x7ea484.m155800x33ebcb90(initializationOptions.f75805x2bf085d7, initializationOptions.f75806xb531714f);
        m156143xf7f802a8();
        m156144xb0de0430(initializationOptions.f75802x16fb3db7);
        if (initializationOptions.f75801x9c16b94d && !f75781xb3d74f8a) {
            m156131xe5f7449a();
        }
        org.p3371xd0ce3e8d.InterfaceC29805x7c49359d interfaceC29805x7c49359d = initializationOptions.f75803x786ed17d;
        if (interfaceC29805x7c49359d != null) {
            org.p3371xd0ce3e8d.C29806x779f633f.m155677x31bfbe2e(interfaceC29805x7c49359d, initializationOptions.f75804xca6f7b9a);
            m156146xffb36625(new org.p3371xd0ce3e8d.C29793xe0e9b41a(initializationOptions.f75803x786ed17d), initializationOptions.f75804xca6f7b9a.ordinal());
        } else {
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
            org.p3371xd0ce3e8d.C29806x779f633f.m155671xdecef58();
            m156139xcc04883f();
        }
    }

    @java.lang.Deprecated
    /* renamed from: initializeFieldTrials */
    public static void m156130x67a94007(java.lang.String str) {
        m156144xb0de0430(str);
    }

    /* renamed from: initializeInternalTracer */
    private static void m156131xe5f7449a() {
        f75781xb3d74f8a = true;
        m156145xf96ea3d1();
    }

    /* renamed from: nativeCreateAudioSource */
    private static native long m156132x1cbe499e(long j17, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2);

    /* renamed from: nativeCreateAudioTrack */
    private static native long m156133xe8365368(long j17, java.lang.String str, long j18);

    /* renamed from: nativeCreateLocalMediaStream */
    private static native long m156134xe8dde62c(long j17, java.lang.String str);

    /* renamed from: nativeCreatePeerConnection */
    private static native long m156135xc60c90b3(long j17, org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2, long j18, org.p3371xd0ce3e8d.InterfaceC29853xc898c401 interfaceC29853xc898c401);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeCreatePeerConnectionFactory */
    public static native org.p3371xd0ce3e8d.C29836x5fd442ea m156136x24798d7(android.content.Context context, org.p3371xd0ce3e8d.C29836x5fd442ea.Options options, long j17, long j18, long j19, org.p3371xd0ce3e8d.InterfaceC29895x64274189 interfaceC29895x64274189, org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 interfaceC29890x1fae3d61, long j27, long j28, long j29, long j37, long j38);

    /* renamed from: nativeCreateVideoSource */
    private static native long m156137x408af283(long j17, boolean z17, boolean z18);

    /* renamed from: nativeCreateVideoTrack */
    private static native long m156138x2b6e79e3(long j17, java.lang.String str, long j18);

    /* renamed from: nativeDeleteLoggable */
    private static native void m156139xcc04883f();

    /* renamed from: nativeFindFieldTrialsFullName */
    private static native java.lang.String m156140x45dd2801(java.lang.String str);

    /* renamed from: nativeFreeFactory */
    private static native void m156141x92591467(long j17);

    /* renamed from: nativeGetNativePeerConnectionFactory */
    private static native long m156142xee6603f4(long j17);

    /* renamed from: nativeInitializeAndroidGlobals */
    private static native void m156143xf7f802a8();

    /* renamed from: nativeInitializeFieldTrials */
    private static native void m156144xb0de0430(java.lang.String str);

    /* renamed from: nativeInitializeInternalTracer */
    private static native void m156145xf96ea3d1();

    /* renamed from: nativeInjectLoggable */
    private static native void m156146xffb36625(org.p3371xd0ce3e8d.C29793xe0e9b41a c29793xe0e9b41a, int i17);

    /* renamed from: nativePrintStackTrace */
    private static native void m156147x5e8fc513(int i17);

    /* renamed from: nativePrintStackTracesOfRegisteredThreads */
    private static native void m156148xebaa83d0();

    /* renamed from: nativeShutdownInternalTracer */
    private static native void m156149x921dedd7();

    /* renamed from: nativeStartAecDump */
    private static native boolean m156150xd016a48(long j17, int i17, int i18);

    /* renamed from: nativeStartInternalTracingCapture */
    private static native boolean m156151x4f2970ac(java.lang.String str);

    /* renamed from: nativeStopAecDump */
    private static native void m156152x4a20cc5a(long j17);

    /* renamed from: nativeStopInternalTracingCapture */
    private static native void m156153x35b685a();

    /* renamed from: onNetworkThreadReady */
    private void m156154xb37886ea() {
        this.f75786xc89a79d8 = org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo.m156202x80f8f943();
        f75782x68173e0a = this.f75786xc89a79d8;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "onNetworkThreadReady");
    }

    /* renamed from: onSignalingThreadReady */
    private void m156155x6118059e() {
        this.f75787x10f32ee4 = org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo.m156202x80f8f943();
        f75783xc44fae96 = this.f75787x10f32ee4;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "onSignalingThreadReady");
    }

    /* renamed from: onWorkerThreadReady */
    private void m156156xa383b73c() {
        this.f75788x3af3728 = org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo.m156202x80f8f943();
        f75784xf85024b6 = this.f75788x3af3728;
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "onWorkerThreadReady");
    }

    /* renamed from: printStackTrace */
    private static void m156157x6e0e6e2a(org.p3371xd0ce3e8d.C29836x5fd442ea.ThreadInfo threadInfo, boolean z17) {
        if (threadInfo == null) {
            return;
        }
        java.lang.String name = threadInfo.f75824xcbe10e0a.getName();
        java.lang.StackTraceElement[] stackTrace = threadInfo.f75824xcbe10e0a.getStackTrace();
        if (stackTrace.length > 0) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, name + " stacktrace:");
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, stackTraceElement.toString());
            }
        }
        if (z17) {
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
            org.p3371xd0ce3e8d.C29806x779f633f.w(TAG, "pid: " + android.os.Process.myPid() + ", tid: " + threadInfo.tid + ", name: " + name + "  >>> WebRTC <<<");
            m156147x5e8fc513(threadInfo.tid);
        }
    }

    @java.lang.Deprecated
    /* renamed from: printStackTraces */
    public static void m156158x53bf5789() {
        m156157x6e0e6e2a(f75782x68173e0a, false);
        m156157x6e0e6e2a(f75784xf85024b6, false);
        m156157x6e0e6e2a(f75783xc44fae96, false);
    }

    /* renamed from: shutdownInternalTracer */
    public static void m156159xb4ba2ce0() {
        f75781xb3d74f8a = false;
        m156149x921dedd7();
    }

    /* renamed from: startInternalTracingCapture */
    public static boolean m156160xfeb82f43(java.lang.String str) {
        return m156151x4f2970ac(str);
    }

    /* renamed from: stopInternalTracingCapture */
    public static void m156161xf03efae3() {
        m156153x35b685a();
    }

    /* renamed from: createAudioSource */
    public org.p3371xd0ce3e8d.C29726x7d81df71 m156162x473708f5(org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2) {
        m156127x71b501de();
        return new org.p3371xd0ce3e8d.C29726x7d81df71(m156132x1cbe499e(this.f75785x85e280f3, c29812x48c60bd2));
    }

    /* renamed from: createAudioTrack */
    public org.p3371xd0ce3e8d.C29727xd28f3735 m156163xc88ccd31(java.lang.String str, org.p3371xd0ce3e8d.C29726x7d81df71 c29726x7d81df71) {
        m156127x71b501de();
        return new org.p3371xd0ce3e8d.C29727xd28f3735(m156133xe8365368(this.f75785x85e280f3, str, c29726x7d81df71.m155134x46d7f244()));
    }

    /* renamed from: createLocalMediaStream */
    public org.p3371xd0ce3e8d.C29815x4f50d864 m156164xb7a2535(java.lang.String str) {
        m156127x71b501de();
        return new org.p3371xd0ce3e8d.C29815x4f50d864(m156134xe8dde62c(this.f75785x85e280f3, str));
    }

    @java.lang.Deprecated
    /* renamed from: createPeerConnection */
    public org.p3371xd0ce3e8d.C29834x4e84c600 m156167x3f8efdfc(org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2, org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
        return m156170x8c796cd9(rTCConfiguration, c29812x48c60bd2, observer, null);
    }

    /* renamed from: createPeerConnectionInternal */
    public org.p3371xd0ce3e8d.C29834x4e84c600 m156170x8c796cd9(org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2, org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer, org.p3371xd0ce3e8d.InterfaceC29853xc898c401 interfaceC29853xc898c401) {
        m156127x71b501de();
        long m155908x145534e9 = org.p3371xd0ce3e8d.C29834x4e84c600.m155908x145534e9(observer);
        if (m155908x145534e9 == 0) {
            return null;
        }
        long m156135xc60c90b3 = m156135xc60c90b3(this.f75785x85e280f3, rTCConfiguration, c29812x48c60bd2, m155908x145534e9, interfaceC29853xc898c401);
        if (m156135xc60c90b3 == 0) {
            return null;
        }
        return new org.p3371xd0ce3e8d.C29834x4e84c600(m156135xc60c90b3);
    }

    /* renamed from: createVideoSource */
    public org.p3371xd0ce3e8d.C29909xa14e8856 m156172x6b03b1da(boolean z17, boolean z18) {
        m156127x71b501de();
        return new org.p3371xd0ce3e8d.C29909xa14e8856(m156137x408af283(this.f75785x85e280f3, z17, z18));
    }

    /* renamed from: createVideoTrack */
    public org.p3371xd0ce3e8d.C29912x15c75db0 m156173xbc4f3ac(java.lang.String str, org.p3371xd0ce3e8d.C29909xa14e8856 c29909xa14e8856) {
        m156127x71b501de();
        return new org.p3371xd0ce3e8d.C29912x15c75db0(m156138x2b6e79e3(this.f75785x85e280f3, str, c29909xa14e8856.m156581xb5ff66f8()));
    }

    /* renamed from: dispose */
    public void m156174x63a5261f() {
        m156127x71b501de();
        m156141x92591467(this.f75785x85e280f3);
        this.f75786xc89a79d8 = null;
        this.f75788x3af3728 = null;
        this.f75787x10f32ee4 = null;
        this.f75785x85e280f3 = 0L;
    }

    /* renamed from: getNativeOwnedFactoryAndThreads */
    public long m156175x7a51dc4() {
        m156127x71b501de();
        return this.f75785x85e280f3;
    }

    /* renamed from: getNativePeerConnectionFactory */
    public long m156176xc2bb29fd() {
        m156127x71b501de();
        return m156142xee6603f4(this.f75785x85e280f3);
    }

    /* renamed from: printInternalStackTraces */
    public void m156177x3185cd8c(boolean z17) {
        m156157x6e0e6e2a(this.f75787x10f32ee4, z17);
        m156157x6e0e6e2a(this.f75788x3af3728, z17);
        m156157x6e0e6e2a(this.f75786xc89a79d8, z17);
        if (z17) {
            m156148xebaa83d0();
        }
    }

    /* renamed from: startAecDump */
    public boolean m156178xb5263091(int i17, int i18) {
        m156127x71b501de();
        return m156150xd016a48(this.f75785x85e280f3, i17, i18);
    }

    /* renamed from: stopAecDump */
    public void m156179x709598f1() {
        m156127x71b501de();
        m156152x4a20cc5a(this.f75785x85e280f3);
    }

    @java.lang.Deprecated
    /* renamed from: createPeerConnection */
    public org.p3371xd0ce3e8d.C29834x4e84c600 m156165x3f8efdfc(java.util.List<org.p3371xd0ce3e8d.C29834x4e84c600.IceServer> list, org.p3371xd0ce3e8d.C29812x48c60bd2 c29812x48c60bd2, org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
        return m156167x3f8efdfc(new org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration(list), c29812x48c60bd2, observer);
    }

    /* renamed from: createVideoSource */
    public org.p3371xd0ce3e8d.C29909xa14e8856 m156171x6b03b1da(boolean z17) {
        return m156172x6b03b1da(z17, true);
    }

    /* renamed from: createPeerConnection */
    public org.p3371xd0ce3e8d.C29834x4e84c600 m156166x3f8efdfc(java.util.List<org.p3371xd0ce3e8d.C29834x4e84c600.IceServer> list, org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
        return m156168x3f8efdfc(new org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration(list), observer);
    }

    /* renamed from: createPeerConnection */
    public org.p3371xd0ce3e8d.C29834x4e84c600 m156168x3f8efdfc(org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration, org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
        return m156167x3f8efdfc(rTCConfiguration, (org.p3371xd0ce3e8d.C29812x48c60bd2) null, observer);
    }

    /* renamed from: createPeerConnection */
    public org.p3371xd0ce3e8d.C29834x4e84c600 m156169x3f8efdfc(org.p3371xd0ce3e8d.C29834x4e84c600.RTCConfiguration rTCConfiguration, org.p3371xd0ce3e8d.C29835x275e1749 c29835x275e1749) {
        return m156170x8c796cd9(rTCConfiguration, null, c29835x275e1749.m156119x90a1904c(), c29835x275e1749.m156120x31e8ed7());
    }
}
