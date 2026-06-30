package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
interface Camera2SessionConfig {
    java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> getOutputConfigs();

    java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getSessionParameters();

    int getSessionTemplateId();

    default int getSessionType() {
        return 0;
    }
}
