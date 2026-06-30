package com.tencent.live2.impl;

/* loaded from: classes16.dex */
public class V2TXLivePusherImpl extends com.tencent.live2.V2TXLivePusher {
    private static final java.lang.String TAG = "V2TXLivePusherImpl";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47190a = 0;
    private com.tencent.liteav.live.V2TXLivePusherJni mImpl;

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public V2TXLivePusherImpl(android.content.Context context, com.tencent.live2.V2TXLiveDef.V2TXLiveMode v2TXLiveMode) {
        this(context, v2TXLiveMode.ordinal());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public int enableAudioProcessObserver(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrameObserverFormat v2TXLiveAudioFrameObserverFormat) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableAudioProcessObserver(z17, v2TXLiveAudioFrameObserverFormat);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomAudioCapture(boolean z17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableCustomAudioCapture(z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomVideoCapture(boolean z17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableCustomVideoCapture(z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableCustomVideoProcess(boolean z17, com.tencent.live2.V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat, com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType) {
        return this.mImpl.enableCustomVideoProcess(z17, v2TXLivePixelFormat, v2TXLiveBufferType);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void enableVoiceActivityDetection(boolean z17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.enableVoiceActivityDetection(z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int enableVolumeEvaluation(int i17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.enableVolumeEvaluation(i17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return null;
        }
        return v2TXLivePusherJni.getAudioEffectManager();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized com.tencent.liteav.beauty.TXBeautyManager getBeautyManager() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return null;
        }
        return v2TXLivePusherJni.getBeautyManager();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized com.tencent.liteav.device.TXDeviceManager getDeviceManager() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return null;
        }
        return v2TXLivePusherJni.getDeviceManager();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int isPushing() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.isPushing();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int pauseAudio() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.pauseAudio();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int pauseVideo() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.pauseVideo();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void release() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.release();
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Release instance:" + this.mImpl.toString());
        this.mImpl = null;
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int resumeAudio() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.resumeAudio();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int resumeVideo() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.resumeVideo();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendCustomAudioFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioFrame v2TXLiveAudioFrame) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.sendCustomAudioFrame(v2TXLiveAudioFrame);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendCustomVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.sendCustomVideoFrame(v2TXLiveVideoFrame);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int sendSeiMessage(int i17, byte[] bArr) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.sendSeiMessage(i17, bArr);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setAudioQuality(com.tencent.live2.V2TXLiveDef.V2TXLiveAudioQuality v2TXLiveAudioQuality) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setAudioQuality(v2TXLiveAudioQuality);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setEncoderMirror(boolean z17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setEncoderMirror(z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setMixTranscodingConfig(com.tencent.live2.V2TXLiveDef.V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setMixTranscodingConfig(v2TXLiveTranscodingConfig);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void setObserver(com.tencent.live2.V2TXLivePusherObserver v2TXLivePusherObserver) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.setObserver(v2TXLivePusherObserver);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setProperty(java.lang.String str, java.lang.Object obj) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setProperty(str, obj);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderFillMode(com.tencent.live2.V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderFillMode(v2TXLiveFillMode);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderMirror(com.tencent.live2.V2TXLiveDef.V2TXLiveMirrorType v2TXLiveMirrorType) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderMirror(v2TXLiveMirrorType);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderRotation(com.tencent.live2.V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderRotation(v2TXLiveRotation);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderView(tXCloudVideoView);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setVideoQuality(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoEncoderParam v2TXLiveVideoEncoderParam) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setVideoQuality(v2TXLiveVideoEncoderParam);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setWatermark(android.graphics.Bitmap bitmap, float f17, float f18, float f19) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setWatermark(bitmap, f17, f18, f19);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void showDebugView(boolean z17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.showDebugView(z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int snapshot() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.snapshot();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startCamera(boolean z17) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startCamera(z17);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startLocalRecording(com.tencent.live2.V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startLocalRecording(v2TXLiveLocalRecordingParams);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startMicrophone() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startMicrophone();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startPush(java.lang.String str) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startPush(str);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startScreenCapture() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startScreenCapture();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startSystemAudioLoopback() {
        if (this.mImpl == null) {
            return -3;
        }
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "current system don't support system audio loopback");
            return -4;
        }
        return this.mImpl.startSystemAudioLoopback();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int startVirtualCamera(android.graphics.Bitmap bitmap) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.startVirtualCamera(bitmap);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopCamera() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopCamera();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized void stopLocalRecording() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return;
        }
        v2TXLivePusherJni.stopLocalRecording();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopMicrophone() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopMicrophone();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopPush() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopPush();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopScreenCapture() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopScreenCapture();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopSystemAudioLoopback() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopSystemAudioLoopback();
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int stopVirtualCamera() {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.stopVirtualCamera();
    }

    private V2TXLivePusherImpl(android.content.Context context, int i17) {
        this.mImpl = new com.tencent.liteav.live.V2TXLivePusherJni(context, i17);
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Create instance:" + this.mImpl.toString());
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(android.view.TextureView textureView) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderView(textureView);
    }

    @Override // com.tencent.live2.V2TXLivePusher
    public synchronized int setRenderView(android.view.SurfaceView surfaceView) {
        com.tencent.liteav.live.V2TXLivePusherJni v2TXLivePusherJni = this.mImpl;
        if (v2TXLivePusherJni == null) {
            return -3;
        }
        return v2TXLivePusherJni.setRenderView(surfaceView);
    }
}
