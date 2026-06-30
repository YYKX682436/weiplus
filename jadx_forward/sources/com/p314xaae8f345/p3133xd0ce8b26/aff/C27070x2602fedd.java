package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper */
/* loaded from: classes15.dex */
public class C27070x2602fedd extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd f58751x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd();

    /* renamed from: jniCaller */
    com.p314xaae8f345.p3133xd0ce8b26.aff.C27117x8d930abf f58752x3163df90 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27117x8d930abf();

    /* renamed from: jniEventObj */
    com.p314xaae8f345.p3133xd0ce8b26.aff.C27118x24ce4d66 f58753x82c00ec2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27118x24ce4d66();

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$C2CDownloadCallback */
    /* loaded from: classes15.dex */
    public interface C2CDownloadCallback {
        /* renamed from: complete */
        void m109157xdc453139(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27079xcdc73c56 c27079xcdc73c56);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$C2CDownloadOriginCallback */
    /* loaded from: classes15.dex */
    public interface C2CDownloadOriginCallback {
        /* renamed from: complete */
        void m109158xdc453139(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27078xc657945c c27078xc657945c);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$C2CDownloadOriginProgressCallback */
    /* loaded from: classes15.dex */
    public interface C2CDownloadOriginProgressCallback {
        /* renamed from: onProgress */
        void m109159x696ee52c(long j17, long j18, long j19);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$C2CDownloadProgressCallback */
    /* loaded from: classes15.dex */
    public interface C2CDownloadProgressCallback {
        /* renamed from: onProgress */
        void m109160x696ee52c(long j17, long j18, long j19);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$C2CUploadCallback */
    /* loaded from: classes15.dex */
    public interface C2CUploadCallback {
        /* renamed from: complete */
        void m109161xdc453139(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27088x1280f34f c27088x1280f34f);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$C2CUploadProgressCallback */
    /* loaded from: classes15.dex */
    public interface C2CUploadProgressCallback {
        /* renamed from: onProgress */
        void m109162x696ee52c(long j17, long j18, long j19);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$CheckLoginQrCodeCallback */
    /* loaded from: classes15.dex */
    public interface CheckLoginQrCodeCallback {
        /* renamed from: complete */
        void m109163xdc453139(int i17, int i18);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$EnsureAuthCallback */
    /* loaded from: classes15.dex */
    public interface EnsureAuthCallback {
        /* renamed from: complete */
        void m109164xdc453139(int i17);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$LoginCallback */
    /* loaded from: classes15.dex */
    public interface LoginCallback {
        /* renamed from: complete */
        void m109165xdc453139(int i17, long j17);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$LogoutCallback */
    /* loaded from: classes15.dex */
    public interface LogoutCallback {
        /* renamed from: complete */
        void m109166xdc453139(int i17);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$RequestLoginQrcodeCallback */
    /* loaded from: classes15.dex */
    public interface RequestLoginQrcodeCallback {
        /* renamed from: complete */
        void m109167xdc453139(int i17, java.lang.String str);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$RequireAuthCodeEvent */
    /* loaded from: classes15.dex */
    public interface RequireAuthCodeEvent {
        /* renamed from: event */
        void mo109168x5c6729a();
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$TryAutoLoginCallback */
    /* loaded from: classes15.dex */
    public interface TryAutoLoginCallback {
        /* renamed from: complete */
        void m109169xdc453139(int i17, long j17);
    }

    /* renamed from: com.tencent.wechat.aff.IlinkAuthKeeper$UploadLogCompleteEvent */
    /* loaded from: classes15.dex */
    public interface UploadLogCompleteEvent {
        /* renamed from: event */
        void m109170x5c6729a(int i17);
    }

    private C27070x2602fedd() {
        this.f60636x11bb50fe = "aff.IlinkAuthKeeper@Get";
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("iam_common", "aff_biz");
        this.f58752x3163df90.m110609x8d930ab7(this, this.f58753x82c00ec2, this.f60636x11bb50fe, this.f60638xc2e4ffd6);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd m109134xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return m109135x9cf0d20b();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd m109135x9cf0d20b() {
        return f58751x21169495;
    }

    /* renamed from: c2CDownloadAsync */
    public void m109136x152de140(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27076x67beced9 c27076x67beced9, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadProgressCallback c2CDownloadProgressCallback, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadCallback c2CDownloadCallback) {
        this.f58752x3163df90.m110604x1964d32f(this.f60634xf042a733, c2CDownloadProgressCallback, c2CDownloadCallback, j17, c27076x67beced9.m75963xebb06ba0());
    }

    /* renamed from: c2CDownloadOriginAsync */
    public void m109137x64bda6ba(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27077xc95b235f c27077xc95b235f, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadOriginProgressCallback c2CDownloadOriginProgressCallback, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CDownloadOriginCallback c2CDownloadOriginCallback) {
        this.f58752x3163df90.m110606x1964d36d(this.f60634xf042a733, c2CDownloadOriginProgressCallback, c2CDownloadOriginCallback, j17, c27077xc95b235f.m75963xebb06ba0(), i17);
    }

    /* renamed from: c2CUploadAsync */
    public void m109138x9317ca67(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.C27087xcbe77492 c27087xcbe77492, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CUploadProgressCallback c2CUploadProgressCallback, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.C2CUploadCallback c2CUploadCallback) {
        this.f58752x3163df90.m110602x1964d2f1(this.f60634xf042a733, c2CUploadProgressCallback, c2CUploadCallback, j17, c27087xcbe77492.m75963xebb06ba0());
    }

    /* renamed from: cancelC2CDownload */
    public void m109139xccb6fbc2(long j17) {
        this.f58752x3163df90.m110605x9db8ee08(this.f60634xf042a733, j17);
    }

    /* renamed from: cancelC2CDownloadOrigin */
    public void m109140x4c0e3d88(long j17) {
        this.f58752x3163df90.m110607x9db8ee0a(this.f60634xf042a733, j17);
    }

    /* renamed from: cancelC2CUpload */
    public void m109141x1fa7c7bb(long j17) {
        this.f58752x3163df90.m110603x9db8ee06(this.f60634xf042a733, j17);
    }

    /* renamed from: checkLoginQrCodeAsync */
    public void m109142xdff7bd6d(com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.CheckLoginQrCodeCallback checkLoginQrCodeCallback) {
        this.f58752x3163df90.m110597x1964d237(this.f60634xf042a733, checkLoginQrCodeCallback);
    }

    /* renamed from: ensureAuthAsync */
    public void m109143xa599e716(com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.EnsureAuthCallback ensureAuthCallback) {
        this.f58752x3163df90.m110608x1964d3ab(this.f60634xf042a733, ensureAuthCallback);
    }

    /* renamed from: genTaskId */
    public long m109144xf330b0f0() {
        return this.f58752x3163df90.m110601x9db8ee04(this.f60634xf042a733);
    }

    /* renamed from: initialize */
    public void m109145x33ebcb90(java.lang.String str, int i17, int i18) {
        this.f58752x3163df90.m110592x9db8edf9(this.f60634xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, i18);
    }

    /* renamed from: loginAsync */
    public void m109146x962e5c93(com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.LoginCallback loginCallback) {
        this.f58752x3163df90.m110598x1964d256(this.f60634xf042a733, loginCallback);
    }

    /* renamed from: logoutAsync */
    public void m109147x6573e312(com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.LogoutCallback logoutCallback) {
        this.f58752x3163df90.m110599x1964d275(this.f60634xf042a733, logoutCallback);
    }

    /* renamed from: notifyGetAuthCodeComplete */
    public void m109148x757b557b(int i17, java.lang.String str) {
        this.f58752x3163df90.m110594x9db8edfc(this.f60634xf042a733, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: requestLoginQrcodeAsync */
    public void m109149x180abd14(com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.RequestLoginQrcodeCallback requestLoginQrcodeCallback) {
        this.f58752x3163df90.m110596x1964d218(this.f60634xf042a733, requestLoginQrcodeCallback);
    }

    /* renamed from: requestUploadLog */
    public void m109150xf9b46fb4(int i17, int i18) {
        this.f58752x3163df90.m110600x9db8ee02(this.f60634xf042a733, i17, i18);
    }

    /* renamed from: subscribeRequireAuthCodeEvent */
    public void m109151x3a3a82ea(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.RequireAuthCodeEvent requireAuthCodeEvent) {
        this.f58753x82c00ec2.m110612x3a3a82ea(str, requireAuthCodeEvent);
    }

    /* renamed from: subscribeUploadLogCompleteEvent */
    public void m109152xbc126e08(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.UploadLogCompleteEvent uploadLogCompleteEvent) {
        this.f58753x82c00ec2.m110613xbc126e08(str, uploadLogCompleteEvent);
    }

    /* renamed from: tryAutoLoginAsync */
    public void m109153xec7d723d(com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.TryAutoLoginCallback tryAutoLoginCallback) {
        this.f58752x3163df90.m110595x1964d1f9(this.f60634xf042a733, tryAutoLoginCallback);
    }

    /* renamed from: unInitialize */
    public void m109154x29330b09() {
        this.f58752x3163df90.m110593x9db8edfa(this.f60634xf042a733);
    }

    /* renamed from: unsubscribeRequireAuthCodeEvent */
    public void m109155x12cfc6f1(java.lang.String str) {
        this.f58753x82c00ec2.m110614x12cfc6f1(str);
    }

    /* renamed from: unsubscribeUploadLogCompleteEvent */
    public void m109156xc466cc4f(java.lang.String str) {
        this.f58753x82c00ec2.m110615xc466cc4f(str);
    }
}
