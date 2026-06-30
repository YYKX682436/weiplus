package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
interface Camera2OutputConfig {
    int getId();

    java.lang.String getPhysicalCameraId();

    int getSurfaceGroupId();

    java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> getSurfaceSharingOutputConfigs();
}
