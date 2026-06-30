package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCaptureSession {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47913a;
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    public MJCaptureSession(boolean z17, rg.c cVar, com.tencent.maas.camstudio.w0 w0Var) {
        this.f47913a = false;
        if (w0Var != null) {
            nativeOpenCamera(z17, cVar.f395149d);
            boolean nativeCanUseNativeCamera = nativeCanUseNativeCamera();
            this.f47913a = nativeCanUseNativeCamera;
            io.clipworks.corekit.NativeLogger.info("MJCaptureSession", "canUseNativeCamera: " + nativeCanUseNativeCamera);
            if (nativeCanUseNativeCamera) {
                com.tencent.maas.base.Vec2 nativeGetCaptureSize = nativeGetCaptureSize();
                int i17 = (int) nativeGetCaptureSize.f47799x;
                int i18 = (int) nativeGetCaptureSize.f47800y;
                if (i17 <= 0 || i18 <= 0) {
                    io.clipworks.corekit.NativeLogger.error("MJCaptureSession", "Invalid capture size: " + i17 + "x" + i18);
                    this.f47913a = false;
                    return;
                }
                az0.w2.f16004t = i17;
                az0.w2.f16005u = i18;
                android.graphics.SurfaceTexture surfaceTexture = az0.w2.f15996i;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(i17, i18);
                }
                io.clipworks.corekit.NativeLogger.info("MJCaptureSession", "captureWidth " + i17 + " capture height " + i18);
                boolean nativeCameraAddOutput = nativeCanUseNativeCamera & nativeCameraAddOutput(az0.w2.f16001q);
                this.f47913a = nativeCameraAddOutput;
                nativeStartRunning();
                this.f47913a = nativeCameraAddOutput & nativeCanUseNativeCamera();
            }
        }
    }

    private native com.facebook.jni.HybridData initHybrid();

    private native boolean nativeCameraAddOutput(android.view.Surface surface);

    private native boolean nativeCanUseNativeCamera();

    private native com.tencent.maas.base.Vec2 nativeGetCaptureSize();

    private native boolean nativeOpenCamera(boolean z17, int i17);

    private native void nativeStartRunning();

    public void a() {
        this.mHybridData.resetNative();
    }

    public void b() {
        nativeStartRunning();
    }
}
