package com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6;

/* renamed from: com.tencent.wechat.rtos.WeChatApi */
/* loaded from: classes13.dex */
public class C27663xee5e94d4 {

    /* renamed from: nativeHandle */
    private long f60573x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    private long f60572x429972cd = 0;

    /* renamed from: com.tencent.wechat.rtos.WeChatApi$Callback */
    /* loaded from: classes13.dex */
    public interface Callback {
        /* renamed from: onAnswerVoIPEvent */
        void mo119292x7f83bedd();

        /* renamed from: onCancelLoginEvent */
        void mo119293x2a523aca();

        /* renamed from: onCannotLoginEvent */
        void mo119294x5e098e13();

        /* renamed from: onChannelHandshakeSuccessEvent */
        void mo119295xefba322a();

        /* renamed from: onCloseChannelEvent */
        void mo119296x738c7950(long j17);

        /* renamed from: onCloudHandShakeEvent */
        void mo119297xe03e4639(int i17, java.lang.String str);

        /* renamed from: onGetExtSpamInfoEvent */
        java.lang.String mo119298x45dcc7b9(int i17);

        /* renamed from: onGetLicenseEvent */
        int mo119299x6a8a6170(java.lang.String str, java.lang.String str2);

        /* renamed from: onGetLoginAvatarEvent */
        java.lang.String mo119300x8c0e9caf();

        /* renamed from: onHangupVoIPEvent */
        void mo119301xbe4f3cee();

        /* renamed from: onIsForegroundEvent */
        boolean mo119302x9702a86e();

        /* renamed from: onIsPhysicalLinkConnectedEvent */
        boolean mo119303xd6c3972b();

        /* renamed from: onListenServiceEvent */
        void mo119304x1f1448b(java.lang.String str);

        /* renamed from: onLoginResultEvent */
        void mo119305x15f72553(int i17);

        /* renamed from: onLogoutEvent */
        void mo119306x823bdbd1();

        /* renamed from: onRequestUseCloudHandShakeEvent */
        boolean mo119307x50de9961();

        /* renamed from: onWriteChannelDataEvent */
        void mo119308xbe9354ad(long j17, byte[] bArr);

        /* renamed from: onisNetworkConnectedEvent */
        boolean mo119309x633d9316();
    }

    public C27663xee5e94d4() {
        m119248x76640cf3();
    }

    /* renamed from: jniCancelLogin */
    private native void m119246x2ead902a();

    /* renamed from: jniCloudHandShakeEnd */
    private native void m119247xd7c6af34(int i17, int i18, java.lang.String str);

    /* renamed from: jniCreateWeChatApi */
    private native void m119248x76640cf3();

    /* renamed from: jniCreateWeChatApi */
    private native void m119249x76640cf3(long j17);

    /* renamed from: jniDestroyWeChatApi */
    private native void m119250xfe9243df();

    /* renamed from: jniLogout */
    private native void m119251x41828d8f();

    /* renamed from: jniNotifyChannelData */
    private native void m119252xc458431f(long j17, byte[] bArr);

    /* renamed from: jniNotifyChannelDisconnected */
    private native void m119253x2c16bcb0(long j17);

    /* renamed from: jniNotifyForegroundChanged */
    private native void m119254xdc172643(boolean z17);

    /* renamed from: jniNotifyNetworkChanged */
    private native void m119255x7c4c6b94();

    /* renamed from: jniNotifyNewChannelConnected */
    private native void m119256xb338e0d8(long j17, int i17);

    /* renamed from: jniNotifyNewMessage */
    private native void m119257xd5c97c35(java.lang.String str);

    /* renamed from: jniNotifyPhysicalLinkStateChanged */
    private native void m119258x2a773e62(boolean z17);

    /* renamed from: jniNotifyUnbindWechat */
    private native void m119259x8692fb8a();

    /* renamed from: jniNotifyVoIPEvent */
    private native void m119260x631d212c(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18);

    /* renamed from: jniOnGetOAuthTicket */
    private native void m119261x94398f1(int i17, int i18, java.lang.String str, byte[] bArr);

    /* renamed from: jniRequireLogin */
    private native void m119262xbd55b549(java.lang.String str);

    /* renamed from: jniSetCallback */
    private native void m119263xf9b781e2(java.lang.Object obj);

    /* renamed from: jniSetFastReplies */
    private native void m119264x96b30e4f(java.lang.String[] strArr);

    /* renamed from: jniStart */
    private native void m119265x761eb7bd(byte[] bArr);

    /* renamed from: jniStop */
    private native void m119266xa8f8bd47();

    /* renamed from: jniTryAutoLogin */
    private native int m119267x3a2617c4(java.lang.String str);

    /* renamed from: jniUpdateDeviceName */
    private native void m119268x64b5556f(java.lang.String str);

    /* renamed from: jniUploadXlog */
    private native void m119269x8ab9b6f2(int i17);

    /* renamed from: cancelLogin */
    public void m119270xa144cd0f() {
        m119246x2ead902a();
    }

    /* renamed from: cloudHandShakeEnd */
    public void m119271x4f3ec59(int i17, int i18, java.lang.String str) {
        m119247xd7c6af34(i17, i18, str);
    }

    /* renamed from: logout */
    public void m119272xbe98158a() {
        m119251x41828d8f();
    }

    /* renamed from: notifyChannelData */
    public void m119273xf1858044(long j17, byte[] bArr) {
        m119252xc458431f(j17, bArr);
    }

    /* renamed from: notifyChannelDisconnected */
    public void m119274x989b04d5(long j17) {
        m119253x2c16bcb0(j17);
    }

    /* renamed from: notifyForegroundChanged */
    public void m119275x34e933a8(boolean z17) {
        m119254xdc172643(z17);
    }

    /* renamed from: notifyNetworkChanged */
    public void m119276xbfcae04f() {
        m119255x7c4c6b94();
    }

    /* renamed from: notifyNewChannelConnected */
    public void m119277x1fbd28fd(long j17, int i17) {
        m119256xb338e0d8(j17, i17);
    }

    /* renamed from: notifyNewMessage */
    public void m119278x531d8670(java.lang.String str) {
        m119257xd5c97c35(str);
    }

    /* renamed from: notifyPhysicalLinkStateChanged */
    public void m119279xc83455d(boolean z17) {
        m119258x2a773e62(z17);
    }

    /* renamed from: notifyUnbindWechat */
    public void m119280xff0d6305() {
        m119259x8692fb8a();
    }

    /* renamed from: notifyVoIPEvent */
    public void m119281xc516391(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z18) {
        m119260x631d212c(i17, z17, str, str2, str3, z18);
    }

    /* renamed from: onDestroy */
    public void m119282xac79a11b() {
        m119250xfe9243df();
        this.f60573x7b5cfd1f = 0L;
        this.f60572x429972cd = 0L;
    }

    /* renamed from: onGetOAuthTicket */
    public void m119283x8697a32c(int i17, int i18, java.lang.String str, byte[] bArr) {
        m119261x94398f1(i17, i18, str, bArr);
    }

    /* renamed from: requireLogin */
    public void m119284x9da61504(java.lang.String str) {
        m119262xbd55b549(str);
    }

    /* renamed from: setCallback */
    public void m119285x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback callback) {
        m119263xf9b781e2(callback);
    }

    /* renamed from: setFastReplies */
    public void m119286xa46a6b4a(java.lang.String[] strArr) {
        m119264x96b30e4f(strArr);
    }

    /* renamed from: start */
    public void m119287x68ac462(byte[] bArr) {
        m119265x761eb7bd(bArr);
    }

    /* renamed from: stop */
    public void m119288x360802() {
        m119266xa8f8bd47();
    }

    /* renamed from: tryAutoLogin */
    public int m119289x1a76777f(java.lang.String str) {
        return m119267x3a2617c4(str);
    }

    /* renamed from: updateDeviceName */
    public void m119290xe2095faa(java.lang.String str) {
        m119268x64b5556f(str);
    }

    /* renamed from: uploadXlog */
    public void m119291xf184c96d(int i17) {
        m119269x8ab9b6f2(i17);
    }

    public C27663xee5e94d4(long j17) {
        m119249x76640cf3(j17);
    }
}
