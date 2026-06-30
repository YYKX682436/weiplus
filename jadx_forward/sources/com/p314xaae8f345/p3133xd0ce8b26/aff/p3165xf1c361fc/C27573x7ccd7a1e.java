package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManager */
/* loaded from: classes16.dex */
public class C27573x7ccd7a1e extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: destructor */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.Destructor f60559x5751f3f9;

    /* renamed from: jniCaller */
    com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27579xbd2a4bc2 f60560x3163df90 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27579xbd2a4bc2();

    /* renamed from: jniEventObj */
    com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27580xe81f2cc3 f60561x82c00ec2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27580xe81f2cc3();

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManager$Destructor */
    /* loaded from: classes16.dex */
    public static class Destructor extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor {
        private static final java.lang.String TAG = "WebSearchPlatformManager.Destructor";

        /* renamed from: nativeHandler */
        long f60562xf042a733;

        /* renamed from: zidlIdentity */
        public java.lang.String f60563xb1c7f9d5;

        /* renamed from: zidlSvrIdentity */
        public java.lang.String f60564xc2e4ffd6;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "constructor WebSearchPlatformManager Destructor()", new java.lang.Object[0]);
        }

        @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27685x37c99383.Destructor
        /* renamed from: destruct */
        public void mo22023x3da07396() {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "destructor WebSearchPlatformManager Destructor() id:" + this.f60563xb1c7f9d5 + "svrid: " + this.f60564xc2e4ffd6, new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27579xbd2a4bc2.m117774xbd2a4bbb(this.f60562xf042a733, this.f60563xb1c7f9d5, this.f60564xc2e4ffd6);
        }
    }

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManager$GetWebViewPixelsCallback */
    /* loaded from: classes16.dex */
    public interface GetWebViewPixelsCallback {
        /* renamed from: complete */
        void m117733xdc453139(byte[] bArr);
    }

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManager$NativeEventsEvent */
    /* loaded from: classes11.dex */
    public interface NativeEventsEvent {
        /* renamed from: event */
        void m117734x5c6729a(java.lang.String str, java.lang.String str2);
    }

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchPlatformManager$NotifyFilterShowOrHideCallback */
    /* loaded from: classes16.dex */
    public interface NotifyFilterShowOrHideCallback {
        /* renamed from: complete */
        void m117735xdc453139(int i17);
    }

    public C27573x7ccd7a1e(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        this.f60636x11bb50fe = str;
        this.f60638xc2e4ffd6 = str2;
        this.f60635xfca6d453 = j17;
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("iam_feat_websearch", "aff_biz");
        this.f60560x3163df90.m117781xbd2a4bba(this, this.f60561x82c00ec2, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e m117724xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e(new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533.ObjConstructorKey(), str, str2, j17);
    }

    /* renamed from: createPlatformView */
    public void m117725x800200d4(double d17, boolean z17) {
        this.f60560x3163df90.m117775x9db8edfa(this.f60634xf042a733, d17, z17);
    }

    /* renamed from: dispose */
    public void m117726x63a5261f(int i17) {
        this.f60560x3163df90.m117780x9db8edff(this.f60634xf042a733, i17);
    }

    /* renamed from: getWebViewPixelsAsync */
    public void m117727x6fa537ec(com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.GetWebViewPixelsCallback getWebViewPixelsCallback) {
        this.f60560x3163df90.m117777x1964d1da(this.f60634xf042a733, getWebViewPixelsCallback);
    }

    /* renamed from: notifyFilterShowOrHideAsync */
    public void m117728xab4e0a19(boolean z17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.NotifyFilterShowOrHideCallback notifyFilterShowOrHideCallback) {
        this.f60560x3163df90.m117778x1964d1f9(this.f60634xf042a733, notifyFilterShowOrHideCallback, z17);
    }

    /* renamed from: notifyFocusChanged */
    public void m117729x5a8f48a5(boolean z17) {
        this.f60560x3163df90.m117776x9db8edfb(this.f60634xf042a733, z17);
    }

    /* renamed from: notifyH5BoxResult */
    public void m117730x93387072(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f60560x3163df90.m117779x9db8edfe(this.f60634xf042a733, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8), str4.getBytes(java.nio.charset.StandardCharsets.UTF_8), str5.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533
    /* renamed from: readyForLifeCycle */
    public void mo22019xc300adc4() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.Destructor destructor = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.Destructor(this, this.f60634xf042a733);
        this.f60559x5751f3f9 = destructor;
        destructor.f60562xf042a733 = this.f60634xf042a733;
        destructor.f60563xb1c7f9d5 = this.f60637xb1c7f9d5;
        destructor.f60564xc2e4ffd6 = this.f60638xc2e4ffd6;
    }

    /* renamed from: subscribeNativeEventsEvent */
    public void m117731xf649fc40(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27573x7ccd7a1e.NativeEventsEvent nativeEventsEvent) {
        this.f60561x82c00ec2.f299203a.put(str, nativeEventsEvent);
    }

    /* renamed from: unsubscribeNativeEventsEvent */
    public void m117732xa6a78d99(java.lang.String str) {
        this.f60561x82c00ec2.f299203a.remove(str);
    }

    public C27573x7ccd7a1e() {
        this.f60636x11bb50fe = "websearch.WebSearchPlatformManager@Create";
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("iam_feat_websearch", "aff_biz");
        this.f60560x3163df90.m117781xbd2a4bba(this, this.f60561x82c00ec2, this.f60636x11bb50fe, this.f60638xc2e4ffd6, null);
    }
}
