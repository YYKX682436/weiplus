package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public interface ImageCaptureControl {
    void lockFlashMode();

    wa.a submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list);

    void unlockFlashMode();
}
