package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class AeFpsRange {
    private final android.util.Range<java.lang.Integer> mAeTargetFpsRange;

    public AeFpsRange(androidx.camera.core.impl.Quirks quirks) {
        androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk) quirks.get(androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.mAeTargetFpsRange = null;
        } else {
            this.mAeTargetFpsRange = aeFpsRangeLegacyQuirk.getRange();
        }
    }

    public void addAeFpsRangeOptions(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        android.util.Range<java.lang.Integer> range = this.mAeTargetFpsRange;
        if (range != null) {
            builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, androidx.camera.core.impl.Config.OptionPriority.REQUIRED);
        }
    }
}
