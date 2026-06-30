package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class TorchStateReset {
    private final boolean mIsImageCaptureTorchIsClosedQuirkEnabled;

    public TorchStateReset() {
        this.mIsImageCaptureTorchIsClosedQuirkEnabled = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public androidx.camera.core.impl.CaptureConfig createTorchResetRequest(androidx.camera.core.impl.CaptureConfig captureConfig) {
        androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
        builder.setTemplateType(captureConfig.getTemplateType());
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = captureConfig.getSurfaces().iterator();
        while (it.hasNext()) {
            builder.addSurface(it.next());
        }
        builder.addImplementationOptions(captureConfig.getImplementationOptions());
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
        builder.addImplementationOptions(builder2.build());
        return builder.build();
    }

    public boolean isTorchResetRequired(java.util.List<android.hardware.camera2.CaptureRequest> list, boolean z17) {
        if (!this.mIsImageCaptureTorchIsClosedQuirkEnabled || !z17) {
            return false;
        }
        java.util.Iterator<android.hardware.camera2.CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next().get(android.hardware.camera2.CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
