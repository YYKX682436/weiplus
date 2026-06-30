package androidx.camera.extensions.internal.compat.workaround;

/* loaded from: classes14.dex */
public class AvailableKeysRetriever {
    boolean mShouldInvokeOnInit;

    public AvailableKeysRetriever() {
        this.mShouldInvokeOnInit = androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.get(androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit.class) != null;
    }

    public java.util.List<android.hardware.camera2.CaptureRequest.Key> getAvailableCaptureRequestKeys(androidx.camera.extensions.impl.ImageCaptureExtenderImpl imageCaptureExtenderImpl, java.lang.String str, android.hardware.camera2.CameraCharacteristics cameraCharacteristics, android.content.Context context) {
        if (this.mShouldInvokeOnInit) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (this.mShouldInvokeOnInit) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
