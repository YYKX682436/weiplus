package com.tencent.live2;

/* loaded from: classes16.dex */
public abstract class V2TXLivePusherObserver {
    public void onCaptureFirstAudioFrame() {
    }

    public void onCaptureFirstVideoFrame() {
    }

    public void onError(int i17, java.lang.String str, android.os.Bundle bundle) {
    }

    public void onGLContextCreated() {
    }

    public void onGLContextDestroyed() {
    }

    public void onLocalRecordBegin(int i17, java.lang.String str) {
    }

    public void onLocalRecordComplete(int i17, java.lang.String str) {
    }

    public void onLocalRecording(long j17, java.lang.String str) {
    }

    public void onMicrophoneVolumeUpdate(int i17) {
    }

    public void onProcessAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
    }

    public int onProcessVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame, com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame2) {
        return 0;
    }

    public void onPushStatusUpdate(com.tencent.live2.V2TXLiveDef.V2TXLivePushStatus v2TXLivePushStatus, java.lang.String str, android.os.Bundle bundle) {
    }

    public void onScreenCaptureStarted() {
    }

    public void onScreenCaptureStopped(int i17) {
    }

    public void onSetMixTranscodingConfig(int i17, java.lang.String str) {
    }

    public void onSnapshotComplete(android.graphics.Bitmap bitmap) {
    }

    public void onStatisticsUpdate(com.tencent.live2.V2TXLiveDef.V2TXLivePusherStatistics v2TXLivePusherStatistics) {
    }

    public void onVoiceActivityDetectionUpdate(boolean z17) {
    }

    public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
    }
}
