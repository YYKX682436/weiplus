package com.tencent.live2;

/* loaded from: classes16.dex */
public abstract class V2TXLivePusher {
    public abstract int enableAudioProcessObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat);

    public abstract int enableCustomAudioCapture(boolean z17);

    public abstract int enableCustomVideoCapture(boolean z17);

    public abstract int enableCustomVideoProcess(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType);

    public abstract void enableVoiceActivityDetection(boolean z17);

    public abstract int enableVolumeEvaluation(int i17);

    public abstract com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager();

    public abstract com.tencent.liteav.beauty.TXBeautyManager getBeautyManager();

    public abstract com.tencent.liteav.device.TXDeviceManager getDeviceManager();

    public abstract int isPushing();

    public abstract int pauseAudio();

    public abstract int pauseVideo();

    public abstract void release();

    public abstract int resumeAudio();

    public abstract int resumeVideo();

    public abstract int sendCustomAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame);

    public abstract int sendCustomVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame);

    public abstract int sendSeiMessage(int i17, byte[] bArr);

    public abstract int setAudioQuality(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality);

    public abstract int setEncoderMirror(boolean z17);

    public abstract int setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig);

    public abstract void setObserver(com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver);

    public abstract int setProperty(java.lang.String str, java.lang.Object obj);

    public abstract int setRenderFillMode(com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode);

    public abstract int setRenderMirror(com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType);

    public abstract int setRenderRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation);

    public abstract int setRenderView(android.view.SurfaceView surfaceView);

    public abstract int setRenderView(android.view.TextureView textureView);

    public abstract int setRenderView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    public abstract int setVideoQuality(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam);

    public abstract int setWatermark(android.graphics.Bitmap bitmap, float f17, float f18, float f19);

    public abstract void showDebugView(boolean z17);

    public abstract int snapshot();

    public abstract int startCamera(boolean z17);

    public abstract int startLocalRecording(com.tencent.live2.V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams);

    public abstract int startMicrophone();

    public abstract int startPush(java.lang.String str);

    public abstract int startScreenCapture();

    public abstract int startSystemAudioLoopback();

    public abstract int startVirtualCamera(android.graphics.Bitmap bitmap);

    public abstract int stopCamera();

    public abstract void stopLocalRecording();

    public abstract int stopMicrophone();

    public abstract int stopPush();

    public abstract int stopScreenCapture();

    public abstract int stopSystemAudioLoopback();

    public abstract int stopVirtualCamera();
}
