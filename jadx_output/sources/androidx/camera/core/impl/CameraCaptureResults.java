package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraCaptureResults {
    private CameraCaptureResults() {
    }

    public static androidx.camera.core.impl.CameraCaptureResult retrieveCameraCaptureResult(androidx.camera.core.ImageInfo imageInfo) {
        if (imageInfo instanceof androidx.camera.core.internal.CameraCaptureResultImageInfo) {
            return ((androidx.camera.core.internal.CameraCaptureResultImageInfo) imageInfo).getCameraCaptureResult();
        }
        return null;
    }
}
