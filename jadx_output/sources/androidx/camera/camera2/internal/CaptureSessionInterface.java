package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs();

    androidx.camera.core.impl.SessionConfig getSessionConfig();

    boolean isInOpenState();

    void issueCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list);

    wa.a open(androidx.camera.core.impl.SessionConfig sessionConfig, android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener opener);

    wa.a release(boolean z17);

    void setSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig);

    void setStreamUseCaseMap(java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> map);
}
