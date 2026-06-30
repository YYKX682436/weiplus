package com.p314xaae8f345.p3109x36756d;

/* renamed from: com.tencent.trtc.TRTCCloud */
/* loaded from: classes4.dex */
public abstract class AbstractC26786xbe57dcc8 extends com.p314xaae8f345.p3109x36756d.AbstractC26785x7dd2f855 {

    /* renamed from: mTXLogListener */
    private static com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.a f56868x2edac3a7;

    /* renamed from: sInstance */
    static java.lang.ref.WeakReference<com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8> f56869xbfaed628;

    @java.lang.Deprecated
    /* renamed from: com.tencent.trtc.TRTCCloud$BGMNotify */
    /* loaded from: classes16.dex */
    public interface BGMNotify {
        /* renamed from: onBGMComplete */
        void m105557x552e4ec2(int i17);

        /* renamed from: onBGMProgress */
        void m105558x3d3ddfb6(long j17, long j18);

        /* renamed from: onBGMStart */
        void m105559x9d54bb79(int i17);
    }

    /* renamed from: com.tencent.trtc.TRTCCloud$TRTCViewMargin */
    /* loaded from: classes4.dex */
    public static class TRTCViewMargin {

        /* renamed from: bottomMargin */
        public float f56870x7b0f7fb9;

        /* renamed from: leftMargin */
        public float f56871x72f7b095;

        /* renamed from: rightMargin */
        public float f56872xdc3e2eea;

        /* renamed from: topMargin */
        public float f56873xe7501f63;

        public TRTCViewMargin(float f17, float f18, float f19, float f27) {
            this.f56871x72f7b095 = f17;
            this.f56873xe7501f63 = f19;
            this.f56872xdc3e2eea = f18;
            this.f56870x7b0f7fb9 = f27;
        }
    }

    /* renamed from: com.tencent.trtc.TRTCCloud$a */
    /* loaded from: classes4.dex */
    public static class a implements com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCLogListener f297231a = null;

        @Override // com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a
        public final void a(int i17, java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCLogListener tRTCLogListener = this.f297231a;
            if (tRTCLogListener != null) {
                tRTCLogListener.m105621x64f5ce5(str2, i17, str);
            }
        }
    }

    /* renamed from: destroySharedInstance */
    public static void m105549xbfc75eb4() {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.a();
    }

    /* renamed from: getSDKVersion */
    public static java.lang.String m105550xf491df34() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29501xdb46aa5d();
    }

    /* renamed from: setConsoleEnabled */
    public static void m105551x230a12ec(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.a(z17);
    }

    /* renamed from: setLogCompressEnabled */
    public static void m105552xa9828d9d(boolean z17) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.b(z17);
    }

    /* renamed from: setLogDirPath */
    public static void m105553x766d470(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.a(str);
    }

    /* renamed from: setLogLevel */
    public static void m105554xed871122(int i17) {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.a(i17);
    }

    /* renamed from: setLogListener */
    public static void m105555x282f0256(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCLogListener tRTCLogListener) {
        com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.a aVar = f56868x2edac3a7;
        if (aVar != null) {
            aVar.f297231a = null;
        }
        if (tRTCLogListener != null) {
            com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.a aVar2 = new com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.a();
            f56868x2edac3a7 = aVar2;
            aVar2.f297231a = tRTCLogListener;
        } else {
            f56868x2edac3a7 = null;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29550x6c4ebec7(f56868x2edac3a7);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.m29544xe88b6783(f56868x2edac3a7 != null);
    }

    /* renamed from: sharedInstance */
    public static com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 m105556x4a9701a(android.content.Context context) {
        return com.p314xaae8f345.p373xbe494963.p396x36756d.C3805xe22f0f08.a(context);
    }

    /* renamed from: ConnectOtherRoom */
    public abstract void mo30258xdb2dbe61(java.lang.String str);

    /* renamed from: DisconnectOtherRoom */
    public abstract void mo30259x8acfeaaf();

    /* renamed from: addListener */
    public abstract void mo30260x162a7075(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c);

    /* renamed from: callExperimentalAPI */
    public abstract java.lang.String mo30261xd33a8dd4(java.lang.String str);

    /* renamed from: createSubCloud */
    public abstract com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 mo30263xb97b60f1();

    /* renamed from: destroySubCloud */
    public abstract void mo30264xabf181ef(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8);

    /* renamed from: enable3DSpatialAudioEffect */
    public abstract void mo30265xc74bb7b7(boolean z17);

    /* renamed from: enableAudioVolumeEvaluation */
    public abstract void mo30269xe3d7029(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams);

    /* renamed from: enableCustomAudioCapture */
    public abstract void mo30270x9a8acb84(boolean z17);

    /* renamed from: enableCustomAudioRendering */
    public abstract void mo30271xec91d34a(boolean z17);

    /* renamed from: enableCustomVideoCapture */
    public abstract void mo30272xf0533f3f(int i17, boolean z17);

    /* renamed from: enableEncSmallVideoStream */
    public abstract int mo30274x4ff04ecb(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam);

    /* renamed from: enableMixExternalAudioFrame */
    public abstract void mo30275x9c741f1b(boolean z17, boolean z18);

    /* renamed from: enablePayloadPrivateEncryption */
    public abstract int mo30276x6274e61b(boolean z17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig);

    /* renamed from: enterRoom */
    public abstract void mo30278xccdacfd3(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams, int i17);

    /* renamed from: exitRoom */
    public abstract void mo30279x8178ef19();

    /* renamed from: generateCustomPTS */
    public abstract long mo30280xfc7087c9();

    /* renamed from: getAudioCaptureVolume */
    public abstract int mo30281xfccaefc0();

    /* renamed from: getAudioEffectManager */
    public abstract com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a mo30282x5f1b9a9c();

    /* renamed from: getAudioPlayoutVolume */
    public abstract int mo30283x51a38114();

    /* renamed from: getBeautyManager */
    public abstract com.p314xaae8f345.p373xbe494963.p389xacf8107c.InterfaceC3785x94c4af6d mo30285x2490fdb();

    /* renamed from: getCustomAudioRenderingFrame */
    public abstract void mo30286xe43b9dd0(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

    /* renamed from: getDeviceManager */
    public abstract com.p314xaae8f345.p373xbe494963.p390xb06b1e56.InterfaceC3787x3ef93853 mo30287xac7d98c1();

    /* renamed from: mixExternalAudioFrame */
    public abstract int mo30292xd8a054de(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

    /* renamed from: muteAllRemoteAudio */
    public abstract void mo30293x57697d48(boolean z17);

    /* renamed from: muteAllRemoteVideoStreams */
    public abstract void mo30294xa38a2e46(boolean z17);

    /* renamed from: muteLocalAudio */
    public abstract void mo30295x2aeada24(boolean z17);

    /* renamed from: muteLocalVideo */
    public abstract void mo30296x2c0d52c9(int i17, boolean z17);

    /* renamed from: muteRemoteAudio */
    public abstract void mo30298x7fb62b57(java.lang.String str, boolean z17);

    /* renamed from: muteRemoteVideoStream */
    public abstract void mo30299xbd6ef29c(java.lang.String str, int i17, boolean z17);

    /* renamed from: pauseScreenCapture */
    public abstract void mo30303xc4d476e4();

    /* renamed from: removeListener */
    public abstract void mo30306xf1335d58(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c abstractC26788x7049bd9c);

    /* renamed from: resumeScreenCapture */
    public abstract void mo30309x793c660d();

    /* renamed from: sendCustomAudioData */
    public abstract void mo30311x2c45ef87(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame);

    /* renamed from: sendCustomCmdMsg */
    public abstract boolean mo30312x5c3e260(int i17, byte[] bArr, boolean z17, boolean z18);

    /* renamed from: sendCustomVideoData */
    public abstract void mo30313x70818dac(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame);

    /* renamed from: sendSEIMsg */
    public abstract boolean mo30315x1a3ef952(byte[] bArr, int i17);

    /* renamed from: set3DSpatialReceivingRange */
    public abstract void mo30316x516ce3ce(java.lang.String str, int i17);

    /* renamed from: setAudioCaptureVolume */
    public abstract void mo30318x93f671cc(int i17);

    /* renamed from: setAudioFrameListener */
    public abstract void mo30320xd087f90d(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener tRTCAudioFrameListener);

    /* renamed from: setAudioPlayoutVolume */
    public abstract void mo30321xe8cf0320(int i17);

    /* renamed from: setAudioRoute */
    public abstract void mo30323x78052215(int i17);

    /* renamed from: setCapturedAudioFrameCallbackFormat */
    public abstract int mo30329xc2833433(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    /* renamed from: setDebugViewMargin */
    public abstract void mo30331x856aea4(java.lang.String str, com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8.TRTCViewMargin tRTCViewMargin);

    /* renamed from: setDefaultStreamRecvMode */
    public abstract void mo30332x553779a8(boolean z17, boolean z18);

    /* renamed from: setGravitySensorAdaptiveMode */
    public abstract void mo30341x1449a6bf(int i17);

    /* renamed from: setListenerHandler */
    public abstract void mo30344x4caea334(android.os.Handler handler);

    /* renamed from: setLocalProcessedAudioFrameCallbackFormat */
    public abstract int mo30345x87919df8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    /* renamed from: setLocalRenderParams */
    public abstract void mo30346x28b61d85(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCRenderParams tRTCRenderParams);

    /* renamed from: setLocalVideoProcessListener */
    public abstract int mo30347x2c264c11(int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoFrameListener tRTCVideoFrameListener);

    /* renamed from: setLocalVideoRenderListener */
    public abstract int mo30348xb403dedc(int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener);

    /* renamed from: setMixExternalAudioVolume */
    public abstract void mo30353xf2a4bccb(int i17, int i18);

    /* renamed from: setMixedPlayAudioFrameCallbackFormat */
    public abstract int mo30355xea2c4460(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    /* renamed from: setNetworkQosParam */
    public abstract void mo30357x62511304(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCNetworkQosParam tRTCNetworkQosParam);

    /* renamed from: setPerspectiveCorrectionPoints */
    public abstract void mo30359xd2daee7b(java.lang.String str, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2);

    /* renamed from: setRemoteAudioParallelParams */
    public abstract void mo30361xb88f8f7b(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioParallelParams tRTCAudioParallelParams);

    /* renamed from: setRemoteAudioVolume */
    public abstract void mo30362xe9a43228(java.lang.String str, int i17);

    /* renamed from: setRemoteRenderParams */
    public abstract void mo30363xa9cb1624(java.lang.String str, int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCRenderParams tRTCRenderParams);

    /* renamed from: setRemoteVideoRenderListener */
    public abstract int mo30366x3cc2c55d(java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener tRTCVideoRenderListener);

    /* renamed from: setRemoteVideoStreamType */
    public abstract int mo30367xf9be554d(java.lang.String str, int i17);

    /* renamed from: setSubStreamEncoderParam */
    public abstract void mo30371x7764c78f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam);

    /* renamed from: setVideoEncoderParam */
    public abstract void mo30374x8c1290aa(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam);

    /* renamed from: setVideoMuteImage */
    public abstract void mo30376xd60e989(android.graphics.Bitmap bitmap, int i17);

    /* renamed from: setWatermark */
    public abstract void mo30378x4f089a22(android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19);

    /* renamed from: showDebugView */
    public abstract void mo30380xcdf6351b(int i17);

    /* renamed from: snapshotVideo */
    public abstract void mo30381x46e54917(java.lang.String str, int i17, int i18, com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener);

    /* renamed from: startAudioRecording */
    public abstract int mo30383x3d492fbd(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioRecordingParams tRTCAudioRecordingParams);

    /* renamed from: startLocalAudio */
    public abstract void mo30385xbd52c52d(int i17);

    /* renamed from: startLocalPreview */
    public abstract void mo30386xc829135f(boolean z17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: startLocalRecording */
    public abstract void mo30387xcf0b23c8(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCLocalRecordingParams tRTCLocalRecordingParams);

    /* renamed from: startPublishMediaStream */
    public abstract void mo30389x2c0bb7f7(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig);

    /* renamed from: startRemoteView */
    public abstract void mo30392xaf56220d(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: startScreenCapture */
    public abstract void mo30394x51e3a7f8(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoEncParam tRTCVideoEncParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCScreenShareParams tRTCScreenShareParams);

    /* renamed from: startSpeedTest */
    public abstract int mo30396x88fa6737(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestParams tRTCSpeedTestParams);

    /* renamed from: startSystemAudioLoopback */
    public abstract void mo30398x48e939d0();

    /* renamed from: stopAllRemoteView */
    public abstract void mo30400x8d284faa();

    /* renamed from: stopAudioRecording */
    public abstract void mo30402x5a59b5d();

    /* renamed from: stopLocalAudio */
    public abstract void mo30404xc6f600cd();

    /* renamed from: stopLocalPreview */
    public abstract void mo30405xf5ebe6ff();

    /* renamed from: stopLocalRecording */
    public abstract void mo30406x97678f68();

    /* renamed from: stopPublishMediaStream */
    public abstract void mo30408x53095397(java.lang.String str);

    /* renamed from: stopRemoteView */
    public abstract void mo30412xb8f95dad(java.lang.String str, int i17);

    /* renamed from: stopScreenCapture */
    public abstract void mo30413xdc7b4858();

    /* renamed from: stopSpeedTest */
    public abstract void mo30414x26313797();

    /* renamed from: stopSystemAudioLoopback */
    public abstract void mo30415x19f1230();

    /* renamed from: switchRole */
    public abstract void mo30417xeb4bf1ca(int i17);

    /* renamed from: switchRole */
    public abstract void mo30418xeb4bf1ca(int i17, java.lang.String str);

    /* renamed from: switchRoom */
    public abstract void mo30419xeb4bf22f(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSwitchRoomConfig tRTCSwitchRoomConfig);

    /* renamed from: updateLocalView */
    public abstract void mo30420x599e7(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: updateOtherRoomForwardMode */
    public abstract void mo30421x24065b66(java.lang.String str);

    /* renamed from: updatePublishMediaStream */
    public abstract void mo30422xd419809e(java.lang.String str, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget tRTCPublishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig);

    /* renamed from: updateRemote3DSpatialPosition */
    public abstract void mo30423x3301e10d(java.lang.String str, int[] iArr);

    /* renamed from: updateRemoteView */
    public abstract void mo30424xf18e81b4(java.lang.String str, int i17, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);

    /* renamed from: updateSelf3DSpatialPosition */
    public abstract void mo30425x8b180887(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);
}
