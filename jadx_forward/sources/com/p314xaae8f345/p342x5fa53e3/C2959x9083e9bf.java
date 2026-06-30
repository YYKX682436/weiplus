package com.p314xaae8f345.p342x5fa53e3;

/* renamed from: com.tencent.ilink.NetworkManager */
/* loaded from: classes16.dex */
public class C2959x9083e9bf extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.Destructor f10151x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p342x5fa53e3.C2965x9bb37883 f10152x3163df90 = new com.p314xaae8f345.p342x5fa53e3.C2965x9bb37883();

    /* renamed from: com.tencent.ilink.NetworkManager$AppSessionTimeoutEvent */
    /* loaded from: classes16.dex */
    public interface AppSessionTimeoutEvent {
        /* renamed from: event */
        void m22165x5c6729a();
    }

    /* renamed from: com.tencent.ilink.NetworkManager$C2CDownloadCallback */
    /* loaded from: classes16.dex */
    public interface C2CDownloadCallback {
        /* renamed from: complete */
        void m22166xdc453139(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3039xcdc73c56 c3039xcdc73c56);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$C2CDownloadOriginCallback */
    /* loaded from: classes16.dex */
    public interface C2CDownloadOriginCallback {
        /* renamed from: complete */
        void m22167xdc453139(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3038xc657945c c3038xc657945c);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$C2CDownloadOriginProgressCallback */
    /* loaded from: classes15.dex */
    public interface C2CDownloadOriginProgressCallback {
        /* renamed from: onProgress */
        void m22168x696ee52c(long j17, long j18);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$C2CDownloadProgressCallback */
    /* loaded from: classes15.dex */
    public interface C2CDownloadProgressCallback {
        /* renamed from: onProgress */
        void m22169x696ee52c(long j17, long j18);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$C2CUploadCallback */
    /* loaded from: classes16.dex */
    public interface C2CUploadCallback {
        /* renamed from: complete */
        void m22170xdc453139(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3043x1280f34f c3043x1280f34f);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$C2CUploadProgressCallback */
    /* loaded from: classes15.dex */
    public interface C2CUploadProgressCallback {
        /* renamed from: onProgress */
        void m22171x696ee52c(long j17, long j18);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "NetworkManager.Destructor";

        /* renamed from: nativeHandler */
        long f10153xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f10154xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f10155xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor NetworkManager Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor NetworkManager Destructor() id:" + this.f10154xb1c7f9d5 + "svrid: " + this.f10155xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p342x5fa53e3.C2965x9bb37883.m22277x9bb3787c(this.f10153xf042a733, this.f10154xb1c7f9d5, this.f10155xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.ilink.NetworkManager$ReceiveAppMessageEvent */
    /* loaded from: classes15.dex */
    public interface ReceiveAppMessageEvent {
        /* renamed from: event */
        void mo22172x5c6729a(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3033x6ae4bab4 c3033x6ae4bab4);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$ReceiveNotifyEvent */
    /* loaded from: classes15.dex */
    public interface ReceiveNotifyEvent {
        /* renamed from: event */
        void m22173x5c6729a(int i17, byte[] bArr);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$ReceiveSyncMessageEvent */
    /* loaded from: classes15.dex */
    public interface ReceiveSyncMessageEvent {
        /* renamed from: event */
        void m22174x5c6729a(int i17, byte[] bArr);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$RequestCheckResourceCallback */
    /* loaded from: classes15.dex */
    public interface RequestCheckResourceCallback {
        /* renamed from: complete */
        void mo22175xdc453139(int i17, byte[] bArr);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$RequestUploadLogEvent */
    /* loaded from: classes15.dex */
    public interface RequestUploadLogEvent {
        /* renamed from: event */
        void m22176x5c6729a(byte[] bArr);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$SendRequestCallback */
    /* loaded from: classes15.dex */
    public interface SendRequestCallback {
        /* renamed from: complete */
        void m22177xdc453139(int i17, byte[] bArr);
    }

    /* renamed from: com.tencent.ilink.NetworkManager$UpdatePushTokenCallback */
    /* loaded from: classes16.dex */
    public interface UpdatePushTokenCallback {
        /* renamed from: complete */
        void m22178xdc453139(int i17, byte[] bArr, int i18);
    }

    public C2959x9083e9bf(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("ilink2", "ilink2");
        this.f10152x3163df90.m22293x9bb3787b(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf m22132xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: c2CDownloadAsync */
    public void m22133x152de140(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3036x67beced9 c3036x67beced9, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadProgressCallback c2CDownloadProgressCallback, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadCallback c2CDownloadCallback) {
        this.f10152x3163df90.m22296x1964d1da(this.f60634xf042a733, c2CDownloadProgressCallback, c2CDownloadCallback, c3036x67beced9.m75963xebb06ba0());
    }

    /* renamed from: c2CDownloadOriginAsync */
    public void m22134x64bda6ba(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3037xc95b235f c3037xc95b235f, int i17, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadOriginProgressCallback c2CDownloadOriginProgressCallback, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CDownloadOriginCallback c2CDownloadOriginCallback) {
        this.f10152x3163df90.m22312x1964d465(this.f60634xf042a733, c2CDownloadOriginProgressCallback, c2CDownloadOriginCallback, c3037xc95b235f.m75963xebb06ba0(), i17);
    }

    /* renamed from: c2CUploadAsync */
    public void m22135x9317ca67(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3042xcbe77492 c3042xcbe77492, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CUploadProgressCallback c2CUploadProgressCallback, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.C2CUploadCallback c2CUploadCallback) {
        this.f10152x3163df90.m22295x1964d1bb(this.f60634xf042a733, c2CUploadProgressCallback, c2CUploadCallback, c3042xcbe77492.m75963xebb06ba0());
    }

    /* renamed from: cancelAllTask */
    public void m22136x187f76ec() {
        this.f10152x3163df90.m22297x9db8edfd(this.f60634xf042a733);
    }

    /* renamed from: cancelC2CTask */
    public void m22137x1d1115bf(java.lang.String str) {
        this.f10152x3163df90.m22313x9db8ee12(this.f60634xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: genTaskId */
    public long m22138xf330b0f0() {
        return this.f10152x3163df90.m22298x9db8edfe(this.f60634xf042a733);
    }

    /* renamed from: manualDestroy */
    public void m22139xd8e82554() {
        this.f10152x3163df90.m22291x1964d169(this.f60634xf042a733);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.Destructor destructor = new com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.Destructor(this, this.f60634xf042a733);
        this.f10151x5751f3f9 = destructor;
        destructor.f10153xf042a733 = this.f60634xf042a733;
        destructor.f10154xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f10155xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: realUin */
    public long m22140x406925dc() {
        return this.f10152x3163df90.m22299x9db8edff(this.f60634xf042a733);
    }

    /* renamed from: requestCheckResourceAsync */
    public void m22141x820927d5(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf c3071xc6e22cf, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.RequestCheckResourceCallback requestCheckResourceCallback) {
        this.f10152x3163df90.m22311x1964d446(this.f60634xf042a733, requestCheckResourceCallback, c3071xc6e22cf.m75963xebb06ba0());
    }

    /* renamed from: requestUploadLog */
    public void m22142xf9b46fb4(int i17, int i18) {
        this.f10152x3163df90.m22310x9db8ee0a(this.f60634xf042a733, i17, i18);
    }

    /* renamed from: sendRequestAsync */
    public void m22143x566578d5(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a c3065x3a9f481a, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.SendRequestCallback sendRequestCallback) {
        this.f10152x3163df90.m22292x1964d17d(this.f60634xf042a733, sendRequestCallback, c3065x3a9f481a.m75963xebb06ba0());
    }

    /* renamed from: setSmcBaseInfo */
    public void m22144x49ed91c6(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 c3068xcfc933c5) {
        this.f10152x3163df90.m22305x9db8ee05(this.f60634xf042a733, c3068xcfc933c5.m75963xebb06ba0());
    }

    /* renamed from: setSmcUin */
    public void m22145x22b7f553(int i17) {
        this.f10152x3163df90.m22306x9db8ee06(this.f60634xf042a733, i17);
    }

    /* renamed from: showUin */
    public long m22146x7b38341d() {
        return this.f10152x3163df90.m22300x9db8ee00(this.f60634xf042a733);
    }

    /* renamed from: smcFlush */
    public void m22147xdd2b733b() {
        this.f10152x3163df90.m22308x9db8ee08(this.f60634xf042a733);
    }

    /* renamed from: subscribeAppSessionTimeoutEvent */
    public void m22148xd604d578(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.AppSessionTimeoutEvent appSessionTimeoutEvent) {
        this.f10152x3163df90.m22314xd604d578(str, appSessionTimeoutEvent);
    }

    /* renamed from: subscribeNotify */
    public void m22149xb68fc133(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.f10152x3163df90.m22301x9db8ee01(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119592xcc4cf6b1(arrayList));
    }

    /* renamed from: subscribeReceiveAppMessageEvent */
    public void m22150xef84ec1b(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveAppMessageEvent receiveAppMessageEvent) {
        this.f10152x3163df90.m22315xef84ec1b(str, receiveAppMessageEvent);
    }

    /* renamed from: subscribeReceiveNotifyEvent */
    public void m22151xadc44d8(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveNotifyEvent receiveNotifyEvent) {
        this.f10152x3163df90.m22316xadc44d8(str, receiveNotifyEvent);
    }

    /* renamed from: subscribeReceiveSyncMessageEvent */
    public void m22152x7fb40567(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.ReceiveSyncMessageEvent receiveSyncMessageEvent) {
        this.f10152x3163df90.m22317x7fb40567(str, receiveSyncMessageEvent);
    }

    /* renamed from: subscribeRequestUploadLogEvent */
    public void m22153x8e3a481c(java.lang.String str, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.RequestUploadLogEvent requestUploadLogEvent) {
        this.f10152x3163df90.m22318x8e3a481c(str, requestUploadLogEvent);
    }

    /* renamed from: subscribeSyncMessage */
    public void m22154xfd89e142(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.f10152x3163df90.m22303x9db8ee03(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119592xcc4cf6b1(arrayList));
    }

    /* renamed from: unsubscribeAppSessionTimeoutEvent */
    public void m22155xde5933bf(java.lang.String str) {
        this.f10152x3163df90.m22319xde5933bf(str);
    }

    /* renamed from: unsubscribeNotify */
    public void m22156x80df8d7a(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.f10152x3163df90.m22302x9db8ee02(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119592xcc4cf6b1(arrayList));
    }

    /* renamed from: unsubscribeReceiveAppMessageEvent */
    public void m22157xf7d94a62(java.lang.String str) {
        this.f10152x3163df90.m22320xf7d94a62(str);
    }

    /* renamed from: unsubscribeReceiveNotifyEvent */
    public void m22158x6630de9f(java.lang.String str) {
        this.f10152x3163df90.m22321x6630de9f(str);
    }

    /* renamed from: unsubscribeReceiveSyncMessageEvent */
    public void m22159x81eb7000(java.lang.String str) {
        this.f10152x3163df90.m22322x81eb7000(str);
    }

    /* renamed from: unsubscribeRequestUploadLogEvent */
    public void m22160xc84d84f5(java.lang.String str) {
        this.f10152x3163df90.m22323xc84d84f5(str);
    }

    /* renamed from: unsubscribeSyncMessage */
    public void m22161xe261a95b(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.f10152x3163df90.m22304x9db8ee04(this.f60634xf042a733, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119592xcc4cf6b1(arrayList));
    }

    /* renamed from: updateAppSession */
    public void m22162x6d4d96de(byte[] bArr, com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3031x969e68b2 enumC3031x969e68b2) {
        this.f10152x3163df90.m22309x9db8ee09(this.f60634xf042a733, bArr, enumC3031x969e68b2.mo11476x276ffe3f());
    }

    /* renamed from: updatePushTokenAsync */
    public void m22163xdea30fe6(byte[] bArr, com.p314xaae8f345.p342x5fa53e3.C2959x9083e9bf.UpdatePushTokenCallback updatePushTokenCallback) {
        this.f10152x3163df90.m22294x1964d19c(this.f60634xf042a733, updatePushTokenCallback, bArr);
    }

    /* renamed from: writeKvData */
    public void m22164x468d6474(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3056x8f69ff30 c3056x8f69ff30) {
        this.f10152x3163df90.m22307x9db8ee07(this.f60634xf042a733, c3056x8f69ff30.m75963xebb06ba0());
    }
}
