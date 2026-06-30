package com.p314xaae8f345.p373xbe494963.p396x36756d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::trtc")
/* renamed from: com.tencent.liteav.trtc.TrtcCloudJni */
/* loaded from: classes16.dex */
public class C3808x20f90ddd {

    /* renamed from: INIT_LOCK */
    private static final java.lang.Object f14865x987bc2fa = new java.lang.Object();
    private static final java.lang.String TAG = "TrtcCloudJni";

    /* renamed from: mHasInited */
    private static boolean f14866x59145afc;

    /* renamed from: mAudioFrameListener */
    private com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener f14867x254f7058;

    /* renamed from: mCalledGLCreatedFrameListener */
    private com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener f14868x73627288;

    /* renamed from: mFloatingWindowSet */
    private final java.util.HashSet<android.view.View> f14869x5ed5e7ff;

    /* renamed from: mJniReadLock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f14870xe88073f9;

    /* renamed from: mJniWriteLock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f14871x17237092;

    /* renamed from: mListener */
    private com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c f14872x753a6c41;

    /* renamed from: mListenerHandler */
    private android.os.Handler f14873x12467c9;

    /* renamed from: mListenerList */
    private java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> f14874x3ddc887f;

    /* renamed from: mLocalUserId */
    private java.lang.String f14875x1da8ee4;

    /* renamed from: mLocalVideoRenderListenerWrapper */
    private final com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> f14876xcaa708ac;

    /* renamed from: mNativeTrtcCloudJni */
    private long f14877x6e584ec1;

    /* renamed from: mReadWriteLock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock f14878x9570c147;

    /* renamed from: mRemoteVideoRenderListenerMap */
    private final java.util.Map<java.lang.String, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener>> f14879x3d5a44a;

    /* renamed from: mVideoFrameListenerWrapper */
    private final com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener> f14880xfcf8cd40;

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128120a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.m29578xcee59d22().length];
            f128120a = iArr;
            try {
                iArr[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f128120a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f128120a[com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$AudioFrame */
    /* loaded from: classes10.dex */
    public static class AudioFrame {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame f128121a;

        public AudioFrame(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
            this.f128121a = tRTCAudioFrame;
        }

        /* renamed from: getChannel */
        public int m30814x69d8b8cd() {
            return this.f128121a.f57040x2c0b7d03;
        }

        /* renamed from: getData */
        public byte[] m30815xfb7e5820() {
            return this.f128121a.f57041x2eefaa;
        }

        /* renamed from: getSampleRate */
        public int m30816xf6c809a0() {
            return this.f128121a.f57043x88751aa;
        }

        /* renamed from: getTimestamp */
        public long m30817x2b69a60() {
            return this.f128121a.f57044x3492916;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$AudioParallelParams */
    /* loaded from: classes4.dex */
    public static class AudioParallelParams {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioParallelParams f128122a;

        public AudioParallelParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioParallelParams tRTCAudioParallelParams) {
            this.f128122a = tRTCAudioParallelParams;
        }

        /* renamed from: getIncludeUsers */
        public java.lang.String[] m30818x5d6f84b6() {
            java.util.ArrayList<java.lang.String> arrayList = this.f128122a.f57049xfc7cf240;
            return arrayList != null ? (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]) : new java.lang.String[0];
        }

        /* renamed from: getMaxCount */
        public int m30819x92a0b781() {
            return this.f128122a.f57050x16c67a0b;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$AudioRecordingParams */
    /* loaded from: classes16.dex */
    public static class AudioRecordingParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioRecordingParams f128123a;

        public AudioRecordingParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
            this.f128123a = tRTCAudioRecordingParams;
        }

        /* renamed from: getContent */
        public int m30820x76847043() {
            return this.f128123a.f57053x8f9bed48;
        }

        /* renamed from: getFilePath */
        public java.lang.String m30821x5000ed37() {
            return this.f128123a.f57051xd426afc1;
        }

        /* renamed from: getMaxDurationPerFile */
        public int m30822x1c665ff7() {
            return this.f128123a.f57052x909fe01;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$EnterRoomParams */
    /* loaded from: classes3.dex */
    public static class EnterRoomParams {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams f128124a;

        public EnterRoomParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams) {
            this.f128124a = tRTCParams;
        }

        /* renamed from: getBusinessInfo */
        public java.lang.String m30823x38d44b04() {
            return this.f128124a.f57075xd7e1b88e;
        }

        /* renamed from: getPrivateMapKey */
        public java.lang.String m30824xd7319310() {
            return this.f128124a.f57076x19d1d6c6;
        }

        /* renamed from: getRecordId */
        public java.lang.String m30825x4c36e2c2() {
            return this.f128124a.f57082x9b32b0d2;
        }

        /* renamed from: getRole */
        public int m30826xfb84e8ec() {
            return this.f128124a.f57077x358076;
        }

        /* renamed from: getRoomId */
        public int m30827x2defe24c() {
            return this.f128124a.f57078xc8d8bf56;
        }

        /* renamed from: getSdkAppId */
        public int m30828x8a4fa478() {
            return this.f128124a.f57079xe756702;
        }

        /* renamed from: getStrRoomId */
        public java.lang.String m30829xccf7b231() {
            return this.f128124a.f57080xcd8a40e7;
        }

        /* renamed from: getStreamId */
        public java.lang.String m30830xe699b631() {
            return this.f128124a.f57081x6abf78bb;
        }

        /* renamed from: getUserId */
        public java.lang.String m30831x3342513c() {
            return this.f128124a.f57083xce2b2e46;
        }

        /* renamed from: getUserSig */
        public java.lang.String m30832x3507fcd0() {
            return this.f128124a.f57084xf73ac106;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$LocalRecordingParams */
    /* loaded from: classes16.dex */
    public static class LocalRecordingParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCLocalRecordingParams f128125a;

        public LocalRecordingParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
            this.f128125a = tRTCLocalRecordingParams;
        }

        /* renamed from: getFilePath */
        public java.lang.String m30833x5000ed37() {
            return this.f128125a.f57058xd426afc1;
        }

        /* renamed from: getInterval */
        public int m30834x9dda223b() {
            return this.f128125a.f57059x21ffe4c5;
        }

        /* renamed from: getMaxDurationPerFile */
        public int m30835x1c665ff7() {
            return this.f128125a.f57060x909fe01;
        }

        /* renamed from: getRecordType */
        public int m30836x1a0e9721() {
            return this.f128125a.f57061x2bcddf2b;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$LocalStatistics */
    /* loaded from: classes3.dex */
    public static class LocalStatistics {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics f128126a = new com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics();

        /* renamed from: addLocalStatistics */
        public static void m30837x1f8f2c0d(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics localStatistics, java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics> arrayList) {
            arrayList.add(localStatistics);
        }

        /* renamed from: createLocalStatistics */
        public static com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics m30838x352fe252(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics localStatistics = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics();
            com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCLocalStatistics tRTCLocalStatistics = localStatistics.f128126a;
            tRTCLocalStatistics.f57207xb8c992da = i17;
            tRTCLocalStatistics.f57209x6be2dc6 = i18;
            tRTCLocalStatistics.f57206xb7389127 = i19;
            tRTCLocalStatistics.f57205x207cebed = i27;
            tRTCLocalStatistics.f57208xf1220e72 = i28;
            tRTCLocalStatistics.f57202x9b599ab7 = i37;
            tRTCLocalStatistics.f57204xa80e7620 = i29;
            tRTCLocalStatistics.f57203x75f87e1 = i38;
            return localStatistics;
        }

        /* renamed from: createLocalStatisticsArray */
        public static java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics> m30839xe7244327() {
            return new java.util.ArrayList<>();
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$MixUser */
    /* loaded from: classes3.dex */
    public static class MixUser {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser f128127a;

        public /* synthetic */ MixUser(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser, byte b17) {
            this(tRTCMixUser);
        }

        /* renamed from: getHeight */
        public int m30840x1c4fb41d() {
            return this.f128127a.f57062xb7389127;
        }

        /* renamed from: getImage */
        public java.lang.String m30841x74984fa5() {
            return android.text.TextUtils.isEmpty(this.f128127a.f57063x5faa95b) ? "" : this.f128127a.f57063x5faa95b;
        }

        /* renamed from: getInputType */
        public int m30842x652bd76e() {
            return this.f128127a.f57064x65be6624;
        }

        /* renamed from: getPureAudio */
        public boolean m30843x95f20908() {
            return this.f128127a.f57065x968497be;
        }

        /* renamed from: getRenderMode */
        public int m30844x3569ec4f() {
            return this.f128127a.f57066x47293459;
        }

        /* renamed from: getRoomId */
        public java.lang.String m30845x2defe24c() {
            return android.text.TextUtils.isEmpty(this.f128127a.f57067xc8d8bf56) ? "" : this.f128127a.f57067xc8d8bf56;
        }

        /* renamed from: getSoundLevel */
        public int m30846xd8c4ebab() {
            return this.f128127a.f57068xea8433b5;
        }

        /* renamed from: getStreamType */
        public int m30847xa70a4ad0() {
            return this.f128127a.f57069xb8c992da;
        }

        /* renamed from: getUserId */
        public java.lang.String m30848x3342513c() {
            return android.text.TextUtils.isEmpty(this.f128127a.f57070xce2b2e46) ? "" : this.f128127a.f57070xce2b2e46;
        }

        /* renamed from: getWidth */
        public int m30849x755bd410() {
            return this.f128127a.f57071x6be2dc6;
        }

        /* renamed from: getX */
        public int m30850x305bc2() {
            return this.f128127a.f297232x;
        }

        /* renamed from: getY */
        public int m30851x305bc3() {
            return this.f128127a.f297233y;
        }

        /* renamed from: getZOrder */
        public int m30852x39d4f5ea() {
            return this.f128127a.f57072xd4bdd2f4;
        }

        private MixUser(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser) {
            this.f128127a = tRTCMixUser;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$PayloadPrivateEncryptionConfig */
    /* loaded from: classes14.dex */
    public static class PayloadPrivateEncryptionConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPayloadPrivateEncryptionConfig f128128a;

        public PayloadPrivateEncryptionConfig(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
            this.f128128a = tRTCPayloadPrivateEncryptionConfig;
        }

        /* renamed from: getEncryptionAlgorithm */
        public int m30853x285164f6() {
            return this.f128128a.f57085xd021882c;
        }

        /* renamed from: getEncryptionKey */
        public java.lang.String m30854xbb370026() {
            java.lang.String str = this.f128128a.f57086xfdd743dc;
            return str != null ? str : "";
        }

        /* renamed from: getEncryptionSalt */
        public byte[] m30855xabac976f() {
            return this.f128128a.f57087xbd14ca79;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$PublishCDNParams */
    /* loaded from: classes16.dex */
    public static class PublishCDNParams {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCDNParam f128129a;

        public PublishCDNParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCDNParam tRTCPublishCDNParam) {
            this.f128129a = tRTCPublishCDNParam;
        }

        /* renamed from: getAppId */
        public int m30856x74292566() {
            return this.f128129a.f57088x58b7f1c;
        }

        /* renamed from: getBizId */
        public int m30857x743433d8() {
            return this.f128129a.f57089x5968d8e;
        }

        /* renamed from: getStreamId */
        public java.lang.String m30858xe699b631() {
            return android.text.TextUtils.isEmpty(this.f128129a.f57090x6abf78bb) ? "" : this.f128129a.f57090x6abf78bb;
        }

        /* renamed from: getUrl */
        public java.lang.String m30859xb5887639() {
            return android.text.TextUtils.isEmpty(this.f128129a.url) ? "" : this.f128129a.url;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$PublishCdnUrl */
    /* loaded from: classes3.dex */
    public static class PublishCdnUrl {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCdnUrl f128130a;

        public PublishCdnUrl(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCdnUrl tRTCPublishCdnUrl) {
            this.f128130a = tRTCPublishCdnUrl;
        }

        /* renamed from: getIsInternalLine */
        public boolean m30860xbc6f0391() {
            return this.f128130a.f57091xcdd7369b;
        }

        /* renamed from: getRtmpUrl */
        public java.lang.String m30861x9879ff94() {
            java.lang.String str = this.f128130a.f57092x5aacc3ca;
            return str != null ? str : "";
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$PublishTarget */
    /* loaded from: classes3.dex */
    public static class PublishTarget {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget f128131a;

        public PublishTarget(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget) {
            this.f128131a = tRTCPublishTarget;
        }

        /* renamed from: getMode */
        public int m30862xfb82a219() {
            return this.f128131a.f57095x3339a3;
        }

        /* renamed from: getPublishCdnUrls */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishCdnUrl[] m30863xd72c798() {
            java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCdnUrl> arrayList = this.f128131a.f57093x5ef395c0;
            if (arrayList == null) {
                return null;
            }
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishCdnUrl[] publishCdnUrlArr = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishCdnUrl[arrayList.size()];
            for (int i17 = 0; i17 < this.f128131a.f57093x5ef395c0.size(); i17++) {
                publishCdnUrlArr[i17] = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishCdnUrl(this.f128131a.f57093x5ef395c0.get(i17));
            }
            return publishCdnUrlArr;
        }

        /* renamed from: getTRTCUser */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser m30864x12d1282e() {
            return new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser(this.f128131a.f57094x2258c5da);
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$RemoteStatistics */
    /* loaded from: classes3.dex */
    public static class RemoteStatistics {

        /* renamed from: a, reason: collision with root package name */
        public com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCRemoteStatistics f128132a = new com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCRemoteStatistics();

        /* renamed from: addRemoteStatistics */
        public static void m30865x2f56c0ca(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics remoteStatistics, java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics> arrayList) {
            arrayList.add(remoteStatistics);
        }

        /* renamed from: createRemoteStatistics */
        public static com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics m30866xcdccd325(java.lang.String str, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, int i67, int i68) {
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics remoteStatistics = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics();
            com.p314xaae8f345.p3109x36756d.C26789x7211d670.TRTCRemoteStatistics tRTCRemoteStatistics = remoteStatistics.f128132a;
            tRTCRemoteStatistics.f57223xce2b2e46 = str;
            tRTCRemoteStatistics.f57222xb8c992da = i17;
            tRTCRemoteStatistics.f57228x6be2dc6 = i18;
            tRTCRemoteStatistics.f57217xb7389127 = i19;
            tRTCRemoteStatistics.f57216x207cebed = i27;
            tRTCRemoteStatistics.f57212xa8c62841 = i48;
            tRTCRemoteStatistics.f57226x5299d6a6 = i28;
            tRTCRemoteStatistics.f57225x46e15cd2 = i38;
            tRTCRemoteStatistics.f57227xc941b71 = i37;
            tRTCRemoteStatistics.f57224xf1220e72 = i29;
            tRTCRemoteStatistics.f57210x9b599ab7 = i47;
            tRTCRemoteStatistics.f57213xa80e7620 = i39;
            tRTCRemoteStatistics.f57214xeab8278c = i49;
            tRTCRemoteStatistics.f57211x4166ebd7 = i57;
            tRTCRemoteStatistics.f57218xa6b12897 = i58;
            tRTCRemoteStatistics.f57219x182ac415 = i59;
            tRTCRemoteStatistics.f57215x152951b9 = i66;
            tRTCRemoteStatistics.f57221x44ba9300 = i67;
            tRTCRemoteStatistics.f57220x11ce424a = i68;
            return remoteStatistics;
        }

        /* renamed from: createRemoteStatisticsArray */
        public static java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics> m30867x432bde34() {
            return new java.util.ArrayList<>();
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$ScreenShareParams */
    /* loaded from: classes16.dex */
    public static class ScreenShareParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCScreenShareParams f128133a;

        public ScreenShareParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCScreenShareParams tRTCScreenShareParams) {
            this.f128133a = tRTCScreenShareParams;
        }

        /* renamed from: getMediaProjection */
        public java.lang.Object m30868x2685b1d() {
            return this.f128133a.f57103x1e068953;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$SpeedTestResult */
    /* loaded from: classes16.dex */
    public static class SpeedTestResult {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestResult f128136a = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestResult();

        /* renamed from: createSpeedTestResult */
        public static com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestResult m30876x4acbb25a(boolean z17, java.lang.String str, java.lang.String str2, int i17, float f17, float f18, int i18, int i19, int i27, int i28, int i29) {
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestResult speedTestResult = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestResult();
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestResult tRTCSpeedTestResult = speedTestResult.f128136a;
            tRTCSpeedTestResult.f57116x90b54003 = z17;
            tRTCSpeedTestResult.f57114xb2d4efdc = str;
            tRTCSpeedTestResult.f297234ip = str2;
            tRTCSpeedTestResult.f57115x26d0c0ff = i17;
            tRTCSpeedTestResult.f57118x14f4fddf = f17;
            tRTCSpeedTestResult.f57113x658d1ce6 = f18;
            tRTCSpeedTestResult.rtt = i18;
            tRTCSpeedTestResult.f57111xc916c5cd = i19;
            tRTCSpeedTestResult.f57110xa42b05e6 = i27;
            tRTCSpeedTestResult.f57117x22e82b67 = i28;
            tRTCSpeedTestResult.f57112x3f3a602e = i29;
            return speedTestResult;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$Statistics */
    /* loaded from: classes3.dex */
    public static class Statistics {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26789x7211d670 f128137a = new com.p314xaae8f345.p3109x36756d.C26789x7211d670();

        /* renamed from: createStatistics */
        public static com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Statistics m30877x672c233f(int i17, int i18, int i19, int i27, int i28, int i29, long j17, long j18, java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics> arrayList, java.util.ArrayList<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics> arrayList2) {
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Statistics statistics = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Statistics();
            com.p314xaae8f345.p3109x36756d.C26789x7211d670 c26789x7211d670 = statistics.f128137a;
            c26789x7211d670.f57193xabe44fc7 = i17;
            c26789x7211d670.f57200x434cb4f9 = i18;
            c26789x7211d670.f57201xcdf5845e = i19;
            c26789x7211d670.f57194x550c3ee5 = i27;
            c26789x7211d670.rtt = i28;
            c26789x7211d670.f57195x38f8258e = i29;
            c26789x7211d670.f57199x175c3 = j17;
            c26789x7211d670.f57197xd06bb348 = j18;
            c26789x7211d670.f57196x4c0d8dae = new java.util.ArrayList<>();
            statistics.f128137a.f57198x830cc5b3 = new java.util.ArrayList<>();
            if (arrayList != null) {
                java.util.Iterator<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalStatistics> it = arrayList.iterator();
                while (it.hasNext()) {
                    statistics.f128137a.f57196x4c0d8dae.add(it.next().f128126a);
                }
            }
            if (arrayList2 != null) {
                java.util.Iterator<com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.RemoteStatistics> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    statistics.f128137a.f57198x830cc5b3.add(it6.next().f128132a);
                }
            }
            return statistics;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$StreamEncoderParam */
    /* loaded from: classes3.dex */
    public static class StreamEncoderParam {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam f128138a;

        public StreamEncoderParam(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam) {
            this.f128138a = tRTCStreamEncoderParam;
        }

        /* renamed from: getAudioEncodedChannelNum */
        public int m30878xf08e5cf1() {
            return this.f128138a.f57119x86bfe5fb;
        }

        /* renamed from: getAudioEncodedCodecType */
        public int m30879x2b8ec942() {
            return this.f128138a.f57120x1fe2f6f8;
        }

        /* renamed from: getAudioEncodedKbps */
        public int m30880x6c05b588() {
            return this.f128138a.f57121xc42d4e12;
        }

        /* renamed from: getAudioEncodedSampleRate */
        public int m30881x6c2bbb18() {
            return this.f128138a.f57122x25d4422;
        }

        /* renamed from: getVideoEncodedCodecType */
        public int m30882x463d57e7() {
            return this.f128138a.f57123x3a91859d;
        }

        /* renamed from: getVideoEncodedFPS */
        public int m30883x10686da0() {
            return this.f128138a.f57124x2c069bd6;
        }

        /* renamed from: getVideoEncodedGOP */
        public int m30884x1068713f() {
            return this.f128138a.f57125x2c069f75;
        }

        /* renamed from: getVideoEncodedHeight */
        public int m30885x6d0a5d10() {
            return this.f128138a.f57126x59adfb1a;
        }

        /* renamed from: getVideoEncodedKbps */
        public int m30886xfca7d3c3() {
            return this.f128138a.f57127x54cf6c4d;
        }

        /* renamed from: getVideoEncodedWidth */
        public int m30887x98fec0bd() {
            return this.f128138a.f57128x45ca3973;
        }

        /* renamed from: getVideoSeiParams */
        public java.lang.String m30888xd88c7778() {
            return android.text.TextUtils.isEmpty(this.f128138a.f57129xe9f4aa82) ? "" : this.f128138a.f57129xe9f4aa82;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$StreamMixingConfig */
    /* loaded from: classes3.dex */
    public static class StreamMixingConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig f128139a;

        public StreamMixingConfig(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
            this.f128139a = tRTCStreamMixingConfig;
        }

        /* renamed from: getAudioMixUserList */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser[] m30889x4bdf345() {
            java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCUser> arrayList = this.f128139a.f57130x5ce58bcf;
            if (arrayList == null) {
                return null;
            }
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser[] tRTCUserArr = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser[arrayList.size()];
            for (int i17 = 0; i17 < this.f128139a.f57130x5ce58bcf.size(); i17++) {
                tRTCUserArr[i17] = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser(this.f128139a.f57130x5ce58bcf.get(i17));
            }
            return tRTCUserArr;
        }

        /* renamed from: getBackgroundColor */
        public int m30890x3119c89f() {
            return this.f128139a.f57131x4cb7f6d5;
        }

        /* renamed from: getBackgroundImage */
        public java.lang.String m30891x316d4297() {
            java.lang.String str = this.f128139a.f57132x4d0b70cd;
            return str != null ? str : "";
        }

        /* renamed from: getVideoLayoutList */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoLayout[] m30892x42161f8d() {
            java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoLayout> arrayList = this.f128139a.f57133x5db44dc3;
            if (arrayList == null) {
                return null;
            }
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoLayout[] videoLayoutArr = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoLayout[arrayList.size()];
            for (int i17 = 0; i17 < this.f128139a.f57133x5db44dc3.size(); i17++) {
                videoLayoutArr[i17] = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoLayout(this.f128139a.f57133x5db44dc3.get(i17));
            }
            return videoLayoutArr;
        }

        /* renamed from: getWatermarkList */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Watermark[] m30893x7458776c() {
            java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCWatermark> arrayList = this.f128139a.f57134xb6f8bb22;
            if (arrayList == null) {
                return null;
            }
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Watermark[] watermarkArr = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Watermark[arrayList.size()];
            for (int i17 = 0; i17 < this.f128139a.f57134xb6f8bb22.size(); i17++) {
                watermarkArr[i17] = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Watermark(this.f128139a.f57134xb6f8bb22.get(i17));
            }
            return watermarkArr;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$SwitchRoomConfig */
    /* loaded from: classes16.dex */
    public static class SwitchRoomConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSwitchRoomConfig f128140a;

        public SwitchRoomConfig(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
            this.f128140a = tRTCSwitchRoomConfig;
        }

        /* renamed from: getPrivateMapKey */
        public java.lang.String m30894xd7319310() {
            java.lang.String str = this.f128140a.f57135x19d1d6c6;
            return str != null ? str : "";
        }

        /* renamed from: getRoomId */
        public int m30895x2defe24c() {
            return this.f128140a.f57136xc8d8bf56;
        }

        /* renamed from: getStringRoomId */
        public java.lang.String m30896x63c78d3d() {
            java.lang.String str = this.f128140a.f57137xcd8a40e7;
            return str != null ? str : "";
        }

        /* renamed from: getUserSig */
        public java.lang.String m30897x3507fcd0() {
            java.lang.String str = this.f128140a.f57138xf73ac106;
            return str != null ? str : "";
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$TRTCUser */
    /* loaded from: classes3.dex */
    public static class TRTCUser {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCUser f128141a;

        public TRTCUser(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCUser tRTCUser) {
            this.f128141a = tRTCUser;
        }

        /* renamed from: getIntRoomId */
        public int m30898xfcd0c56f() {
            return this.f128141a.f57159xfd635425;
        }

        /* renamed from: getStrRoomId */
        public java.lang.String m30899xccf7b231() {
            java.lang.String str = this.f128141a.f57160xcd8a40e7;
            return str != null ? str : "";
        }

        /* renamed from: getUserId */
        public java.lang.String m30900x3342513c() {
            java.lang.String str = this.f128141a.f57161xce2b2e46;
            return str != null ? str : "";
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$TranscodingConfig */
    /* loaded from: classes3.dex */
    public static class TranscodingConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig f128142a;

        public TranscodingConfig(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.f128142a = tRTCTranscodingConfig;
        }

        /* renamed from: getAppId */
        public int m30901x74292566() {
            return this.f128142a.f57142x58b7f1c;
        }

        /* renamed from: getAudioBitrate */
        public int m30902xfc4c2d2d() {
            return this.f128142a.f57143x9b599ab7;
        }

        /* renamed from: getAudioChannels */
        public int m30903x9f95aa10() {
            return this.f128142a.f57144xe235edc6;
        }

        /* renamed from: getAudioSampleRate */
        public int m30904x8c7047ea() {
            return this.f128142a.f57146xa80e7620;
        }

        /* renamed from: getBackgroundColor */
        public int m30905x3119c89f() {
            return this.f128142a.f57147x4cb7f6d5;
        }

        /* renamed from: getBackgroundImage */
        public java.lang.String m30906x316d4297() {
            return android.text.TextUtils.isEmpty(this.f128142a.f57148x4d0b70cd) ? "" : this.f128142a.f57148x4d0b70cd;
        }

        /* renamed from: getBizId */
        public int m30907x743433d8() {
            return this.f128142a.f57149x5968d8e;
        }

        /* renamed from: getMixUsers */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.MixUser[] m30908x3ad1ce82() {
            java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser> arrayList = this.f128142a.f57150xbef7910c;
            if (arrayList == null) {
                return null;
            }
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.MixUser[] mixUserArr = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.MixUser[arrayList.size()];
            byte b17 = 0;
            for (int i17 = 0; i17 < this.f128142a.f57150xbef7910c.size(); i17++) {
                mixUserArr[i17] = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.MixUser(this.f128142a.f57150xbef7910c.get(i17), b17);
            }
            return mixUserArr;
        }

        /* renamed from: getMode */
        public int m30909xfb82a219() {
            return this.f128142a.f57151x3339a3;
        }

        /* renamed from: getStreamId */
        public java.lang.String m30910xe699b631() {
            return android.text.TextUtils.isEmpty(this.f128142a.f57152x6abf78bb) ? "" : this.f128142a.f57152x6abf78bb;
        }

        /* renamed from: getVideoBitrate */
        public int m30911x5214a0e8() {
            return this.f128142a.f57153xf1220e72;
        }

        /* renamed from: getVideoFramerate */
        public int m30912x22052a88() {
            return this.f128142a.f57154x336d5d92;
        }

        /* renamed from: getVideoGOP */
        public int m30913xc07aa783() {
            return this.f128142a.f57155x44a06a0d;
        }

        /* renamed from: getVideoHeight */
        public int m30914x463504c() {
            return this.f128142a.f57156x2a8d0982;
        }

        /* renamed from: getVideoSeiParams */
        public java.lang.String m30915xd88c7778() {
            return android.text.TextUtils.isEmpty(this.f128142a.f57157xe9f4aa82) ? "" : this.f128142a.f57157xe9f4aa82;
        }

        /* renamed from: getVideoWidth */
        public int m30916x8d5c7601() {
            return this.f128142a.f57158x9f1bbe0b;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$VideoEncParams */
    /* loaded from: classes3.dex */
    public static class VideoEncParams {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam f128143a;

        public VideoEncParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam) {
            this.f128143a = tRTCVideoEncParam;
        }

        /* renamed from: getMinVideoBitrate */
        public int m30917x41ffefae() {
            return this.f128143a.f57163x5d9e1de4;
        }

        /* renamed from: getVideoBitrate */
        public int m30918x5214a0e8() {
            return this.f128143a.f57164xf1220e72;
        }

        /* renamed from: getVideoFps */
        public int m30919xc07aa7e4() {
            return this.f128143a.f57165x44a06a6e;
        }

        /* renamed from: getVideoResolution */
        public int m30920xce5e1d51() {
            return this.f128143a.f57166xe9fc4b87;
        }

        /* renamed from: getVideoResolutionMode */
        public int m30921xca1ba94() {
            return this.f128143a.f57167xb471ddca;
        }

        /* renamed from: isEnableAdjustRes */
        public boolean m30922x219a99c4() {
            return this.f128143a.f57162xf2d5284e;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$VideoLayout */
    /* loaded from: classes3.dex */
    public static class VideoLayout {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoLayout f128144a;

        public VideoLayout(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoLayout tRTCVideoLayout) {
            this.f128144a = tRTCVideoLayout;
        }

        /* renamed from: getBackgroundColor */
        public int m30923x3119c89f() {
            return this.f128144a.f57177x4cb7f6d5;
        }

        /* renamed from: getFillMode */
        public int m30924x5062673c() {
            return this.f128144a.f57178xd48829c6;
        }

        /* renamed from: getHeight */
        public int m30925x1c4fb41d() {
            return this.f128144a.f57181xb7389127;
        }

        /* renamed from: getPlaceHolderImage */
        public java.lang.String m30926xad99b2fe() {
            java.lang.String str = this.f128144a.f57182x5c14b88;
            return str != null ? str : "";
        }

        /* renamed from: getTRTCUser */
        public com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser m30927x12d1282e() {
            return new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TRTCUser(this.f128144a.f57180x5f3219d2);
        }

        /* renamed from: getVideoStreamType */
        public int m30928xe686377f() {
            return this.f128144a.f57179x8075dfa1;
        }

        /* renamed from: getWidth */
        public int m30929x755bd410() {
            return this.f128144a.f57183x6be2dc6;
        }

        /* renamed from: getX */
        public int m30930x305bc2() {
            return this.f128144a.f297235x;
        }

        /* renamed from: getY */
        public int m30931x305bc3() {
            return this.f128144a.f297236y;
        }

        /* renamed from: getZOrder */
        public int m30932x39d4f5ea() {
            return this.f128144a.f57184xd4bdd2f4;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$Watermark */
    /* loaded from: classes16.dex */
    public static class Watermark {

        /* renamed from: a, reason: collision with root package name */
        private com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCWatermark f128145a;

        public Watermark(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCWatermark tRTCWatermark) {
            this.f128145a = tRTCWatermark;
        }

        /* renamed from: getHeight */
        public int m30933x1c4fb41d() {
            return this.f128145a.f57189xb7389127;
        }

        /* renamed from: getWatermarkUrl */
        public java.lang.String m30934x3c0ece1() {
            java.lang.String str = this.f128145a.f57190xa2ce5a6b;
            return str != null ? str : "";
        }

        /* renamed from: getWidth */
        public int m30935x755bd410() {
            return this.f128145a.f57191x6be2dc6;
        }

        /* renamed from: getX */
        public int m30936x305bc2() {
            return this.f128145a.f297237x;
        }

        /* renamed from: getY */
        public int m30937x305bc3() {
            return this.f128145a.f297238y;
        }

        /* renamed from: getZOrder */
        public int m30938x39d4f5ea() {
            return this.f128145a.f57192xd4bdd2f4;
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$a */
    /* loaded from: classes16.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f128146a;

        /* renamed from: b, reason: collision with root package name */
        public int f128147b;

        /* renamed from: c, reason: collision with root package name */
        public int f128148c;

        /* renamed from: d, reason: collision with root package name */
        public T f128149d;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    public C3808x20f90ddd(boolean z17) {
        this(0L, z17);
    }

    /* renamed from: CopyOnReadListeners */
    private java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> m30492x34523d55() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList(this.f14874x3ddc887f);
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c = this.f14872x753a6c41;
        if (abstractC26788x7049bd9c != null && !copyOnWriteArrayList.contains(abstractC26788x7049bd9c)) {
            copyOnWriteArrayList.add(abstractC26788x7049bd9c);
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: convertPixelFrameRotationToTRTCVideoRotation */
    private static int m30494xe1e8e239(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        int i17 = com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AnonymousClass1.f128120a[kVar.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    return 0;
                }
            }
        }
        return i18;
    }

    /* renamed from: covertTRTCVideoRotationToPixelFrameRotation */
    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m30495x9719524f(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90;
    }

    /* renamed from: createExtraInfoBundle */
    public static android.os.Bundle m30496x5ca1e264(java.lang.String str, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(str, i17);
        return bundle;
    }

    /* renamed from: extraToBundle */
    private android.os.Bundle m30497xa0350b0d(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                    java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        strArr[i17] = jSONArray.getString(i17);
                    }
                    bundle.putStringArray(next, strArr);
                } else if (obj instanceof java.lang.Integer) {
                    bundle.putInt(next, ((java.lang.Integer) obj).intValue());
                } else if (obj instanceof java.lang.String) {
                    bundle.putString(next, (java.lang.String) obj);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return bundle;
    }

    /* renamed from: getGLContextNativeHandle */
    public static long m30498xbb3f7db3(java.lang.Object obj) {
        return com.p314xaae8f345.p373xbe494963.p396x36756d.C3806xd67ce128.m30426xbb3f7db3(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideFloatingWindow */
    public void m30499xab428178() {
        android.view.WindowManager windowManager;
        if (this.f14869x5ed5e7ff.isEmpty()) {
            return;
        }
        java.util.Iterator<android.view.View> it = this.f14869x5ed5e7ff.iterator();
        while (it.hasNext()) {
            android.view.View next = it.next();
            if (next != null && (windowManager = (android.view.WindowManager) next.getContext().getSystemService("window")) != null) {
                windowManager.removeViewImmediate(next);
            }
        }
        this.f14869x5ed5e7ff.clear();
    }

    /* renamed from: init */
    public static void m30500x316510(int i17) {
        synchronized (f14865x987bc2fa) {
            if (!f14866x59145afc) {
                f14866x59145afc = true;
                m30534xb2c78eca(i17);
            }
        }
    }

    /* renamed from: isCustomPreprocessSupportedBufferType */
    private static boolean m30501x218b0161(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 3;
    }

    /* renamed from: isCustomPreprocessSupportedFormatType */
    private static boolean m30502xc338b198(int i17) {
        return i17 == 1 || i17 == 4 || i17 == 5 || i17 == 2;
    }

    /* renamed from: isCustomRenderSupportedBufferType */
    private static boolean m30503x6c85d477(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 3;
    }

    /* renamed from: isCustomRenderSupportedFormatType */
    private static boolean m30504xe3384ae(int i17) {
        return i17 == 1 || i17 == 4 || i17 == 5 || i17 == 2;
    }

    /* renamed from: isInUIThread */
    public static boolean m30505x91a2daad() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    /* renamed from: lambda$enterRoom$0 */
    public static /* synthetic */ void m30506x9fac4e42(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd c3808x20f90ddd) {
        c3808x20f90ddd.m30680xcb050cb4(-3316);
        c3808x20f90ddd.m30681xaf8aa769(-3316, "enter room param null");
    }

    /* renamed from: lambda$onSnapshotComplete$2 */
    public static /* synthetic */ void m30507xd745ed67(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        if (tRTCSnapshotListener != null) {
            tRTCSnapshotListener.m105622x7ddd1b1c(bitmap);
        }
    }

    /* renamed from: nativeCallExperimentalAPI */
    private static native java.lang.String m30509x63f4483d(long j17, java.lang.String str);

    /* renamed from: nativeConnectOtherRoom */
    private static native void m30510x2d130078(long j17, java.lang.String str);

    /* renamed from: nativeCreateAudioEffectManager */
    private static native long m30511x3df02df9(long j17);

    /* renamed from: nativeCreateBeautyManager */
    private static native long m30512x3653165e(long j17);

    /* renamed from: nativeCreateDeviceManager */
    private static native long m30513xe0879f44(long j17);

    /* renamed from: nativeCreatePipeline */
    private static native long m30514xeec39bb5(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd c3808x20f90ddd, boolean z17);

    /* renamed from: nativeCreateSubCloud */
    private static native long m30515x876f08e8(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd c3808x20f90ddd, long j17);

    /* renamed from: nativeDestroyPipeline */
    private static native void m30516x3c76ba5(long j17);

    /* renamed from: nativeDisconnectOtherRoom */
    private static native void m30517xd0d5dd38(long j17);

    /* renamed from: nativeEnable3DSpatialAudioEffect */
    private static native void m30518xda68252e(long j17, boolean z17);

    /* renamed from: nativeEnableAudioFrameNotification */
    private static native void m30519x403c3edc(long j17, boolean z17);

    /* renamed from: nativeEnableAudioVolumeEvaluation */
    private static native void m30520x5eaeb192(long j17, boolean z17, int i17, boolean z18, boolean z19, boolean z27);

    /* renamed from: nativeEnableCustomAudioCapture */
    private static native void m30521xae022abb(long j17, boolean z17);

    /* renamed from: nativeEnableCustomAudioRendering */
    private static native void m30522xffae40c1(long j17, boolean z17);

    /* renamed from: nativeEnableCustomVideoCapture */
    private static native void m30523x3ca9e76(long j17, int i17, boolean z17);

    /* renamed from: nativeEnableEncSmallVideoStream */
    private static native void m30524xab64d674(long j17, boolean z17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoEncParams videoEncParams);

    /* renamed from: nativeEnableMixExternalAudioFrame */
    private static native void m30525xece56084(long j17, boolean z17, boolean z18);

    /* renamed from: nativeEnablePayloadPrivateEncryption */
    private static native int m30526x8e1fc012(long j17, boolean z17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PayloadPrivateEncryptionConfig payloadPrivateEncryptionConfig);

    /* renamed from: nativeEnableVideoCustomPreprocess */
    private static native void m30527x68975afe(long j17, boolean z17, int i17, int i18, int i19);

    /* renamed from: nativeEnableVideoCustomRender */
    private static native void m30528x2bcf728(long j17, boolean z17, java.lang.String str, int i17, int i18, int i19);

    /* renamed from: nativeEnterRoom */
    private static native void m30529xb33dc97c(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.EnterRoomParams enterRoomParams, int i17);

    /* renamed from: nativeExitRoom */
    private static native void m30530x996b9c50(long j17);

    /* renamed from: nativeGetAudioCaptureVolume */
    private static native int m30531x45ffb3e9(long j17);

    /* renamed from: nativeGetAudioPlayoutVolume */
    private static native int m30532x9ad8453d(long j17);

    /* renamed from: nativeGetCustomAudioRenderingFrame */
    private static native void m30533xa1f28987(long j17, byte[] bArr, int i17, int i18);

    /* renamed from: nativeGlobalInit */
    private static native void m30534xb2c78eca(int i17);

    /* renamed from: nativeGlobalUninit */
    private static native void m30535x33992263();

    /* renamed from: nativeMixExternalAudioFrame */
    private static native int m30536x21d51907(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioFrame audioFrame);

    /* renamed from: nativeMuteAllRemoteAudio */
    private static native void m30537x32ca51bf(long j17, boolean z17);

    /* renamed from: nativeMuteAllRemoteVideoStreams */
    private static native void m30538xfefeb5ef(long j17, boolean z17);

    /* renamed from: nativeMuteLocalAudio */
    private static native void m30539xf8de821b(long j17, boolean z17);

    /* renamed from: nativeMuteLocalVideo */
    private static native void m30540xfa00fac0(long j17, int i17, boolean z17);

    /* renamed from: nativeMuteRemoteAudio */
    private static native void m30541x70378240(long j17, java.lang.String str, boolean z17);

    /* renamed from: nativeMuteRemoteVideoStream */
    private static native void m30542x6a3b6c5(long j17, java.lang.String str, int i17, boolean z17);

    /* renamed from: nativePauseScreenCapture */
    private static native void m30543xa0354b5b(long j17, int i17);

    /* renamed from: nativeResumeScreenCapture */
    private static native void m30544x9f62076(long j17, int i17);

    /* renamed from: nativeSendCustomAudioData */
    private static native void m30545xbcffa9f0(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioFrame audioFrame);

    /* renamed from: nativeSendCustomCmdMsg */
    private static native boolean m30546x256d6897(long j17, int i17, byte[] bArr, boolean z17, boolean z18);

    /* renamed from: nativeSendCustomVideoData */
    private static native void m30547x13b4815(long j17, int i17, int i18, int i19, java.lang.Object obj, int i27, int i28, int i29, int i37, long j18, byte[] bArr, java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeSendSEIMsg */
    private static native boolean m30548x3b34c9(long j17, byte[] bArr, int i17);

    /* renamed from: nativeSet3DSpatialReceivingRange */
    private static native void m30549x64895145(long j17, java.lang.String str, int i17);

    /* renamed from: nativeSetAudioCaptureVolume */
    private static native void m30550xdd2b35f5(long j17, int i17);

    /* renamed from: nativeSetAudioPlayoutVolume */
    private static native void m30551x3203c749(long j17, int i17);

    /* renamed from: nativeSetAudioQuality */
    private static native void m30552x4fffc4b4(long j17, int i17);

    /* renamed from: nativeSetCapturedAudioFrameCallbackFormat */
    private static native int m30553x4234fc9c(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeSetConsoleEnabled */
    private static native void m30554xf8915395(boolean z17);

    /* renamed from: nativeSetDefaultStreamRecvMode */
    private static native void m30555x68aed8df(long j17, boolean z17, boolean z18);

    /* renamed from: nativeSetGSensorMode */
    private static native void m30556x305be79(long j17, int i17, int i18);

    /* renamed from: nativeSetGravitySensorAdaptiveMode */
    private static native void m30557xd2009276(long j17, int i17);

    /* renamed from: nativeSetListenerHandler */
    private static native void m30558x280f77ab(long j17, android.os.Handler handler);

    /* renamed from: nativeSetLocalProcessedAudioFrameCallbackFormat */
    private static native int m30559x4f3bb3a1(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeSetLocalViewFillMode */
    private static native void m30560x4c01e50b(long j17, int i17);

    /* renamed from: nativeSetLocalViewMirror */
    private static native void m30561xc2c73444(long j17, int i17);

    /* renamed from: nativeSetLocalViewRotation */
    private static native void m30562x7512cac3(long j17, int i17);

    /* renamed from: nativeSetLogCompressEnabled */
    private static native void m30563xf2b751c6(boolean z17);

    /* renamed from: nativeSetLogLevel */
    private static native void m30564xc712448b(int i17);

    /* renamed from: nativeSetLogPath */
    private static native void m30565xab96fe3e(java.lang.String str);

    /* renamed from: nativeSetMixExternalAudioVolume */
    private static native void m30566x4e194474(long j17, int i17, int i18);

    /* renamed from: nativeSetMixTranscodingConfig */
    private static native void m30567x6902d863(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TranscodingConfig transcodingConfig);

    /* renamed from: nativeSetMixedPlayAudioFrameCallbackFormat */
    private static native int m30568x60b38917(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeSetNetworkQosParam */
    private static native void m30569x3db1e77b(long j17, int i17, int i18);

    /* renamed from: nativeSetPerspectiveCorrectionPoints */
    private static native void m30570xfe85c872(long j17, java.lang.String str, float[] fArr, float[] fArr2);

    /* renamed from: nativeSetPriorRemoteVideoStreamType */
    private static native void m30571xef3d3d10(long j17, int i17);

    /* renamed from: nativeSetRemoteAudioParallelParams */
    private static native void m30572x76467b32(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioParallelParams audioParallelParams);

    /* renamed from: nativeSetRemoteAudioVolume */
    private static native void m30573x7021c4df(long j17, java.lang.String str, int i17);

    /* renamed from: nativeSetRemoteVideoStreamType */
    private static native void m30574xd35b484(long j17, java.lang.String str, int i17);

    /* renamed from: nativeSetRemoteViewFillMode */
    private static native void m30575x8fce0f1c(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeSetRemoteViewMirror */
    private static native void m30576x9108ae95(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeSetRemoteViewRotation */
    private static native void m30577xb8def4d4(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeSetVideoEncoderMirror */
    private static native void m30578x3ac6bb6b(long j17, boolean z17);

    /* renamed from: nativeSetVideoEncoderParams */
    private static native void m30579x3f744932(long j17, int i17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoEncParams videoEncParams);

    /* renamed from: nativeSetVideoEncoderRotation */
    private static native void m30580xeb4d242a(long j17, int i17);

    /* renamed from: nativeSetVideoMuteImage */
    private static native void m30581xe2e82a32(long j17, android.graphics.Bitmap bitmap, int i17);

    /* renamed from: nativeSetWatermark */
    private static native void m30582xa6e3d3d9(long j17, android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19);

    /* renamed from: nativeShowDashboardManager */
    private static native void m30583x6ecd864d(long j17, int i17);

    /* renamed from: nativeSnapshotVideo */
    private static native void m30584xea714640(long j17, java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener);

    /* renamed from: nativeStartAudioRecording */
    private static native int m30585xce02ea26(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioRecordingParams audioRecordingParams);

    /* renamed from: nativeStartLocalAudio */
    private static native void m30586xadd41c16(long j17);

    /* renamed from: nativeStartLocalAudioWithQuality */
    private static native void m30587xf5649f63(long j17, int i17);

    /* renamed from: nativeStartLocalPreview */
    private static native void m30588x9db05408(long j17, boolean z17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: nativeStartLocalRecording */
    private static native void m30589x5fc4de31(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalRecordingParams localRecordingParams);

    /* renamed from: nativeStartPublishCDNStream */
    private static native void m30590xf051ae69(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishCDNParams publishCDNParams);

    /* renamed from: nativeStartPublishMediaStream */
    private static native void m30591xfb2015e0(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishTarget publishTarget, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamEncoderParam streamEncoderParam, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamMixingConfig streamMixingConfig);

    /* renamed from: nativeStartPublishing */
    private static native void m30592xd434115e(long j17, java.lang.String str, int i17);

    /* renamed from: nativeStartRemoteView */
    private static native void m30593x9fd778f6(long j17, java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: nativeStartRemoteViewWithoutStreamType */
    private static native void m30594x6d88276c(long j17, java.lang.String str, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: nativeStartScreenCapture */
    private static native void m30595x2d447c6f(long j17, int i17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoEncParams videoEncParams, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.ScreenShareParams screenShareParams);

    /* renamed from: nativeStartSpeedTest */
    private static native void m30596x56ee0f2e(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestParams speedTestParams);

    /* renamed from: nativeStartSystemAudioLoopback */
    private static native void m30597x5c609907(long j17);

    /* renamed from: nativeStopAllRemoteView */
    private static native void m30598x62af9053(long j17);

    /* renamed from: nativeStopAudioRecording */
    private static native void m30599xe1066fd4(long j17);

    /* renamed from: nativeStopLocalAudio */
    private static native void m30600x94e9a8c4(long j17);

    /* renamed from: nativeStopLocalPreview */
    private static native void m30601x15956d36(long j17);

    /* renamed from: nativeStopLocalRecording */
    private static native void m30602x72c863df(long j17);

    /* renamed from: nativeStopPublishCDNStream */
    private static native void m30603x508a8097(long j17);

    /* renamed from: nativeStopPublishMediaStream */
    private static native void m30604x306d148e(long j17, java.lang.String str);

    /* renamed from: nativeStopPublishing */
    private static native void m30605xbb499e0c(long j17);

    /* renamed from: nativeStopRemoteView */
    private static native void m30606x86ed05a4(long j17, java.lang.String str, int i17);

    /* renamed from: nativeStopRemoteViewWithoutStreamType */
    private static native void m30607x55e3cc7e(long j17, java.lang.String str);

    /* renamed from: nativeStopScreenCapture */
    private static native void m30608xb2028901(long j17, int i17);

    /* renamed from: nativeStopSpeedTest */
    private static native void m30609xc9bd34c0(long j17);

    /* renamed from: nativeStopSystemAudioLoopback */
    private static native void m30610xd0b37019(long j17);

    /* renamed from: nativeSwitchRole */
    private static native void m30611xd1482d41(long j17, int i17);

    /* renamed from: nativeSwitchRoleWithPrivateMapKey */
    private static native void m30612x2707645f(long j17, int i17, java.lang.String str);

    /* renamed from: nativeSwitchRoom */
    private static native void m30613xd1482da6(long j17, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SwitchRoomConfig switchRoomConfig);

    /* renamed from: nativeUpdateLocalView */
    private static native void m30614xf086f0d0(long j17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: nativeUpdateOtherRoomForwardMode */
    private static native void m30615x3722c8dd(long j17, java.lang.String str);

    /* renamed from: nativeUpdatePublishMediaStream */
    private static native void m30616xe790dfd5(long j17, java.lang.String str, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishTarget publishTarget, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamEncoderParam streamEncoderParam, com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamMixingConfig streamMixingConfig);

    /* renamed from: nativeUpdateRemote3DSpatialPosition */
    private static native void m30617x2c286c36(long j17, java.lang.String str, int[] iArr);

    /* renamed from: nativeUpdateRemoteView */
    private static native void m30618x113807eb(long j17, java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: nativeUpdateSelf3DSpatialPosition */
    private static native void m30619xdb8949f0(long j17, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);

    /* renamed from: runOnListenerThread */
    private void m30620x51dc9848(java.lang.Runnable runnable) {
        android.os.Handler handler = this.f14873x12467c9;
        if (android.os.Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: setConsoleEnabled */
    public static void m30621x230a12ec(boolean z17) {
        m30554xf8915395(z17);
    }

    /* renamed from: setLogCompressEnabled */
    public static void m30622xa9828d9d(boolean z17) {
        m30563xf2b751c6(z17);
    }

    /* renamed from: setLogDirPath */
    public static void m30623x766d470(java.lang.String str) {
        m30565xab96fe3e(str);
    }

    /* renamed from: setLogLevel */
    public static void m30624xed871122(int i17) {
        m30564xc712448b(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showFloatingWindow */
    public void m30625xcf8f5bf3(android.view.View view) {
        if (view == null) {
            return;
        }
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 23 && !android.provider.Settings.canDrawOverlays(view.getContext())) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "can't show floating window for no drawing overlay permission");
            return;
        }
        if (this.f14869x5ed5e7ff.contains(view)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "the window has been added");
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) view.getContext().getSystemService("window");
        if (windowManager == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "get windowManager error");
            return;
        }
        this.f14869x5ed5e7ff.add(view);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 26 ? 2038 : com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() > 24 ? 2002 : com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111);
        layoutParams.flags = 8 | 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    /* renamed from: uninit */
    public static void m30626xcde67f29() {
        synchronized (f14865x987bc2fa) {
            if (f14866x59145afc) {
                f14866x59145afc = false;
                m30535x33992263();
            }
        }
    }

    /* renamed from: addListener */
    public void m30627x162a7075(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c) {
        if (abstractC26788x7049bd9c == null || this.f14874x3ddc887f.contains(abstractC26788x7049bd9c)) {
            return;
        }
        this.f14874x3ddc887f.add(abstractC26788x7049bd9c);
    }

    /* renamed from: callExperimentalAPI */
    public java.lang.String m30628xd33a8dd4(java.lang.String str) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                return m30509x63f4483d(j17, str);
            }
            this.f14870xe88073f9.unlock();
            return null;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: connectOtherRoom */
    public void m30629xd697a41(java.lang.String str) {
        long j17 = this.f14877x6e584ec1;
        if (j17 != 0) {
            m30510x2d130078(j17, str);
        }
    }

    /* renamed from: createAudioEffectManager */
    public long m30630x2a78cec2() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30511x3df02df9(j17) : 0L;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: createBeautyManager */
    public long m30631xa5995bf5() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30512x3653165e(j17) : 0L;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: createByteBuffer */
    public java.nio.ByteBuffer m30632x6d636d84(int i17) {
        return java.nio.ByteBuffer.allocateDirect(i17);
    }

    /* renamed from: createDeviceManager */
    public long m30633x4fcde4db() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30513xe0879f44(j17) : 0L;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: createTRTCVideoFrame */
    public com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame m30634x6ef96fb(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, long j17, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame();
        tRTCVideoFrame.f57172xa0fe3a1d = i17;
        tRTCVideoFrame.f57169x719f779a = i18;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTexture tRTCTexture = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTexture();
        tRTCVideoFrame.f57174xab7dd51b = tRTCTexture;
        tRTCTexture.f57141xc35d0396 = i19;
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            tRTCTexture.f57139x5f488f24 = (javax.microedition.khronos.egl.EGLContext) obj;
        } else if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 17 && (obj instanceof android.opengl.EGLContext)) {
            tRTCVideoFrame.f57174xab7dd51b.f57140x5f488f28 = (android.opengl.EGLContext) obj;
        }
        tRTCVideoFrame.f57170x2eefaa = bArr;
        tRTCVideoFrame.f57168xaddb9440 = byteBuffer;
        tRTCVideoFrame.f57176x6be2dc6 = i27;
        tRTCVideoFrame.f57171xb7389127 = i28;
        tRTCVideoFrame.f57175x3492916 = j17;
        tRTCVideoFrame.f57173xfd990f7e = m30494xe1e8e239(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i29));
        return tRTCVideoFrame;
    }

    /* renamed from: destroy */
    public void m30635x5cd39ffa() {
        this.f14871x17237092.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30516x3c76ba5(j17);
                this.f14877x6e584ec1 = 0L;
            }
            this.f14874x3ddc887f.clear();
        } finally {
            this.f14871x17237092.unlock();
        }
    }

    /* renamed from: disconnectOtherRoom */
    public void m30636x401c22cf() {
        long j17 = this.f14877x6e584ec1;
        if (j17 != 0) {
            m30517xd0d5dd38(j17);
        }
    }

    /* renamed from: enable3DSpatialAudioEffect */
    public void m30637xc74bb7b7(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30518xda68252e(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enableAudioVolumeEvaluation */
    public void m30638xe3d7029(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCAudioVolumeEvaluateParams != null) {
                m30520x5eaeb192(j17, z17, tRTCAudioVolumeEvaluateParams.f57057x21ffe4c5, tRTCAudioVolumeEvaluateParams.f57056xed715c8f, tRTCAudioVolumeEvaluateParams.f57054xf6353f0c, tRTCAudioVolumeEvaluateParams.f57055x3bfe47b5);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enableCustomAudioCapture */
    public void m30639x9a8acb84(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30521xae022abb(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enableCustomAudioRendering */
    public void m30640xec91d34a(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30522xffae40c1(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enableCustomVideoCapture */
    public void m30641xf0533f3f(int i17, boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30523x3ca9e76(j17, i17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enableEncSmallVideoStream */
    public int m30642x4ff04ecb(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30524xab64d674(j17, z17, tRTCVideoEncParam == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoEncParams(tRTCVideoEncParam));
            }
            this.f14870xe88073f9.unlock();
            return 0;
        } catch (java.lang.Throwable th6) {
            this.f14870xe88073f9.unlock();
            throw th6;
        }
    }

    /* renamed from: enableMixExternalAudioFrame */
    public void m30643x9c741f1b(boolean z17, boolean z18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30525xece56084(j17, z17, z18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enablePayloadPrivateEncryption */
    public int m30644x6274e61b(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        int i17;
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                i17 = m30526x8e1fc012(j17, z17, tRTCPayloadPrivateEncryptionConfig == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PayloadPrivateEncryptionConfig(tRTCPayloadPrivateEncryptionConfig));
            } else {
                i17 = -1;
            }
            return i17;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: enterRoom */
    public void m30645xccdacfd3(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams, int i17) {
        if (tRTCParams == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "enterRoom param is null");
            m30620x51dc9848(com.p314xaae8f345.p373xbe494963.p396x36756d.a.a(this));
            return;
        }
        this.f14870xe88073f9.lock();
        try {
            this.f14875x1da8ee4 = tRTCParams.f57083xce2b2e46;
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30529xb33dc97c(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.EnterRoomParams(tRTCParams), i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: exitRoom */
    public void m30646x8178ef19() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30530x996b9c50(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: getAudioCaptureVolume */
    public int m30647xfccaefc0() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30531x45ffb3e9(j17) : 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: getAudioPlayoutVolume */
    public int m30648x51a38114() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30532x9ad8453d(j17) : 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: getCustomAudioRenderingFrame */
    public void m30649xe43b9dd0(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30533xa1f28987(j17, tRTCAudioFrame.f57041x2eefaa, tRTCAudioFrame.f57043x88751aa, tRTCAudioFrame.f57040x2c0b7d03);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: getFrameBufferType */
    public int m30650x9386aab1(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57169x719f779a;
    }

    /* renamed from: getFrameByteArray */
    public byte[] m30651xcf81143a(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57170x2eefaa;
    }

    /* renamed from: getFrameByteBuffer */
    public java.nio.ByteBuffer m30652x227b2e7f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57168xaddb9440;
    }

    /* renamed from: getFrameEglContext */
    public java.lang.Object m30653x9958395c(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 17 ? tRTCVideoFrame.f57174xab7dd51b.f57140x5f488f28 : tRTCVideoFrame.f57174xab7dd51b.f57139x5f488f24;
    }

    /* renamed from: getFrameHeight */
    public int m30654xbdeae7be(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57171xb7389127;
    }

    /* renamed from: getFramePixelFormat */
    public int m30655xbbfd69e6(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57172xa0fe3a1d;
    }

    /* renamed from: getFramePts */
    public long m30656x19cdbbb8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57175x3492916;
    }

    /* renamed from: getFrameRotation */
    public int m30657x21101c55(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return m30495x9719524f(tRTCVideoFrame.f57173xfd990f7e).f14773xbee9dd04;
    }

    /* renamed from: getFrameTextureId */
    public int m30658xec7919f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57174xab7dd51b.f57141xc35d0396;
    }

    /* renamed from: getFrameWidth */
    public int m30659xddab284f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.f57176x6be2dc6;
    }

    /* renamed from: getTrtcCloudJni */
    public long m30660x78204c33() {
        this.f14870xe88073f9.lock();
        try {
            return this.f14877x6e584ec1;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: mixExternalAudioFrame */
    public int m30661xd8a054de(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                return m30536x21d51907(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioFrame(tRTCAudioFrame));
            }
            this.f14870xe88073f9.unlock();
            return -1;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: muteAllRemoteAudio */
    public void m30662x57697d48(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30537x32ca51bf(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: muteAllRemoteVideoStreams */
    public void m30663xa38a2e46(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30538xfefeb5ef(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: muteLocalAudio */
    public void m30664x2aeada24(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30539xf8de821b(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: muteLocalVideo */
    public void m30665x2c0d52c9(int i17, boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30540xfa00fac0(j17, i17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: muteRemoteAudio */
    public void m30666x7fb62b57(java.lang.String str, boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30541x70378240(j17, str, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: muteRemoteVideoStream */
    public void m30667xbd6ef29c(java.lang.String str, int i17, boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30542x6a3b6c5(j17, str, i17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: onAudioCaptureProcessedData */
    public void m30668xeed02649(byte[] bArr, long j17, int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener = this.f14867x254f7058;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = bArr;
        tRTCAudioFrame.f57044x3492916 = j17;
        tRTCAudioFrame.f57043x88751aa = i17;
        tRTCAudioFrame.f57040x2c0b7d03 = i18;
        tRTCAudioFrameListener.mo14853xad1683f4(tRTCAudioFrame);
    }

    /* renamed from: onAudioMixedAllData */
    public void m30669x83497b47(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener = this.f14867x254f7058;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = bArr;
        tRTCAudioFrame.f57044x3492916 = 0L;
        tRTCAudioFrame.f57043x88751aa = i17;
        tRTCAudioFrame.f57040x2c0b7d03 = i18;
        tRTCAudioFrameListener.mo105619xdefe77bc(tRTCAudioFrame);
    }

    /* renamed from: onAudioPlayoutData */
    public void m30670x3bc40cad(byte[] bArr, long j17, int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener = this.f14867x254f7058;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = bArr;
        tRTCAudioFrame.f57044x3492916 = j17;
        tRTCAudioFrame.f57043x88751aa = i17;
        tRTCAudioFrame.f57040x2c0b7d03 = i18;
        tRTCAudioFrameListener.mo105620xb29ba607(tRTCAudioFrame);
    }

    /* renamed from: onAudioRemoteStreamData */
    public void m30671xada60f87(java.lang.String str, byte[] bArr, long j17, int i17, int i18, byte[] bArr2) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener = this.f14867x254f7058;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = bArr;
        tRTCAudioFrame.f57044x3492916 = j17;
        tRTCAudioFrame.f57043x88751aa = i17;
        tRTCAudioFrame.f57040x2c0b7d03 = i18;
        tRTCAudioFrame.f57042xf0df6fda = bArr2;
        tRTCAudioFrameListener.mo14855xb56a47c7(tRTCAudioFrame, str);
    }

    /* renamed from: onAudioRouteChanged */
    public void m30672xc4967f02(int i17, int i18) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105566xc4967f02(i17, i18);
        }
    }

    /* renamed from: onCameraDidReady */
    public void m30673xdc4e3668() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105567xdc4e3668();
        }
    }

    /* renamed from: onCdnStreamStateChanged */
    public void m30674xb135e2f1(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105568xb135e2f1(str, i17, i18, str2, null);
        }
    }

    /* renamed from: onConnectOtherRoom */
    public void m30675xbf6c2e40(java.lang.String str, int i17, java.lang.String str2) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105569xbf6c2e40(str, i17, str2);
        }
    }

    /* renamed from: onConnectionLost */
    public void m30676x7a7fc2e1() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105570x7a7fc2e1();
        }
    }

    /* renamed from: onConnectionRecovery */
    public void m30677x201d54d2() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105571x201d54d2();
        }
    }

    /* renamed from: onDisConnectOtherRoom */
    public void m30678x5670be90(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105572x5670be90(i17, str);
        }
    }

    /* renamed from: onEarMonitoringData */
    public void m30679x492334e9(byte[] bArr, int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener = this.f14867x254f7058;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = bArr;
        tRTCAudioFrame.f57044x3492916 = 0L;
        tRTCAudioFrame.f57043x88751aa = i17;
        tRTCAudioFrame.f57040x2c0b7d03 = i18;
        tRTCAudioFrameListener.mo14856x7e98b6ae(tRTCAudioFrame);
    }

    /* renamed from: onEnterRoom */
    public void m30680xcb050cb4(int i17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105573xcb050cb4(i17);
        }
    }

    /* renamed from: onError */
    public void m30681xaf8aa769(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105574xaf8aa769(i17, str, null);
        }
    }

    /* renamed from: onExitRoom */
    public void m30682x26931218(int i17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105575x26931218(i17);
        }
        synchronized (this.f14876xcaa708ac) {
            this.f14876xcaa708ac.f128149d = null;
        }
        synchronized (this.f14879x3d5a44a) {
            this.f14879x3d5a44a.clear();
        }
    }

    /* renamed from: onFirstAudioFrame */
    public void m30683x10dc7628(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105576x10dc7628(str);
        }
    }

    /* renamed from: onFirstVideoFrame */
    public void m30684x54149ca3(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105577x54149ca3(str, i17, i18, i19);
        }
    }

    /* renamed from: onGLContextCreated */
    public void m30685x2453e5d() {
        synchronized (this.f14880xfcf8cd40) {
            this.f14868x73627288 = this.f14880xfcf8cd40.f128149d;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "onGLContextCreated " + this.f14868x73627288);
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener tRTCVideoFrameListener = this.f14868x73627288;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.m105623x2453e5d();
        }
    }

    /* renamed from: onGLContextDestroy */
    public void m30686x21ca5f6f() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "onGLContextDestroy " + this.f14868x73627288);
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener tRTCVideoFrameListener = this.f14868x73627288;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.m105624x21ca5489();
            this.f14868x73627288 = null;
        }
    }

    /* renamed from: onLocalAudioStreamData */
    public byte[] m30687x89ce6954(byte[] bArr, long j17, int i17, int i18) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener = this.f14867x254f7058;
        if (tRTCAudioFrameListener == null) {
            return null;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = bArr;
        tRTCAudioFrame.f57044x3492916 = j17;
        tRTCAudioFrame.f57043x88751aa = i17;
        tRTCAudioFrame.f57040x2c0b7d03 = i18;
        tRTCAudioFrameListener.mo14854x307058b9(tRTCAudioFrame);
        byte[] bArr2 = tRTCAudioFrame.f57042xf0df6fda;
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length <= 100) {
            return bArr2;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "Audioframe.extraData length need to be under 100!");
        return null;
    }

    /* renamed from: onLocalRecordBegin */
    public void m30688x795c626c(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105578x795c626c(i17, str);
        }
    }

    /* renamed from: onLocalRecordComplete */
    public void m30689x69614c96(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105579x69614c96(i17, str);
        }
    }

    /* renamed from: onLocalRecordFragment */
    public void m30690x2abefdad(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105580x2abefdad(str);
        }
    }

    /* renamed from: onLocalRecording */
    public void m30691x92f8e85(long j17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105581x92f8e85(j17, str);
        }
    }

    /* renamed from: onMicDidReady */
    public void m30692x41ab86c() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105582x41ab86c();
        }
    }

    /* renamed from: onMissCustomCmdMsg */
    public void m30693x38cb5dd3(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105583x38cb5dd3(str, i17, i18, i19);
        }
    }

    /* renamed from: onNetworkQuality */
    public void m30694xf01276b0(int i17, java.lang.String[] strArr, int[] iArr) {
        if (m30492x34523d55().size() == 0) {
            return;
        }
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality tRTCQuality = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality();
        tRTCQuality.f57097xce2b2e46 = "";
        tRTCQuality.f57096x26d0c0ff = i17;
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality> arrayList = new java.util.ArrayList<>();
        if (strArr != null && strArr.length != 0 && iArr != null && iArr.length != 0 && iArr.length == strArr.length) {
            for (int i18 = 0; i18 < strArr.length; i18++) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality tRTCQuality2 = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality();
                tRTCQuality2.f57097xce2b2e46 = strArr[i18];
                tRTCQuality2.f57096x26d0c0ff = iArr[i18];
                arrayList.add(tRTCQuality2);
            }
        }
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105584xf01276b0(tRTCQuality, arrayList);
        }
    }

    /* renamed from: onPreprocessVideoFrame */
    public void m30695xd62159bd(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame2) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener tRTCVideoFrameListener = this.f14868x73627288;
        if (tRTCVideoFrameListener == null || tRTCVideoFrameListener == null) {
            return;
        }
        tRTCVideoFrameListener.m105625x20bf0162(tRTCVideoFrame, tRTCVideoFrame2);
    }

    /* renamed from: onRecvCustomCmdMsg */
    public void m30696xe6e383bd(java.lang.String str, int i17, int i18, byte[] bArr) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105585xe6e383bd(str, i17, i18, bArr);
        }
    }

    /* renamed from: onRemoteAudioStatusUpdated */
    public void m30697xcc44e818(java.lang.String str, int i17, int i18) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105587xcc44e818(str, i17, i18, null);
        }
    }

    /* renamed from: onRemoteVideoStatusUpdated */
    public void m30698xbcd86393(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105590xbcd86393(str, i17, i18, i19, null);
        }
    }

    /* renamed from: onRenderVideoFrame */
    public void m30699x3cf387e7(java.lang.String str, int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener;
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.f14875x1da8ee4;
            tRTCVideoRenderListener = this.f14876xcaa708ac.f128149d;
        } else {
            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar = this.f14879x3d5a44a.get(str);
            tRTCVideoRenderListener = aVar == null ? null : aVar.f128149d;
        }
        if (tRTCVideoRenderListener != null) {
            tRTCVideoRenderListener.mo105626x3cf387e7(str, i17, tRTCVideoFrame);
        }
    }

    /* renamed from: onSEIMessageReceived */
    public void m30700x5e126df0(byte[] bArr, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105586x2e96246f(str, bArr);
        }
    }

    /* renamed from: onScreenCapturePaused */
    public void m30701xb9f716a9() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105591xb9f716a9();
        }
    }

    /* renamed from: onScreenCaptureResumed */
    public void m30702xf5706fbc() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105592xf5706fbc();
        }
    }

    /* renamed from: onScreenCaptureStarted */
    public void m30703x42f07266() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105593x42f07266();
        }
    }

    /* renamed from: onScreenCaptureStopped */
    public void m30704x43b4c3b2(int i17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105594x43b4c3b2(i17);
        }
    }

    /* renamed from: onSendFirstLocalAudioFrame */
    public void m30705x5f5428d9() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105595x5f5428d9();
        }
    }

    /* renamed from: onSendFirstLocalVideoFrame */
    public void m30706xa28c4f54(int i17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105596xa28c4f54(i17);
        }
    }

    /* renamed from: onSetMixTranscodingConfig */
    public void m30707xed58199b(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105597xed58199b(i17, str);
        }
    }

    /* renamed from: onSnapshotComplete */
    public void m30708x7ddd1b1c(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        m30620x51dc9848(com.p314xaae8f345.p373xbe494963.p396x36756d.d.a(tRTCSnapshotListener, bitmap));
    }

    /* renamed from: onSpeedTest */
    public void m30709x9c437a5a(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestResult speedTestResult, int i17, int i18) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105598x9c437a5a(speedTestResult.f128136a, i17, i18);
        }
    }

    /* renamed from: onSpeedTestResult */
    public void m30710xe38317(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestResult speedTestResult) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo14858xe38317(speedTestResult.f128136a);
        }
    }

    /* renamed from: onStartPublishCDNStream */
    public void m30711xcf5dda1(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105599xcf5dda1(i17, str);
        }
    }

    /* renamed from: onStartPublishMediaStream */
    public void m30712x7f755718(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105600x7f755718(str, i17, str2, m30497xa0350b0d(str3));
        }
    }

    /* renamed from: onStartPublishing */
    public void m30713x8e9a0a96(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105601x8e9a0a96(i17, str);
        }
    }

    /* renamed from: onStatistics */
    public void m30714xc17a1062(com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.Statistics statistics) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105602xc17a1062(statistics.f128137a);
        }
    }

    /* renamed from: onStopPublishCDNStream */
    public void m30715x93878a5f(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105603x93878a5f(i17, str);
        }
    }

    /* renamed from: onStopPublishMediaStream */
    public void m30716xa84ecc56(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105604xa84ecc56(str, i17, str2, m30497xa0350b0d(str3));
        }
    }

    /* renamed from: onStopPublishing */
    public void m30717x1c239dd4(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105605x1c239dd4(i17, str);
        }
    }

    /* renamed from: onSwitchRole */
    public void m30718xb2695109(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105606xb2695109(i17, str);
        }
    }

    /* renamed from: onSwitchRoom */
    public void m30719xb269516e(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105607xb269516e(i17, str);
        }
    }

    /* renamed from: onTryToReconnect */
    public void m30720xd9f68220() {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105608xd9f68220();
        }
    }

    /* renamed from: onUpdateOtherRoomForwardMode */
    public void m30721xf4535ca5(int i17, java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105609xf4535ca5(i17, str);
        }
    }

    /* renamed from: onUpdatePublishMediaStream */
    public void m30722xede3c59d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105610xede3c59d(str, i17, str2, m30497xa0350b0d(str3));
        }
    }

    /* renamed from: onUserAudioAvailable */
    public void m30723xf752687d(java.lang.String str, boolean z17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105611xf752687d(str, z17);
        }
    }

    /* renamed from: onUserEnter */
    public void m30724x10f60eae(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105612x10f60eae(str);
        }
    }

    /* renamed from: onUserExit */
    public void m30725x95315e88(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105613x95315e88(str, 0);
        }
    }

    /* renamed from: onUserOffline */
    public void m30726xae427839(java.lang.String str, int i17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105589x6e3109a2(str, i17);
        }
    }

    /* renamed from: onUserOnline */
    public void m30727x1ed8a93d(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105588xd807c943(str);
        }
    }

    /* renamed from: onUserSubStreamAvailable */
    public void m30728xd84b60b3(java.lang.String str, boolean z17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105614xd84b60b3(str, z17);
        }
    }

    /* renamed from: onUserVideoAvailable */
    public void m30729xfcccd978(java.lang.String str, boolean z17) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105615xfcccd978(str, z17);
        }
    }

    /* renamed from: onUserVideoSizeChanged */
    public void m30730x7b85a662(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().m105616x7b85a662(str, i17, i18, i19);
        }
    }

    /* renamed from: onUserVoiceVolume */
    public void m30731x1e54d642(java.lang.String[] strArr, int[] iArr, int[] iArr2, float[] fArr, float[][] fArr2, int i17) {
        java.lang.String str;
        if (strArr == null || iArr == null) {
            return;
        }
        if (strArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("Invalid parameter, userIds and volumes do not match.");
        }
        java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo> arrayList = new java.util.ArrayList<>();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo tRTCVolumeInfo = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo();
            if (!strArr[i18].isEmpty() || (str = this.f14875x1da8ee4) == null || str.isEmpty()) {
                tRTCVolumeInfo.f57187xce2b2e46 = strArr[i18];
            } else {
                tRTCVolumeInfo.f57187xce2b2e46 = this.f14875x1da8ee4;
            }
            tRTCVolumeInfo.f57188xcfaae71a = iArr[i18];
            tRTCVolumeInfo.vad = iArr2[i18];
            tRTCVolumeInfo.f57185x65bc340 = fArr[i18];
            tRTCVolumeInfo.f57186xbea22b1b = fArr2[i18];
            arrayList.add(tRTCVolumeInfo);
        }
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105617x1e54d642(arrayList, i17);
        }
    }

    /* renamed from: onWarning */
    public void m30732x92abb0bd(int i17, java.lang.String str, android.os.Bundle bundle) {
        java.util.Iterator<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c> it = m30492x34523d55().iterator();
        while (it.hasNext()) {
            it.next().mo105618x92abb0bd(i17, str, bundle);
        }
    }

    /* renamed from: pauseScreenCapture */
    public void m30733xc4d476e4(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30543xa0354b5b(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: removeListener */
    public void m30734xf1335d58(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c) {
        if (abstractC26788x7049bd9c == null || !this.f14874x3ddc887f.contains(abstractC26788x7049bd9c)) {
            return;
        }
        this.f14874x3ddc887f.remove(abstractC26788x7049bd9c);
    }

    /* renamed from: resumeScreenCapture */
    public void m30735x793c660d(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30544x9f62076(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: sendCustomAudioData */
    public void m30736x2c45ef87(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30545xbcffa9f0(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioFrame(tRTCAudioFrame));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: sendCustomCmdMsg */
    public boolean m30737x5c3e260(int i17, byte[] bArr, boolean z17, boolean z18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                return m30546x256d6897(j17, i17, bArr, z17, z18);
            }
            this.f14870xe88073f9.unlock();
            return false;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: sendCustomVideoData */
    public void m30738x70818dac(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        int i18;
        java.lang.Object obj;
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTexture tRTCTexture = tRTCVideoFrame.f57174xab7dd51b;
                if (tRTCTexture != null) {
                    int i19 = tRTCTexture.f57141xc35d0396;
                    java.lang.Object obj2 = tRTCTexture.f57139x5f488f24;
                    if (obj2 == null) {
                        obj2 = tRTCTexture.f57140x5f488f28;
                    }
                    i18 = i19;
                    obj = obj2;
                } else {
                    i18 = -1;
                    obj = null;
                }
                m30547x13b4815(j17, i17, tRTCVideoFrame.f57172xa0fe3a1d, tRTCVideoFrame.f57169x719f779a, obj, i18, tRTCVideoFrame.f57176x6be2dc6, tRTCVideoFrame.f57171xb7389127, m30495x9719524f(tRTCVideoFrame.f57173xfd990f7e).f14773xbee9dd04, tRTCVideoFrame.f57175x3492916, tRTCVideoFrame.f57170x2eefaa, tRTCVideoFrame.f57168xaddb9440);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: sendSEIMsg */
    public boolean m30739x1a3ef952(byte[] bArr, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                return m30548x3b34c9(j17, bArr, i17);
            }
            this.f14870xe88073f9.unlock();
            return false;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: set3DSpatialReceivingRange */
    public void m30740x516ce3ce(java.lang.String str, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30549x64895145(j17, str, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setAudioCaptureVolume */
    public void m30741x93f671cc(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30550xdd2b35f5(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setAudioFrameListener */
    public void m30742xd087f90d(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                this.f14867x254f7058 = tRTCAudioFrameListener;
                m30519x403c3edc(j17, tRTCAudioFrameListener != null);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setAudioPlayoutVolume */
    public void m30743xe8cf0320(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30551x3203c749(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setAudioQuality */
    public void m30744x5f7e6dcb(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30552x4fffc4b4(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setCapturedAudioFrameCallbackFormat */
    public int m30745xc2833433(int i17, int i18, int i19, int i27) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30553x4234fc9c(j17, i17, i18, i19, i27) : 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setDefaultStreamRecvMode */
    public void m30746x553779a8(boolean z17, boolean z18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30555x68aed8df(j17, z17, z18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setGSensorMode */
    public void m30747x35121682(int i17, int i18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30556x305be79(j17, i17, i18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setGravitySensorAdaptiveMode */
    public void m30748x1449a6bf(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30557xd2009276(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setListener */
    public void m30749xc6cf6336(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c) {
        this.f14872x753a6c41 = abstractC26788x7049bd9c;
    }

    /* renamed from: setListenerHandler */
    public void m30750x4caea334(android.os.Handler handler) {
        this.f14870xe88073f9.lock();
        if (handler == null) {
            this.f14873x12467c9 = new android.os.Handler(android.os.Looper.getMainLooper());
        } else {
            this.f14873x12467c9 = handler;
        }
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30558x280f77ab(j17, handler);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setLocalProcessedAudioFrameCallbackFormat */
    public int m30751x87919df8(int i17, int i18, int i19, int i27) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30559x4f3bb3a1(j17, i17, i18, i19, i27) : 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setLocalVideoProcessListener */
    public int m30752x2c264c11(int i17, int i18, int i19, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.f14870xe88073f9.lock();
        try {
            if (this.f14877x6e584ec1 != 0) {
                if (!m30502xc338b198(i18)) {
                    this.f14870xe88073f9.unlock();
                    return com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14418x726cea00;
                }
                if (!m30501x218b0161(i19)) {
                    this.f14870xe88073f9.unlock();
                    return com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14397x4c61c9b5;
                }
                synchronized (this.f14880xfcf8cd40) {
                    com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener> aVar = this.f14880xfcf8cd40;
                    if (aVar.f128149d != null) {
                        m30527x68975afe(this.f14877x6e584ec1, false, aVar.f128146a, aVar.f128147b, aVar.f128148c);
                    }
                    com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener> aVar2 = this.f14880xfcf8cd40;
                    aVar2.f128149d = tRTCVideoFrameListener;
                    aVar2.f128146a = i17;
                    aVar2.f128147b = i18;
                    aVar2.f128148c = i19;
                    if (tRTCVideoFrameListener != 0) {
                        m30527x68975afe(this.f14877x6e584ec1, true, i17, i18, i19);
                    }
                }
            }
            return 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setLocalVideoRenderListener */
    public int m30753xb403dedc(int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener) {
        boolean z17;
        this.f14870xe88073f9.lock();
        try {
            if (this.f14877x6e584ec1 != 0) {
                if (!m30504xe3384ae(i17)) {
                    this.f14870xe88073f9.unlock();
                    return com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14418x726cea00;
                }
                if (!m30503x6c85d477(i18)) {
                    this.f14870xe88073f9.unlock();
                    return com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14397x4c61c9b5;
                }
                synchronized (this.f14876xcaa708ac) {
                    com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar = this.f14876xcaa708ac;
                    if (aVar.f128149d != null) {
                        int i19 = aVar.f128147b;
                        if (i19 == i17 && aVar.f128148c == i18) {
                            z17 = false;
                            if (!z17 && tRTCVideoRenderListener != 0) {
                                aVar.f128149d = tRTCVideoRenderListener;
                            }
                            m30528x2bcf728(this.f14877x6e584ec1, false, "", 0, i19, aVar.f128148c);
                            long j17 = this.f14877x6e584ec1;
                            com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar2 = this.f14876xcaa708ac;
                            m30528x2bcf728(j17, false, "", 2, aVar2.f128147b, aVar2.f128148c);
                        }
                        z17 = true;
                        if (!z17) {
                            aVar.f128149d = tRTCVideoRenderListener;
                        }
                        m30528x2bcf728(this.f14877x6e584ec1, false, "", 0, i19, aVar.f128148c);
                        long j172 = this.f14877x6e584ec1;
                        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar22 = this.f14876xcaa708ac;
                        m30528x2bcf728(j172, false, "", 2, aVar22.f128147b, aVar22.f128148c);
                    }
                    com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar3 = this.f14876xcaa708ac;
                    aVar3.f128149d = tRTCVideoRenderListener;
                    aVar3.f128147b = i17;
                    aVar3.f128148c = i18;
                    if (tRTCVideoRenderListener != 0) {
                        m30528x2bcf728(this.f14877x6e584ec1, true, "", 0, i17, i18);
                        long j18 = this.f14877x6e584ec1;
                        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar4 = this.f14876xcaa708ac;
                        m30528x2bcf728(j18, true, "", 2, aVar4.f128147b, aVar4.f128148c);
                    }
                }
            }
            return 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setLocalViewFillMode */
    public void m30754xc5845254(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30560x4c01e50b(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setLocalViewMirror */
    public void m30755xe7665fcd(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30561xc2c73444(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setLocalViewRotation */
    public void m30756xee95380c(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30562x7512cac3(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setMixExternalAudioVolume */
    public void m30757xf2a4bccb(int i17, int i18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30566x4e194474(j17, i17, i18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setMixTranscodingConfig */
    public void m30758x99ee7a7a(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30567x6902d863(j17, tRTCTranscodingConfig == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.TranscodingConfig(tRTCTranscodingConfig));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setMixedPlayAudioFrameCallbackFormat */
    public int m30759xea2c4460(int i17, int i18, int i19, int i27) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            return j17 != 0 ? m30568x60b38917(j17, i17, i18, i19, i27) : 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setNetworkQosParam */
    public void m30760x62511304(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCNetworkQosParam != null) {
                m30569x3db1e77b(j17, tRTCNetworkQosParam.f57074xa8fcbcdb, tRTCNetworkQosParam.f57073x99c01ca0);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setPerspectiveCorrectionPoints */
    public void m30761xd2daee7b(java.lang.String str, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                java.util.List list = null;
                float[] a17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.f.a(pointFArr == null ? null : java.util.Arrays.asList(pointFArr));
                if (pointFArr2 != null) {
                    list = java.util.Arrays.asList(pointFArr2);
                }
                m30570xfe85c872(j17, str, a17, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.f.a(list));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setPriorRemoteVideoStreamType */
    public int m30762xf616b1e7(int i17) {
        long j17 = this.f14877x6e584ec1;
        if (j17 == 0) {
            return 0;
        }
        m30571xef3d3d10(j17, i17);
        return 0;
    }

    /* renamed from: setRemoteAudioParallelParams */
    public void m30763xb88f8f7b(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCAudioParallelParams != null) {
                m30572x76467b32(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioParallelParams(tRTCAudioParallelParams));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setRemoteAudioVolume */
    public void m30764xe9a43228(java.lang.String str, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30573x7021c4df(j17, str, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setRemoteVideoRenderListener */
    public int m30765x3cc2c55d(java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener) {
        boolean z17;
        this.f14870xe88073f9.lock();
        try {
            byte b17 = 0;
            if (this.f14877x6e584ec1 != 0) {
                if (android.text.TextUtils.isEmpty(str)) {
                    this.f14870xe88073f9.unlock();
                    return -3319;
                }
                if (!m30504xe3384ae(i17)) {
                    this.f14870xe88073f9.unlock();
                    return com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14418x726cea00;
                }
                if (!m30503x6c85d477(i18)) {
                    this.f14870xe88073f9.unlock();
                    return com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14397x4c61c9b5;
                }
                synchronized (this.f14879x3d5a44a) {
                    com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar = this.f14879x3d5a44a.get(str);
                    if (aVar != null) {
                        int i19 = aVar.f128147b;
                        if (i19 == i17 && aVar.f128148c == i18) {
                            z17 = false;
                            if (!z17 && tRTCVideoRenderListener != 0) {
                                aVar.f128149d = tRTCVideoRenderListener;
                                this.f14879x3d5a44a.put(str, aVar);
                            }
                            m30528x2bcf728(this.f14877x6e584ec1, false, str, 0, i19, aVar.f128148c);
                            m30528x2bcf728(this.f14877x6e584ec1, false, str, 2, aVar.f128147b, aVar.f128148c);
                        }
                        z17 = true;
                        if (!z17) {
                            aVar.f128149d = tRTCVideoRenderListener;
                            this.f14879x3d5a44a.put(str, aVar);
                        }
                        m30528x2bcf728(this.f14877x6e584ec1, false, str, 0, i19, aVar.f128148c);
                        m30528x2bcf728(this.f14877x6e584ec1, false, str, 2, aVar.f128147b, aVar.f128148c);
                    }
                    if (tRTCVideoRenderListener != 0) {
                        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener> aVar2 = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<>(b17);
                        aVar2.f128149d = tRTCVideoRenderListener;
                        aVar2.f128147b = i17;
                        aVar2.f128148c = i18;
                        m30528x2bcf728(this.f14877x6e584ec1, true, str, 0, i17, i18);
                        m30528x2bcf728(this.f14877x6e584ec1, true, str, 2, aVar2.f128147b, aVar2.f128148c);
                        this.f14879x3d5a44a.put(str, aVar2);
                    } else {
                        this.f14879x3d5a44a.remove(str);
                    }
                }
            }
            return 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setRemoteVideoStreamType */
    public int m30766xf9be554d(java.lang.String str, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30574xd35b484(j17, str, i17);
            }
            this.f14870xe88073f9.unlock();
            return 0;
        } catch (java.lang.Throwable th6) {
            this.f14870xe88073f9.unlock();
            throw th6;
        }
    }

    /* renamed from: setRemoteViewFillMode */
    public void m30767x46994af3(java.lang.String str, int i17, int i18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30575x8fce0f1c(j17, str, i17, i18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setRemoteViewMirror */
    public void m30768x4ef42c(java.lang.String str, int i17, int i18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30576x9108ae95(j17, str, i17, i18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setRemoteViewRotation */
    public void m30769x6faa30ab(java.lang.String str, int i17, int i18) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30577xb8def4d4(j17, str, i17, i18);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setVideoEncoderMirror */
    public void m30770xf191f742(boolean z17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30578x3ac6bb6b(j17, z17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setVideoEncoderParams */
    public void m30771xf63f8509(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCVideoEncParam != null) {
                m30579x3f744932(j17, i17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoEncParams(tRTCVideoEncParam));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setVideoEncoderRotation */
    public void m30772x1c38c641(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30580xeb4d242a(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setVideoMuteImage */
    public void m30773xd60e989(android.graphics.Bitmap bitmap, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30581xe2e82a32(j17, bitmap, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: setWatermark */
    public void m30774x4f089a22(android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30582xa6e3d3d9(j17, bitmap, i17, f17, f18, f19);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: showDashboardManager */
    public void m30775xe84ff396(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30583x6ecd864d(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: snapshotVideo */
    public void m30776x46e54917(java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30584xea714640(j17, str, i17, i18, tRTCSnapshotListener);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startAudioRecording */
    public int m30777x3d492fbd(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCAudioRecordingParams != null) {
                return m30585xce02ea26(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.AudioRecordingParams(tRTCAudioRecordingParams));
            }
            this.f14870xe88073f9.unlock();
            return 0;
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startLocalAudio */
    public void m30779xbd52c52d(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30587xf5649f63(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startLocalPreview */
    public void m30780xc829135f(boolean z17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30588x9db05408(j17, z17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startLocalRecording */
    public void m30781xcf0b23c8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCLocalRecordingParams != null) {
                m30589x5fc4de31(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.LocalRecordingParams(tRTCLocalRecordingParams));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startPublishCDNStream */
    public void m30782xa71cea40(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCPublishCDNParam != null) {
                m30590xf051ae69(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishCDNParams(tRTCPublishCDNParam));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startPublishMediaStream */
    public void m30783x2c0bb7f7(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamMixingConfig streamMixingConfig = null;
                com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishTarget publishTarget = tRTCPublishTarget == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishTarget(tRTCPublishTarget);
                com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamEncoderParam streamEncoderParam = tRTCStreamEncoderParam == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamEncoderParam(tRTCStreamEncoderParam);
                if (tRTCStreamMixingConfig != null) {
                    streamMixingConfig = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamMixingConfig(tRTCStreamMixingConfig);
                }
                m30591xfb2015e0(j17, publishTarget, streamEncoderParam, streamMixingConfig);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startPublishing */
    public void m30784xe3b2ba75(java.lang.String str, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30592xd434115e(j17, str, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startRemoteView */
    public void m30785xaf56220d(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30593x9fd778f6(j17, str, i17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startScreenCapture */
    public void m30787x51e3a7f8(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f14870xe88073f9.lock();
        try {
            if (this.f14877x6e584ec1 != 0) {
                com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.ScreenShareParams screenShareParams = tRTCScreenShareParams != null ? new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.ScreenShareParams(tRTCScreenShareParams) : null;
                if (tRTCVideoEncParam == null) {
                    m30595x2d447c6f(this.f14877x6e584ec1, i17, null, screenShareParams);
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "startScreenCapture encParams is null");
                } else {
                    m30595x2d447c6f(this.f14877x6e584ec1, i17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.VideoEncParams(tRTCVideoEncParam), screenShareParams);
                }
            }
            if (tRTCScreenShareParams != null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3743xd5f5f0a7.m29299x925811a8(com.p314xaae8f345.p373xbe494963.p396x36756d.b.a(this, tRTCScreenShareParams));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startSpeedTest */
    public void m30789x88fa6737(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCSpeedTestParams != null) {
                m30596x56ee0f2e(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestParams(tRTCSpeedTestParams));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startSystemAudioLoopback */
    public void m30790x48e939d0() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30597x5c609907(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopAllRemoteView */
    public void m30791x8d284faa() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30598x62af9053(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopAudioRecording */
    public void m30792x5a59b5d() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30599xe1066fd4(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopLocalAudio */
    public void m30793xc6f600cd() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30600x94e9a8c4(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopLocalPreview */
    public void m30794xf5ebe6ff() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30601x15956d36(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopLocalRecording */
    public void m30795x97678f68() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30602x72c863df(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopPublishCDNStream */
    public void m30796xca0cede0() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30603x508a8097(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopPublishMediaStream */
    public void m30797x53095397(java.lang.String str) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30604x306d148e(j17, str);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopPublishing */
    public void m30798xed55f615() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30605xbb499e0c(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopRemoteView */
    public void m30800xb8f95dad(java.lang.String str, int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30606x86ed05a4(j17, str, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopScreenCapture */
    public void m30801xdc7b4858(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30608xb2028901(j17, i17);
            }
            this.f14870xe88073f9.unlock();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3743xd5f5f0a7.m29299x925811a8(com.p314xaae8f345.p373xbe494963.p396x36756d.c.a(this));
        } catch (java.lang.Throwable th6) {
            this.f14870xe88073f9.unlock();
            throw th6;
        }
    }

    /* renamed from: stopSpeedTest */
    public void m30802x26313797() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30609xc9bd34c0(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopSystemAudioLoopback */
    public void m30803x19f1230() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30610xd0b37019(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: switchRole */
    public void m30804xeb4bf1ca(int i17) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30611xd1482d41(j17, i17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: switchRoom */
    public void m30806xeb4bf22f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && tRTCSwitchRoomConfig != null) {
                m30613xd1482da6(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SwitchRoomConfig(tRTCSwitchRoomConfig));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: updateLocalView */
    public void m30807x599e7(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30614xf086f0d0(j17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: updateOtherRoomForwardMode */
    public void m30808x24065b66(java.lang.String str) {
        long j17 = this.f14877x6e584ec1;
        if (j17 != 0) {
            m30615x3722c8dd(j17, str);
        }
    }

    /* renamed from: updatePublishMediaStream */
    public void m30809xd419809e(java.lang.String str, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30616xe790dfd5(j17, str, tRTCPublishTarget == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.PublishTarget(tRTCPublishTarget), tRTCStreamEncoderParam == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamEncoderParam(tRTCStreamEncoderParam), tRTCStreamMixingConfig == null ? null : new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.StreamMixingConfig(tRTCStreamMixingConfig));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: updateRemote3DSpatialPosition */
    public void m30810x3301e10d(java.lang.String str, int[] iArr) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && iArr != null) {
                m30617x2c286c36(j17, str, iArr);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: updateRemoteView */
    public void m30811xf18e81b4(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30618x113807eb(j17, str, i17, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: updateSelf3DSpatialPosition */
    public void m30812x8b180887(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0 && iArr != null && fArr != null && fArr2 != null && fArr3 != null) {
                m30619xdb8949f0(j17, iArr, fArr, fArr2, fArr3);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    public C3808x20f90ddd(long j17, boolean z17) {
        this.f14877x6e584ec1 = 0L;
        this.f14875x1da8ee4 = "";
        this.f14874x3ddc887f = new java.util.concurrent.CopyOnWriteArrayList();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f14878x9570c147 = reentrantReadWriteLock;
        this.f14870xe88073f9 = reentrantReadWriteLock.readLock();
        this.f14871x17237092 = reentrantReadWriteLock.writeLock();
        this.f14869x5ed5e7ff = new java.util.HashSet<>();
        if (j17 == 0) {
            this.f14877x6e584ec1 = m30514xeec39bb5(this, z17);
        } else {
            this.f14877x6e584ec1 = m30515x876f08e8(this, j17);
        }
        byte b17 = 0;
        this.f14880xfcf8cd40 = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<>(b17);
        this.f14876xcaa708ac = new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.a<>(b17);
        this.f14879x3d5a44a = new java.util.HashMap();
        this.f14873x12467c9 = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$SpeedTestParams */
    /* loaded from: classes10.dex */
    public static class SpeedTestParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams f128134a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f128135b;

        public SpeedTestParams(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams tRTCSpeedTestParams) {
            this.f128134a = tRTCSpeedTestParams;
            this.f128135b = false;
        }

        /* renamed from: getExpectedDownBandwidth */
        public int m30869x16f038a1() {
            return this.f128134a.f57104xb446657;
        }

        /* renamed from: getExpectedUpBandwidth */
        public int m30870x6f6f6b48() {
            return this.f128134a.f57105x173f8e7e;
        }

        /* renamed from: getIsCalledFromDeprecatedApi */
        public boolean m30871xd5292a0() {
            return this.f128135b;
        }

        /* renamed from: getSDKAppId */
        public int m30872xb6ed2878() {
            return this.f128134a.f57107xe756702;
        }

        /* renamed from: getScene */
        public int m30873x7520bed6() {
            return this.f128134a.f57106x683188c;
        }

        /* renamed from: getUserId */
        public java.lang.String m30874x3342513c() {
            return this.f128134a.f57108xce2b2e46;
        }

        /* renamed from: getUserSig */
        public java.lang.String m30875x3507fcd0() {
            return this.f128134a.f57109xf73ac106;
        }

        public SpeedTestParams(int i17, java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams tRTCSpeedTestParams = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams();
            this.f128134a = tRTCSpeedTestParams;
            tRTCSpeedTestParams.f57107xe756702 = i17;
            tRTCSpeedTestParams.f57108xce2b2e46 = str;
            tRTCSpeedTestParams.f57109xf73ac106 = str2;
            tRTCSpeedTestParams.f57106x683188c = 1;
            this.f128135b = true;
        }
    }

    /* renamed from: startLocalAudio */
    public void m30778xbd52c52d() {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30586xadd41c16(j17);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startRemoteView */
    public void m30786xaf56220d(java.lang.String str, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30594x6d88276c(j17, str, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: startSpeedTest */
    public void m30788x88fa6737(int i17, java.lang.String str, java.lang.String str2) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30596x56ee0f2e(j17, new com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.SpeedTestParams(i17, str, str2));
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: stopRemoteView */
    public void m30799xb8f95dad(java.lang.String str) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30607x55e3cc7e(j17, str);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }

    /* renamed from: switchRole */
    public void m30805xeb4bf1ca(int i17, java.lang.String str) {
        this.f14870xe88073f9.lock();
        try {
            long j17 = this.f14877x6e584ec1;
            if (j17 != 0) {
                m30612x2707645f(j17, i17, str);
            }
        } finally {
            this.f14870xe88073f9.unlock();
        }
    }
}
