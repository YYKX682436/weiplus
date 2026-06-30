package com.p314xaae8f345.p3109x36756d;

/* renamed from: com.tencent.trtc.TRTCCloudListener */
/* loaded from: classes16.dex */
public abstract class AbstractC26788x7049bd9c {

    /* renamed from: com.tencent.trtc.TRTCCloudListener$TRTCAudioFrameListener */
    /* loaded from: classes10.dex */
    public interface TRTCAudioFrameListener {
        /* renamed from: onCapturedAudioFrame */
        void mo14853xad1683f4(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

        /* renamed from: onLocalProcessedAudioFrame */
        void mo14854x307058b9(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

        /* renamed from: onMixedAllAudioFrame */
        void mo105619xdefe77bc(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

        /* renamed from: onMixedPlayAudioFrame */
        void mo105620xb29ba607(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

        /* renamed from: onRemoteUserAudioFrame */
        void mo14855xb56a47c7(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame, java.lang.String str);

        /* renamed from: onVoiceEarMonitorAudioFrame */
        void mo14856x7e98b6ae(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);
    }

    /* renamed from: com.tencent.trtc.TRTCCloudListener$TRTCLogListener */
    /* loaded from: classes4.dex */
    public static abstract class TRTCLogListener {
        /* renamed from: onLog */
        public abstract void m105621x64f5ce5(java.lang.String str, int i17, java.lang.String str2);
    }

    /* renamed from: com.tencent.trtc.TRTCCloudListener$TRTCSnapshotListener */
    /* loaded from: classes4.dex */
    public interface TRTCSnapshotListener {
        /* renamed from: onSnapshotComplete */
        void m105622x7ddd1b1c(android.graphics.Bitmap bitmap);
    }

    /* renamed from: com.tencent.trtc.TRTCCloudListener$TRTCVideoFrameListener */
    /* loaded from: classes16.dex */
    public interface TRTCVideoFrameListener {
        /* renamed from: onGLContextCreated */
        void m105623x2453e5d();

        /* renamed from: onGLContextDestory */
        void m105624x21ca5489();

        /* renamed from: onProcessVideoFrame */
        int m105625x20bf0162(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame2);
    }

    /* renamed from: com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener */
    /* loaded from: classes14.dex */
    public interface TRTCVideoRenderListener {
        /* renamed from: onRenderVideoFrame */
        void mo105626x3cf387e7(java.lang.String str, int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame);
    }

    @java.lang.Deprecated
    /* renamed from: onAudioEffectFinished */
    public void mo105565x45380e3a(int i17, int i18) {
    }

    /* renamed from: onAudioRouteChanged */
    public void mo105566xc4967f02(int i17, int i18) {
    }

    /* renamed from: onCameraDidReady */
    public void m105567xdc4e3668() {
    }

    /* renamed from: onCdnStreamStateChanged */
    public void m105568xb135e2f1(java.lang.String str, int i17, int i18, java.lang.String str2, android.os.Bundle bundle) {
    }

    /* renamed from: onConnectOtherRoom */
    public void mo105569xbf6c2e40(java.lang.String str, int i17, java.lang.String str2) {
    }

    /* renamed from: onConnectionLost */
    public void mo105570x7a7fc2e1() {
    }

    /* renamed from: onConnectionRecovery */
    public void mo105571x201d54d2() {
    }

    /* renamed from: onDisConnectOtherRoom */
    public void mo105572x5670be90(int i17, java.lang.String str) {
    }

    /* renamed from: onEnterRoom */
    public void mo105573xcb050cb4(long j17) {
    }

    /* renamed from: onError */
    public void mo105574xaf8aa769(int i17, java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: onExitRoom */
    public void mo105575x26931218(int i17) {
    }

    /* renamed from: onFirstAudioFrame */
    public void m105576x10dc7628(java.lang.String str) {
    }

    /* renamed from: onFirstVideoFrame */
    public void mo105577x54149ca3(java.lang.String str, int i17, int i18, int i19) {
    }

    /* renamed from: onLocalRecordBegin */
    public void m105578x795c626c(int i17, java.lang.String str) {
    }

    /* renamed from: onLocalRecordComplete */
    public void m105579x69614c96(int i17, java.lang.String str) {
    }

    /* renamed from: onLocalRecordFragment */
    public void m105580x2abefdad(java.lang.String str) {
    }

    /* renamed from: onLocalRecording */
    public void m105581x92f8e85(long j17, java.lang.String str) {
    }

    /* renamed from: onMicDidReady */
    public void m105582x41ab86c() {
    }

    /* renamed from: onMissCustomCmdMsg */
    public void m105583x38cb5dd3(java.lang.String str, int i17, int i18, int i19) {
    }

    /* renamed from: onNetworkQuality */
    public void mo105584xf01276b0(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality tRTCQuality, java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCQuality> arrayList) {
    }

    /* renamed from: onRecvCustomCmdMsg */
    public void mo105585xe6e383bd(java.lang.String str, int i17, int i18, byte[] bArr) {
    }

    /* renamed from: onRecvSEIMsg */
    public void mo105586x2e96246f(java.lang.String str, byte[] bArr) {
    }

    /* renamed from: onRemoteAudioStatusUpdated */
    public void m105587xcc44e818(java.lang.String str, int i17, int i18, android.os.Bundle bundle) {
    }

    /* renamed from: onRemoteUserEnterRoom */
    public void mo105588xd807c943(java.lang.String str) {
    }

    /* renamed from: onRemoteUserLeaveRoom */
    public void mo105589x6e3109a2(java.lang.String str, int i17) {
    }

    /* renamed from: onRemoteVideoStatusUpdated */
    public void m105590xbcd86393(java.lang.String str, int i17, int i18, int i19, android.os.Bundle bundle) {
    }

    /* renamed from: onScreenCapturePaused */
    public void m105591xb9f716a9() {
    }

    /* renamed from: onScreenCaptureResumed */
    public void m105592xf5706fbc() {
    }

    /* renamed from: onScreenCaptureStarted */
    public void m105593x42f07266() {
    }

    /* renamed from: onScreenCaptureStopped */
    public void m105594x43b4c3b2(int i17) {
    }

    /* renamed from: onSendFirstLocalAudioFrame */
    public void m105595x5f5428d9() {
    }

    /* renamed from: onSendFirstLocalVideoFrame */
    public void m105596xa28c4f54(int i17) {
    }

    /* renamed from: onSetMixTranscodingConfig */
    public void m105597xed58199b(int i17, java.lang.String str) {
    }

    /* renamed from: onSpeedTest */
    public void m105598x9c437a5a(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestResult tRTCSpeedTestResult, int i17, int i18) {
    }

    /* renamed from: onSpeedTestResult */
    public void mo14858xe38317(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestResult tRTCSpeedTestResult) {
    }

    /* renamed from: onStartPublishCDNStream */
    public void m105599xcf5dda1(int i17, java.lang.String str) {
    }

    /* renamed from: onStartPublishMediaStream */
    public void mo105600x7f755718(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
    }

    /* renamed from: onStartPublishing */
    public void m105601x8e9a0a96(int i17, java.lang.String str) {
    }

    /* renamed from: onStatistics */
    public void mo105602xc17a1062(com.p314xaae8f345.p3109x36756d.C26789x7211d670 c26789x7211d670) {
    }

    /* renamed from: onStopPublishCDNStream */
    public void m105603x93878a5f(int i17, java.lang.String str) {
    }

    /* renamed from: onStopPublishMediaStream */
    public void mo105604xa84ecc56(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
    }

    /* renamed from: onStopPublishing */
    public void m105605x1c239dd4(int i17, java.lang.String str) {
    }

    /* renamed from: onSwitchRole */
    public void mo105606xb2695109(int i17, java.lang.String str) {
    }

    /* renamed from: onSwitchRoom */
    public void m105607xb269516e(int i17, java.lang.String str) {
    }

    /* renamed from: onTryToReconnect */
    public void mo105608xd9f68220() {
    }

    /* renamed from: onUpdateOtherRoomForwardMode */
    public void m105609xf4535ca5(int i17, java.lang.String str) {
    }

    /* renamed from: onUpdatePublishMediaStream */
    public void mo105610xede3c59d(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
    }

    /* renamed from: onUserAudioAvailable */
    public void mo105611xf752687d(java.lang.String str, boolean z17) {
    }

    @java.lang.Deprecated
    /* renamed from: onUserEnter */
    public void m105612x10f60eae(java.lang.String str) {
    }

    @java.lang.Deprecated
    /* renamed from: onUserExit */
    public void m105613x95315e88(java.lang.String str, int i17) {
    }

    /* renamed from: onUserSubStreamAvailable */
    public void mo105614xd84b60b3(java.lang.String str, boolean z17) {
    }

    /* renamed from: onUserVideoAvailable */
    public void mo105615xfcccd978(java.lang.String str, boolean z17) {
    }

    /* renamed from: onUserVideoSizeChanged */
    public void m105616x7b85a662(java.lang.String str, int i17, int i18, int i19) {
    }

    /* renamed from: onUserVoiceVolume */
    public void mo105617x1e54d642(java.util.ArrayList<com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVolumeInfo> arrayList, int i17) {
    }

    /* renamed from: onWarning */
    public void mo105618x92abb0bd(int i17, java.lang.String str, android.os.Bundle bundle) {
    }
}
