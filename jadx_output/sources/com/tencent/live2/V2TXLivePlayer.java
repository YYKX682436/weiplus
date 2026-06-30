package com.tencent.live2;

/* loaded from: classes16.dex */
public abstract class V2TXLivePlayer {
    public abstract int enableObserveAudioFrame(boolean z17);

    public abstract int enableObserveVideoFrame(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType);

    public abstract int enableReceiveSeiMessage(boolean z17, int i17);

    public abstract int enableVolumeEvaluation(int i17);

    public abstract java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveStreamInfo> getStreamList();

    public abstract int isPlaying();

    public abstract int pauseAudio();

    public abstract int pauseVideo();

    public abstract int resumeAudio();

    public abstract int resumeVideo();

    public abstract int setCacheParams(float f17, float f18);

    public abstract void setObserver(com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver);

    public abstract int setPlayoutVolume(int i17);

    public abstract int setProperty(java.lang.String str, java.lang.Object obj);

    public abstract int setRenderFillMode(com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode);

    public abstract int setRenderRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation);

    public abstract int setRenderView(android.view.SurfaceView surfaceView);

    public abstract int setRenderView(android.view.TextureView textureView);

    public abstract int setRenderView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    public abstract void showDebugView(boolean z17);

    public abstract int snapshot();

    public abstract int startLivePlay(java.lang.String str);

    public abstract int startLocalRecording(com.tencent.live2.V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams);

    public abstract void stopLocalRecording();

    public abstract int stopPlay();

    public abstract int switchStream(java.lang.String str);
}
