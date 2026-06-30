package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public interface ZslControl {
    void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder);

    androidx.camera.core.ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(androidx.camera.core.ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z17);

    void setZslDisabledByUserCaseConfig(boolean z17);
}
