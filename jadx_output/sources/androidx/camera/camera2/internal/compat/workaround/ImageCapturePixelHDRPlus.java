package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class ImageCapturePixelHDRPlus {
    public void toggleHDRPlus(int i17, androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        if (((androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i17 == 0) {
            builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL, java.lang.Boolean.TRUE);
        } else {
            if (i17 != 1) {
                return;
            }
            builder.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_ENABLE_ZSL, java.lang.Boolean.FALSE);
        }
    }
}
