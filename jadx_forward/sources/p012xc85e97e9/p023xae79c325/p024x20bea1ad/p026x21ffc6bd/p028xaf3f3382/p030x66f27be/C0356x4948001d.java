package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk */
/* loaded from: classes14.dex */
public class C0356x4948001d implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: mAeFpsRange */
    private final android.util.Range<java.lang.Integer> f696x40406a65;

    public C0356x4948001d(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f696x40406a65 = m3916x2515a71c((android.util.Range[]) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: getCorrectedFpsRange */
    private android.util.Range<java.lang.Integer> m3914x1792fac7(android.util.Range<java.lang.Integer> range) {
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

    /* renamed from: load */
    public static boolean m3915x32c4e6(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        java.lang.Integer num = (java.lang.Integer) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: pickSuitableFpsRange */
    private android.util.Range<java.lang.Integer> m3916x2515a71c(android.util.Range<java.lang.Integer>[] rangeArr) {
        android.util.Range<java.lang.Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (android.util.Range<java.lang.Integer> range2 : rangeArr) {
                android.util.Range<java.lang.Integer> m3914x1792fac7 = m3914x1792fac7(range2);
                if (m3914x1792fac7.getUpper().intValue() == 30 && (range == null || m3914x1792fac7.getLower().intValue() < range.getLower().intValue())) {
                    range = m3914x1792fac7;
                }
            }
        }
        return range;
    }

    /* renamed from: getRange */
    public android.util.Range<java.lang.Integer> m3917x7511df87() {
        return this.f696x40406a65;
    }
}
