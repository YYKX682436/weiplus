package com.tencent.liteav.videoproducer2.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes16.dex */
public class NativeCameraCaptureListener implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.tencent.liteav.videoproducer.capture.CameraEventCallback {
    private final com.tencent.liteav.base.util.CustomHandler mCallbackHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.myLooper());
    private long mNativeHandle;

    public NativeCameraCaptureListener(long j17) {
        this.mNativeHandle = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnCameraError(long j17, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFrameAvailable(long j17, android.graphics.SurfaceTexture surfaceTexture);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void runInNative(java.lang.Runnable runnable) {
        if (this.mNativeHandle != 0) {
            runnable.run();
        }
    }

    public android.os.Handler getCallbackHandler() {
        return this.mCallbackHandler;
    }

    @Override // com.tencent.liteav.videoproducer.capture.CameraEventCallback
    public void onCameraError(com.tencent.liteav.videoproducer.capture.CameraControllerInterface cameraControllerInterface, int i17) {
        this.mCallbackHandler.runOrPost(com.tencent.liteav.videoproducer2.capture.a.a(this, i17));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.mCallbackHandler.runOrPost(com.tencent.liteav.videoproducer2.capture.b.a(this, surfaceTexture));
    }

    public synchronized void resetNativeHandle() {
        this.mNativeHandle = 0L;
    }
}
