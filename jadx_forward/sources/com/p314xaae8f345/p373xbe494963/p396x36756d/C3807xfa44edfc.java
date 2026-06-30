package com.p314xaae8f345.p373xbe494963.p396x36756d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::chorus")
/* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl */
/* loaded from: classes10.dex */
public class C3807xfa44edfc extends com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc {
    private static final java.lang.String TAG = "TXChorusMusicPlayerImpl";

    /* renamed from: mListener */
    private final com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.ChorusPlayerListener f14861x753a6c41 = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.ChorusPlayerListener(0);

    /* renamed from: mNativePtr */
    private long f14862x3e9ea96a;

    /* renamed from: mSubTRTCCloud */
    private com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 f14863x5b5d3f95;

    /* renamed from: mTRTCCloud */
    private com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 f14864xc19d06fb;

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128113a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f128114b;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack.m105633xcee59d22().length];
            f128114b = iArr;
            try {
                iArr[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack.TXChorusAccompaniment.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128114b[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack.TXChorusOriginalSong.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.m105636xcee59d22().length];
            f128113a = iArr2;
            try {
                iArr2[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f128113a[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleBackSinger.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f128113a[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleAnchor.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f128113a[com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleAudience.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$EnterRoomParams */
    /* loaded from: classes3.dex */
    public static class EnterRoomParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams f128116a;

        public EnterRoomParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams) {
            this.f128116a = tRTCParams;
        }

        /* renamed from: getBusinessInfo */
        public java.lang.String m30478x38d44b04() {
            return this.f128116a.f57075xd7e1b88e;
        }

        /* renamed from: getPrivateMapKey */
        public java.lang.String m30479xd7319310() {
            return this.f128116a.f57076x19d1d6c6;
        }

        /* renamed from: getRole */
        public int m30480xfb84e8ec() {
            return this.f128116a.f57077x358076;
        }

        /* renamed from: getRoomId */
        public int m30481x2defe24c() {
            return this.f128116a.f57078xc8d8bf56;
        }

        /* renamed from: getSdkAppId */
        public int m30482x8a4fa478() {
            return this.f128116a.f57079xe756702;
        }

        /* renamed from: getStrRoomId */
        public java.lang.String m30483xccf7b231() {
            return this.f128116a.f57080xcd8a40e7;
        }

        /* renamed from: getStreamId */
        public java.lang.String m30484xe699b631() {
            return this.f128116a.f57081x6abf78bb;
        }

        /* renamed from: getUserDefineRecordId */
        public java.lang.String m30485xae8f12c8() {
            return this.f128116a.f57082x9b32b0d2;
        }

        /* renamed from: getUserId */
        public java.lang.String m30486x3342513c() {
            return this.f128116a.f57083xce2b2e46;
        }

        /* renamed from: getUserSig */
        public java.lang.String m30487x3507fcd0() {
            return this.f128116a.f57084xf73ac106;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$TXChorusLyricCharacterList */
    /* loaded from: classes10.dex */
    public static class TXChorusLyricCharacterList {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusLyricCharacter> f128117a;

        public TXChorusLyricCharacterList(int i17) {
            this.f128117a = new java.util.ArrayList(i17);
        }

        public void add(int i17, long j17, long j18, java.lang.String str) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusLyricCharacter tXChorusLyricCharacter = new com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusLyricCharacter();
            tXChorusLyricCharacter.f57249x91dc3c55 = j17;
            tXChorusLyricCharacter.f57248x4967425a = j18;
            tXChorusLyricCharacter.f57250x163ebab8 = str;
            this.f128117a.add(i17, tXChorusLyricCharacter);
        }

        /* renamed from: getChorusLyricCharacterList */
        public java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusLyricCharacter> m30488xe0a3f304() {
            return this.f128117a;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$TXLyricLineList */
    /* loaded from: classes10.dex */
    public static class TXLyricLineList {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXLyricLine> f128118a;

        public TXLyricLineList(int i17) {
            this.f128118a = new java.util.ArrayList(i17);
        }

        public void add(int i17, long j17, long j18, java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusLyricCharacter> list) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXLyricLine tXLyricLine = new com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXLyricLine();
            tXLyricLine.f57261x91dc3c55 = j17;
            tXLyricLine.f57260x4967425a = j18;
            tXLyricLine.f57259x13a158b0 = list;
            this.f128118a.add(i17, tXLyricLine);
        }

        /* renamed from: getLyricLineList */
        public java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXLyricLine> m30489x20bbb07b() {
            return this.f128118a;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$TXReferencePitchList */
    /* loaded from: classes10.dex */
    public static class TXReferencePitchList {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXReferencePitch> f128119a;

        public TXReferencePitchList(int i17) {
            this.f128119a = new java.util.ArrayList(i17);
        }

        public void add(int i17, long j17, long j18, int i18) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXReferencePitch tXReferencePitch = new com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXReferencePitch();
            tXReferencePitch.f57264x91dc3c55 = j17;
            tXReferencePitch.f57262x4967425a = j18;
            tXReferencePitch.f57263x8de86ab5 = i18;
            this.f128119a.add(i17, tXReferencePitch);
        }

        /* renamed from: getTXReferencePitchList */
        public java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXReferencePitch> m30490xfd3462ed() {
            return this.f128119a;
        }
    }

    private C3807xfa44edfc(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8, java.lang.String str, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener) {
        long j17;
        long j18 = 0;
        this.f14862x3e9ea96a = 0L;
        this.f14864xc19d06fb = null;
        this.f14863x5b5d3f95 = null;
        if (abstractC26786xbe57dcc8 == null) {
            return;
        }
        this.f14864xc19d06fb = abstractC26786xbe57dcc8;
        try {
            j17 = m30447x5bebde33(abstractC26786xbe57dcc8.mo30261xd33a8dd4("{\"api\":\"getNativeHandle\"}"));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "get main trtcCloud native handle fail.", th6);
            j17 = 0;
        }
        try {
            com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 mo30263xb97b60f1 = abstractC26786xbe57dcc8.mo30263xb97b60f1();
            this.f14863x5b5d3f95 = mo30263xb97b60f1;
            j18 = m30447x5bebde33(mo30263xb97b60f1.mo30261xd33a8dd4("{\"api\":\"getNativeHandle\"}"));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "get sub trtcCloud native handle fail.", th7);
        }
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.ChorusPlayerListener chorusPlayerListener = this.f14861x753a6c41;
        chorusPlayerListener.f128115a = iTXChorusPlayerListener;
        this.f14862x3e9ea96a = m30433x73c02ff3(j17, j18, str, chorusPlayerListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertIntValueToTXChorusError */
    public static com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError m30428x177321ee(int i17) {
        switch (i17) {
            case 1:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorInvalidParameters;
            case 2:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorTrtcCloudNotFound;
            case 3:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorRestrictedToLeadSinger;
            case 4:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorMusicPreloadRequired;
            case 5:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorMusicLoadFailed;
            case 6:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorMusicDecodeFailed;
            case 7:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorEnterRoomFailed;
            case 8:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorRoomDisconnected;
            case 9:
                return com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError.TXChorusErrorTrtcError;
            default:
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "chorus error value is undefined. chorusErrorValue=".concat(java.lang.String.valueOf(i17)));
                return null;
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc m30429xaf65a0fc(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8, java.lang.String str, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return new com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc(abstractC26786xbe57dcc8, str, iTXChorusPlayerListener);
    }

    /* renamed from: getTXChorusMusicTrackIntValue */
    private static int m30430x25fa59c8(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack tXChorusMusicTrack) {
        if (tXChorusMusicTrack == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "music track enum is null. musicTrack=".concat(java.lang.String.valueOf(tXChorusMusicTrack)));
            return -1;
        }
        int i17 = com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.AnonymousClass1.f128114b[tXChorusMusicTrack.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "music track enum is unknown. musicTrack=".concat(java.lang.String.valueOf(tXChorusMusicTrack)));
                return -1;
            }
        }
        return i18;
    }

    /* renamed from: getTXChorusRoleIntValue */
    private static int m30431x771b7818(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole) {
        if (tXChorusRole == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "chorus role enum is null. chorusRole=".concat(java.lang.String.valueOf(tXChorusRole)));
            return -1;
        }
        int i17 = com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.AnonymousClass1.f128113a[tXChorusRole.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "chorus role enum is unknown. chorusRole=".concat(java.lang.String.valueOf(tXChorusRole)));
                        return -1;
                    }
                }
            }
        }
        return i18;
    }

    /* renamed from: nativeCallExperimentalAPI */
    private static native void m30432x63f4483d(long j17, java.lang.String str);

    /* renamed from: nativeCreate */
    private static native long m30433x73c02ff3(long j17, long j18, java.lang.String str, com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.ChorusPlayerListener chorusPlayerListener);

    /* renamed from: nativeDestroy */
    private static native void m30434x23caefe3(long j17);

    /* renamed from: nativeLoadExternalMusic */
    private static native void m30435x209d927d(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17);

    /* renamed from: nativeLoadMusic */
    private static native void m30436x38395288(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: nativePause */
    private static native void m30437x67845c1f(long j17);

    /* renamed from: nativeResume */
    private static native void m30438x8ca85724(long j17);

    /* renamed from: nativeSeek */
    private static native void m30439xb905af2f(long j17, long j18);

    /* renamed from: nativeSetChorusRole */
    private static native void m30440xdb703667(long j17, int i17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.EnterRoomParams enterRoomParams);

    /* renamed from: nativeSetMusicPitch */
    private static native void m30441x909af746(long j17, float f17);

    /* renamed from: nativeSetPlayoutVolume */
    private static native void m30442x3e7ac849(long j17, int i17);

    /* renamed from: nativeSetPublishVolume */
    private static native void m30443xecbbd1fe(long j17, int i17);

    /* renamed from: nativeStart */
    private static native void m30444x67b6fa8b(long j17);

    /* renamed from: nativeStop */
    private static native void m30445xb905e8b9(long j17);

    /* renamed from: nativeSwitchMusicTrack */
    private static native void m30446xaed8cab1(long j17, int i17);

    /* renamed from: parseNativePointer */
    private static long m30447x5bebde33(java.lang.String str) {
        try {
            java.math.BigInteger bigInteger = new java.math.BigInteger(str);
            if (bigInteger.bitLength() <= 64) {
                return bigInteger.longValue();
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Parsing pointer exceeding 64 bits. native pointer is ".concat(java.lang.String.valueOf(str)));
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "Parsing pointer fail. native pointer is ".concat(java.lang.String.valueOf(str)), th6);
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: callExperimentalAPI */
    public synchronized void mo30448xd33a8dd4(java.lang.String str) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30432x63f4483d(j17, str);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: destroy */
    public synchronized void mo30449x5cd39ffa() {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8;
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30434x23caefe3(j17);
            this.f14862x3e9ea96a = 0L;
        }
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc82 = this.f14864xc19d06fb;
        if (abstractC26786xbe57dcc82 != null && (abstractC26786xbe57dcc8 = this.f14863x5b5d3f95) != null) {
            abstractC26786xbe57dcc82.mo30264xabf181ef(abstractC26786xbe57dcc8);
            this.f14863x5b5d3f95 = null;
            this.f14864xc19d06fb = null;
        }
        this.f14861x753a6c41.f128115a = null;
    }

    /* renamed from: finalize */
    public void m30450xd764dc1e() {
        super.finalize();
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "object is not destroyed. will be memory leak. native pointer is %#x.", java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: loadExternalMusic */
    public synchronized void mo30451x4b1651d4(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusExternalMusicParams tXChorusExternalMusicParams) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0 && tXChorusExternalMusicParams != null) {
            m30435x209d927d(j17, tXChorusExternalMusicParams.f57246x54340220, tXChorusExternalMusicParams.f57247x324c710a, tXChorusExternalMusicParams.f57243x4c3a2d54, tXChorusExternalMusicParams.f57245xa66d7bba, tXChorusExternalMusicParams.f57244x98b0022e);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: loadMusic */
    public synchronized void mo30452x51d658df(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0 && tXChorusCopyrightedMusicParams != null) {
            m30436x38395288(j17, tXChorusCopyrightedMusicParams.f57231x54340220, tXChorusCopyrightedMusicParams.f57232x8f7a1f25, tXChorusCopyrightedMusicParams.f57229xf4789da4, tXChorusCopyrightedMusicParams.f57230xf478c4b4);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: pause */
    public synchronized void mo30453x65825f6() {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30437x67845c1f(j17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: resume */
    public synchronized void mo30454xc84dc82d() {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30438x8ca85724(j17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: seek */
    public synchronized void mo30455x35ce78(long j17) {
        long j18 = this.f14862x3e9ea96a;
        if (j18 != 0) {
            m30439xb905af2f(j18, j17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: setChorusRole */
    public synchronized void mo30456x37e4393e(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams) {
        if (this.f14862x3e9ea96a != 0 && tXChorusRole != null) {
            m30440xdb703667(this.f14862x3e9ea96a, m30431x771b7818(tXChorusRole), tRTCParams != null ? new com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.EnterRoomParams(tRTCParams) : null);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: setListener */
    public void mo30457xc6cf6336(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener) {
        this.f14861x753a6c41.f128115a = iTXChorusPlayerListener;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: setMusicPitch */
    public synchronized void mo30458xed0efa1d(float f17) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30441x909af746(j17, f17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: setPlayoutVolume */
    public synchronized void mo30459x1ed14212(int i17) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30442x3e7ac849(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: setPublishVolume */
    public synchronized void mo30460xcd124bc7(int i17) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30443xecbbd1fe(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: start */
    public synchronized void mo30461x68ac462() {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30444x67b6fa8b(j17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: stop */
    public synchronized void mo30462x360802() {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0) {
            m30445xb905e8b9(j17);
        }
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc
    /* renamed from: switchMusicTrack */
    public synchronized void mo30463x8f2f447a(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack tXChorusMusicTrack) {
        long j17 = this.f14862x3e9ea96a;
        if (j17 != 0 && tXChorusMusicTrack != null) {
            m30446xaed8cab1(j17, m30430x25fa59c8(tXChorusMusicTrack));
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$ChorusPlayerListener */
    /* loaded from: classes10.dex */
    public static class ChorusPlayerListener {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener f128115a;

        private ChorusPlayerListener() {
            this.f128115a = null;
        }

        /* renamed from: onChorusError */
        public void m30465x704000a3(int i17, java.lang.String str) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10555x704000a3(com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.m30428x177321ee(i17), str);
            }
        }

        /* renamed from: onChorusMusicLoadProgress */
        public void m30466x4751f613(java.lang.String str, float f17) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10556x4751f613(str, f17);
            }
        }

        /* renamed from: onChorusMusicLoadSucceed */
        public void m30467x94eef59c(java.lang.String str, java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXLyricLine> list, java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXReferencePitch> list2) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10557x94eef59c(str, list, list2);
            }
        }

        /* renamed from: onChorusPaused */
        public void m30468xa9973df3() {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10558xa9973df3();
            }
        }

        /* renamed from: onChorusRequireLoadMusic */
        public void m30469x9a2f6b7f(java.lang.String str) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10559x9a2f6b7f(str);
            }
        }

        /* renamed from: onChorusResumed */
        public void m30470xf9d531b2() {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10560xf9d531b2();
            }
        }

        /* renamed from: onChorusStarted */
        public void m30471x4755345c() {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10561x4755345c();
            }
        }

        /* renamed from: onChorusStopped */
        public void m30472x481985a8() {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10562x481985a8();
            }
        }

        /* renamed from: onMusicProgressUpdated */
        public void m30473x7c731168(long j17, long j18) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10563x7c731168(j17, j18);
            }
        }

        /* renamed from: onNetworkQualityUpdated */
        public void m30474xc26b1beb(int i17, int i18, int i19) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10564xc26b1beb(i17, i18, i19);
            }
        }

        /* renamed from: onVoicePitchUpdated */
        public void m30475xe21d538e(int i17, boolean z17, long j17) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10565xe21d538e(i17, z17, j17);
            }
        }

        /* renamed from: onVoiceScoreUpdated */
        public void m30476x2ec5d7fc(int i17, int i18, int i19) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10566x2ec5d7fc(i17, i18, i19);
            }
        }

        /* renamed from: shouldDecryptAudioData */
        public void m30477x5283ed66(java.nio.ByteBuffer byteBuffer) {
            com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener = this.f128115a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.mo10567x5283ed66(byteBuffer);
            }
        }

        public /* synthetic */ ChorusPlayerListener(byte b17) {
            this();
        }
    }
}
