package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes14.dex */
public class AeFpsRangeLegacyQuirk implements androidx.camera.core.impl.Quirk {
    private final android.util.Range<java.lang.Integer> mAeFpsRange;

    public AeFpsRangeLegacyQuirk(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mAeFpsRange = pickSuitableFpsRange((android.util.Range[]) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private android.util.Range<java.lang.Integer> getCorrectedFpsRange(android.util.Range<java.lang.Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new android.util.Range<>(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue));
    }

    public static boolean load(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private android.util.Range<java.lang.Integer> pickSuitableFpsRange(android.util.Range<java.lang.Integer>[] rangeArr) {
        android.util.Range<java.lang.Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (android.util.Range<java.lang.Integer> range2 : rangeArr) {
                android.util.Range<java.lang.Integer> correctedFpsRange = getCorrectedFpsRange(range2);
                if (correctedFpsRange.getUpper().intValue() == 30 && (range == null || correctedFpsRange.getLower().intValue() < range.getLower().intValue())) {
                    range = correctedFpsRange;
                }
            }
        }
        return range;
    }

    public android.util.Range<java.lang.Integer> getRange() {
        return this.mAeFpsRange;
    }
}
