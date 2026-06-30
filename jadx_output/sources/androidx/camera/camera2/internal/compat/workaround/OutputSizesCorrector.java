package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class OutputSizesCorrector {
    private static final java.lang.String TAG = "OutputSizesCorrector";
    private final java.lang.String mCameraId;
    private final androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer mExcludedSupportedSizesContainer;
    private final androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk mExtraSupportedOutputSizeQuirk = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.class);

    public OutputSizesCorrector(java.lang.String str) {
        this.mCameraId = str;
        this.mExcludedSupportedSizesContainer = new androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer(str);
    }

    private void addExtraSupportedOutputSizesByClass(java.util.List<android.util.Size> list, java.lang.Class<?> cls) {
        androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.mExtraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        android.util.Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(cls);
        if (extraSupportedResolutions.length > 0) {
            list.addAll(java.util.Arrays.asList(extraSupportedResolutions));
        }
    }

    private void addExtraSupportedOutputSizesByFormat(java.util.List<android.util.Size> list, int i17) {
        androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.mExtraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        android.util.Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(i17);
        if (extraSupportedResolutions.length > 0) {
            list.addAll(java.util.Arrays.asList(extraSupportedResolutions));
        }
    }

    private void excludeProblematicOutputSizesByClass(java.util.List<android.util.Size> list, java.lang.Class<?> cls) {
        java.util.List<android.util.Size> list2 = this.mExcludedSupportedSizesContainer.get(cls);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    private void excludeProblematicOutputSizesByFormat(java.util.List<android.util.Size> list, int i17) {
        java.util.List<android.util.Size> list2 = this.mExcludedSupportedSizesContainer.get(i17);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    public android.util.Size[] applyQuirks(android.util.Size[] sizeArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(sizeArr));
        addExtraSupportedOutputSizesByFormat(arrayList, i17);
        excludeProblematicOutputSizesByFormat(arrayList, i17);
        if (arrayList.isEmpty()) {
            androidx.camera.core.Logger.w(TAG, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }

    public <T> android.util.Size[] applyQuirks(android.util.Size[] sizeArr, java.lang.Class<T> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(sizeArr));
        addExtraSupportedOutputSizesByClass(arrayList, cls);
        excludeProblematicOutputSizesByClass(arrayList, cls);
        if (arrayList.isEmpty()) {
            androidx.camera.core.Logger.w(TAG, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (android.util.Size[]) arrayList.toArray(new android.util.Size[0]);
    }
}
