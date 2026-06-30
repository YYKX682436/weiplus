package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class SupportedRepeatingSurfaceSize {
    private static final android.util.Size MINI_PREVIEW_SIZE_HUAWEI_MATE_9 = new android.util.Size(com.tencent.mapsdk.internal.km.f50100e, 240);
    private static final java.util.Comparator<android.util.Size> SIZE_COMPARATOR = new androidx.camera.core.impl.utils.CompareSizesByArea();
    private final androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk mQuirk = (androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class);

    public android.util.Size[] getSupportedSizes(android.util.Size[] sizeArr) {
        if (this.mQuirk == null || !androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.isHuaweiMate9()) {
            return sizeArr;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.util.Size size : sizeArr) {
            if (SIZE_COMPARATOR.compare(size, MINI_PREVIEW_SIZE_HUAWEI_MATE_9) >= 0) {
                arrayList.add(size);
            }
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }
}
