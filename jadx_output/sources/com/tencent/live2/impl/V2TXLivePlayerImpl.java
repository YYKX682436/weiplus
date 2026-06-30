package com.tencent.live2.impl;

/* loaded from: classes16.dex */
public class V2TXLivePlayerImpl extends com.tencent.live2.V2TXLivePlayer {
    private com.tencent.live2.V2TXLivePlayer mImpl;

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public V2TXLivePlayerImpl(android.content.Context context) {
        this.mImpl = new com.tencent.liteav.live.V2TXLivePlayerJni(context, this);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveAudioFrame(boolean z17) {
        return this.mImpl.enableObserveAudioFrame(z17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableObserveVideoFrame(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        return this.mImpl.enableObserveVideoFrame(z17, v2TXLivePixelFormat, v2TXLiveBufferType);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableReceiveSeiMessage(boolean z17, int i17) {
        return this.mImpl.enableReceiveSeiMessage(z17, i17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int enableVolumeEvaluation(int i17) {
        return this.mImpl.enableVolumeEvaluation(i17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public java.util.ArrayList<com.tencent.live2.V2TXLiveDef.V2TXLiveStreamInfo> getStreamList() {
        return this.mImpl.getStreamList();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int isPlaying() {
        return this.mImpl.isPlaying();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseAudio() {
        return this.mImpl.pauseAudio();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int pauseVideo() {
        return this.mImpl.pauseVideo();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeAudio() {
        return this.mImpl.resumeAudio();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int resumeVideo() {
        return this.mImpl.resumeVideo();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setCacheParams(float f17, float f18) {
        return this.mImpl.setCacheParams(f17, f18);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void setObserver(com.tencent.live2.V2TXLivePlayerObserver v2TXLivePlayerObserver) {
        this.mImpl.setObserver(v2TXLivePlayerObserver);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setPlayoutVolume(int i17) {
        return this.mImpl.setPlayoutVolume(i17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setProperty(java.lang.String str, java.lang.Object obj) {
        return this.mImpl.setProperty(str, obj);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderFillMode(com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        return this.mImpl.setRenderFillMode(v2TXLiveFillMode);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        return this.mImpl.setRenderRotation(v2TXLiveRotation);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        return this.mImpl.setRenderView(tXCloudVideoView);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void showDebugView(boolean z17) {
        this.mImpl.showDebugView(z17);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int snapshot() {
        return this.mImpl.snapshot();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLivePlay(java.lang.String str) {
        return this.mImpl.startLivePlay(str);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int startLocalRecording(com.tencent.live2.V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        return this.mImpl.startLocalRecording(v2TXLiveLocalRecordingParams);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public void stopLocalRecording() {
        this.mImpl.stopLocalRecording();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int stopPlay() {
        return this.mImpl.stopPlay();
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int switchStream(java.lang.String str) {
        return this.mImpl.switchStream(str);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(android.view.TextureView textureView) {
        return this.mImpl.setRenderView(textureView);
    }

    @Override // com.tencent.live2.V2TXLivePlayer
    public int setRenderView(android.view.SurfaceView surfaceView) {
        return this.mImpl.setRenderView(surfaceView);
    }
}
